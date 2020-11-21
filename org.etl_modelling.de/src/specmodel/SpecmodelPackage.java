/**
 */
package specmodel;

import ETL_MODEL.ETL_MODELPackage;

import logmodel.LogmodelPackage;

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
 * @see specmodel.SpecmodelFactory
 * @model kind="package"
 * @generated
 */
public interface SpecmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/specmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecmodelPackage eINSTANCE = specmodel.impl.SpecmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link specmodel.impl.SpecPackageImpl <em>Spec Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.SpecPackageImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getSpecPackage()
	 * @generated
	 */
	int SPEC_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE__NAME = ETL_MODELPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>LAYER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE__LAYER = ETL_MODELPackage.PACKAGE__LAYER;

	/**
	 * The feature id for the '<em><b>LAYER TYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE__LAYER_TYPE = ETL_MODELPackage.PACKAGE__LAYER_TYPE;

	/**
	 * The feature id for the '<em><b>HISTORISATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE__HISTORISATION = ETL_MODELPackage.PACKAGE__HISTORISATION;

	/**
	 * The feature id for the '<em><b>REPRESENTATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE__REPRESENTATION = ETL_MODELPackage.PACKAGE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE__SPECIFICATIONS = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spec Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE_FEATURE_COUNT = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spec Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE_OPERATION_COUNT = ETL_MODELPackage.PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.SpecificationImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPECPACKAGE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Businessrules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__BUSINESSRULES = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PRIMARY_SOURCES = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.JoinFieldImpl <em>Join Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.JoinFieldImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getJoinField()
	 * @generated
	 */
	int JOIN_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__NAME = LogmodelPackage.FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__ENTITY = LogmodelPackage.FIELD__ENTITY;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__INCLUDE = LogmodelPackage.FIELD__INCLUDE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__LENGTH = LogmodelPackage.FIELD__LENGTH;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__PRECISION = LogmodelPackage.FIELD__PRECISION;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__SCALE = LogmodelPackage.FIELD__SCALE;

	/**
	 * The feature id for the '<em><b>Original name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__ORIGINAL_NAME = LogmodelPackage.FIELD__ORIGINAL_NAME;

	/**
	 * The feature id for the '<em><b>Short describtion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__SHORT_DESCRIBTION = LogmodelPackage.FIELD__SHORT_DESCRIBTION;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__DATE_FORMAT = LogmodelPackage.FIELD__DATE_FORMAT;

	/**
	 * The feature id for the '<em><b>Null Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__NULL_INDICATOR = LogmodelPackage.FIELD__NULL_INDICATOR;

	/**
	 * The feature id for the '<em><b>Allow Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__ALLOW_EXPONENT = LogmodelPackage.FIELD__ALLOW_EXPONENT;

	/**
	 * The feature id for the '<em><b>Has Implicit Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__HAS_IMPLICIT_COMMA = LogmodelPackage.FIELD__HAS_IMPLICIT_COMMA;

	/**
	 * The feature id for the '<em><b>Interface Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__INTERFACE_ONLY = LogmodelPackage.FIELD__INTERFACE_ONLY;

	/**
	 * The feature id for the '<em><b>Table Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__TABLE_ONLY = LogmodelPackage.FIELD__TABLE_ONLY;

	/**
	 * The feature id for the '<em><b>Is Fast Changing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__IS_FAST_CHANGING = LogmodelPackage.FIELD__IS_FAST_CHANGING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__TYPE = LogmodelPackage.FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Parent Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__PARENT_SOURCE = LogmodelPackage.FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__CHILD_SOURCE = LogmodelPackage.FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__FIELD = LogmodelPackage.FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Join Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD_FEATURE_COUNT = LogmodelPackage.FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Join Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD_OPERATION_COUNT = LogmodelPackage.FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.DedupImpl <em>Dedup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.DedupImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getDedup()
	 * @generated
	 */
	int DEDUP = 3;

	/**
	 * The feature id for the '<em><b>Pre Dedup Business Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUP__PRE_DEDUP_BUSINESS_RULE = 0;

	/**
	 * The feature id for the '<em><b>Post Dedup Business Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUP__POST_DEDUP_BUSINESS_RULE = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUP__FIELD = 2;

	/**
	 * The number of structural features of the '<em>Dedup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dedup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.FilterImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 4;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Pre Filter Business Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__PRE_FILTER_BUSINESS_RULE = 1;

	/**
	 * The feature id for the '<em><b>Post Filter Business Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__POST_FILTER_BUSINESS_RULE = 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.SubSpecificationImpl <em>Sub Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.SubSpecificationImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getSubSpecification()
	 * @generated
	 */
	int SUB_SPECIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPECIFICATION__NAME = SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Specpackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPECIFICATION__SPECPACKAGE = SPECIFICATION__SPECPACKAGE;

	/**
	 * The feature id for the '<em><b>Businessrules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPECIFICATION__BUSINESSRULES = SPECIFICATION__BUSINESSRULES;

	/**
	 * The feature id for the '<em><b>Primary Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPECIFICATION__PRIMARY_SOURCES = SPECIFICATION__PRIMARY_SOURCES;

	/**
	 * The number of structural features of the '<em>Sub Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPECIFICATION_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPECIFICATION_OPERATION_COUNT = SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.BusinessRuleImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getBusinessRule()
	 * @generated
	 */
	int BUSINESS_RULE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__SPECIFICATION = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Dedup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__PRE_DEDUP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post Dedup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__POST_DEDUP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vectorkeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__VECTORKEYS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pre Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__PRE_FILTER = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Post Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__POST_FILTER = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rule Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RULE_TYPE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relationship Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Relationship Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Target Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_PARENT_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lookup Entities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__LOOKUP_ENTITIES = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Mapping Output Fields</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_RELATIONSHIP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Target Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_INCLUDE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__SOURCES = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.SourceImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_SPECIFICATION = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PARENT_SOURCE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CHILD_SOURCES = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SPECIFICATION = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Join Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PARENT_JOIN_FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Child Join Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CHILD_JOIN_FIELD = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__FILTERS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vectorkeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__VECTORKEYS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IS_VECTOR = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Multiplying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IS_MULTIPLYING = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__COMMENT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ALIAS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IS_MANDATORY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Join Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__JOIN_COMMENT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Relationship Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__RELATIONSHIP_ALIAS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Source Releationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_RELEATIONSHIP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Join Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__JOIN_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Businessrule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__BUSINESSRULE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Join Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__JOIN_TYPE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.VectorKeyImpl <em>Vector Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.VectorKeyImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getVectorKey()
	 * @generated
	 */
	int VECTOR_KEY = 8;

	/**
	 * The feature id for the '<em><b>Businessrule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY__BUSINESSRULE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Vk Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY__VK_FIELD = 2;

	/**
	 * The number of structural features of the '<em>Vector Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vector Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link specmodel.RuleType <em>Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.RuleType
	 * @see specmodel.impl.SpecmodelPackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link specmodel.SpecPackage <em>Spec Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Package</em>'.
	 * @see specmodel.SpecPackage
	 * @generated
	 */
	EClass getSpecPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.SpecPackage#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see specmodel.SpecPackage#getSpecifications()
	 * @see #getSpecPackage()
	 * @generated
	 */
	EReference getSpecPackage_Specifications();

	/**
	 * Returns the meta object for class '{@link specmodel.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see specmodel.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Specification#getSpecpackage <em>Specpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specpackage</em>'.
	 * @see specmodel.Specification#getSpecpackage()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Specpackage();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Specification#getBusinessrules <em>Businessrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businessrules</em>'.
	 * @see specmodel.Specification#getBusinessrules()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Businessrules();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Specification#getPrimarySources <em>Primary Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Sources</em>'.
	 * @see specmodel.Specification#getPrimarySources()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_PrimarySources();

	/**
	 * Returns the meta object for class '{@link specmodel.JoinField <em>Join Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Field</em>'.
	 * @see specmodel.JoinField
	 * @generated
	 */
	EClass getJoinField();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.JoinField#getParentSource <em>Parent Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Source</em>'.
	 * @see specmodel.JoinField#getParentSource()
	 * @see #getJoinField()
	 * @generated
	 */
	EReference getJoinField_ParentSource();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.JoinField#getChildSource <em>Child Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Child Source</em>'.
	 * @see specmodel.JoinField#getChildSource()
	 * @see #getJoinField()
	 * @generated
	 */
	EReference getJoinField_ChildSource();

	/**
	 * Returns the meta object for the reference '{@link specmodel.JoinField#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see specmodel.JoinField#getField()
	 * @see #getJoinField()
	 * @generated
	 */
	EReference getJoinField_Field();

	/**
	 * Returns the meta object for class '{@link specmodel.Dedup <em>Dedup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dedup</em>'.
	 * @see specmodel.Dedup
	 * @generated
	 */
	EClass getDedup();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Dedup#getPreDedupBusinessRule <em>Pre Dedup Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pre Dedup Business Rule</em>'.
	 * @see specmodel.Dedup#getPreDedupBusinessRule()
	 * @see #getDedup()
	 * @generated
	 */
	EReference getDedup_PreDedupBusinessRule();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Dedup#getPostDedupBusinessRule <em>Post Dedup Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Post Dedup Business Rule</em>'.
	 * @see specmodel.Dedup#getPostDedupBusinessRule()
	 * @see #getDedup()
	 * @generated
	 */
	EReference getDedup_PostDedupBusinessRule();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Dedup#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see specmodel.Dedup#getField()
	 * @see #getDedup()
	 * @generated
	 */
	EReference getDedup_Field();

	/**
	 * Returns the meta object for class '{@link specmodel.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see specmodel.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Filter#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see specmodel.Filter#getField()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Field();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Filter#getPreFilterBusinessRule <em>Pre Filter Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pre Filter Business Rule</em>'.
	 * @see specmodel.Filter#getPreFilterBusinessRule()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_PreFilterBusinessRule();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Filter#getPostFilterBusinessRule <em>Post Filter Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Post Filter Business Rule</em>'.
	 * @see specmodel.Filter#getPostFilterBusinessRule()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_PostFilterBusinessRule();

	/**
	 * Returns the meta object for class '{@link specmodel.SubSpecification <em>Sub Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Specification</em>'.
	 * @see specmodel.SubSpecification
	 * @generated
	 */
	EClass getSubSpecification();

	/**
	 * Returns the meta object for class '{@link specmodel.BusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Rule</em>'.
	 * @see specmodel.BusinessRule
	 * @generated
	 */
	EClass getBusinessRule();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.BusinessRule#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification</em>'.
	 * @see specmodel.BusinessRule#getSpecification()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_Specification();

	/**
	 * Returns the meta object for the containment reference '{@link specmodel.BusinessRule#getPreDedup <em>Pre Dedup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Dedup</em>'.
	 * @see specmodel.BusinessRule#getPreDedup()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_PreDedup();

	/**
	 * Returns the meta object for the containment reference '{@link specmodel.BusinessRule#getPostDedup <em>Post Dedup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Dedup</em>'.
	 * @see specmodel.BusinessRule#getPostDedup()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_PostDedup();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.BusinessRule#getVectorkeys <em>Vectorkeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vectorkeys</em>'.
	 * @see specmodel.BusinessRule#getVectorkeys()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_Vectorkeys();

	/**
	 * Returns the meta object for the containment reference '{@link specmodel.BusinessRule#getPreFilter <em>Pre Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Filter</em>'.
	 * @see specmodel.BusinessRule#getPreFilter()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_PreFilter();

	/**
	 * Returns the meta object for the containment reference '{@link specmodel.BusinessRule#getPostFilter <em>Post Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Filter</em>'.
	 * @see specmodel.BusinessRule#getPostFilter()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_PostFilter();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.BusinessRule#getRuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Type</em>'.
	 * @see specmodel.BusinessRule#getRuleType()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_RuleType();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Entity</em>'.
	 * @see specmodel.BusinessRule#getTargetEntity()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_TargetEntity();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getRelationshipSourceEntity <em>Relationship Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship Source Entity</em>'.
	 * @see specmodel.BusinessRule#getRelationshipSourceEntity()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_RelationshipSourceEntity();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getRelationshipTargetEntity <em>Relationship Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship Target Entity</em>'.
	 * @see specmodel.BusinessRule#getRelationshipTargetEntity()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_RelationshipTargetEntity();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getTargetParentEntity <em>Target Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Parent Entity</em>'.
	 * @see specmodel.BusinessRule#getTargetParentEntity()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_TargetParentEntity();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getLookupEntities <em>Lookup Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lookup Entities</em>'.
	 * @see specmodel.BusinessRule#getLookupEntities()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_LookupEntities();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Mapping Output Fields</em>'.
	 * @see specmodel.BusinessRule#getTargetMappingOutputFields()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_TargetMappingOutputFields();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getTargetRelationship <em>Target Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Relationship</em>'.
	 * @see specmodel.BusinessRule#getTargetRelationship()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_TargetRelationship();

	/**
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getTargetInclude <em>Target Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Include</em>'.
	 * @see specmodel.BusinessRule#getTargetInclude()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_TargetInclude();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.BusinessRule#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see specmodel.BusinessRule#getSources()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_Sources();

	/**
	 * Returns the meta object for class '{@link specmodel.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see specmodel.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Source#getSourceSpecification <em>Source Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Specification</em>'.
	 * @see specmodel.Source#getSourceSpecification()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_SourceSpecification();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Source#getParentSource <em>Parent Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Source</em>'.
	 * @see specmodel.Source#getParentSource()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_ParentSource();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Source#getChildSources <em>Child Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Sources</em>'.
	 * @see specmodel.Source#getChildSources()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_ChildSources();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Source#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification</em>'.
	 * @see specmodel.Source#getSpecification()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Specification();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Source#getParentJoinFields <em>Parent Join Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Join Fields</em>'.
	 * @see specmodel.Source#getParentJoinFields()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_ParentJoinFields();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Source#getChildJoinField <em>Child Join Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Join Field</em>'.
	 * @see specmodel.Source#getChildJoinField()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_ChildJoinField();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Source#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see specmodel.Source#getFilters()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Filters();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Source#getVectorkeys <em>Vectorkeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vectorkeys</em>'.
	 * @see specmodel.Source#getVectorkeys()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Vectorkeys();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Source#getSourceEntity <em>Source Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Entity</em>'.
	 * @see specmodel.Source#getSourceEntity()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_SourceEntity();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#isIsVector <em>Is Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Vector</em>'.
	 * @see specmodel.Source#isIsVector()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_IsVector();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#isIsMultiplying <em>Is Multiplying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multiplying</em>'.
	 * @see specmodel.Source#isIsMultiplying()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_IsMultiplying();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see specmodel.Source#getComment()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Comment();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see specmodel.Source#getAlias()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Alias();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see specmodel.Source#isIsMandatory()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_IsMandatory();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#getJoinComment <em>Join Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Comment</em>'.
	 * @see specmodel.Source#getJoinComment()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_JoinComment();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#getRelationshipAlias <em>Relationship Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Alias</em>'.
	 * @see specmodel.Source#getRelationshipAlias()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_RelationshipAlias();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Source#getSourceReleationship <em>Source Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Releationship</em>'.
	 * @see specmodel.Source#getSourceReleationship()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_SourceReleationship();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Source#getJoinEntity <em>Join Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join Entity</em>'.
	 * @see specmodel.Source#getJoinEntity()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_JoinEntity();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Source#getBusinessrule <em>Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Businessrule</em>'.
	 * @see specmodel.Source#getBusinessrule()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Businessrule();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Source#getJoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Type</em>'.
	 * @see specmodel.Source#getJoinType()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_JoinType();

	/**
	 * Returns the meta object for class '{@link specmodel.VectorKey <em>Vector Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Key</em>'.
	 * @see specmodel.VectorKey
	 * @generated
	 */
	EClass getVectorKey();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.VectorKey#getBusinessrule <em>Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Businessrule</em>'.
	 * @see specmodel.VectorKey#getBusinessrule()
	 * @see #getVectorKey()
	 * @generated
	 */
	EReference getVectorKey_Businessrule();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.VectorKey#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see specmodel.VectorKey#getSource()
	 * @see #getVectorKey()
	 * @generated
	 */
	EReference getVectorKey_Source();

	/**
	 * Returns the meta object for the reference '{@link specmodel.VectorKey#getVkField <em>Vk Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vk Field</em>'.
	 * @see specmodel.VectorKey#getVkField()
	 * @see #getVectorKey()
	 * @generated
	 */
	EReference getVectorKey_VkField();

	/**
	 * Returns the meta object for enum '{@link specmodel.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Type</em>'.
	 * @see specmodel.RuleType
	 * @generated
	 */
	EEnum getRuleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecmodelFactory getSpecmodelFactory();

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
		 * The meta object literal for the '{@link specmodel.impl.SpecPackageImpl <em>Spec Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.SpecPackageImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getSpecPackage()
		 * @generated
		 */
		EClass SPEC_PACKAGE = eINSTANCE.getSpecPackage();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_PACKAGE__SPECIFICATIONS = eINSTANCE.getSpecPackage_Specifications();

		/**
		 * The meta object literal for the '{@link specmodel.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.SpecificationImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Specpackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SPECPACKAGE = eINSTANCE.getSpecification_Specpackage();

		/**
		 * The meta object literal for the '<em><b>Businessrules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__BUSINESSRULES = eINSTANCE.getSpecification_Businessrules();

		/**
		 * The meta object literal for the '<em><b>Primary Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PRIMARY_SOURCES = eINSTANCE.getSpecification_PrimarySources();

		/**
		 * The meta object literal for the '{@link specmodel.impl.JoinFieldImpl <em>Join Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.JoinFieldImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getJoinField()
		 * @generated
		 */
		EClass JOIN_FIELD = eINSTANCE.getJoinField();

		/**
		 * The meta object literal for the '<em><b>Parent Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_FIELD__PARENT_SOURCE = eINSTANCE.getJoinField_ParentSource();

		/**
		 * The meta object literal for the '<em><b>Child Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_FIELD__CHILD_SOURCE = eINSTANCE.getJoinField_ChildSource();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_FIELD__FIELD = eINSTANCE.getJoinField_Field();

		/**
		 * The meta object literal for the '{@link specmodel.impl.DedupImpl <em>Dedup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.DedupImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getDedup()
		 * @generated
		 */
		EClass DEDUP = eINSTANCE.getDedup();

		/**
		 * The meta object literal for the '<em><b>Pre Dedup Business Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUP__PRE_DEDUP_BUSINESS_RULE = eINSTANCE.getDedup_PreDedupBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Post Dedup Business Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUP__POST_DEDUP_BUSINESS_RULE = eINSTANCE.getDedup_PostDedupBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUP__FIELD = eINSTANCE.getDedup_Field();

		/**
		 * The meta object literal for the '{@link specmodel.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.FilterImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FIELD = eINSTANCE.getFilter_Field();

		/**
		 * The meta object literal for the '<em><b>Pre Filter Business Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__PRE_FILTER_BUSINESS_RULE = eINSTANCE.getFilter_PreFilterBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Post Filter Business Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__POST_FILTER_BUSINESS_RULE = eINSTANCE.getFilter_PostFilterBusinessRule();

		/**
		 * The meta object literal for the '{@link specmodel.impl.SubSpecificationImpl <em>Sub Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.SubSpecificationImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getSubSpecification()
		 * @generated
		 */
		EClass SUB_SPECIFICATION = eINSTANCE.getSubSpecification();

		/**
		 * The meta object literal for the '{@link specmodel.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.BusinessRuleImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getBusinessRule()
		 * @generated
		 */
		EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__SPECIFICATION = eINSTANCE.getBusinessRule_Specification();

		/**
		 * The meta object literal for the '<em><b>Pre Dedup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__PRE_DEDUP = eINSTANCE.getBusinessRule_PreDedup();

		/**
		 * The meta object literal for the '<em><b>Post Dedup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__POST_DEDUP = eINSTANCE.getBusinessRule_PostDedup();

		/**
		 * The meta object literal for the '<em><b>Vectorkeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__VECTORKEYS = eINSTANCE.getBusinessRule_Vectorkeys();

		/**
		 * The meta object literal for the '<em><b>Pre Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__PRE_FILTER = eINSTANCE.getBusinessRule_PreFilter();

		/**
		 * The meta object literal for the '<em><b>Post Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__POST_FILTER = eINSTANCE.getBusinessRule_PostFilter();

		/**
		 * The meta object literal for the '<em><b>Rule Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__RULE_TYPE = eINSTANCE.getBusinessRule_RuleType();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_ENTITY = eINSTANCE.getBusinessRule_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Relationship Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY = eINSTANCE.getBusinessRule_RelationshipSourceEntity();

		/**
		 * The meta object literal for the '<em><b>Relationship Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY = eINSTANCE.getBusinessRule_RelationshipTargetEntity();

		/**
		 * The meta object literal for the '<em><b>Target Parent Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_PARENT_ENTITY = eINSTANCE.getBusinessRule_TargetParentEntity();

		/**
		 * The meta object literal for the '<em><b>Lookup Entities</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__LOOKUP_ENTITIES = eINSTANCE.getBusinessRule_LookupEntities();

		/**
		 * The meta object literal for the '<em><b>Target Mapping Output Fields</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS = eINSTANCE.getBusinessRule_TargetMappingOutputFields();

		/**
		 * The meta object literal for the '<em><b>Target Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_RELATIONSHIP = eINSTANCE.getBusinessRule_TargetRelationship();

		/**
		 * The meta object literal for the '<em><b>Target Include</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_INCLUDE = eINSTANCE.getBusinessRule_TargetInclude();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__SOURCES = eINSTANCE.getBusinessRule_Sources();

		/**
		 * The meta object literal for the '{@link specmodel.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.SourceImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Source Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_SPECIFICATION = eINSTANCE.getSource_SourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__PARENT_SOURCE = eINSTANCE.getSource_ParentSource();

		/**
		 * The meta object literal for the '<em><b>Child Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CHILD_SOURCES = eINSTANCE.getSource_ChildSources();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SPECIFICATION = eINSTANCE.getSource_Specification();

		/**
		 * The meta object literal for the '<em><b>Parent Join Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__PARENT_JOIN_FIELDS = eINSTANCE.getSource_ParentJoinFields();

		/**
		 * The meta object literal for the '<em><b>Child Join Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CHILD_JOIN_FIELD = eINSTANCE.getSource_ChildJoinField();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__FILTERS = eINSTANCE.getSource_Filters();

		/**
		 * The meta object literal for the '<em><b>Vectorkeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__VECTORKEYS = eINSTANCE.getSource_Vectorkeys();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_ENTITY = eINSTANCE.getSource_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Is Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__IS_VECTOR = eINSTANCE.getSource_IsVector();

		/**
		 * The meta object literal for the '<em><b>Is Multiplying</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__IS_MULTIPLYING = eINSTANCE.getSource_IsMultiplying();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__COMMENT = eINSTANCE.getSource_Comment();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ALIAS = eINSTANCE.getSource_Alias();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__IS_MANDATORY = eINSTANCE.getSource_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Join Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__JOIN_COMMENT = eINSTANCE.getSource_JoinComment();

		/**
		 * The meta object literal for the '<em><b>Relationship Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__RELATIONSHIP_ALIAS = eINSTANCE.getSource_RelationshipAlias();

		/**
		 * The meta object literal for the '<em><b>Source Releationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_RELEATIONSHIP = eINSTANCE.getSource_SourceReleationship();

		/**
		 * The meta object literal for the '<em><b>Join Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__JOIN_ENTITY = eINSTANCE.getSource_JoinEntity();

		/**
		 * The meta object literal for the '<em><b>Businessrule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__BUSINESSRULE = eINSTANCE.getSource_Businessrule();

		/**
		 * The meta object literal for the '<em><b>Join Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__JOIN_TYPE = eINSTANCE.getSource_JoinType();

		/**
		 * The meta object literal for the '{@link specmodel.impl.VectorKeyImpl <em>Vector Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.VectorKeyImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getVectorKey()
		 * @generated
		 */
		EClass VECTOR_KEY = eINSTANCE.getVectorKey();

		/**
		 * The meta object literal for the '<em><b>Businessrule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_KEY__BUSINESSRULE = eINSTANCE.getVectorKey_Businessrule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_KEY__SOURCE = eINSTANCE.getVectorKey_Source();

		/**
		 * The meta object literal for the '<em><b>Vk Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_KEY__VK_FIELD = eINSTANCE.getVectorKey_VkField();

		/**
		 * The meta object literal for the '{@link specmodel.RuleType <em>Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.RuleType
		 * @see specmodel.impl.SpecmodelPackageImpl#getRuleType()
		 * @generated
		 */
		EEnum RULE_TYPE = eINSTANCE.getRuleType();

	}

} //SpecmodelPackage
