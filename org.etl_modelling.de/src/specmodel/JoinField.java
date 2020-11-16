/**
 */
package specmodel;

import logmodel.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.JoinField#getParentSource <em>Parent Source</em>}</li>
 *   <li>{@link specmodel.JoinField#getChildSource <em>Child Source</em>}</li>
 *   <li>{@link specmodel.JoinField#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getJoinField()
 * @model
 * @generated
 */
public interface JoinField extends Field {
	/**
	 * Returns the value of the '<em><b>Parent Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getParentJoinFields <em>Parent Join Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Source</em>' container reference.
	 * @see #setParentSource(Source)
	 * @see specmodel.SpecmodelPackage#getJoinField_ParentSource()
	 * @see specmodel.Source#getParentJoinFields
	 * @model opposite="parentJoinFields" transient="false"
	 * @generated
	 */
	Source getParentSource();

	/**
	 * Sets the value of the '{@link specmodel.JoinField#getParentSource <em>Parent Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Source</em>' container reference.
	 * @see #getParentSource()
	 * @generated
	 */
	void setParentSource(Source value);

	/**
	 * Returns the value of the '<em><b>Child Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getChildJoinField <em>Child Join Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Source</em>' container reference.
	 * @see #setChildSource(Source)
	 * @see specmodel.SpecmodelPackage#getJoinField_ChildSource()
	 * @see specmodel.Source#getChildJoinField
	 * @model opposite="childJoinField" transient="false"
	 * @generated
	 */
	Source getChildSource();

	/**
	 * Sets the value of the '{@link specmodel.JoinField#getChildSource <em>Child Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Source</em>' container reference.
	 * @see #getChildSource()
	 * @generated
	 */
	void setChildSource(Source value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see specmodel.SpecmodelPackage#getJoinField_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link specmodel.JoinField#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // JoinField
