/**
 */
package specmodel;

import ETL_MODEL.namedelement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.Entity#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link specmodel.Entity#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link specmodel.Entity#getFields <em>Fields</em>}</li>
 *   <li>{@link specmodel.Entity#getIsBaselineEntityFor <em>Is Baseline Entity For</em>}</li>
 *   <li>{@link specmodel.Entity#getBaselineEntity <em>Baseline Entity</em>}</li>
 *   <li>{@link specmodel.Entity#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends namedelement {
	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Relationship}.
	 * It is bidirectional and its opposite is '{@link specmodel.Relationship#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getEntity_Relationships()
	 * @see specmodel.Relationship#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference.
	 * @see #setPartOf(Entity)
	 * @see specmodel.SpecmodelPackage#getEntity_PartOf()
	 * @model
	 * @generated
	 */
	Entity getPartOf();

	/**
	 * Sets the value of the '{@link specmodel.Entity#getPartOf <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Entity value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Field}.
	 * It is bidirectional and its opposite is '{@link specmodel.Field#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getEntity_Fields()
	 * @see specmodel.Field#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Is Baseline Entity For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Entity#getBaselineEntity <em>Baseline Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Baseline Entity For</em>' reference.
	 * @see #setIsBaselineEntityFor(Entity)
	 * @see specmodel.SpecmodelPackage#getEntity_IsBaselineEntityFor()
	 * @see specmodel.Entity#getBaselineEntity
	 * @model opposite="baselineEntity"
	 * @generated
	 */
	Entity getIsBaselineEntityFor();

	/**
	 * Sets the value of the '{@link specmodel.Entity#getIsBaselineEntityFor <em>Is Baseline Entity For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Baseline Entity For</em>' reference.
	 * @see #getIsBaselineEntityFor()
	 * @generated
	 */
	void setIsBaselineEntityFor(Entity value);

	/**
	 * Returns the value of the '<em><b>Baseline Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Entity#getIsBaselineEntityFor <em>Is Baseline Entity For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseline Entity</em>' reference.
	 * @see #setBaselineEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getEntity_BaselineEntity()
	 * @see specmodel.Entity#getIsBaselineEntityFor
	 * @model opposite="isBaselineEntityFor"
	 * @generated
	 */
	Entity getBaselineEntity();

	/**
	 * Sets the value of the '{@link specmodel.Entity#getBaselineEntity <em>Baseline Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline Entity</em>' reference.
	 * @see #getBaselineEntity()
	 * @generated
	 */
	void setBaselineEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link specmodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see specmodel.SpecmodelPackage#getEntity_Extends()
	 * @model
	 * @generated
	 */
	EList<Entity> getExtends();

} // Entity
