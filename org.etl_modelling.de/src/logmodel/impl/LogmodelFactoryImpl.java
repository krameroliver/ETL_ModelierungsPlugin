/**
 */
package logmodel.impl;

import logmodel.*;

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
public class LogmodelFactoryImpl extends EFactoryImpl implements LogmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogmodelFactory init() {
		try {
			LogmodelFactory theLogmodelFactory = (LogmodelFactory)EPackage.Registry.INSTANCE.getEFactory(LogmodelPackage.eNS_URI);
			if (theLogmodelFactory != null) {
				return theLogmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmodelFactoryImpl() {
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
			case LogmodelPackage.LOGPACKAGE: return createlogpackage();
			case LogmodelPackage.ENTITY: return createEntity();
			case LogmodelPackage.FIELD: return createField();
			case LogmodelPackage.RELATIONSHIP: return createRelationship();
			case LogmodelPackage.BK_DOMAIN: return createBKDomain();
			case LogmodelPackage.INCLUDE: return createInclude();
			case LogmodelPackage.BUSINESS_TERM: return createBusinessTerm();
			case LogmodelPackage.COMMON_MAPPING: return createCommonMapping();
			case LogmodelPackage.ANOTATABLE: return createanotatable();
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
	public logpackage createlogpackage() {
		logpackageImpl logpackage = new logpackageImpl();
		return logpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BKDomain createBKDomain() {
		BKDomainImpl bkDomain = new BKDomainImpl();
		return bkDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessTerm createBusinessTerm() {
		BusinessTermImpl businessTerm = new BusinessTermImpl();
		return businessTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonMapping createCommonMapping() {
		CommonMappingImpl commonMapping = new CommonMappingImpl();
		return commonMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public anotatable createanotatable() {
		anotatableImpl anotatable = new anotatableImpl();
		return anotatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogmodelPackage getLogmodelPackage() {
		return (LogmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogmodelPackage getPackage() {
		return LogmodelPackage.eINSTANCE;
	}

} //LogmodelFactoryImpl
