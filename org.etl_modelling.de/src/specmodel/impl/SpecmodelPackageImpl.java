/**
 */
package specmodel.impl;

import ETL_MODEL.ETL_MODELPackage;

import ETL_MODEL.impl.ETL_MODELPackageImpl;

import logmodel.LogmodelPackage;

import logmodel.impl.LogmodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import package_enums.Package_enumsPackage;

import package_enums.impl.Package_enumsPackageImpl;

import specmodel.BusinessRule;
import specmodel.Dedup;
import specmodel.Filter;
import specmodel.JoinField;
import specmodel.RuleType;
import specmodel.Source;
import specmodel.SpecPackage;
import specmodel.Specification;
import specmodel.SpecmodelFactory;
import specmodel.SpecmodelPackage;
import specmodel.SubSpecification;
import specmodel.VectorKey;

import type_enum.Type_enumPackage;

import type_enum.impl.Type_enumPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecmodelPackageImpl extends EPackageImpl implements SpecmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dedupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see specmodel.SpecmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpecmodelPackageImpl() {
		super(eNS_URI, SpecmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpecmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpecmodelPackage init() {
		if (isInited) return (SpecmodelPackage)EPackage.Registry.INSTANCE.getEPackage(SpecmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpecmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpecmodelPackageImpl theSpecmodelPackage = registeredSpecmodelPackage instanceof SpecmodelPackageImpl ? (SpecmodelPackageImpl)registeredSpecmodelPackage : new SpecmodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);
		ETL_MODELPackageImpl theETL_MODELPackage = (ETL_MODELPackageImpl)(registeredPackage instanceof ETL_MODELPackageImpl ? registeredPackage : ETL_MODELPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogmodelPackage.eNS_URI);
		LogmodelPackageImpl theLogmodelPackage = (LogmodelPackageImpl)(registeredPackage instanceof LogmodelPackageImpl ? registeredPackage : LogmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Package_enumsPackage.eNS_URI);
		Package_enumsPackageImpl thePackage_enumsPackage = (Package_enumsPackageImpl)(registeredPackage instanceof Package_enumsPackageImpl ? registeredPackage : Package_enumsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);
		Type_enumPackageImpl theType_enumPackage = (Type_enumPackageImpl)(registeredPackage instanceof Type_enumPackageImpl ? registeredPackage : Type_enumPackage.eINSTANCE);

		// Create package meta-data objects
		theSpecmodelPackage.createPackageContents();
		theETL_MODELPackage.createPackageContents();
		theLogmodelPackage.createPackageContents();
		thePackage_enumsPackage.createPackageContents();
		theType_enumPackage.createPackageContents();

		// Initialize created meta-data
		theSpecmodelPackage.initializePackageContents();
		theETL_MODELPackage.initializePackageContents();
		theLogmodelPackage.initializePackageContents();
		thePackage_enumsPackage.initializePackageContents();
		theType_enumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpecmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpecmodelPackage.eNS_URI, theSpecmodelPackage);
		return theSpecmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecPackage() {
		return specPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecPackage_Specifications() {
		return (EReference)specPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecification_Specpackage() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecification_Businessrules() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecification_PrimarySources() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoinField() {
		return joinFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoinField_ParentSource() {
		return (EReference)joinFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoinField_ChildSource() {
		return (EReference)joinFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoinField_Field() {
		return (EReference)joinFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDedup() {
		return dedupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDedup_PreDedupBusinessRule() {
		return (EReference)dedupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDedup_PostDedupBusinessRule() {
		return (EReference)dedupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDedup_Field() {
		return (EReference)dedupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_Field() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_PreFilterBusinessRule() {
		return (EReference)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_PostFilterBusinessRule() {
		return (EReference)filterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSpecification() {
		return subSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessRule() {
		return businessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_Specification() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_PreDedup() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_PostDedup() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_Vectorkeys() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_PreFilter() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_PostFilter() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessRule_RuleType() {
		return (EAttribute)businessRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_TargetEntity() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_RelationshipSourceEntity() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_RelationshipTargetEntity() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_TargetParentEntity() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_LookupEntities() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_TargetMappingOutputFields() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_TargetRelationship() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_TargetInclude() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessRule_Sources() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_SourceSpecification() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_ParentSource() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_ChildSources() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Specification() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_ParentJoinFields() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_ChildJoinField() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Filters() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Vectorkeys() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_SourceEntity() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_IsVector() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_IsMultiplying() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Comment() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_Alias() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_IsMandatory() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_JoinComment() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_RelationshipAlias() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_SourceReleationship() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_JoinEntity() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Businessrule() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSource_JoinType() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVectorKey() {
		return vectorKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVectorKey_Businessrule() {
		return (EReference)vectorKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVectorKey_Source() {
		return (EReference)vectorKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVectorKey_VkField() {
		return (EReference)vectorKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRuleType() {
		return ruleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecmodelFactory getSpecmodelFactory() {
		return (SpecmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		specPackageEClass = createEClass(SPEC_PACKAGE);
		createEReference(specPackageEClass, SPEC_PACKAGE__SPECIFICATIONS);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__SPECPACKAGE);
		createEReference(specificationEClass, SPECIFICATION__BUSINESSRULES);
		createEReference(specificationEClass, SPECIFICATION__PRIMARY_SOURCES);

		joinFieldEClass = createEClass(JOIN_FIELD);
		createEReference(joinFieldEClass, JOIN_FIELD__PARENT_SOURCE);
		createEReference(joinFieldEClass, JOIN_FIELD__CHILD_SOURCE);
		createEReference(joinFieldEClass, JOIN_FIELD__FIELD);

		dedupEClass = createEClass(DEDUP);
		createEReference(dedupEClass, DEDUP__PRE_DEDUP_BUSINESS_RULE);
		createEReference(dedupEClass, DEDUP__POST_DEDUP_BUSINESS_RULE);
		createEReference(dedupEClass, DEDUP__FIELD);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__FIELD);
		createEReference(filterEClass, FILTER__PRE_FILTER_BUSINESS_RULE);
		createEReference(filterEClass, FILTER__POST_FILTER_BUSINESS_RULE);

		subSpecificationEClass = createEClass(SUB_SPECIFICATION);

		businessRuleEClass = createEClass(BUSINESS_RULE);
		createEReference(businessRuleEClass, BUSINESS_RULE__SPECIFICATION);
		createEReference(businessRuleEClass, BUSINESS_RULE__PRE_DEDUP);
		createEReference(businessRuleEClass, BUSINESS_RULE__POST_DEDUP);
		createEReference(businessRuleEClass, BUSINESS_RULE__VECTORKEYS);
		createEReference(businessRuleEClass, BUSINESS_RULE__PRE_FILTER);
		createEReference(businessRuleEClass, BUSINESS_RULE__POST_FILTER);
		createEAttribute(businessRuleEClass, BUSINESS_RULE__RULE_TYPE);
		createEReference(businessRuleEClass, BUSINESS_RULE__TARGET_ENTITY);
		createEReference(businessRuleEClass, BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY);
		createEReference(businessRuleEClass, BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY);
		createEReference(businessRuleEClass, BUSINESS_RULE__TARGET_PARENT_ENTITY);
		createEReference(businessRuleEClass, BUSINESS_RULE__LOOKUP_ENTITIES);
		createEReference(businessRuleEClass, BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS);
		createEReference(businessRuleEClass, BUSINESS_RULE__TARGET_RELATIONSHIP);
		createEReference(businessRuleEClass, BUSINESS_RULE__TARGET_INCLUDE);
		createEReference(businessRuleEClass, BUSINESS_RULE__SOURCES);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__SOURCE_SPECIFICATION);
		createEReference(sourceEClass, SOURCE__PARENT_SOURCE);
		createEReference(sourceEClass, SOURCE__CHILD_SOURCES);
		createEReference(sourceEClass, SOURCE__SPECIFICATION);
		createEReference(sourceEClass, SOURCE__PARENT_JOIN_FIELDS);
		createEReference(sourceEClass, SOURCE__CHILD_JOIN_FIELD);
		createEReference(sourceEClass, SOURCE__FILTERS);
		createEReference(sourceEClass, SOURCE__VECTORKEYS);
		createEReference(sourceEClass, SOURCE__SOURCE_ENTITY);
		createEAttribute(sourceEClass, SOURCE__IS_VECTOR);
		createEAttribute(sourceEClass, SOURCE__IS_MULTIPLYING);
		createEAttribute(sourceEClass, SOURCE__COMMENT);
		createEAttribute(sourceEClass, SOURCE__ALIAS);
		createEAttribute(sourceEClass, SOURCE__IS_MANDATORY);
		createEAttribute(sourceEClass, SOURCE__JOIN_COMMENT);
		createEAttribute(sourceEClass, SOURCE__RELATIONSHIP_ALIAS);
		createEReference(sourceEClass, SOURCE__SOURCE_RELEATIONSHIP);
		createEReference(sourceEClass, SOURCE__JOIN_ENTITY);
		createEReference(sourceEClass, SOURCE__BUSINESSRULE);
		createEAttribute(sourceEClass, SOURCE__JOIN_TYPE);

		vectorKeyEClass = createEClass(VECTOR_KEY);
		createEReference(vectorKeyEClass, VECTOR_KEY__BUSINESSRULE);
		createEReference(vectorKeyEClass, VECTOR_KEY__SOURCE);
		createEReference(vectorKeyEClass, VECTOR_KEY__VK_FIELD);

		// Create enums
		ruleTypeEEnum = createEEnum(RULE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ETL_MODELPackage theETL_MODELPackage = (ETL_MODELPackage)EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);
		LogmodelPackage theLogmodelPackage = (LogmodelPackage)EPackage.Registry.INSTANCE.getEPackage(LogmodelPackage.eNS_URI);
		Type_enumPackage theType_enumPackage = (Type_enumPackage)EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specPackageEClass.getESuperTypes().add(theETL_MODELPackage.getPackage());
		specificationEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		joinFieldEClass.getESuperTypes().add(theLogmodelPackage.getField());
		subSpecificationEClass.getESuperTypes().add(this.getSpecification());
		businessRuleEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		sourceEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());

		// Initialize classes, features, and operations; add parameters
		initEClass(specPackageEClass, SpecPackage.class, "SpecPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecPackage_Specifications(), this.getSpecification(), this.getSpecification_Specpackage(), "specifications", null, 0, -1, SpecPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Specpackage(), this.getSpecPackage(), this.getSpecPackage_Specifications(), "specpackage", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Businessrules(), this.getBusinessRule(), this.getBusinessRule_Specification(), "businessrules", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_PrimarySources(), this.getSource(), this.getSource_Specification(), "primarySources", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinFieldEClass, JoinField.class, "JoinField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinField_ParentSource(), this.getSource(), this.getSource_ParentJoinFields(), "parentSource", null, 0, 1, JoinField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinField_ChildSource(), this.getSource(), this.getSource_ChildJoinField(), "childSource", null, 0, 1, JoinField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinField_Field(), theLogmodelPackage.getField(), null, "field", null, 0, 1, JoinField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dedupEClass, Dedup.class, "Dedup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDedup_PreDedupBusinessRule(), this.getBusinessRule(), this.getBusinessRule_PreDedup(), "preDedupBusinessRule", null, 0, 1, Dedup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDedup_PostDedupBusinessRule(), this.getBusinessRule(), this.getBusinessRule_PostDedup(), "postDedupBusinessRule", null, 0, 1, Dedup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDedup_Field(), theLogmodelPackage.getField(), null, "field", null, 0, 1, Dedup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Field(), theLogmodelPackage.getField(), null, "field", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_PreFilterBusinessRule(), this.getBusinessRule(), this.getBusinessRule_PreFilter(), "preFilterBusinessRule", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_PostFilterBusinessRule(), this.getBusinessRule(), this.getBusinessRule_PostFilter(), "postFilterBusinessRule", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSpecificationEClass, SubSpecification.class, "SubSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessRuleEClass, BusinessRule.class, "BusinessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessRule_Specification(), this.getSpecification(), this.getSpecification_Businessrules(), "specification", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_PreDedup(), this.getDedup(), this.getDedup_PreDedupBusinessRule(), "preDedup", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_PostDedup(), this.getDedup(), this.getDedup_PostDedupBusinessRule(), "postDedup", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_Vectorkeys(), this.getVectorKey(), this.getVectorKey_Businessrule(), "vectorkeys", null, 0, -1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_PreFilter(), this.getFilter(), this.getFilter_PreFilterBusinessRule(), "preFilter", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_PostFilter(), this.getFilter(), this.getFilter_PostFilterBusinessRule(), "postFilter", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessRule_RuleType(), this.getRuleType(), "RuleType", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_TargetEntity(), theLogmodelPackage.getEntity(), null, "targetEntity", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_RelationshipSourceEntity(), theLogmodelPackage.getEntity(), null, "relationshipSourceEntity", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_RelationshipTargetEntity(), theLogmodelPackage.getEntity(), null, "relationshipTargetEntity", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_TargetParentEntity(), theLogmodelPackage.getEntity(), null, "targetParentEntity", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_LookupEntities(), theLogmodelPackage.getEntity(), null, "lookupEntities", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_TargetMappingOutputFields(), theLogmodelPackage.getCommonMapping(), null, "targetMappingOutputFields", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_TargetRelationship(), theLogmodelPackage.getRelationship(), null, "targetRelationship", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_TargetInclude(), theLogmodelPackage.getInclude(), null, "targetInclude", null, 0, 1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRule_Sources(), this.getSource(), this.getSource_Businessrule(), "sources", null, 0, -1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_SourceSpecification(), this.getSpecification(), null, "sourceSpecification", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_ParentSource(), this.getSource(), this.getSource_ChildSources(), "parentSource", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_ChildSources(), this.getSource(), this.getSource_ParentSource(), "childSources", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Specification(), this.getSpecification(), this.getSpecification_PrimarySources(), "specification", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_ParentJoinFields(), this.getJoinField(), this.getJoinField_ParentSource(), "parentJoinFields", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_ChildJoinField(), this.getJoinField(), this.getJoinField_ChildSource(), "childJoinField", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Filters(), this.getFilter(), null, "filters", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Vectorkeys(), this.getVectorKey(), this.getVectorKey_Source(), "vectorkeys", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_SourceEntity(), theLogmodelPackage.getEntity(), null, "sourceEntity", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_IsVector(), ecorePackage.getEBoolean(), "isVector", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_IsMultiplying(), ecorePackage.getEBoolean(), "isMultiplying", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_JoinComment(), ecorePackage.getEString(), "joinComment", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_RelationshipAlias(), ecorePackage.getEString(), "relationshipAlias", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_SourceReleationship(), theLogmodelPackage.getRelationship(), null, "sourceReleationship", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_JoinEntity(), theLogmodelPackage.getEntity(), null, "joinEntity", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Businessrule(), this.getBusinessRule(), this.getBusinessRule_Sources(), "businessrule", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_JoinType(), theType_enumPackage.getJoinTypes(), "JoinType", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorKeyEClass, VectorKey.class, "VectorKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVectorKey_Businessrule(), this.getBusinessRule(), this.getBusinessRule_Vectorkeys(), "businessrule", null, 0, 1, VectorKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorKey_Source(), this.getSource(), this.getSource_Vectorkeys(), "source", null, 0, 1, VectorKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVectorKey_VkField(), theLogmodelPackage.getField(), null, "vkField", null, 0, 1, VectorKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ruleTypeEEnum, RuleType.class, "RuleType");
		addEEnumLiteral(ruleTypeEEnum, RuleType.SINGLE_FIRE);
		addEEnumLiteral(ruleTypeEEnum, RuleType.MULTI_FIRE);
		addEEnumLiteral(ruleTypeEEnum, RuleType.AGGREGATION);
		addEEnumLiteral(ruleTypeEEnum, RuleType.FILTER);
		addEEnumLiteral(ruleTypeEEnum, RuleType.DEDUP);

		// Create resource
		createResource(eNS_URI);
	}

} //SpecmodelPackageImpl
