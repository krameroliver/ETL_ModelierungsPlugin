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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import specmodel.BusinessRule;
import specmodel.Dedup;
import specmodel.Entity;
import specmodel.Relationship;
import specmodel.RuleType;
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
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getPostDedup <em>Post Dedup</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getPreDedup <em>Pre Dedup</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getVectorkeys <em>Vectorkeys</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getRelationshipTargetEntity <em>Relationship Target Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetEntity <em>Target Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetParentEntity <em>Target Parent Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getLookupEntities <em>Lookup Entities</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getRelationshipSourceEntity <em>Relationship Source Entity</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getRuletype <em>Ruletype</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#isRelationshipTargetEntityUseHashKey <em>Relationship Target Entity Use Hash Key</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#isRelationshipSourceEntityUseHashKey <em>Relationship Source Entity Use Hash Key</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#isTargetEntityUseHashKey <em>Target Entity Use Hash Key</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link specmodel.impl.BusinessRuleImpl#getSourceReleationship <em>Source Releationship</em>}</li>
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
	 * The cached value of the '{@link #getPostDedup() <em>Post Dedup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostDedup()
	 * @generated
	 * @ordered
	 */
	protected Dedup postDedup;

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
	 * The cached value of the '{@link #getVectorkeys() <em>Vectorkeys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorkeys()
	 * @generated
	 * @ordered
	 */
	protected EList<VectorKey> vectorkeys;

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
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity targetEntity;

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
	 * The cached value of the '{@link #getLookupEntities() <em>Lookup Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> lookupEntities;

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
	 * The default value of the '{@link #getRuletype() <em>Ruletype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuletype()
	 * @generated
	 * @ordered
	 */
	protected static final RuleType RULETYPE_EDEFAULT = RuleType.SINGLE_FIRE;

	/**
	 * The cached value of the '{@link #getRuletype() <em>Ruletype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuletype()
	 * @generated
	 * @ordered
	 */
	protected RuleType ruletype = RULETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRelationshipTargetEntityUseHashKey() <em>Relationship Target Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelationshipTargetEntityUseHashKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelationshipTargetEntityUseHashKey() <em>Relationship Target Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelationshipTargetEntityUseHashKey()
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipTargetEntityUseHashKey = RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRelationshipSourceEntityUseHashKey() <em>Relationship Source Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelationshipSourceEntityUseHashKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelationshipSourceEntityUseHashKey() <em>Relationship Source Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelationshipSourceEntityUseHashKey()
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipSourceEntityUseHashKey = RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTargetEntityUseHashKey() <em>Target Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetEntityUseHashKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_ENTITY_USE_HASH_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTargetEntityUseHashKey() <em>Target Entity Use Hash Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetEntityUseHashKey()
	 * @generated
	 * @ordered
	 */
	protected boolean targetEntityUseHashKey = TARGET_ENTITY_USE_HASH_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMappingOutputFields() <em>Target Mapping Output Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMappingOutputFields()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MAPPING_OUTPUT_FIELDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMappingOutputFields() <em>Target Mapping Output Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMappingOutputFields()
	 * @generated
	 * @ordered
	 */
	protected String targetMappingOutputFields = TARGET_MAPPING_OUTPUT_FIELDS_EDEFAULT;

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
	 * The cached value of the '{@link #getSourceReleationship() <em>Source Releationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReleationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship sourceReleationship;

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
				msgs = ((InternalEObject)postDedup).eInverseRemove(this, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE, Dedup.class, msgs);
			if (newPostDedup != null)
				msgs = ((InternalEObject)newPostDedup).eInverseAdd(this, SpecmodelPackage.DEDUP__POST_DEDUP_BUSINESSRULE, Dedup.class, msgs);
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
				msgs = ((InternalEObject)preDedup).eInverseRemove(this, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE, Dedup.class, msgs);
			if (newPreDedup != null)
				msgs = ((InternalEObject)newPreDedup).eInverseAdd(this, SpecmodelPackage.DEDUP__PRE_DEDUP_BUSINESSRULE, Dedup.class, msgs);
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
	public EList<Entity> getLookupEntities() {
		if (lookupEntities == null) {
			lookupEntities = new EObjectResolvingEList<Entity>(Entity.class, this, SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES);
		}
		return lookupEntities;
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
	public RuleType getRuletype() {
		return ruletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuletype(RuleType newRuletype) {
		RuleType oldRuletype = ruletype;
		ruletype = newRuletype == null ? RULETYPE_EDEFAULT : newRuletype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__RULETYPE, oldRuletype, ruletype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRelationshipTargetEntityUseHashKey() {
		return relationshipTargetEntityUseHashKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipTargetEntityUseHashKey(boolean newRelationshipTargetEntityUseHashKey) {
		boolean oldRelationshipTargetEntityUseHashKey = relationshipTargetEntityUseHashKey;
		relationshipTargetEntityUseHashKey = newRelationshipTargetEntityUseHashKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY, oldRelationshipTargetEntityUseHashKey, relationshipTargetEntityUseHashKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRelationshipSourceEntityUseHashKey() {
		return relationshipSourceEntityUseHashKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipSourceEntityUseHashKey(boolean newRelationshipSourceEntityUseHashKey) {
		boolean oldRelationshipSourceEntityUseHashKey = relationshipSourceEntityUseHashKey;
		relationshipSourceEntityUseHashKey = newRelationshipSourceEntityUseHashKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY, oldRelationshipSourceEntityUseHashKey, relationshipSourceEntityUseHashKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTargetEntityUseHashKey() {
		return targetEntityUseHashKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetEntityUseHashKey(boolean newTargetEntityUseHashKey) {
		boolean oldTargetEntityUseHashKey = targetEntityUseHashKey;
		targetEntityUseHashKey = newTargetEntityUseHashKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY, oldTargetEntityUseHashKey, targetEntityUseHashKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetMappingOutputFields() {
		return targetMappingOutputFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetMappingOutputFields(String newTargetMappingOutputFields) {
		String oldTargetMappingOutputFields = targetMappingOutputFields;
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
	public Relationship getSourceReleationship() {
		if (sourceReleationship != null && sourceReleationship.eIsProxy()) {
			InternalEObject oldSourceReleationship = (InternalEObject)sourceReleationship;
			sourceReleationship = (Relationship)eResolveProxy(oldSourceReleationship);
			if (sourceReleationship != oldSourceReleationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.BUSINESS_RULE__SOURCE_RELEATIONSHIP, oldSourceReleationship, sourceReleationship));
			}
		}
		return sourceReleationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetSourceReleationship() {
		return sourceReleationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceReleationship(Relationship newSourceReleationship) {
		Relationship oldSourceReleationship = sourceReleationship;
		sourceReleationship = newSourceReleationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.BUSINESS_RULE__SOURCE_RELEATIONSHIP, oldSourceReleationship, sourceReleationship));
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
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				if (postDedup != null)
					msgs = ((InternalEObject)postDedup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecmodelPackage.BUSINESS_RULE__POST_DEDUP, null, msgs);
				return basicSetPostDedup((Dedup)otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				if (preDedup != null)
					msgs = ((InternalEObject)preDedup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP, null, msgs);
				return basicSetPreDedup((Dedup)otherEnd, msgs);
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVectorkeys()).basicAdd(otherEnd, msgs);
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
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				return basicSetPostDedup(null, msgs);
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				return basicSetPreDedup(null, msgs);
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return ((InternalEList<?>)getVectorkeys()).basicRemove(otherEnd, msgs);
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
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				return getPostDedup();
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				return getPreDedup();
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return getVectorkeys();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				if (resolve) return getRelationshipTargetEntity();
				return basicGetRelationshipTargetEntity();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				if (resolve) return getTargetParentEntity();
				return basicGetTargetParentEntity();
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				return getLookupEntities();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				if (resolve) return getRelationshipSourceEntity();
				return basicGetRelationshipSourceEntity();
			case SpecmodelPackage.BUSINESS_RULE__RULETYPE:
				return getRuletype();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY:
				return isRelationshipTargetEntityUseHashKey();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY:
				return isRelationshipSourceEntityUseHashKey();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY:
				return isTargetEntityUseHashKey();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				return getTargetMappingOutputFields();
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				if (resolve) return getTargetRelationship();
				return basicGetTargetRelationship();
			case SpecmodelPackage.BUSINESS_RULE__SOURCE_RELEATIONSHIP:
				if (resolve) return getSourceReleationship();
				return basicGetSourceReleationship();
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
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				setPostDedup((Dedup)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				setPreDedup((Dedup)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				getVectorkeys().clear();
				getVectorkeys().addAll((Collection<? extends VectorKey>)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				setRelationshipTargetEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				setTargetEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				setTargetParentEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				getLookupEntities().clear();
				getLookupEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				setRelationshipSourceEntity((Entity)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RULETYPE:
				setRuletype((RuleType)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY:
				setRelationshipTargetEntityUseHashKey((Boolean)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY:
				setRelationshipSourceEntityUseHashKey((Boolean)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY:
				setTargetEntityUseHashKey((Boolean)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				setTargetMappingOutputFields((String)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				setTargetRelationship((Relationship)newValue);
				return;
			case SpecmodelPackage.BUSINESS_RULE__SOURCE_RELEATIONSHIP:
				setSourceReleationship((Relationship)newValue);
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
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				setPostDedup((Dedup)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				setPreDedup((Dedup)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				getVectorkeys().clear();
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				setRelationshipTargetEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				setTargetEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				setTargetParentEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				getLookupEntities().clear();
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				setRelationshipSourceEntity((Entity)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RULETYPE:
				setRuletype(RULETYPE_EDEFAULT);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY:
				setRelationshipTargetEntityUseHashKey(RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY_EDEFAULT);
				return;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY:
				setRelationshipSourceEntityUseHashKey(RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY_EDEFAULT);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY:
				setTargetEntityUseHashKey(TARGET_ENTITY_USE_HASH_KEY_EDEFAULT);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				setTargetMappingOutputFields(TARGET_MAPPING_OUTPUT_FIELDS_EDEFAULT);
				return;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				setTargetRelationship((Relationship)null);
				return;
			case SpecmodelPackage.BUSINESS_RULE__SOURCE_RELEATIONSHIP:
				setSourceReleationship((Relationship)null);
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
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
				return postDedup != null;
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
				return preDedup != null;
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
				return vectorkeys != null && !vectorkeys.isEmpty();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY:
				return relationshipTargetEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY:
				return targetEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_PARENT_ENTITY:
				return targetParentEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__LOOKUP_ENTITIES:
				return lookupEntities != null && !lookupEntities.isEmpty();
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY:
				return relationshipSourceEntity != null;
			case SpecmodelPackage.BUSINESS_RULE__RULETYPE:
				return ruletype != RULETYPE_EDEFAULT;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY:
				return relationshipTargetEntityUseHashKey != RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY_EDEFAULT;
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY:
				return relationshipSourceEntityUseHashKey != RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY_EDEFAULT;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY:
				return targetEntityUseHashKey != TARGET_ENTITY_USE_HASH_KEY_EDEFAULT;
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				return TARGET_MAPPING_OUTPUT_FIELDS_EDEFAULT == null ? targetMappingOutputFields != null : !TARGET_MAPPING_OUTPUT_FIELDS_EDEFAULT.equals(targetMappingOutputFields);
			case SpecmodelPackage.BUSINESS_RULE__TARGET_RELATIONSHIP:
				return targetRelationship != null;
			case SpecmodelPackage.BUSINESS_RULE__SOURCE_RELEATIONSHIP:
				return sourceReleationship != null;
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
		result.append(", ruletype: ");
		result.append(ruletype);
		result.append(", relationshipTargetEntityUseHashKey: ");
		result.append(relationshipTargetEntityUseHashKey);
		result.append(", relationshipSourceEntityUseHashKey: ");
		result.append(relationshipSourceEntityUseHashKey);
		result.append(", targetEntityUseHashKey: ");
		result.append(targetEntityUseHashKey);
		result.append(", targetMappingOutputFields: ");
		result.append(targetMappingOutputFields);
		result.append(')');
		return result.toString();
	}

} //BusinessRuleImpl
