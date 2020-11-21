package org.etl_modeling.etldsl.utils

import logmodel.Field
import type_enum.FieldTypes

class Utils {
	def static getDataTypeString(Field field){
		switch(field.type){
			case FieldTypes.STRING: return '''VARCHAR(«field.length» )'''
			case FieldTypes.INT: return '''integer'''
			case FieldTypes.DECIMAL: return '''NUMERIC(20 ,10)'''
			case FieldTypes.DATE: return '''DATE'''
			case FieldTypes.HK: return '''CHAR(32)'''
			case FieldTypes.TIME_STAMP: return '''timestamp'''
			default: throw new IllegalStateException 
		}
	}
}