/**
 */
package specmodel.impl;

import java.util.Collection;

import logmodel.CommonMapping;
import logmodel.Entity;
import logmodel.Include;
import logmodel.Relationship;
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
import specmodel.Dedup;
import specmodel.Filter;
import specmodel.RuleType;
import specmodel.Source;
import specmodel.Specification;
import specmodel.SpecmodelPackage;
import specmodel.VectorKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getPreDedup <em>Pre Dedup</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getPostDedup <em>Post Dedup</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getVectorkeys <em>Vectorkeys</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getPreFilter <em>Pre Filter</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getPostFilter <em>Post Filter</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getRuleType <em>Rule Type</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getRelationshipSourceEntity <em>Relationship Source Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getRelationshipTargetEntity <em>Relationship Target Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetParentEntity <em>Target Parent Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getLookupEntities <em>Lookup Entities</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetInclude <em>Target Include</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessRuleImpl extends MinimalEObjectImpl.Container implements BusinessRule {
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
	 * The cached value of the '{@link #getPreDedup() <em>Pre Dedup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDedup()
	 * @generated
	 * @ordered
	 */
	protected Dedup preDedup;

	/**
	 * The cached value of the '{@link #getPostDedup() <em>Post Dedup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostDedup()
	 * @generated
	 * @ordered
	 */
	protected Dedup postDedup;

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
	 * The cached value of the '{@link #getPreFilter() <em>Pre Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter preFilter;

	/**
	 * The cached value of the '{@link #getPostFilter() <em>Post Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter postFilter;

	/**
	 * The default value of the '{@link #getRuleType() <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleType()
	 * @generated
	 * @ordered
	 */
	protected static final RuleType RULE_TYPE_EDEFAULT = RuleType.SINGLE_FIRE;

	/**
	 * The cached value of the '{@link #getRuleType() <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleType()
	 * @generated
	 * @ordered
	 */
	protected RuleType ruleType = RULE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity targetEntity;

	/**
	 * The cached value of the '{@link #getRelationshipSourceEntity() <em>Relationship Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipSourceEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity relationshipSourceEntity;

	/**
	 * The cached value of the '{@link #getRelationshipTargetEntity() <em>Relationship Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity relationshipTargetEntity;

	/**
	 * The cached value of the '{@link #getTargetParentEntity() <em>Target Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParentEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity targetParentEntity;

	/**
	 * The cached value of the '{@link #getLookupEntities() <em>Lookup Entities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupEntities()
	 * @generated
	 * @ordered
	 */
	protected Entity lookupEntities;

	/**
	 * The cached value of the '{@link #getTargetMappingOutputFields() <em>Target Mapping Output Fields</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMappingOutputFields()
	 * @generated
	 * @ordered
	 */
	protected CommonMapping targetMappingOutputFields;

	/**
	 * The cached value of the '{@link #getTargetRelationship() <em>Target Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship targetRelationship;

	/**
	 * The cached value of the '{@link #getTargetInclude() <em>Target Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInclude()
	 * @generated
	 * @ordered
	 */
	protected Include targetInclude;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecmodelPackage.Literals.BUSINESS_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specification getSpecification() {
		if (eContainerFeatureID() != SpecmodelPackage.BUSINESS_RULE__SPECIFICATION) return null;
		return (Specification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecification, SpecmodelPackage.BUSINESS_RULE__SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != eInternalContainer() || (eContainerFeatureID() != SpecmodelPackage.BUSINESS_RULE__SPECIFICATION && newSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, SpecmodelPackage.SPECIFICATION__BUSINESSRULES, Specification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dedup getPreDedup() {
		return preDedup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreDedup(Dedup newPreDedup, NotificationChain msgs) {
		Dedup oldPreDedup = preDedup;
		preDedup = newPreDedup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, oldPreDedup, newPreDedup);
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
	public void setPreDedup(Dedup newPreDedup) {
		if (newPreDedup != preDedup) {
			NotificationChain msgs = null;
			if (preDedup != null)
				msgs = ((InternalEObject)preDedup).eInverseRemove(this, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE, Dedup.class, msgs);
			if (newPreDedup != null)
				msgs = ((InternalEObject)newPreDedup).eInverseAdd(this, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESS_RULE, Dedup.class, msgs);
			msgs = basicSetPreDedup(newPreDedup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, newPreDedup, newPreDedup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dedup getPostDedup() {
		return postDedup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostDedup(Dedup newPostDedup, NotificationChain msgs) {
		Dedup oldPostDedup = postDedup;
		postDedup = newPostDedup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, oldPostDedup, newPostDedup);
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
	public void setPostDedup(Dedup newPostDedup) {
		if (newPostDedup != postDedup) {
			NotificationChain msgs = null;
			if (postDedup != null)
				msgs = ((InternalEObject)postDedup).eInverseRemove(this, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE, Dedup.class, msgs);
			if (newPostDedup != null)
				msgs = ((InternalEObject)newPostDedup).eInverseAdd(this, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESS_RULE, Dedup.class, msgs);
			msgs = basicSetPostDedup(newPostDedup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, newPostDedup, newPostDedup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VectorKey> getVectorkeys() {
		if (vectorkeys == null) {
			vectorkeys = new EObjectContainmentWithInverseEList<VectorKey>(VectorKey.class, this, SpecmodelPackage.BUSINESS_RULE__VECTORKEYS, SpecmodelPackage.VECTOR_KEY__BUSINESSRULE);
		}
		return vectorkeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter getPreFilter() {
		return preFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreFilter(Filter newPreFilter, NotificationChain msgs) {
		Filter oldPreFilter = preFilter;
		preFilter = newPreFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__PRE_FILTER, oldPreFilter, newPreFilter);
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
	public void setPreFilter(Filter newPreFilter) {
		if (newPreFilter != preFilter) {
			NotificationChain msgs = null;
			if (preFilter != null)
				msgs = ((InternalEObject)preFilter).eInverseRemove(this, SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE, Filter.class, msgs);
			if (newPreFilter != null)
				msgs = ((InternalEObject)newPreFilter).eInverseAdd(this, SpecmodelPackage.FILTER__PRE_FILTER_BUSINESS_RULE, Filter.class, msgs);
			msgs = basicSetPreFilter(newPreFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__PRE_FILTER, newPreFilter, newPreFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter getPostFilter() {
		return postFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostFilter(Filter newPostFilter, NotificationChain msgs) {
		Filter oldPostFilter = postFilter;
		postFilter = newPostFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__POST_FILTER, oldPostFilter, newPostFilter);
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
	public void setPostFilter(Filter newPostFilter) {
		if (newPostFilter != postFilter) {
			NotificationChain msgs = null;
			if (postFilter != null)
				msgs = ((InternalEObject)postFilter).eInverseRemove(this, SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE, Filter.class, msgs);
			if (newPostFilter != null)
				msgs = ((InternalEObject)newPostFilter).eInverseAdd(this, SpecmodelPackage.FILTER__POST_FILTER_BUSINESS_RULE, Filter.class, msgs);
			msgs = basicSetPostFilter(newPostFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__POST_FILTER, newPostFilter, newPostFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleType getRuleType() {
		return ruleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleType(RuleType newRuleType) {
		RuleType oldRuleType = ruleType;
		ruleType = newRuleType == null ? RULE_TYPE_EDEFAULT : newRuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__RULE_TYPE, oldRuleType, ruleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTargetEntity() {
		if (targetEntity != null && targetEntity.eIsProxy()) {
			InternalEObject oldTargetEntity = (InternalEObject)targetEntity;
			targetEntity = (Entity)eResolveProxy(oldTargetEntity);
			if (targetEntity != oldTargetEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY, oldTargetEntity, targetEntity));
			}
		}
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		return targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetEntity(Entity newTargetEntity) {
		Entity oldTargetEntity = targetEntity;
		targetEntity = newTargetEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY, oldTargetEntity, targetEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getRelationshipSourceEntity() {
		if (relationshipSourceEntity != null && relationshipSourceEntity.eIsProxy()) {
			InternalEObject oldRelationshipSourceEntity = (InternalEObject)relationshipSourceEntity;
			relationshipSourceEntity = (Entity)eResolveProxy(oldRelationshipSourceEntity);
			if (relationshipSourceEntity != oldRelationshipSourceEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY, oldRelationshipSourceEntity, relationshipSourceEntity));
			}
		}
		return relationshipSourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRelationshipSourceEntity() {
		return relationshipSourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipSourceEntity(Entity newRelationshipSourceEntity) {
		Entity oldRelationshipSourceEntity = relationshipSourceEntity;
		relationshipSourceEntity = newRelationshipSourceEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY, oldRelationshipSourceEntity, relationshipSourceEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getRelationshipTargetEntity() {
		if (relationshipTargetEntity != null && relationshipTargetEntity.eIsProxy()) {
			InternalEObject oldRelationshipTargetEntity = (InternalEObject)relationshipTargetEntity;
			relationshipTargetEntity = (Entity)eResolveProxy(oldRelationshipTargetEntity);
			if (relationshipTargetEntity != oldRelationshipTargetEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY, oldRelationshipTargetEntity, relationshipTargetEntity));
			}
		}
		return relationshipTargetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRelationshipTargetEntity() {
		return relationshipTargetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipTargetEntity(Entity newRelationshipTargetEntity) {
		Entity oldRelationshipTargetEntity = relationshipTargetEntity;
		relationshipTargetEntity = newRelationshipTargetEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY, oldRelationshipTargetEntity, relationshipTargetEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getTargetParentEntity() {
		if (targetParentEntity != null && targetParentEntity.eIsProxy()) {
			InternalEObject oldTargetParentEntity = (InternalEObject)targetParentEntity;
			targetParentEntity = (Entity)eResolveProxy(oldTargetParentEntity);
			if (targetParentEntity != oldTargetParentEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY, oldTargetParentEntity, targetParentEntity));
			}
		}
		return targetParentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetParentEntity() {
		return targetParentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetParentEntity(Entity newTargetParentEntity) {
		Entity oldTargetParentEntity = targetParentEntity;
		targetParentEntity = newTargetParentEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY, oldTargetParentEntity, targetParentEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getLookupEntities() {
		if (lookupEntities != null && lookupEntities.eIsProxy()) {
			InternalEObject oldLookupEntities = (InternalEObject)lookupEntities;
			lookupEntities = (Entity)eResolveProxy(oldLookupEntities);
			if (lookupEntities != oldLookupEntities) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES, oldLookupEntities, lookupEntities));
			}
		}
		return lookupEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetLookupEntities() {
		return lookupEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLookupEntities(Entity newLookupEntities) {
		Entity oldLookupEntities = lookupEntities;
		lookupEntities = newLookupEntities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES, oldLookupEntities, lookupEntities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonMapping getTargetMappingOutputFields() {
		if (targetMappingOutputFields != null && targetMappingOutputFields.eIsProxy()) {
			InternalEObject oldTargetMappingOutputFields = (InternalEObject)targetMappingOutputFields;
			targetMappingOutputFields = (CommonMapping)eResolveProxy(oldTargetMappingOutputFields);
			if (targetMappingOutputFields != oldTargetMappingOutputFields) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS, oldTargetMappingOutputFields, targetMappingOutputFields));
			}
		}
		return targetMappingOutputFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonMapping basicGetTargetMappingOutputFields() {
		return targetMappingOutputFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetMappingOutputFields(CommonMapping newTargetMappingOutputFields) {
		CommonMapping oldTargetMappingOutputFields = targetMappingOutputFields;
		targetMappingOutputFields = newTargetMappingOutputFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS, oldTargetMappingOutputFields, targetMappingOutputFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship getTargetRelationship() {
		if (targetRelationship != null && targetRelationship.eIsProxy()) {
			InternalEObject oldTargetRelationship = (InternalEObject)targetRelationship;
			targetRelationship = (Relationship)eResolveProxy(oldTargetRelationship);
			if (targetRelationship != oldTargetRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP, oldTargetRelationship, targetRelationship));
			}
		}
		return targetRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetTargetRelationship() {
		return targetRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetRelationship(Relationship newTargetRelationship) {
		Relationship oldTargetRelationship = targetRelationship;
		targetRelationship = newTargetRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP, oldTargetRelationship, targetRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Include getTargetInclude() {
		if (targetInclude != null && targetInclude.eIsProxy()) {
			InternalEObject oldTargetInclude = (InternalEObject)targetInclude;
			targetInclude = (Include)eResolveProxy(oldTargetInclude);
			if (targetInclude != oldTargetInclude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__TARGET_INCLUDE, oldTargetInclude, targetInclude));
			}
		}
		return targetInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include basicGetTargetInclude() {
		return targetInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetInclude(Include newTargetInclude) {
		Include oldTargetInclude = targetInclude;
		targetInclude = newTargetInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__TARGET_INCLUDE, oldTargetInclude, targetInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Source> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentWithInverseEList<Source>(Source.class, this, SpecmodelPackage.BUSINESS_RULE__SOURCES, SpecmodelPackage.SOURCE__BUSINESSRULE);
		}
		return sources;
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
			case SpecmodelPackage.BUSINESS_RULE__SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecification((Specification)otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				if (preDedup != null)
					msgs = ((InternalEObject)preDedup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, null, msgs);
				return basicSetPreDedup((Dedup)otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				if (postDedup != null)
					msgs = ((InternalEObject)postDedup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, null, msgs);
				return basicSetPostDedup((Dedup)otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVectorkeys()).basicAdd(otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__PRE_FILTER:
				if (preFilter != null)
					msgs = ((InternalEObject)preFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecmodelPackage.BUSINESS_RULE__PRE_FILTER, null, msgs);
				return basicSetPreFilter((Filter)otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__POST_FILTER:
				if (postFilter != null)
					msgs = ((InternalEObject)postFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecmodelPackage.BUSINESS_RULE__POST_FILTER, null, msgs);
				return basicSetPostFilter((Filter)otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSources()).basicAdd(otherEnd, msgs);
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
			case SpecmodelPackage.BUSINESS_RULE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				return basicSetPreDedup(null, msgs);
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				return basicSetPostDedup(null, msgs);
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return ((InternalEList<?>)getVectorkeys()).basicRemove(otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__PRE_FILTER:
				return basicSetPreFilter(null, msgs);
			case SpecmodelPackage.BUSINESS_RULE__POST_FILTER:
				return basicSetPostFilter(null, msgs);
			case SpecmodelPackage.BUSINESS_RULE__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case SpecmodelPackage.BUSINESS_RULE__SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, SpecmodelPackage.SPECIFICATION__BUSINESSRULES, Specification.class, msgs);
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
			case SpecmodelPackage.BUSINESS_RULE__NAME:
				return getName();
			case SpecmodelPackage.BUSINESS_RULE__SPECIFICATION:
				return getSpecification();
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				return getPreDedup();
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				return getPostDedup();
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return getVectorkeys();
			case SpecmodelPackage.BUSINESS_RULE__PRE_FILTER:
				return getPreFilter();
			case SpecmodelPackage.BUSINESS_RULE__POST_FILTER:
				return getPostFilter();
			case SpecmodelPackage.BUSINESS_RULE__RULE_TYPE:
				return getRuleType();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				if (resolve) return getRelationshipSourceEntity();
				return basicGetRelationshipSourceEntity();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				if (resolve) return getRelationshipTargetEntity();
				return basicGetRelationshipTargetEntity();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				if (resolve) return getTargetParentEntity();
				return basicGetTargetParentEntity();
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				if (resolve) return getLookupEntities();
				return basicGetLookupEntities();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				if (resolve) return getTargetMappingOutputFields();
				return basicGetTargetMappingOutputFields();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				if (resolve) return getTargetRelationship();
				return basicGetTargetRelationship();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_INCLUDE:
				if (resolve) return getTargetInclude();
				return basicGetTargetInclude();
			case SpecmodelPackage.BUSINESS_RULE__SOURCES:
				return getSources();
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
			case SpecmodelPackage.BUSINESS_RULE__NAME:
				setName((String)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				setPreDedup((Dedup)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				setPostDedup((Dedup)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				getVectorkeys().clear();
				getVectorkeys().addAll((Collection<? extends VectorKey>)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__PRE_FILTER:
				setPreFilter((Filter)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__POST_FILTER:
				setPostFilter((Filter)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RULE_TYPE:
				setRuleType((RuleType)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				setTargetEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				setRelationshipSourceEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				setRelationshipTargetEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				setTargetParentEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				setLookupEntities((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				setTargetMappingOutputFields((CommonMapping)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				setTargetRelationship((Relationship)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_INCLUDE:
				setTargetInclude((Include)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
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
			case SpecmodelPackage.BUSINESS_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecmodelPackage.BUSINESS_RULE__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				setPreDedup((Dedup)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				setPostDedup((Dedup)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				getVectorkeys().clear();
				return;
			case SpecmodelPackage.BUSINESS_RULE__PRE_FILTER:
				setPreFilter((Filter)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__POST_FILTER:
				setPostFilter((Filter)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RULE_TYPE:
				setRuleType(RULE_TYPE_EDEFAULT);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				setTargetEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				setRelationshipSourceEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				setRelationshipTargetEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				setTargetParentEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				setLookupEntities((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				setTargetMappingOutputFields((CommonMapping)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				setTargetRelationship((Relationship)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_INCLUDE:
				setTargetInclude((Include)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__SOURCES:
				getSources().clear();
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
			case SpecmodelPackage.BUSINESS_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecmodelPackage.BUSINESS_RULE__SPECIFICATION:
				return getSpecification() != null;
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				return preDedup != null;
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				return postDedup != null;
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return vectorkeys != null && !vectorkeys.isEmpty();
			case SpecmodelPackage.BUSINESS_RULE__PRE_FILTER:
				return preFilter != null;
			case SpecmodelPackage.BUSINESS_RULE__POST_FILTER:
				return postFilter != null;
			case SpecmodelPackage.BUSINESS_RULE__RULE_TYPE:
				return ruleType != RULE_TYPE_EDEFAULT;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				return targetEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				return relationshipSourceEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				return relationshipTargetEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				return targetParentEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				return lookupEntities != null;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				return targetMappingOutputFields != null;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				return targetRelationship != null;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_INCLUDE:
				return targetInclude != null;
			case SpecmodelPackage.BUSINESS_RULE__SOURCES:
				return sources != null && !sources.isEmpty();
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
		result.append(", RuleType: ");
		result.append(ruleType);
		result.append(')');
		return result.toString();
	}

} //BusinessRuleImpl
