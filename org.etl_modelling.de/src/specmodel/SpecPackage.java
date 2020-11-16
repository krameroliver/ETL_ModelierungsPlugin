/**
 */
package specmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.SpecPackage#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getSpecPackage()
 * @model
 * @generated
 */
public interface SpecPackage extends ETL_MODEL.Package {
	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Specification}.
	 * It is bidirectional and its opposite is '{@link specmodel.Specification#getSpecpackage <em>Specpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getSpecPackage_Specifications()
	 * @see specmodel.Specification#getSpecpackage
	 * @model opposite="specpackage" containment="true"
	 * @generated
	 */
	EList<Specification> getSpecifications();

} // SpecPackage
