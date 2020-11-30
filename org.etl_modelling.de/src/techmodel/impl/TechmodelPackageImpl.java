/**
 */
package techmodel.impl;

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

import techmodel.Table;
import techmodel.TableType;
import techmodel.TechPackage;
import techmodel.TechmodelFactory;
import techmodel.TechmodelPackage;
import type_enum.Type_enumPackage;
import type_enum.impl.Type_enumPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechmodelPackageImpl extends EPackageImpl implements TechmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableTypeEEnum = null;

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
	 * @see techmodel.TechmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TechmodelPackageImpl() {
		super(eNS_URI, TechmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TechmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TechmodelPackage init() {
		if (isInited) return (TechmodelPackage)EPackage.Registry.INSTANCE.getEPackage(TechmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTechmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TechmodelPackageImpl theTechmodelPackage = registeredTechmodelPackage instanceof TechmodelPackageImpl ? (TechmodelPackageImpl)registeredTechmodelPackage : new TechmodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);
		ETL_MODELPackageImpl theETL_MODELPackage = (ETL_MODELPackageImpl)(registeredPackage instanceof ETL_MODELPackageImpl ? registeredPackage : ETL_MODELPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Package_enumsPackage.eNS_URI);
		Package_enumsPackageImpl thePackage_enumsPackage = (Package_enumsPackageImpl)(registeredPackage instanceof Package_enumsPackageImpl ? registeredPackage : Package_enumsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogmodelPackage.eNS_URI);
		LogmodelPackageImpl theLogmodelPackage = (LogmodelPackageImpl)(registeredPackage instanceof LogmodelPackageImpl ? registeredPackage : LogmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);
		Type_enumPackageImpl theType_enumPackage = (Type_enumPackageImpl)(registeredPackage instanceof Type_enumPackageImpl ? registeredPackage : Type_enumPackage.eINSTANCE);

		// Create package meta-data objects
		theTechmodelPackage.createPackageContents();
		theETL_MODELPackage.createPackageContents();
		thePackage_enumsPackage.createPackageContents();
		theLogmodelPackage.createPackageContents();
		theType_enumPackage.createPackageContents();

		// Initialize created meta-data
		theTechmodelPackage.initializePackageContents();
		theETL_MODELPackage.initializePackageContents();
		thePackage_enumsPackage.initializePackageContents();
		theLogmodelPackage.initializePackageContents();
		theType_enumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTechmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TechmodelPackage.eNS_URI, theTechmodelPackage);
		return theTechmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechPackage() {
		return techPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechPackage_Entitys() {
		return (EReference)techPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechPackage_Tables() {
		return (EReference)techPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_TableType() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Fields() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Entity() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Techpackage() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTableType() {
		return tableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechmodelFactory getTechmodelFactory() {
		return (TechmodelFactory)getEFactoryInstance();
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
		techPackageEClass = createEClass(TECH_PACKAGE);
		createEReference(techPackageEClass, TECH_PACKAGE__ENTITYS);
		createEReference(techPackageEClass, TECH_PACKAGE__TABLES);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__TABLE_TYPE);
		createEReference(tableEClass, TABLE__FIELDS);
		createEReference(tableEClass, TABLE__ENTITY);
		createEReference(tableEClass, TABLE__TECHPACKAGE);

		// Create enums
		tableTypeEEnum = createEEnum(TABLE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		techPackageEClass.getESuperTypes().add(theETL_MODELPackage.getPackage());
		tableEClass.getESuperTypes().add(theETL_MODELPackage.getnamedelement());

		// Initialize classes, features, and operations; add parameters
		initEClass(techPackageEClass, TechPackage.class, "TechPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechPackage_Entitys(), theLogmodelPackage.getEntity(), theLogmodelPackage.getEntity_Techpackage(), "entitys", null, 0, -1, TechPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechPackage_Tables(), this.getTable(), this.getTable_Techpackage(), "tables", null, 0, -1, TechPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_TableType(), this.getTableType(), "TableType", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Fields(), theLogmodelPackage.getField(), theLogmodelPackage.getField_Table(), "fields", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Entity(), theLogmodelPackage.getEntity(), theLogmodelPackage.getEntity_Tables(), "entity", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Techpackage(), this.getTechPackage(), this.getTechPackage_Tables(), "techpackage", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tableTypeEEnum, TableType.class, "TableType");
		addEEnumLiteral(tableTypeEEnum, TableType.SAT);
		addEEnumLiteral(tableTypeEEnum, TableType.HUB);
		addEEnumLiteral(tableTypeEEnum, TableType.LINK);
		addEEnumLiteral(tableTypeEEnum, TableType.REFERENZ);

		// Create resource
		createResource(eNS_URI);
	}

} //TechmodelPackageImpl
