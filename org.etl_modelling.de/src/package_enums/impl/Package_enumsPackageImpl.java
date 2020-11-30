/**
 */
package package_enums.impl;

import ETL_MODEL.ETL_MODELPackage;

import ETL_MODEL.impl.ETL_MODELPackageImpl;
import logmodel.LogmodelPackage;
import logmodel.impl.LogmodelPackageImpl;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import package_enums.Package_enumsFactory;
import package_enums.Package_enumsPackage;
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
public class Package_enumsPackageImpl extends EPackageImpl implements Package_enumsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layertypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum historisationtypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum representationsEEnum = null;

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
	 * @see package_enums.Package_enumsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Package_enumsPackageImpl() {
		super(eNS_URI, Package_enumsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Package_enumsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Package_enumsPackage init() {
		if (isInited) return (Package_enumsPackage)EPackage.Registry.INSTANCE.getEPackage(Package_enumsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPackage_enumsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Package_enumsPackageImpl thePackage_enumsPackage = registeredPackage_enumsPackage instanceof Package_enumsPackageImpl ? (Package_enumsPackageImpl)registeredPackage_enumsPackage : new Package_enumsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TechmodelPackage.eNS_URI);
		TechmodelPackageImpl theTechmodelPackage = (TechmodelPackageImpl)(registeredPackage instanceof TechmodelPackageImpl ? registeredPackage : TechmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);
		ETL_MODELPackageImpl theETL_MODELPackage = (ETL_MODELPackageImpl)(registeredPackage instanceof ETL_MODELPackageImpl ? registeredPackage : ETL_MODELPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogmodelPackage.eNS_URI);
		LogmodelPackageImpl theLogmodelPackage = (LogmodelPackageImpl)(registeredPackage instanceof LogmodelPackageImpl ? registeredPackage : LogmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);
		Type_enumPackageImpl theType_enumPackage = (Type_enumPackageImpl)(registeredPackage instanceof Type_enumPackageImpl ? registeredPackage : Type_enumPackage.eINSTANCE);

		// Create package meta-data objects
		thePackage_enumsPackage.createPackageContents();
		theTechmodelPackage.createPackageContents();
		theETL_MODELPackage.createPackageContents();
		theLogmodelPackage.createPackageContents();
		theType_enumPackage.createPackageContents();

		// Initialize created meta-data
		thePackage_enumsPackage.initializePackageContents();
		theTechmodelPackage.initializePackageContents();
		theETL_MODELPackage.initializePackageContents();
		theLogmodelPackage.initializePackageContents();
		theType_enumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePackage_enumsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Package_enumsPackage.eNS_URI, thePackage_enumsPackage);
		return thePackage_enumsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLAYERTYPE() {
		return layertypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHISTORISATIONTYPE() {
		return historisationtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getREPRESENTATIONS() {
		return representationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_enumsFactory getPackage_enumsFactory() {
		return (Package_enumsFactory)getEFactoryInstance();
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
		layertypeEEnum = createEEnum(LAYERTYPE);
		historisationtypeEEnum = createEEnum(HISTORISATIONTYPE);
		representationsEEnum = createEEnum(REPRESENTATIONS);
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
		initEEnum(layertypeEEnum, package_enums.LAYERTYPE.class, "LAYERTYPE");
		addEEnumLiteral(layertypeEEnum, package_enums.LAYERTYPE.STAGE);
		addEEnumLiteral(layertypeEEnum, package_enums.LAYERTYPE.INTEGRATION);
		addEEnumLiteral(layertypeEEnum, package_enums.LAYERTYPE.EXPORT);
		addEEnumLiteral(layertypeEEnum, package_enums.LAYERTYPE.REPORTING);
		addEEnumLiteral(layertypeEEnum, package_enums.LAYERTYPE.HARMONISATION);

		initEEnum(historisationtypeEEnum, package_enums.HISTORISATIONTYPE.class, "HISTORISATIONTYPE");
		addEEnumLiteral(historisationtypeEEnum, package_enums.HISTORISATIONTYPE.NONE);
		addEEnumLiteral(historisationtypeEEnum, package_enums.HISTORISATIONTYPE.DAY_PARTITIONED);
		addEEnumLiteral(historisationtypeEEnum, package_enums.HISTORISATIONTYPE.MONTH_PARTITIONED);
		addEEnumLiteral(historisationtypeEEnum, package_enums.HISTORISATIONTYPE.BITEMPORAL);

		initEEnum(representationsEEnum, package_enums.REPRESENTATIONS.class, "REPRESENTATIONS");
		addEEnumLiteral(representationsEEnum, package_enums.REPRESENTATIONS.FLAT_TABLE);
		addEEnumLiteral(representationsEEnum, package_enums.REPRESENTATIONS.DATAVAULT);
		addEEnumLiteral(representationsEEnum, package_enums.REPRESENTATIONS.THIRD_NF);
		addEEnumLiteral(representationsEEnum, package_enums.REPRESENTATIONS.SNOWFLAKE);
		addEEnumLiteral(representationsEEnum, package_enums.REPRESENTATIONS.STAR);

		// Create resource
		createResource(eNS_URI);
	}

} //Package_enumsPackageImpl
