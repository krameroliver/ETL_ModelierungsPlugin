/**
 */
package specmodel.impl;

import logmodel.Field;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import specmodel.BusinessRule;
import specmodel.Dedup;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dedup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.DedupImpl#getPreDedupBusinessRule <em>Pre Dedup Business Rule</em>}</li>
 *   <li>{@link specmodel.impl.DedupImpl#getPostDedupBusinessRule <em>Post Dedup Business Rule</em>}</li>
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
	public BusinessRule getPreDedupBusinessRule() {
		if (eContainerFeatureID() != SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE) return null;
		return (BusinessRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreDedupBusinessRule(BusinessRule newPreDedupBusinessRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreDedupBusinessRule, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreDedupBusinessRule(BusinessRule newPreDedupBusinessRule) {
		if (newPreDedupBusinessRule != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE && newPreDedupBusinessRule != null)) {
			if (EcoreUtil.isAncestor(this, newPreDedupBusinessRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreDedupBusinessRule != null)
				msgs = ((InternalEObject)newPreDedupBusinessRule).eInverseAdd(this, SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, BusinessRule.class, msgs);
			msgs = basicSetPreDedupBusinessRule(newPreDedupBusinessRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE, newPreDedupBusinessRule, newPreDedupBusinessRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRule getPostDedupBusinessRule() {
		if (eContainerFeatureID() != SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE) return null;
		return (BusinessRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostDedupBusinessRule(BusinessRule newPostDedupBusinessRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPostDedupBusinessRule, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostDedupBusinessRule(BusinessRule newPostDedupBusinessRule) {
		if (newPostDedupBusinessRule != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE && newPostDedupBusinessRule != null)) {
			if (EcoreUtil.isAncestor(this, newPostDedupBusinessRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostDedupBusinessRule != null)
				msgs = ((InternalEObject)newPostDedupBusinessRule).eInverseAdd(this, SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, BusinessRule.class, msgs);
			msgs = basicSetPostDedupBusinessRule(newPostDedupBusinessRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE, newPostDedupBusinessRule, newPostDedupBusinessRule));
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
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreDedupBusinessRule((BusinessRule)otherEnd, msgs);
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPostDedupBusinessRule((BusinessRule)otherEnd, msgs);
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
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE:
				return basicSetPreDedupBusinessRule(null, msgs);
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE:
				return basicSetPostDedupBusinessRule(null, msgs);
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
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, BusinessRule.class, msgs);
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, BusinessRule.class, msgs);
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
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE:
				return getPreDedupBusinessRule();
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE:
				return getPostDedupBusinessRule();
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
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE:
				setPreDedupBusinessRule((BusinessRule)newValue);
				return;
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE:
				setPostDedupBusinessRule((BusinessRule)newValue);
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
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE:
				setPreDedupBusinessRule((BusinessRule)null);
				return;
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE:
				setPostDedupBusinessRule((BusinessRule)null);
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
			case SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE:
				return getPreDedupBusinessRule() != null;
			case SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE:
				return getPostDedupBusinessRule() != null;
			case SpecmodelPackage.DEDUP__FIELD:
				return field != null;
		}
		return super.eIsSet(featureID);
	}

} //DedupImpl
