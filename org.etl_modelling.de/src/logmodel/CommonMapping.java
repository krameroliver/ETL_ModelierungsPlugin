/**
 */
package logmodel;

import ETL_MODEL.namedelement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmodel.CommonMapping#getCommonmappinginputfields <em>Commonmappinginputfields</em>}</li>
 *   <li>{@link logmodel.CommonMapping#getCommonmappingoutputfields <em>Commonmappingoutputfields</em>}</li>
 *   <li>{@link logmodel.CommonMapping#getLogpackage <em>Logpackage</em>}</li>
 * </ul>
 *
 * @see logmodel.LogmodelPackage#getCommonMapping()
 * @model
 * @generated
 */
public interface CommonMapping extends namedelement, anotatable {
	/**
	 * Returns the value of the '<em><b>Commonmappinginputfields</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commonmappinginputfields</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getCommonMapping_Commonmappinginputfields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getCommonmappinginputfields();

	/**
	 * Returns the value of the '<em><b>Commonmappingoutputfields</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commonmappingoutputfields</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getCommonMapping_Commonmappingoutputfields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getCommonmappingoutputfields();

	/**
	 * Returns the value of the '<em><b>Logpackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logmodel.logpackage#getCommonmapping <em>Commonmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logpackage</em>' container reference.
	 * @see #setLogpackage(logpackage)
	 * @see logmodel.LogmodelPackage#getCommonMapping_Logpackage()
	 * @see logmodel.logpackage#getCommonmapping
	 * @model opposite="commonmapping" transient="false"
	 * @generated
	 */
	logpackage getLogpackage();

	/**
	 * Sets the value of the '{@link logmodel.CommonMapping#getLogpackage <em>Logpackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logpackage</em>' container reference.
	 * @see #getLogpackage()
	 * @generated
	 */
	void setLogpackage(logpackage value);

} // CommonMapping
