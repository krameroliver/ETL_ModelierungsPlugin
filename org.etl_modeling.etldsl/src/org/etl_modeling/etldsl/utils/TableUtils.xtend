package org.etl_modeling.etldsl.utils

import logmodel.Entity
import logmodel.Include
import logmodel.Relationship

class TableUtils {
	var name = "";
	var type = "";
	
	def static getMainSatName(Entity entity){
			return "s_"+entity.name.toLowerCase
	}
	
	def static getHubName(Entity entity){
			return "h_"+entity.name.toLowerCase
	}
	
	def static getIncludeName(Entity entity,Include include){
		var tablename = ""
		if(include.identifyingfields.length > 0){
			tablename= "m_"+entity.name.toLowerCase+"_"+include.name.toLowerCase
		}else{
			tablename= "s_"+entity.name.toLowerCase+"_"+include.name.toLowerCase
		}
		return tablename.toString
			
	}
	
	def static getRelationSatName(Entity entity,Relationship relation){
		var tablename = ""
		if(relation.identifiyingFieldsRel.length > 0){
			tablename= "r_m_"+relation.name.toLowerCase
		}else{
			tablename= "r_s_"+relation.name.toLowerCase
		}
		return tablename
			
	}
	
	
	def static getRelationLinkName(Entity entity,Relationship relation){
		var tablename = ""
		tablename= "r_"+relation.name.toLowerCase
		return tablename
			
	}
	
}