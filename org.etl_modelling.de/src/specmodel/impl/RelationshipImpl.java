/**
 */
package specmodel.impl;

import java.util.Collection;

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

import specmodel.Entity;
import specmodel.Field;
import specmodel.Relationship;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link specmodel.impl.RelationshipImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link specmodel.impl.RelationshipImpl#getToEntity <em>To Entity</em>}</li>
 *   <li>{@link specmodel.impl.RelationshipImpl#getIdentifyingFields <em>Identifying Fields</em>}</li>
 *   <li>{@link specmodel.impl.RelationshipImpl#getDescribingFields <em>Describing Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
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
	 * The cached value of the '{@link #getToEntity() <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity toEntity;

	/**
	 * The cached value of the '{@link #getIdentifyingFields() <em>Identifying Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> identifyingFields;

	/**
	 * The cached value of the '{@link #getDescribingFields() <em>Describing Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribingFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> describingFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (eContainerFeatureID() != SpecmodelPackage.RELATIONSHIP__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, SpecmodelPackage.RELATIONSHIP__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.RELATIONSHIP__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, SpecmodelPackage.ENTITY__RELATIONSHIPS, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.RELATIONSHIP__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getToEntity() {
		if (toEntity != null && toEntity.eIsProxy()) {
			InternalEObject oldToEntity = (InternalEObject)toEntity;
			toEntity = (Entity)eResolveProxy(oldToEntity);
			if (toEntity != oldToEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
			}
		}
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetToEntity() {
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToEntity(Entity newToEntity) {
		Entity oldToEntity = toEntity;
		toEntity = newToEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getIdentifyingFields() {
		if (identifyingFields == null) {
			identifyingFields = new EObjectContainmentEList<Field>(Field.class, this, SpecmodelPackage.RELATIONSHIP__IDENTIFYING_FIELDS);
		}
		return identifyingFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getDescribingFields() {
		if (describingFields == null) {
			describingFields = new EObjectContainmentEList<Field>(Field.class, this, SpecmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS);
		}
		return describingFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecmodelPackage.RELATIONSHIP__ENTITY:
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
			case SpecmodelPackage.RELATIONSHIP__ENTITY:
				return basicSetEntity(null, msgs);
			case SpecmodelPackage.RELATIONSHIP__IDENTIFYING_FIELDS:
				return ((InternalEList<?>)getIdentifyingFields()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS:
				return ((InternalEList<?>)getDescribingFields()).basicRemove(otherEnd, msgs);
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
			case SpecmodelPackage.RELATIONSHIP__ENTITY:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.ENTITY__RELATIONSHIPS, Entity.class, msgs);
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
			case SpecmodelPackage.RELATIONSHIP__NAME:
				return getName();
			case SpecmodelPackage.RELATIONSHIP__ENTITY:
				return getEntity();
			case SpecmodelPackage.RELATIONSHIP__TO_ENTITY:
				if (resolve) return getToEntity();
				return basicGetToEntity();
			case SpecmodelPackage.RELATIONSHIP__IDENTIFYING_FIELDS:
				return getIdentifyingFields();
			case SpecmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS:
				return getDescribingFields();
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
			case SpecmodelPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case SpecmodelPackage.RELATIONSHIP__ENTITY:
				setEntity((Entity)newValue);
				return;
			case SpecmodelPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)newValue);
				return;
			case SpecmodelPackage.RELATIONSHIP__IDENTIFYING_FIELDS:
				getIdentifyingFields().clear();
				getIdentifyingFields().addAll((Collection<? extends Field>)newValue);
				return;
			case SpecmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS:
				getDescribingFields().clear();
				getDescribingFields().addAll((Collection<? extends Field>)newValue);
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
			case SpecmodelPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecmodelPackage.RELATIONSHIP__ENTITY:
				setEntity((Entity)null);
				return;
			case SpecmodelPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)null);
				return;
			case SpecmodelPackage.RELATIONSHIP__IDENTIFYING_FIELDS:
				getIdentifyingFields().clear();
				return;
			case SpecmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS:
				getDescribingFields().clear();
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
			case SpecmodelPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecmodelPackage.RELATIONSHIP__ENTITY:
				return getEntity() != null;
			case SpecmodelPackage.RELATIONSHIP__TO_ENTITY:
				return toEntity != null;
			case SpecmodelPackage.RELATIONSHIP__IDENTIFYING_FIELDS:
				return identifyingFields != null && !identifyingFields.isEmpty();
			case SpecmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS:
				return describingFields != null && !describingFields.isEmpty();
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

} //RelationshipImpl
