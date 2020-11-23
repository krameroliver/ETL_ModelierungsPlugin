/**
 */
package logmodel;

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
 *   <li>{@link logmodel.Entity#getLogpackage <em>Logpackage</em>}</li>
 *   <li>{@link logmodel.Entity#getEntityField <em>Entity Field</em>}</li>
 *   <li>{@link logmodel.Entity#getInclude <em>Include</em>}</li>
 *   <li>{@link logmodel.Entity#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link logmodel.Entity#getFilename <em>Filename</em>}</li>
 *   <li>{@link logmodel.Entity#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link logmodel.Entity#getLineend <em>Lineend</em>}</li>
 * </ul>
 *
 * @see logmodel.LogmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends namedelement {
	/**
	 * Returns the value of the '<em><b>Logpackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logmodel.logpackage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logpackage</em>' container reference.
	 * @see #setLogpackage(logpackage)
	 * @see logmodel.LogmodelPackage#getEntity_Logpackage()
	 * @see logmodel.logpackage#getEntity
	 * @model opposite="entity" transient="false"
	 * @generated
	 */
	logpackage getLogpackage();

	/**
	 * Sets the value of the '{@link logmodel.Entity#getLogpackage <em>Logpackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logpackage</em>' container reference.
	 * @see #getLogpackage()
	 * @generated
	 */
	void setLogpackage(logpackage value);

	/**
	 * Returns the value of the '<em><b>Entity Field</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * It is bidirectional and its opposite is '{@link logmodel.Field#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Field</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getEntity_EntityField()
	 * @see logmodel.Field#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Field> getEntityField();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Include}.
	 * It is bidirectional and its opposite is '{@link logmodel.Include#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getEntity_Include()
	 * @see logmodel.Include#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Include> getInclude();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Relationship}.
	 * It is bidirectional and its opposite is '{@link logmodel.Relationship#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getEntity_Relationships()
	 * @see logmodel.Relationship#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see logmodel.LogmodelPackage#getEntity_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link logmodel.Entity#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' attribute.
	 * @see #setDelimiter(String)
	 * @see logmodel.LogmodelPackage#getEntity_Delimiter()
	 * @model
	 * @generated
	 */
	String getDelimiter();

	/**
	 * Sets the value of the '{@link logmodel.Entity#getDelimiter <em>Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' attribute.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(String value);

	/**
	 * Returns the value of the '<em><b>Lineend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineend</em>' attribute.
	 * @see #setLineend(String)
	 * @see logmodel.LogmodelPackage#getEntity_Lineend()
	 * @model
	 * @generated
	 */
	String getLineend();

	/**
	 * Sets the value of the '{@link logmodel.Entity#getLineend <em>Lineend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lineend</em>' attribute.
	 * @see #getLineend()
	 * @generated
	 */
	void setLineend(String value);

} // Entity
