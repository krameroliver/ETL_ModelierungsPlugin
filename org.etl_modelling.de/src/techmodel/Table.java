/**
 */
package techmodel;

import ETL_MODEL.namedelement;
import logmodel.Entity;
import logmodel.Field;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link techmodel.Table#getTableType <em>Table Type</em>}</li>
 *   <li>{@link techmodel.Table#getFields <em>Fields</em>}</li>
 *   <li>{@link techmodel.Table#getEntity <em>Entity</em>}</li>
 *   <li>{@link techmodel.Table#getTechpackage <em>Techpackage</em>}</li>
 * </ul>
 *
 * @see techmodel.TechmodelPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends namedelement {
	/**
	 * Returns the value of the '<em><b>Table Type</b></em>' attribute.
	 * The literals are from the enumeration {@link techmodel.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Type</em>' attribute.
	 * @see techmodel.TableType
	 * @see #setTableType(TableType)
	 * @see techmodel.TechmodelPackage#getTable_TableType()
	 * @model
	 * @generated
	 */
	TableType getTableType();

	/**
	 * Sets the value of the '{@link techmodel.Table#getTableType <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Type</em>' attribute.
	 * @see techmodel.TableType
	 * @see #getTableType()
	 * @generated
	 */
	void setTableType(TableType value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link logmodel.Field}.
	 * It is bidirectional and its opposite is '{@link logmodel.Field#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see techmodel.TechmodelPackage#getTable_Fields()
	 * @see logmodel.Field#getTable
	 * @model opposite="table"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logmodel.Entity#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see techmodel.TechmodelPackage#getTable_Entity()
	 * @see logmodel.Entity#getTables
	 * @model opposite="tables" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link techmodel.Table#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Techpackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link techmodel.TechPackage#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Techpackage</em>' container reference.
	 * @see #setTechpackage(TechPackage)
	 * @see techmodel.TechmodelPackage#getTable_Techpackage()
	 * @see techmodel.TechPackage#getTables
	 * @model opposite="tables" transient="false"
	 * @generated
	 */
	TechPackage getTechpackage();

	/**
	 * Sets the value of the '{@link techmodel.Table#getTechpackage <em>Techpackage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Techpackage</em>' container reference.
	 * @see #getTechpackage()
	 * @generated
	 */
	void setTechpackage(TechPackage value);

} // Table
