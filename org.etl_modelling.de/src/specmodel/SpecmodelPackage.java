/**
 */
package specmodel;

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
	 * The feature id for the '<em><b>Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_PACKAGE__SPECIFICATION = ETL_MODELPackage.PACKAGE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Primary Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PRIMARY_SOURCE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link specmodel.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.BusinessRuleImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getBusinessRule()
	 * @generated
	 */
	int BUSINESS_RULE = 2;

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
	 * The feature id for the '<em><b>Post Dedup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__POST_DEDUP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pre Dedup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__PRE_DEDUP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vectorkeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__VECTORKEYS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relationship Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_PARENT_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lookup Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__LOOKUP_ENTITIES = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relationship Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ruletype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RULETYPE = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Relationship Target Entity Use Hash Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Relationship Source Entity Use Hash Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Target Entity Use Hash Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Target Mapping Output Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__TARGET_RELATIONSHIP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Source Releationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__SOURCE_RELEATIONSHIP = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 15;

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
	int SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Source Businessrule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_BUSINESSRULE = 0;

	/**
	 * The feature id for the '<em><b>Parent Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PARENT_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Child Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CHILD_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Source Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__FILTERS = 5;

	/**
	 * The feature id for the '<em><b>Vectorkeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__VECTORKEYS = 6;

	/**
	 * The feature id for the '<em><b>Parent Join Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PARENT_JOIN_FIELDS = 7;

	/**
	 * The feature id for the '<em><b>Child Join Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CHILD_JOIN_FIELDS = 8;

	/**
	 * The feature id for the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Join Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__JOIN_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Source Releationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_RELEATIONSHIP = 11;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IS_MANDATORY = 12;

	/**
	 * The feature id for the '<em><b>Is Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IS_VECTOR = 13;

	/**
	 * The feature id for the '<em><b>Is Multiplying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IS_MULTIPLYING = 14;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ALIAS = 15;

	/**
	 * The feature id for the '<em><b>Readentityspecification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__READENTITYSPECIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Join Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__JOIN_COMMENT = 17;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__COMMENT = 18;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__RELATIONSHIP = 19;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Filter Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_FIELD = 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.DedupImpl <em>Dedup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.DedupImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getDedup()
	 * @generated
	 */
	int DEDUP = 5;

	/**
	 * The feature id for the '<em><b>Post Dedup Businessrule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUP__POST_DEDUP_BUSINESSRULE = 0;

	/**
	 * The feature id for the '<em><b>Pre Dedup Businessrule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUP__PRE_DEDUP_BUSINESSRULE = 1;

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
	 * The meta object id for the '{@link specmodel.impl.VectorKeyImpl <em>Vector Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.VectorKeyImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getVectorKey()
	 * @generated
	 */
	int VECTOR_KEY = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Businessrule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY__BUSINESSRULE = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_KEY__FIELD = 2;

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
	 * The meta object id for the '{@link specmodel.impl.JoinFieldImpl <em>Join Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.JoinFieldImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getJoinField()
	 * @generated
	 */
	int JOIN_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Parent Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__PARENT_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Child Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__CHILD_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD__FIELD = 2;

	/**
	 * The number of structural features of the '<em>Join Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Join Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.FieldImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 8;

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
	 * The feature id for the '<em><b>Reference Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REFERENCE_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.EntityImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIPS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PART_OF = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Baseline Entity For</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_BASELINE_ENTITY_FOR = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Baseline Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BASELINE_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXTENDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.RelationshipImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ETL_MODELPackage.NAMEDELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TO_ENTITY = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identifying Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IDENTIFYING_FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Describing Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIBING_FIELDS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relationship Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_ALIAS = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ETL_MODELPackage.NAMEDELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ETL_MODELPackage.NAMEDELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link specmodel.impl.ReadEntitySpecificationImpl <em>Read Entity Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.impl.ReadEntitySpecificationImpl
	 * @see specmodel.impl.SpecmodelPackageImpl#getReadEntitySpecification()
	 * @generated
	 */
	int READ_ENTITY_SPECIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ENTITY_SPECIFICATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Read Key Sats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ENTITY_SPECIFICATION__READ_KEY_SATS = 1;

	/**
	 * The feature id for the '<em><b>Read Key Sats Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ENTITY_SPECIFICATION__READ_KEY_SATS_REASON = 2;

	/**
	 * The number of structural features of the '<em>Read Entity Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ENTITY_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Read Entity Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ENTITY_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link specmodel.RuleType <em>Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see specmodel.RuleType
	 * @see specmodel.impl.SpecmodelPackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 12;


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
	 * Returns the meta object for the containment reference list '{@link specmodel.SpecPackage#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification</em>'.
	 * @see specmodel.SpecPackage#getSpecification()
	 * @see #getSpecPackage()
	 * @generated
	 */
	EReference getSpecPackage_Specification();

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
	 * Returns the meta object for the containment reference list '{@link specmodel.Specification#getPrimarySource <em>Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Source</em>'.
	 * @see specmodel.Specification#getPrimarySource()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_PrimarySource();

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
	 * Returns the meta object for the reference list '{@link specmodel.BusinessRule#getLookupEntities <em>Lookup Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lookup Entities</em>'.
	 * @see specmodel.BusinessRule#getLookupEntities()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_LookupEntities();

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
	 * Returns the meta object for the attribute '{@link specmodel.BusinessRule#getRuletype <em>Ruletype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruletype</em>'.
	 * @see specmodel.BusinessRule#getRuletype()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_Ruletype();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.BusinessRule#isRelationshipTargetEntityUseHashKey <em>Relationship Target Entity Use Hash Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Target Entity Use Hash Key</em>'.
	 * @see specmodel.BusinessRule#isRelationshipTargetEntityUseHashKey()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_RelationshipTargetEntityUseHashKey();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.BusinessRule#isRelationshipSourceEntityUseHashKey <em>Relationship Source Entity Use Hash Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Source Entity Use Hash Key</em>'.
	 * @see specmodel.BusinessRule#isRelationshipSourceEntityUseHashKey()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_RelationshipSourceEntityUseHashKey();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.BusinessRule#isTargetEntityUseHashKey <em>Target Entity Use Hash Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity Use Hash Key</em>'.
	 * @see specmodel.BusinessRule#isTargetEntityUseHashKey()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_TargetEntityUseHashKey();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.BusinessRule#getTargetMappingOutputFields <em>Target Mapping Output Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Mapping Output Fields</em>'.
	 * @see specmodel.BusinessRule#getTargetMappingOutputFields()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EAttribute getBusinessRule_TargetMappingOutputFields();

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
	 * Returns the meta object for the reference '{@link specmodel.BusinessRule#getSourceReleationship <em>Source Releationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Releationship</em>'.
	 * @see specmodel.BusinessRule#getSourceReleationship()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_SourceReleationship();

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
	 * Returns the meta object for the reference '{@link specmodel.Source#getSourceBusinessrule <em>Source Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Businessrule</em>'.
	 * @see specmodel.Source#getSourceBusinessrule()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_SourceBusinessrule();

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
	 * Returns the meta object for the containment reference list '{@link specmodel.Source#getChildSource <em>Child Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Source</em>'.
	 * @see specmodel.Source#getChildSource()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_ChildSource();

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
	 * Returns the meta object for the containment reference list '{@link specmodel.Source#getChildJoinFields <em>Child Join Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Join Fields</em>'.
	 * @see specmodel.Source#getChildJoinFields()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_ChildJoinFields();

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
	 * Returns the meta object for the reference '{@link specmodel.Source#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see specmodel.Source#getRelationship()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Relationship();

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
	 * Returns the meta object for the containment reference '{@link specmodel.Source#getReadentityspecification <em>Readentityspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Readentityspecification</em>'.
	 * @see specmodel.Source#getReadentityspecification()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Readentityspecification();

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
	 * Returns the meta object for class '{@link specmodel.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see specmodel.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Filter#getFilterField <em>Filter Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Field</em>'.
	 * @see specmodel.Filter#getFilterField()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_FilterField();

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
	 * Returns the meta object for the container reference '{@link specmodel.Dedup#getPostDedupBusinessrule <em>Post Dedup Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Post Dedup Businessrule</em>'.
	 * @see specmodel.Dedup#getPostDedupBusinessrule()
	 * @see #getDedup()
	 * @generated
	 */
	EReference getDedup_PostDedupBusinessrule();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Dedup#getPreDedupBusinessrule <em>Pre Dedup Businessrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pre Dedup Businessrule</em>'.
	 * @see specmodel.Dedup#getPreDedupBusinessrule()
	 * @see #getDedup()
	 * @generated
	 */
	EReference getDedup_PreDedupBusinessrule();

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
	 * Returns the meta object for class '{@link specmodel.VectorKey <em>Vector Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector Key</em>'.
	 * @see specmodel.VectorKey
	 * @generated
	 */
	EClass getVectorKey();

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
	 * Returns the meta object for the reference '{@link specmodel.VectorKey#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see specmodel.VectorKey#getField()
	 * @see #getVectorKey()
	 * @generated
	 */
	EReference getVectorKey_Field();

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
	 * Returns the meta object for class '{@link specmodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see specmodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Field#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see specmodel.Field#getEntity()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Entity();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Field#getReferenceEntity <em>Reference Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Entity</em>'.
	 * @see specmodel.Field#getReferenceEntity()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ReferenceEntity();

	/**
	 * Returns the meta object for class '{@link specmodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see specmodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see specmodel.Entity#getRelationships()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relationships();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Entity#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part Of</em>'.
	 * @see specmodel.Entity#getPartOf()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PartOf();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see specmodel.Entity#getFields()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Fields();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Entity#getIsBaselineEntityFor <em>Is Baseline Entity For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Baseline Entity For</em>'.
	 * @see specmodel.Entity#getIsBaselineEntityFor()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IsBaselineEntityFor();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Entity#getBaselineEntity <em>Baseline Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baseline Entity</em>'.
	 * @see specmodel.Entity#getBaselineEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_BaselineEntity();

	/**
	 * Returns the meta object for the reference list '{@link specmodel.Entity#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see specmodel.Entity#getExtends()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Extends();

	/**
	 * Returns the meta object for class '{@link specmodel.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see specmodel.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.Relationship#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see specmodel.Relationship#getEntity()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Entity();

	/**
	 * Returns the meta object for the reference '{@link specmodel.Relationship#getToEntity <em>To Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Entity</em>'.
	 * @see specmodel.Relationship#getToEntity()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ToEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Relationship#getIdentifyingFields <em>Identifying Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifying Fields</em>'.
	 * @see specmodel.Relationship#getIdentifyingFields()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_IdentifyingFields();

	/**
	 * Returns the meta object for the containment reference list '{@link specmodel.Relationship#getDescribingFields <em>Describing Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Describing Fields</em>'.
	 * @see specmodel.Relationship#getDescribingFields()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_DescribingFields();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.Relationship#getRelationshipAlias <em>Relationship Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Alias</em>'.
	 * @see specmodel.Relationship#getRelationshipAlias()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_RelationshipAlias();

	/**
	 * Returns the meta object for class '{@link specmodel.ReadEntitySpecification <em>Read Entity Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Entity Specification</em>'.
	 * @see specmodel.ReadEntitySpecification
	 * @generated
	 */
	EClass getReadEntitySpecification();

	/**
	 * Returns the meta object for the container reference '{@link specmodel.ReadEntitySpecification#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see specmodel.ReadEntitySpecification#getSource()
	 * @see #getReadEntitySpecification()
	 * @generated
	 */
	EReference getReadEntitySpecification_Source();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.ReadEntitySpecification#isReadKeySats <em>Read Key Sats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Key Sats</em>'.
	 * @see specmodel.ReadEntitySpecification#isReadKeySats()
	 * @see #getReadEntitySpecification()
	 * @generated
	 */
	EAttribute getReadEntitySpecification_ReadKeySats();

	/**
	 * Returns the meta object for the attribute '{@link specmodel.ReadEntitySpecification#getReadKeySatsReason <em>Read Key Sats Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Key Sats Reason</em>'.
	 * @see specmodel.ReadEntitySpecification#getReadKeySatsReason()
	 * @see #getReadEntitySpecification()
	 * @generated
	 */
	EAttribute getReadEntitySpecification_ReadKeySatsReason();

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
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_PACKAGE__SPECIFICATION = eINSTANCE.getSpecPackage_Specification();

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
		 * The meta object literal for the '<em><b>Primary Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PRIMARY_SOURCE = eINSTANCE.getSpecification_PrimarySource();

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
		 * The meta object literal for the '<em><b>Post Dedup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__POST_DEDUP = eINSTANCE.getBusinessRule_PostDedup();

		/**
		 * The meta object literal for the '<em><b>Pre Dedup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__PRE_DEDUP = eINSTANCE.getBusinessRule_PreDedup();

		/**
		 * The meta object literal for the '<em><b>Vectorkeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__VECTORKEYS = eINSTANCE.getBusinessRule_Vectorkeys();

		/**
		 * The meta object literal for the '<em><b>Relationship Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY = eINSTANCE.getBusinessRule_RelationshipTargetEntity();

		/**
		 * The meta object literal for the '<em><b>Target Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_ENTITY = eINSTANCE.getBusinessRule_TargetEntity();

		/**
		 * The meta object literal for the '<em><b>Target Parent Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_PARENT_ENTITY = eINSTANCE.getBusinessRule_TargetParentEntity();

		/**
		 * The meta object literal for the '<em><b>Lookup Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__LOOKUP_ENTITIES = eINSTANCE.getBusinessRule_LookupEntities();

		/**
		 * The meta object literal for the '<em><b>Relationship Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY = eINSTANCE.getBusinessRule_RelationshipSourceEntity();

		/**
		 * The meta object literal for the '<em><b>Ruletype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__RULETYPE = eINSTANCE.getBusinessRule_Ruletype();

		/**
		 * The meta object literal for the '<em><b>Relationship Target Entity Use Hash Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY = eINSTANCE.getBusinessRule_RelationshipTargetEntityUseHashKey();

		/**
		 * The meta object literal for the '<em><b>Relationship Source Entity Use Hash Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY = eINSTANCE.getBusinessRule_RelationshipSourceEntityUseHashKey();

		/**
		 * The meta object literal for the '<em><b>Target Entity Use Hash Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY = eINSTANCE.getBusinessRule_TargetEntityUseHashKey();

		/**
		 * The meta object literal for the '<em><b>Target Mapping Output Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS = eINSTANCE.getBusinessRule_TargetMappingOutputFields();

		/**
		 * The meta object literal for the '<em><b>Target Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__TARGET_RELATIONSHIP = eINSTANCE.getBusinessRule_TargetRelationship();

		/**
		 * The meta object literal for the '<em><b>Source Releationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__SOURCE_RELEATIONSHIP = eINSTANCE.getBusinessRule_SourceReleationship();

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
		 * The meta object literal for the '<em><b>Source Businessrule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_BUSINESSRULE = eINSTANCE.getSource_SourceBusinessrule();

		/**
		 * The meta object literal for the '<em><b>Parent Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__PARENT_SOURCE = eINSTANCE.getSource_ParentSource();

		/**
		 * The meta object literal for the '<em><b>Child Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CHILD_SOURCE = eINSTANCE.getSource_ChildSource();

		/**
		 * The meta object literal for the '<em><b>Source Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_SPECIFICATION = eINSTANCE.getSource_SourceSpecification();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SPECIFICATION = eINSTANCE.getSource_Specification();

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
		 * The meta object literal for the '<em><b>Parent Join Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__PARENT_JOIN_FIELDS = eINSTANCE.getSource_ParentJoinFields();

		/**
		 * The meta object literal for the '<em><b>Child Join Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CHILD_JOIN_FIELDS = eINSTANCE.getSource_ChildJoinFields();

		/**
		 * The meta object literal for the '<em><b>Source Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_ENTITY = eINSTANCE.getSource_SourceEntity();

		/**
		 * The meta object literal for the '<em><b>Join Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__JOIN_ENTITY = eINSTANCE.getSource_JoinEntity();

		/**
		 * The meta object literal for the '<em><b>Source Releationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__SOURCE_RELEATIONSHIP = eINSTANCE.getSource_SourceReleationship();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__RELATIONSHIP = eINSTANCE.getSource_Relationship();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__IS_MANDATORY = eINSTANCE.getSource_IsMandatory();

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
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ALIAS = eINSTANCE.getSource_Alias();

		/**
		 * The meta object literal for the '<em><b>Readentityspecification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__READENTITYSPECIFICATION = eINSTANCE.getSource_Readentityspecification();

		/**
		 * The meta object literal for the '<em><b>Join Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__JOIN_COMMENT = eINSTANCE.getSource_JoinComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__COMMENT = eINSTANCE.getSource_Comment();

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
		 * The meta object literal for the '<em><b>Filter Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FILTER_FIELD = eINSTANCE.getFilter_FilterField();

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
		 * The meta object literal for the '<em><b>Post Dedup Businessrule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUP__POST_DEDUP_BUSINESSRULE = eINSTANCE.getDedup_PostDedupBusinessrule();

		/**
		 * The meta object literal for the '<em><b>Pre Dedup Businessrule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUP__PRE_DEDUP_BUSINESSRULE = eINSTANCE.getDedup_PreDedupBusinessrule();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUP__FIELD = eINSTANCE.getDedup_Field();

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
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_KEY__SOURCE = eINSTANCE.getVectorKey_Source();

		/**
		 * The meta object literal for the '<em><b>Businessrule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_KEY__BUSINESSRULE = eINSTANCE.getVectorKey_Businessrule();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR_KEY__FIELD = eINSTANCE.getVectorKey_Field();

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
		 * The meta object literal for the '{@link specmodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.FieldImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getField()
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
		 * The meta object literal for the '<em><b>Reference Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__REFERENCE_ENTITY = eINSTANCE.getField_ReferenceEntity();

		/**
		 * The meta object literal for the '{@link specmodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.EntityImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONSHIPS = eINSTANCE.getEntity_Relationships();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PART_OF = eINSTANCE.getEntity_PartOf();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

		/**
		 * The meta object literal for the '<em><b>Is Baseline Entity For</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__IS_BASELINE_ENTITY_FOR = eINSTANCE.getEntity_IsBaselineEntityFor();

		/**
		 * The meta object literal for the '<em><b>Baseline Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BASELINE_ENTITY = eINSTANCE.getEntity_BaselineEntity();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__EXTENDS = eINSTANCE.getEntity_Extends();

		/**
		 * The meta object literal for the '{@link specmodel.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.RelationshipImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__ENTITY = eINSTANCE.getRelationship_Entity();

		/**
		 * The meta object literal for the '<em><b>To Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TO_ENTITY = eINSTANCE.getRelationship_ToEntity();

		/**
		 * The meta object literal for the '<em><b>Identifying Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__IDENTIFYING_FIELDS = eINSTANCE.getRelationship_IdentifyingFields();

		/**
		 * The meta object literal for the '<em><b>Describing Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__DESCRIBING_FIELDS = eINSTANCE.getRelationship_DescribingFields();

		/**
		 * The meta object literal for the '<em><b>Relationship Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__RELATIONSHIP_ALIAS = eINSTANCE.getRelationship_RelationshipAlias();

		/**
		 * The meta object literal for the '{@link specmodel.impl.ReadEntitySpecificationImpl <em>Read Entity Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see specmodel.impl.ReadEntitySpecificationImpl
		 * @see specmodel.impl.SpecmodelPackageImpl#getReadEntitySpecification()
		 * @generated
		 */
		EClass READ_ENTITY_SPECIFICATION = eINSTANCE.getReadEntitySpecification();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_ENTITY_SPECIFICATION__SOURCE = eINSTANCE.getReadEntitySpecification_Source();

		/**
		 * The meta object literal for the '<em><b>Read Key Sats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_ENTITY_SPECIFICATION__READ_KEY_SATS = eINSTANCE.getReadEntitySpecification_ReadKeySats();

		/**
		 * The meta object literal for the '<em><b>Read Key Sats Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_ENTITY_SPECIFICATION__READ_KEY_SATS_REASON = eINSTANCE.getReadEntitySpecification_ReadKeySatsReason();

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
