/**
 */
package ETL_MODEL.impl;

import ETL_MODEL.Annotation;
import ETL_MODEL.ETL_MODELFactory;
import ETL_MODEL.ETL_MODELPackage;
import ETL_MODEL.namedelement;

import logmodel.LogmodelPackage;

import logmodel.impl.LogmodelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import package_enums.Package_enumsPackage;

import package_enums.impl.Package_enumsPackageImpl;
import specmodel.SpecmodelPackage;
import specmodel.impl.SpecmodelPackageImpl;
import type_enum.Type_enumPackage;
import type_enum.impl.Type_enumPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ETL_MODELPackageImpl extends EPackageImpl implements ETL_MODELPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedelementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

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
	 * @see ETL_MODEL.ETL_MODELPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ETL_MODELPackageImpl() {
		super(eNS_URI, ETL_MODELFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ETL_MODELPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ETL_MODELPackage init() {
		if (isInited) return (ETL_MODELPackage)EPackage.Registry.INSTANCE.getEPackage(ETL_MODELPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredETL_MODELPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ETL_MODELPackageImpl theETL_MODELPackage = registeredETL_MODELPackage instanceof ETL_MODELPackageImpl ? (ETL_MODELPackageImpl)registeredETL_MODELPackage : new ETL_MODELPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogmodelPackage.eNS_URI);
		LogmodelPackageImpl theLogmodelPackage = (LogmodelPackageImpl)(registeredPackage instanceof LogmodelPackageImpl ? registeredPackage : LogmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpecmodelPackage.eNS_URI);
		SpecmodelPackageImpl theSpecmodelPackage = (SpecmodelPackageImpl)(registeredPackage instanceof SpecmodelPackageImpl ? registeredPackage : SpecmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Package_enumsPackage.eNS_URI);
		Package_enumsPackageImpl thePackage_enumsPackage = (Package_enumsPackageImpl)(registeredPackage instanceof Package_enumsPackageImpl ? registeredPackage : Package_enumsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Type_enumPackage.eNS_URI);
		Type_enumPackageImpl theType_enumPackage = (Type_enumPackageImpl)(registeredPackage instanceof Type_enumPackageImpl ? registeredPackage : Type_enumPackage.eINSTANCE);

		// Create package meta-data objects
		theETL_MODELPackage.createPackageContents();
		theLogmodelPackage.createPackageContents();
		theSpecmodelPackage.createPackageContents();
		thePackage_enumsPackage.createPackageContents();
		theType_enumPackage.createPackageContents();

		// Initialize created meta-data
		theETL_MODELPackage.initializePackageContents();
		theLogmodelPackage.initializePackageContents();
		theSpecmodelPackage.initializePackageContents();
		thePackage_enumsPackage.initializePackageContents();
		theType_enumPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theETL_MODELPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ETL_MODELPackage.eNS_URI, theETL_MODELPackage);
		return theETL_MODELPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getnamedelement() {
		return namedelementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getnamedelement_Name() {
		return (EAttribute)namedelementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_LAYER() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_LAYER_TYPE() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_HISTORISATION() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_REPRESENTATION() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETL_MODELFactory getETL_MODELFactory() {
		return (ETL_MODELFactory)getEFactoryInstance();
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
		namedelementEClass = createEClass(NAMEDELEMENT);
		createEAttribute(namedelementEClass, NAMEDELEMENT__NAME);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__LAYER);
		createEAttribute(packageEClass, PACKAGE__LAYER_TYPE);
		createEAttribute(packageEClass, PACKAGE__HISTORISATION);
		createEAttribute(packageEClass, PACKAGE__REPRESENTATION);

		annotationEClass = createEClass(ANNOTATION);
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
		Package_enumsPackage thePackage_enumsPackage = (Package_enumsPackage)EPackage.Registry.INSTANCE.getEPackage(Package_enumsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageEClass.getESuperTypes().add(this.getnamedelement());
		annotationEClass.getESuperTypes().add(this.getnamedelement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedelementEClass, namedelement.class, "namedelement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnamedelement_Name(), ecorePackage.getEString(), "name", null, 0, 1, namedelement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, ETL_MODEL.Package.class, "Package", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_LAYER(), ecorePackage.getEString(), "LAYER", null, 0, 1, ETL_MODEL.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_LAYER_TYPE(), thePackage_enumsPackage.getLAYERTYPE(), "LAYER_TYPE", null, 0, 1, ETL_MODEL.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_HISTORISATION(), thePackage_enumsPackage.getHISTORISATIONTYPE(), "HISTORISATION", null, 0, 1, ETL_MODEL.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_REPRESENTATION(), thePackage_enumsPackage.getREPRESENTATIONS(), "REPRESENTATION", null, 0, 1, ETL_MODEL.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ETL_MODELPackageImpl
