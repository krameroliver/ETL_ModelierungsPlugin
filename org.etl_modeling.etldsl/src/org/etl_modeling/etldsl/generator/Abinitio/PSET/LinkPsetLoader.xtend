package org.etl_modeling.etldsl.generator.Abinitio.PSET

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.Relationship
import logmodel.Entity
import java.util.ArrayList
import logmodel.logpackage
import org.etl_modeling.etldsl.utils.TableUtils

class LinkPsetLoader extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(p : input.allContents.toIterable.filter(logpackage)){
		var layer = p.LAYER.toLowerCase
		for(entity : input.allContents.toIterable.filter(Entity)){
			for(rel : entity.relationships){
				var rel_file = "pset/WriteEntity/Relationship/"+TableUtils.getRelationLinkName(entity,rel)+".txt"
				fsa.generateFile(rel_file,LinkEntityPsets(rel,entity,layer))
				
			}
		}
	}
	
	}
	
	
	def IdentifyingFields(Relationship rel){
		var al = new ArrayList<String> ;
		for(field : rel.identifiyingFieldsRel){
			al.add("'"+field.name.toLowerCase+"'")
		}
		return al.join(',')
	}
	
	
	def LinkEntityPsets(Relationship relationship,Entity entity,String layer)
	'''
	[record
	layer "«layer»"
	entity_name "«relationship.name.toLowerCase»"
	hub_name    "«TableUtils.getRelationLinkName(entity,relationship)»"
	sat_name    "«TableUtils.getRelationSatName(entity,relationship)»"
	tech_keys   [vector "«relationship.name.toLowerCase»_hk"]
	business_keys [vector «IdentifyingFields(relationship)» ]
	]
	'''
	
}