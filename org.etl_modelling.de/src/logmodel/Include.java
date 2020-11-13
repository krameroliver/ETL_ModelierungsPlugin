/**
 */
package logmodel;

import ETL_MODEL.namedelement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmodel.Include#getIncludeFields <em>Include Fields</em>}</li>
 *   <li>{@link logmodel.Include#getIdentifyingfields <em>Identifyingfields</em>}</li>
 *   <li>{@link logmodel.Include#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see logmodel.LogmodelPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends namedelement {
	/**
	 * Returns the value of the '<em><b>Include Fields</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * It is bidirectional and its opposite is '{@link logmodel.Field#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Fields</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getInclude_IncludeFields()
	 * @see logmodel.Field#getInclude
	 * @model opposite="include" containment="true"
	 * @generated
	 */
	EList<Field> getIncludeFields();

	/**
	 * Returns the value of the '<em><b>Identifyingfields</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifyingfields</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getInclude_Identifyingfields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getIdentifyingfields();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logmodel.Entity#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see logmodel.LogmodelPackage#getInclude_Entity()
	 * @see logmodel.Entity#getInclude
	 * @model opposite="include" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link logmodel.Include#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Include
