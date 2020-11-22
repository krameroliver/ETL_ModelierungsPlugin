package org.etl_modeling.etldsl.generator.Abinitio.DML.CSV_INPUT;

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
import org.etl_modeling.etldsl.utils.Utils;

@SuppressWarnings("all")
public class DML_CSV_Input extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    int rep = 0;
    int hist = 0;
    int l_type = 0;
    String layer = "";
    int package_name = 0;
    Iterable<logpackage> _filter = Iterables.<logpackage>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), logpackage.class);
    for (final logpackage p : _filter) {
      {
        hist = p.getHISTORISATION().getValue();
        layer = p.getLAYER().toString();
        rep = p.getREPRESENTATION().getValue();
        l_type = p.getLAYER_TYPE().getValue();
        Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
        for (final Entity entity : _filter_1) {
          int _value = p.getLAYER_TYPE().getValue();
          boolean _equals = (_value == 0);
          if (_equals) {
            String _lowerCase = entity.getName().toLowerCase();
            String _plus = ("dml/input/" + _lowerCase);
            final String path = (_plus + ".dml");
            fsa.generateFile(path, this.genCSVdml(entity));
          }
        }
      }
    }
  }
  
  public CharSequence genCSVdml(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field f : _entityField) {
        String _lowerCase = f.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append(" ");
        String _dMLDataTypeString = Utils.getDMLDataTypeString(f);
        _builder.append(_dMLDataTypeString);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
}
