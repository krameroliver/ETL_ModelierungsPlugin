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

import specmodel.ReadEntitySpecification;
import specmodel.Source;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Entity Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.ReadEntitySpecificationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link specmodel.impl.ReadEntitySpecificationImpl#isReadKeySats <em>Read Key Sats</em>}</li>
 *   <li>{@link specmodel.impl.ReadEntitySpecificationImpl#getReadKeySatsReason <em>Read Key Sats Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadEntitySpecificationImpl extends MinimalEObjectImpl.Container implements ReadEntitySpecification {
	/**
	 * The default value of the '{@link #isReadKeySats() <em>Read Key Sats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadKeySats()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_KEY_SATS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReadKeySats() <em>Read Key Sats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadKeySats()
	 * @generated
	 * @ordered
	 */
	protected boolean readKeySats = READ_KEY_SATS_EDEFAULT;
	/**
	 * The default value of the '{@link #getReadKeySatsReason() <em>Read Key Sats Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadKeySatsReason()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_KEY_SATS_REASON_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReadKeySatsReason() <em>Read Key Sats Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadKeySatsReason()
	 * @generated
	 * @ordered
	 */
	protected String readKeySatsReason = READ_KEY_SATS_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadEntitySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.READ_ENTITY_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getSource() {
		if (eContainerFeatureID() != SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE) return null;
		return (Source)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Source newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, SpecmodelPackage.SOURCE__READENTITYSPECIFICATION, Source.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadKeySats() {
		return readKeySats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadKeySats(boolean newReadKeySats) {
		boolean oldReadKeySats = readKeySats;
		readKeySats = newReadKeySats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS, oldReadKeySats, readKeySats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadKeySatsReason() {
		return readKeySatsReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadKeySatsReason(String newReadKeySatsReason) {
		String oldReadKeySatsReason = readKeySatsReason;
		readKeySatsReason = newReadKeySatsReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS_REASON, oldReadKeySatsReason, readKeySatsReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE:
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
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.SOURCE__READENTITYSPECIFICATION, Source.class, msgs);
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
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE:
				return getSource();
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS:
				return isReadKeySats();
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS_REASON:
				return getReadKeySatsReason();
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
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE:
				setSource((Source)newValue);
				return;
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS:
				setReadKeySats((Boolean)newValue);
				return;
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS_REASON:
				setReadKeySatsReason((String)newValue);
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
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE:
				setSource((Source)null);
				return;
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS:
				setReadKeySats(READ_KEY_SATS_EDEFAULT);
				return;
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS_REASON:
				setReadKeySatsReason(READ_KEY_SATS_REASON_EDEFAULT);
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
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE:
				return getSource() != null;
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS:
				return readKeySats != READ_KEY_SATS_EDEFAULT;
			case SpecmodelPackage.READ_ENTITY_SPECIFICATION__READ_KEY_SATS_REASON:
				return READ_KEY_SATS_REASON_EDEFAULT == null ? readKeySatsReason != null : !READ_KEY_SATS_REASON_EDEFAULT.equals(readKeySatsReason);
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
		result.append(" (ReadKeySats: ");
		result.append(readKeySats);
		result.append(", ReadKeySatsReason: ");
		result.append(readKeySatsReason);
		result.append(')');
		return result.toString();
	}

} //ReadEntitySpecificationImpl
