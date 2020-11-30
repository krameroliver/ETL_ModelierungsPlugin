package org.etl_modeling.etldsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import logmodel.logpackage;
import logmodel.Entity;
import techmodel.Table
import techmodel.TableType
import org.etl_modeling.etldsl.utils.Utils

class TechModel extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(p: input.allContents.toIterable.filter(logpackage)){
			for(e: input.allContents.toIterable.filter(Entity)){

				var file = "../tdm/"+p.name.toLowerCase+"/"+e.name.toLowerCase+".tdm"
				fsa.generateFile(file,GenTechModelFiles(p,e))
			}
		}
	}
	
	
	
	def GenTechModelFiles(logpackage p, Entity entity)
	'''
	TechPackage «p.LAYER_TYPE»
	
	Table «entity.name.toUpperCase»(«TableType.SAT»)
	(
	«FOR field : entity.entityField»
	«field.name.toUpperCase»,
	«ENDFOR»
	«entity.name.toLowerCase»_hk
	)
	
	
	TABLE «entity.name.toUpperCase»(«TableType.HUB»)
	(
	«entity.name.toLowerCase»_hk
	
	)
	'''
	
	
}