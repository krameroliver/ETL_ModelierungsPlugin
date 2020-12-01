package org.etl_modeling.etldsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.Entity

class ExtensionGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(entity : input.allContents.toIterable.filter(Entity)){
				val path = "sql/CreateExtensions/extensions.sql"
				fsa.generateFile(path,entity.compile) 
				
			
		}
	}
	
	def compile(Entity entity){ 
		CreateExtension
	}
	
	def CreateExtension()
	'''
	CREATE EXTENSION IF NOT EXISTS temporal_tables;
	'''
}