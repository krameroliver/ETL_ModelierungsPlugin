/**
 */
package jobnetz;

import ETL_MODEL.namedelement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobnetz.ProcessingPoint#getProcessingPointType <em>Processing Point Type</em>}</li>
 *   <li>{@link jobnetz.ProcessingPoint#getJobs <em>Jobs</em>}</li>
 *   <li>{@link jobnetz.ProcessingPoint#getPreDecessor <em>Pre Decessor</em>}</li>
 * </ul>
 *
 * @see jobnetz.JobnetzPackage#getProcessingPoint()
 * @model
 * @generated
 */
public interface ProcessingPoint extends namedelement {
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

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link jobnetz.Job}.
	 * It is bidirectional and its opposite is '{@link jobnetz.Job#getProcessingpoint <em>Processingpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see jobnetz.JobnetzPackage#getProcessingPoint_Jobs()
	 * @see jobnetz.Job#getProcessingpoint
	 * @model opposite="processingpoint" containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Pre Decessor</b></em>' reference list.
	 * The list contents are of type {@link jobnetz.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Decessor</em>' reference list.
	 * @see jobnetz.JobnetzPackage#getProcessingPoint_PreDecessor()
	 * @model
	 * @generated
	 */
	EList<Job> getPreDecessor();

} // ProcessingPoint
