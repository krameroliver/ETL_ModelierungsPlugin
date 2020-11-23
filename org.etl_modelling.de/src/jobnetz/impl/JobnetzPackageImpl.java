/**
 */
package jobnetz.impl;

import ETL_MODEL.ETL_MODELPackage;

import jobnetz.Job;
import jobnetz.JobType;
import jobnetz.JobnetzFactory;
import jobnetz.JobnetzPackage;
import jobnetz.ProcessingPoint;
import jobnetz.ProcessingPointType;
import jobnetz.RunningTime;
import jobnetz.SchedulePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import package_enums.Package_enumsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JobnetzPackageImpl extends EPackageImpl implements JobnetzPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum runningTimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jobTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingPointTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jobnetz.JobnetzPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JobnetzPackageImpl() {
		super(eNS_URI, JobnetzFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JobnetzPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JobnetzPackage init() {
		if (isInited) return (JobnetzPackage)EPackage.Registry.INSTANCE.getEPackage(JobnetzPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJobnetzPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JobnetzPackageImpl theJobnetzPackage = registeredJobnetzPackage instanceof JobnetzPackageImpl ? (JobnetzPackageImpl)registeredJobnetzPackage : new JobnetzPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ETL_MODELPackage.eINSTANCE.eClass();
		Package_enumsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJobnetzPackage.createPackageContents();

		// Initialize created meta-data
		theJobnetzPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJobnetzPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JobnetzPackage.eNS_URI, theJobnetzPackage);
		return theJobnetzPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulePackage() {
		return schedulePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedulePackage_Jobs() {
		return (EReference)schedulePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingPoint() {
		return processingPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingPoint_Job() {
		return (EReference)processingPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingPoint_ProcessingPointType() {
		return (EAttribute)processingPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Schedulepackage() {
		return (EReference)jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Processingpoint() {
		return (EReference)jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Job() {
		return (EReference)jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_PreDecessor() {
		return (EReference)jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_RunTime() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_JobType() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_IsTestJob() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_TECH_SYSTEM() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_ExecutableName() {
		return (EAttribute)jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRunningTime() {
		return runningTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJobType() {
		return jobTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessingPointType() {
		return processingPointTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobnetzFactory getJobnetzFactory() {
		return (JobnetzFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		schedulePackageEClass = createEClass(SCHEDULE_PACKAGE);
		createEReference(schedulePackageEClass, SCHEDULE_PACKAGE__JOBS);

		processingPointEClass = createEClass(PROCESSING_POINT);
		createEReference(processingPointEClass, PROCESSING_POINT__JOB);
		createEAttribute(processingPointEClass, PROCESSING_POINT__PROCESSING_POINT_TYPE);

		jobEClass = createEClass(JOB);
		createEReference(jobEClass, JOB__SCHEDULEPACKAGE);
		createEReference(jobEClass, JOB__PROCESSINGPOINT);
		createEReference(jobEClass, JOB__JOB);
		createEReference(jobEClass, JOB__PRE_DECESSOR);
		createEAttribute(jobEClass, JOB__RUN_TIME);
		createEAttribute(jobEClass, JOB__JOB_TYPE);
		createEAttribute(jobEClass, JOB__IS_TEST_JOB);
		createEAttribute(jobEClass, JOB__TECH_SYSTEM);
		createEAttribute(jobEClass, JOB__EXECUTABLE_NAME);

		// Create enums
		runningTimeEEnum = createEEnum(RUNNING_TIME);
		jobTypeEEnum = createEEnum(JOB_TYPE);
		processingPointTypeEEnum = createEEnum(PROCESSING_POINT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ETL_MODELPackage theETL_MODELPackage = (ETL_MODELPackage)EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		schedulePackageEClass.getESuperTypes().add(theETL_MODELPackage.getPackage());
		processingPointEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		jobEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());

		// Initialize classes, features, and operations; add parameters
		initEClass(schedulePackageEClass, SchedulePackage.class, "SchedulePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulePackage_Jobs(), this.getJob(), this.getJob_Schedulepackage(), "jobs", null, 0, -1, SchedulePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingPointEClass, ProcessingPoint.class, "ProcessingPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingPoint_Job(), this.getJob(), this.getJob_Processingpoint(), "job", null, 0, 1, ProcessingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingPoint_ProcessingPointType(), this.getProcessingPointType(), "ProcessingPointType", null, 0, 1, ProcessingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJob_Schedulepackage(), this.getSchedulePackage(), this.getSchedulePackage_Jobs(), "schedulepackage", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Processingpoint(), this.getProcessingPoint(), this.getProcessingPoint_Job(), "processingpoint", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Job(), this.getJob(), this.getJob_PreDecessor(), "job", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_PreDecessor(), this.getJob(), this.getJob_Job(), "preDecessor", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_RunTime(), this.getRunningTime(), "RunTime", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_JobType(), this.getJobType(), "JobType", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_IsTestJob(), ecorePackage.getEBoolean(), "isTestJob", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_TECH_SYSTEM(), ecorePackage.getEString(), "TECH_SYSTEM", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_ExecutableName(), ecorePackage.getEString(), "ExecutableName", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(runningTimeEEnum, RunningTime.class, "RunningTime");
		addEEnumLiteral(runningTimeEEnum, RunningTime.EVERY_DAY);
		addEEnumLiteral(runningTimeEEnum, RunningTime.WORKING_DAY);
		addEEnumLiteral(runningTimeEEnum, RunningTime.WEEKLY);
		addEEnumLiteral(runningTimeEEnum, RunningTime.MONTHLY_ULTIMO);

		initEEnum(jobTypeEEnum, JobType.class, "JobType");
		addEEnumLiteral(jobTypeEEnum, JobType.TRIGGER);
		addEEnumLiteral(jobTypeEEnum, JobType.IMPORT);
		addEEnumLiteral(jobTypeEEnum, JobType.INTEGRATION);
		addEEnumLiteral(jobTypeEEnum, JobType.I2I);
		addEEnumLiteral(jobTypeEEnum, JobType.EXPORT);
		addEEnumLiteral(jobTypeEEnum, JobType.PROCESSIG_POINT);

		initEEnum(processingPointTypeEEnum, ProcessingPointType.class, "ProcessingPointType");
		addEEnumLiteral(processingPointTypeEEnum, ProcessingPointType.BUSINESS);
		addEEnumLiteral(processingPointTypeEEnum, ProcessingPointType.TECH);
		addEEnumLiteral(processingPointTypeEEnum, ProcessingPointType.TEST);

		// Create resource
		createResource(eNS_URI);
	}

} //JobnetzPackageImpl
