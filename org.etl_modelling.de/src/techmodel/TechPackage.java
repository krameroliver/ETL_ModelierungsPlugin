/**
 */
package techmodel;

import logmodel.Entity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link techmodel.TechPackage#getEntitys <em>Entitys</em>}</li>
 *   <li>{@link techmodel.TechPackage#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see techmodel.TechmodelPackage#getTechPackage()
 * @model
 * @generated
 */
public interface TechPackage extends ETL_MODEL.Package {
	/**
	 * Returns the value of the '<em><b>Entitys</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Entity}.
	 * It is bidirectional and its opposite is '{@link logmodel.Entity#getTechpackage <em>Techpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitys</em>' containment reference list.
	 * @see techmodel.TechmodelPackage#getTechPackage_Entitys()
	 * @see logmodel.Entity#getTechpackage
	 * @model opposite="techpackage" containment="true"
	 * @generated
	 */
	EList<Entity> getEntitys();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link techmodel.Table}.
	 * It is bidirectional and its opposite is '{@link techmodel.Table#getTechpackage <em>Techpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see techmodel.TechmodelPackage#getTechPackage_Tables()
	 * @see techmodel.Table#getTechpackage
	 * @model opposite="techpackage" containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // TechPackage
