/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.specdsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.etl_modeling.specdsl.services.SpecDslGrammarAccess
import specmodel.SpecPackage
import specmodel.Specification

class SpecDslFormatter extends AbstractFormatter2 {
	
	@Inject extension SpecDslGrammarAccess

	def dispatch void format(SpecPackage specPackage, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (specification : specPackage.specifications) {
			specification.format
		}
	}

	def dispatch void format(Specification specification, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (businessRule : specification.businessrules) {
			businessRule.format
		}
	}
	
	// TODO: implement for 
}
