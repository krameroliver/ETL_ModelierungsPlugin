package org.etl_modeling.specdsl.generator.SQL

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import specmodel.BusinessRule
import specmodel.Specification
import specmodel.Source
import logmodel.Entity

class TestSQL extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for(br : input.allContents.toIterable.filter(BusinessRule)){
			var test_sql = "sql/TestSQL/"+br.name+".sql"
			fsa.generateFile(test_sql,br.GenerateTestSQL)
		}
		
		
	}
	
	
	def entityJoin(Entity entity)
	''' 	
	(
	    Select sqt.* FROM s_«entity.name.toLowerCase» as sat
	    inner join h_«entity.name.toLowerCase» as hub
	    on sat.«entity.name.toLowerCase»_hk = hub.«entity.name.toLowerCase»_hk) as «entity.name.toLowerCase»
	'''
	
	
	def GenerateTestSQL(BusinessRule br){
		var p_s =br.sources.last
		var context = ""
		
		context = context +"SELECT * FROM \n"
		context = context + entityJoin(p_s.sourceEntity) 
		for(source : p_s.childSources){
			context = context + source.joinType.literal + "JOIN " entityJoin(source.childSources.last.sourceEntity)
		}
		context = context + "\n;"
		return context		
		
	}
}