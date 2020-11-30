/**
 */
package techmodel;

import ETL_MODEL.ETL_MODELPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see techmodel.TechmodelFactory
 * @model kind="package"
 * @generated
 */
public interface TechmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "techmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/techmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "techmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechmodelPackage eINSTANCE = techmodel.impl.TechmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link techmodel.impl.TechPackageImpl <em>Tech Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see techmodel.impl.TechPackageImpl
	 * @see techmodel.impl.TechmodelPackageImpl#getTechPackage()
	 * @generated
	 */
	int TECH_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE__NAME = ETL_MODELPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>LAYER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE__LAYER = ETL_MODELPackage.PACKAGE__LAYER;

	/**
	 * The feature id for the '<em><b>LAYER TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE__LAYER_TYPE = ETL_MODELPackage.PACKAGE__LAYER_TYPE;

	/**
	 * The feature id for the '<em><b>HISTORISATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE__HISTORISATION = ETL_MODELPackage.PACKAGE__HISTORISATION;

	/**
	 * The feature id for the '<em><b>REPRESENTATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE__REPRESENTATION = ETL_MODELPackage.PACKAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Entitys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE__ENTITYS = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE__TABLES = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tech Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE_FEATURE_COUNT = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tech Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_PACKAGE_OPERATION_COUNT = ETL_MODELPackage.PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link techmodel.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see techmodel.impl.TableImpl
	 * @see techmodel.impl.TechmodelPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Table Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_TYPE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Techpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TECHPACKAGE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link techmodel.TableType <em>Table Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see techmodel.TableType
	 * @see techmodel.impl.TechmodelPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link techmodel.TechPackage <em>Tech Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Package</em>'.
	 * @see techmodel.TechPackage
	 * @generated
	 */
	EClass getTechPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link techmodel.TechPackage#getEntitys <em>Entitys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entitys</em>'.
	 * @see techmodel.TechPackage#getEntitys()
	 * @see #getTechPackage()
	 * @generated
	 */
	EReference getTechPackage_Entitys();

	/**
	 * Returns the meta object for the containment reference list '{@link techmodel.TechPackage#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see techmodel.TechPackage#getTables()
	 * @see #getTechPackage()
	 * @generated
	 */
	EReference getTechPackage_Tables();

	/**
	 * Returns the meta object for class '{@link techmodel.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see techmodel.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link techmodel.Table#getTableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Type</em>'.
	 * @see techmodel.Table#getTableType()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableType();

	/**
	 * Returns the meta object for the reference list '{@link techmodel.Table#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see techmodel.Table#getFields()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Fields();

	/**
	 * Returns the meta object for the container reference '{@link techmodel.Table#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see techmodel.Table#getEntity()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Entity();

	/**
	 * Returns the meta object for the container reference '{@link techmodel.Table#getTechpackage <em>Techpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Techpackage</em>'.
	 * @see techmodel.Table#getTechpackage()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Techpackage();

	/**
	 * Returns the meta object for enum '{@link techmodel.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Type</em>'.
	 * @see techmodel.TableType
	 * @generated
	 */
	EEnum getTableType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TechmodelFactory getTechmodelFactory();

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
		 * The meta object literal for the '{@link techmodel.impl.TechPackageImpl <em>Tech Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see techmodel.impl.TechPackageImpl
		 * @see techmodel.impl.TechmodelPackageImpl#getTechPackage()
		 * @generated
		 */
		EClass TECH_PACKAGE = eINSTANCE.getTechPackage();

		/**
		 * The meta object literal for the '<em><b>Entitys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_PACKAGE__ENTITYS = eINSTANCE.getTechPackage_Entitys();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_PACKAGE__TABLES = eINSTANCE.getTechPackage_Tables();

		/**
		 * The meta object literal for the '{@link techmodel.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see techmodel.impl.TableImpl
		 * @see techmodel.impl.TechmodelPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_TYPE = eINSTANCE.getTable_TableType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FIELDS = eINSTANCE.getTable_Fields();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ENTITY = eINSTANCE.getTable_Entity();

		/**
		 * The meta object literal for the '<em><b>Techpackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TECHPACKAGE = eINSTANCE.getTable_Techpackage();

		/**
		 * The meta object literal for the '{@link techmodel.TableType <em>Table Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see techmodel.TableType
		 * @see techmodel.impl.TechmodelPackageImpl#getTableType()
		 * @generated
		 */
		EEnum TABLE_TYPE = eINSTANCE.getTableType();

	}

} //TechmodelPackage
