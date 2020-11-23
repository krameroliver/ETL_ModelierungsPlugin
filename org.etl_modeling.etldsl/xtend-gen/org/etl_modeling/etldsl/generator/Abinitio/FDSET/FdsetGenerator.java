package org.etl_modeling.etldsl.generator.Abinitio.FDSET;

import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import com.google.common.io.Files;
import java.io.File;
import logmodel.Entity;
import logmodel.logpackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class FdsetGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.generate_fdsets(input, fsa, context);
  }
  
  public void generate_fdsets(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      String layer = "";
      String package_name = "";
      Iterable<logpackage> _filter = Iterables.<logpackage>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), logpackage.class);
      for (final logpackage p : _filter) {
        {
          layer = p.getLAYER().toLowerCase();
          package_name = p.getName().toUpperCase();
        }
      }
      Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
      for (final Entity entity : _filter_1) {
        {
          String _lowerCase = entity.getName().toLowerCase();
          String _plus = ((((("fdsets/" + layer) + "/") + package_name) + "/") + _lowerCase);
          String file = (_plus + ".fdset");
          String content = "";
          File _file = new File("template.fdset");
          String text = Files.toString(_file, Charsets.UTF_8);
          String _lowerCase_1 = entity.getName().toLowerCase();
          String _plus_1 = (_lowerCase_1 + ".dml");
          text = text.replace("<dml>", _plus_1);
          text = text.replace("<filename>", entity.getFilename());
          text = text.replace("<delimiter>", entity.getDelimiter());
          text = text.replace("<line_end>", entity.getLineend());
          content = text;
          fsa.generateFile(file, content);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
