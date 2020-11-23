/**
 */
package logmodel;

import ETL_MODEL.ETL_MODELPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see logmodel.LogmodelFactory
 * @model kind="package"
 * @generated
 */
public interface LogmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/logmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogmodelPackage eINSTANCE = logmodel.impl.LogmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link logmodel.impl.logpackageImpl <em>logpackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.logpackageImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getlogpackage()
	 * @generated
	 */
	int LOGPACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE__NAME = ETL_MODELPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>LAYER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE__LAYER = ETL_MODELPackage.PACKAGE__LAYER;

	/**
	 * The feature id for the '<em><b>LAYER TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE__LAYER_TYPE = ETL_MODELPackage.PACKAGE__LAYER_TYPE;

	/**
	 * The feature id for the '<em><b>HISTORISATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE__HISTORISATION = ETL_MODELPackage.PACKAGE__HISTORISATION;

	/**
	 * The feature id for the '<em><b>REPRESENTATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE__REPRESENTATION = ETL_MODELPackage.PACKAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE__ENTITY = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commonmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE__COMMONMAPPING = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>logpackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE_FEATURE_COUNT = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>logpackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGPACKAGE_OPERATION_COUNT = ETL_MODELPackage.PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.EntityImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Logpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LOGPACKAGE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_FIELD = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INCLUDE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIPS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FILENAME = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DELIMITER = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lineend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LINEEND = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.FieldImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INCLUDE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LENGTH = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PRECISION = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SCALE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Original name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ORIGINAL_NAME = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short describtion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SHORT_DESCRIBTION = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATE_FORMAT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Null Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NULL_INDICATOR = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Allow Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ALLOW_EXPONENT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Has Implicit Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__HAS_IMPLICIT_COMMA = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Interface Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INTERFACE_ONLY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Table Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TABLE_ONLY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Fast Changing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_FAST_CHANGING = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Business Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_BUSINESS_KEY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.RelationshipImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>From Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__FROM_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TO_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifiying Fields Rel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IDENTIFIYING_FIELDS_REL = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Describing Fields Rel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIBING_FIELDS_REL = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Describingfields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIBINGFIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Relationship Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_ALIAS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.BKDomainImpl <em>BK Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.BKDomainImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getBKDomain()
	 * @generated
	 */
	int BK_DOMAIN = 4;

	/**
	 * The number of structural features of the '<em>BK Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BK_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BK Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BK_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.IncludeImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Include Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__INCLUDE_FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifyingfields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__IDENTIFYINGFIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.BusinessTermImpl <em>Business Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.BusinessTermImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getBusinessTerm()
	 * @generated
	 */
	int BUSINESS_TERM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__STATE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Fdm ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__PRIMARY_FDM_ID = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__GROUP_ID = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__DESCRIPTION = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary FDM Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__PRIMARY_FDM_NAME = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__USED_BY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Functional Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__FUNCTIONAL_SPECIFICATION = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Regulatory Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__REGULATORY_REQUIREMENTS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__DATA_OWNER = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM__FIELD = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Business Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Business Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_TERM_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.CommonMappingImpl <em>Common Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.CommonMappingImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getCommonMapping()
	 * @generated
	 */
	int COMMON_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_MAPPING__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Commonmappinginputfields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commonmappingoutputfields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_MAPPING__LOGPACKAGE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Common Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_MAPPING_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Common Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_MAPPING_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logmodel.impl.anotatableImpl <em>anotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmodel.impl.anotatableImpl
	 * @see logmodel.impl.LogmodelPackageImpl#getanotatable()
	 * @generated
	 */
	int ANOTATABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATABLE__NAME = ETL_MODELPackage.ANNOTATION__NAME;

	/**
	 * The number of structural features of the '<em>anotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATABLE_FEATURE_COUNT = ETL_MODELPackage.ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>anotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATABLE_OPERATION_COUNT = ETL_MODELPackage.ANNOTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link logmodel.logpackage <em>logpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>logpackage</em>'.
	 * @see logmodel.logpackage
	 * @generated
	 */
	EClass getlogpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.logpackage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see logmodel.logpackage#getEntity()
	 * @see #getlogpackage()
	 * @generated
	 */
	EReference getlogpackage_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.logpackage#getCommonmapping <em>Commonmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commonmapping</em>'.
	 * @see logmodel.logpackage#getCommonmapping()
	 * @see #getlogpackage()
	 * @generated
	 */
	EReference getlogpackage_Commonmapping();

	/**
	 * Returns the meta object for class '{@link logmodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see logmodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the container reference '{@link logmodel.Entity#getLogpackage <em>Logpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logpackage</em>'.
	 * @see logmodel.Entity#getLogpackage()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Logpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.Entity#getEntityField <em>Entity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Field</em>'.
	 * @see logmodel.Entity#getEntityField()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityField();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.Entity#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see logmodel.Entity#getInclude()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see logmodel.Entity#getRelationships()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relationships();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Entity#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see logmodel.Entity#getFilename()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Filename();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Entity#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see logmodel.Entity#getDelimiter()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Delimiter();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Entity#getLineend <em>Lineend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lineend</em>'.
	 * @see logmodel.Entity#getLineend()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Lineend();

	/**
	 * Returns the meta object for class '{@link logmodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see logmodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the container reference '{@link logmodel.Field#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see logmodel.Field#getEntity()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Entity();

	/**
	 * Returns the meta object for the container reference '{@link logmodel.Field#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Include</em>'.
	 * @see logmodel.Field#getInclude()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Include();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see logmodel.Field#getLength()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Length();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see logmodel.Field#getPrecision()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Precision();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see logmodel.Field#getScale()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Scale();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getOriginal_name <em>Original name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original name</em>'.
	 * @see logmodel.Field#getOriginal_name()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Original_name();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getShort_describtion <em>Short describtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short describtion</em>'.
	 * @see logmodel.Field#getShort_describtion()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Short_describtion();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see logmodel.Field#getDateFormat()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_DateFormat();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getNullIndicator <em>Null Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Indicator</em>'.
	 * @see logmodel.Field#getNullIndicator()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_NullIndicator();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#isAllowExponent <em>Allow Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Exponent</em>'.
	 * @see logmodel.Field#isAllowExponent()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_AllowExponent();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#isHasImplicitComma <em>Has Implicit Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Implicit Comma</em>'.
	 * @see logmodel.Field#isHasImplicitComma()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_HasImplicitComma();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#isInterfaceOnly <em>Interface Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Only</em>'.
	 * @see logmodel.Field#isInterfaceOnly()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_InterfaceOnly();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#isTableOnly <em>Table Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Only</em>'.
	 * @see logmodel.Field#isTableOnly()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_TableOnly();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#isIsFastChanging <em>Is Fast Changing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fast Changing</em>'.
	 * @see logmodel.Field#isIsFastChanging()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsFastChanging();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see logmodel.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Field#isIsBusinessKey <em>Is Business Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Business Key</em>'.
	 * @see logmodel.Field#isIsBusinessKey()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsBusinessKey();

	/**
	 * Returns the meta object for class '{@link logmodel.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see logmodel.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link logmodel.Relationship#getFromEntity <em>From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Entity</em>'.
	 * @see logmodel.Relationship#getFromEntity()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_FromEntity();

	/**
	 * Returns the meta object for the reference '{@link logmodel.Relationship#getToEntity <em>To Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Entity</em>'.
	 * @see logmodel.Relationship#getToEntity()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ToEntity();

	/**
	 * Returns the meta object for the reference list '{@link logmodel.Relationship#getIdentifiyingFieldsRel <em>Identifiying Fields Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiying Fields Rel</em>'.
	 * @see logmodel.Relationship#getIdentifiyingFieldsRel()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_IdentifiyingFieldsRel();

	/**
	 * Returns the meta object for the reference list '{@link logmodel.Relationship#getDescribingFieldsRel <em>Describing Fields Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Describing Fields Rel</em>'.
	 * @see logmodel.Relationship#getDescribingFieldsRel()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_DescribingFieldsRel();

	/**
	 * Returns the meta object for the reference list '{@link logmodel.Relationship#getDescribingfields <em>Describingfields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Describingfields</em>'.
	 * @see logmodel.Relationship#getDescribingfields()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Describingfields();

	/**
	 * Returns the meta object for the container reference '{@link logmodel.Relationship#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see logmodel.Relationship#getEntity()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Entity();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.Relationship#getRelationshipAlias <em>Relationship Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Alias</em>'.
	 * @see logmodel.Relationship#getRelationshipAlias()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_RelationshipAlias();

	/**
	 * Returns the meta object for class '{@link logmodel.BKDomain <em>BK Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BK Domain</em>'.
	 * @see logmodel.BKDomain
	 * @generated
	 */
	EClass getBKDomain();

	/**
	 * Returns the meta object for class '{@link logmodel.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see logmodel.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.Include#getIncludeFields <em>Include Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Fields</em>'.
	 * @see logmodel.Include#getIncludeFields()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_IncludeFields();

	/**
	 * Returns the meta object for the reference list '{@link logmodel.Include#getIdentifyingfields <em>Identifyingfields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifyingfields</em>'.
	 * @see logmodel.Include#getIdentifyingfields()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_Identifyingfields();

	/**
	 * Returns the meta object for the container reference '{@link logmodel.Include#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see logmodel.Include#getEntity()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_Entity();

	/**
	 * Returns the meta object for class '{@link logmodel.BusinessTerm <em>Business Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Term</em>'.
	 * @see logmodel.BusinessTerm
	 * @generated
	 */
	EClass getBusinessTerm();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see logmodel.BusinessTerm#getState()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_State();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getPrimaryFdmID <em>Primary Fdm ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Fdm ID</em>'.
	 * @see logmodel.BusinessTerm#getPrimaryFdmID()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_PrimaryFdmID();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getGroupID <em>Group ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group ID</em>'.
	 * @see logmodel.BusinessTerm#getGroupID()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_GroupID();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see logmodel.BusinessTerm#getDescription()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_Description();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getPrimaryFDMName <em>Primary FDM Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary FDM Name</em>'.
	 * @see logmodel.BusinessTerm#getPrimaryFDMName()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_PrimaryFDMName();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used By</em>'.
	 * @see logmodel.BusinessTerm#getUsedBy()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_UsedBy();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getFunctionalSpecification <em>Functional Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Specification</em>'.
	 * @see logmodel.BusinessTerm#getFunctionalSpecification()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_FunctionalSpecification();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getRegulatoryRequirements <em>Regulatory Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulatory Requirements</em>'.
	 * @see logmodel.BusinessTerm#getRegulatoryRequirements()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_RegulatoryRequirements();

	/**
	 * Returns the meta object for the attribute '{@link logmodel.BusinessTerm#getDataOwner <em>Data Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Owner</em>'.
	 * @see logmodel.BusinessTerm#getDataOwner()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EAttribute getBusinessTerm_DataOwner();

	/**
	 * Returns the meta object for the reference '{@link logmodel.BusinessTerm#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see logmodel.BusinessTerm#getField()
	 * @see #getBusinessTerm()
	 * @generated
	 */
	EReference getBusinessTerm_Field();

	/**
	 * Returns the meta object for class '{@link logmodel.CommonMapping <em>Common Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Mapping</em>'.
	 * @see logmodel.CommonMapping
	 * @generated
	 */
	EClass getCommonMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.CommonMapping#getCommonmappinginputfields <em>Commonmappinginputfields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commonmappinginputfields</em>'.
	 * @see logmodel.CommonMapping#getCommonmappinginputfields()
	 * @see #getCommonMapping()
	 * @generated
	 */
	EReference getCommonMapping_Commonmappinginputfields();

	/**
	 * Returns the meta object for the containment reference list '{@link logmodel.CommonMapping#getCommonmappingoutputfields <em>Commonmappingoutputfields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commonmappingoutputfields</em>'.
	 * @see logmodel.CommonMapping#getCommonmappingoutputfields()
	 * @see #getCommonMapping()
	 * @generated
	 */
	EReference getCommonMapping_Commonmappingoutputfields();

	/**
	 * Returns the meta object for the container reference '{@link logmodel.CommonMapping#getLogpackage <em>Logpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logpackage</em>'.
	 * @see logmodel.CommonMapping#getLogpackage()
	 * @see #getCommonMapping()
	 * @generated
	 */
	EReference getCommonMapping_Logpackage();

	/**
	 * Returns the meta object for class '{@link logmodel.anotatable <em>anotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>anotatable</em>'.
	 * @see logmodel.anotatable
	 * @generated
	 */
	EClass getanotatable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogmodelFactory getLogmodelFactory();

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
		 * The meta object literal for the '{@link logmodel.impl.logpackageImpl <em>logpackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.logpackageImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getlogpackage()
		 * @generated
		 */
		EClass LOGPACKAGE = eINSTANCE.getlogpackage();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGPACKAGE__ENTITY = eINSTANCE.getlogpackage_Entity();

		/**
		 * The meta object literal for the '<em><b>Commonmapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGPACKAGE__COMMONMAPPING = eINSTANCE.getlogpackage_Commonmapping();

		/**
		 * The meta object literal for the '{@link logmodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.EntityImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Logpackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__LOGPACKAGE = eINSTANCE.getEntity_Logpackage();

		/**
		 * The meta object literal for the '<em><b>Entity Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY_FIELD = eINSTANCE.getEntity_EntityField();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INCLUDE = eINSTANCE.getEntity_Include();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONSHIPS = eINSTANCE.getEntity_Relationships();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__FILENAME = eINSTANCE.getEntity_Filename();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DELIMITER = eINSTANCE.getEntity_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Lineend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__LINEEND = eINSTANCE.getEntity_Lineend();

		/**
		 * The meta object literal for the '{@link logmodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.FieldImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__ENTITY = eINSTANCE.getField_Entity();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__INCLUDE = eINSTANCE.getField_Include();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__LENGTH = eINSTANCE.getField_Length();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__PRECISION = eINSTANCE.getField_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SCALE = eINSTANCE.getField_Scale();

		/**
		 * The meta object literal for the '<em><b>Original name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__ORIGINAL_NAME = eINSTANCE.getField_Original_name();

		/**
		 * The meta object literal for the '<em><b>Short describtion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__SHORT_DESCRIBTION = eINSTANCE.getField_Short_describtion();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DATE_FORMAT = eINSTANCE.getField_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Null Indicator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NULL_INDICATOR = eINSTANCE.getField_NullIndicator();

		/**
		 * The meta object literal for the '<em><b>Allow Exponent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__ALLOW_EXPONENT = eINSTANCE.getField_AllowExponent();

		/**
		 * The meta object literal for the '<em><b>Has Implicit Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__HAS_IMPLICIT_COMMA = eINSTANCE.getField_HasImplicitComma();

		/**
		 * The meta object literal for the '<em><b>Interface Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__INTERFACE_ONLY = eINSTANCE.getField_InterfaceOnly();

		/**
		 * The meta object literal for the '<em><b>Table Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TABLE_ONLY = eINSTANCE.getField_TableOnly();

		/**
		 * The meta object literal for the '<em><b>Is Fast Changing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_FAST_CHANGING = eINSTANCE.getField_IsFastChanging();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Is Business Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_BUSINESS_KEY = eINSTANCE.getField_IsBusinessKey();

		/**
		 * The meta object literal for the '{@link logmodel.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.RelationshipImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>From Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__FROM_ENTITY = eINSTANCE.getRelationship_FromEntity();

		/**
		 * The meta object literal for the '<em><b>To Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TO_ENTITY = eINSTANCE.getRelationship_ToEntity();

		/**
		 * The meta object literal for the '<em><b>Identifiying Fields Rel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__IDENTIFIYING_FIELDS_REL = eINSTANCE.getRelationship_IdentifiyingFieldsRel();

		/**
		 * The meta object literal for the '<em><b>Describing Fields Rel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__DESCRIBING_FIELDS_REL = eINSTANCE.getRelationship_DescribingFieldsRel();

		/**
		 * The meta object literal for the '<em><b>Describingfields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__DESCRIBINGFIELDS = eINSTANCE.getRelationship_Describingfields();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__ENTITY = eINSTANCE.getRelationship_Entity();

		/**
		 * The meta object literal for the '<em><b>Relationship Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__RELATIONSHIP_ALIAS = eINSTANCE.getRelationship_RelationshipAlias();

		/**
		 * The meta object literal for the '{@link logmodel.impl.BKDomainImpl <em>BK Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.BKDomainImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getBKDomain()
		 * @generated
		 */
		EClass BK_DOMAIN = eINSTANCE.getBKDomain();

		/**
		 * The meta object literal for the '{@link logmodel.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.IncludeImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Include Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__INCLUDE_FIELDS = eINSTANCE.getInclude_IncludeFields();

		/**
		 * The meta object literal for the '<em><b>Identifyingfields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__IDENTIFYINGFIELDS = eINSTANCE.getInclude_Identifyingfields();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__ENTITY = eINSTANCE.getInclude_Entity();

		/**
		 * The meta object literal for the '{@link logmodel.impl.BusinessTermImpl <em>Business Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.BusinessTermImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getBusinessTerm()
		 * @generated
		 */
		EClass BUSINESS_TERM = eINSTANCE.getBusinessTerm();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__STATE = eINSTANCE.getBusinessTerm_State();

		/**
		 * The meta object literal for the '<em><b>Primary Fdm ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__PRIMARY_FDM_ID = eINSTANCE.getBusinessTerm_PrimaryFdmID();

		/**
		 * The meta object literal for the '<em><b>Group ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__GROUP_ID = eINSTANCE.getBusinessTerm_GroupID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__DESCRIPTION = eINSTANCE.getBusinessTerm_Description();

		/**
		 * The meta object literal for the '<em><b>Primary FDM Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__PRIMARY_FDM_NAME = eINSTANCE.getBusinessTerm_PrimaryFDMName();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__USED_BY = eINSTANCE.getBusinessTerm_UsedBy();

		/**
		 * The meta object literal for the '<em><b>Functional Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__FUNCTIONAL_SPECIFICATION = eINSTANCE.getBusinessTerm_FunctionalSpecification();

		/**
		 * The meta object literal for the '<em><b>Regulatory Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__REGULATORY_REQUIREMENTS = eINSTANCE.getBusinessTerm_RegulatoryRequirements();

		/**
		 * The meta object literal for the '<em><b>Data Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_TERM__DATA_OWNER = eINSTANCE.getBusinessTerm_DataOwner();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_TERM__FIELD = eINSTANCE.getBusinessTerm_Field();

		/**
		 * The meta object literal for the '{@link logmodel.impl.CommonMappingImpl <em>Common Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.CommonMappingImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getCommonMapping()
		 * @generated
		 */
		EClass COMMON_MAPPING = eINSTANCE.getCommonMapping();

		/**
		 * The meta object literal for the '<em><b>Commonmappinginputfields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_MAPPING__COMMONMAPPINGINPUTFIELDS = eINSTANCE.getCommonMapping_Commonmappinginputfields();

		/**
		 * The meta object literal for the '<em><b>Commonmappingoutputfields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_MAPPING__COMMONMAPPINGOUTPUTFIELDS = eINSTANCE.getCommonMapping_Commonmappingoutputfields();

		/**
		 * The meta object literal for the '<em><b>Logpackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_MAPPING__LOGPACKAGE = eINSTANCE.getCommonMapping_Logpackage();

		/**
		 * The meta object literal for the '{@link logmodel.impl.anotatableImpl <em>anotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmodel.impl.anotatableImpl
		 * @see logmodel.impl.LogmodelPackageImpl#getanotatable()
		 * @generated
		 */
		EClass ANOTATABLE = eINSTANCE.getanotatable();

	}

} //LogmodelPackage
