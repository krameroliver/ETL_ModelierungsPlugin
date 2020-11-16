/**
 */
package specmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.VectorKey#getBusinessrule <em>Businessrule</em>}</li>
 *   <li>{@link specmodel.VectorKey#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getVectorKey()
 * @model
 * @generated
 */
public interface VectorKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Businessrule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getVectorkeys <em>Vectorkeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessrule</em>' container reference.
	 * @see #setBusinessrule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getVectorKey_Businessrule()
	 * @see specmodel.BusinessRule#getVectorkeys
	 * @model opposite="vectorkeys" transient="false"
	 * @generated
	 */
	BusinessRule getBusinessrule();

	/**
	 * Sets the value of the '{@link specmodel.VectorKey#getBusinessrule <em>Businessrule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Businessrule</em>' container reference.
	 * @see #getBusinessrule()
	 * @generated
	 */
	void setBusinessrule(BusinessRule value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getVectorkeys <em>Vectorkeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see specmodel.SpecmodelPackage#getVectorKey_Source()
	 * @see specmodel.Source#getVectorkeys
	 * @model opposite="vectorkeys"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link specmodel.VectorKey#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

} // VectorKey
