package org.etl_modeling.etldsl.generator.Abinitio.PSET

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.etl_modeling.etldsl.generator.Abinitio.PSET.PsetHelper
import logmodel.Entity
import com.google.inject.Inject
import org.etl_modeling.etldsl.utils.Utils

class GeneratorEntityPSET extends AbstractGenerator {
	
	@Inject PsetHelper ph
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(entity : input.allContents.toIterable.filter(Entity)){
			fsa.generateFile("/pset/test/test.pset",entity.EntityPset)
		}
	}
	
	
	def EntityPset(Entity entity)
	'''
	$[[
	record
	readEntityConfig «ph.GenReadentityInputPset(entity)»
	writeEntityConfigs [vector
	«ph.BasicEntityPsets(entity)»
	
	
	«FOR inc : entity.include»
	«ph.IncludeEntityPsets(inc,entity)»
	«ENDFOR»
	
	
	«FOR rel : entity.relationships»
	«ph.LinkEntityPsets(rel,entity)»
	«ENDFOR»
	
	]	
	]]
	
	
	
	
	
	
	
	
	
	'''
	
	
	
}