package org.etl_modeling.etldsl.generator.Abinitio.DML.CSV_INPUT;

import com.google.common.collect.Iterables;
import logmodel.CommonMapping;
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
import org.eclipse.xtext.xbase.lib.Conversions;
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
        Iterable<CommonMapping> _filter_1 = Iterables.<CommonMapping>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), CommonMapping.class);
        for (final CommonMapping cm : _filter_1) {
          {
            final String input_dml_path = "dml/struktur/input/";
            String _lowerCase = cm.getName().toLowerCase();
            /* (_lowerCase + ".dml"); */
            final String output_dml_path = "dml/struktur/output/";
            String _lowerCase_1 = cm.getName().toLowerCase();
            /* (_lowerCase_1 + ".dml"); */
            fsa.generateFile(input_dml_path, this.genCommonMappingImportDML(cm));
            fsa.generateFile(output_dml_path, this.genCommonMappingOutputDML(cm));
          }
        }
        Iterable<Entity> _filter_2 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
        for (final Entity entity : _filter_2) {
          int _value = p.getLAYER_TYPE().getValue();
          boolean _equals = (_value == 0);
          if (_equals) {
            String _lowerCase = entity.getName().toLowerCase();
            String _plus = ("dml/input/file/" + _lowerCase);
            final String path = (_plus + ".dml");
            String _lowerCase_1 = entity.getName().toLowerCase();
            String _plus_1 = ((("dml/input/loader_Input/" + layer) + "/") + _lowerCase_1);
            final String path_table_input = (_plus_1 + ".dml");
            String _lowerCase_2 = entity.getName().toLowerCase();
            String _plus_2 = ((("dml/input/loader_Tec/" + layer) + "/") + _lowerCase_2);
            final String path_table_tec = (_plus_2 + ".dml");
            fsa.generateFile(path, this.genCSVdml(entity));
            fsa.generateFile(path_table_input, this.genLoaderdml(entity));
            fsa.generateFile(path_table_tec, this.genLoaderdml(entity));
            this.copyfile(fsa);
          }
        }
      }
    }
  }
  
  public void copyfile(final IFileSystemAccess2 fsa) {
    fsa.generateFile("test_copy.xml", fsa.readTextFile("../src/test.xml"));
  }
  
  public CharSequence genCommonMappingImportDML(final CommonMapping cm) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(cm.getCommonmappinginputfields(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("record");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("record");
        _builder.newLine();
        _builder.append("   ");
        _builder.newLine();
        {
          EList<Field> _commonmappinginputfields = cm.getCommonmappinginputfields();
          for(final Field f : _commonmappinginputfields) {
            _builder.append("   ");
            String _dMLDataTypeString = Utils.getDMLDataTypeString(f);
            _builder.append(_dMLDataTypeString, "   ");
            _builder.append(" ");
            String _lowerCase = f.getName().toLowerCase();
            _builder.append(_lowerCase, "   ");
            _builder.append(" = NULL;");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("   ");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("end ");
        String _lowerCase_1 = cm.getName().toLowerCase();
        _builder.append(_lowerCase_1, "   ");
        _builder.newLineIfNotEmpty();
        _builder.append("end");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence genCommonMappingOutputDML(final CommonMapping cm) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(cm.getCommonmappingoutputfields(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("record");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("record");
        _builder.newLine();
        _builder.append("   ");
        _builder.newLine();
        {
          EList<Field> _commonmappingoutputfields = cm.getCommonmappingoutputfields();
          for(final Field f : _commonmappingoutputfields) {
            _builder.append("   ");
            String _dMLDataTypeString = Utils.getDMLDataTypeString(f);
            _builder.append(_dMLDataTypeString, "   ");
            _builder.append(" ");
            String _lowerCase = f.getName().toLowerCase();
            _builder.append(_lowerCase, "   ");
            _builder.append(" = NULL;");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("   ");
        _builder.newLine();
        _builder.append("   ");
        _builder.append("end ");
        String _lowerCase_1 = cm.getName().toLowerCase();
        _builder.append(_lowerCase_1, "   ");
        _builder.newLineIfNotEmpty();
        _builder.append("end");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence genCSVdml(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field f : _entityField) {
        {
          boolean _isTableOnly = f.isTableOnly();
          boolean _not = (!_isTableOnly);
          if (_not) {
            String _dMLDataTypeString = Utils.getDMLDataTypeString(f);
            _builder.append(_dMLDataTypeString);
            _builder.append(" ");
            String _lowerCase = f.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append(" = NULL;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genLoaderTecdml(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field f : _entityField) {
        {
          boolean _isInterfaceOnly = f.isInterfaceOnly();
          boolean _not = (!_isInterfaceOnly);
          if (_not) {
            String _dMLDataTypeString = Utils.getDMLDataTypeString(f);
            _builder.append(_dMLDataTypeString);
            _builder.append(" ");
            String _lowerCase = f.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append(" = NULL;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("date(\"YYYY-MM-DD\") creation_date ;");
    _builder.newLine();
    _builder.append("date(\"YYYY-MM-DD\") modification_date ;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") processing_point ;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") record_source ;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") record_hk ;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") ");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk ;");
    _builder.newLineIfNotEmpty();
    _builder.append("string(\"\\x01\") effectiv_timerange ;");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genLoaderdml(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    _builder.append("record");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field f : _entityField) {
        {
          boolean _isInterfaceOnly = f.isInterfaceOnly();
          boolean _not = (!_isInterfaceOnly);
          if (_not) {
            String _lowerCase = f.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append(" ");
            String _dMLDataTypeString = Utils.getDMLDataTypeString(f);
            _builder.append(_dMLDataTypeString);
            _builder.append("= NULL;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("end s_");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("record");
    _builder.newLine();
    _builder.append("string(\"\\x01\") record_source ;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") record_hk ;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") ");
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("_hk = NULL;");
    _builder.newLineIfNotEmpty();
    _builder.append("end h_");
    String _lowerCase_3 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.newLineIfNotEmpty();
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
}
