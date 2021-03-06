/**
 */
package jobnetz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jobnetz.JobnetzPackage
 * @generated
 */
public interface JobnetzFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobnetzFactory eINSTANCE = jobnetz.impl.JobnetzFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schedule Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Package</em>'.
	 * @generated
	 */
	SchedulePackage createSchedulePackage();

	/**
	 * Returns a new object of class '<em>Processing Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Point</em>'.
	 * @generated
	 */
	ProcessingPoint createProcessingPoint();

	/**
	 * Returns a new object of class '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job</em>'.
	 * @generated
	 */
	Job createJob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JobnetzPackage getJobnetzPackage();

} //JobnetzFactory
