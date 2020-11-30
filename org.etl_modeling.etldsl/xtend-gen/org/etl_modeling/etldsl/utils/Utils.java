package org.etl_modeling.etldsl.utils;

import logmodel.Field;
import org.eclipse.xtend2.lib.StringConcatenation;
import type_enum.FieldTypes;

@SuppressWarnings("all")
public class Utils {
  public static String getDataTypeString(final Field field) {
    FieldTypes _type = field.getType();
    if (_type != null) {
      switch (_type) {
        case STRING:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("VARCHAR(");
          int _length = field.getLength();
          _builder.append(_length);
          _builder.append(" )");
          return _builder.toString();
        case INT:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("integer");
          return _builder_1.toString();
        case DECIMAL:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("NUMERIC(20 ,10)");
          return _builder_2.toString();
        case DATE:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("DATE");
          return _builder_3.toString();
        case HK:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("CHAR(32)");
          return _builder_4.toString();
        case TIME_STAMP:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("timestamp");
          return _builder_5.toString();
        default:
          throw new IllegalStateException();
      }
    } else {
      throw new IllegalStateException();
    }
  }
  
  public static String getDMLDataTypeString(final Field field) {
    FieldTypes _type = field.getType();
    if (_type != null) {
      switch (_type) {
        case STRING:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("string(\"\\x01\")");
          return _builder.toString();
        case INT:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("decimal(\'\\x01\',0)");
          return _builder_1.toString();
        case DECIMAL:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("decimal(\"\\X01\",maximum_length=20)");
          return _builder_2.toString();
        case DATE:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("date(\"YYYY-MM-DD\")");
          return _builder_3.toString();
        case HK:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("string(\"\\x01\")");
          return _builder_4.toString();
        case TIME_STAMP:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("datetime(\"YYYY-MM-DD HH24:MI:SS\")");
          return _builder_5.toString();
        default:
          throw new IllegalStateException();
      }
    } else {
      throw new IllegalStateException();
    }
  }
}
