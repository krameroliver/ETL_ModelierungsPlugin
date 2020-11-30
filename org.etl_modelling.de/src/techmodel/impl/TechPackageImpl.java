/**
 */
package techmodel.impl;

import java.util.Collection;

import logmodel.Entity;
import logmodel.LogmodelPackage;
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
import techmodel.Table;
import techmodel.TechPackage;
import techmodel.TechmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link techmodel.impl.TechPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link techmodel.impl.TechPackageImpl#getLAYER <em>LAYER</em>}</li>
 *   <li>{@link techmodel.impl.TechPackageImpl#getLAYER_TYPE <em>LAYER TYPE</em>}</li>
 *   <li>{@link techmodel.impl.TechPackageImpl#getHISTORISATION <em>HISTORISATION</em>}</li>
 *   <li>{@link techmodel.impl.TechPackageImpl#getREPRESENTATION <em>REPRESENTATION</em>}</li>
 *   <li>{@link techmodel.impl.TechPackageImpl#getEntitys <em>Entitys</em>}</li>
 *   <li>{@link techmodel.impl.TechPackageImpl#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechPackageImpl extends MinimalEObjectImpl.Container implements TechPackage {
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
	 * The cached value of the '{@link #getEntitys() <em>Entitys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitys()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entitys;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechmodelPackage.Literals.TECH_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TECH_PACKAGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TECH_PACKAGE__LAYER, oldLAYER, layer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TECH_PACKAGE__LAYER_TYPE, oldLAYER_TYPE, layeR_TYPE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TECH_PACKAGE__HISTORISATION, oldHISTORISATION, historisation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TechmodelPackage.TECH_PACKAGE__REPRESENTATION, oldREPRESENTATION, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntitys() {
		if (entitys == null) {
			entitys = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this, TechmodelPackage.TECH_PACKAGE__ENTITYS, LogmodelPackage.ENTITY__TECHPACKAGE);
		}
		return entitys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentWithInverseEList<Table>(Table.class, this, TechmodelPackage.TECH_PACKAGE__TABLES, TechmodelPackage.TABLE__TECHPACKAGE);
		}
		return tables;
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
			case TechmodelPackage.TECH_PACKAGE__ENTITYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntitys()).basicAdd(otherEnd, msgs);
			case TechmodelPackage.TECH_PACKAGE__TABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTables()).basicAdd(otherEnd, msgs);
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
			case TechmodelPackage.TECH_PACKAGE__ENTITYS:
				return ((InternalEList<?>)getEntitys()).basicRemove(otherEnd, msgs);
			case TechmodelPackage.TECH_PACKAGE__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
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
			case TechmodelPackage.TECH_PACKAGE__NAME:
				return getName();
			case TechmodelPackage.TECH_PACKAGE__LAYER:
				return getLAYER();
			case TechmodelPackage.TECH_PACKAGE__LAYER_TYPE:
				return getLAYER_TYPE();
			case TechmodelPackage.TECH_PACKAGE__HISTORISATION:
				return getHISTORISATION();
			case TechmodelPackage.TECH_PACKAGE__REPRESENTATION:
				return getREPRESENTATION();
			case TechmodelPackage.TECH_PACKAGE__ENTITYS:
				return getEntitys();
			case TechmodelPackage.TECH_PACKAGE__TABLES:
				return getTables();
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
			case TechmodelPackage.TECH_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case TechmodelPackage.TECH_PACKAGE__LAYER:
				setLAYER((String)newValue);
				return;
			case TechmodelPackage.TECH_PACKAGE__LAYER_TYPE:
				setLAYER_TYPE((LAYERTYPE)newValue);
				return;
			case TechmodelPackage.TECH_PACKAGE__HISTORISATION:
				setHISTORISATION((HISTORISATIONTYPE)newValue);
				return;
			case TechmodelPackage.TECH_PACKAGE__REPRESENTATION:
				setREPRESENTATION((REPRESENTATIONS)newValue);
				return;
			case TechmodelPackage.TECH_PACKAGE__ENTITYS:
				getEntitys().clear();
				getEntitys().addAll((Collection<? extends Entity>)newValue);
				return;
			case TechmodelPackage.TECH_PACKAGE__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends Table>)newValue);
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
			case TechmodelPackage.TECH_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TechmodelPackage.TECH_PACKAGE__LAYER:
				setLAYER(LAYER_EDEFAULT);
				return;
			case TechmodelPackage.TECH_PACKAGE__LAYER_TYPE:
				setLAYER_TYPE(LAYER_TYPE_EDEFAULT);
				return;
			case TechmodelPackage.TECH_PACKAGE__HISTORISATION:
				setHISTORISATION(HISTORISATION_EDEFAULT);
				return;
			case TechmodelPackage.TECH_PACKAGE__REPRESENTATION:
				setREPRESENTATION(REPRESENTATION_EDEFAULT);
				return;
			case TechmodelPackage.TECH_PACKAGE__ENTITYS:
				getEntitys().clear();
				return;
			case TechmodelPackage.TECH_PACKAGE__TABLES:
				getTables().clear();
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
			case TechmodelPackage.TECH_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TechmodelPackage.TECH_PACKAGE__LAYER:
				return LAYER_EDEFAULT == null ? layer != null : !LAYER_EDEFAULT.equals(layer);
			case TechmodelPackage.TECH_PACKAGE__LAYER_TYPE:
				return layeR_TYPE != LAYER_TYPE_EDEFAULT;
			case TechmodelPackage.TECH_PACKAGE__HISTORISATION:
				return historisation != HISTORISATION_EDEFAULT;
			case TechmodelPackage.TECH_PACKAGE__REPRESENTATION:
				return representation != REPRESENTATION_EDEFAULT;
			case TechmodelPackage.TECH_PACKAGE__ENTITYS:
				return entitys != null && !entitys.isEmpty();
			case TechmodelPackage.TECH_PACKAGE__TABLES:
				return tables != null && !tables.isEmpty();
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

} //TechPackageImpl
