/**
 */
package type_enum.impl;

import ETL_MODEL.ETL_MODELPackage;

import ETL_MODEL.impl.ETL_MODELPackageImpl;

import logmodel.LogmodelPackage;

import logmodel.impl.LogmodelPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import package_enums.Package_enumsPackage;

import package_enums.impl.Package_enumsPackageImpl;
import techmodel.TechmodelPackage;
import techmodel.impl.TechmodelPackageImpl;
import type_enum.FieldTypes;
import type_enum.JoinTypes;
import type_enum.Type_enumFactory;
import type_enum.Type_enumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Type_enumPackageImpl extends EPackageImpl implements Type_enumPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieldTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinTypesEEnum = null;

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
	 * @see type_enum.Type_enumPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Type_enumPackageImpl() {
		super(eNS_URI, Type_enumFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Type_enumPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Type_enumPackage init() {
		if (isInited) return (Type_enumPackage)EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredType_enumPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Type_enumPackageImpl theType_enumPackage = registeredType_enumPackage instanceof Type_enumPackageImpl ? (Type_enumPackageImpl)registeredType_enumPackage : new Type_enumPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TechmodelPackage.eNS_URI);
		TechmodelPackageImpl theTechmodelPackage = (TechmodelPackageImpl)(registeredPackage instanceof TechmodelPackageImpl ? registeredPackage : TechmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);
		ETL_MODELPackageImpl theETL_MODELPackage = (ETL_MODELPackageImpl)(registeredPackage instanceof ETL_MODELPackageImpl ? registeredPackage : ETL_MODELPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Package_enumsPackage.eNS_URI);
		Package_enumsPackageImpl thePackage_enumsPackage = (Package_enumsPackageImpl)(registeredPackage instanceof Package_enumsPackageImpl ? registeredPackage : Package_enumsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogmodelPackage.eNS_URI);
		LogmodelPackageImpl theLogmodelPackage = (LogmodelPackageImpl)(registeredPackage instanceof LogmodelPackageImpl ? registeredPackage : LogmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theType_enumPackage.createPackageContents();
		theTechmodelPackage.createPackageContents();
		theETL_MODELPackage.createPackageContents();
		thePackage_enumsPackage.createPackageContents();
		theLogmodelPackage.createPackageContents();

		// Initialize created meta-data
		theType_enumPackage.initializePackageContents();
		theTechmodelPackage.initializePackageContents();
		theETL_MODELPackage.initializePackageContents();
		thePackage_enumsPackage.initializePackageContents();
		theLogmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theType_enumPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Type_enumPackage.eNS_URI, theType_enumPackage);
		return theType_enumPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFieldTypes() {
		return fieldTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJoinTypes() {
		return joinTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type_enumFactory getType_enumFactory() {
		return (Type_enumFactory)getEFactoryInstance();
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

		// Create enums
		fieldTypesEEnum = createEEnum(FIELD_TYPES);
		joinTypesEEnum = createEEnum(JOIN_TYPES);
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

		// Initialize enums and add enum literals
		initEEnum(fieldTypesEEnum, FieldTypes.class, "FieldTypes");
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.STRING);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.INT);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.DECIMAL);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.DATE);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.TIME_STAMP);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.HK);
		addEEnumLiteral(fieldTypesEEnum, FieldTypes.TRUE_FALSE);

		initEEnum(joinTypesEEnum, JoinTypes.class, "JoinTypes");
		addEEnumLiteral(joinTypesEEnum, JoinTypes.LEFT);
		addEEnumLiteral(joinTypesEEnum, JoinTypes.RIGHT);
		addEEnumLiteral(joinTypesEEnum, JoinTypes.INNER);
		addEEnumLiteral(joinTypesEEnum, JoinTypes.FULL_OUTER);

		// Create resource
		createResource(eNS_URI);
	}

} //Type_enumPackageImpl
