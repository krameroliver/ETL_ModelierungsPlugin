package org.etl_modeling.etldsl.generator.Abinitio.DML.CSV_INPUT

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.Entity
import org.etl_modeling.etldsl.utils.Utils
import logmodel.logpackage

class TableDmls extends AbstractGenerator {
	
	var rep = 0
	var hist = 0
	var l_type = 0
	var layer = ""
	var package_name = 0
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(p: input.allContents.toIterable.filter(logpackage)){
			hist = p.HISTORISATION.value;
			layer = p.LAYER.toString;
			rep = p.REPRESENTATION.value;	
			l_type = p.LAYER_TYPE.value;
			for(entity : input.allContents.toIterable.filter(Entity)){
				var SAT_DML_PATH = "dml/SAT/s_"+entity.name.toLowerCase+".dml"
				var HUB_DML_PATH = "dml/HUB/h_"+entity.name.toLowerCase+".dml"
				var ENTITY_DML_PATH = "dml/Entity/entity_"+entity.name.toLowerCase+".dml"
				var loader_input_path = "dml/LoaderInput/entity_"+entity.name.toLowerCase+".dml"
				var re_output_path = "dml/ReadEntityOutput/entity_"+entity.name.toLowerCase+".dml"
				
				fsa.generateFile(SAT_DML_PATH,genTableSatDml(entity))
				fsa.generateFile(HUB_DML_PATH,genTableHubDml(entity))
				fsa.generateFile(ENTITY_DML_PATH,genEntityDml(entity))
				fsa.generateFile(loader_input_path,genLoaderInputDML(entity))
				fsa.generateFile(re_output_path,genReadEntityOutputDML(entity))
				
			}
			
			}
	}
	
	
	def genReadEntityOutputDML(Entity entity){
		var number_includes = entity.include.length
		var context = ""
		context  = context + 'record\n'
		context = context +'string("x01") ' +entity.name.toLowerCase+"_hk;\n";
			context  = context + '\trecord\n'
			for(f : entity.entityField){
				context = context +"\t" +Utils.getDMLDataTypeString(f) + " "+f.name.toLowerCase+";\n";
			}
			context = context + "end s_"+ entity.name.toLowerCase+";\n"
			if(number_includes > 0){
				
				for(include : entity.include){
					context = context + "record\n"
					for(inf : include.includeFields){
						context = context +"\t" +Utils.getDMLDataTypeString(inf) + " "+inf.name.toLowerCase+";\n";
					}
					context = context + "end s_"+entity.name.toLowerCase+"_"+ include.name.toLowerCase+";\n"
				}
				
			}
			
		context = context + "end"
		return context
	}
	
	

	def genLoaderInputDML(Entity entity)
	'''
	record
	«FOR field : entity.entityField»
	«Utils.getDMLDataTypeString(field)» «field.name.toLowerCase»;
	«ENDFOR»
	end
	'''
	
	
	def genTableSatDml(Entity entity)
	'''
	record
	«FOR field : entity.entityField»
	«Utils.getDMLDataTypeString(field)» «field.name.toLowerCase»;
	«ENDFOR»
	date("YYYY-MM-DD") creation_date;
	date("YYYY-MM-DD") modification_date;
	string("\x01") record_source;
	string("\x01") «entity.name.toLowerCase»_hk;
	string("\x01") effectiv_timerange;
	end
	'''
	
	def genTableHubDml(Entity entity)
	'''
	record
	«FOR field : entity.entityField»
	«IF field.isIsBusinessKey»
		«Utils.getDMLDataTypeString(field)» «field.name.toLowerCase»;
	«ENDIF»
	«ENDFOR»
	string("\x01") «entity.name.toLowerCase»_hk;
	end 
	'''
	
	def genEntityDml(Entity entity)
	'''
	record
	«entity.genTableSatDml»
	«entity.genTableHubDml»
	end
	'''
}