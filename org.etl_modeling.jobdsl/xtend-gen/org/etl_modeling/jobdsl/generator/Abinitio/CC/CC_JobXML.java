package org.etl_modeling.jobdsl.generator.Abinitio.CC;

import com.google.common.collect.Iterables;
import jobnetz.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CC_JobXML extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Job> _filter = Iterables.<Job>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Job.class);
    for (final Job job : _filter) {
      this.generateJobXMLs(job, fsa);
    }
  }
  
  public void generateJobXMLs(final Job job, final IFileSystemAccess2 fsa) {
    String job_template = fsa.readTextFile("../src/templates/template_jobdef.xml").toString();
    String jobname = job.getName().toUpperCase();
    String job_executable = job.getExecutableName().toLowerCase();
    String job_system = job.getTECH_SYSTEM().toUpperCase();
    String job_out = "";
    EList<Job> job_dependencys = job.getPreDecessor();
    final EList<Job> _converted_job_dependencys = (EList<Job>)job_dependencys;
    int _length = ((Object[])Conversions.unwrapArray(_converted_job_dependencys, Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      String predecs = "<predecessors>\n";
      for (final Job pd : job_dependencys) {
        String _name = pd.getName();
        String _plus = ((predecs + "<predecessor jobDefinitionGuid=\"jobguid") + _name);
        String _plus_1 = (_plus + "\"/>\n");
        predecs = _plus_1;
      }
      predecs = (predecs + "</predecessors>\n");
      job_out = job_template.replace("<executable>", job_executable).replace("<techsystem>", job_system).replace("<jobname>", jobname).replace("--dependencys", predecs);
    } else {
      job_out = job_template.replace("<executable>", job_executable).replace("<techsystem>", job_system).replace("<jobname>", jobname).replace("--dependencys", "");
    }
    String out_file = (("jobdef/" + jobname) + ".jobdef");
    fsa.generateFile(out_file, job_out);
  }
}
