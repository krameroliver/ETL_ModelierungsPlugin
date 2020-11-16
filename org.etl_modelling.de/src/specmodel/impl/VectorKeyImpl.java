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
import specmodel.Source;
import specmodel.SpecmodelPackage;
import specmodel.VectorKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.VectorKeyImpl#getBusinessrule <em>Businessrule</em>}</li>
 *   <li>{@link specmodel.impl.VectorKeyImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorKeyImpl extends MinimalEObjectImpl.Container implements VectorKey {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.VECTOR_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRule getBusinessrule() {
		if (eContainerFeatureID() != SpecmodelPackage.VECTOR_KEY__BUSINESSRULE) return null;
		return (BusinessRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessrule(BusinessRule newBusinessrule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBusinessrule, SpecmodelPackage.VECTOR_KEY__BUSINESSRULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessrule(BusinessRule newBusinessrule) {
		if (newBusinessrule != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.VECTOR_KEY__BUSINESSRULE && newBusinessrule != null)) {
			if (EcoreUtil.isAncestor(this, newBusinessrule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBusinessrule != null)
				msgs = ((InternalEObject)newBusinessrule).eInverseAdd(this, SpecmodelPackage.BUSINESS_RULE__VECTORKEYS, BusinessRule.class, msgs);
			msgs = basicSetBusinessrule(newBusinessrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.VECTOR_KEY__BUSINESSRULE, newBusinessrule, newBusinessrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Source)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.VECTOR_KEY__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.VECTOR_KEY__SOURCE, oldSource, newSource);
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
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, SpecmodelPackage.SOURCE__VECTORKEYS, Source.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, SpecmodelPackage.SOURCE__VECTORKEYS, Source.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.VECTOR_KEY__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecmodelPackage.VECTOR_KEY__BUSINESSRULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBusinessrule((BusinessRule)otherEnd, msgs);
			case SpecmodelPackage.VECTOR_KEY__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, SpecmodelPackage.SOURCE__VECTORKEYS, Source.class, msgs);
				return basicSetSource((Source)otherEnd, msgs);
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
			case SpecmodelPackage.VECTOR_KEY__BUSINESSRULE:
				return basicSetBusinessrule(null, msgs);
			case SpecmodelPackage.VECTOR_KEY__SOURCE:
				return basicSetSource(null, msgs);
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
			case SpecmodelPackage.VECTOR_KEY__BUSINESSRULE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.BUSINESS_RULE__VECTORKEYS, BusinessRule.class, msgs);
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
			case SpecmodelPackage.VECTOR_KEY__BUSINESSRULE:
				return getBusinessrule();
			case SpecmodelPackage.VECTOR_KEY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case SpecmodelPackage.VECTOR_KEY__BUSINESSRULE:
				setBusinessrule((BusinessRule)newValue);
				return;
			case SpecmodelPackage.VECTOR_KEY__SOURCE:
				setSource((Source)newValue);
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
			case SpecmodelPackage.VECTOR_KEY__BUSINESSRULE:
				setBusinessrule((BusinessRule)null);
				return;
			case SpecmodelPackage.VECTOR_KEY__SOURCE:
				setSource((Source)null);
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
			case SpecmodelPackage.VECTOR_KEY__BUSINESSRULE:
				return getBusinessrule() != null;
			case SpecmodelPackage.VECTOR_KEY__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //VectorKeyImpl
