/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.jobdsl.formatting2

import com.google.inject.Inject
import jobnetz.Job
import jobnetz.SchedulePackage
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.etl_modeling.jobdsl.services.JobDslGrammarAccess

class JobDslFormatter extends AbstractFormatter2 {
	
	@Inject extension JobDslGrammarAccess

	def dispatch void format(SchedulePackage schedulePackage, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		schedulePackage.processingpoint.format
	}

	def dispatch void format(Job job, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (_job : job.preDecessor) {
			_job.format
		}
	}
	
	// TODO: implement for ProcessingPoint
}
