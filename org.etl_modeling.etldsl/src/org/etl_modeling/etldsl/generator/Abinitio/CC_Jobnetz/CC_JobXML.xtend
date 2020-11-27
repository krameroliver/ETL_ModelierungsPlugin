package org.etl_modeling.etldsl.generator.Abinitio.CC_Jobnetz

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import jobnetz.Job
import jobnetz.SchedulePackage

class CC_JobXML extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(job : input.allContents.toIterable.filter(Job)){
			generateJobXMLs(job,fsa);
		}
	}
	
	
	def generateJobXMLs(Job job,IFileSystemAccess2 fsa){
		var job_template = fsa.readTextFile("../src/templates/template.jobdef.xml").toString
		var jobname = job.name.toUpperCase
		var job_executable =job.executableName.toLowerCase
		var job_system = job.TECH_SYSTEM.toUpperCase
		
		
		var job_dependencys = job.preDecessor
		
		var predecs = ""
		for(pd : job_dependencys){
			predecs = predecs + '<predecessor jobDefinitionGuid="jobguid'+pd.name+'"/>\n'
		}
		var job_out = job_template.replace("<executable>",job_executable).replace("techsystem",job_system).replace("<jobname>",jobname).replace("--dependencys",predecs)
		
		var out_file = "jobdef/"+jobname+".jobdef"
		fsa.generateFile(out_file,job_out)
		
	}
}