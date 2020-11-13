/**
 */
package ETL_MODEL.impl;

import ETL_MODEL.ETL_MODELFactory;
import ETL_MODEL.ETL_MODELPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ETL_MODELFactoryImpl extends EFactoryImpl implements ETL_MODELFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETL_MODELFactory init() {
		try {
			ETL_MODELFactory theETL_MODELFactory = (ETL_MODELFactory)EPackage.Registry.INSTANCE.getEFactory(ETL_MODELPackage.eNS_URI);
			if (theETL_MODELFactory != null) {
				return theETL_MODELFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ETL_MODELFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETL_MODELFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETL_MODELPackage getETL_MODELPackage() {
		return (ETL_MODELPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ETL_MODELPackage getPackage() {
		return ETL_MODELPackage.eINSTANCE;
	}

} //ETL_MODELFactoryImpl
