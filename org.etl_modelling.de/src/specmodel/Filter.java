/**
 */
package specmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.Filter#getFilterField <em>Filter Field</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Field</em>' reference.
	 * @see #setFilterField(Field)
	 * @see specmodel.SpecmodelPackage#getFilter_FilterField()
	 * @model
	 * @generated
	 */
	Field getFilterField();

	/**
	 * Sets the value of the '{@link specmodel.Filter#getFilterField <em>Filter Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Field</em>' reference.
	 * @see #getFilterField()
	 * @generated
	 */
	void setFilterField(Field value);

} // Filter
