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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import specmodel.BusinessRule;
import specmodel.Entity;
import specmodel.Filter;
import specmodel.JoinField;
import specmodel.Relationship;
import specmodel.Source;
import specmodel.Specification;
import specmodel.SpecmodelPackage;
import specmodel.VectorKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.SourceImpl#getSourceBusinessrule <em>Source Businessrule</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getParentSource <em>Parent Source</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getChildSource <em>Child Source</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getSourceSpecification <em>Source Specification</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getVectorkeys <em>Vectorkeys</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getParentJoinFields <em>Parent Join Fields</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getChildJoinFields <em>Child Join Fields</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getJoinEntity <em>Join Entity</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends MinimalEObjectImpl.Container implements Source {
	/**
	 * The cached value of the '{@link #getSourceBusinessrule() <em>Source Businessrule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBusinessrule()
	 * @generated
	 * @ordered
	 */
	protected BusinessRule sourceBusinessrule;

	/**
	 * The cached value of the '{@link #getChildSource() <em>Child Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> childSource;

	/**
	 * The cached value of the '{@link #getSourceSpecification() <em>Source Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification sourceSpecification;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * The cached value of the '{@link #getVectorkeys() <em>Vectorkeys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorkeys()
	 * @generated
	 * @ordered
	 */
	protected EList<VectorKey> vectorkeys;

	/**
	 * The cached value of the '{@link #getParentJoinFields() <em>Parent Join Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentJoinFields()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinField> parentJoinFields;

	/**
	 * The cached value of the '{@link #getChildJoinFields() <em>Child Join Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildJoinFields()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinField> childJoinFields;

	/**
	 * The cached value of the '{@link #getSourceEntity() <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity sourceEntity;

	/**
	 * The cached value of the '{@link #getJoinEntity() <em>Join Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity joinEntity;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessRule getSourceBusinessrule() {
		if (sourceBusinessrule != null && sourceBusinessrule.eIsProxy()) {
			InternalEObject oldSourceBusinessrule = (InternalEObject)sourceBusinessrule;
			sourceBusinessrule = (BusinessRule)eResolveProxy(oldSourceBusinessrule);
			if (sourceBusinessrule != oldSourceBusinessrule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.SOURCE__SOURCE_BUSINESSRULE, oldSourceBusinessrule, sourceBusinessrule));
			}
		}
		return sourceBusinessrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRule basicGetSourceBusinessrule() {
		return sourceBusinessrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceBusinessrule(BusinessRule newSourceBusinessrule) {
		BusinessRule oldSourceBusinessrule = sourceBusinessrule;
		sourceBusinessrule = newSourceBusinessrule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__SOURCE_BUSINESSRULE, oldSourceBusinessrule, sourceBusinessrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getParentSource() {
		if (eContainerFeatureID() != SpecmodelPackage.SOURCE__PARENT_SOURCE) return null;
		return (Source)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSource(Source newParentSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSource, SpecmodelPackage.SOURCE__PARENT_SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentSource(Source newParentSource) {
		if (newParentSource != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.SOURCE__PARENT_SOURCE && newParentSource != null)) {
			if (EcoreUtil.isAncestor(this, newParentSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSource != null)
				msgs = ((InternalEObject)newParentSource).eInverseAdd(this, SpecmodelPackage.SOURCE__CHILD_SOURCE, Source.class, msgs);
			msgs = basicSetParentSource(newParentSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__PARENT_SOURCE, newParentSource, newParentSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Source> getChildSource() {
		if (childSource == null) {
			childSource = new EObjectContainmentWithInverseEList<Source>(Source.class, this, SpecmodelPackage.SOURCE__CHILD_SOURCE, SpecmodelPackage.SOURCE__PARENT_SOURCE);
		}
		return childSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specification getSourceSpecification() {
		if (sourceSpecification != null && sourceSpecification.eIsProxy()) {
			InternalEObject oldSourceSpecification = (InternalEObject)sourceSpecification;
			sourceSpecification = (Specification)eResolveProxy(oldSourceSpecification);
			if (sourceSpecification != oldSourceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.SOURCE__SOURCE_SPECIFICATION, oldSourceSpecification, sourceSpecification));
			}
		}
		return sourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetSourceSpecification() {
		return sourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceSpecification(Specification newSourceSpecification) {
		Specification oldSourceSpecification = sourceSpecification;
		sourceSpecification = newSourceSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__SOURCE_SPECIFICATION, oldSourceSpecification, sourceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specification getSpecification() {
		if (eContainerFeatureID() != SpecmodelPackage.SOURCE__SPECIFICATION) return null;
		return (Specification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecification, SpecmodelPackage.SOURCE__SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.SOURCE__SPECIFICATION && newSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCE, Specification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, SpecmodelPackage.SOURCE__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VectorKey> getVectorkeys() {
		if (vectorkeys == null) {
			vectorkeys = new EObjectContainmentWithInverseEList<VectorKey>(VectorKey.class, this, SpecmodelPackage.SOURCE__VECTORKEYS, SpecmodelPackage.VECTOR_KEY__SOURCE);
		}
		return vectorkeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JoinField> getParentJoinFields() {
		if (parentJoinFields == null) {
			parentJoinFields = new EObjectContainmentWithInverseEList<JoinField>(JoinField.class, this, SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS, SpecmodelPackage.JOIN_FIELD__PARENT_SOURCE);
		}
		return parentJoinFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JoinField> getChildJoinFields() {
		if (childJoinFields == null) {
			childJoinFields = new EObjectContainmentWithInverseEList<JoinField>(JoinField.class, this, SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS, SpecmodelPackage.JOIN_FIELD__CHILD_SOURCE);
		}
		return childJoinFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getSourceEntity() {
		if (sourceEntity != null && sourceEntity.eIsProxy()) {
			InternalEObject oldSourceEntity = (InternalEObject)sourceEntity;
			sourceEntity = (Entity)eResolveProxy(oldSourceEntity);
			if (sourceEntity != oldSourceEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.SOURCE__SOURCE_ENTITY, oldSourceEntity, sourceEntity));
			}
		}
		return sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSourceEntity() {
		return sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceEntity(Entity newSourceEntity) {
		Entity oldSourceEntity = sourceEntity;
		sourceEntity = newSourceEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__SOURCE_ENTITY, oldSourceEntity, sourceEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getJoinEntity() {
		if (joinEntity != null && joinEntity.eIsProxy()) {
			InternalEObject oldJoinEntity = (InternalEObject)joinEntity;
			joinEntity = (Entity)eResolveProxy(oldJoinEntity);
			if (joinEntity != oldJoinEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.SOURCE__JOIN_ENTITY, oldJoinEntity, joinEntity));
			}
		}
		return joinEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetJoinEntity() {
		return joinEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinEntity(Entity newJoinEntity) {
		Entity oldJoinEntity = joinEntity;
		joinEntity = newJoinEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__JOIN_ENTITY, oldJoinEntity, joinEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (Relationship)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.SOURCE__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationship(Relationship newRelationship) {
		Relationship oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__RELATIONSHIP, oldRelationship, relationship));
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
			case SpecmodelPackage.SOURCE__PARENT_SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSource((Source)otherEnd, msgs);
			case SpecmodelPackage.SOURCE__CHILD_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildSource()).basicAdd(otherEnd, msgs);
			case SpecmodelPackage.SOURCE__SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecification((Specification)otherEnd, msgs);
			case SpecmodelPackage.SOURCE__VECTORKEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVectorkeys()).basicAdd(otherEnd, msgs);
			case SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentJoinFields()).basicAdd(otherEnd, msgs);
			case SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildJoinFields()).basicAdd(otherEnd, msgs);
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
			case SpecmodelPackage.SOURCE__PARENT_SOURCE:
				return basicSetParentSource(null, msgs);
			case SpecmodelPackage.SOURCE__CHILD_SOURCE:
				return ((InternalEList<?>)getChildSource()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.SOURCE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case SpecmodelPackage.SOURCE__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.SOURCE__VECTORKEYS:
				return ((InternalEList<?>)getVectorkeys()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS:
				return ((InternalEList<?>)getParentJoinFields()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS:
				return ((InternalEList<?>)getChildJoinFields()).basicRemove(otherEnd, msgs);
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
			case SpecmodelPackage.SOURCE__PARENT_SOURCE:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.SOURCE__CHILD_SOURCE, Source.class, msgs);
			case SpecmodelPackage.SOURCE__SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.SPECIFICATION__PRIMARY_SOURCE, Specification.class, msgs);
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
			case SpecmodelPackage.SOURCE__SOURCE_BUSINESSRULE:
				if (resolve) return getSourceBusinessrule();
				return basicGetSourceBusinessrule();
			case SpecmodelPackage.SOURCE__PARENT_SOURCE:
				return getParentSource();
			case SpecmodelPackage.SOURCE__CHILD_SOURCE:
				return getChildSource();
			case SpecmodelPackage.SOURCE__SOURCE_SPECIFICATION:
				if (resolve) return getSourceSpecification();
				return basicGetSourceSpecification();
			case SpecmodelPackage.SOURCE__SPECIFICATION:
				return getSpecification();
			case SpecmodelPackage.SOURCE__FILTERS:
				return getFilters();
			case SpecmodelPackage.SOURCE__VECTORKEYS:
				return getVectorkeys();
			case SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS:
				return getParentJoinFields();
			case SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS:
				return getChildJoinFields();
			case SpecmodelPackage.SOURCE__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case SpecmodelPackage.SOURCE__JOIN_ENTITY:
				if (resolve) return getJoinEntity();
				return basicGetJoinEntity();
			case SpecmodelPackage.SOURCE__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
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
			case SpecmodelPackage.SOURCE__SOURCE_BUSINESSRULE:
				setSourceBusinessrule((BusinessRule)newValue);
				return;
			case SpecmodelPackage.SOURCE__PARENT_SOURCE:
				setParentSource((Source)newValue);
				return;
			case SpecmodelPackage.SOURCE__CHILD_SOURCE:
				getChildSource().clear();
				getChildSource().addAll((Collection<? extends Source>)newValue);
				return;
			case SpecmodelPackage.SOURCE__SOURCE_SPECIFICATION:
				setSourceSpecification((Specification)newValue);
				return;
			case SpecmodelPackage.SOURCE__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case SpecmodelPackage.SOURCE__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case SpecmodelPackage.SOURCE__VECTORKEYS:
				getVectorkeys().clear();
				getVectorkeys().addAll((Collection<? extends VectorKey>)newValue);
				return;
			case SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS:
				getParentJoinFields().clear();
				getParentJoinFields().addAll((Collection<? extends JoinField>)newValue);
				return;
			case SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS:
				getChildJoinFields().clear();
				getChildJoinFields().addAll((Collection<? extends JoinField>)newValue);
				return;
			case SpecmodelPackage.SOURCE__SOURCE_ENTITY:
				setSourceEntity((Entity)newValue);
				return;
			case SpecmodelPackage.SOURCE__JOIN_ENTITY:
				setJoinEntity((Entity)newValue);
				return;
			case SpecmodelPackage.SOURCE__RELATIONSHIP:
				setRelationship((Relationship)newValue);
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
			case SpecmodelPackage.SOURCE__SOURCE_BUSINESSRULE:
				setSourceBusinessrule((BusinessRule)null);
				return;
			case SpecmodelPackage.SOURCE__PARENT_SOURCE:
				setParentSource((Source)null);
				return;
			case SpecmodelPackage.SOURCE__CHILD_SOURCE:
				getChildSource().clear();
				return;
			case SpecmodelPackage.SOURCE__SOURCE_SPECIFICATION:
				setSourceSpecification((Specification)null);
				return;
			case SpecmodelPackage.SOURCE__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case SpecmodelPackage.SOURCE__FILTERS:
				getFilters().clear();
				return;
			case SpecmodelPackage.SOURCE__VECTORKEYS:
				getVectorkeys().clear();
				return;
			case SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS:
				getParentJoinFields().clear();
				return;
			case SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS:
				getChildJoinFields().clear();
				return;
			case SpecmodelPackage.SOURCE__SOURCE_ENTITY:
				setSourceEntity((Entity)null);
				return;
			case SpecmodelPackage.SOURCE__JOIN_ENTITY:
				setJoinEntity((Entity)null);
				return;
			case SpecmodelPackage.SOURCE__RELATIONSHIP:
				setRelationship((Relationship)null);
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
			case SpecmodelPackage.SOURCE__SOURCE_BUSINESSRULE:
				return sourceBusinessrule != null;
			case SpecmodelPackage.SOURCE__PARENT_SOURCE:
				return getParentSource() != null;
			case SpecmodelPackage.SOURCE__CHILD_SOURCE:
				return childSource != null && !childSource.isEmpty();
			case SpecmodelPackage.SOURCE__SOURCE_SPECIFICATION:
				return sourceSpecification != null;
			case SpecmodelPackage.SOURCE__SPECIFICATION:
				return getSpecification() != null;
			case SpecmodelPackage.SOURCE__FILTERS:
				return filters != null && !filters.isEmpty();
			case SpecmodelPackage.SOURCE__VECTORKEYS:
				return vectorkeys != null && !vectorkeys.isEmpty();
			case SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS:
				return parentJoinFields != null && !parentJoinFields.isEmpty();
			case SpecmodelPackage.SOURCE__CHILD_JOIN_FIELDS:
				return childJoinFields != null && !childJoinFields.isEmpty();
			case SpecmodelPackage.SOURCE__SOURCE_ENTITY:
				return sourceEntity != null;
			case SpecmodelPackage.SOURCE__JOIN_ENTITY:
				return joinEntity != null;
			case SpecmodelPackage.SOURCE__RELATIONSHIP:
				return relationship != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
