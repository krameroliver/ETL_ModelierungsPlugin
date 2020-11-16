/**
 */
package logmodel;

import ETL_MODEL.namedelement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmodel.Relationship#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link logmodel.Relationship#getToEntity <em>To Entity</em>}</li>
 *   <li>{@link logmodel.Relationship#getIdentifiyingFieldsRel <em>Identifiying Fields Rel</em>}</li>
 *   <li>{@link logmodel.Relationship#getDescribingFieldsRel <em>Describing Fields Rel</em>}</li>
 *   <li>{@link logmodel.Relationship#getDescribingfields <em>Describingfields</em>}</li>
 *   <li>{@link logmodel.Relationship#getEntity <em>Entity</em>}</li>
 *   <li>{@link logmodel.Relationship#getRelationshipAlias <em>Relationship Alias</em>}</li>
 * </ul>
 *
 * @see logmodel.LogmodelPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends namedelement {
	/**
	 * Returns the value of the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Entity</em>' reference.
	 * @see #setFromEntity(Entity)
	 * @see logmodel.LogmodelPackage#getRelationship_FromEntity()
	 * @model
	 * @generated
	 */
	Entity getFromEntity();

	/**
	 * Sets the value of the '{@link logmodel.Relationship#getFromEntity <em>From Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Entity</em>' reference.
	 * @see #getFromEntity()
	 * @generated
	 */
	void setFromEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Entity</em>' reference.
	 * @see #setToEntity(Entity)
	 * @see logmodel.LogmodelPackage#getRelationship_ToEntity()
	 * @model
	 * @generated
	 */
	Entity getToEntity();

	/**
	 * Sets the value of the '{@link logmodel.Relationship#getToEntity <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Entity</em>' reference.
	 * @see #getToEntity()
	 * @generated
	 */
	void setToEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Identifiying Fields Rel</b></em>' reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiying Fields Rel</em>' reference list.
	 * @see logmodel.LogmodelPackage#getRelationship_IdentifiyingFieldsRel()
	 * @model
	 * @generated
	 */
	EList<Field> getIdentifiyingFieldsRel();

	/**
	 * Returns the value of the '<em><b>Describing Fields Rel</b></em>' reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describing Fields Rel</em>' reference list.
	 * @see logmodel.LogmodelPackage#getRelationship_DescribingFieldsRel()
	 * @model
	 * @generated
	 */
	EList<Field> getDescribingFieldsRel();

	/**
	 * Returns the value of the '<em><b>Describingfields</b></em>' reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describingfields</em>' reference list.
	 * @see logmodel.LogmodelPackage#getRelationship_Describingfields()
	 * @model
	 * @generated
	 */
	EList<Field> getDescribingfields();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logmodel.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see logmodel.LogmodelPackage#getRelationship_Entity()
	 * @see logmodel.Entity#getRelationships
	 * @model opposite="relationships" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link logmodel.Relationship#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Relationship Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Alias</em>' attribute.
	 * @see #setRelationshipAlias(String)
	 * @see logmodel.LogmodelPackage#getRelationship_RelationshipAlias()
	 * @model
	 * @generated
	 */
	String getRelationshipAlias();

	/**
	 * Sets the value of the '{@link logmodel.Relationship#getRelationshipAlias <em>Relationship Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Alias</em>' attribute.
	 * @see #getRelationshipAlias()
	 * @generated
	 */
	void setRelationshipAlias(String value);

} // Relationship
