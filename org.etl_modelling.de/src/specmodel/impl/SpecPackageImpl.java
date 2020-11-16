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
import org.eclipse.emf.ecore.util.InternalEList;

import package_enums.HISTORISATIONTYPE;
import package_enums.LAYERTYPE;
import package_enums.REPRESENTATIONS;

import specmodel.SpecPackage;
import specmodel.Specification;
import specmodel.SpecmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.SpecPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link specmodel.impl.SpecPackageImpl#getLAYER <em>LAYER</em>}</li>
 *   <li>{@link specmodel.impl.SpecPackageImpl#getLAYER_TYPE <em>LAYER TYPE</em>}</li>
 *   <li>{@link specmodel.impl.SpecPackageImpl#getHISTORISATION <em>HISTORISATION</em>}</li>
 *   <li>{@link specmodel.impl.SpecPackageImpl#getREPRESENTATION <em>REPRESENTATION</em>}</li>
 *   <li>{@link specmodel.impl.SpecPackageImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecPackageImpl extends MinimalEObjectImpl.Container implements SpecPackage {
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
	 * The default value of the '{@link #getLAYER() <em>LAYER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAYER()
	 * @generated
	 * @ordered
	 */
	protected static final String LAYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLAYER() <em>LAYER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAYER()
	 * @generated
	 * @ordered
	 */
	protected String layer = LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLAYER_TYPE() <em>LAYER TYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAYER_TYPE()
	 * @generated
	 * @ordered
	 */
	protected static final LAYERTYPE LAYER_TYPE_EDEFAULT = LAYERTYPE.STAGE;

	/**
	 * The cached value of the '{@link #getLAYER_TYPE() <em>LAYER TYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAYER_TYPE()
	 * @generated
	 * @ordered
	 */
	protected LAYERTYPE layeR_TYPE = LAYER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHISTORISATION() <em>HISTORISATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHISTORISATION()
	 * @generated
	 * @ordered
	 */
	protected static final HISTORISATIONTYPE HISTORISATION_EDEFAULT = HISTORISATIONTYPE.NONE;

	/**
	 * The cached value of the '{@link #getHISTORISATION() <em>HISTORISATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHISTORISATION()
	 * @generated
	 * @ordered
	 */
	protected HISTORISATIONTYPE historisation = HISTORISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getREPRESENTATION() <em>REPRESENTATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREPRESENTATION()
	 * @generated
	 * @ordered
	 */
	protected static final REPRESENTATIONS REPRESENTATION_EDEFAULT = REPRESENTATIONS.FLAT_TABLE;

	/**
	 * The cached value of the '{@link #getREPRESENTATION() <em>REPRESENTATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREPRESENTATION()
	 * @generated
	 * @ordered
	 */
	protected REPRESENTATIONS representation = REPRESENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.SPEC_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SPEC_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLAYER() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLAYER(String newLAYER) {
		String oldLAYER = layer;
		layer = newLAYER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SPEC_PACKAGE__LAYER, oldLAYER, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LAYERTYPE getLAYER_TYPE() {
		return layeR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLAYER_TYPE(LAYERTYPE newLAYER_TYPE) {
		LAYERTYPE oldLAYER_TYPE = layeR_TYPE;
		layeR_TYPE = newLAYER_TYPE == null ? LAYER_TYPE_EDEFAULT : newLAYER_TYPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SPEC_PACKAGE__LAYER_TYPE, oldLAYER_TYPE, layeR_TYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HISTORISATIONTYPE getHISTORISATION() {
		return historisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHISTORISATION(HISTORISATIONTYPE newHISTORISATION) {
		HISTORISATIONTYPE oldHISTORISATION = historisation;
		historisation = newHISTORISATION == null ? HISTORISATION_EDEFAULT : newHISTORISATION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SPEC_PACKAGE__HISTORISATION, oldHISTORISATION, historisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public REPRESENTATIONS getREPRESENTATION() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setREPRESENTATION(REPRESENTATIONS newREPRESENTATION) {
		REPRESENTATIONS oldREPRESENTATION = representation;
		representation = newREPRESENTATION == null ? REPRESENTATION_EDEFAULT : newREPRESENTATION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SPEC_PACKAGE__REPRESENTATION, oldREPRESENTATION, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectContainmentWithInverseEList<Specification>(Specification.class, this, SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS, SpecmodelPackage.SPECIFICATION__SPECPACKAGE);
		}
		return specifications;
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
			case SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifications()).basicAdd(otherEnd, msgs);
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
			case SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
			case SpecmodelPackage.SPEC_PACKAGE__NAME:
				return getName();
			case SpecmodelPackage.SPEC_PACKAGE__LAYER:
				return getLAYER();
			case SpecmodelPackage.SPEC_PACKAGE__LAYER_TYPE:
				return getLAYER_TYPE();
			case SpecmodelPackage.SPEC_PACKAGE__HISTORISATION:
				return getHISTORISATION();
			case SpecmodelPackage.SPEC_PACKAGE__REPRESENTATION:
				return getREPRESENTATION();
			case SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS:
				return getSpecifications();
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
			case SpecmodelPackage.SPEC_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__LAYER:
				setLAYER((String)newValue);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__LAYER_TYPE:
				setLAYER_TYPE((LAYERTYPE)newValue);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__HISTORISATION:
				setHISTORISATION((HISTORISATIONTYPE)newValue);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__REPRESENTATION:
				setREPRESENTATION((REPRESENTATIONS)newValue);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
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
			case SpecmodelPackage.SPEC_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__LAYER:
				setLAYER(LAYER_EDEFAULT);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__LAYER_TYPE:
				setLAYER_TYPE(LAYER_TYPE_EDEFAULT);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__HISTORISATION:
				setHISTORISATION(HISTORISATION_EDEFAULT);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__REPRESENTATION:
				setREPRESENTATION(REPRESENTATION_EDEFAULT);
				return;
			case SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS:
				getSpecifications().clear();
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
			case SpecmodelPackage.SPEC_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecmodelPackage.SPEC_PACKAGE__LAYER:
				return LAYER_EDEFAULT == null ? layer != null : !LAYER_EDEFAULT.equals(layer);
			case SpecmodelPackage.SPEC_PACKAGE__LAYER_TYPE:
				return layeR_TYPE != LAYER_TYPE_EDEFAULT;
			case SpecmodelPackage.SPEC_PACKAGE__HISTORISATION:
				return historisation != HISTORISATION_EDEFAULT;
			case SpecmodelPackage.SPEC_PACKAGE__REPRESENTATION:
				return representation != REPRESENTATION_EDEFAULT;
			case SpecmodelPackage.SPEC_PACKAGE__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
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
		result.append(", LAYER: ");
		result.append(layer);
		result.append(", LAYER_TYPE: ");
		result.append(layeR_TYPE);
		result.append(", HISTORISATION: ");
		result.append(historisation);
		result.append(", REPRESENTATION: ");
		result.append(representation);
		result.append(')');
		return result.toString();
	}

} //SpecPackageImpl
