package org.etl_modeling.etldsl.generator.Abinitio.PSET;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import logmodel.Entity;
import logmodel.Include;
import logmodel.Relationship;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.etl_modeling.etldsl.generator.Abinitio.PSET.PsetHelper;

@SuppressWarnings("all")
public class GeneratorEntityPSET extends AbstractGenerator {
  @Inject
  private PsetHelper ph;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      fsa.generateFile("/pset/test/test.pset", this.EntityPset(entity));
    }
  }
  
  public CharSequence EntityPset(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$[[");
    _builder.newLine();
    _builder.append("record");
    _builder.newLine();
    _builder.append("readEntityConfig ");
    CharSequence _GenReadentityInputPset = this.ph.GenReadentityInputPset(entity);
    _builder.append(_GenReadentityInputPset);
    _builder.newLineIfNotEmpty();
    _builder.append("writeEntityConfigs [vector");
    _builder.newLine();
    CharSequence _BasicEntityPsets = this.ph.BasicEntityPsets(entity);
    _builder.append(_BasicEntityPsets);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    {
      EList<Include> _include = entity.getInclude();
      for(final Include inc : _include) {
        CharSequence _IncludeEntityPsets = this.ph.IncludeEntityPsets(inc, entity);
        _builder.append(_IncludeEntityPsets);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    {
      EList<Relationship> _relationships = entity.getRelationships();
      for(final Relationship rel : _relationships) {
        CharSequence _LinkEntityPsets = this.ph.LinkEntityPsets(rel, entity);
        _builder.append(_LinkEntityPsets);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("]\t");
    _builder.newLine();
    _builder.append("]]");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
