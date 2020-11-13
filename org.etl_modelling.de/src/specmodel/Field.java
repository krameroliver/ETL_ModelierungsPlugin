/**
 */
package specmodel;

import ETL_MODEL.namedelement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.Field#getEntity <em>Entity</em>}</li>
 *   <li>{@link specmodel.Field#getReferenceEntity <em>Reference Entity</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends namedelement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getField_Entity()
	 * @see specmodel.Entity#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link specmodel.Field#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Reference Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Entity</em>' reference.
	 * @see #setReferenceEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getField_ReferenceEntity()
	 * @model
	 * @generated
	 */
	Entity getReferenceEntity();

	/**
	 * Sets the value of the '{@link specmodel.Field#getReferenceEntity <em>Reference Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Entity</em>' reference.
	 * @see #getReferenceEntity()
	 * @generated
	 */
	void setReferenceEntity(Entity value);

} // Field
