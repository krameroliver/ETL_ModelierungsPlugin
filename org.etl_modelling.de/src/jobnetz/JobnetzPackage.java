/**
 */
package jobnetz;

import ETL_MODEL.ETL_MODELPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jobnetz.JobnetzFactory
 * @model kind="package"
 * @generated
 */
public interface JobnetzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobnetz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/jobnetz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jobnetz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobnetzPackage eINSTANCE = jobnetz.impl.JobnetzPackageImpl.init();

	/**
	 * The meta object id for the '{@link jobnetz.impl.SchedulePackageImpl <em>Schedule Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jobnetz.impl.SchedulePackageImpl
	 * @see jobnetz.impl.JobnetzPackageImpl#getSchedulePackage()
	 * @generated
	 */
	int SCHEDULE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE__NAME = ETL_MODELPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>LAYER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE__LAYER = ETL_MODELPackage.PACKAGE__LAYER;

	/**
	 * The feature id for the '<em><b>LAYER TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE__LAYER_TYPE = ETL_MODELPackage.PACKAGE__LAYER_TYPE;

	/**
	 * The feature id for the '<em><b>HISTORISATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE__HISTORISATION = ETL_MODELPackage.PACKAGE__HISTORISATION;

	/**
	 * The feature id for the '<em><b>REPRESENTATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE__REPRESENTATION = ETL_MODELPackage.PACKAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Processingpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE__PROCESSINGPOINT = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE__JOBS = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schedule Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE_FEATURE_COUNT = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schedule Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_PACKAGE_OPERATION_COUNT = ETL_MODELPackage.PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jobnetz.impl.ProcessingPointImpl <em>Processing Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jobnetz.impl.ProcessingPointImpl
	 * @see jobnetz.impl.JobnetzPackageImpl#getProcessingPoint()
	 * @generated
	 */
	int PROCESSING_POINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_POINT__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Processing Point Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_POINT__PROCESSING_POINT_TYPE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_POINT__JOBS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre Decessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_POINT__PRE_DECESSOR = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Processing Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_POINT_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Processing Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_POINT_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jobnetz.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jobnetz.impl.JobImpl
	 * @see jobnetz.impl.JobnetzPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Decessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PRE_DECESSOR = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUN_TIME = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Job Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_TYPE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Test Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IS_TEST_JOB = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TECH SYSTEM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TECH_SYSTEM = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Executable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__EXECUTABLE_NAME = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Processingpoint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PROCESSINGPOINT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pp Pre Decessorprocessingpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PP_PRE_DECESSORPROCESSINGPOINT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jobnetz.RunningTime <em>Running Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jobnetz.RunningTime
	 * @see jobnetz.impl.JobnetzPackageImpl#getRunningTime()
	 * @generated
	 */
	int RUNNING_TIME = 3;

	/**
	 * The meta object id for the '{@link jobnetz.JobType <em>Job Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jobnetz.JobType
	 * @see jobnetz.impl.JobnetzPackageImpl#getJobType()
	 * @generated
	 */
	int JOB_TYPE = 4;

	/**
	 * The meta object id for the '{@link jobnetz.ProcessingPointType <em>Processing Point Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jobnetz.ProcessingPointType
	 * @see jobnetz.impl.JobnetzPackageImpl#getProcessingPointType()
	 * @generated
	 */
	int PROCESSING_POINT_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link jobnetz.SchedulePackage <em>Schedule Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Package</em>'.
	 * @see jobnetz.SchedulePackage
	 * @generated
	 */
	EClass getSchedulePackage();

	/**
	 * Returns the meta object for the containment reference '{@link jobnetz.SchedulePackage#getProcessingpoint <em>Processingpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processingpoint</em>'.
	 * @see jobnetz.SchedulePackage#getProcessingpoint()
	 * @see #getSchedulePackage()
	 * @generated
	 */
	EReference getSchedulePackage_Processingpoint();

	/**
	 * Returns the meta object for the containment reference list '{@link jobnetz.SchedulePackage#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see jobnetz.SchedulePackage#getJobs()
	 * @see #getSchedulePackage()
	 * @generated
	 */
	EReference getSchedulePackage_Jobs();

	/**
	 * Returns the meta object for class '{@link jobnetz.ProcessingPoint <em>Processing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Point</em>'.
	 * @see jobnetz.ProcessingPoint
	 * @generated
	 */
	EClass getProcessingPoint();

	/**
	 * Returns the meta object for the attribute '{@link jobnetz.ProcessingPoint#getProcessingPointType <em>Processing Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Point Type</em>'.
	 * @see jobnetz.ProcessingPoint#getProcessingPointType()
	 * @see #getProcessingPoint()
	 * @generated
	 */
	EAttribute getProcessingPoint_ProcessingPointType();

	/**
	 * Returns the meta object for the containment reference list '{@link jobnetz.ProcessingPoint#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see jobnetz.ProcessingPoint#getJobs()
	 * @see #getProcessingPoint()
	 * @generated
	 */
	EReference getProcessingPoint_Jobs();

	/**
	 * Returns the meta object for the reference list '{@link jobnetz.ProcessingPoint#getPreDecessor <em>Pre Decessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pre Decessor</em>'.
	 * @see jobnetz.ProcessingPoint#getPreDecessor()
	 * @see #getProcessingPoint()
	 * @generated
	 */
	EReference getProcessingPoint_PreDecessor();

	/**
	 * Returns the meta object for class '{@link jobnetz.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see jobnetz.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the container reference '{@link jobnetz.Job#getProcessingpoint <em>Processingpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Processingpoint</em>'.
	 * @see jobnetz.Job#getProcessingpoint()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Processingpoint();

	/**
	 * Returns the meta object for the reference '{@link jobnetz.Job#getPpPreDecessorprocessingpoint <em>Pp Pre Decessorprocessingpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pp Pre Decessorprocessingpoint</em>'.
	 * @see jobnetz.Job#getPpPreDecessorprocessingpoint()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_PpPreDecessorprocessingpoint();

	/**
	 * Returns the meta object for the reference '{@link jobnetz.Job#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see jobnetz.Job#getJob()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Job();

	/**
	 * Returns the meta object for the reference list '{@link jobnetz.Job#getPreDecessor <em>Pre Decessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pre Decessor</em>'.
	 * @see jobnetz.Job#getPreDecessor()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_PreDecessor();

	/**
	 * Returns the meta object for the attribute '{@link jobnetz.Job#getRunTime <em>Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Time</em>'.
	 * @see jobnetz.Job#getRunTime()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_RunTime();

	/**
	 * Returns the meta object for the attribute '{@link jobnetz.Job#getJobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Type</em>'.
	 * @see jobnetz.Job#getJobType()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobType();

	/**
	 * Returns the meta object for the attribute '{@link jobnetz.Job#isIsTestJob <em>Is Test Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Test Job</em>'.
	 * @see jobnetz.Job#isIsTestJob()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_IsTestJob();

	/**
	 * Returns the meta object for the attribute '{@link jobnetz.Job#getTECH_SYSTEM <em>TECH SYSTEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TECH SYSTEM</em>'.
	 * @see jobnetz.Job#getTECH_SYSTEM()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_TECH_SYSTEM();

	/**
	 * Returns the meta object for the attribute '{@link jobnetz.Job#getExecutableName <em>Executable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable Name</em>'.
	 * @see jobnetz.Job#getExecutableName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_ExecutableName();

	/**
	 * Returns the meta object for enum '{@link jobnetz.RunningTime <em>Running Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Running Time</em>'.
	 * @see jobnetz.RunningTime
	 * @generated
	 */
	EEnum getRunningTime();

	/**
	 * Returns the meta object for enum '{@link jobnetz.JobType <em>Job Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Type</em>'.
	 * @see jobnetz.JobType
	 * @generated
	 */
	EEnum getJobType();

	/**
	 * Returns the meta object for enum '{@link jobnetz.ProcessingPointType <em>Processing Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Point Type</em>'.
	 * @see jobnetz.ProcessingPointType
	 * @generated
	 */
	EEnum getProcessingPointType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobnetzFactory getJobnetzFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jobnetz.impl.SchedulePackageImpl <em>Schedule Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jobnetz.impl.SchedulePackageImpl
		 * @see jobnetz.impl.JobnetzPackageImpl#getSchedulePackage()
		 * @generated
		 */
		EClass SCHEDULE_PACKAGE = eINSTANCE.getSchedulePackage();

		/**
		 * The meta object literal for the '<em><b>Processingpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_PACKAGE__PROCESSINGPOINT = eINSTANCE.getSchedulePackage_Processingpoint();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_PACKAGE__JOBS = eINSTANCE.getSchedulePackage_Jobs();

		/**
		 * The meta object literal for the '{@link jobnetz.impl.ProcessingPointImpl <em>Processing Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jobnetz.impl.ProcessingPointImpl
		 * @see jobnetz.impl.JobnetzPackageImpl#getProcessingPoint()
		 * @generated
		 */
		EClass PROCESSING_POINT = eINSTANCE.getProcessingPoint();

		/**
		 * The meta object literal for the '<em><b>Processing Point Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_POINT__PROCESSING_POINT_TYPE = eINSTANCE.getProcessingPoint_ProcessingPointType();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_POINT__JOBS = eINSTANCE.getProcessingPoint_Jobs();

		/**
		 * The meta object literal for the '<em><b>Pre Decessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_POINT__PRE_DECESSOR = eINSTANCE.getProcessingPoint_PreDecessor();

		/**
		 * The meta object literal for the '{@link jobnetz.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jobnetz.impl.JobImpl
		 * @see jobnetz.impl.JobnetzPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Processingpoint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PROCESSINGPOINT = eINSTANCE.getJob_Processingpoint();

		/**
		 * The meta object literal for the '<em><b>Pp Pre Decessorprocessingpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PP_PRE_DECESSORPROCESSINGPOINT = eINSTANCE.getJob_PpPreDecessorprocessingpoint();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__JOB = eINSTANCE.getJob_Job();

		/**
		 * The meta object literal for the '<em><b>Pre Decessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PRE_DECESSOR = eINSTANCE.getJob_PreDecessor();

		/**
		 * The meta object literal for the '<em><b>Run Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__RUN_TIME = eINSTANCE.getJob_RunTime();

		/**
		 * The meta object literal for the '<em><b>Job Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_TYPE = eINSTANCE.getJob_JobType();

		/**
		 * The meta object literal for the '<em><b>Is Test Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__IS_TEST_JOB = eINSTANCE.getJob_IsTestJob();

		/**
		 * The meta object literal for the '<em><b>TECH SYSTEM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__TECH_SYSTEM = eINSTANCE.getJob_TECH_SYSTEM();

		/**
		 * The meta object literal for the '<em><b>Executable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__EXECUTABLE_NAME = eINSTANCE.getJob_ExecutableName();

		/**
		 * The meta object literal for the '{@link jobnetz.RunningTime <em>Running Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jobnetz.RunningTime
		 * @see jobnetz.impl.JobnetzPackageImpl#getRunningTime()
		 * @generated
		 */
		EEnum RUNNING_TIME = eINSTANCE.getRunningTime();

		/**
		 * The meta object literal for the '{@link jobnetz.JobType <em>Job Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jobnetz.JobType
		 * @see jobnetz.impl.JobnetzPackageImpl#getJobType()
		 * @generated
		 */
		EEnum JOB_TYPE = eINSTANCE.getJobType();

		/**
		 * The meta object literal for the '{@link jobnetz.ProcessingPointType <em>Processing Point Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jobnetz.ProcessingPointType
		 * @see jobnetz.impl.JobnetzPackageImpl#getProcessingPointType()
		 * @generated
		 */
		EEnum PROCESSING_POINT_TYPE = eINSTANCE.getProcessingPointType();

	}

} //JobnetzPackage
