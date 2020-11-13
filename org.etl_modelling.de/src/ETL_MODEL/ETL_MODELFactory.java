/**
 */
package ETL_MODEL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ETL_MODEL.ETL_MODELPackage
 * @generated
 */
public interface ETL_MODELFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ETL_MODELFactory eINSTANCE = ETL_MODEL.impl.ETL_MODELFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ETL_MODELPackage getETL_MODELPackage();

} //ETL_MODELFactory
