package org.etl_modeling.etldsl.generator.SQL.Postgres.BiTemp.DataVault;

import com.google.common.collect.Iterables;
import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
import logmodel.Relationship;
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
public class BiTempDV extends AbstractGenerator {
  private int rep = 0;
  
  private int hist = 0;
  
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
      }
    }
    Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter_1) {
      if (((this.rep == 1) && (this.hist == 3))) {
        this.compile(entity, fsa);
      }
    }
  }
  
  public void compile(final Entity entity, final IFileSystemAccess2 fsa) {
    String content = "";
    CharSequence _createMainSats = this.createMainSats(entity);
    String _plus = (content + _createMainSats);
    content = _plus;
    CharSequence _createHub = this.createHub(entity);
    String _plus_1 = (content + _createHub);
    content = _plus_1;
    CharSequence _createMainSatFC = this.createMainSatFC(entity);
    String _plus_2 = (content + _createMainSatFC);
    content = _plus_2;
    CharSequence _createInclude = this.createInclude(entity);
    String _plus_3 = (content + _createInclude);
    content = _plus_3;
    CharSequence _createIncludeFC = this.createIncludeFC(entity);
    String _plus_4 = (content + _createIncludeFC);
    content = _plus_4;
    String _lowerCase = entity.getName().toLowerCase();
    String _plus_5 = ("sql/CreateTable/" + _lowerCase);
    final String path = (_plus_5 + ".sql");
    fsa.generateFile(path, content);
  }
  
  public CharSequence createMainSats(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field f : _entityField) {
        {
          boolean _isIsFastChanging = f.isIsFastChanging();
          boolean _equals = (_isIsFastChanging == false);
          if (_equals) {
            String _lowerCase_1 = f.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append(" ");
            String _dataTypeString = Utils.getDataTypeString(f);
            _builder.append(_dataTypeString);
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("creation_date DATE,");
    _builder.newLine();
    _builder.append("modification_date DATE,");
    _builder.newLine();
    _builder.append("processing_point VARCHAR(10),");
    _builder.newLine();
    _builder.append("record_source VARCHAR(255),");
    _builder.newLine();
    _builder.append("record_hk CHAR(32),");
    _builder.newLine();
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("_hk CHAR(32),");
    _builder.newLineIfNotEmpty();
    _builder.append("effectiv_timerange tstzrange,");
    _builder.newLine();
    _builder.append("PRIMARY KEY(");
    String _lowerCase_3 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.append("_hk,PROCESSING_POINT)");
    _builder.newLineIfNotEmpty();
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("CREATE TABLE ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase_4 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_4);
    _builder.append("_hist (like ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase_5 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_5);
    _builder.append(" including all);");
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TRIGGER versioning_trigger_s_");
    String _lowerCase_6 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_6);
    _builder.append(" BEFORE INSERT OR UPDATE OR DELETE ON ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase_7 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_7);
    _builder.append(" FOR EACH ROW EXECUTE PROCEDURE versioning(\'effectiv_timerange\', \'");
    _builder.append(this.layer);
    _builder.append(".");
    String _lowerCase_8 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_8);
    _builder.append("_hist\', true);");
    _builder.newLineIfNotEmpty();
    _builder.append("---");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createHub(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    _builder.append(this.layer);
    _builder.append(".h_");
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field f : _entityField) {
        {
          boolean _isIsBusinessKey = f.isIsBusinessKey();
          if (_isIsBusinessKey) {
            String _lowerCase_1 = f.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append(" ");
            String _dataTypeString = Utils.getDataTypeString(f);
            _builder.append(_dataTypeString);
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("_hk CHAR(32),");
    _builder.newLineIfNotEmpty();
    _builder.append("PRIMARY KEY(");
    String _lowerCase_3 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.append("_hk)");
    _builder.newLineIfNotEmpty();
    _builder.append(");");
    _builder.newLine();
    _builder.append("---");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMainSatFC(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("_fc(");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field f : _entityField) {
        {
          boolean _isIsFastChanging = f.isIsFastChanging();
          boolean _equals = (_isIsFastChanging == true);
          if (_equals) {
            String _lowerCase_1 = f.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append(" ");
            String _dataTypeString = Utils.getDataTypeString(f);
            _builder.append(_dataTypeString);
            _builder.append(",");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("creation_date DATE,");
    _builder.newLine();
    _builder.append("modification_date DATE,");
    _builder.newLine();
    _builder.append("processing_point VARCHAR(10),");
    _builder.newLine();
    _builder.append("record_source VARCHAR(255),");
    _builder.newLine();
    _builder.append("record_hk CHAR(32),");
    _builder.newLine();
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("_hk CHAR(32),");
    _builder.newLineIfNotEmpty();
    _builder.append("effectiv_timerange tstzrange,");
    _builder.newLine();
    _builder.append("PRIMARY KEY(");
    String _lowerCase_3 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.append("_hk,PROCESSING_POINT)");
    _builder.newLineIfNotEmpty();
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("CREATE TABLE ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase_4 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_4);
    _builder.append("_fc_hist (like ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase_5 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_5);
    _builder.append(" including all);");
    _builder.newLineIfNotEmpty();
    _builder.append("CREATE TRIGGER versioning_trigger_s_");
    String _lowerCase_6 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_6);
    _builder.append("_fc BEFORE INSERT OR UPDATE OR DELETE ON ");
    _builder.append(this.layer);
    _builder.append(".s_");
    String _lowerCase_7 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_7);
    _builder.append("_fc FOR EACH ROW EXECUTE PROCEDURE versioning(\'effectiv_timerange\', \'");
    _builder.append(this.layer);
    _builder.append(".");
    String _lowerCase_8 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_8);
    _builder.append("_fc_hist\', true);");
    _builder.newLineIfNotEmpty();
    _builder.append("---");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createInclude(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Include> _include = entity.getInclude();
      for(final Include include : _include) {
        _builder.newLine();
        {
          int _length = ((Object[])Conversions.unwrapArray(include.getIdentifyingfields(), Object.class)).length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".m_");
            String _lowerCase = entity.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append("_");
            String _name = include.getName();
            _builder.append(_name);
            _builder.append("(");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".s_");
            String _lowerCase_1 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append("_");
            String _name_1 = include.getName();
            _builder.append(_name_1);
            _builder.append("(");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Field> _identifyingfields = include.getIdentifyingfields();
          for(final Field f : _identifyingfields) {
            {
              boolean _isIsFastChanging = f.isIsFastChanging();
              boolean _not = (!_isIsFastChanging);
              if (_not) {
                String _lowerCase_2 = f.getName().toLowerCase();
                _builder.append(_lowerCase_2);
                _builder.append(" ");
                String _dataTypeString = Utils.getDataTypeString(f);
                _builder.append(_dataTypeString);
                _builder.append(",");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("creation_date DATE,");
        _builder.newLine();
        _builder.append("modification_date DATE,");
        _builder.newLine();
        _builder.append("processing_point VARCHAR(10),");
        _builder.newLine();
        _builder.append("record_source VARCHAR(255),");
        _builder.newLine();
        _builder.append("record_hk CHAR(32),");
        _builder.newLine();
        String _lowerCase_3 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_3);
        _builder.append("_hk CHAR(32),");
        _builder.newLineIfNotEmpty();
        _builder.append("effectiv_timerange tstzrange,");
        _builder.newLine();
        _builder.append("PRIMARY KEY(");
        String _lowerCase_4 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_4);
        _builder.append("_hk,PROCESSING_POINT)");
        _builder.newLineIfNotEmpty();
        _builder.append(");");
        _builder.newLine();
        {
          int _length_1 = ((Object[])Conversions.unwrapArray(include.getIdentifyingfields(), Object.class)).length;
          boolean _greaterThan_1 = (_length_1 > 0);
          if (_greaterThan_1) {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".m_");
            String _lowerCase_5 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_5);
            _builder.append("_");
            String _name_2 = include.getName();
            _builder.append(_name_2);
            _builder.append("_hist (like ");
            _builder.append(this.layer);
            _builder.append(".m_");
            String _lowerCase_6 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_6);
            _builder.append("_");
            String _name_3 = include.getName();
            _builder.append(_name_3);
            _builder.append(" including all);");
            _builder.newLineIfNotEmpty();
            _builder.append("CREATE TRIGGER versioning_trigger_m_");
            _builder.append(this.layer);
            _builder.append("_s_");
            String _lowerCase_7 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_7);
            _builder.append("_");
            String _name_4 = include.getName();
            _builder.append(_name_4);
            _builder.append(" BEFORE INSERT OR UPDATE OR DELETE ON ");
            _builder.append(this.layer);
            _builder.append(".m_");
            String _lowerCase_8 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_8);
            _builder.append("_");
            String _name_5 = include.getName();
            _builder.append(_name_5);
            _builder.append(" FOR EACH ROW EXECUTE PROCEDURE versioning(\'effectiv_timerange\', \'");
            _builder.append(this.layer);
            _builder.append(".m_");
            String _lowerCase_9 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_9);
            _builder.append("_");
            String _name_6 = include.getName();
            _builder.append(_name_6);
            _builder.append("_hist\', true);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".s_");
            String _lowerCase_10 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_10);
            _builder.append("_");
            String _name_7 = include.getName();
            _builder.append(_name_7);
            _builder.append("_hist (like ");
            _builder.append(this.layer);
            _builder.append(".s_");
            String _lowerCase_11 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_11);
            _builder.append("_");
            String _name_8 = include.getName();
            _builder.append(_name_8);
            _builder.append(" including all);");
            _builder.newLineIfNotEmpty();
            _builder.append("CREATE TRIGGER versioning_trigger_");
            _builder.append(this.layer);
            _builder.append("_s_");
            String _lowerCase_12 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_12);
            _builder.append("_");
            String _name_9 = include.getName();
            _builder.append(_name_9);
            _builder.append(" BEFORE INSERT OR UPDATE OR DELETE ON ");
            _builder.append(this.layer);
            _builder.append(".s_");
            String _lowerCase_13 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_13);
            _builder.append("_");
            String _name_10 = include.getName();
            _builder.append(_name_10);
            _builder.append(" FOR EACH ROW EXECUTE PROCEDURE versioning(\'effectiv_timerange\', \'");
            _builder.append(this.layer);
            _builder.append(".s_");
            String _lowerCase_14 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_14);
            _builder.append("_");
            String _name_11 = include.getName();
            _builder.append(_name_11);
            _builder.append("_hist\', true);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("---");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createIncludeFC(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Include> _include = entity.getInclude();
      for(final Include include : _include) {
        {
          int _length = ((Object[])Conversions.unwrapArray(include.getIdentifyingfields(), Object.class)).length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".m_");
            String _lowerCase = entity.getName().toLowerCase();
            _builder.append(_lowerCase);
            _builder.append("_");
            String _name = include.getName();
            _builder.append(_name);
            _builder.append("_fc(");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".s_");
            String _lowerCase_1 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_1);
            _builder.append("_");
            String _name_1 = include.getName();
            _builder.append(_name_1);
            _builder.append("_fc(");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Field> _identifyingfields = include.getIdentifyingfields();
          for(final Field f : _identifyingfields) {
            {
              boolean _isIsFastChanging = f.isIsFastChanging();
              if (_isIsFastChanging) {
                String _lowerCase_2 = f.getName().toLowerCase();
                _builder.append(_lowerCase_2);
                _builder.append(" ");
                String _dataTypeString = Utils.getDataTypeString(f);
                _builder.append(_dataTypeString);
                _builder.append(",");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("creation_date DATE,");
        _builder.newLine();
        _builder.append("modification_date DATE,");
        _builder.newLine();
        _builder.append("processing_point VARCHAR(10),");
        _builder.newLine();
        _builder.append("record_source VARCHAR(255),");
        _builder.newLine();
        _builder.append("record_hk CHAR(32),");
        _builder.newLine();
        String _lowerCase_3 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_3);
        _builder.append("_hk CHAR(32),");
        _builder.newLineIfNotEmpty();
        _builder.append("effectiv_timerange tstzrange,");
        _builder.newLine();
        _builder.append("PRIMARY KEY(");
        String _lowerCase_4 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_4);
        _builder.append("_hk,PROCESSING_POINT)");
        _builder.newLineIfNotEmpty();
        _builder.append(");");
        _builder.newLine();
        _builder.newLine();
        _builder.append("CREATE TABLE ");
        _builder.append(this.layer);
        _builder.append(".s_");
        String _lowerCase_5 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_5);
        _builder.append("_");
        String _name_2 = include.getName();
        _builder.append(_name_2);
        _builder.append("_fc_hist (like ");
        _builder.append(this.layer);
        _builder.append(".s_");
        String _lowerCase_6 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_6);
        _builder.append("_");
        String _name_3 = include.getName();
        _builder.append(_name_3);
        _builder.append("_fc including all);");
        _builder.newLineIfNotEmpty();
        _builder.append("CREATE TRIGGER versioning_trigger_s_");
        _builder.append(this.layer);
        _builder.append("_s_");
        String _lowerCase_7 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_7);
        _builder.append("_");
        String _name_4 = include.getName();
        _builder.append(_name_4);
        _builder.append("_fc BEFORE INSERT OR UPDATE OR DELETE ON ");
        _builder.append(this.layer);
        _builder.append(".s_");
        String _lowerCase_8 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_8);
        _builder.append("_");
        String _name_5 = include.getName();
        _builder.append(_name_5);
        _builder.append("_fc FOR EACH ROW EXECUTE PROCEDURE versioning(\'effectiv_timerange\', \'");
        _builder.append(this.layer);
        _builder.append(".s_");
        String _lowerCase_9 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_9);
        _builder.append("_");
        String _name_6 = include.getName();
        _builder.append(_name_6);
        _builder.append("_fc_hist\', true);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("---");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateRelations(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Relationship> _relationships = entity.getRelationships();
      for(final Relationship relation : _relationships) {
        _builder.append("CREATE TABLE ");
        _builder.append(this.layer);
        _builder.append(".r_");
        String _lowerCase = relation.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append("_");
        String _lowerCase_1 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_1);
        _builder.append("_");
        String _lowerCase_2 = relation.getToEntity().getName().toLowerCase();
        _builder.append(_lowerCase_2);
        _builder.append("(");
        _builder.newLineIfNotEmpty();
        String _lowerCase_3 = relation.getName().toLowerCase();
        _builder.append(_lowerCase_3);
        _builder.append("_hk CHAR(32),");
        _builder.newLineIfNotEmpty();
        String _lowerCase_4 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_4);
        _builder.append("_hk CHAR(32),");
        _builder.newLineIfNotEmpty();
        String _lowerCase_5 = relation.getToEntity().getName().toLowerCase();
        _builder.append(_lowerCase_5);
        _builder.append("_hk CHAR(32)");
        _builder.newLineIfNotEmpty();
        _builder.append("PRIMARY KEY(");
        String _lowerCase_6 = relation.getName().toLowerCase();
        _builder.append(_lowerCase_6);
        _builder.append("_hk));");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateRelationshipSat(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Relationship> _relationships = entity.getRelationships();
      for(final Relationship relation : _relationships) {
        {
          int _length = ((Object[])Conversions.unwrapArray(relation.getIdentifiyingFieldsRel(), Object.class)).length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _builder.append("\t   ");
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer, "\t   ");
            _builder.append(".r_m_");
            String _lowerCase = relation.getName().toLowerCase();
            _builder.append(_lowerCase, "\t   ");
            _builder.append("_");
            String _lowerCase_1 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_1, "\t   ");
            _builder.append("_");
            String _lowerCase_2 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_2, "\t   ");
            _builder.append("(");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t   ");
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer, "\t   ");
            _builder.append(".r_s_");
            String _lowerCase_3 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_3, "\t   ");
            _builder.append("_");
            String _lowerCase_4 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_4, "\t   ");
            _builder.append("_");
            String _lowerCase_5 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_5, "\t   ");
            _builder.append("(");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Field> _describingfields = relation.getDescribingfields();
          for(final Field f : _describingfields) {
            String _lowerCase_6 = f.getName().toLowerCase();
            _builder.append(_lowerCase_6);
            _builder.append(" ");
            String _dataTypeString = Utils.getDataTypeString(f);
            _builder.append(_dataTypeString);
            _builder.append(" -- describing field,");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Field> _identifiyingFieldsRel = relation.getIdentifiyingFieldsRel();
          for(final Field f_1 : _identifiyingFieldsRel) {
            String _lowerCase_7 = f_1.getName().toLowerCase();
            _builder.append(_lowerCase_7);
            _builder.append(" ");
            String _dataTypeString_1 = Utils.getDataTypeString(f_1);
            _builder.append(_dataTypeString_1);
            _builder.append(" -- identifiying field,");
            _builder.newLineIfNotEmpty();
          }
        }
        String _lowerCase_8 = relation.getName().toLowerCase();
        _builder.append(_lowerCase_8);
        _builder.append("_hk CHAR(32),");
        _builder.newLineIfNotEmpty();
        _builder.append("creation_date DATE,");
        _builder.newLine();
        _builder.append("modification_date DATE,");
        _builder.newLine();
        _builder.append("processing_point VARCHAR(10),");
        _builder.newLine();
        _builder.append("record_source VARCHAR(255),");
        _builder.newLine();
        _builder.append("record_hk CHAR(32),");
        _builder.newLine();
        String _lowerCase_9 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_9);
        _builder.append("_hk CHAR(32),");
        _builder.newLineIfNotEmpty();
        _builder.append("effectiv_timerange tstzrange,");
        _builder.newLine();
        _builder.append("PRIMARY KEY(");
        String _lowerCase_10 = relation.getName().toLowerCase();
        _builder.append(_lowerCase_10);
        _builder.append("_hk,PROCESSING_POINT));");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          int _length_1 = ((Object[])Conversions.unwrapArray(relation.getIdentifiyingFieldsRel(), Object.class)).length;
          boolean _greaterThan_1 = (_length_1 > 0);
          if (_greaterThan_1) {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".r_m_");
            String _lowerCase_11 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_11);
            _builder.append("_");
            String _lowerCase_12 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_12);
            _builder.append("_");
            String _lowerCase_13 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_13);
            _builder.append("_hist (like ");
            _builder.append(this.layer);
            _builder.append(".r_m_");
            String _lowerCase_14 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_14);
            _builder.append("_");
            String _lowerCase_15 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_15);
            _builder.append("_");
            String _lowerCase_16 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_16);
            _builder.append(" including all);");
            _builder.newLineIfNotEmpty();
            _builder.append("CREATE TRIGGER versioning_trigger_");
            _builder.append(this.layer);
            _builder.append("_r_m_");
            String _lowerCase_17 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_17);
            _builder.append("_");
            String _lowerCase_18 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_18);
            _builder.append("_");
            String _lowerCase_19 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_19);
            _builder.append(" BEFORE INSERT OR UPDATE OR DELETE ON ");
            _builder.append(this.layer);
            _builder.append(".r_m_");
            String _lowerCase_20 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_20);
            _builder.append("_");
            String _lowerCase_21 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_21);
            _builder.append("_");
            String _lowerCase_22 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_22);
            _builder.append(" FOR EACH ROW EXECUTE PROCEDURE versioning(\'effectiv_timerange\', \'");
            _builder.append(this.layer);
            _builder.append(".r_m_");
            String _lowerCase_23 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_23);
            _builder.append("_");
            String _lowerCase_24 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_24);
            _builder.append("_");
            String _lowerCase_25 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_25);
            _builder.append("_hist\', true);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("CREATE TABLE ");
            _builder.append(this.layer);
            _builder.append(".r_s_");
            String _lowerCase_26 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_26);
            _builder.append("_");
            String _lowerCase_27 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_27);
            _builder.append("_");
            String _lowerCase_28 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_28);
            _builder.append("_hist (like ");
            _builder.append(this.layer);
            _builder.append(".r_s_");
            String _lowerCase_29 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_29);
            _builder.append("_");
            String _lowerCase_30 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_30);
            _builder.append("_");
            String _lowerCase_31 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_31);
            _builder.append(" including all);");
            _builder.newLineIfNotEmpty();
            _builder.append("CREATE TRIGGER versioning_trigger_");
            _builder.append(this.layer);
            _builder.append("_r_s_");
            String _lowerCase_32 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_32);
            _builder.append("_");
            String _lowerCase_33 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_33);
            _builder.append("_");
            String _lowerCase_34 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_34);
            _builder.append(" BEFORE INSERT OR UPDATE OR DELETE ON ");
            _builder.append(this.layer);
            _builder.append(".r_s_");
            String _lowerCase_35 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_35);
            _builder.append("_");
            String _lowerCase_36 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_36);
            _builder.append("_");
            String _lowerCase_37 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_37);
            _builder.append(" FOR EACH ROW EXECUTE PROCEDURE versioning(\'effectiv_timerange\', \'");
            _builder.append(this.layer);
            _builder.append(".r_s_");
            String _lowerCase_38 = relation.getName().toLowerCase();
            _builder.append(_lowerCase_38);
            _builder.append("_");
            String _lowerCase_39 = entity.getName().toLowerCase();
            _builder.append(_lowerCase_39);
            _builder.append("_");
            String _lowerCase_40 = relation.getToEntity().getName().toLowerCase();
            _builder.append(_lowerCase_40);
            _builder.append("_hist\', true);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
