/**
 */
package jobnetz.impl;

import java.util.Collection;

import jobnetz.Job;
import jobnetz.JobType;
import jobnetz.JobnetzPackage;
import jobnetz.ProcessingPoint;
import jobnetz.RunningTime;
import jobnetz.SchedulePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jobnetz.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getSchedulepackage <em>Schedulepackage</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getProcessingpoint <em>Processingpoint</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getJob <em>Job</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getPreDecessor <em>Pre Decessor</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getJobType <em>Job Type</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#isIsTestJob <em>Is Test Job</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getTECH_SYSTEM <em>TECH SYSTEM</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getExecutableName <em>Executable Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessingpoint() <em>Processingpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingPoint> processingpoint;

	/**
	 * The cached value of the '{@link #getPreDecessor() <em>Pre Decessor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDecessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> preDecessor;

	/**
	 * The default value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected static final RunningTime RUN_TIME_EDEFAULT = RunningTime.EVERY_DAY;

	/**
	 * The cached value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected RunningTime runTime = RUN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobType()
	 * @generated
	 * @ordered
	 */
	protected static final JobType JOB_TYPE_EDEFAULT = JobType.TRIGGER;

	/**
	 * The cached value of the '{@link #getJobType() <em>Job Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobType()
	 * @generated
	 * @ordered
	 */
	protected JobType jobType = JOB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTestJob() <em>Is Test Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTestJob()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TEST_JOB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTestJob() <em>Is Test Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTestJob()
	 * @generated
	 * @ordered
	 */
	protected boolean isTestJob = IS_TEST_JOB_EDEFAULT;

	/**
	 * The default value of the '{@link #getTECH_SYSTEM() <em>TECH SYSTEM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTECH_SYSTEM()
	 * @generated
	 * @ordered
	 */
	protected static final String TECH_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTECH_SYSTEM() <em>TECH SYSTEM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTECH_SYSTEM()
	 * @generated
	 * @ordered
	 */
	protected String tecH_SYSTEM = TECH_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutableName() <em>Executable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutableName() <em>Executable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableName()
	 * @generated
	 * @ordered
	 */
	protected String executableName = EXECUTABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobnetzPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulePackage getSchedulepackage() {
		if (eContainerFeatureID() != JobnetzPackage.JOB__SCHEDULEPACKAGE) return null;
		return (SchedulePackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedulepackage(SchedulePackage newSchedulepackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchedulepackage, JobnetzPackage.JOB__SCHEDULEPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedulepackage(SchedulePackage newSchedulepackage) {
		if (newSchedulepackage != eInternalContainer() || (eContainerFeatureID() != JobnetzPackage.JOB__SCHEDULEPACKAGE && newSchedulepackage != null)) {
			if (EcoreUtil.isAncestor(this, newSchedulepackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchedulepackage != null)
				msgs = ((InternalEObject)newSchedulepackage).eInverseAdd(this, JobnetzPackage.SCHEDULE_PACKAGE__JOBS, SchedulePackage.class, msgs);
			msgs = basicSetSchedulepackage(newSchedulepackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__SCHEDULEPACKAGE, newSchedulepackage, newSchedulepackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessingPoint> getProcessingpoint() {
		if (processingpoint == null) {
			processingpoint = new EObjectContainmentWithInverseEList<ProcessingPoint>(ProcessingPoint.class, this, JobnetzPackage.JOB__PROCESSINGPOINT, JobnetzPackage.PROCESSING_POINT__JOB);
		}
		return processingpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job getJob() {
		if (eContainerFeatureID() != JobnetzPackage.JOB__JOB) return null;
		return (Job)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJob(Job newJob, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newJob, JobnetzPackage.JOB__JOB, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob(Job newJob) {
		if (newJob != eInternalContainer() || (eContainerFeatureID() != JobnetzPackage.JOB__JOB && newJob != null)) {
			if (EcoreUtil.isAncestor(this, newJob))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJob != null)
				msgs = ((InternalEObject)newJob).eInverseAdd(this, JobnetzPackage.JOB__PRE_DECESSOR, Job.class, msgs);
			msgs = basicSetJob(newJob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__JOB, newJob, newJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getPreDecessor() {
		if (preDecessor == null) {
			preDecessor = new EObjectContainmentWithInverseEList<Job>(Job.class, this, JobnetzPackage.JOB__PRE_DECESSOR, JobnetzPackage.JOB__JOB);
		}
		return preDecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunningTime getRunTime() {
		return runTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunTime(RunningTime newRunTime) {
		RunningTime oldRunTime = runTime;
		runTime = newRunTime == null ? RUN_TIME_EDEFAULT : newRunTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__RUN_TIME, oldRunTime, runTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobType getJobType() {
		return jobType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobType(JobType newJobType) {
		JobType oldJobType = jobType;
		jobType = newJobType == null ? JOB_TYPE_EDEFAULT : newJobType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__JOB_TYPE, oldJobType, jobType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTestJob() {
		return isTestJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTestJob(boolean newIsTestJob) {
		boolean oldIsTestJob = isTestJob;
		isTestJob = newIsTestJob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__IS_TEST_JOB, oldIsTestJob, isTestJob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTECH_SYSTEM() {
		return tecH_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTECH_SYSTEM(String newTECH_SYSTEM) {
		String oldTECH_SYSTEM = tecH_SYSTEM;
		tecH_SYSTEM = newTECH_SYSTEM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__TECH_SYSTEM, oldTECH_SYSTEM, tecH_SYSTEM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExecutableName() {
		return executableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutableName(String newExecutableName) {
		String oldExecutableName = executableName;
		executableName = newExecutableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__EXECUTABLE_NAME, oldExecutableName, executableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobnetzPackage.JOB__SCHEDULEPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchedulepackage((SchedulePackage)otherEnd, msgs);
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessingpoint()).basicAdd(otherEnd, msgs);
			case JobnetzPackage.JOB__JOB:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetJob((Job)otherEnd, msgs);
			case JobnetzPackage.JOB__PRE_DECESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreDecessor()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobnetzPackage.JOB__SCHEDULEPACKAGE:
				return basicSetSchedulepackage(null, msgs);
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return ((InternalEList<?>)getProcessingpoint()).basicRemove(otherEnd, msgs);
			case JobnetzPackage.JOB__JOB:
				return basicSetJob(null, msgs);
			case JobnetzPackage.JOB__PRE_DECESSOR:
				return ((InternalEList<?>)getPreDecessor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JobnetzPackage.JOB__SCHEDULEPACKAGE:
				return eInternalContainer().eInverseRemove(this, JobnetzPackage.SCHEDULE_PACKAGE__JOBS, SchedulePackage.class, msgs);
			case JobnetzPackage.JOB__JOB:
				return eInternalContainer().eInverseRemove(this, JobnetzPackage.JOB__PRE_DECESSOR, Job.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobnetzPackage.JOB__NAME:
				return getName();
			case JobnetzPackage.JOB__SCHEDULEPACKAGE:
				return getSchedulepackage();
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return getProcessingpoint();
			case JobnetzPackage.JOB__JOB:
				return getJob();
			case JobnetzPackage.JOB__PRE_DECESSOR:
				return getPreDecessor();
			case JobnetzPackage.JOB__RUN_TIME:
				return getRunTime();
			case JobnetzPackage.JOB__JOB_TYPE:
				return getJobType();
			case JobnetzPackage.JOB__IS_TEST_JOB:
				return isIsTestJob();
			case JobnetzPackage.JOB__TECH_SYSTEM:
				return getTECH_SYSTEM();
			case JobnetzPackage.JOB__EXECUTABLE_NAME:
				return getExecutableName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobnetzPackage.JOB__NAME:
				setName((String)newValue);
				return;
			case JobnetzPackage.JOB__SCHEDULEPACKAGE:
				setSchedulepackage((SchedulePackage)newValue);
				return;
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				getProcessingpoint().clear();
				getProcessingpoint().addAll((Collection<? extends ProcessingPoint>)newValue);
				return;
			case JobnetzPackage.JOB__JOB:
				setJob((Job)newValue);
				return;
			case JobnetzPackage.JOB__PRE_DECESSOR:
				getPreDecessor().clear();
				getPreDecessor().addAll((Collection<? extends Job>)newValue);
				return;
			case JobnetzPackage.JOB__RUN_TIME:
				setRunTime((RunningTime)newValue);
				return;
			case JobnetzPackage.JOB__JOB_TYPE:
				setJobType((JobType)newValue);
				return;
			case JobnetzPackage.JOB__IS_TEST_JOB:
				setIsTestJob((Boolean)newValue);
				return;
			case JobnetzPackage.JOB__TECH_SYSTEM:
				setTECH_SYSTEM((String)newValue);
				return;
			case JobnetzPackage.JOB__EXECUTABLE_NAME:
				setExecutableName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JobnetzPackage.JOB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobnetzPackage.JOB__SCHEDULEPACKAGE:
				setSchedulepackage((SchedulePackage)null);
				return;
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				getProcessingpoint().clear();
				return;
			case JobnetzPackage.JOB__JOB:
				setJob((Job)null);
				return;
			case JobnetzPackage.JOB__PRE_DECESSOR:
				getPreDecessor().clear();
				return;
			case JobnetzPackage.JOB__RUN_TIME:
				setRunTime(RUN_TIME_EDEFAULT);
				return;
			case JobnetzPackage.JOB__JOB_TYPE:
				setJobType(JOB_TYPE_EDEFAULT);
				return;
			case JobnetzPackage.JOB__IS_TEST_JOB:
				setIsTestJob(IS_TEST_JOB_EDEFAULT);
				return;
			case JobnetzPackage.JOB__TECH_SYSTEM:
				setTECH_SYSTEM(TECH_SYSTEM_EDEFAULT);
				return;
			case JobnetzPackage.JOB__EXECUTABLE_NAME:
				setExecutableName(EXECUTABLE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JobnetzPackage.JOB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobnetzPackage.JOB__SCHEDULEPACKAGE:
				return getSchedulepackage() != null;
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return processingpoint != null && !processingpoint.isEmpty();
			case JobnetzPackage.JOB__JOB:
				return getJob() != null;
			case JobnetzPackage.JOB__PRE_DECESSOR:
				return preDecessor != null && !preDecessor.isEmpty();
			case JobnetzPackage.JOB__RUN_TIME:
				return runTime != RUN_TIME_EDEFAULT;
			case JobnetzPackage.JOB__JOB_TYPE:
				return jobType != JOB_TYPE_EDEFAULT;
			case JobnetzPackage.JOB__IS_TEST_JOB:
				return isTestJob != IS_TEST_JOB_EDEFAULT;
			case JobnetzPackage.JOB__TECH_SYSTEM:
				return TECH_SYSTEM_EDEFAULT == null ? tecH_SYSTEM != null : !TECH_SYSTEM_EDEFAULT.equals(tecH_SYSTEM);
			case JobnetzPackage.JOB__EXECUTABLE_NAME:
				return EXECUTABLE_NAME_EDEFAULT == null ? executableName != null : !EXECUTABLE_NAME_EDEFAULT.equals(executableName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", RunTime: ");
		result.append(runTime);
		result.append(", JobType: ");
		result.append(jobType);
		result.append(", isTestJob: ");
		result.append(isTestJob);
		result.append(", TECH_SYSTEM: ");
		result.append(tecH_SYSTEM);
		result.append(", ExecutableName: ");
		result.append(executableName);
		result.append(')');
		return result.toString();
	}

} //JobImpl
