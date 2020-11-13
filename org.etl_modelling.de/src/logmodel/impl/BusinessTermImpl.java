/**
 */
package logmodel.impl;

import logmodel.BusinessTerm;
import logmodel.Field;
import logmodel.LogmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getName <em>Name</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getState <em>State</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getPrimaryFdmID <em>Primary Fdm ID</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getPrimaryFDMName <em>Primary FDM Name</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getFunctionalSpecification <em>Functional Specification</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getRegulatoryRequirements <em>Regulatory Requirements</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getDataOwner <em>Data Owner</em>}</li>
 *   <li>{@link logmodel.impl.BusinessTermImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessTermImpl extends MinimalEObjectImpl.Container implements BusinessTerm {
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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryFdmID() <em>Primary Fdm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFdmID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_FDM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryFdmID() <em>Primary Fdm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFdmID()
	 * @generated
	 * @ordered
	 */
	protected String primaryFdmID = PRIMARY_FDM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected String groupID = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryFDMName() <em>Primary FDM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFDMName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_FDM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryFDMName() <em>Primary FDM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFDMName()
	 * @generated
	 * @ordered
	 */
	protected String primaryFDMName = PRIMARY_FDM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedBy() <em>Used By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String USED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedBy() <em>Used By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBy()
	 * @generated
	 * @ordered
	 */
	protected String usedBy = USED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionalSpecification() <em>Functional Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionalSpecification() <em>Functional Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalSpecification()
	 * @generated
	 * @ordered
	 */
	protected String functionalSpecification = FUNCTIONAL_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegulatoryRequirements() <em>Regulatory Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final String REGULATORY_REQUIREMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegulatoryRequirements() <em>Regulatory Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryRequirements()
	 * @generated
	 * @ordered
	 */
	protected String regulatoryRequirements = REGULATORY_REQUIREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataOwner() <em>Data Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataOwner() <em>Data Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOwner()
	 * @generated
	 * @ordered
	 */
	protected String dataOwner = DATA_OWNER_EDEFAULT;

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
	protected BusinessTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmodelPackage.Literals.BUSINESS_TERM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryFdmID() {
		return primaryFdmID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryFdmID(String newPrimaryFdmID) {
		String oldPrimaryFdmID = primaryFdmID;
		primaryFdmID = newPrimaryFdmID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_ID, oldPrimaryFdmID, primaryFdmID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupID() {
		return groupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupID(String newGroupID) {
		String oldGroupID = groupID;
		groupID = newGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__GROUP_ID, oldGroupID, groupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryFDMName() {
		return primaryFDMName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryFDMName(String newPrimaryFDMName) {
		String oldPrimaryFDMName = primaryFDMName;
		primaryFDMName = newPrimaryFDMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_NAME, oldPrimaryFDMName, primaryFDMName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsedBy() {
		return usedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedBy(String newUsedBy) {
		String oldUsedBy = usedBy;
		usedBy = newUsedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__USED_BY, oldUsedBy, usedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunctionalSpecification() {
		return functionalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionalSpecification(String newFunctionalSpecification) {
		String oldFunctionalSpecification = functionalSpecification;
		functionalSpecification = newFunctionalSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__FUNCTIONAL_SPECIFICATION, oldFunctionalSpecification, functionalSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegulatoryRequirements() {
		return regulatoryRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegulatoryRequirements(String newRegulatoryRequirements) {
		String oldRegulatoryRequirements = regulatoryRequirements;
		regulatoryRequirements = newRegulatoryRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__REGULATORY_REQUIREMENTS, oldRegulatoryRequirements, regulatoryRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataOwner() {
		return dataOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataOwner(String newDataOwner) {
		String oldDataOwner = dataOwner;
		dataOwner = newDataOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__DATA_OWNER, oldDataOwner, dataOwner));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogmodelPackage.BUSINESS_TERM__FIELD, oldField, field));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.BUSINESS_TERM__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogmodelPackage.BUSINESS_TERM__NAME:
				return getName();
			case LogmodelPackage.BUSINESS_TERM__STATE:
				return getState();
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_ID:
				return getPrimaryFdmID();
			case LogmodelPackage.BUSINESS_TERM__GROUP_ID:
				return getGroupID();
			case LogmodelPackage.BUSINESS_TERM__DESCRIPTION:
				return getDescription();
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_NAME:
				return getPrimaryFDMName();
			case LogmodelPackage.BUSINESS_TERM__USED_BY:
				return getUsedBy();
			case LogmodelPackage.BUSINESS_TERM__FUNCTIONAL_SPECIFICATION:
				return getFunctionalSpecification();
			case LogmodelPackage.BUSINESS_TERM__REGULATORY_REQUIREMENTS:
				return getRegulatoryRequirements();
			case LogmodelPackage.BUSINESS_TERM__DATA_OWNER:
				return getDataOwner();
			case LogmodelPackage.BUSINESS_TERM__FIELD:
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
			case LogmodelPackage.BUSINESS_TERM__NAME:
				setName((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__STATE:
				setState((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_ID:
				setPrimaryFdmID((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__GROUP_ID:
				setGroupID((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_NAME:
				setPrimaryFDMName((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__USED_BY:
				setUsedBy((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__FUNCTIONAL_SPECIFICATION:
				setFunctionalSpecification((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__REGULATORY_REQUIREMENTS:
				setRegulatoryRequirements((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__DATA_OWNER:
				setDataOwner((String)newValue);
				return;
			case LogmodelPackage.BUSINESS_TERM__FIELD:
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
			case LogmodelPackage.BUSINESS_TERM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__STATE:
				setState(STATE_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_ID:
				setPrimaryFdmID(PRIMARY_FDM_ID_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__GROUP_ID:
				setGroupID(GROUP_ID_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_NAME:
				setPrimaryFDMName(PRIMARY_FDM_NAME_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__USED_BY:
				setUsedBy(USED_BY_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__FUNCTIONAL_SPECIFICATION:
				setFunctionalSpecification(FUNCTIONAL_SPECIFICATION_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__REGULATORY_REQUIREMENTS:
				setRegulatoryRequirements(REGULATORY_REQUIREMENTS_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__DATA_OWNER:
				setDataOwner(DATA_OWNER_EDEFAULT);
				return;
			case LogmodelPackage.BUSINESS_TERM__FIELD:
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
			case LogmodelPackage.BUSINESS_TERM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogmodelPackage.BUSINESS_TERM__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_ID:
				return PRIMARY_FDM_ID_EDEFAULT == null ? primaryFdmID != null : !PRIMARY_FDM_ID_EDEFAULT.equals(primaryFdmID);
			case LogmodelPackage.BUSINESS_TERM__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupID != null : !GROUP_ID_EDEFAULT.equals(groupID);
			case LogmodelPackage.BUSINESS_TERM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LogmodelPackage.BUSINESS_TERM__PRIMARY_FDM_NAME:
				return PRIMARY_FDM_NAME_EDEFAULT == null ? primaryFDMName != null : !PRIMARY_FDM_NAME_EDEFAULT.equals(primaryFDMName);
			case LogmodelPackage.BUSINESS_TERM__USED_BY:
				return USED_BY_EDEFAULT == null ? usedBy != null : !USED_BY_EDEFAULT.equals(usedBy);
			case LogmodelPackage.BUSINESS_TERM__FUNCTIONAL_SPECIFICATION:
				return FUNCTIONAL_SPECIFICATION_EDEFAULT == null ? functionalSpecification != null : !FUNCTIONAL_SPECIFICATION_EDEFAULT.equals(functionalSpecification);
			case LogmodelPackage.BUSINESS_TERM__REGULATORY_REQUIREMENTS:
				return REGULATORY_REQUIREMENTS_EDEFAULT == null ? regulatoryRequirements != null : !REGULATORY_REQUIREMENTS_EDEFAULT.equals(regulatoryRequirements);
			case LogmodelPackage.BUSINESS_TERM__DATA_OWNER:
				return DATA_OWNER_EDEFAULT == null ? dataOwner != null : !DATA_OWNER_EDEFAULT.equals(dataOwner);
			case LogmodelPackage.BUSINESS_TERM__FIELD:
				return field != null;
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
		result.append(", state: ");
		result.append(state);
		result.append(", primaryFdmID: ");
		result.append(primaryFdmID);
		result.append(", groupID: ");
		result.append(groupID);
		result.append(", description: ");
		result.append(description);
		result.append(", primaryFDMName: ");
		result.append(primaryFDMName);
		result.append(", usedBy: ");
		result.append(usedBy);
		result.append(", functionalSpecification: ");
		result.append(functionalSpecification);
		result.append(", regulatoryRequirements: ");
		result.append(regulatoryRequirements);
		result.append(", DataOwner: ");
		result.append(dataOwner);
		result.append(')');
		return result.toString();
	}

} //BusinessTermImpl
