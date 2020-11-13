/**
 */
package package_enums;

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
 * @see package_enums.Package_enumsFactory
 * @model kind="package"
 * @generated
 */
public interface Package_enumsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "package_enums";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/package_enums";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "package_enums";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package_enumsPackage eINSTANCE = package_enums.impl.Package_enumsPackageImpl.init();

	/**
	 * The meta object id for the '{@link package_enums.LAYERTYPE <em>LAYERTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see package_enums.LAYERTYPE
	 * @see package_enums.impl.Package_enumsPackageImpl#getLAYERTYPE()
	 * @generated
	 */
	int LAYERTYPE = 0;

	/**
	 * The meta object id for the '{@link package_enums.HISTORISATIONTYPE <em>HISTORISATIONTYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see package_enums.HISTORISATIONTYPE
	 * @see package_enums.impl.Package_enumsPackageImpl#getHISTORISATIONTYPE()
	 * @generated
	 */
	int HISTORISATIONTYPE = 1;

	/**
	 * The meta object id for the '{@link package_enums.REPRESENTATIONS <em>REPRESENTATIONS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see package_enums.REPRESENTATIONS
	 * @see package_enums.impl.Package_enumsPackageImpl#getREPRESENTATIONS()
	 * @generated
	 */
	int REPRESENTATIONS = 2;


	/**
	 * Returns the meta object for enum '{@link package_enums.LAYERTYPE <em>LAYERTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LAYERTYPE</em>'.
	 * @see package_enums.LAYERTYPE
	 * @generated
	 */
	EEnum getLAYERTYPE();

	/**
	 * Returns the meta object for enum '{@link package_enums.HISTORISATIONTYPE <em>HISTORISATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HISTORISATIONTYPE</em>'.
	 * @see package_enums.HISTORISATIONTYPE
	 * @generated
	 */
	EEnum getHISTORISATIONTYPE();

	/**
	 * Returns the meta object for enum '{@link package_enums.REPRESENTATIONS <em>REPRESENTATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>REPRESENTATIONS</em>'.
	 * @see package_enums.REPRESENTATIONS
	 * @generated
	 */
	EEnum getREPRESENTATIONS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Package_enumsFactory getPackage_enumsFactory();

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
		 * The meta object literal for the '{@link package_enums.LAYERTYPE <em>LAYERTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see package_enums.LAYERTYPE
		 * @see package_enums.impl.Package_enumsPackageImpl#getLAYERTYPE()
		 * @generated
		 */
		EEnum LAYERTYPE = eINSTANCE.getLAYERTYPE();

		/**
		 * The meta object literal for the '{@link package_enums.HISTORISATIONTYPE <em>HISTORISATIONTYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see package_enums.HISTORISATIONTYPE
		 * @see package_enums.impl.Package_enumsPackageImpl#getHISTORISATIONTYPE()
		 * @generated
		 */
		EEnum HISTORISATIONTYPE = eINSTANCE.getHISTORISATIONTYPE();

		/**
		 * The meta object literal for the '{@link package_enums.REPRESENTATIONS <em>REPRESENTATIONS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see package_enums.REPRESENTATIONS
		 * @see package_enums.impl.Package_enumsPackageImpl#getREPRESENTATIONS()
		 * @generated
		 */
		EEnum REPRESENTATIONS = eINSTANCE.getREPRESENTATIONS();

	}

} //Package_enumsPackage
