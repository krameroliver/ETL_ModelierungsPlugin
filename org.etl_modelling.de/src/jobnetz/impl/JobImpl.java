/**
 */
package jobnetz.impl;

import java.util.Collection;

import jobnetz.Job;
import jobnetz.JobType;
import jobnetz.JobnetzPackage;
import jobnetz.ProcessingPoint;
import jobnetz.RunningTime;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link jobnetz.impl.JobImpl#getJob <em>Job</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getPreDecessor <em>Pre Decessor</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getJobType <em>Job Type</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#isIsTestJob <em>Is Test Job</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getTECH_SYSTEM <em>TECH SYSTEM</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getExecutableName <em>Executable Name</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getProcessingpoint <em>Processingpoint</em>}</li>
 *   <li>{@link jobnetz.impl.JobImpl#getPpPreDecessorprocessingpoint <em>Pp Pre Decessorprocessingpoint</em>}</li>
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
	 * The cached value of the '{@link #getJob() <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected Job job;

	/**
	 * The cached value of the '{@link #getPreDecessor() <em>Pre Decessor</em>}' reference list.
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
	 * The cached value of the '{@link #getPpPreDecessorprocessingpoint() <em>Pp Pre Decessorprocessingpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPpPreDecessorprocessingpoint()
	 * @generated
	 * @ordered
	 */
	protected ProcessingPoint ppPreDecessorprocessingpoint;

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
	public ProcessingPoint getProcessingpoint() {
		if (eContainerFeatureID() != JobnetzPackage.JOB__PROCESSINGPOINT) return null;
		return (ProcessingPoint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingpoint(ProcessingPoint newProcessingpoint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcessingpoint, JobnetzPackage.JOB__PROCESSINGPOINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingpoint(ProcessingPoint newProcessingpoint) {
		if (newProcessingpoint != eInternalContainer() || (eContainerFeatureID() != JobnetzPackage.JOB__PROCESSINGPOINT && newProcessingpoint != null)) {
			if (EcoreUtil.isAncestor(this, newProcessingpoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcessingpoint != null)
				msgs = ((InternalEObject)newProcessingpoint).eInverseAdd(this, JobnetzPackage.PROCESSING_POINT__JOBS, ProcessingPoint.class, msgs);
			msgs = basicSetProcessingpoint(newProcessingpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__PROCESSINGPOINT, newProcessingpoint, newProcessingpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingPoint getPpPreDecessorprocessingpoint() {
		if (ppPreDecessorprocessingpoint != null && ppPreDecessorprocessingpoint.eIsProxy()) {
			InternalEObject oldPpPreDecessorprocessingpoint = (InternalEObject)ppPreDecessorprocessingpoint;
			ppPreDecessorprocessingpoint = (ProcessingPoint)eResolveProxy(oldPpPreDecessorprocessingpoint);
			if (ppPreDecessorprocessingpoint != oldPpPreDecessorprocessingpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobnetzPackage.JOB__PP_PRE_DECESSORPROCESSINGPOINT, oldPpPreDecessorprocessingpoint, ppPreDecessorprocessingpoint));
			}
		}
		return ppPreDecessorprocessingpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingPoint basicGetPpPreDecessorprocessingpoint() {
		return ppPreDecessorprocessingpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPpPreDecessorprocessingpoint(ProcessingPoint newPpPreDecessorprocessingpoint) {
		ProcessingPoint oldPpPreDecessorprocessingpoint = ppPreDecessorprocessingpoint;
		ppPreDecessorprocessingpoint = newPpPreDecessorprocessingpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__PP_PRE_DECESSORPROCESSINGPOINT, oldPpPreDecessorprocessingpoint, ppPreDecessorprocessingpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job getJob() {
		if (job != null && job.eIsProxy()) {
			InternalEObject oldJob = (InternalEObject)job;
			job = (Job)eResolveProxy(oldJob);
			if (job != oldJob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobnetzPackage.JOB__JOB, oldJob, job));
			}
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job basicGetJob() {
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJob(Job newJob, NotificationChain msgs) {
		Job oldJob = job;
		job = newJob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobnetzPackage.JOB__JOB, oldJob, newJob);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJob(Job newJob) {
		if (newJob != job) {
			NotificationChain msgs = null;
			if (job != null)
				msgs = ((InternalEObject)job).eInverseRemove(this, JobnetzPackage.JOB__PRE_DECESSOR, Job.class, msgs);
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
			preDecessor = new EObjectWithInverseResolvingEList<Job>(Job.class, this, JobnetzPackage.JOB__PRE_DECESSOR, JobnetzPackage.JOB__JOB);
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
			case JobnetzPackage.JOB__JOB:
				if (job != null)
					msgs = ((InternalEObject)job).eInverseRemove(this, JobnetzPackage.JOB__PRE_DECESSOR, Job.class, msgs);
				return basicSetJob((Job)otherEnd, msgs);
			case JobnetzPackage.JOB__PRE_DECESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreDecessor()).basicAdd(otherEnd, msgs);
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcessingpoint((ProcessingPoint)otherEnd, msgs);
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
			case JobnetzPackage.JOB__JOB:
				return basicSetJob(null, msgs);
			case JobnetzPackage.JOB__PRE_DECESSOR:
				return ((InternalEList<?>)getPreDecessor()).basicRemove(otherEnd, msgs);
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return basicSetProcessingpoint(null, msgs);
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
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return eInternalContainer().eInverseRemove(this, JobnetzPackage.PROCESSING_POINT__JOBS, ProcessingPoint.class, msgs);
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
			case JobnetzPackage.JOB__JOB:
				if (resolve) return getJob();
				return basicGetJob();
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
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return getProcessingpoint();
			case JobnetzPackage.JOB__PP_PRE_DECESSORPROCESSINGPOINT:
				if (resolve) return getPpPreDecessorprocessingpoint();
				return basicGetPpPreDecessorprocessingpoint();
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
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				setProcessingpoint((ProcessingPoint)newValue);
				return;
			case JobnetzPackage.JOB__PP_PRE_DECESSORPROCESSINGPOINT:
				setPpPreDecessorprocessingpoint((ProcessingPoint)newValue);
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
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				setProcessingpoint((ProcessingPoint)null);
				return;
			case JobnetzPackage.JOB__PP_PRE_DECESSORPROCESSINGPOINT:
				setPpPreDecessorprocessingpoint((ProcessingPoint)null);
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
			case JobnetzPackage.JOB__JOB:
				return job != null;
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
			case JobnetzPackage.JOB__PROCESSINGPOINT:
				return getProcessingpoint() != null;
			case JobnetzPackage.JOB__PP_PRE_DECESSORPROCESSINGPOINT:
				return ppPreDecessorprocessingpoint != null;
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
