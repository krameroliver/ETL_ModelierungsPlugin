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
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getReadEntitySpecification()
 * @model
 * @generated
 */
public interface ReadEntitySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getReadEntitySpecification <em>Read Entity Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see specmodel.SpecmodelPackage#getReadEntitySpecification_Source()
	 * @see specmodel.Source#getReadEntitySpecification
	 * @model opposite="readEntitySpecification"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link specmodel.ReadEntitySpecification#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

} // ReadEntitySpecification
