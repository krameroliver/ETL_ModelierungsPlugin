/**
 */
package specmodel;

import logmodel.Field;

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
 *   <li>{@link specmodel.Filter#getField <em>Field</em>}</li>
 *   <li>{@link specmodel.Filter#getPreFilterBusinessRule <em>Pre Filter Business Rule</em>}</li>
 *   <li>{@link specmodel.Filter#getPostFilterBusinessRule <em>Post Filter Business Rule</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see specmodel.SpecmodelPackage#getFilter_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link specmodel.Filter#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Pre Filter Business Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getPreFilter <em>Pre Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Filter Business Rule</em>' container reference.
	 * @see #setPreFilterBusinessRule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getFilter_PreFilterBusinessRule()
	 * @see specmodel.BusinessRule#getPreFilter
	 * @model opposite="preFilter" transient="false"
	 * @generated
	 */
	BusinessRule getPreFilterBusinessRule();

	/**
	 * Sets the value of the '{@link specmodel.Filter#getPreFilterBusinessRule <em>Pre Filter Business Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Filter Business Rule</em>' container reference.
	 * @see #getPreFilterBusinessRule()
	 * @generated
	 */
	void setPreFilterBusinessRule(BusinessRule value);

	/**
	 * Returns the value of the '<em><b>Post Filter Business Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getPostFilter <em>Post Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Filter Business Rule</em>' container reference.
	 * @see #setPostFilterBusinessRule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getFilter_PostFilterBusinessRule()
	 * @see specmodel.BusinessRule#getPostFilter
	 * @model opposite="postFilter" transient="false"
	 * @generated
	 */
	BusinessRule getPostFilterBusinessRule();

	/**
	 * Sets the value of the '{@link specmodel.Filter#getPostFilterBusinessRule <em>Post Filter Business Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Filter Business Rule</em>' container reference.
	 * @see #getPostFilterBusinessRule()
	 * @generated
	 */
	void setPostFilterBusinessRule(BusinessRule value);

} // Filter
