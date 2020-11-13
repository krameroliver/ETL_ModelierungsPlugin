/**
 */
package specmodel;

import ETL_MODEL.namedelement;

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
 *   <li>{@link specmodel.BusinessRule#getPostDedup <em>Post Dedup</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getPreDedup <em>Pre Dedup</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getVectorkeys <em>Vectorkeys</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getRelationshipTargetEntity <em>Relationship Target Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetParentEntity <em>Target Parent Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getLookupEntities <em>Lookup Entities</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getRelationshipSourceEntity <em>Relationship Source Entity</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getRuletype <em>Ruletype</em>}</li>
 *   <li>{@link specmodel.BusinessRule#isRelationshipTargetEntityUseHashKey <em>Relationship Target Entity Use Hash Key</em>}</li>
 *   <li>{@link specmodel.BusinessRule#isRelationshipSourceEntityUseHashKey <em>Relationship Source Entity Use Hash Key</em>}</li>
 *   <li>{@link specmodel.BusinessRule#isTargetEntityUseHashKey <em>Target Entity Use Hash Key</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link specmodel.BusinessRule#getSourceReleationship <em>Source Releationship</em>}</li>
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
	 * Returns the value of the '<em><b>Post Dedup</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Dedup#getPostDedupBusinessrule <em>Post Dedup Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Dedup</em>' containment reference.
	 * @see #setPostDedup(Dedup)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_PostDedup()
	 * @see specmodel.Dedup#getPostDedupBusinessrule
	 * @model opposite="postDedupBusinessrule" containment="true"
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
	 * Returns the value of the '<em><b>Pre Dedup</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Dedup#getPreDedupBusinessrule <em>Pre Dedup Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Dedup</em>' containment reference.
	 * @see #setPreDedup(Dedup)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_PreDedup()
	 * @see specmodel.Dedup#getPreDedupBusinessrule
	 * @model opposite="preDedupBusinessrule" containment="true"
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
	 * Returns the value of the '<em><b>Lookup Entities</b></em>' reference list.
	 * The list contents are of type {@link specmodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup Entities</em>' reference list.
	 * @see specmodel.SpecmodelPackage#getBusinessRule_LookupEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getLookupEntities();

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
	 * Returns the value of the '<em><b>Ruletype</b></em>' attribute.
	 * The literals are from the enumeration {@link specmodel.RuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruletype</em>' attribute.
	 * @see specmodel.RuleType
	 * @see #setRuletype(RuleType)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_Ruletype()
	 * @model
	 * @generated
	 */
	RuleType getRuletype();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getRuletype <em>Ruletype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruletype</em>' attribute.
	 * @see specmodel.RuleType
	 * @see #getRuletype()
	 * @generated
	 */
	void setRuletype(RuleType value);

	/**
	 * Returns the value of the '<em><b>Relationship Target Entity Use Hash Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Target Entity Use Hash Key</em>' attribute.
	 * @see #setRelationshipTargetEntityUseHashKey(boolean)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_RelationshipTargetEntityUseHashKey()
	 * @model
	 * @generated
	 */
	boolean isRelationshipTargetEntityUseHashKey();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#isRelationshipTargetEntityUseHashKey <em>Relationship Target Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Target Entity Use Hash Key</em>' attribute.
	 * @see #isRelationshipTargetEntityUseHashKey()
	 * @generated
	 */
	void setRelationshipTargetEntityUseHashKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Relationship Source Entity Use Hash Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Source Entity Use Hash Key</em>' attribute.
	 * @see #setRelationshipSourceEntityUseHashKey(boolean)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_RelationshipSourceEntityUseHashKey()
	 * @model
	 * @generated
	 */
	boolean isRelationshipSourceEntityUseHashKey();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#isRelationshipSourceEntityUseHashKey <em>Relationship Source Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Source Entity Use Hash Key</em>' attribute.
	 * @see #isRelationshipSourceEntityUseHashKey()
	 * @generated
	 */
	void setRelationshipSourceEntityUseHashKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Entity Use Hash Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity Use Hash Key</em>' attribute.
	 * @see #setTargetEntityUseHashKey(boolean)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_TargetEntityUseHashKey()
	 * @model
	 * @generated
	 */
	boolean isTargetEntityUseHashKey();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#isTargetEntityUseHashKey <em>Target Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Entity Use Hash Key</em>' attribute.
	 * @see #isTargetEntityUseHashKey()
	 * @generated
	 */
	void setTargetEntityUseHashKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Target Mapping Output Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Mapping Output Fields</em>' attribute.
	 * @see #setTargetMappingOutputFields(String)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_TargetMappingOutputFields()
	 * @model
	 * @generated
	 */
	String getTargetMappingOutputFields();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mapping Output Fields</em>' attribute.
	 * @see #getTargetMappingOutputFields()
	 * @generated
	 */
	void setTargetMappingOutputFields(String value);

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
	 * Returns the value of the '<em><b>Source Releationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Releationship</em>' reference.
	 * @see #setSourceReleationship(Relationship)
	 * @see specmodel.SpecmodelPackage#getBusinessRule_SourceReleationship()
	 * @model
	 * @generated
	 */
	Relationship getSourceReleationship();

	/**
	 * Sets the value of the '{@link specmodel.BusinessRule#getSourceReleationship <em>Source Releationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Releationship</em>' reference.
	 * @see #getSourceReleationship()
	 * @generated
	 */
	void setSourceReleationship(Relationship value);

} // BusinessRule
