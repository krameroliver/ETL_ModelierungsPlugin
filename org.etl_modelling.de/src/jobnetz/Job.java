/**
 */
package jobnetz;

import ETL_MODEL.namedelement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jobnetz.Job#getJob <em>Job</em>}</li>
 *   <li>{@link jobnetz.Job#getPreDecessor <em>Pre Decessor</em>}</li>
 *   <li>{@link jobnetz.Job#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link jobnetz.Job#getJobType <em>Job Type</em>}</li>
 *   <li>{@link jobnetz.Job#isIsTestJob <em>Is Test Job</em>}</li>
 *   <li>{@link jobnetz.Job#getTECH_SYSTEM <em>TECH SYSTEM</em>}</li>
 *   <li>{@link jobnetz.Job#getExecutableName <em>Executable Name</em>}</li>
 *   <li>{@link jobnetz.Job#getProcessingpoint <em>Processingpoint</em>}</li>
 *   <li>{@link jobnetz.Job#getPpPreDecessorprocessingpoint <em>Pp Pre Decessorprocessingpoint</em>}</li>
 * </ul>
 *
 * @see jobnetz.JobnetzPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends namedelement {
	/**
	 * Returns the value of the '<em><b>Processingpoint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jobnetz.ProcessingPoint#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingpoint</em>' container reference.
	 * @see #setProcessingpoint(ProcessingPoint)
	 * @see jobnetz.JobnetzPackage#getJob_Processingpoint()
	 * @see jobnetz.ProcessingPoint#getJobs
	 * @model opposite="jobs" transient="false"
	 * @generated
	 */
	ProcessingPoint getProcessingpoint();

	/**
	 * Sets the value of the '{@link jobnetz.Job#getProcessingpoint <em>Processingpoint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingpoint</em>' container reference.
	 * @see #getProcessingpoint()
	 * @generated
	 */
	void setProcessingpoint(ProcessingPoint value);

	/**
	 * Returns the value of the '<em><b>Pp Pre Decessorprocessingpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pp Pre Decessorprocessingpoint</em>' reference.
	 * @see #setPpPreDecessorprocessingpoint(ProcessingPoint)
	 * @see jobnetz.JobnetzPackage#getJob_PpPreDecessorprocessingpoint()
	 * @model
	 * @generated
	 */
	ProcessingPoint getPpPreDecessorprocessingpoint();

	/**
	 * Sets the value of the '{@link jobnetz.Job#getPpPreDecessorprocessingpoint <em>Pp Pre Decessorprocessingpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pp Pre Decessorprocessingpoint</em>' reference.
	 * @see #getPpPreDecessorprocessingpoint()
	 * @generated
	 */
	void setPpPreDecessorprocessingpoint(ProcessingPoint value);

	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jobnetz.Job#getPreDecessor <em>Pre Decessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(Job)
	 * @see jobnetz.JobnetzPackage#getJob_Job()
	 * @see jobnetz.Job#getPreDecessor
	 * @model opposite="preDecessor"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link jobnetz.Job#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

	/**
	 * Returns the value of the '<em><b>Pre Decessor</b></em>' reference list.
	 * The list contents are of type {@link jobnetz.Job}.
	 * It is bidirectional and its opposite is '{@link jobnetz.Job#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Decessor</em>' reference list.
	 * @see jobnetz.JobnetzPackage#getJob_PreDecessor()
	 * @see jobnetz.Job#getJob
	 * @model opposite="job"
	 * @generated
	 */
	EList<Job> getPreDecessor();

	/**
	 * Returns the value of the '<em><b>Run Time</b></em>' attribute.
	 * The literals are from the enumeration {@link jobnetz.RunningTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Time</em>' attribute.
	 * @see jobnetz.RunningTime
	 * @see #setRunTime(RunningTime)
	 * @see jobnetz.JobnetzPackage#getJob_RunTime()
	 * @model
	 * @generated
	 */
	RunningTime getRunTime();

	/**
	 * Sets the value of the '{@link jobnetz.Job#getRunTime <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Time</em>' attribute.
	 * @see jobnetz.RunningTime
	 * @see #getRunTime()
	 * @generated
	 */
	void setRunTime(RunningTime value);

	/**
	 * Returns the value of the '<em><b>Job Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jobnetz.JobType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Type</em>' attribute.
	 * @see jobnetz.JobType
	 * @see #setJobType(JobType)
	 * @see jobnetz.JobnetzPackage#getJob_JobType()
	 * @model
	 * @generated
	 */
	JobType getJobType();

	/**
	 * Sets the value of the '{@link jobnetz.Job#getJobType <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Type</em>' attribute.
	 * @see jobnetz.JobType
	 * @see #getJobType()
	 * @generated
	 */
	void setJobType(JobType value);

	/**
	 * Returns the value of the '<em><b>Is Test Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Test Job</em>' attribute.
	 * @see #setIsTestJob(boolean)
	 * @see jobnetz.JobnetzPackage#getJob_IsTestJob()
	 * @model
	 * @generated
	 */
	boolean isIsTestJob();

	/**
	 * Sets the value of the '{@link jobnetz.Job#isIsTestJob <em>Is Test Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Test Job</em>' attribute.
	 * @see #isIsTestJob()
	 * @generated
	 */
	void setIsTestJob(boolean value);

	/**
	 * Returns the value of the '<em><b>TECH SYSTEM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TECH SYSTEM</em>' attribute.
	 * @see #setTECH_SYSTEM(String)
	 * @see jobnetz.JobnetzPackage#getJob_TECH_SYSTEM()
	 * @model
	 * @generated
	 */
	String getTECH_SYSTEM();

	/**
	 * Sets the value of the '{@link jobnetz.Job#getTECH_SYSTEM <em>TECH SYSTEM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TECH SYSTEM</em>' attribute.
	 * @see #getTECH_SYSTEM()
	 * @generated
	 */
	void setTECH_SYSTEM(String value);

	/**
	 * Returns the value of the '<em><b>Executable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Name</em>' attribute.
	 * @see #setExecutableName(String)
	 * @see jobnetz.JobnetzPackage#getJob_ExecutableName()
	 * @model
	 * @generated
	 */
	String getExecutableName();

	/**
	 * Sets the value of the '{@link jobnetz.Job#getExecutableName <em>Executable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable Name</em>' attribute.
	 * @see #getExecutableName()
	 * @generated
	 */
	void setExecutableName(String value);

} // Job
