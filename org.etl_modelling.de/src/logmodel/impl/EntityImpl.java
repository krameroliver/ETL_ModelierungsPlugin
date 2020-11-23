/**
 */
package logmodel.impl;

import java.util.Collection;

import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
import logmodel.LogmodelPackage;
import logmodel.Relationship;
import logmodel.logpackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmodel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link logmodel.impl.EntityImpl#getLogpackage <em>Logpackage</em>}</li>
 *   <li>{@link logmodel.impl.EntityImpl#getEntityField <em>Entity Field</em>}</li>
 *   <li>{@link logmodel.impl.EntityImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link logmodel.impl.EntityImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link logmodel.impl.EntityImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link logmodel.impl.EntityImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link logmodel.impl.EntityImpl#getLineend <em>Lineend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The cached value of the '{@link #getEntityField() <em>Entity Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> entityField;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String delimiter = DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineend() <em>Lineend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineend()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineend() <em>Lineend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineend()
	 * @generated
	 * @ordered
	 */
	protected String lineend = LINEEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmodelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public logpackage getLogpackage() {
		if (eContainerFeatureID() != LogmodelPackage.ENTITY__LOGPACKAGE) return null;
		return (logpackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogpackage(logpackage newLogpackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogpackage, LogmodelPackage.ENTITY__LOGPACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogpackage(logpackage newLogpackage) {
		if (newLogpackage != eInternalContainer() || (eContainerFeatureID() != LogmodelPackage.ENTITY__LOGPACKAGE && newLogpackage != null)) {
			if (EcoreUtil.isAncestor(this, newLogpackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLogpackage != null)
				msgs = ((InternalEObject)newLogpackage).eInverseAdd(this, LogmodelPackage.LOGPACKAGE__ENTITY, logpackage.class, msgs);
			msgs = basicSetLogpackage(newLogpackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.ENTITY__LOGPACKAGE, newLogpackage, newLogpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getEntityField() {
		if (entityField == null) {
			entityField = new EObjectContainmentWithInverseEList<Field>(Field.class, this, LogmodelPackage.ENTITY__ENTITY_FIELD, LogmodelPackage.FIELD__ENTITY);
		}
		return entityField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentWithInverseEList<Include>(Include.class, this, LogmodelPackage.ENTITY__INCLUDE, LogmodelPackage.INCLUDE__ENTITY);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, LogmodelPackage.ENTITY__RELATIONSHIPS, LogmodelPackage.RELATIONSHIP__ENTITY);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.ENTITY__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiter(String newDelimiter) {
		String oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.ENTITY__DELIMITER, oldDelimiter, delimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineend() {
		return lineend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineend(String newLineend) {
		String oldLineend = lineend;
		lineend = newLineend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmodelPackage.ENTITY__LINEEND, oldLineend, lineend));
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
			case LogmodelPackage.ENTITY__LOGPACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLogpackage((logpackage)otherEnd, msgs);
			case LogmodelPackage.ENTITY__ENTITY_FIELD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntityField()).basicAdd(otherEnd, msgs);
			case LogmodelPackage.ENTITY__INCLUDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInclude()).basicAdd(otherEnd, msgs);
			case LogmodelPackage.ENTITY__RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationships()).basicAdd(otherEnd, msgs);
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
			case LogmodelPackage.ENTITY__LOGPACKAGE:
				return basicSetLogpackage(null, msgs);
			case LogmodelPackage.ENTITY__ENTITY_FIELD:
				return ((InternalEList<?>)getEntityField()).basicRemove(otherEnd, msgs);
			case LogmodelPackage.ENTITY__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case LogmodelPackage.ENTITY__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
			case LogmodelPackage.ENTITY__LOGPACKAGE:
				return eInternalContainer().eInverseRemove(this, LogmodelPackage.LOGPACKAGE__ENTITY, logpackage.class, msgs);
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
			case LogmodelPackage.ENTITY__NAME:
				return getName();
			case LogmodelPackage.ENTITY__LOGPACKAGE:
				return getLogpackage();
			case LogmodelPackage.ENTITY__ENTITY_FIELD:
				return getEntityField();
			case LogmodelPackage.ENTITY__INCLUDE:
				return getInclude();
			case LogmodelPackage.ENTITY__RELATIONSHIPS:
				return getRelationships();
			case LogmodelPackage.ENTITY__FILENAME:
				return getFilename();
			case LogmodelPackage.ENTITY__DELIMITER:
				return getDelimiter();
			case LogmodelPackage.ENTITY__LINEEND:
				return getLineend();
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
			case LogmodelPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case LogmodelPackage.ENTITY__LOGPACKAGE:
				setLogpackage((logpackage)newValue);
				return;
			case LogmodelPackage.ENTITY__ENTITY_FIELD:
				getEntityField().clear();
				getEntityField().addAll((Collection<? extends Field>)newValue);
				return;
			case LogmodelPackage.ENTITY__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case LogmodelPackage.ENTITY__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case LogmodelPackage.ENTITY__FILENAME:
				setFilename((String)newValue);
				return;
			case LogmodelPackage.ENTITY__DELIMITER:
				setDelimiter((String)newValue);
				return;
			case LogmodelPackage.ENTITY__LINEEND:
				setLineend((String)newValue);
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
			case LogmodelPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LogmodelPackage.ENTITY__LOGPACKAGE:
				setLogpackage((logpackage)null);
				return;
			case LogmodelPackage.ENTITY__ENTITY_FIELD:
				getEntityField().clear();
				return;
			case LogmodelPackage.ENTITY__INCLUDE:
				getInclude().clear();
				return;
			case LogmodelPackage.ENTITY__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case LogmodelPackage.ENTITY__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case LogmodelPackage.ENTITY__DELIMITER:
				setDelimiter(DELIMITER_EDEFAULT);
				return;
			case LogmodelPackage.ENTITY__LINEEND:
				setLineend(LINEEND_EDEFAULT);
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
			case LogmodelPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LogmodelPackage.ENTITY__LOGPACKAGE:
				return getLogpackage() != null;
			case LogmodelPackage.ENTITY__ENTITY_FIELD:
				return entityField != null && !entityField.isEmpty();
			case LogmodelPackage.ENTITY__INCLUDE:
				return include != null && !include.isEmpty();
			case LogmodelPackage.ENTITY__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case LogmodelPackage.ENTITY__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case LogmodelPackage.ENTITY__DELIMITER:
				return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
			case LogmodelPackage.ENTITY__LINEEND:
				return LINEEND_EDEFAULT == null ? lineend != null : !LINEEND_EDEFAULT.equals(lineend);
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
		result.append(", filename: ");
		result.append(filename);
		result.append(", delimiter: ");
		result.append(delimiter);
		result.append(", lineend: ");
		result.append(lineend);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
