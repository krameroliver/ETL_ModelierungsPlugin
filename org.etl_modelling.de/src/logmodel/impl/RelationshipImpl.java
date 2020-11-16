/**
 */
package logmodel.impl;

import java.util.Collection;

import logmodel.Entity;
import logmodel.Field;
import logmodel.LogmodelPackage;
import logmodel.Relationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmodel.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link logmodel.impl.RelationshipImpl#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link logmodel.impl.RelationshipImpl#getToEntity <em>To Entity</em>}</li>
 *   <li>{@link logmodel.impl.RelationshipImpl#getIdentifiyingFieldsRel <em>Identifiying Fields Rel</em>}</li>
 *   <li>{@link logmodel.impl.RelationshipImpl#getDescribingFieldsRel <em>Describing Fields Rel</em>}</li>
 *   <li>{@link logmodel.impl.RelationshipImpl#getDescribingfields <em>Describingfields</em>}</li>
 *   <li>{@link logmodel.impl.RelationshipImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link logmodel.impl.RelationshipImpl#getRelationshipAlias <em>Relationship Alias</em>}</li>
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
	 * The cached value of the '{@link #getFromEntity() <em>From Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity fromEntity;

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
	 * The cached value of the '{@link #getIdentifiyingFieldsRel() <em>Identifiying Fields Rel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiyingFieldsRel()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> identifiyingFieldsRel;

	/**
	 * The cached value of the '{@link #getDescribingFieldsRel() <em>Describing Fields Rel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribingFieldsRel()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> describingFieldsRel;

	/**
	 * The cached value of the '{@link #getDescribingfields() <em>Describingfields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribingfields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> describingfields;

	/**
	 * The default value of the '{@link #getRelationshipAlias() <em>Relationship Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipAlias() <em>Relationship Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipAlias()
	 * @generated
	 * @ordered
	 */
	protected String relationshipAlias = RELATIONSHIP_ALIAS_EDEFAULT;

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
		return LogmodelPackage.Literals.RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getFromEntity() {
		if (fromEntity != null && fromEntity.eIsProxy()) {
			InternalEObject oldFromEntity = (InternalEObject)fromEntity;
			fromEntity = (Entity)eResolveProxy(oldFromEntity);
			if (fromEntity != oldFromEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogmodelPackage.RELATIONSHIP__FROM_ENTITY, oldFromEntity, fromEntity));
			}
		}
		return fromEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetFromEntity() {
		return fromEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromEntity(Entity newFromEntity) {
		Entity oldFromEntity = fromEntity;
		fromEntity = newFromEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.RELATIONSHIP__FROM_ENTITY, oldFromEntity, fromEntity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogmodelPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getIdentifiyingFieldsRel() {
		if (identifiyingFieldsRel == null) {
			identifiyingFieldsRel = new EObjectResolvingEList<Field>(Field.class, this, LogmodelPackage.RELATIONSHIP__IDENTIFIYING_FIELDS_REL);
		}
		return identifiyingFieldsRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getDescribingFieldsRel() {
		if (describingFieldsRel == null) {
			describingFieldsRel = new EObjectResolvingEList<Field>(Field.class, this, LogmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS_REL);
		}
		return describingFieldsRel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getDescribingfields() {
		if (describingfields == null) {
			describingfields = new EObjectResolvingEList<Field>(Field.class, this, LogmodelPackage.RELATIONSHIP__DESCRIBINGFIELDS);
		}
		return describingfields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (eContainerFeatureID() != LogmodelPackage.RELATIONSHIP__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, LogmodelPackage.RELATIONSHIP__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != LogmodelPackage.RELATIONSHIP__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, LogmodelPackage.ENTITY__RELATIONSHIPS, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.RELATIONSHIP__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationshipAlias() {
		return relationshipAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipAlias(String newRelationshipAlias) {
		String oldRelationshipAlias = relationshipAlias;
		relationshipAlias = newRelationshipAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.RELATIONSHIP__RELATIONSHIP_ALIAS, oldRelationshipAlias, relationshipAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmodelPackage.RELATIONSHIP__ENTITY:
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
			case LogmodelPackage.RELATIONSHIP__ENTITY:
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
			case LogmodelPackage.RELATIONSHIP__ENTITY:
				return eInternalContainer().eInverseRemove(this, LogmodelPackage.ENTITY__RELATIONSHIPS, Entity.class, msgs);
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
			case LogmodelPackage.RELATIONSHIP__NAME:
				return getName();
			case LogmodelPackage.RELATIONSHIP__FROM_ENTITY:
				if (resolve) return getFromEntity();
				return basicGetFromEntity();
			case LogmodelPackage.RELATIONSHIP__TO_ENTITY:
				if (resolve) return getToEntity();
				return basicGetToEntity();
			case LogmodelPackage.RELATIONSHIP__IDENTIFIYING_FIELDS_REL:
				return getIdentifiyingFieldsRel();
			case LogmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS_REL:
				return getDescribingFieldsRel();
			case LogmodelPackage.RELATIONSHIP__DESCRIBINGFIELDS:
				return getDescribingfields();
			case LogmodelPackage.RELATIONSHIP__ENTITY:
				return getEntity();
			case LogmodelPackage.RELATIONSHIP__RELATIONSHIP_ALIAS:
				return getRelationshipAlias();
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
			case LogmodelPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case LogmodelPackage.RELATIONSHIP__FROM_ENTITY:
				setFromEntity((Entity)newValue);
				return;
			case LogmodelPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)newValue);
				return;
			case LogmodelPackage.RELATIONSHIP__IDENTIFIYING_FIELDS_REL:
				getIdentifiyingFieldsRel().clear();
				getIdentifiyingFieldsRel().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS_REL:
				getDescribingFieldsRel().clear();
				getDescribingFieldsRel().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.RELATIONSHIP__DESCRIBINGFIELDS:
				getDescribingfields().clear();
				getDescribingfields().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.RELATIONSHIP__ENTITY:
				setEntity((Entity)newValue);
				return;
			case LogmodelPackage.RELATIONSHIP__RELATIONSHIP_ALIAS:
				setRelationshipAlias((String)newValue);
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
			case LogmodelPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogmodelPackage.RELATIONSHIP__FROM_ENTITY:
				setFromEntity((Entity)null);
				return;
			case LogmodelPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)null);
				return;
			case LogmodelPackage.RELATIONSHIP__IDENTIFIYING_FIELDS_REL:
				getIdentifiyingFieldsRel().clear();
				return;
			case LogmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS_REL:
				getDescribingFieldsRel().clear();
				return;
			case LogmodelPackage.RELATIONSHIP__DESCRIBINGFIELDS:
				getDescribingfields().clear();
				return;
			case LogmodelPackage.RELATIONSHIP__ENTITY:
				setEntity((Entity)null);
				return;
			case LogmodelPackage.RELATIONSHIP__RELATIONSHIP_ALIAS:
				setRelationshipAlias(RELATIONSHIP_ALIAS_EDEFAULT);
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
			case LogmodelPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogmodelPackage.RELATIONSHIP__FROM_ENTITY:
				return fromEntity != null;
			case LogmodelPackage.RELATIONSHIP__TO_ENTITY:
				return toEntity != null;
			case LogmodelPackage.RELATIONSHIP__IDENTIFIYING_FIELDS_REL:
				return identifiyingFieldsRel != null && !identifiyingFieldsRel.isEmpty();
			case LogmodelPackage.RELATIONSHIP__DESCRIBING_FIELDS_REL:
				return describingFieldsRel != null && !describingFieldsRel.isEmpty();
			case LogmodelPackage.RELATIONSHIP__DESCRIBINGFIELDS:
				return describingfields != null && !describingfields.isEmpty();
			case LogmodelPackage.RELATIONSHIP__ENTITY:
				return getEntity() != null;
			case LogmodelPackage.RELATIONSHIP__RELATIONSHIP_ALIAS:
				return RELATIONSHIP_ALIAS_EDEFAULT == null ? relationshipAlias != null : !RELATIONSHIP_ALIAS_EDEFAULT.equals(relationshipAlias);
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
		result.append(", relationshipAlias: ");
		result.append(relationshipAlias);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
