package org.etl_modeling.etldsl.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import logmodel.logpackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CreateSchema extends AbstractGenerator {
  private ArrayList<String> layer = new ArrayList<String>();
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String file = "sql/CreateSchema/Schema.sql";
    Iterable<logpackage> _filter = Iterables.<logpackage>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), logpackage.class);
    for (final logpackage p : _filter) {
      boolean _contains = this.layer.contains(p.getLAYER().toString());
      boolean _not = (!_contains);
      if (_not) {
        this.layer.add(p.getLAYER().toString());
      }
    }
    fsa.generateFile(file, this.CreateSchema(this.layer));
  }
  
  public CharSequence CreateSchema(final ArrayList<String> layer) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String s : layer) {
        _builder.append("CREATE SCHEMA IF NOT EXISTS ");
        _builder.append(s);
        _builder.append("SCHEMA_ID;");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
