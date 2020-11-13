/**
 */
package ETL_MODEL;

import package_enums.HISTORISATIONTYPE;
import package_enums.LAYERTYPE;
import package_enums.REPRESENTATIONS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ETL_MODEL.Package#getLAYER <em>LAYER</em>}</li>
 *   <li>{@link ETL_MODEL.Package#getLAYER_TYPE <em>LAYER TYPE</em>}</li>
 *   <li>{@link ETL_MODEL.Package#getHISTORISATION <em>HISTORISATION</em>}</li>
 *   <li>{@link ETL_MODEL.Package#getREPRESENTATION <em>REPRESENTATION</em>}</li>
 * </ul>
 *
 * @see ETL_MODEL.ETL_MODELPackage#getPackage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Package extends namedelement {
	/**
	 * Returns the value of the '<em><b>LAYER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAYER</em>' attribute.
	 * @see #setLAYER(String)
	 * @see ETL_MODEL.ETL_MODELPackage#getPackage_LAYER()
	 * @model
	 * @generated
	 */
	String getLAYER();

	/**
	 * Sets the value of the '{@link ETL_MODEL.Package#getLAYER <em>LAYER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAYER</em>' attribute.
	 * @see #getLAYER()
	 * @generated
	 */
	void setLAYER(String value);

	/**
	 * Returns the value of the '<em><b>LAYER TYPE</b></em>' attribute.
	 * The literals are from the enumeration {@link package_enums.LAYERTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAYER TYPE</em>' attribute.
	 * @see package_enums.LAYERTYPE
	 * @see #setLAYER_TYPE(LAYERTYPE)
	 * @see ETL_MODEL.ETL_MODELPackage#getPackage_LAYER_TYPE()
	 * @model
	 * @generated
	 */
	LAYERTYPE getLAYER_TYPE();

	/**
	 * Sets the value of the '{@link ETL_MODEL.Package#getLAYER_TYPE <em>LAYER TYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAYER TYPE</em>' attribute.
	 * @see package_enums.LAYERTYPE
	 * @see #getLAYER_TYPE()
	 * @generated
	 */
	void setLAYER_TYPE(LAYERTYPE value);

	/**
	 * Returns the value of the '<em><b>HISTORISATION</b></em>' attribute.
	 * The literals are from the enumeration {@link package_enums.HISTORISATIONTYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HISTORISATION</em>' attribute.
	 * @see package_enums.HISTORISATIONTYPE
	 * @see #setHISTORISATION(HISTORISATIONTYPE)
	 * @see ETL_MODEL.ETL_MODELPackage#getPackage_HISTORISATION()
	 * @model
	 * @generated
	 */
	HISTORISATIONTYPE getHISTORISATION();

	/**
	 * Sets the value of the '{@link ETL_MODEL.Package#getHISTORISATION <em>HISTORISATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HISTORISATION</em>' attribute.
	 * @see package_enums.HISTORISATIONTYPE
	 * @see #getHISTORISATION()
	 * @generated
	 */
	void setHISTORISATION(HISTORISATIONTYPE value);

	/**
	 * Returns the value of the '<em><b>REPRESENTATION</b></em>' attribute.
	 * The literals are from the enumeration {@link package_enums.REPRESENTATIONS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REPRESENTATION</em>' attribute.
	 * @see package_enums.REPRESENTATIONS
	 * @see #setREPRESENTATION(REPRESENTATIONS)
	 * @see ETL_MODEL.ETL_MODELPackage#getPackage_REPRESENTATION()
	 * @model
	 * @generated
	 */
	REPRESENTATIONS getREPRESENTATION();

	/**
	 * Sets the value of the '{@link ETL_MODEL.Package#getREPRESENTATION <em>REPRESENTATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REPRESENTATION</em>' attribute.
	 * @see package_enums.REPRESENTATIONS
	 * @see #getREPRESENTATION()
	 * @generated
	 */
	void setREPRESENTATION(REPRESENTATIONS value);

} // Package
