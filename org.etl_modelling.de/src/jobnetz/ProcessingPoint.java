/**
 */
package jobnetz;

import ETL_MODEL.namedelement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobnetz.ProcessingPoint#getJob <em>Job</em>}</li>
 *   <li>{@link jobnetz.ProcessingPoint#getProcessingPointType <em>Processing Point Type</em>}</li>
 * </ul>
 *
 * @see jobnetz.JobnetzPackage#getProcessingPoint()
 * @model
 * @generated
 */
public interface ProcessingPoint extends namedelement {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jobnetz.Job#getProcessingpoint <em>Processingpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' container reference.
	 * @see #setJob(Job)
	 * @see jobnetz.JobnetzPackage#getProcessingPoint_Job()
	 * @see jobnetz.Job#getProcessingpoint
	 * @model opposite="processingpoint" transient="false"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link jobnetz.ProcessingPoint#getJob <em>Job</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' container reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

	/**
	 * Returns the value of the '<em><b>Processing Point Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jobnetz.ProcessingPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Point Type</em>' attribute.
	 * @see jobnetz.ProcessingPointType
	 * @see #setProcessingPointType(ProcessingPointType)
	 * @see jobnetz.JobnetzPackage#getProcessingPoint_ProcessingPointType()
	 * @model
	 * @generated
	 */
	ProcessingPointType getProcessingPointType();

	/**
	 * Sets the value of the '{@link jobnetz.ProcessingPoint#getProcessingPointType <em>Processing Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Point Type</em>' attribute.
	 * @see jobnetz.ProcessingPointType
	 * @see #getProcessingPointType()
	 * @generated
	 */
	void setProcessingPointType(ProcessingPointType value);

} // ProcessingPoint
