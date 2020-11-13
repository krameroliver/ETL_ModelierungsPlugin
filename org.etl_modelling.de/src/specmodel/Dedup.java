/**
 */
package specmodel;

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
 *   <li>{@link specmodel.Dedup#getPostDedupBusinessrule <em>Post Dedup Businessrule</em>}</li>
 *   <li>{@link specmodel.Dedup#getPreDedupBusinessrule <em>Pre Dedup Businessrule</em>}</li>
 *   <li>{@link specmodel.Dedup#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getDedup()
 * @model
 * @generated
 */
public interface Dedup extends EObject {
	/**
	 * Returns the value of the '<em><b>Post Dedup Businessrule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getPostDedup <em>Post Dedup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Dedup Businessrule</em>' container reference.
	 * @see #setPostDedupBusinessrule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getDedup_PostDedupBusinessrule()
	 * @see specmodel.BusinessRule#getPostDedup
	 * @model opposite="postDedup" transient="false"
	 * @generated
	 */
	BusinessRule getPostDedupBusinessrule();

	/**
	 * Sets the value of the '{@link specmodel.Dedup#getPostDedupBusinessrule <em>Post Dedup Businessrule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Dedup Businessrule</em>' container reference.
	 * @see #getPostDedupBusinessrule()
	 * @generated
	 */
	void setPostDedupBusinessrule(BusinessRule value);

	/**
	 * Returns the value of the '<em><b>Pre Dedup Businessrule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getPreDedup <em>Pre Dedup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Dedup Businessrule</em>' container reference.
	 * @see #setPreDedupBusinessrule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getDedup_PreDedupBusinessrule()
	 * @see specmodel.BusinessRule#getPreDedup
	 * @model opposite="preDedup" transient="false"
	 * @generated
	 */
	BusinessRule getPreDedupBusinessrule();

	/**
	 * Sets the value of the '{@link specmodel.Dedup#getPreDedupBusinessrule <em>Pre Dedup Businessrule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Dedup Businessrule</em>' container reference.
	 * @see #getPreDedupBusinessrule()
	 * @generated
	 */
	void setPreDedupBusinessrule(BusinessRule value);

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
