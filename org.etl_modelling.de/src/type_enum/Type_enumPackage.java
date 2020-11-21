/**
 */
package type_enum;

import org.eclipse.emf.ecore.EEnum;
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
 * @see type_enum.Type_enumFactory
 * @model kind="package"
 * @generated
 */
public interface Type_enumPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type_enum";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/type_enum";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "type_enum";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Type_enumPackage eINSTANCE = type_enum.impl.Type_enumPackageImpl.init();

	/**
	 * The meta object id for the '{@link type_enum.FieldTypes <em>Field Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type_enum.FieldTypes
	 * @see type_enum.impl.Type_enumPackageImpl#getFieldTypes()
	 * @generated
	 */
	int FIELD_TYPES = 0;


	/**
	 * The meta object id for the '{@link type_enum.JoinTypes <em>Join Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see type_enum.JoinTypes
	 * @see type_enum.impl.Type_enumPackageImpl#getJoinTypes()
	 * @generated
	 */
	int JOIN_TYPES = 1;


	/**
	 * Returns the meta object for enum '{@link type_enum.FieldTypes <em>Field Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Types</em>'.
	 * @see type_enum.FieldTypes
	 * @generated
	 */
	EEnum getFieldTypes();

	/**
	 * Returns the meta object for enum '{@link type_enum.JoinTypes <em>Join Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Types</em>'.
	 * @see type_enum.JoinTypes
	 * @generated
	 */
	EEnum getJoinTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Type_enumFactory getType_enumFactory();

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
		 * The meta object literal for the '{@link type_enum.FieldTypes <em>Field Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type_enum.FieldTypes
		 * @see type_enum.impl.Type_enumPackageImpl#getFieldTypes()
		 * @generated
		 */
		EEnum FIELD_TYPES = eINSTANCE.getFieldTypes();
		/**
		 * The meta object literal for the '{@link type_enum.JoinTypes <em>Join Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see type_enum.JoinTypes
		 * @see type_enum.impl.Type_enumPackageImpl#getJoinTypes()
		 * @generated
		 */
		EEnum JOIN_TYPES = eINSTANCE.getJoinTypes();

	}

} //Type_enumPackage
