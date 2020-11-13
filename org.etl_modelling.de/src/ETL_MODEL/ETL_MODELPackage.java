/**
 */
package ETL_MODEL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ETL_MODEL.ETL_MODELFactory
 * @model kind="package"
 * @generated
 */
public interface ETL_MODELPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ETL_MODEL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ETL_MODEL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ETL_MODEL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ETL_MODELPackage eINSTANCE = ETL_MODEL.impl.ETL_MODELPackageImpl.init();

	/**
	 * The meta object id for the '{@link ETL_MODEL.namedelement <em>namedelement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL_MODEL.namedelement
	 * @see ETL_MODEL.impl.ETL_MODELPackageImpl#getnamedelement()
	 * @generated
	 */
	int NAMEDELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>namedelement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>namedelement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEDELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ETL_MODEL.Package <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL_MODEL.Package
	 * @see ETL_MODEL.impl.ETL_MODELPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>LAYER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAYER = NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LAYER TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LAYER_TYPE = NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HISTORISATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__HISTORISATION = NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>REPRESENTATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REPRESENTATION = NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ETL_MODEL.Annotation <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL_MODEL.Annotation
	 * @see ETL_MODEL.impl.ETL_MODELPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = NAMEDELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = NAMEDELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ETL_MODEL.namedelement <em>namedelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>namedelement</em>'.
	 * @see ETL_MODEL.namedelement
	 * @generated
	 */
	EClass getnamedelement();

	/**
	 * Returns the meta object for the attribute '{@link ETL_MODEL.namedelement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ETL_MODEL.namedelement#getName()
	 * @see #getnamedelement()
	 * @generated
	 */
	EAttribute getnamedelement_Name();

	/**
	 * Returns the meta object for class '{@link ETL_MODEL.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see ETL_MODEL.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link ETL_MODEL.Package#getLAYER <em>LAYER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LAYER</em>'.
	 * @see ETL_MODEL.Package#getLAYER()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LAYER();

	/**
	 * Returns the meta object for the attribute '{@link ETL_MODEL.Package#getLAYER_TYPE <em>LAYER TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LAYER TYPE</em>'.
	 * @see ETL_MODEL.Package#getLAYER_TYPE()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_LAYER_TYPE();

	/**
	 * Returns the meta object for the attribute '{@link ETL_MODEL.Package#getHISTORISATION <em>HISTORISATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HISTORISATION</em>'.
	 * @see ETL_MODEL.Package#getHISTORISATION()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_HISTORISATION();

	/**
	 * Returns the meta object for the attribute '{@link ETL_MODEL.Package#getREPRESENTATION <em>REPRESENTATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REPRESENTATION</em>'.
	 * @see ETL_MODEL.Package#getREPRESENTATION()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_REPRESENTATION();

	/**
	 * Returns the meta object for class '{@link ETL_MODEL.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ETL_MODEL.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ETL_MODELFactory getETL_MODELFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ETL_MODEL.namedelement <em>namedelement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL_MODEL.namedelement
		 * @see ETL_MODEL.impl.ETL_MODELPackageImpl#getnamedelement()
		 * @generated
		 */
		EClass NAMEDELEMENT = eINSTANCE.getnamedelement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEDELEMENT__NAME = eINSTANCE.getnamedelement_Name();

		/**
		 * The meta object literal for the '{@link ETL_MODEL.Package <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL_MODEL.Package
		 * @see ETL_MODEL.impl.ETL_MODELPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>LAYER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LAYER = eINSTANCE.getPackage_LAYER();

		/**
		 * The meta object literal for the '<em><b>LAYER TYPE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__LAYER_TYPE = eINSTANCE.getPackage_LAYER_TYPE();

		/**
		 * The meta object literal for the '<em><b>HISTORISATION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__HISTORISATION = eINSTANCE.getPackage_HISTORISATION();

		/**
		 * The meta object literal for the '<em><b>REPRESENTATION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__REPRESENTATION = eINSTANCE.getPackage_REPRESENTATION();

		/**
		 * The meta object literal for the '{@link ETL_MODEL.Annotation <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL_MODEL.Annotation
		 * @see ETL_MODEL.impl.ETL_MODELPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

	}

} //ETL_MODELPackage
