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
import specmodel.ReadEntitySpecification;
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
 *   <li>{@link specmodel.impl.SourceImpl#getSourceReleationship <em>Source Releationship</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#isIsVector <em>Is Vector</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#isIsMultiplying <em>Is Multiplying</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getReadentityspecification <em>Readentityspecification</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getJoinComment <em>Join Comment</em>}</li>
 *   <li>{@link specmodel.impl.SourceImpl#getComment <em>Comment</em>}</li>
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
	 * The cached value of the '{@link #getSourceReleationship() <em>Source Releationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReleationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship sourceReleationship;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVector() <em>Is Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVector()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VECTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVector() <em>Is Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVector()
	 * @generated
	 * @ordered
	 */
	protected boolean isVector = IS_VECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultiplying() <em>Is Multiplying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiplying()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIPLYING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultiplying() <em>Is Multiplying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultiplying()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultiplying = IS_MULTIPLYING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadentityspecification() <em>Readentityspecification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadentityspecification()
	 * @generated
	 * @ordered
	 */
	protected ReadEntitySpecification readentityspecification;

	/**
	 * The default value of the '{@link #getJoinComment() <em>Join Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinComment()
	 * @generated
	 * @ordered
	 */
	protected static final String JOIN_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinComment() <em>Join Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinComment()
	 * @generated
	 * @ordered
	 */
	protected String joinComment = JOIN_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	public Relationship getSourceReleationship() {
		if (sourceReleationship != null && sourceReleationship.eIsProxy()) {
			InternalEObject oldSourceReleationship = (InternalEObject)sourceReleationship;
			sourceReleationship = (Relationship)eResolveProxy(oldSourceReleationship);
			if (sourceReleationship != oldSourceReleationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecmodelPackage.SOURCE__SOURCE_RELEATIONSHIP, oldSourceReleationship, sourceReleationship));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__SOURCE_RELEATIONSHIP, oldSourceReleationship, sourceReleationship));
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
	@Override
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVector() {
		return isVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVector(boolean newIsVector) {
		boolean oldIsVector = isVector;
		isVector = newIsVector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__IS_VECTOR, oldIsVector, isVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsMultiplying() {
		return isMultiplying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMultiplying(boolean newIsMultiplying) {
		boolean oldIsMultiplying = isMultiplying;
		isMultiplying = newIsMultiplying;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__IS_MULTIPLYING, oldIsMultiplying, isMultiplying));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReadEntitySpecification getReadentityspecification() {
		return readentityspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadentityspecification(ReadEntitySpecification newReadentityspecification, NotificationChain msgs) {
		ReadEntitySpecification oldReadentityspecification = readentityspecification;
		readentityspecification = newReadentityspecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__READENTITYSPECIFICATION, oldReadentityspecification, newReadentityspecification);
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
	public void setReadentityspecification(ReadEntitySpecification newReadentityspecification) {
		if (newReadentityspecification != readentityspecification) {
			NotificationChain msgs = null;
			if (readentityspecification != null)
				msgs = ((InternalEObject)readentityspecification).eInverseRemove(this, SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE, ReadEntitySpecification.class, msgs);
			if (newReadentityspecification != null)
				msgs = ((InternalEObject)newReadentityspecification).eInverseAdd(this, SpecmodelPackage.READ_ENTITY_SPECIFICATION__SOURCE, ReadEntitySpecification.class, msgs);
			msgs = basicSetReadentityspecification(newReadentityspecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__READENTITYSPECIFICATION, newReadentityspecification, newReadentityspecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJoinComment() {
		return joinComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinComment(String newJoinComment) {
		String oldJoinComment = joinComment;
		joinComment = newJoinComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__JOIN_COMMENT, oldJoinComment, joinComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecmodelPackage.SOURCE__COMMENT, oldComment, comment));
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
			case SpecmodelPackage.SOURCE__READENTITYSPECIFICATION:
				if (readentityspecification != null)
					msgs = ((InternalEObject)readentityspecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecmodelPackage.SOURCE__READENTITYSPECIFICATION, null, msgs);
				return basicSetReadentityspecification((ReadEntitySpecification)otherEnd, msgs);
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
			case SpecmodelPackage.SOURCE__READENTITYSPECIFICATION:
				return basicSetReadentityspecification(null, msgs);
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
			case SpecmodelPackage.SOURCE__SOURCE_RELEATIONSHIP:
				if (resolve) return getSourceReleationship();
				return basicGetSourceReleationship();
			case SpecmodelPackage.SOURCE__IS_MANDATORY:
				return isIsMandatory();
			case SpecmodelPackage.SOURCE__IS_VECTOR:
				return isIsVector();
			case SpecmodelPackage.SOURCE__IS_MULTIPLYING:
				return isIsMultiplying();
			case SpecmodelPackage.SOURCE__ALIAS:
				return getAlias();
			case SpecmodelPackage.SOURCE__READENTITYSPECIFICATION:
				return getReadentityspecification();
			case SpecmodelPackage.SOURCE__JOIN_COMMENT:
				return getJoinComment();
			case SpecmodelPackage.SOURCE__COMMENT:
				return getComment();
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
			case SpecmodelPackage.SOURCE__SOURCE_RELEATIONSHIP:
				setSourceReleationship((Relationship)newValue);
				return;
			case SpecmodelPackage.SOURCE__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case SpecmodelPackage.SOURCE__IS_VECTOR:
				setIsVector((Boolean)newValue);
				return;
			case SpecmodelPackage.SOURCE__IS_MULTIPLYING:
				setIsMultiplying((Boolean)newValue);
				return;
			case SpecmodelPackage.SOURCE__ALIAS:
				setAlias((String)newValue);
				return;
			case SpecmodelPackage.SOURCE__READENTITYSPECIFICATION:
				setReadentityspecification((ReadEntitySpecification)newValue);
				return;
			case SpecmodelPackage.SOURCE__JOIN_COMMENT:
				setJoinComment((String)newValue);
				return;
			case SpecmodelPackage.SOURCE__COMMENT:
				setComment((String)newValue);
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
			case SpecmodelPackage.SOURCE__SOURCE_RELEATIONSHIP:
				setSourceReleationship((Relationship)null);
				return;
			case SpecmodelPackage.SOURCE__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case SpecmodelPackage.SOURCE__IS_VECTOR:
				setIsVector(IS_VECTOR_EDEFAULT);
				return;
			case SpecmodelPackage.SOURCE__IS_MULTIPLYING:
				setIsMultiplying(IS_MULTIPLYING_EDEFAULT);
				return;
			case SpecmodelPackage.SOURCE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case SpecmodelPackage.SOURCE__READENTITYSPECIFICATION:
				setReadentityspecification((ReadEntitySpecification)null);
				return;
			case SpecmodelPackage.SOURCE__JOIN_COMMENT:
				setJoinComment(JOIN_COMMENT_EDEFAULT);
				return;
			case SpecmodelPackage.SOURCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case SpecmodelPackage.SOURCE__SOURCE_RELEATIONSHIP:
				return sourceReleationship != null;
			case SpecmodelPackage.SOURCE__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case SpecmodelPackage.SOURCE__IS_VECTOR:
				return isVector != IS_VECTOR_EDEFAULT;
			case SpecmodelPackage.SOURCE__IS_MULTIPLYING:
				return isMultiplying != IS_MULTIPLYING_EDEFAULT;
			case SpecmodelPackage.SOURCE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case SpecmodelPackage.SOURCE__READENTITYSPECIFICATION:
				return readentityspecification != null;
			case SpecmodelPackage.SOURCE__JOIN_COMMENT:
				return JOIN_COMMENT_EDEFAULT == null ? joinComment != null : !JOIN_COMMENT_EDEFAULT.equals(joinComment);
			case SpecmodelPackage.SOURCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case SpecmodelPackage.SOURCE__RELATIONSHIP:
				return relationship != null;
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
		result.append(" (isMandatory: ");
		result.append(isMandatory);
		result.append(", isVector: ");
		result.append(isVector);
		result.append(", isMultiplying: ");
		result.append(isMultiplying);
		result.append(", alias: ");
		result.append(alias);
		result.append(", joinComment: ");
		result.append(joinComment);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //SourceImpl
