package org.etl_modeling.etldsl.generator;

import com.google.common.collect.Iterables;
import logmodel.Entity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ExtensionGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        final String path = "sql/CreateExtensions/extensions.sql";
        fsa.generateFile(path, this.compile(entity));
      }
    }
  }
  
  public CharSequence compile(final Entity entity) {
    return this.CreateExtension();
  }
  
  public CharSequence CreateExtension() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE EXTENSION temporal_tables;");
    _builder.newLine();
    return _builder;
  }
}
