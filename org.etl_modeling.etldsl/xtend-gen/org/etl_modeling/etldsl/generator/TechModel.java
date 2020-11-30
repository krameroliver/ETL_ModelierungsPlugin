package org.etl_modeling.etldsl.generator;

import com.google.common.collect.Iterables;
import logmodel.Entity;
import logmodel.Field;
import logmodel.logpackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import package_enums.LAYERTYPE;
import techmodel.TableType;

@SuppressWarnings("all")
public class TechModel extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<logpackage> _filter = Iterables.<logpackage>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), logpackage.class);
    for (final logpackage p : _filter) {
      Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
      for (final Entity e : _filter_1) {
        {
          String _lowerCase = p.getName().toLowerCase();
          String _plus = ("../tdm/" + _lowerCase);
          String _plus_1 = (_plus + "/");
          String _lowerCase_1 = e.getName().toLowerCase();
          String _plus_2 = (_plus_1 + _lowerCase_1);
          String file = (_plus_2 + ".tdm");
          fsa.generateFile(file, this.GenTechModelFiles(p, e));
        }
      }
    }
  }
  
  public CharSequence GenTechModelFiles(final logpackage p, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TechPackage ");
    LAYERTYPE _lAYER_TYPE = p.getLAYER_TYPE();
    _builder.append(_lAYER_TYPE);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("Table ");
    String _upperCase = entity.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("(");
    _builder.append(TableType.SAT);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("(");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field field : _entityField) {
        String _upperCase_1 = field.getName().toUpperCase();
        _builder.append(_upperCase_1);
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("_hk");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("TABLE ");
    String _upperCase_2 = entity.getName().toUpperCase();
    _builder.append(_upperCase_2);
    _builder.append("(");
    _builder.append(TableType.HUB);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("(");
    _builder.newLine();
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    return _builder;
  }
}
