/**
 */
package logmodel.impl;

import java.util.Collection;

import logmodel.CommonMapping;
import logmodel.Field;
import logmodel.LogmodelPackage;
import logmodel.logpackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmodel.impl.CommonMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link logmodel.impl.CommonMappingImpl#getCommonmappinginputfields <em>Commonmappinginputfields</em>}</li>
 *   <li>{@link logmodel.impl.CommonMappingImpl#getCommonmappingoutputfields <em>Commonmappingoutputfields</em>}</li>
 *   <li>{@link logmodel.impl.CommonMappingImpl#getLogpackage <em>Logpackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonMappingImpl extends MinimalEObjectImpl.Container implements CommonMapping {
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
	 * The cached value of the '{@link #getCommonmappinginputfields() <em>Commonmappinginputfields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonmappinginputfields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> commonmappinginputfields;

	/**
	 * The cached value of the '{@link #getCommonmappingoutputfields() <em>Commonmappingoutputfields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonmappingoutputfields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> commonmappingoutputfields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmodelPackage.Literals.COMMON_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.COMMON_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getCommonmappinginputfields() {
		if (commonmappinginputfields == null) {
			commonmappinginputfields = new EObjectContainmentEList<Field>(Field.class, this, LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS);
		}
		return commonmappinginputfields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getCommonmappingoutputfields() {
		if (commonmappingoutputfields == null) {
			commonmappingoutputfields = new EObjectContainmentEList<Field>(Field.class, this, LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS);
		}
		return commonmappingoutputfields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public logpackage getLogpackage() {
		if (eContainerFeatureID() != LogmodelPackage.COMMON_MAPPING__LOGPACKAGE) return null;
		return (logpackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogpackage(logpackage newLogpackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogpackage, LogmodelPackage.COMMON_MAPPING__LOGPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogpackage(logpackage newLogpackage) {
		if (newLogpackage != eInternalContainer() || (eContainerFeatureID() != LogmodelPackage.COMMON_MAPPING__LOGPACKAGE && newLogpackage != null)) {
			if (EcoreUtil.isAncestor(this, newLogpackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLogpackage != null)
				msgs = ((InternalEObject)newLogpackage).eInverseAdd(this, LogmodelPackage.LOGPACKAGE__COMMONMAPPING, logpackage.class, msgs);
			msgs = basicSetLogpackage(newLogpackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.COMMON_MAPPING__LOGPACKAGE, newLogpackage, newLogpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmodelPackage.COMMON_MAPPING__LOGPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLogpackage((logpackage)otherEnd, msgs);
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
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS:
				return ((InternalEList<?>)getCommonmappinginputfields()).basicRemove(otherEnd, msgs);
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS:
				return ((InternalEList<?>)getCommonmappingoutputfields()).basicRemove(otherEnd, msgs);
			case LogmodelPackage.COMMON_MAPPING__LOGPACKAGE:
				return basicSetLogpackage(null, msgs);
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
			case LogmodelPackage.COMMON_MAPPING__LOGPACKAGE:
				return eInternalContainer().eInverseRemove(this, LogmodelPackage.LOGPACKAGE__COMMONMAPPING, logpackage.class, msgs);
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
			case LogmodelPackage.COMMON_MAPPING__NAME:
				return getName();
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS:
				return getCommonmappinginputfields();
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS:
				return getCommonmappingoutputfields();
			case LogmodelPackage.COMMON_MAPPING__LOGPACKAGE:
				return getLogpackage();
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
			case LogmodelPackage.COMMON_MAPPING__NAME:
				setName((String)newValue);
				return;
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS:
				getCommonmappinginputfields().clear();
				getCommonmappinginputfields().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS:
				getCommonmappingoutputfields().clear();
				getCommonmappingoutputfields().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.COMMON_MAPPING__LOGPACKAGE:
				setLogpackage((logpackage)newValue);
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
			case LogmodelPackage.COMMON_MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS:
				getCommonmappinginputfields().clear();
				return;
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS:
				getCommonmappingoutputfields().clear();
				return;
			case LogmodelPackage.COMMON_MAPPING__LOGPACKAGE:
				setLogpackage((logpackage)null);
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
			case LogmodelPackage.COMMON_MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS:
				return commonmappinginputfields != null && !commonmappinginputfields.isEmpty();
			case LogmodelPackage.COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS:
				return commonmappingoutputfields != null && !commonmappingoutputfields.isEmpty();
			case LogmodelPackage.COMMON_MAPPING__LOGPACKAGE:
				return getLogpackage() != null;
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
		result.append(')');
		return result.toString();
	}

} //CommonMappingImpl
