/**
 */
package specmodel;

import logmodel.Field;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dedup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.Dedup#getPreDedupBusinessRule <em>Pre Dedup Business Rule</em>}</li>
 *   <li>{@link specmodel.Dedup#getPostDedupBusinessRule <em>Post Dedup Business Rule</em>}</li>
 *   <li>{@link specmodel.Dedup#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getDedup()
 * @model
 * @generated
 */
public interface Dedup extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Dedup Business Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getPreDedup <em>Pre Dedup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Dedup Business Rule</em>' container reference.
	 * @see #setPreDedupBusinessRule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getDedup_PreDedupBusinessRule()
	 * @see specmodel.BusinessRule#getPreDedup
	 * @model opposite="preDedup" transient="false"
	 * @generated
	 */
	BusinessRule getPreDedupBusinessRule();

	/**
	 * Sets the value of the '{@link specmodel.Dedup#getPreDedupBusinessRule <em>Pre Dedup Business Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Dedup Business Rule</em>' container reference.
	 * @see #getPreDedupBusinessRule()
	 * @generated
	 */
	void setPreDedupBusinessRule(BusinessRule value);

	/**
	 * Returns the value of the '<em><b>Post Dedup Business Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getPostDedup <em>Post Dedup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Dedup Business Rule</em>' container reference.
	 * @see #setPostDedupBusinessRule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getDedup_PostDedupBusinessRule()
	 * @see specmodel.BusinessRule#getPostDedup
	 * @model opposite="postDedup" transient="false"
	 * @generated
	 */
	BusinessRule getPostDedupBusinessRule();

	/**
	 * Sets the value of the '{@link specmodel.Dedup#getPostDedupBusinessRule <em>Post Dedup Business Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Dedup Business Rule</em>' container reference.
	 * @see #getPostDedupBusinessRule()
	 * @generated
	 */
	void setPostDedupBusinessRule(BusinessRule value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see specmodel.SpecmodelPackage#getDedup_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link specmodel.Dedup#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // Dedup
