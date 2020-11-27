package org.etl_modeling.etldsl.generator.Abinitio.PSET

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.Entity
import java.util.ArrayList
import logmodel.Include
import logmodel.Relationship
import org.etl_modeling.etldsl.utils.TableUtils


class GeneratorWriteEntityPset extends AbstractGenerator {
	var entity_file = ""
	var include_file = ""
	var link_file = ""
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(entity : input.allContents.toIterable.filter(Entity)){
			entity_file = "pset/WriteEntity/Entity/"+entity.name.toLowerCase+".pset"
			fsa.generateFile(entity_file,entity.BasicEntityPsets)
			for(include : entity.include){
				include_file = "pset/WriteEntity/Include/"+TableUtils.getIncludeName(entity,include)+".pset"
				fsa.generateFile(include_file,IncludeEntityPsets(include,entity))
				
			}
			for(rel : entity.relationships){
				link_file = "pset/WriteEntity/Link/"TableUtils.getRelationSatName(entity,rel)+".pset"
				fsa.generateFile(link_file,LinkEntityPsets(rel,entity))
				
			}
		}
	}
	
	
	
	def BuildBusinessKeys(Entity entity){
		var bk_fields = new ArrayList<String>
		for(field : entity.entityField){
			if(field.isIsBusinessKey){
				bk_fields.add('"'+field.name.toLowerCase+'"')
			}
		}
		return bk_fields.join(",")
	}
	
	def BuildIdentifyingKeys(Relationship rel){
		var bk_fields = new ArrayList<String>
		for(field : rel.identifiyingFieldsRel){
			bk_fields.add('"'+field.name.toLowerCase+'"')
		}
		return bk_fields.join(",")
	}
	
	def BasicEntityPsets(Entity entity)
	'''
	$[[record
	entity_name "«entity.name.toLowerCase»"
	hub_name    "«TableUtils.getHubName(entity)»"
	sat_name    "«TableUtils.getMainSatName(entity)»"
	tech_keys   [vector "«entity.name.toLowerCase»_hk"]
	business_keys [vector «entity.BuildBusinessKeys»]
	]]
	'''
	
	def IncludeEntityPsets(Include include,Entity entity)
	'''
	$[[record
	entity_name "«include.name.toLowerCase»_«»"
	hub_name    "«TableUtils.getHubName(entity)»"
	sat_name    "«TableUtils.getIncludeName(entity,include)»"
	tech_keys   [vector "«entity.name.toLowerCase»_hk"]
	business_keys [vector «entity.BuildBusinessKeys»]
	]]
	'''
	
	def LinkEntityPsets(Relationship relationship,Entity entity)
	'''
	$[[record
	entity_name "«relationship.name.toLowerCase»"
	hub_name    "«TableUtils.getRelationLinkName(entity,relationship)»"
	sat_name    "«TableUtils.getRelationSatName(entity,relationship)»"
	tech_keys   [vector "«relationship.name.toLowerCase»_hk"]
	business_keys [vector «relationship.BuildIdentifyingKeys»]
	]]
	'''
}

/*
 * 
 * 
 * [record
  entity_name   "acct"
  hub_name      "h_acct"
  sat_name      "s_acct"
  tech_keys     [vector
                  "acct_hk"]
  business_keys [vector
                  "account_id",
                  "district_id"]]
 
 
 
 */