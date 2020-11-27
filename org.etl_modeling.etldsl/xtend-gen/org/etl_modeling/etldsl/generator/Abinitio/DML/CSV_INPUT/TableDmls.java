package org.etl_modeling.etldsl.generator.Abinitio.DML.CSV_INPUT;

import com.google.common.collect.Iterables;
import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
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
public class TableDmls extends AbstractGenerator {
  private int rep = 0;
  
  private int hist = 0;
  
  private int l_type = 0;
  
  private String layer = "";
  
  private int package_name = 0;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<logpackage> _filter = Iterables.<logpackage>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), logpackage.class);
    for (final logpackage p : _filter) {
      {
        this.hist = p.getHISTORISATION().getValue();
        this.layer = p.getLAYER().toString();
        this.rep = p.getREPRESENTATION().getValue();
        this.l_type = p.getLAYER_TYPE().getValue();
        Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
        for (final Entity entity : _filter_1) {
          {
            String _lowerCase = entity.getName().toLowerCase();
            String _plus = ("dml/SAT/s_" + _lowerCase);
            String SAT_DML_PATH = (_plus + ".dml");
            String _lowerCase_1 = entity.getName().toLowerCase();
            String _plus_1 = ("dml/HUB/h_" + _lowerCase_1);
            String HUB_DML_PATH = (_plus_1 + ".dml");
            String _lowerCase_2 = entity.getName().toLowerCase();
            String _plus_2 = ("dml/Entity/entity_" + _lowerCase_2);
            String ENTITY_DML_PATH = (_plus_2 + ".dml");
            String _lowerCase_3 = entity.getName().toLowerCase();
            String _plus_3 = ("dml/LoaderInput/entity_" + _lowerCase_3);
            String loader_input_path = (_plus_3 + ".dml");
            String _lowerCase_4 = entity.getName().toLowerCase();
            String _plus_4 = ("dml/ReadEntityOutput/entity_" + _lowerCase_4);
            String re_output_path = (_plus_4 + ".dml");
            fsa.generateFile(SAT_DML_PATH, this.genTableSatDml(entity));
            fsa.generateFile(HUB_DML_PATH, this.genTableHubDml(entity));
            fsa.generateFile(ENTITY_DML_PATH, this.genEntityDml(entity));
            fsa.generateFile(loader_input_path, this.genLoaderInputDML(entity));
            fsa.generateFile(re_output_path, this.genReadEntityOutputDML(entity));
          }
        }
      }
    }
  }
  
  public String genReadEntityOutputDML(final Entity entity) {
    int number_includes = ((Object[])Conversions.unwrapArray(entity.getInclude(), Object.class)).length;
    String context = "";
    context = (context + "record\n");
    String _lowerCase = entity.getName().toLowerCase();
    String _plus = ((context + "string(\"x01\") ") + _lowerCase);
    String _plus_1 = (_plus + "_hk;\n");
    context = _plus_1;
    context = (context + "\trecord\n");
    EList<Field> _entityField = entity.getEntityField();
    for (final Field f : _entityField) {
      String _dMLDataTypeString = Utils.getDMLDataTypeString(f);
      String _plus_2 = ((context + "\t") + _dMLDataTypeString);
      String _plus_3 = (_plus_2 + " ");
      String _lowerCase_1 = f.getName().toLowerCase();
      String _plus_4 = (_plus_3 + _lowerCase_1);
      String _plus_5 = (_plus_4 + ";\n");
      context = _plus_5;
    }
    String _lowerCase_2 = entity.getName().toLowerCase();
    String _plus_6 = ((context + "end s_") + _lowerCase_2);
    String _plus_7 = (_plus_6 + ";\n");
    context = _plus_7;
    if ((number_includes > 0)) {
      EList<Include> _include = entity.getInclude();
      for (final Include include : _include) {
        {
          context = (context + "record\n");
          EList<Field> _includeFields = include.getIncludeFields();
          for (final Field inf : _includeFields) {
            String _dMLDataTypeString_1 = Utils.getDMLDataTypeString(inf);
            String _plus_8 = ((context + "\t") + _dMLDataTypeString_1);
            String _plus_9 = (_plus_8 + " ");
            String _lowerCase_3 = inf.getName().toLowerCase();
            String _plus_10 = (_plus_9 + _lowerCase_3);
            String _plus_11 = (_plus_10 + ";\n");
            context = _plus_11;
          }
          String _lowerCase_4 = entity.getName().toLowerCase();
          String _plus_12 = ((context + "end s_") + _lowerCase_4);
          String _plus_13 = (_plus_12 + "_");
          String _lowerCase_5 = include.getName().toLowerCase();
          String _plus_14 = (_plus_13 + _lowerCase_5);
          String _plus_15 = (_plus_14 + ";\n");
          context = _plus_15;
        }
      }
    }
    context = (context + "end");
    return context;
  }
  
  public CharSequence genLoaderInputDML(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field field : _entityField) {
        String _dMLDataTypeString = Utils.getDMLDataTypeString(field);
        _builder.append(_dMLDataTypeString);
        _builder.append(" ");
        String _lowerCase = field.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genTableSatDml(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field field : _entityField) {
        String _dMLDataTypeString = Utils.getDMLDataTypeString(field);
        _builder.append(_dMLDataTypeString);
        _builder.append(" ");
        String _lowerCase = field.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("date(\"YYYY-MM-DD\") creation_date;");
    _builder.newLine();
    _builder.append("date(\"YYYY-MM-DD\") modification_date;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") record_source;");
    _builder.newLine();
    _builder.append("string(\"\\x01\") ");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk;");
    _builder.newLineIfNotEmpty();
    _builder.append("string(\"\\x01\") effectiv_timerange;");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genTableHubDml(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field field : _entityField) {
        {
          boolean _isIsBusinessKey = field.isIsBusinessKey();
          if (_isIsBusinessKey) {
            String _dMLDataTypeString = Utils.getDMLDataTypeString(field);
            _builder.append(_dMLDataTypeString);
            _builder.append(" ");
            String _lowerCase = field.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("string(\"\\x01\") ");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk;");
    _builder.newLineIfNotEmpty();
    _builder.append("end ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genEntityDml(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("record");
    _builder.newLine();
    CharSequence _genTableSatDml = this.genTableSatDml(entity);
    _builder.append(_genTableSatDml);
    _builder.newLineIfNotEmpty();
    CharSequence _genTableHubDml = this.genTableHubDml(entity);
    _builder.append(_genTableHubDml);
    _builder.newLineIfNotEmpty();
    _builder.append("end");
    _builder.newLine();
    return _builder;
  }
}
