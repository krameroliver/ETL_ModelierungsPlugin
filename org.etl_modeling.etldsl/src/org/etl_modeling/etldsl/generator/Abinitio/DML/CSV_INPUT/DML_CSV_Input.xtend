package org.etl_modeling.etldsl.generator.Abinitio.DML.CSV_INPUT

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.Entity
import org.etl_modeling.etldsl.utils.Utils
import logmodel.logpackage
import logmodel.CommonMapping

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
			for(cm : input.allContents.toIterable.filter(CommonMapping)){
				val input_dml_path = "dml/commonmapping/input/"cm.name.toLowerCase+".dml"
				val output_dml_path = "dml/commonmapping/output/"cm.name.toLowerCase+".dml"
				fsa.generateFile(input_dml_path,genCommonMappingImportDML(cm))
				fsa.generateFile(output_dml_path,genCommonMappingOutputDML(cm))
			}
				
			for(entity : input.allContents.toIterable.filter(Entity)){
				
				if(p.LAYER_TYPE.value == 0){
					val path = "dml/input/file/"+entity.name.toLowerCase+".dml"
					val path_table_input = "dml/input/loader_Input/"+layer+"/"+entity.name.toLowerCase+".dml"
					val path_table_tec = "dml/input/loader_Tec/"+layer+"/"+entity.name.toLowerCase+".dml"
					fsa.generateFile(path,genCSVdml(entity))
					fsa.generateFile(path_table_input,genLoaderdml(entity))
					fsa.generateFile(path_table_tec,genLoaderdml(entity))
					copyfile(fsa)
				}		
			}
		}
		
	}
	
	def copyfile(IFileSystemAccess2 fsa){
		fsa.generateFile("test_copy.xml",fsa.readTextFile("../src/test.xml"))
	}

	
	def genCommonMappingImportDML(CommonMapping cm)
	'''
	«IF cm.commonmappinginputfields.length > 0»
	record
	   record
	   
	   «FOR f : cm.commonmappinginputfields»
	   «f.name.toLowerCase» «Utils.getDMLDataTypeString(f)»;
	   «ENDFOR»
	   
	   end «cm.name.toLowerCase»
	end
	«ENDIF»
	'''
	
	def genCommonMappingOutputDML(CommonMapping cm)
	'''
	«IF cm.commonmappingoutputfields.length > 0»
	record
	   record
	   
	   «FOR f : cm.commonmappingoutputfields»
	   «f.name.toLowerCase» «Utils.getDMLDataTypeString(f)»;
	   «ENDFOR»
	   
	   end «cm.name.toLowerCase»
	end
	«ENDIF»
	'''
	
	def genCSVdml(Entity entity)
	'''
	record
	«FOR f : entity.entityField»
	«IF !f.tableOnly»
	«f.name.toLowerCase» «Utils.getDMLDataTypeString(f)»;
	«ENDIF»
	«ENDFOR»
	end
	'''
	
	def genLoaderTecdml(Entity entity)
	'''
	record
	    record
	«FOR f : entity.entityField»
		«IF !f.interfaceOnly»
		«f.name.toLowerCase» «Utils.getDMLDataTypeString(f)»;
		«ENDIF»
	«ENDFOR»
	creation_date DATE;
	modification_date DATE;
	processing_point string("\x01");
	record_source string("\x01");
	record_hk string("\x01");
	«entity.name.toLowerCase»_hk string("\x01");
	effectiv_timerange string("\x01");
	end «entity.name.toLowerCase»
	end
	'''

	
	def genLoaderdml(Entity entity)
	'''
	record
	record
	«FOR f : entity.entityField»
	«IF !f.interfaceOnly»
	«f.name.toLowerCase» «Utils.getDMLDataTypeString(f)»;
	«ENDIF»
	«ENDFOR»
	end s_«entity.name.toLowerCase»
	
	record
	record_source string("\x01");
	record_hk string("\x01");
	«entity.name.toLowerCase»_hk string("\x01");
	end h_«entity.name.toLowerCase»
	end
	'''
	

	
}