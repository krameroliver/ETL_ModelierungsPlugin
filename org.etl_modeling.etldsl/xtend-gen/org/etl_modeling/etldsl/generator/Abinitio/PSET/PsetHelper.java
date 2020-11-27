package org.etl_modeling.etldsl.generator.Abinitio.PSET;

import java.util.ArrayList;
import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
import logmodel.Relationship;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PsetHelper {
  public CharSequence GenReadentityInputPset(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("entity_name \"");
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_type \"\"");
    _builder.newLine();
    _builder.append("layer_type \"BITEMPORAL\"");
    _builder.newLine();
    _builder.append("entity_desc [record");
    _builder.newLine();
    _builder.append("main_table_description  [record");
    _builder.newLine();
    _builder.append("table_name         \"h_");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("historization_type \"BITEMPORAL\"");
    _builder.newLine();
    _builder.append("tkey_fields        [vector \"");
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("bkey_fields        [vector ");
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field bkf : _entityField) {
        {
          boolean _isIsBusinessKey = bkf.isIsBusinessKey();
          if (_isIsBusinessKey) {
            _builder.append("\"");
            String _name = bkf.getName();
            _builder.append(_name);
            _builder.append("\",");
          }
        }
      }
    }
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("table_relations    [vector");
    _builder.newLine();
    String _TableRecordJoind = this.TableRecordJoind(entity);
    _builder.append(_TableRecordJoind);
    _builder.newLineIfNotEmpty();
    _builder.append("]]");
    _builder.newLine();
    _builder.append("partner_table_descriptions [vector");
    _builder.newLine();
    String _partner_tableRecordJoind = this.partner_tableRecordJoind(entity);
    _builder.append(_partner_tableRecordJoind);
    _builder.newLineIfNotEmpty();
    _builder.append("]]]");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence partner_table_descriptions(final String entity_name, final String table_name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("table_name \"");
    _builder.append(table_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("historization_type \"full\"");
    _builder.newLine();
    _builder.append("tkey_fields [vector \"");
    _builder.append(entity_name);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("bkey_fields\tNULL");
    _builder.newLine();
    _builder.append("table_relations    [vector]]");
    _builder.newLine();
    return _builder;
  }
  
  public String partner_tableRecordJoind(final Entity entity) {
    ArrayList<String> al = new ArrayList<String>();
    String _lowerCase = entity.getName().toLowerCase();
    String _lowerCase_1 = entity.getName().toLowerCase();
    String _plus = ("s_" + _lowerCase_1);
    al.add(this.partner_table_descriptions(_lowerCase, _plus).toString());
    EList<Include> _include = entity.getInclude();
    for (final Include include : _include) {
      int _length = ((Object[])Conversions.unwrapArray(include.getIdentifyingfields(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        String _lowerCase_2 = entity.getName().toLowerCase();
        String _lowerCase_3 = entity.getName().toLowerCase();
        String _plus_1 = ("m_" + _lowerCase_3);
        String _plus_2 = (_plus_1 + "_");
        String _lowerCase_4 = include.getName().toLowerCase();
        String _plus_3 = (_plus_2 + _lowerCase_4);
        al.add(this.partner_table_descriptions(_lowerCase_2, _plus_3).toString());
      } else {
        String _lowerCase_5 = entity.getName().toLowerCase();
        String _lowerCase_6 = entity.getName().toLowerCase();
        String _plus_4 = ("s_" + _lowerCase_6);
        String _plus_5 = (_plus_4 + "_");
        String _lowerCase_7 = include.getName().toLowerCase();
        String _plus_6 = (_plus_5 + _lowerCase_7);
        al.add(this.partner_table_descriptions(_lowerCase_5, _plus_6).toString());
      }
    }
    return IterableExtensions.join(al, ",");
  }
  
  public CharSequence Tablerecord(final String name, final String origin_field, final String partner_field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("partner_table \"");
    _builder.append(name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("join_condition     \"INNER JOIN\"");
    _builder.newLine();
    _builder.append("related_fields_vec [vector");
    _builder.newLine();
    _builder.append("                          ");
    _builder.append("[record");
    _builder.newLine();
    _builder.append("                           ");
    _builder.append("origin_field  \"");
    _builder.append(origin_field, "                           ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("                           ");
    _builder.append("partner_field \"");
    _builder.append(partner_field, "                           ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("]]]");
    _builder.newLine();
    return _builder;
  }
  
  public String TableRecordJoind(final Entity entity) {
    ArrayList<String> al = new ArrayList<String>();
    String _lowerCase = entity.getName().toLowerCase();
    String _plus = ("s_" + _lowerCase);
    String _lowerCase_1 = entity.getName().toLowerCase();
    String _plus_1 = (_lowerCase_1 + "_hk");
    String _lowerCase_2 = entity.getName().toLowerCase();
    String _plus_2 = (_lowerCase_2 + "_hk");
    al.add(this.Tablerecord(_plus, _plus_1, _plus_2).toString());
    EList<Include> _include = entity.getInclude();
    for (final Include include : _include) {
      int _length = ((Object[])Conversions.unwrapArray(include.getIdentifyingfields(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        String _lowerCase_3 = entity.getName().toLowerCase();
        String _plus_3 = ("m_" + _lowerCase_3);
        String _plus_4 = (_plus_3 + "_");
        String _lowerCase_4 = include.getName().toLowerCase();
        String _plus_5 = (_plus_4 + _lowerCase_4);
        String _lowerCase_5 = entity.getName().toLowerCase();
        String _plus_6 = (_lowerCase_5 + "_hk");
        String _lowerCase_6 = entity.getName().toLowerCase();
        String _plus_7 = (_lowerCase_6 + "_hk");
        al.add(this.Tablerecord(_plus_5, _plus_6, _plus_7).toString());
      } else {
        String _lowerCase_7 = entity.getName().toLowerCase();
        String _plus_8 = ("s_" + _lowerCase_7);
        String _plus_9 = (_plus_8 + "_");
        String _lowerCase_8 = include.getName().toLowerCase();
        String _plus_10 = (_plus_9 + _lowerCase_8);
        String _lowerCase_9 = entity.getName().toLowerCase();
        String _plus_11 = (_lowerCase_9 + "_hk");
        String _lowerCase_10 = entity.getName().toLowerCase();
        String _plus_12 = (_lowerCase_10 + "_hk");
        al.add(this.Tablerecord(_plus_10, _plus_11, _plus_12).toString());
      }
    }
    return IterableExtensions.join(al, ",");
  }
  
  public String BuildBusinessKeys(final Entity entity) {
    ArrayList<String> bk_fields = new ArrayList<String>();
    EList<Field> _entityField = entity.getEntityField();
    for (final Field field : _entityField) {
      boolean _isIsBusinessKey = field.isIsBusinessKey();
      if (_isIsBusinessKey) {
        String _lowerCase = field.getName().toLowerCase();
        String _plus = ("\"" + _lowerCase);
        String _plus_1 = (_plus + "\"");
        bk_fields.add(_plus_1);
      }
    }
    return IterableExtensions.join(bk_fields, ",");
  }
  
  public String BuildIdentifyingKeys(final Relationship rel) {
    ArrayList<String> bk_fields = new ArrayList<String>();
    EList<Field> _identifiyingFieldsRel = rel.getIdentifiyingFieldsRel();
    for (final Field field : _identifiyingFieldsRel) {
      String _lowerCase = field.getName().toLowerCase();
      String _plus = ("\"" + _lowerCase);
      String _plus_1 = (_plus + "\"");
      bk_fields.add(_plus_1);
    }
    return IterableExtensions.join(bk_fields, ",");
  }
  
  public CharSequence BasicEntityPsets(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(" [record");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_name \"");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("hub_name    \"h_");
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("sat_name    \"s_");
    String _lowerCase_3 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("tech_keys   [vector \"");
    String _lowerCase_4 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_4);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("business_keys [vector ");
    String _BuildBusinessKeys = this.BuildBusinessKeys(entity);
    _builder.append(_BuildBusinessKeys);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("]]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence IncludeEntityPsets(final Include include, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record ");
    _builder.newLine();
    String _lowerCase = include.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(" [record");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_name \"");
    String _lowerCase_1 = include.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("hub_name    \"h_");
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    {
      int _length = ((Object[])Conversions.unwrapArray(include.getIdentifyingfields(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("sat_name    \"m_");
        String _lowerCase_3 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_3);
        _builder.append("_");
        String _lowerCase_4 = include.getName().toLowerCase();
        _builder.append(_lowerCase_4);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sat_name    \"s_");
        String _lowerCase_5 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_5);
        _builder.append("_");
        String _lowerCase_6 = include.getName().toLowerCase();
        _builder.append(_lowerCase_6);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("tech_keys   [vector \"");
    String _lowerCase_7 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_7);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("business_keys [vector ");
    String _BuildBusinessKeys = this.BuildBusinessKeys(entity);
    _builder.append(_BuildBusinessKeys);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("]]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence LinkEntityPsets(final Relationship relationship, final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    String _lowerCase = relationship.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append(" [record");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_name \"");
    String _lowerCase_1 = relationship.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("hub_name    \"r_");
    String _lowerCase_2 = relationship.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("_");
    String _lowerCase_3 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.append("_");
    String _lowerCase_4 = relationship.getToEntity().getName().toLowerCase();
    _builder.append(_lowerCase_4);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    {
      int _length = ((Object[])Conversions.unwrapArray(relationship.getIdentifiyingFieldsRel(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append("sat_name    \"r_m_");
        String _lowerCase_5 = relationship.getName().toLowerCase();
        _builder.append(_lowerCase_5);
        _builder.append("_");
        String _lowerCase_6 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_6);
        _builder.append("_");
        String _lowerCase_7 = relationship.getToEntity().getName().toLowerCase();
        _builder.append(_lowerCase_7);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sat_name    \"r_s_");
        String _lowerCase_8 = relationship.getName().toLowerCase();
        _builder.append(_lowerCase_8);
        _builder.append("_");
        String _lowerCase_9 = entity.getName().toLowerCase();
        _builder.append(_lowerCase_9);
        _builder.append("_");
        String _lowerCase_10 = relationship.getToEntity().getName().toLowerCase();
        _builder.append(_lowerCase_10);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("tech_keys   [vector \"");
    String _lowerCase_11 = relationship.getName().toLowerCase();
    _builder.append(_lowerCase_11);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("business_keys [vector ");
    String _BuildIdentifyingKeys = this.BuildIdentifyingKeys(relationship);
    _builder.append(_BuildIdentifyingKeys);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("]]");
    _builder.newLine();
    return _builder;
  }
}
