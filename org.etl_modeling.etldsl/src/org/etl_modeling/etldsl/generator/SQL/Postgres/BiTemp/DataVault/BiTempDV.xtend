package org.etl_modeling.etldsl.generator.SQL.Postgres.BiTemp.DataVault

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.etl_modeling.etldsl.utils.Utils
import logmodel.logpackage;
import logmodel.Entity;


class BiTempDV extends AbstractGenerator {
	var rep = 0
	var hist = 0
	var layer = ""
	var package_name = 0
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for(p: input.allContents.toIterable.filter(logpackage)){
			hist = p.HISTORISATION.value;
			layer = p.LAYER.toString;
			rep = p.REPRESENTATION.value;			
		}
		
		for(entity : input.allContents.toIterable.filter(Entity)){
			if(rep == 1 && hist == 3){
				compile(entity,fsa)
				
			}
		}
	}
	
	
	def compile(Entity entity,IFileSystemAccess2 fsa){ 
		var content = ""
		content = content +createMainSats(entity)
		content = content + createHub(entity)
		//content = content + createMainSatFC(entity)
		content = content + createInclude(entity)
		//content = content + createIncludeFC(entity)
		content = content + generateRelationshipSat(entity)
		content = content + generateRelations(entity)
		val path = "sql/CreateTable/"+entity.name.toLowerCase+".sql"
		fsa.generateFile(path,content) 
	}
	
	def createMainSats(Entity entity)
	'''
	CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»(
	«FOR f : entity.entityField»
	«IF f.isFastChanging==false»
		«f.name.toLowerCase» «Utils.getDataTypeString(f)»,
	«ENDIF»
	«ENDFOR»
	creation_date DATE,
	modification_date DATE,
	
	record_source varchar(255),
	«entity.name.toLowerCase»_hk CHAR(32),
	effectiv_timerange tstzrange,
	PRIMARY KEY(«entity.name.toLowerCase»_hk,effectiv_timerange)
	);
	COMMIT;
	CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_hist (like «layer»SCHEMA_ID.s_«entity.name.toLowerCase» including all);
	CREATE TRIGGER versioning_trigger_s_«entity.name.toLowerCase» BEFORE INSERT OR UPDATE OR DELETE ON «layer»SCHEMA_ID.s_«entity.name.toLowerCase» FOR EACH ROW EXECUTE PROCEDURE versioning('effectiv_timerange', '«layer»SCHEMA_ID.s_«entity.name.toLowerCase»_hist', true);
	COMMIT;
	'''
	/* 
	«FOR f : entity.entityField»
		«IF f.isIsBusinessKey»
			«f.name.toLowerCase» «Utils.getDataTypeString(f)»,
		«ENDIF»
	«ENDFOR»
	*/
	
	def createHub(Entity entity)
	'''
	CREATE TABLE «layer»SCHEMA_ID.h_«entity.name.toLowerCase»(
	«FOR field : entity.entityField»
	«IF field.isIsBusinessKey»
	«field.name.toLowerCase» «Utils.getDataTypeString(field)»,
	«ENDIF»
	«ENDFOR»
	«entity.name.toLowerCase»_hk CHAR(32),
	PRIMARY KEY(«entity.name.toLowerCase»_hk)
	);
	COMMIT;
	'''
	
	def createMainSatFC(Entity entity)
	'''
	CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_fc(
	«FOR f : entity.entityField»
	«IF f.isFastChanging==true»
		«f.name.toLowerCase» «Utils.getDataTypeString(f)»,
	«ENDIF»
	«ENDFOR»
	creation_date DATE,
	modification_date DATE,
	record_source varchar(255),
	«entity.name.toLowerCase»_hk CHAR(32),
	effectiv_timerange tstzrange,
	PRIMARY KEY(«entity.name.toLowerCase»_hk)
	);
	COMMIT;
	CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_fc_hist (like «layer»SCHEMA_ID.s_«entity.name.toLowerCase» including all);
	CREATE TRIGGER versioning_trigger_s_«entity.name.toLowerCase»_fc BEFORE INSERT OR UPDATE OR DELETE ON «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_fc FOR EACH ROW EXECUTE PROCEDURE versioning('effectiv_timerange', '«layer»SCHEMA_ID.s_«entity.name.toLowerCase»_fc_hist', true);
	COMMIT;
	'''
	
	
	
	def createInclude(Entity entity)
	'''
	«FOR include : entity.include»
	
	«IF include.identifyingfields.length > 0»
		CREATE TABLE «layer»SCHEMA_ID.m_«entity.name.toLowerCase»_«include.name»(
		«ELSE»
		CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»(
		«ENDIF»
		«FOR f : include.identifyingfields»
			«IF !f.isIsFastChanging»
         		«f.name.toLowerCase» «Utils.getDataTypeString(f)»,
			«ENDIF»
		«ENDFOR»
	creation_date DATE,
	modification_date DATE,
	record_source varchar(255),
	«entity.name.toLowerCase»_hk CHAR(32),
	effectiv_timerange tstzrange,
	PRIMARY KEY(«entity.name.toLowerCase»_hk,effectiv_timerange)
	);
	COMMIT;
	«IF include.identifyingfields.length > 0»
		CREATE TABLE «layer»SCHEMA_ID.m_«entity.name.toLowerCase»_«include.name»_hist (like «layer»SCHEMA_ID.m_«entity.name.toLowerCase»_«include.name» including all);
		CREATE TRIGGER versioning_trigger_m_«layer»_s_«entity.name.toLowerCase»_«include.name» BEFORE INSERT OR UPDATE OR DELETE ON «layer»SCHEMA_ID.m_«entity.name.toLowerCase»_«include.name» FOR EACH ROW EXECUTE PROCEDURE versioning('effectiv_timerange', '«layer»SCHEMA_ID.m_«entity.name.toLowerCase»_«include.name»_hist', true);
	«ELSE»
		CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»_hist (like «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name» including all);
		CREATE TRIGGER versioning_trigger_«layer»_s_«entity.name.toLowerCase»_«include.name» BEFORE INSERT OR UPDATE OR DELETE ON «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name» FOR EACH ROW EXECUTE PROCEDURE versioning('effectiv_timerange', '«layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»_hist', true);
	«ENDIF»
	«ENDFOR»
	
	'''
	
	def createIncludeFC(Entity entity)
	'''
	«FOR include : entity.include»
	«IF include.identifyingfields.length > 0»
	CREATE TABLE «layer»SCHEMA_ID.m_«entity.name.toLowerCase»_«include.name»_fc(
	«ELSE»
	CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»_fc(
	«ENDIF»
		«FOR f : include.identifyingfields»
			«IF f.isIsFastChanging»
         		«f.name.toLowerCase» «Utils.getDataTypeString(f)»,
			«ENDIF»
		«ENDFOR»
	creation_date DATE,
	modification_date DATE,
	record_source varchar(255),
	«entity.name.toLowerCase»_hk CHAR(32),
	effectiv_timerange tstzrange,
	PRIMARY KEY(«entity.name.toLowerCase»_hk)
	);
	COMMIT;
	CREATE TABLE «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»_fc_hist (like «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»_fc including all);
	CREATE TRIGGER versioning_trigger_s_«layer»_s_«entity.name.toLowerCase»_«include.name»_fc BEFORE INSERT OR UPDATE OR DELETE ON «layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»_fc FOR EACH ROW EXECUTE PROCEDURE versioning('effectiv_timerange', '«layer»SCHEMA_ID.s_«entity.name.toLowerCase»_«include.name»_fc_hist', true);
	«ENDFOR»
	COMMIT;
	'''
	
	
	def generateRelations(Entity entity)
	'''
	«FOR relation : entity.relationships»
			CREATE TABLE «layer»SCHEMA_ID.r_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase»(
			«relation.name.toLowerCase»_hk CHAR(32),
			«entity.name.toLowerCase»_hk CHAR(32),
			«relation.toEntity.name.toLowerCase»_hk CHAR(32),
			PRIMARY KEY(«relation.name.toLowerCase»_hk));COMMIT;
	«ENDFOR»
	'''
	
   def generateRelationshipSat(Entity entity)
   '''
   «FOR relation : entity.relationships»
	   «IF relation.identifiyingFieldsRel.length > 0»
	CREATE TABLE «layer»SCHEMA_ID.r_m_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase»(
	   «ELSE»
	  CREATE TABLE «layer»SCHEMA_ID.r_s_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase»(
	   «ENDIF»
	
	«relation.name.toLowerCase»_hk CHAR(32),
	creation_date DATE,
	modification_date DATE,
	record_source varchar(255),
	«entity.name.toLowerCase»_hk CHAR(32),
	effectiv_timerange tstzrange,
	PRIMARY KEY(«relation.name.toLowerCase»_hk),effectiv_timerange);
	COMMIT;
		«IF relation.identifiyingFieldsRel.length > 0»
	CREATE TABLE «layer»SCHEMA_ID.r_m_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase»_hist (like «layer»SCHEMA_ID.r_m_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase» including all);
	CREATE TRIGGER versioning_trigger_«layer»_r_m_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase» BEFORE INSERT OR UPDATE OR DELETE ON «layer»SCHEMA_ID.r_m_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase» FOR EACH ROW EXECUTE PROCEDURE versioning('effectiv_timerange', '«layer»SCHEMA_ID.r_m_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase»_hist', true);
		«ELSE»
	CREATE TABLE «layer»SCHEMA_ID.r_s_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase»_hist (like «layer»SCHEMA_ID.r_s_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase» including all);
	CREATE TRIGGER versioning_trigger_«layer»_r_s_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase» BEFORE INSERT OR UPDATE OR DELETE ON «layer»SCHEMA_ID.r_s_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase» FOR EACH ROW EXECUTE PROCEDURE versioning('effectiv_timerange', '«layer»SCHEMA_ID.r_s_«relation.name.toLowerCase»_«entity.name.toLowerCase»_«relation.toEntity.name.toLowerCase»_hist', true);
		«ENDIF»	
   «ENDFOR»
   COMMIT;
   '''
	
	
	/*
	 * 
	 *    «IF relation.describingfields.length > 0»
	      «FOR f : relation.describingfields»
		     «f.name.toLowerCase» «Utils.getDataTypeString(f)»,  describing field
	      «ENDFOR»
	   «ENDIF»
	   «IF relation.identifiyingFieldsRel.length > 0»
	      «FOR f : relation.identifiyingFieldsRel»
		     «f.name.toLowerCase» «Utils.getDataTypeString(f)»,  identifiying field
	      «ENDFOR»
	   «ENDIF»
	 * 
	 */
}