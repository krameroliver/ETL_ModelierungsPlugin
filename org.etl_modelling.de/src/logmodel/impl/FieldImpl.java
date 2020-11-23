/**
 */
package logmodel.impl;

import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
import logmodel.LogmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import type_enum.FieldTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmodel.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getLength <em>Length</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getOriginal_name <em>Original name</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getShort_describtion <em>Short describtion</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getNullIndicator <em>Null Indicator</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#isAllowExponent <em>Allow Exponent</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#isHasImplicitComma <em>Has Implicit Comma</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#isInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#isTableOnly <em>Table Only</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#isIsFastChanging <em>Is Fast Changing</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link logmodel.impl.FieldImpl#isIsBusinessKey <em>Is Business Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected int scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginal_name() <em>Original name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_name()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginal_name() <em>Original name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal_name()
	 * @generated
	 * @ordered
	 */
	protected String original_name = ORIGINAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShort_describtion() <em>Short describtion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_describtion()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIBTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShort_describtion() <em>Short describtion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_describtion()
	 * @generated
	 * @ordered
	 */
	protected String short_describtion = SHORT_DESCRIBTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String dateFormat = DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullIndicator() <em>Null Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final String NULL_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullIndicator() <em>Null Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullIndicator()
	 * @generated
	 * @ordered
	 */
	protected String nullIndicator = NULL_INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowExponent() <em>Allow Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowExponent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_EXPONENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowExponent() <em>Allow Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowExponent()
	 * @generated
	 * @ordered
	 */
	protected boolean allowExponent = ALLOW_EXPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasImplicitComma() <em>Has Implicit Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasImplicitComma()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_IMPLICIT_COMMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasImplicitComma() <em>Has Implicit Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasImplicitComma()
	 * @generated
	 * @ordered
	 */
	protected boolean hasImplicitComma = HAS_IMPLICIT_COMMA_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterfaceOnly() <em>Interface Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterfaceOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterfaceOnly() <em>Interface Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterfaceOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean interfaceOnly = INTERFACE_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTableOnly() <em>Table Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTableOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TABLE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTableOnly() <em>Table Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTableOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean tableOnly = TABLE_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFastChanging() <em>Is Fast Changing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFastChanging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FAST_CHANGING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFastChanging() <em>Is Fast Changing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFastChanging()
	 * @generated
	 * @ordered
	 */
	protected boolean isFastChanging = IS_FAST_CHANGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FieldTypes TYPE_EDEFAULT = FieldTypes.STRING;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FieldTypes type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBusinessKey() <em>Is Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBusinessKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BUSINESS_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBusinessKey() <em>Is Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBusinessKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isBusinessKey = IS_BUSINESS_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmodelPackage.Literals.FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (eContainerFeatureID() != LogmodelPackage.FIELD__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, LogmodelPackage.FIELD__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != LogmodelPackage.FIELD__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, LogmodelPackage.ENTITY__ENTITY_FIELD, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Include getInclude() {
		if (eContainerFeatureID() != LogmodelPackage.FIELD__INCLUDE) return null;
		return (Include)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(Include newInclude, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInclude, LogmodelPackage.FIELD__INCLUDE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclude(Include newInclude) {
		if (newInclude != eInternalContainer() || (eContainerFeatureID() != LogmodelPackage.FIELD__INCLUDE && newInclude != null)) {
			if (EcoreUtil.isAncestor(this, newInclude))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInclude != null)
				msgs = ((InternalEObject)newInclude).eInverseAdd(this, LogmodelPackage.INCLUDE__INCLUDE_FIELDS, Include.class, msgs);
			msgs = basicSetInclude(newInclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__INCLUDE, newInclude, newInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(int newScale) {
		int oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginal_name() {
		return original_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginal_name(String newOriginal_name) {
		String oldOriginal_name = original_name;
		original_name = newOriginal_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__ORIGINAL_NAME, oldOriginal_name, original_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShort_describtion() {
		return short_describtion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShort_describtion(String newShort_describtion) {
		String oldShort_describtion = short_describtion;
		short_describtion = newShort_describtion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__SHORT_DESCRIBTION, oldShort_describtion, short_describtion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateFormat(String newDateFormat) {
		String oldDateFormat = dateFormat;
		dateFormat = newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNullIndicator() {
		return nullIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullIndicator(String newNullIndicator) {
		String oldNullIndicator = nullIndicator;
		nullIndicator = newNullIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__NULL_INDICATOR, oldNullIndicator, nullIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowExponent() {
		return allowExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowExponent(boolean newAllowExponent) {
		boolean oldAllowExponent = allowExponent;
		allowExponent = newAllowExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__ALLOW_EXPONENT, oldAllowExponent, allowExponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasImplicitComma() {
		return hasImplicitComma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasImplicitComma(boolean newHasImplicitComma) {
		boolean oldHasImplicitComma = hasImplicitComma;
		hasImplicitComma = newHasImplicitComma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__HAS_IMPLICIT_COMMA, oldHasImplicitComma, hasImplicitComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterfaceOnly() {
		return interfaceOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceOnly(boolean newInterfaceOnly) {
		boolean oldInterfaceOnly = interfaceOnly;
		interfaceOnly = newInterfaceOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__INTERFACE_ONLY, oldInterfaceOnly, interfaceOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTableOnly() {
		return tableOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableOnly(boolean newTableOnly) {
		boolean oldTableOnly = tableOnly;
		tableOnly = newTableOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__TABLE_ONLY, oldTableOnly, tableOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFastChanging() {
		return isFastChanging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFastChanging(boolean newIsFastChanging) {
		boolean oldIsFastChanging = isFastChanging;
		isFastChanging = newIsFastChanging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__IS_FAST_CHANGING, oldIsFastChanging, isFastChanging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(FieldTypes newType) {
		FieldTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBusinessKey() {
		return isBusinessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBusinessKey(boolean newIsBusinessKey) {
		boolean oldIsBusinessKey = isBusinessKey;
		isBusinessKey = newIsBusinessKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.FIELD__IS_BUSINESS_KEY, oldIsBusinessKey, isBusinessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmodelPackage.FIELD__ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntity((Entity)otherEnd, msgs);
			case LogmodelPackage.FIELD__INCLUDE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInclude((Include)otherEnd, msgs);
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
			case LogmodelPackage.FIELD__ENTITY:
				return basicSetEntity(null, msgs);
			case LogmodelPackage.FIELD__INCLUDE:
				return basicSetInclude(null, msgs);
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
			case LogmodelPackage.FIELD__ENTITY:
				return eInternalContainer().eInverseRemove(this, LogmodelPackage.ENTITY__ENTITY_FIELD, Entity.class, msgs);
			case LogmodelPackage.FIELD__INCLUDE:
				return eInternalContainer().eInverseRemove(this, LogmodelPackage.INCLUDE__INCLUDE_FIELDS, Include.class, msgs);
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
			case LogmodelPackage.FIELD__NAME:
				return getName();
			case LogmodelPackage.FIELD__ENTITY:
				return getEntity();
			case LogmodelPackage.FIELD__INCLUDE:
				return getInclude();
			case LogmodelPackage.FIELD__LENGTH:
				return getLength();
			case LogmodelPackage.FIELD__PRECISION:
				return getPrecision();
			case LogmodelPackage.FIELD__SCALE:
				return getScale();
			case LogmodelPackage.FIELD__ORIGINAL_NAME:
				return getOriginal_name();
			case LogmodelPackage.FIELD__SHORT_DESCRIBTION:
				return getShort_describtion();
			case LogmodelPackage.FIELD__DATE_FORMAT:
				return getDateFormat();
			case LogmodelPackage.FIELD__NULL_INDICATOR:
				return getNullIndicator();
			case LogmodelPackage.FIELD__ALLOW_EXPONENT:
				return isAllowExponent();
			case LogmodelPackage.FIELD__HAS_IMPLICIT_COMMA:
				return isHasImplicitComma();
			case LogmodelPackage.FIELD__INTERFACE_ONLY:
				return isInterfaceOnly();
			case LogmodelPackage.FIELD__TABLE_ONLY:
				return isTableOnly();
			case LogmodelPackage.FIELD__IS_FAST_CHANGING:
				return isIsFastChanging();
			case LogmodelPackage.FIELD__TYPE:
				return getType();
			case LogmodelPackage.FIELD__IS_BUSINESS_KEY:
				return isIsBusinessKey();
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
			case LogmodelPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case LogmodelPackage.FIELD__ENTITY:
				setEntity((Entity)newValue);
				return;
			case LogmodelPackage.FIELD__INCLUDE:
				setInclude((Include)newValue);
				return;
			case LogmodelPackage.FIELD__LENGTH:
				setLength((Integer)newValue);
				return;
			case LogmodelPackage.FIELD__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case LogmodelPackage.FIELD__SCALE:
				setScale((Integer)newValue);
				return;
			case LogmodelPackage.FIELD__ORIGINAL_NAME:
				setOriginal_name((String)newValue);
				return;
			case LogmodelPackage.FIELD__SHORT_DESCRIBTION:
				setShort_describtion((String)newValue);
				return;
			case LogmodelPackage.FIELD__DATE_FORMAT:
				setDateFormat((String)newValue);
				return;
			case LogmodelPackage.FIELD__NULL_INDICATOR:
				setNullIndicator((String)newValue);
				return;
			case LogmodelPackage.FIELD__ALLOW_EXPONENT:
				setAllowExponent((Boolean)newValue);
				return;
			case LogmodelPackage.FIELD__HAS_IMPLICIT_COMMA:
				setHasImplicitComma((Boolean)newValue);
				return;
			case LogmodelPackage.FIELD__INTERFACE_ONLY:
				setInterfaceOnly((Boolean)newValue);
				return;
			case LogmodelPackage.FIELD__TABLE_ONLY:
				setTableOnly((Boolean)newValue);
				return;
			case LogmodelPackage.FIELD__IS_FAST_CHANGING:
				setIsFastChanging((Boolean)newValue);
				return;
			case LogmodelPackage.FIELD__TYPE:
				setType((FieldTypes)newValue);
				return;
			case LogmodelPackage.FIELD__IS_BUSINESS_KEY:
				setIsBusinessKey((Boolean)newValue);
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
			case LogmodelPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__ENTITY:
				setEntity((Entity)null);
				return;
			case LogmodelPackage.FIELD__INCLUDE:
				setInclude((Include)null);
				return;
			case LogmodelPackage.FIELD__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__ORIGINAL_NAME:
				setOriginal_name(ORIGINAL_NAME_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__SHORT_DESCRIBTION:
				setShort_describtion(SHORT_DESCRIBTION_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__NULL_INDICATOR:
				setNullIndicator(NULL_INDICATOR_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__ALLOW_EXPONENT:
				setAllowExponent(ALLOW_EXPONENT_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__HAS_IMPLICIT_COMMA:
				setHasImplicitComma(HAS_IMPLICIT_COMMA_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__INTERFACE_ONLY:
				setInterfaceOnly(INTERFACE_ONLY_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__TABLE_ONLY:
				setTableOnly(TABLE_ONLY_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__IS_FAST_CHANGING:
				setIsFastChanging(IS_FAST_CHANGING_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LogmodelPackage.FIELD__IS_BUSINESS_KEY:
				setIsBusinessKey(IS_BUSINESS_KEY_EDEFAULT);
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
			case LogmodelPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogmodelPackage.FIELD__ENTITY:
				return getEntity() != null;
			case LogmodelPackage.FIELD__INCLUDE:
				return getInclude() != null;
			case LogmodelPackage.FIELD__LENGTH:
				return length != LENGTH_EDEFAULT;
			case LogmodelPackage.FIELD__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case LogmodelPackage.FIELD__SCALE:
				return scale != SCALE_EDEFAULT;
			case LogmodelPackage.FIELD__ORIGINAL_NAME:
				return ORIGINAL_NAME_EDEFAULT == null ? original_name != null : !ORIGINAL_NAME_EDEFAULT.equals(original_name);
			case LogmodelPackage.FIELD__SHORT_DESCRIBTION:
				return SHORT_DESCRIBTION_EDEFAULT == null ? short_describtion != null : !SHORT_DESCRIBTION_EDEFAULT.equals(short_describtion);
			case LogmodelPackage.FIELD__DATE_FORMAT:
				return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
			case LogmodelPackage.FIELD__NULL_INDICATOR:
				return NULL_INDICATOR_EDEFAULT == null ? nullIndicator != null : !NULL_INDICATOR_EDEFAULT.equals(nullIndicator);
			case LogmodelPackage.FIELD__ALLOW_EXPONENT:
				return allowExponent != ALLOW_EXPONENT_EDEFAULT;
			case LogmodelPackage.FIELD__HAS_IMPLICIT_COMMA:
				return hasImplicitComma != HAS_IMPLICIT_COMMA_EDEFAULT;
			case LogmodelPackage.FIELD__INTERFACE_ONLY:
				return interfaceOnly != INTERFACE_ONLY_EDEFAULT;
			case LogmodelPackage.FIELD__TABLE_ONLY:
				return tableOnly != TABLE_ONLY_EDEFAULT;
			case LogmodelPackage.FIELD__IS_FAST_CHANGING:
				return isFastChanging != IS_FAST_CHANGING_EDEFAULT;
			case LogmodelPackage.FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case LogmodelPackage.FIELD__IS_BUSINESS_KEY:
				return isBusinessKey != IS_BUSINESS_KEY_EDEFAULT;
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
		result.append(", length: ");
		result.append(length);
		result.append(", precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", original_name: ");
		result.append(original_name);
		result.append(", short_describtion: ");
		result.append(short_describtion);
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", NullIndicator: ");
		result.append(nullIndicator);
		result.append(", allowExponent: ");
		result.append(allowExponent);
		result.append(", hasImplicitComma: ");
		result.append(hasImplicitComma);
		result.append(", interfaceOnly: ");
		result.append(interfaceOnly);
		result.append(", tableOnly: ");
		result.append(tableOnly);
		result.append(", isFastChanging: ");
		result.append(isFastChanging);
		result.append(", type: ");
		result.append(type);
		result.append(", isBusinessKey: ");
		result.append(isBusinessKey);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
