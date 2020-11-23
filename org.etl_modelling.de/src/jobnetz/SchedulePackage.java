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
 *   <li>{@link jobnetz.SchedulePackage#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see jobnetz.JobnetzPackage#getSchedulePackage()
 * @model
 * @generated
 */
public interface SchedulePackage extends ETL_MODEL.Package {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link jobnetz.Job}.
	 * It is bidirectional and its opposite is '{@link jobnetz.Job#getSchedulepackage <em>Schedulepackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see jobnetz.JobnetzPackage#getSchedulePackage_Jobs()
	 * @see jobnetz.Job#getSchedulepackage
	 * @model opposite="schedulepackage" containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

} // SchedulePackage
