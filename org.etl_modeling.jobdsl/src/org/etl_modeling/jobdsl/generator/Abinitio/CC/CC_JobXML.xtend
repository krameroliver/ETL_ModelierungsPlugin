package org.etl_modeling.jobdsl.generator.Abinitio.CC

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
		var job_template = fsa.readTextFile("../src/templates/template_jobdef.xml").toString
		var jobname = job.name.toUpperCase
		var job_executable =job.executableName.toLowerCase
		var job_system = job.TECH_SYSTEM.toUpperCase
		var job_out = ""
		
		var job_dependencys = job.preDecessor
		if(job_dependencys.length > 0){
			var predecs = "<predecessors>\n"
			for(pd : job_dependencys){
				predecs = predecs + '<predecessor jobDefinitionGuid="jobguid'+pd.name+'"/>\n'
			}
			predecs = predecs + "</predecessors>\n"
			job_out = job_template.replace("<executable>",job_executable).replace("<techsystem>",job_system).replace("<jobname>",jobname).replace("--dependencys",predecs)
		}else{
			job_out = job_template.replace("<executable>",job_executable).replace("<techsystem>",job_system).replace("<jobname>",jobname).replace("--dependencys","")
		}
		
		
		var out_file = "jobdef/"+jobname+".jobdef"
		fsa.generateFile(out_file,job_out)
	}
}