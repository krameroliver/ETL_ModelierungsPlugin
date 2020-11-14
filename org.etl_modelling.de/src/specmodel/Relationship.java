/**
 */
package specmodel;

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
 *   <li>{@link specmodel.Relationship#getEntity <em>Entity</em>}</li>
 *   <li>{@link specmodel.Relationship#getToEntity <em>To Entity</em>}</li>
 *   <li>{@link specmodel.Relationship#getIdentifyingFields <em>Identifying Fields</em>}</li>
 *   <li>{@link specmodel.Relationship#getDescribingFields <em>Describing Fields</em>}</li>
 *   <li>{@link specmodel.Relationship#getRelationshipAlias <em>Relationship Alias</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends namedelement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getRelationship_Entity()
	 * @see specmodel.Entity#getRelationships
	 * @model opposite="relationships" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link specmodel.Relationship#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Entity</em>' reference.
	 * @see #setToEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getRelationship_ToEntity()
	 * @model
	 * @generated
	 */
	Entity getToEntity();

	/**
	 * Sets the value of the '{@link specmodel.Relationship#getToEntity <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Entity</em>' reference.
	 * @see #getToEntity()
	 * @generated
	 */
	void setToEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Identifying Fields</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Fields</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getRelationship_IdentifyingFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getIdentifyingFields();

	/**
	 * Returns the value of the '<em><b>Describing Fields</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describing Fields</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getRelationship_DescribingFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getDescribingFields();

	/**
	 * Returns the value of the '<em><b>Relationship Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Alias</em>' attribute.
	 * @see #setRelationshipAlias(String)
	 * @see specmodel.SpecmodelPackage#getRelationship_RelationshipAlias()
	 * @model
	 * @generated
	 */
	String getRelationshipAlias();

	/**
	 * Sets the value of the '{@link specmodel.Relationship#getRelationshipAlias <em>Relationship Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Alias</em>' attribute.
	 * @see #getRelationshipAlias()
	 * @generated
	 */
	void setRelationshipAlias(String value);

} // Relationship
