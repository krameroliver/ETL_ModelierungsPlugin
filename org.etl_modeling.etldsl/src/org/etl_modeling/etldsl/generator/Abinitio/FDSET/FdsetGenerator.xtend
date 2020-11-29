package org.etl_modeling.etldsl.generator.Abinitio.FDSET

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.Entity
import logmodel.logpackage
import com.google.common.base.Charsets
import com.google.common.io.Files
import java.io.File
import package_enums.*

class FdsetGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		generate_fdsets(input,fsa,context)
	}
	
	
	def generate_fdsets(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context){
		var layer = ""
		var package_name = ""
		for(p: input.allContents.toIterable.filter(logpackage)){
			layer = p.LAYER.toLowerCase;
			package_name = p.name.toUpperCase
		
		if(p.LAYER_TYPE == LAYERTYPE.STAGE){
		for(entity : input.allContents.toIterable.filter(Entity)){
			
			var file = "fdsets/"+layer+"/"+package_name+"/"+entity.name.toLowerCase+".fdset"
			var content = ""
			
			//try{
				var text = fsa.readTextFile("../src/templates/template.fdset").toString
				//var text = Files.toString(new File("template.fdset"), Charsets.UTF_8);
				text = text.replace("dml_replace",entity.name.toLowerCase+".dml")
				text = text.replace("filename_replace",entity.filename)
				text = text.replace("delimiter_replace",entity.delimiter)
				text = text.replace("line_end_replace",entity.lineend)
				
				content = text
				fsa.generateFile(file,content);
			//}catch(Exception e){
				
			//}
				
			}
		}
		
		}
	}
}