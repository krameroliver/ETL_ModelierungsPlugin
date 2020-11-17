/**
 */
package specmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Entity Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.ReadEntitySpecification#getSource <em>Source</em>}</li>
 *   <li>{@link specmodel.ReadEntitySpecification#isReadKeySats <em>Read Key Sats</em>}</li>
 *   <li>{@link specmodel.ReadEntitySpecification#getReadKeySatsReason <em>Read Key Sats Reason</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getReadEntitySpecification()
 * @model
 * @generated
 */
public interface ReadEntitySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getReadEntitySpecification <em>Read Entity Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Source)
	 * @see specmodel.SpecmodelPackage#getReadEntitySpecification_Source()
	 * @see specmodel.Source#getReadEntitySpecification
	 * @model opposite="readEntitySpecification" transient="false"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link specmodel.ReadEntitySpecification#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Read Key Sats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Key Sats</em>' attribute.
	 * @see #setReadKeySats(boolean)
	 * @see specmodel.SpecmodelPackage#getReadEntitySpecification_ReadKeySats()
	 * @model
	 * @generated
	 */
	boolean isReadKeySats();

	/**
	 * Sets the value of the '{@link specmodel.ReadEntitySpecification#isReadKeySats <em>Read Key Sats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Key Sats</em>' attribute.
	 * @see #isReadKeySats()
	 * @generated
	 */
	void setReadKeySats(boolean value);

	/**
	 * Returns the value of the '<em><b>Read Key Sats Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Key Sats Reason</em>' attribute.
	 * @see #setReadKeySatsReason(String)
	 * @see specmodel.SpecmodelPackage#getReadEntitySpecification_ReadKeySatsReason()
	 * @model
	 * @generated
	 */
	String getReadKeySatsReason();

	/**
	 * Sets the value of the '{@link specmodel.ReadEntitySpecification#getReadKeySatsReason <em>Read Key Sats Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Key Sats Reason</em>' attribute.
	 * @see #getReadKeySatsReason()
	 * @generated
	 */
	void setReadKeySatsReason(String value);

} // ReadEntitySpecification
