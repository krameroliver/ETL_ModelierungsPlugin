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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import specmodel.BusinessRule;
import specmodel.Source;
import specmodel.SpecPackage;
import specmodel.Specification;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.SpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link specmodel.impl.SpecificationImpl#getSpecpackage <em>Specpackage</em>}</li>
 *   <li>{@link specmodel.impl.SpecificationImpl#getBusinessrules <em>Businessrules</em>}</li>
 *   <li>{@link specmodel.impl.SpecificationImpl#getPrimarySources <em>Primary Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends MinimalEObjectImpl.Container implements Specification {
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
	 * The cached value of the '{@link #getBusinessrules() <em>Businessrules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessrules()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRule> businessrules;

	/**
	 * The cached value of the '{@link #getPrimarySources() <em>Primary Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySources()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> primarySources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecPackage getSpecpackage() {
		if (eContainerFeatureID() != SpecmodelPackage.SPECIFICATION__SPECPACKAGE) return null;
		return (SpecPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecpackage(SpecPackage newSpecpackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecpackage, SpecmodelPackage.SPECIFICATION__SPECPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecpackage(SpecPackage newSpecpackage) {
		if (newSpecpackage != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.SPECIFICATION__SPECPACKAGE && newSpecpackage != null)) {
			if (EcoreUtil.isAncestor(this, newSpecpackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecpackage != null)
				msgs = ((InternalEObject)newSpecpackage).eInverseAdd(this, SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS, SpecPackage.class, msgs);
			msgs = basicSetSpecpackage(newSpecpackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SPECIFICATION__SPECPACKAGE, newSpecpackage, newSpecpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusinessRule> getBusinessrules() {
		if (businessrules == null) {
			businessrules = new EObjectContainmentWithInverseEList<BusinessRule>(BusinessRule.class, this, SpecmodelPackage.SPECIFICATION__BUSINESSRULES, SpecmodelPackage.BUSINESS_RULE__SPECIFICATION);
		}
		return businessrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Source> getPrimarySources() {
		if (primarySources == null) {
			primarySources = new EObjectContainmentWithInverseEList<Source>(Source.class, this, SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCES, SpecmodelPackage.SOURCE__SPECIFICATION);
		}
		return primarySources;
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
			case SpecmodelPackage.SPECIFICATION__SPECPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecpackage((SpecPackage)otherEnd, msgs);
			case SpecmodelPackage.SPECIFICATION__BUSINESSRULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessrules()).basicAdd(otherEnd, msgs);
			case SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrimarySources()).basicAdd(otherEnd, msgs);
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
			case SpecmodelPackage.SPECIFICATION__SPECPACKAGE:
				return basicSetSpecpackage(null, msgs);
			case SpecmodelPackage.SPECIFICATION__BUSINESSRULES:
				return ((InternalEList<?>)getBusinessrules()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCES:
				return ((InternalEList<?>)getPrimarySources()).basicRemove(otherEnd, msgs);
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
			case SpecmodelPackage.SPECIFICATION__SPECPACKAGE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS, SpecPackage.class, msgs);
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
			case SpecmodelPackage.SPECIFICATION__NAME:
				return getName();
			case SpecmodelPackage.SPECIFICATION__SPECPACKAGE:
				return getSpecpackage();
			case SpecmodelPackage.SPECIFICATION__BUSINESSRULES:
				return getBusinessrules();
			case SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCES:
				return getPrimarySources();
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
			case SpecmodelPackage.SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case SpecmodelPackage.SPECIFICATION__SPECPACKAGE:
				setSpecpackage((SpecPackage)newValue);
				return;
			case SpecmodelPackage.SPECIFICATION__BUSINESSRULES:
				getBusinessrules().clear();
				getBusinessrules().addAll((Collection<? extends BusinessRule>)newValue);
				return;
			case SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCES:
				getPrimarySources().clear();
				getPrimarySources().addAll((Collection<? extends Source>)newValue);
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
			case SpecmodelPackage.SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecmodelPackage.SPECIFICATION__SPECPACKAGE:
				setSpecpackage((SpecPackage)null);
				return;
			case SpecmodelPackage.SPECIFICATION__BUSINESSRULES:
				getBusinessrules().clear();
				return;
			case SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCES:
				getPrimarySources().clear();
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
			case SpecmodelPackage.SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecmodelPackage.SPECIFICATION__SPECPACKAGE:
				return getSpecpackage() != null;
			case SpecmodelPackage.SPECIFICATION__BUSINESSRULES:
				return businessrules != null && !businessrules.isEmpty();
			case SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCES:
				return primarySources != null && !primarySources.isEmpty();
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

} //SpecificationImpl
