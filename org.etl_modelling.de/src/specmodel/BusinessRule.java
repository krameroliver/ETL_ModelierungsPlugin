/**
 */
package specmodel;

import ETL_MODEL.namedelement;
import logmodel.CommonMapping;
import logmodel.Entity;
import logmodel.Include;
import logmodel.Relationship;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.BusinessRule#getSpecification <em>Specification</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getPreDedup <em>Pre Dedup</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getPostDedup <em>Post Dedup</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getVectorkeys <em>Vectorkeys</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getPreFilter <em>Pre Filter</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getPostFilter <em>Post Filter</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getRuleType <em>Rule Type</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getRelationshipSourceEntity <em>Relationship Source Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getRelationshipTargetEntity <em>Relationship Target Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetParentEntity <em>Target Parent Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getLookupEntities <em>Lookup Entities</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetInclude <em>Target Include</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getBusinessRule()
 * @model
 * @generated
 */
public interface BusinessRule extends namedelement {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Specification#getBusinessrules <em>Businessrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(Specification)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_Specification()
	 * @see specmodel.Specification#getBusinessrules
	 * @model opposite="businessrules" transient="false"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Pre Dedup</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Dedup#getPreDedupBusinessRule <em>Pre Dedup Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Dedup</em>' containment reference.
	 * @see #setPreDedup(Dedup)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_PreDedup()
	 * @see specmodel.Dedup#getPreDedupBusinessRule
	 * @model opposite="preDedupBusinessRule" containment="true"
	 * @generated
	 */
	Dedup getPreDedup();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getPreDedup <em>Pre Dedup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Dedup</em>' containment reference.
	 * @see #getPreDedup()
	 * @generated
	 */
	void setPreDedup(Dedup value);

	/**
	 * Returns the value of the '<em><b>Post Dedup</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Dedup#getPostDedupBusinessRule <em>Post Dedup Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Dedup</em>' containment reference.
	 * @see #setPostDedup(Dedup)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_PostDedup()
	 * @see specmodel.Dedup#getPostDedupBusinessRule
	 * @model opposite="postDedupBusinessRule" containment="true"
	 * @generated
	 */
	Dedup getPostDedup();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getPostDedup <em>Post Dedup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Dedup</em>' containment reference.
	 * @see #getPostDedup()
	 * @generated
	 */
	void setPostDedup(Dedup value);

	/**
	 * Returns the value of the '<em><b>Vectorkeys</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.VectorKey}.
	 * It is bidirectional and its opposite is '{@link specmodel.VectorKey#getBusinessrule <em>Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectorkeys</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getBusinessRule_Vectorkeys()
	 * @see specmodel.VectorKey#getBusinessrule
	 * @model opposite="businessrule" containment="true"
	 * @generated
	 */
	EList<VectorKey> getVectorkeys();

	/**
	 * Returns the value of the '<em><b>Pre Filter</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Filter#getPreFilterBusinessRule <em>Pre Filter Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Filter</em>' containment reference.
	 * @see #setPreFilter(Filter)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_PreFilter()
	 * @see specmodel.Filter#getPreFilterBusinessRule
	 * @model opposite="preFilterBusinessRule" containment="true"
	 * @generated
	 */
	Filter getPreFilter();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getPreFilter <em>Pre Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Filter</em>' containment reference.
	 * @see #getPreFilter()
	 * @generated
	 */
	void setPreFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Post Filter</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Filter#getPostFilterBusinessRule <em>Post Filter Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Filter</em>' containment reference.
	 * @see #setPostFilter(Filter)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_PostFilter()
	 * @see specmodel.Filter#getPostFilterBusinessRule
	 * @model opposite="postFilterBusinessRule" containment="true"
	 * @generated
	 */
	Filter getPostFilter();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getPostFilter <em>Post Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Filter</em>' containment reference.
	 * @see #getPostFilter()
	 * @generated
	 */
	void setPostFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Rule Type</b></em>' attribute.
	 * The literals are from the enumeration {@link specmodel.RuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Type</em>' attribute.
	 * @see specmodel.RuleType
	 * @see #setRuleType(RuleType)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_RuleType()
	 * @model
	 * @generated
	 */
	RuleType getRuleType();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getRuleType <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Type</em>' attribute.
	 * @see specmodel.RuleType
	 * @see #getRuleType()
	 * @generated
	 */
	void setRuleType(RuleType value);

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see #setTargetEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_TargetEntity()
	 * @model
	 * @generated
	 */
	Entity getTargetEntity();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getTargetEntity <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity</em>' reference.
	 * @see #getTargetEntity()
	 * @generated
	 */
	void setTargetEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Relationship Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Source Entity</em>' reference.
	 * @see #setRelationshipSourceEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_RelationshipSourceEntity()
	 * @model
	 * @generated
	 */
	Entity getRelationshipSourceEntity();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getRelationshipSourceEntity <em>Relationship Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Source Entity</em>' reference.
	 * @see #getRelationshipSourceEntity()
	 * @generated
	 */
	void setRelationshipSourceEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Relationship Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Target Entity</em>' reference.
	 * @see #setRelationshipTargetEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_RelationshipTargetEntity()
	 * @model
	 * @generated
	 */
	Entity getRelationshipTargetEntity();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getRelationshipTargetEntity <em>Relationship Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Target Entity</em>' reference.
	 * @see #getRelationshipTargetEntity()
	 * @generated
	 */
	void setRelationshipTargetEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Target Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Parent Entity</em>' reference.
	 * @see #setTargetParentEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_TargetParentEntity()
	 * @model
	 * @generated
	 */
	Entity getTargetParentEntity();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getTargetParentEntity <em>Target Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Parent Entity</em>' reference.
	 * @see #getTargetParentEntity()
	 * @generated
	 */
	void setTargetParentEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Lookup Entities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup Entities</em>' reference.
	 * @see #setLookupEntities(Entity)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_LookupEntities()
	 * @model
	 * @generated
	 */
	Entity getLookupEntities();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getLookupEntities <em>Lookup Entities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup Entities</em>' reference.
	 * @see #getLookupEntities()
	 * @generated
	 */
	void setLookupEntities(Entity value);

	/**
	 * Returns the value of the '<em><b>Target Mapping Output Fields</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Mapping Output Fields</em>' reference.
	 * @see #setTargetMappingOutputFields(CommonMapping)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_TargetMappingOutputFields()
	 * @model
	 * @generated
	 */
	CommonMapping getTargetMappingOutputFields();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mapping Output Fields</em>' reference.
	 * @see #getTargetMappingOutputFields()
	 * @generated
	 */
	void setTargetMappingOutputFields(CommonMapping value);

	/**
	 * Returns the value of the '<em><b>Target Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Relationship</em>' reference.
	 * @see #setTargetRelationship(Relationship)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_TargetRelationship()
	 * @model
	 * @generated
	 */
	Relationship getTargetRelationship();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getTargetRelationship <em>Target Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Relationship</em>' reference.
	 * @see #getTargetRelationship()
	 * @generated
	 */
	void setTargetRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Target Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Include</em>' reference.
	 * @see #setTargetInclude(Include)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_TargetInclude()
	 * @model
	 * @generated
	 */
	Include getTargetInclude();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getTargetInclude <em>Target Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Include</em>' reference.
	 * @see #getTargetInclude()
	 * @generated
	 */
	void setTargetInclude(Include value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Source}.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getBusinessrule <em>Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getBusinessRule_Sources()
	 * @see specmodel.Source#getBusinessrule
	 * @model opposite="businessrule" containment="true"
	 * @generated
	 */
	EList<Source> getSources();

} // BusinessRule
