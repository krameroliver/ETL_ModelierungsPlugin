/**
 */
package logmodel.impl;

import ETL_MODEL.ETL_MODELPackage;

import ETL_MODEL.impl.ETL_MODELPackageImpl;

import logmodel.BKDomain;
import logmodel.BusinessTerm;
import logmodel.CommonMapping;
import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
import logmodel.LogmodelFactory;
import logmodel.LogmodelPackage;
import logmodel.Relationship;
import logmodel.anotatable;
import logmodel.logpackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import package_enums.Package_enumsPackage;

import package_enums.impl.Package_enumsPackageImpl;
import techmodel.TechmodelPackage;
import techmodel.impl.TechmodelPackageImpl;
import type_enum.Type_enumPackage;

import type_enum.impl.Type_enumPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogmodelPackageImpl extends EPackageImpl implements LogmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logpackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bkDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anotatableEClass = null;

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
	 * @see logmodel.LogmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogmodelPackageImpl() {
		super(eNS_URI, LogmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogmodelPackage init() {
		if (isInited) return (LogmodelPackage)EPackage.Registry.INSTANCE.getEPackage(LogmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogmodelPackageImpl theLogmodelPackage = registeredLogmodelPackage instanceof LogmodelPackageImpl ? (LogmodelPackageImpl)registeredLogmodelPackage : new LogmodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TechmodelPackage.eNS_URI);
		TechmodelPackageImpl theTechmodelPackage = (TechmodelPackageImpl)(registeredPackage instanceof TechmodelPackageImpl ? registeredPackage : TechmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);
		ETL_MODELPackageImpl theETL_MODELPackage = (ETL_MODELPackageImpl)(registeredPackage instanceof ETL_MODELPackageImpl ? registeredPackage : ETL_MODELPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Package_enumsPackage.eNS_URI);
		Package_enumsPackageImpl thePackage_enumsPackage = (Package_enumsPackageImpl)(registeredPackage instanceof Package_enumsPackageImpl ? registeredPackage : Package_enumsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);
		Type_enumPackageImpl theType_enumPackage = (Type_enumPackageImpl)(registeredPackage instanceof Type_enumPackageImpl ? registeredPackage : Type_enumPackage.eINSTANCE);

		// Create package meta-data objects
		theLogmodelPackage.createPackageContents();
		theTechmodelPackage.createPackageContents();
		theETL_MODELPackage.createPackageContents();
		thePackage_enumsPackage.createPackageContents();
		theType_enumPackage.createPackageContents();

		// Initialize created meta-data
		theLogmodelPackage.initializePackageContents();
		theTechmodelPackage.initializePackageContents();
		theETL_MODELPackage.initializePackageContents();
		thePackage_enumsPackage.initializePackageContents();
		theType_enumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogmodelPackage.eNS_URI, theLogmodelPackage);
		return theLogmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getlogpackage() {
		return logpackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getlogpackage_Entity() {
		return (EReference)logpackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getlogpackage_Commonmapping() {
		return (EReference)logpackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Logpackage() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_EntityField() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Include() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Relationships() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Filename() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Delimiter() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Lineend() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Techpackage() {
		return (EReference)entityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Tables() {
		return (EReference)entityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Entity() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Include() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Length() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Precision() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Scale() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Original_name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Short_describtion() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_DateFormat() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_NullIndicator() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_AllowExponent() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_HasImplicitComma() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_InterfaceOnly() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_TableOnly() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_IsFastChanging() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Type() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_IsBusinessKey() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Table() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_FromEntity() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_ToEntity() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_IdentifiyingFieldsRel() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_DescribingFieldsRel() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Describingfields() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Entity() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_RelationshipAlias() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBKDomain() {
		return bkDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInclude_IncludeFields() {
		return (EReference)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInclude_Identifyingfields() {
		return (EReference)includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInclude_Entity() {
		return (EReference)includeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBusinessTerm() {
		return businessTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_State() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_PrimaryFdmID() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_GroupID() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_Description() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_PrimaryFDMName() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_UsedBy() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_FunctionalSpecification() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_RegulatoryRequirements() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBusinessTerm_DataOwner() {
		return (EAttribute)businessTermEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBusinessTerm_Field() {
		return (EReference)businessTermEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonMapping() {
		return commonMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonMapping_Commonmappinginputfields() {
		return (EReference)commonMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonMapping_Commonmappingoutputfields() {
		return (EReference)commonMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommonMapping_Logpackage() {
		return (EReference)commonMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getanotatable() {
		return anotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogmodelFactory getLogmodelFactory() {
		return (LogmodelFactory)getEFactoryInstance();
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
		logpackageEClass = createEClass(LOGPACKAGE);
		createEReference(logpackageEClass, LOGPACKAGE__ENTITY);
		createEReference(logpackageEClass, LOGPACKAGE__COMMONMAPPING);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__LOGPACKAGE);
		createEReference(entityEClass, ENTITY__ENTITY_FIELD);
		createEReference(entityEClass, ENTITY__INCLUDE);
		createEReference(entityEClass, ENTITY__RELATIONSHIPS);
		createEAttribute(entityEClass, ENTITY__FILENAME);
		createEAttribute(entityEClass, ENTITY__DELIMITER);
		createEAttribute(entityEClass, ENTITY__LINEEND);
		createEReference(entityEClass, ENTITY__TECHPACKAGE);
		createEReference(entityEClass, ENTITY__TABLES);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__ENTITY);
		createEReference(fieldEClass, FIELD__INCLUDE);
		createEAttribute(fieldEClass, FIELD__LENGTH);
		createEAttribute(fieldEClass, FIELD__PRECISION);
		createEAttribute(fieldEClass, FIELD__SCALE);
		createEAttribute(fieldEClass, FIELD__ORIGINAL_NAME);
		createEAttribute(fieldEClass, FIELD__SHORT_DESCRIBTION);
		createEAttribute(fieldEClass, FIELD__DATE_FORMAT);
		createEAttribute(fieldEClass, FIELD__NULL_INDICATOR);
		createEAttribute(fieldEClass, FIELD__ALLOW_EXPONENT);
		createEAttribute(fieldEClass, FIELD__HAS_IMPLICIT_COMMA);
		createEAttribute(fieldEClass, FIELD__INTERFACE_ONLY);
		createEAttribute(fieldEClass, FIELD__TABLE_ONLY);
		createEAttribute(fieldEClass, FIELD__IS_FAST_CHANGING);
		createEAttribute(fieldEClass, FIELD__TYPE);
		createEAttribute(fieldEClass, FIELD__IS_BUSINESS_KEY);
		createEReference(fieldEClass, FIELD__TABLE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__FROM_ENTITY);
		createEReference(relationshipEClass, RELATIONSHIP__TO_ENTITY);
		createEReference(relationshipEClass, RELATIONSHIP__IDENTIFIYING_FIELDS_REL);
		createEReference(relationshipEClass, RELATIONSHIP__DESCRIBING_FIELDS_REL);
		createEReference(relationshipEClass, RELATIONSHIP__DESCRIBINGFIELDS);
		createEReference(relationshipEClass, RELATIONSHIP__ENTITY);
		createEAttribute(relationshipEClass, RELATIONSHIP__RELATIONSHIP_ALIAS);

		bkDomainEClass = createEClass(BK_DOMAIN);

		includeEClass = createEClass(INCLUDE);
		createEReference(includeEClass, INCLUDE__INCLUDE_FIELDS);
		createEReference(includeEClass, INCLUDE__IDENTIFYINGFIELDS);
		createEReference(includeEClass, INCLUDE__ENTITY);

		businessTermEClass = createEClass(BUSINESS_TERM);
		createEAttribute(businessTermEClass, BUSINESS_TERM__STATE);
		createEAttribute(businessTermEClass, BUSINESS_TERM__PRIMARY_FDM_ID);
		createEAttribute(businessTermEClass, BUSINESS_TERM__GROUP_ID);
		createEAttribute(businessTermEClass, BUSINESS_TERM__DESCRIPTION);
		createEAttribute(businessTermEClass, BUSINESS_TERM__PRIMARY_FDM_NAME);
		createEAttribute(businessTermEClass, BUSINESS_TERM__USED_BY);
		createEAttribute(businessTermEClass, BUSINESS_TERM__FUNCTIONAL_SPECIFICATION);
		createEAttribute(businessTermEClass, BUSINESS_TERM__REGULATORY_REQUIREMENTS);
		createEAttribute(businessTermEClass, BUSINESS_TERM__DATA_OWNER);
		createEReference(businessTermEClass, BUSINESS_TERM__FIELD);

		commonMappingEClass = createEClass(COMMON_MAPPING);
		createEReference(commonMappingEClass, COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS);
		createEReference(commonMappingEClass, COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS);
		createEReference(commonMappingEClass, COMMON_MAPPING__LOGPACKAGE);

		anotatableEClass = createEClass(ANOTATABLE);
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
		TechmodelPackage theTechmodelPackage = (TechmodelPackage)EPackage.Registry.INSTANCE.getEPackage(TechmodelPackage.eNS_URI);
		Type_enumPackage theType_enumPackage = (Type_enumPackage)EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logpackageEClass.getESuperTypes().add(theETL_MODELPackage.getPackage());
		entityEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		fieldEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		relationshipEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		includeEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		businessTermEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		commonMappingEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());
		commonMappingEClass.getESuperTypes().add(this.getanotatable());
		anotatableEClass.getESuperTypes().add(theETL_MODELPackage.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(logpackageEClass, logpackage.class, "logpackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlogpackage_Entity(), this.getEntity(), this.getEntity_Logpackage(), "entity", null, 0, -1, logpackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getlogpackage_Commonmapping(), this.getCommonMapping(), this.getCommonMapping_Logpackage(), "commonmapping", null, 0, -1, logpackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Logpackage(), this.getlogpackage(), this.getlogpackage_Entity(), "logpackage", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_EntityField(), this.getField(), this.getField_Entity(), "entityField", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Include(), this.getInclude(), this.getInclude_Entity(), "include", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relationships(), this.getRelationship(), this.getRelationship_Entity(), "relationships", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Lineend(), ecorePackage.getEString(), "lineend", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Techpackage(), theTechmodelPackage.getTechPackage(), theTechmodelPackage.getTechPackage_Entitys(), "techpackage", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Tables(), theTechmodelPackage.getTable(), theTechmodelPackage.getTable_Entity(), "tables", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Entity(), this.getEntity(), this.getEntity_EntityField(), "entity", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Include(), this.getInclude(), this.getInclude_IncludeFields(), "include", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Length(), ecorePackage.getEInt(), "length", "1", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Original_name(), ecorePackage.getEString(), "original_name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Short_describtion(), ecorePackage.getEString(), "short_describtion", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_NullIndicator(), ecorePackage.getEString(), "NullIndicator", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_AllowExponent(), ecorePackage.getEBoolean(), "allowExponent", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_HasImplicitComma(), ecorePackage.getEBoolean(), "hasImplicitComma", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_InterfaceOnly(), ecorePackage.getEBoolean(), "interfaceOnly", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_TableOnly(), ecorePackage.getEBoolean(), "tableOnly", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_IsFastChanging(), ecorePackage.getEBoolean(), "isFastChanging", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Type(), theType_enumPackage.getFieldTypes(), "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_IsBusinessKey(), ecorePackage.getEBoolean(), "isBusinessKey", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Table(), theTechmodelPackage.getTable(), theTechmodelPackage.getTable_Fields(), "table", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_FromEntity(), this.getEntity(), null, "fromEntity", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_ToEntity(), this.getEntity(), null, "toEntity", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_IdentifiyingFieldsRel(), this.getField(), null, "identifiyingFieldsRel", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_DescribingFieldsRel(), this.getField(), null, "describingFieldsRel", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Describingfields(), this.getField(), null, "describingfields", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Entity(), this.getEntity(), this.getEntity_Relationships(), "entity", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_RelationshipAlias(), ecorePackage.getEString(), "relationshipAlias", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bkDomainEClass, BKDomain.class, "BKDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclude_IncludeFields(), this.getField(), this.getField_Include(), "includeFields", null, 0, -1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInclude_Identifyingfields(), this.getField(), null, "identifyingfields", null, 0, -1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInclude_Entity(), this.getEntity(), this.getEntity_Include(), "entity", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessTermEClass, BusinessTerm.class, "BusinessTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessTerm_State(), ecorePackage.getEString(), "state", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_PrimaryFdmID(), ecorePackage.getEString(), "primaryFdmID", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_GroupID(), ecorePackage.getEString(), "groupID", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_Description(), ecorePackage.getEString(), "description", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_PrimaryFDMName(), ecorePackage.getEString(), "primaryFDMName", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_UsedBy(), ecorePackage.getEString(), "usedBy", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_FunctionalSpecification(), ecorePackage.getEString(), "functionalSpecification", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_RegulatoryRequirements(), ecorePackage.getEString(), "regulatoryRequirements", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessTerm_DataOwner(), ecorePackage.getEString(), "DataOwner", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessTerm_Field(), this.getField(), null, "field", null, 0, 1, BusinessTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonMappingEClass, CommonMapping.class, "CommonMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonMapping_Commonmappinginputfields(), this.getField(), null, "commonmappinginputfields", null, 0, -1, CommonMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonMapping_Commonmappingoutputfields(), this.getField(), null, "commonmappingoutputfields", null, 0, -1, CommonMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonMapping_Logpackage(), this.getlogpackage(), this.getlogpackage_Commonmapping(), "logpackage", null, 0, 1, CommonMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anotatableEClass, anotatable.class, "anotatable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LogmodelPackageImpl
