/**
 */
package techmodel.impl;

import java.util.Collection;
import logmodel.Entity;
import logmodel.Field;
import logmodel.LogmodelPackage;
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
import techmodel.Table;
import techmodel.TableType;
import techmodel.TechPackage;
import techmodel.TechmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link techmodel.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link techmodel.impl.TableImpl#getTableType <em>Table Type</em>}</li>
 *   <li>{@link techmodel.impl.TableImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link techmodel.impl.TableImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link techmodel.impl.TableImpl#getTechpackage <em>Techpackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
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
	 * The default value of the '{@link #getTableType() <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected static final TableType TABLE_TYPE_EDEFAULT = TableType.SAT;

	/**
	 * The cached value of the '{@link #getTableType() <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected TableType tableType = TABLE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechmodelPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableType getTableType() {
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableType(TableType newTableType) {
		TableType oldTableType = tableType;
		tableType = newTableType == null ? TABLE_TYPE_EDEFAULT : newTableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TABLE__TABLE_TYPE, oldTableType, tableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectWithInverseResolvingEList<Field>(Field.class, this, TechmodelPackage.TABLE__FIELDS, LogmodelPackage.FIELD__TABLE);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (eContainerFeatureID() != TechmodelPackage.TABLE__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, TechmodelPackage.TABLE__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != TechmodelPackage.TABLE__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, LogmodelPackage.ENTITY__TABLES, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TABLE__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechPackage getTechpackage() {
		if (eContainerFeatureID() != TechmodelPackage.TABLE__TECHPACKAGE) return null;
		return (TechPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechpackage(TechPackage newTechpackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTechpackage, TechmodelPackage.TABLE__TECHPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechpackage(TechPackage newTechpackage) {
		if (newTechpackage != eInternalContainer() || (eContainerFeatureID() != TechmodelPackage.TABLE__TECHPACKAGE && newTechpackage != null)) {
			if (EcoreUtil.isAncestor(this, newTechpackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTechpackage != null)
				msgs = ((InternalEObject)newTechpackage).eInverseAdd(this, TechmodelPackage.TECH_PACKAGE__TABLES, TechPackage.class, msgs);
			msgs = basicSetTechpackage(newTechpackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TABLE__TECHPACKAGE, newTechpackage, newTechpackage));
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
			case TechmodelPackage.TABLE__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case TechmodelPackage.TABLE__ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntity((Entity)otherEnd, msgs);
			case TechmodelPackage.TABLE__TECHPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTechpackage((TechPackage)otherEnd, msgs);
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
			case TechmodelPackage.TABLE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case TechmodelPackage.TABLE__ENTITY:
				return basicSetEntity(null, msgs);
			case TechmodelPackage.TABLE__TECHPACKAGE:
				return basicSetTechpackage(null, msgs);
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
			case TechmodelPackage.TABLE__ENTITY:
				return eInternalContainer().eInverseRemove(this, LogmodelPackage.ENTITY__TABLES, Entity.class, msgs);
			case TechmodelPackage.TABLE__TECHPACKAGE:
				return eInternalContainer().eInverseRemove(this, TechmodelPackage.TECH_PACKAGE__TABLES, TechPackage.class, msgs);
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
			case TechmodelPackage.TABLE__NAME:
				return getName();
			case TechmodelPackage.TABLE__TABLE_TYPE:
				return getTableType();
			case TechmodelPackage.TABLE__FIELDS:
				return getFields();
			case TechmodelPackage.TABLE__ENTITY:
				return getEntity();
			case TechmodelPackage.TABLE__TECHPACKAGE:
				return getTechpackage();
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
			case TechmodelPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case TechmodelPackage.TABLE__TABLE_TYPE:
				setTableType((TableType)newValue);
				return;
			case TechmodelPackage.TABLE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case TechmodelPackage.TABLE__ENTITY:
				setEntity((Entity)newValue);
				return;
			case TechmodelPackage.TABLE__TECHPACKAGE:
				setTechpackage((TechPackage)newValue);
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
			case TechmodelPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TechmodelPackage.TABLE__TABLE_TYPE:
				setTableType(TABLE_TYPE_EDEFAULT);
				return;
			case TechmodelPackage.TABLE__FIELDS:
				getFields().clear();
				return;
			case TechmodelPackage.TABLE__ENTITY:
				setEntity((Entity)null);
				return;
			case TechmodelPackage.TABLE__TECHPACKAGE:
				setTechpackage((TechPackage)null);
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
			case TechmodelPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TechmodelPackage.TABLE__TABLE_TYPE:
				return tableType != TABLE_TYPE_EDEFAULT;
			case TechmodelPackage.TABLE__FIELDS:
				return fields != null && !fields.isEmpty();
			case TechmodelPackage.TABLE__ENTITY:
				return getEntity() != null;
			case TechmodelPackage.TABLE__TECHPACKAGE:
				return getTechpackage() != null;
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
		result.append(", TableType: ");
		result.append(tableType);
		result.append(')');
		return result.toString();
	}

} //TableImpl
