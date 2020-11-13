/**
 */
package specmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import specmodel.Field;
import specmodel.JoinField;
import specmodel.Source;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.JoinFieldImpl#getParentSource <em>Parent Source</em>}</li>
 *   <li>{@link specmodel.impl.JoinFieldImpl#getChildSource <em>Child Source</em>}</li>
 *   <li>{@link specmodel.impl.JoinFieldImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinFieldImpl extends MinimalEObjectImpl.Container implements JoinField {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected Field field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.JOIN_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getParentSource() {
		if (eContainerFeatureID() != SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE) return null;
		return (Source)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSource(Source newParentSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSource, SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentSource(Source newParentSource) {
		if (newParentSource != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE && newParentSource != null)) {
			if (EcoreUtil.isAncestor(this, newParentSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSource != null)
				msgs = ((InternalEObject)newParentSource).eInverseAdd(this, SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS, Source.class, msgs);
			msgs = basicSetParentSource(newParentSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE, newParentSource, newParentSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getChildSource() {
		if (eContainerFeatureID() != SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE) return null;
		return (Source)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildSource(Source newChildSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChildSource, SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildSource(Source newChildSource) {
		if (newChildSource != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE && newChildSource != null)) {
			if (EcoreUtil.isAncestor(this, newChildSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChildSource != null)
				msgs = ((InternalEObject)newChildSource).eInverseAdd(this, SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS, Source.class, msgs);
			msgs = basicSetChildSource(newChildSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE, newChildSource, newChildSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (Field)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.JOIN_FIELD__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(Field newField) {
		Field oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.JOIN_FIELD__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSource((Source)otherEnd, msgs);
			case SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChildSource((Source)otherEnd, msgs);
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
			case SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE:
				return basicSetParentSource(null, msgs);
			case SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE:
				return basicSetChildSource(null, msgs);
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
			case SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS, Source.class, msgs);
			case SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS, Source.class, msgs);
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
			case SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE:
				return getParentSource();
			case SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE:
				return getChildSource();
			case SpecmodelPackage.JOIN_FIELD__FIELD:
				if (resolve) return getField();
				return basicGetField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE:
				setParentSource((Source)newValue);
				return;
			case SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE:
				setChildSource((Source)newValue);
				return;
			case SpecmodelPackage.JOIN_FIELD__FIELD:
				setField((Field)newValue);
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
			case SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE:
				setParentSource((Source)null);
				return;
			case SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE:
				setChildSource((Source)null);
				return;
			case SpecmodelPackage.JOIN_FIELD__FIELD:
				setField((Field)null);
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
			case SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE:
				return getParentSource() != null;
			case SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE:
				return getChildSource() != null;
			case SpecmodelPackage.JOIN_FIELD__FIELD:
				return field != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinFieldImpl
