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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import specmodel.Entity;
import specmodel.Field;
import specmodel.Relationship;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link specmodel.impl.EntityImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link specmodel.impl.EntityImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link specmodel.impl.EntityImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link specmodel.impl.EntityImpl#getIsBaselineEntityFor <em>Is Baseline Entity For</em>}</li>
 *   <li>{@link specmodel.impl.EntityImpl#getBaselineEntity <em>Baseline Entity</em>}</li>
 *   <li>{@link specmodel.impl.EntityImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected Entity partOf;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getIsBaselineEntityFor() <em>Is Baseline Entity For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBaselineEntityFor()
	 * @generated
	 * @ordered
	 */
	protected Entity isBaselineEntityFor;

	/**
	 * The cached value of the '{@link #getBaselineEntity() <em>Baseline Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity baselineEntity;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SpecmodelPackage.ENTITY__RELATIONSHIPS, SpecmodelPackage.RELATIONSHIP__ENTITY);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getPartOf() {
		if (partOf != null && partOf.eIsProxy()) {
			InternalEObject oldPartOf = (InternalEObject)partOf;
			partOf = (Entity)eResolveProxy(oldPartOf);
			if (partOf != oldPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.ENTITY__PART_OF, oldPartOf, partOf));
			}
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartOf(Entity newPartOf) {
		Entity oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.ENTITY__PART_OF, oldPartOf, partOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<Field>(Field.class, this, SpecmodelPackage.ENTITY__FIELDS, SpecmodelPackage.FIELD__ENTITY);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getIsBaselineEntityFor() {
		if (isBaselineEntityFor != null && isBaselineEntityFor.eIsProxy()) {
			InternalEObject oldIsBaselineEntityFor = (InternalEObject)isBaselineEntityFor;
			isBaselineEntityFor = (Entity)eResolveProxy(oldIsBaselineEntityFor);
			if (isBaselineEntityFor != oldIsBaselineEntityFor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR, oldIsBaselineEntityFor, isBaselineEntityFor));
			}
		}
		return isBaselineEntityFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetIsBaselineEntityFor() {
		return isBaselineEntityFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsBaselineEntityFor(Entity newIsBaselineEntityFor, NotificationChain msgs) {
		Entity oldIsBaselineEntityFor = isBaselineEntityFor;
		isBaselineEntityFor = newIsBaselineEntityFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR, oldIsBaselineEntityFor, newIsBaselineEntityFor);
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
	public void setIsBaselineEntityFor(Entity newIsBaselineEntityFor) {
		if (newIsBaselineEntityFor != isBaselineEntityFor) {
			NotificationChain msgs = null;
			if (isBaselineEntityFor != null)
				msgs = ((InternalEObject)isBaselineEntityFor).eInverseRemove(this, SpecmodelPackage.ENTITY__BASELINE_ENTITY, Entity.class, msgs);
			if (newIsBaselineEntityFor != null)
				msgs = ((InternalEObject)newIsBaselineEntityFor).eInverseAdd(this, SpecmodelPackage.ENTITY__BASELINE_ENTITY, Entity.class, msgs);
			msgs = basicSetIsBaselineEntityFor(newIsBaselineEntityFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR, newIsBaselineEntityFor, newIsBaselineEntityFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getBaselineEntity() {
		if (baselineEntity != null && baselineEntity.eIsProxy()) {
			InternalEObject oldBaselineEntity = (InternalEObject)baselineEntity;
			baselineEntity = (Entity)eResolveProxy(oldBaselineEntity);
			if (baselineEntity != oldBaselineEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.ENTITY__BASELINE_ENTITY, oldBaselineEntity, baselineEntity));
			}
		}
		return baselineEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetBaselineEntity() {
		return baselineEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaselineEntity(Entity newBaselineEntity, NotificationChain msgs) {
		Entity oldBaselineEntity = baselineEntity;
		baselineEntity = newBaselineEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.ENTITY__BASELINE_ENTITY, oldBaselineEntity, newBaselineEntity);
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
	public void setBaselineEntity(Entity newBaselineEntity) {
		if (newBaselineEntity != baselineEntity) {
			NotificationChain msgs = null;
			if (baselineEntity != null)
				msgs = ((InternalEObject)baselineEntity).eInverseRemove(this, SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR, Entity.class, msgs);
			if (newBaselineEntity != null)
				msgs = ((InternalEObject)newBaselineEntity).eInverseAdd(this, SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR, Entity.class, msgs);
			msgs = basicSetBaselineEntity(newBaselineEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.ENTITY__BASELINE_ENTITY, newBaselineEntity, newBaselineEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<Entity>(Entity.class, this, SpecmodelPackage.ENTITY__EXTENDS);
		}
		return extends_;
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
			case SpecmodelPackage.ENTITY__RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationships()).basicAdd(otherEnd, msgs);
			case SpecmodelPackage.ENTITY__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR:
				if (isBaselineEntityFor != null)
					msgs = ((InternalEObject)isBaselineEntityFor).eInverseRemove(this, SpecmodelPackage.ENTITY__BASELINE_ENTITY, Entity.class, msgs);
				return basicSetIsBaselineEntityFor((Entity)otherEnd, msgs);
			case SpecmodelPackage.ENTITY__BASELINE_ENTITY:
				if (baselineEntity != null)
					msgs = ((InternalEObject)baselineEntity).eInverseRemove(this, SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR, Entity.class, msgs);
				return basicSetBaselineEntity((Entity)otherEnd, msgs);
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
			case SpecmodelPackage.ENTITY__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.ENTITY__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR:
				return basicSetIsBaselineEntityFor(null, msgs);
			case SpecmodelPackage.ENTITY__BASELINE_ENTITY:
				return basicSetBaselineEntity(null, msgs);
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
			case SpecmodelPackage.ENTITY__NAME:
				return getName();
			case SpecmodelPackage.ENTITY__RELATIONSHIPS:
				return getRelationships();
			case SpecmodelPackage.ENTITY__PART_OF:
				if (resolve) return getPartOf();
				return basicGetPartOf();
			case SpecmodelPackage.ENTITY__FIELDS:
				return getFields();
			case SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR:
				if (resolve) return getIsBaselineEntityFor();
				return basicGetIsBaselineEntityFor();
			case SpecmodelPackage.ENTITY__BASELINE_ENTITY:
				if (resolve) return getBaselineEntity();
				return basicGetBaselineEntity();
			case SpecmodelPackage.ENTITY__EXTENDS:
				return getExtends();
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
			case SpecmodelPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case SpecmodelPackage.ENTITY__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case SpecmodelPackage.ENTITY__PART_OF:
				setPartOf((Entity)newValue);
				return;
			case SpecmodelPackage.ENTITY__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR:
				setIsBaselineEntityFor((Entity)newValue);
				return;
			case SpecmodelPackage.ENTITY__BASELINE_ENTITY:
				setBaselineEntity((Entity)newValue);
				return;
			case SpecmodelPackage.ENTITY__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Entity>)newValue);
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
			case SpecmodelPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecmodelPackage.ENTITY__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case SpecmodelPackage.ENTITY__PART_OF:
				setPartOf((Entity)null);
				return;
			case SpecmodelPackage.ENTITY__FIELDS:
				getFields().clear();
				return;
			case SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR:
				setIsBaselineEntityFor((Entity)null);
				return;
			case SpecmodelPackage.ENTITY__BASELINE_ENTITY:
				setBaselineEntity((Entity)null);
				return;
			case SpecmodelPackage.ENTITY__EXTENDS:
				getExtends().clear();
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
			case SpecmodelPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecmodelPackage.ENTITY__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case SpecmodelPackage.ENTITY__PART_OF:
				return partOf != null;
			case SpecmodelPackage.ENTITY__FIELDS:
				return fields != null && !fields.isEmpty();
			case SpecmodelPackage.ENTITY__IS_BASELINE_ENTITY_FOR:
				return isBaselineEntityFor != null;
			case SpecmodelPackage.ENTITY__BASELINE_ENTITY:
				return baselineEntity != null;
			case SpecmodelPackage.ENTITY__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
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

} //EntityImpl
