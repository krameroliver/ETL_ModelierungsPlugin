/**
 */
package specmodel;

import ETL_MODEL.namedelement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.Specification#getSpecpackage <em>Specpackage</em>}</li>
 *   <li>{@link specmodel.Specification#getBusinessrules <em>Businessrules</em>}</li>
 *   <li>{@link specmodel.Specification#getPrimarySource <em>Primary Source</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends namedelement {
	/**
	 * Returns the value of the '<em><b>Specpackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.SpecPackage#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specpackage</em>' container reference.
	 * @see #setSpecpackage(SpecPackage)
	 * @see specmodel.SpecmodelPackage#getSpecification_Specpackage()
	 * @see specmodel.SpecPackage#getSpecification
	 * @model opposite="specification" transient="false"
	 * @generated
	 */
	SpecPackage getSpecpackage();

	/**
	 * Sets the value of the '{@link specmodel.Specification#getSpecpackage <em>Specpackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specpackage</em>' container reference.
	 * @see #getSpecpackage()
	 * @generated
	 */
	void setSpecpackage(SpecPackage value);

	/**
	 * Returns the value of the '<em><b>Businessrules</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.BusinessRule}.
	 * It is bidirectional and its opposite is '{@link specmodel.BusinessRule#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessrules</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getSpecification_Businessrules()
	 * @see specmodel.BusinessRule#getSpecification
	 * @model opposite="specification" containment="true"
	 * @generated
	 */
	EList<BusinessRule> getBusinessrules();

	/**
	 * Returns the value of the '<em><b>Primary Source</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Source}.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Source</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getSpecification_PrimarySource()
	 * @see specmodel.Source#getSpecification
	 * @model opposite="specification" containment="true"
	 * @generated
	 */
	EList<Source> getPrimarySource();

} // Specification
