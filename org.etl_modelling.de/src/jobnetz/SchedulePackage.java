/**
 */
package jobnetz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobnetz.SchedulePackage#getProcessingpoint <em>Processingpoint</em>}</li>
 *   <li>{@link jobnetz.SchedulePackage#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see jobnetz.JobnetzPackage#getSchedulePackage()
 * @model
 * @generated
 */
public interface SchedulePackage extends ETL_MODEL.Package {
	/**
	 * Returns the value of the '<em><b>Processingpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingpoint</em>' containment reference.
	 * @see #setProcessingpoint(ProcessingPoint)
	 * @see jobnetz.JobnetzPackage#getSchedulePackage_Processingpoint()
	 * @model containment="true"
	 * @generated
	 */
	ProcessingPoint getProcessingpoint();

	/**
	 * Sets the value of the '{@link jobnetz.SchedulePackage#getProcessingpoint <em>Processingpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingpoint</em>' containment reference.
	 * @see #getProcessingpoint()
	 * @generated
	 */
	void setProcessingpoint(ProcessingPoint value);

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link jobnetz.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see jobnetz.JobnetzPackage#getSchedulePackage_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

} // SchedulePackage
