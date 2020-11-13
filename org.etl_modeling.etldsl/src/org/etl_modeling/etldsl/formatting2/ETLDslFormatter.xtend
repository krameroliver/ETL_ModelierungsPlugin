/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.etldsl.formatting2

import com.google.inject.Inject
import logmodel.CommonMapping
import logmodel.logpackage
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.etl_modeling.etldsl.services.ETLDslGrammarAccess

class ETLDslFormatter extends AbstractFormatter2 {
	
	@Inject extension ETLDslGrammarAccess

	def dispatch void format(logpackage logpackage, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (entity : logpackage.entity) {
			entity.format
		}
		for (commonMapping : logpackage.commonmapping) {
			commonMapping.format
		}
	}

	def dispatch void format(CommonMapping commonMapping, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (field : commonMapping.commonmappinginputfields) {
			field.format
		}
		for (field : commonMapping.commonmappingoutputfields) {
			field.format
		}
	}
	
	// TODO: implement for Entity, Include
}
