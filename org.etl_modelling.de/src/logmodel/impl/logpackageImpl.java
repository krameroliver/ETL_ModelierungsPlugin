/**
 */
package logmodel.impl;

import java.util.Collection;

import logmodel.CommonMapping;
import logmodel.Entity;
import logmodel.LogmodelPackage;
import logmodel.logpackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>logpackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmodel.impl.logpackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link logmodel.impl.logpackageImpl#getLAYER <em>LAYER</em>}</li>
 *   <li>{@link logmodel.impl.logpackageImpl#getLAYER_TYPE <em>LAYER TYPE</em>}</li>
 *   <li>{@link logmodel.impl.logpackageImpl#getHISTORISATION <em>HISTORISATION</em>}</li>
 *   <li>{@link logmodel.impl.logpackageImpl#getREPRESENTATION <em>REPRESENTATION</em>}</li>
 *   <li>{@link logmodel.impl.logpackageImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link logmodel.impl.logpackageImpl#getCommonmapping <em>Commonmapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class logpackageImpl extends MinimalEObjectImpl.Container implements logpackage {
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getCommonmapping() <em>Commonmapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonmapping()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonMapping> commonmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected logpackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmodelPackage.Literals.LOGPACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.LOGPACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.LOGPACKAGE__LAYER, oldLAYER, layer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.LOGPACKAGE__LAYER_TYPE, oldLAYER_TYPE, layeR_TYPE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.LOGPACKAGE__HISTORISATION, oldHISTORISATION, historisation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.LOGPACKAGE__REPRESENTATION, oldREPRESENTATION, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this, LogmodelPackage.LOGPACKAGE__ENTITY, LogmodelPackage.ENTITY__LOGPACKAGE);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommonMapping> getCommonmapping() {
		if (commonmapping == null) {
			commonmapping = new EObjectContainmentWithInverseEList<CommonMapping>(CommonMapping.class, this, LogmodelPackage.LOGPACKAGE__COMMONMAPPING, LogmodelPackage.COMMON_MAPPING__LOGPACKAGE);
		}
		return commonmapping;
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
			case LogmodelPackage.LOGPACKAGE__ENTITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntity()).basicAdd(otherEnd, msgs);
			case LogmodelPackage.LOGPACKAGE__COMMONMAPPING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommonmapping()).basicAdd(otherEnd, msgs);
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
			case LogmodelPackage.LOGPACKAGE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case LogmodelPackage.LOGPACKAGE__COMMONMAPPING:
				return ((InternalEList<?>)getCommonmapping()).basicRemove(otherEnd, msgs);
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
			case LogmodelPackage.LOGPACKAGE__NAME:
				return getName();
			case LogmodelPackage.LOGPACKAGE__LAYER:
				return getLAYER();
			case LogmodelPackage.LOGPACKAGE__LAYER_TYPE:
				return getLAYER_TYPE();
			case LogmodelPackage.LOGPACKAGE__HISTORISATION:
				return getHISTORISATION();
			case LogmodelPackage.LOGPACKAGE__REPRESENTATION:
				return getREPRESENTATION();
			case LogmodelPackage.LOGPACKAGE__ENTITY:
				return getEntity();
			case LogmodelPackage.LOGPACKAGE__COMMONMAPPING:
				return getCommonmapping();
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
			case LogmodelPackage.LOGPACKAGE__NAME:
				setName((String)newValue);
				return;
			case LogmodelPackage.LOGPACKAGE__LAYER:
				setLAYER((String)newValue);
				return;
			case LogmodelPackage.LOGPACKAGE__LAYER_TYPE:
				setLAYER_TYPE((LAYERTYPE)newValue);
				return;
			case LogmodelPackage.LOGPACKAGE__HISTORISATION:
				setHISTORISATION((HISTORISATIONTYPE)newValue);
				return;
			case LogmodelPackage.LOGPACKAGE__REPRESENTATION:
				setREPRESENTATION((REPRESENTATIONS)newValue);
				return;
			case LogmodelPackage.LOGPACKAGE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case LogmodelPackage.LOGPACKAGE__COMMONMAPPING:
				getCommonmapping().clear();
				getCommonmapping().addAll((Collection<? extends CommonMapping>)newValue);
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
			case LogmodelPackage.LOGPACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogmodelPackage.LOGPACKAGE__LAYER:
				setLAYER(LAYER_EDEFAULT);
				return;
			case LogmodelPackage.LOGPACKAGE__LAYER_TYPE:
				setLAYER_TYPE(LAYER_TYPE_EDEFAULT);
				return;
			case LogmodelPackage.LOGPACKAGE__HISTORISATION:
				setHISTORISATION(HISTORISATION_EDEFAULT);
				return;
			case LogmodelPackage.LOGPACKAGE__REPRESENTATION:
				setREPRESENTATION(REPRESENTATION_EDEFAULT);
				return;
			case LogmodelPackage.LOGPACKAGE__ENTITY:
				getEntity().clear();
				return;
			case LogmodelPackage.LOGPACKAGE__COMMONMAPPING:
				getCommonmapping().clear();
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
			case LogmodelPackage.LOGPACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogmodelPackage.LOGPACKAGE__LAYER:
				return LAYER_EDEFAULT == null ? layer != null : !LAYER_EDEFAULT.equals(layer);
			case LogmodelPackage.LOGPACKAGE__LAYER_TYPE:
				return layeR_TYPE != LAYER_TYPE_EDEFAULT;
			case LogmodelPackage.LOGPACKAGE__HISTORISATION:
				return historisation != HISTORISATION_EDEFAULT;
			case LogmodelPackage.LOGPACKAGE__REPRESENTATION:
				return representation != REPRESENTATION_EDEFAULT;
			case LogmodelPackage.LOGPACKAGE__ENTITY:
				return entity != null && !entity.isEmpty();
			case LogmodelPackage.LOGPACKAGE__COMMONMAPPING:
				return commonmapping != null && !commonmapping.isEmpty();
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

} //logpackageImpl
