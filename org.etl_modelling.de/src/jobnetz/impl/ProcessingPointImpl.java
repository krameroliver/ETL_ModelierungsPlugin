/**
 */
package jobnetz.impl;

import java.util.Collection;
import jobnetz.Job;
import jobnetz.JobnetzPackage;
import jobnetz.ProcessingPoint;
import jobnetz.ProcessingPointType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jobnetz.impl.ProcessingPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link jobnetz.impl.ProcessingPointImpl#getProcessingPointType <em>Processing Point Type</em>}</li>
 *   <li>{@link jobnetz.impl.ProcessingPointImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link jobnetz.impl.ProcessingPointImpl#getPreDecessor <em>Pre Decessor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingPointImpl extends MinimalEObjectImpl.Container implements ProcessingPoint {
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
	 * The default value of the '{@link #getProcessingPointType() <em>Processing Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingPointType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingPointType PROCESSING_POINT_TYPE_EDEFAULT = ProcessingPointType.BUSINESS;

	/**
	 * The cached value of the '{@link #getProcessingPointType() <em>Processing Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingPointType()
	 * @generated
	 * @ordered
	 */
	protected ProcessingPointType processingPointType = PROCESSING_POINT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobnetzPackage.Literals.PROCESSING_POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.PROCESSING_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingPointType getProcessingPointType() {
		return processingPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingPointType(ProcessingPointType newProcessingPointType) {
		ProcessingPointType oldProcessingPointType = processingPointType;
		processingPointType = newProcessingPointType == null ? PROCESSING_POINT_TYPE_EDEFAULT : newProcessingPointType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobnetzPackage.PROCESSING_POINT__PROCESSING_POINT_TYPE, oldProcessingPointType, processingPointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentWithInverseEList<Job>(Job.class, this, JobnetzPackage.PROCESSING_POINT__JOBS, JobnetzPackage.JOB__PROCESSINGPOINT);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getPreDecessor() {
		if (preDecessor == null) {
			preDecessor = new EObjectResolvingEList<Job>(Job.class, this, JobnetzPackage.PROCESSING_POINT__PRE_DECESSOR);
		}
		return preDecessor;
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
			case JobnetzPackage.PROCESSING_POINT__JOBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobs()).basicAdd(otherEnd, msgs);
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
			case JobnetzPackage.PROCESSING_POINT__JOBS:
				return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobnetzPackage.PROCESSING_POINT__NAME:
				return getName();
			case JobnetzPackage.PROCESSING_POINT__PROCESSING_POINT_TYPE:
				return getProcessingPointType();
			case JobnetzPackage.PROCESSING_POINT__JOBS:
				return getJobs();
			case JobnetzPackage.PROCESSING_POINT__PRE_DECESSOR:
				return getPreDecessor();
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
			case JobnetzPackage.PROCESSING_POINT__NAME:
				setName((String)newValue);
				return;
			case JobnetzPackage.PROCESSING_POINT__PROCESSING_POINT_TYPE:
				setProcessingPointType((ProcessingPointType)newValue);
				return;
			case JobnetzPackage.PROCESSING_POINT__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends Job>)newValue);
				return;
			case JobnetzPackage.PROCESSING_POINT__PRE_DECESSOR:
				getPreDecessor().clear();
				getPreDecessor().addAll((Collection<? extends Job>)newValue);
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
			case JobnetzPackage.PROCESSING_POINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JobnetzPackage.PROCESSING_POINT__PROCESSING_POINT_TYPE:
				setProcessingPointType(PROCESSING_POINT_TYPE_EDEFAULT);
				return;
			case JobnetzPackage.PROCESSING_POINT__JOBS:
				getJobs().clear();
				return;
			case JobnetzPackage.PROCESSING_POINT__PRE_DECESSOR:
				getPreDecessor().clear();
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
			case JobnetzPackage.PROCESSING_POINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JobnetzPackage.PROCESSING_POINT__PROCESSING_POINT_TYPE:
				return processingPointType != PROCESSING_POINT_TYPE_EDEFAULT;
			case JobnetzPackage.PROCESSING_POINT__JOBS:
				return jobs != null && !jobs.isEmpty();
			case JobnetzPackage.PROCESSING_POINT__PRE_DECESSOR:
				return preDecessor != null && !preDecessor.isEmpty();
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
		result.append(", ProcessingPointType: ");
		result.append(processingPointType);
		result.append(')');
		return result.toString();
	}

} //ProcessingPointImpl
