package org.etl_modeling.etldsl.generator.Abinitio.DML.CSV_INPUT

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.Entity
import org.etl_modeling.etldsl.utils.Utils
import logmodel.logpackage

class DML_CSV_Input extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	var rep = 0
	var hist = 0
	var l_type = 0
	var layer = ""
	var package_name = 0
	for(p: input.allContents.toIterable.filter(logpackage)){
			hist = p.HISTORISATION.value;
			layer = p.LAYER.toString;
			rep = p.REPRESENTATION.value;	
			l_type = p.LAYER_TYPE.value;	
			for(entity : input.allContents.toIterable.filter(Entity)){
				
				if(p.LAYER_TYPE.value == 0){
					val path = "dml/input/"+entity.name.toLowerCase+".dml"
					fsa.generateFile(path,genCSVdml(entity))
				}		
			}
		}
		
	}
	

	
	
	def genCSVdml(Entity entity)
	'''
	record
	«FOR f : entity.entityField»
	«f.name.toLowerCase» «Utils.getDMLDataTypeString(f)»;
	«ENDFOR»
	end
	'''
	
}