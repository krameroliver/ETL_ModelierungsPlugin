package org.etl_modeling.etldsl.generator.Abinitio.PSET

import logmodel.Relationship
import logmodel.Entity
import logmodel.Include
import java.util.ArrayList

class PsetHelper {
	
	 
	
	def GenReadentityInputPset(Entity entity)
	'''
	[record
	entity_name "«entity.name.toLowerCase»"
	entity_type ""
	layer_type "BITEMPORAL"
	entity_desc [record
	main_table_description  [record
	table_name         "h_«entity.name.toLowerCase»"
	historization_type "BITEMPORAL"
	tkey_fields        [vector "«entity.name.toLowerCase»_hk"]
	bkey_fields        [vector «FOR bkf : entity.entityField»«IF bkf.isIsBusinessKey»"«bkf.name»",«ENDIF»«ENDFOR»]
	table_relations    [vector
	«entity.TableRecordJoind»
	]]
	partner_table_descriptions [vector
	«entity.partner_tableRecordJoind»
	]]]
	
	'''
	
	def partner_table_descriptions(String entity_name,String table_name)
	'''
	[record
	table_name "«table_name»"
	historization_type "full"
	tkey_fields [vector "«entity_name»_hk"]
	bkey_fields	NULL
	table_relations    [vector]]
	'''

	def partner_tableRecordJoind(Entity entity){
		var al = new ArrayList<String> ;
		al.add(partner_table_descriptions(entity.name.toLowerCase,"s_"+entity.name.toLowerCase).toString)
		for(include : entity.include){
			if(include.identifyingfields.length > 0){
				al.add(partner_table_descriptions(entity.name.toLowerCase,"m_"+entity.name.toLowerCase+"_"+include.name.toLowerCase).toString())
			}else{
			al.add(partner_table_descriptions(entity.name.toLowerCase,"s_"+entity.name.toLowerCase+"_"+include.name.toLowerCase).toString())
				
			}			
		}
		return al.join(",")
		
	}

	
	
	def Tablerecord(String name,String origin_field, String partner_field)
	'''
	[record
	partner_table "«name»"
	join_condition     "INNER JOIN"
	related_fields_vec [vector
	                          [record
	                           origin_field  "«origin_field»"
	                           partner_field "«partner_field»"
	]]]
	'''
	def TableRecordJoind(Entity entity){
		var al = new ArrayList<String> ;
		al.add(Tablerecord("s_"+entity.name.toLowerCase,entity.name.toLowerCase+"_hk",entity.name.toLowerCase+"_hk").toString)
		for(include : entity.include){
			if(include.identifyingfields.length > 0){
				al.add(Tablerecord("m_"+entity.name.toLowerCase+"_"+include.name.toLowerCase,entity.name.toLowerCase+"_hk",entity.name.toLowerCase+"_hk").toString())
			}else{
			al.add(Tablerecord("s_"+entity.name.toLowerCase+"_"+include.name.toLowerCase,entity.name.toLowerCase+"_hk",entity.name.toLowerCase+"_hk").toString())
				
			}			
		}
		return al.join(",")
		
	}
	
	
	def BuildBusinessKeys(Entity entity){
		var bk_fields = new ArrayList<String>
		for(field : entity.entityField){
			if(field.isIsBusinessKey){
				bk_fields.add('"'+field.name.toLowerCase+'"')
			}
		}
		return bk_fields.join(",")
	}
	
	def BuildIdentifyingKeys(Relationship rel){
		var bk_fields = new ArrayList<String>
		for(field : rel.identifiyingFieldsRel){
			bk_fields.add('"'+field.name.toLowerCase+'"')
		}
		return bk_fields.join(",")
	}
	
	def BasicEntityPsets(Entity entity)
	'''
	[record
	«entity.name.toLowerCase» [record
	entity_name "«entity.name.toLowerCase»"
	hub_name    "h_«entity.name.toLowerCase»"
	sat_name    "s_«entity.name.toLowerCase»"
	tech_keys   [vector "«entity.name.toLowerCase»_hk"]
	business_keys [vector «entity.BuildBusinessKeys»]
	]]
	'''
	
	def IncludeEntityPsets(Include include,Entity entity)
	'''
	[record 
	«include.name.toLowerCase» [record
	entity_name "«include.name.toLowerCase»"
	hub_name    "h_«entity.name.toLowerCase»"
	«IF include.identifyingfields.length > 0»
	sat_name    "m_«entity.name.toLowerCase»_«include.name.toLowerCase»"
	«ELSE»
	sat_name    "s_«entity.name.toLowerCase»_«include.name.toLowerCase»"
	«ENDIF»
	tech_keys   [vector "«entity.name.toLowerCase»_hk"]
	business_keys [vector «entity.BuildBusinessKeys»]
	]]
	'''
	
	def LinkEntityPsets(Relationship relationship,Entity entity)
	'''
	[record
	«relationship.name.toLowerCase» [record
	entity_name "«relationship.name.toLowerCase»"
	hub_name    "r_«relationship.name.toLowerCase»_«entity.name.toLowerCase»_«relationship.toEntity.name.toLowerCase»"
	«IF relationship.identifiyingFieldsRel.length > 0»
	sat_name    "r_m_«relationship.name.toLowerCase»_«entity.name.toLowerCase»_«relationship.toEntity.name.toLowerCase»"
	«ELSE»
	sat_name    "r_s_«relationship.name.toLowerCase»_«entity.name.toLowerCase»_«relationship.toEntity.name.toLowerCase»"
	«ENDIF»
	tech_keys   [vector "«relationship.name.toLowerCase»_hk"]
	business_keys [vector «relationship.BuildIdentifyingKeys»]
	]]
	'''
	
	
	
}