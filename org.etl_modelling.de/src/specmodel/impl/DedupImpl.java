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

import specmodel.BusinessRule;
import specmodel.Dedup;
import specmodel.Field;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dedup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.DedupImpl#getPostDedupBusinessrule <em>Post Dedup Businessrule</em>}</li>
 *   <li>{@link specmodel.impl.DedupImpl#getPreDedupBusinessrule <em>Pre Dedup Businessrule</em>}</li>
 *   <li>{@link specmodel.impl.DedupImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DedupImpl extends MinimalEObjectImpl.Container implements Dedup {
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
	protected DedupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.DEDUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRule getPostDedupBusinessrule() {
		if (eContainerFeatureID() != SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE) return null;
		return (BusinessRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostDedupBusinessrule(BusinessRule newPostDedupBusinessrule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPostDedupBusinessrule, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostDedupBusinessrule(BusinessRule newPostDedupBusinessrule) {
		if (newPostDedupBusinessrule != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE && newPostDedupBusinessrule != null)) {
			if (EcoreUtil.isAncestor(this, newPostDedupBusinessrule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostDedupBusinessrule != null)
				msgs = ((InternalEObject)newPostDedupBusinessrule).eInverseAdd(this, SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, BusinessRule.class, msgs);
			msgs = basicSetPostDedupBusinessrule(newPostDedupBusinessrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE, newPostDedupBusinessrule, newPostDedupBusinessrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRule getPreDedupBusinessrule() {
		if (eContainerFeatureID() != SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE) return null;
		return (BusinessRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreDedupBusinessrule(BusinessRule newPreDedupBusinessrule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreDedupBusinessrule, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreDedupBusinessrule(BusinessRule newPreDedupBusinessrule) {
		if (newPreDedupBusinessrule != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE && newPreDedupBusinessrule != null)) {
			if (EcoreUtil.isAncestor(this, newPreDedupBusinessrule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreDedupBusinessrule != null)
				msgs = ((InternalEObject)newPreDedupBusinessrule).eInverseAdd(this, SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, BusinessRule.class, msgs);
			msgs = basicSetPreDedupBusinessrule(newPreDedupBusinessrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE, newPreDedupBusinessrule, newPreDedupBusinessrule));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.DEDUP__FIELD, oldField, field));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.DEDUP__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPostDedupBusinessrule((BusinessRule)otherEnd, msgs);
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreDedupBusinessrule((BusinessRule)otherEnd, msgs);
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
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE:
				return basicSetPostDedupBusinessrule(null, msgs);
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE:
				return basicSetPreDedupBusinessrule(null, msgs);
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
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, BusinessRule.class, msgs);
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, BusinessRule.class, msgs);
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
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE:
				return getPostDedupBusinessrule();
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE:
				return getPreDedupBusinessrule();
			case SpecmodelPackage.DEDUP__FIELD:
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
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE:
				setPostDedupBusinessrule((BusinessRule)newValue);
				return;
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE:
				setPreDedupBusinessrule((BusinessRule)newValue);
				return;
			case SpecmodelPackage.DEDUP__FIELD:
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
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE:
				setPostDedupBusinessrule((BusinessRule)null);
				return;
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE:
				setPreDedupBusinessrule((BusinessRule)null);
				return;
			case SpecmodelPackage.DEDUP__FIELD:
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
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE:
				return getPostDedupBusinessrule() != null;
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE:
				return getPreDedupBusinessrule() != null;
			case SpecmodelPackage.DEDUP__FIELD:
				return field != null;
		}
		return super.eIsSet(featureID);
	}

} //DedupImpl
