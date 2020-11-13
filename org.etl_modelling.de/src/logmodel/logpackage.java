/**
 */
package logmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>logpackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmodel.logpackage#getEntity <em>Entity</em>}</li>
 *   <li>{@link logmodel.logpackage#getCommonmapping <em>Commonmapping</em>}</li>
 * </ul>
 *
 * @see logmodel.LogmodelPackage#getlogpackage()
 * @model
 * @generated
 */
public interface logpackage extends ETL_MODEL.Package {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.Entity}.
	 * It is bidirectional and its opposite is '{@link logmodel.Entity#getLogpackage <em>Logpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getlogpackage_Entity()
	 * @see logmodel.Entity#getLogpackage
	 * @model opposite="logpackage" containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Commonmapping</b></em>' containment reference list.
	 * The list contents are of type {@link logmodel.CommonMapping}.
	 * It is bidirectional and its opposite is '{@link logmodel.CommonMapping#getLogpackage <em>Logpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commonmapping</em>' containment reference list.
	 * @see logmodel.LogmodelPackage#getlogpackage_Commonmapping()
	 * @see logmodel.CommonMapping#getLogpackage
	 * @model opposite="logpackage" containment="true"
	 * @generated
	 */
	EList<CommonMapping> getCommonmapping();

} // logpackage
