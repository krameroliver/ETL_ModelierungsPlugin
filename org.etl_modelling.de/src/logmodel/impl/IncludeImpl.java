/**
 */
package logmodel.impl;

import java.util.Collection;

import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
import logmodel.LogmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmodel.impl.IncludeImpl#getName <em>Name</em>}</li>
 *   <li>{@link logmodel.impl.IncludeImpl#getIncludeFields <em>Include Fields</em>}</li>
 *   <li>{@link logmodel.impl.IncludeImpl#getIdentifyingfields <em>Identifyingfields</em>}</li>
 *   <li>{@link logmodel.impl.IncludeImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl extends MinimalEObjectImpl.Container implements Include {
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
	 * The cached value of the '{@link #getIncludeFields() <em>Include Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> includeFields;

	/**
	 * The cached value of the '{@link #getIdentifyingfields() <em>Identifyingfields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingfields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> identifyingfields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmodelPackage.Literals.INCLUDE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.INCLUDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getIncludeFields() {
		if (includeFields == null) {
			includeFields = new EObjectWithInverseResolvingEList<Field>(Field.class, this, LogmodelPackage.INCLUDE__INCLUDE_FIELDS, LogmodelPackage.FIELD__INCLUDE);
		}
		return includeFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getIdentifyingfields() {
		if (identifyingfields == null) {
			identifyingfields = new EObjectResolvingEList<Field>(Field.class, this, LogmodelPackage.INCLUDE__IDENTIFYINGFIELDS);
		}
		return identifyingfields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (eContainerFeatureID() != LogmodelPackage.INCLUDE__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, LogmodelPackage.INCLUDE__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != LogmodelPackage.INCLUDE__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, LogmodelPackage.ENTITY__INCLUDE, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.INCLUDE__ENTITY, newEntity, newEntity));
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
			case LogmodelPackage.INCLUDE__INCLUDE_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludeFields()).basicAdd(otherEnd, msgs);
			case LogmodelPackage.INCLUDE__ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntity((Entity)otherEnd, msgs);
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
			case LogmodelPackage.INCLUDE__INCLUDE_FIELDS:
				return ((InternalEList<?>)getIncludeFields()).basicRemove(otherEnd, msgs);
			case LogmodelPackage.INCLUDE__ENTITY:
				return basicSetEntity(null, msgs);
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
			case LogmodelPackage.INCLUDE__ENTITY:
				return eInternalContainer().eInverseRemove(this, LogmodelPackage.ENTITY__INCLUDE, Entity.class, msgs);
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
			case LogmodelPackage.INCLUDE__NAME:
				return getName();
			case LogmodelPackage.INCLUDE__INCLUDE_FIELDS:
				return getIncludeFields();
			case LogmodelPackage.INCLUDE__IDENTIFYINGFIELDS:
				return getIdentifyingfields();
			case LogmodelPackage.INCLUDE__ENTITY:
				return getEntity();
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
			case LogmodelPackage.INCLUDE__NAME:
				setName((String)newValue);
				return;
			case LogmodelPackage.INCLUDE__INCLUDE_FIELDS:
				getIncludeFields().clear();
				getIncludeFields().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.INCLUDE__IDENTIFYINGFIELDS:
				getIdentifyingfields().clear();
				getIdentifyingfields().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.INCLUDE__ENTITY:
				setEntity((Entity)newValue);
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
			case LogmodelPackage.INCLUDE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogmodelPackage.INCLUDE__INCLUDE_FIELDS:
				getIncludeFields().clear();
				return;
			case LogmodelPackage.INCLUDE__IDENTIFYINGFIELDS:
				getIdentifyingfields().clear();
				return;
			case LogmodelPackage.INCLUDE__ENTITY:
				setEntity((Entity)null);
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
			case LogmodelPackage.INCLUDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogmodelPackage.INCLUDE__INCLUDE_FIELDS:
				return includeFields != null && !includeFields.isEmpty();
			case LogmodelPackage.INCLUDE__IDENTIFYINGFIELDS:
				return identifyingfields != null && !identifyingfields.isEmpty();
			case LogmodelPackage.INCLUDE__ENTITY:
				return getEntity() != null;
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

} //IncludeImpl
