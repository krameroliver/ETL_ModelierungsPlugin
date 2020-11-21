package org.etl_modeling.etldsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import logmodel.logpackage;
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.ArrayList

class CreateSchema extends AbstractGenerator {
	ArrayList<String> layer = new ArrayList<String>();
	

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var file = "sql/CreateSchema/Schema.sql"
		for(p: input.allContents.toIterable.filter(logpackage)){
			if(!layer.contains(p.LAYER.toString)){
				layer.add(p.LAYER.toString)
			}
		}
		fsa.generateFile(file,CreateSchema(layer)) 
	}
	
	
	
	
	def CreateSchema(ArrayList<String> layer)
	'''
	«FOR s : layer»
	CREATE SCHEMA IF NOT EXISTS «s»;
	«ENDFOR»
	'''
	
}