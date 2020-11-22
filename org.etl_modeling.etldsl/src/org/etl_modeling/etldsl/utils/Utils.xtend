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
	
	def static getDMLDataTypeString(Field field){
		switch(field.type){
			case FieldTypes.STRING: return '''string("\x01")'''
			case FieldTypes.INT: return '''decimal('\x01',0)'''
			case FieldTypes.DECIMAL: return '''decimal('\x01',20.10)'''
			case FieldTypes.DATE: return '''date("YYYY-MM-DD")'''
			case FieldTypes.HK: return '''string("\x01")'''
			case FieldTypes.TIME_STAMP: return '''datetime("YYYY-MM-DD HH24:MI:SS")'''
			default: throw new IllegalStateException 
		}
	}
}