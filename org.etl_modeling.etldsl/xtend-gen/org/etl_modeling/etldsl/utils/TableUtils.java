package org.etl_modeling.etldsl.utils;

import logmodel.Entity;
import logmodel.Include;
import logmodel.Relationship;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class TableUtils {
  private String name = "";
  
  private String type = "";
  
  public static String getMainSatName(final Entity entity) {
    String _lowerCase = entity.getName().toLowerCase();
    return ("s_" + _lowerCase);
  }
  
  public static String getHubName(final Entity entity) {
    String _lowerCase = entity.getName().toLowerCase();
    return ("h_" + _lowerCase);
  }
  
  public static String getIncludeName(final Entity entity, final Include include) {
    String tablename = "";
    int _length = ((Object[])Conversions.unwrapArray(include.getIdentifyingfields(), Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      String _lowerCase = entity.getName().toLowerCase();
      String _plus = ("m_" + _lowerCase);
      String _plus_1 = (_plus + "_");
      String _lowerCase_1 = include.getName().toLowerCase();
      String _plus_2 = (_plus_1 + _lowerCase_1);
      tablename = _plus_2;
    } else {
      String _lowerCase_2 = entity.getName().toLowerCase();
      String _plus_3 = ("s_" + _lowerCase_2);
      String _plus_4 = (_plus_3 + "_");
      String _lowerCase_3 = include.getName().toLowerCase();
      String _plus_5 = (_plus_4 + _lowerCase_3);
      tablename = _plus_5;
    }
    return tablename.toString();
  }
  
  public static String getRelationSatName(final Entity entity, final Relationship relation) {
    String tablename = "";
    int _length = ((Object[])Conversions.unwrapArray(relation.getIdentifiyingFieldsRel(), Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      String _name = relation.getName();
      String _plus = ("r_m_" + _name);
      String _plus_1 = (_plus + "__");
      String _lowerCase = entity.getName().toLowerCase();
      String _plus_2 = (_plus_1 + _lowerCase);
      String _plus_3 = (_plus_2 + "_");
      String _lowerCase_1 = relation.getToEntity().getName().toLowerCase();
      String _plus_4 = (_plus_3 + _lowerCase_1);
      tablename = _plus_4;
    } else {
      String _name_1 = relation.getName();
      String _plus_5 = ("r_s_" + _name_1);
      String _plus_6 = (_plus_5 + "__");
      String _lowerCase_2 = entity.getName().toLowerCase();
      String _plus_7 = (_plus_6 + _lowerCase_2);
      String _plus_8 = (_plus_7 + "_");
      String _lowerCase_3 = relation.getToEntity().getName().toLowerCase();
      String _plus_9 = (_plus_8 + _lowerCase_3);
      tablename = _plus_9;
    }
    return tablename;
  }
  
  public static String getRelationLinkName(final Entity entity, final Relationship relation) {
    String tablename = "";
    String _name = relation.getName();
    String _plus = ("r_" + _name);
    String _plus_1 = (_plus + "__");
    String _lowerCase = entity.getName().toLowerCase();
    String _plus_2 = (_plus_1 + _lowerCase);
    String _plus_3 = (_plus_2 + "_");
    String _lowerCase_1 = relation.getToEntity().getName().toLowerCase();
    String _plus_4 = (_plus_3 + _lowerCase_1);
    tablename = _plus_4;
    return tablename;
  }
}
