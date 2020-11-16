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
import specmodel.Filter;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.FilterImpl#getField <em>Field</em>}</li>
 *   <li>{@link specmodel.impl.FilterImpl#getPreFilterBusinessRule <em>Pre Filter Business Rule</em>}</li>
 *   <li>{@link specmodel.impl.FilterImpl#getPostFilterBusinessRule <em>Post Filter Business Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends MinimalEObjectImpl.Container implements Filter {
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
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.FILTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.FILTER__FIELD, oldField, field));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.FILTER__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRule getPreFilterBusinessRule() {
		if (eContainerFeatureID() != SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE) return null;
		return (BusinessRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreFilterBusinessRule(BusinessRule newPreFilterBusinessRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreFilterBusinessRule, SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreFilterBusinessRule(BusinessRule newPreFilterBusinessRule) {
		if (newPreFilterBusinessRule != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE && newPreFilterBusinessRule != null)) {
			if (EcoreUtil.isAncestor(this, newPreFilterBusinessRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreFilterBusinessRule != null)
				msgs = ((InternalEObject)newPreFilterBusinessRule).eInverseAdd(this, SpecmodelPackage.BUSINESS_RULE__PRE_FILTER, BusinessRule.class, msgs);
			msgs = basicSetPreFilterBusinessRule(newPreFilterBusinessRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE, newPreFilterBusinessRule, newPreFilterBusinessRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRule getPostFilterBusinessRule() {
		if (eContainerFeatureID() != SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE) return null;
		return (BusinessRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostFilterBusinessRule(BusinessRule newPostFilterBusinessRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPostFilterBusinessRule, SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostFilterBusinessRule(BusinessRule newPostFilterBusinessRule) {
		if (newPostFilterBusinessRule != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE && newPostFilterBusinessRule != null)) {
			if (EcoreUtil.isAncestor(this, newPostFilterBusinessRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostFilterBusinessRule != null)
				msgs = ((InternalEObject)newPostFilterBusinessRule).eInverseAdd(this, SpecmodelPackage.BUSINESS_RULE__POST_FILTER, BusinessRule.class, msgs);
			msgs = basicSetPostFilterBusinessRule(newPostFilterBusinessRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE, newPostFilterBusinessRule, newPostFilterBusinessRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreFilterBusinessRule((BusinessRule)otherEnd, msgs);
			case SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPostFilterBusinessRule((BusinessRule)otherEnd, msgs);
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
			case SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE:
				return basicSetPreFilterBusinessRule(null, msgs);
			case SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE:
				return basicSetPostFilterBusinessRule(null, msgs);
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
			case SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.BUSINESS_RULE__PRE_FILTER, BusinessRule.class, msgs);
			case SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.BUSINESS_RULE__POST_FILTER, BusinessRule.class, msgs);
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
			case SpecmodelPackage.FILTER__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE:
				return getPreFilterBusinessRule();
			case SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE:
				return getPostFilterBusinessRule();
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
			case SpecmodelPackage.FILTER__FIELD:
				setField((Field)newValue);
				return;
			case SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE:
				setPreFilterBusinessRule((BusinessRule)newValue);
				return;
			case SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE:
				setPostFilterBusinessRule((BusinessRule)newValue);
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
			case SpecmodelPackage.FILTER__FIELD:
				setField((Field)null);
				return;
			case SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE:
				setPreFilterBusinessRule((BusinessRule)null);
				return;
			case SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE:
				setPostFilterBusinessRule((BusinessRule)null);
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
			case SpecmodelPackage.FILTER__FIELD:
				return field != null;
			case SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE:
				return getPreFilterBusinessRule() != null;
			case SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE:
				return getPostFilterBusinessRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterImpl
