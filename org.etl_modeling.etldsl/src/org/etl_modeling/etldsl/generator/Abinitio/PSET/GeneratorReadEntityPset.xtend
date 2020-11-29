package org.etl_modeling.etldsl.generator.Abinitio.PSET

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.etl_modeling.etldsl.utils.TableUtils
import logmodel.Entity
import logmodel.logpackage
import java.util.ArrayList

class GeneratorReadEntityPset extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var file = "pset/readEntity/"
		
		
			var p =  logpackage
			for (entity : input.allContents.toIterable.filter(Entity)){
				file = "pset/readEntity/" + entity.name.toLowerCase+".pset"
				fsa.generateFile(file,compile(entity))
			}
	}

	def compile(Entity entity){
		var pset = GenReadentityInputPset(entity);
		pset = pset.toString().replace("],]","]]")
		return pset
	}

	def Tablerecord(String name,String origin_field, String partner_field)
	'''
	[record
	partner_table "�name�"
	join_condition     "INNER JOIN"
	related_fields_vec [vector
	                          [record
	                           origin_field  "�origin_field�"
	                           partner_field "�partner_field�"
	]]]
	'''
	def TableRecordJoind(Entity entity){
		var al = new ArrayList<String> ;
		al.add(Tablerecord( TableUtils.getMainSatName(entity),entity.name.toLowerCase+"_hk",entity.name.toLowerCase+"_hk").toString)
		for(include : entity.include){
			al.add(Tablerecord(TableUtils.getIncludeName(entity,include),entity.name.toLowerCase+"_hk",entity.name.toLowerCase+"_hk").toString())
		}
		return al.join(",")
		
	}
	
	
	def partner_table_descriptions(String entity_name,String table_name)
	'''
	[record
	table_name "�table_name�"
	historization_type "full"
	tkey_fields [vector "�entity_name�_hk"]
	bkey_fields	NULL
	table_relations    [vector]]
	'''

	def partner_tableRecordJoind(Entity entity){
		var al = new ArrayList<String> ;
		al.add(partner_table_descriptions(entity.name.toLowerCase,TableUtils.getMainSatName(entity)).toString)
		for(include : entity.include){
			al.add(partner_table_descriptions(entity.name.toLowerCase,TableUtils.getIncludeName(entity,include)).toString())
				
			}			
		
		return al.join(",")
		
	}


	def GenReadentityInputPset(Entity entity)
	'''
	$[[record
	entity_name "�entity.name.toLowerCase�"
	entity_type ""
	layer_type "BITEMPORAL"
	entity_desc [record
	main_table_description  [record
	table_name         "�TableUtils.getHubName(entity)�"
	historization_type "BITEMPORAL"
	tkey_fields        [vector "�entity.name.toLowerCase�_hk"]
	bkey_fields        [vector �FOR bkf : entity.entityField��IF bkf.isIsBusinessKey�"�bkf.name�",�ENDIF��ENDFOR�]
	table_relations    [vector
	�entity.TableRecordJoind�
	]]
	partner_table_descriptions [vector
	�entity.partner_tableRecordJoind�
	]]]]
	
	'''
	
}
 