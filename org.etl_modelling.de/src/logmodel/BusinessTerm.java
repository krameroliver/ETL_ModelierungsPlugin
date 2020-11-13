/**
 */
package logmodel;

import ETL_MODEL.namedelement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmodel.BusinessTerm#getState <em>State</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getPrimaryFdmID <em>Primary Fdm ID</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getDescription <em>Description</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getPrimaryFDMName <em>Primary FDM Name</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getUsedBy <em>Used By</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getFunctionalSpecification <em>Functional Specification</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getRegulatoryRequirements <em>Regulatory Requirements</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getDataOwner <em>Data Owner</em>}</li>
 *   <li>{@link logmodel.BusinessTerm#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see logmodel.LogmodelPackage#getBusinessTerm()
 * @model
 * @generated
 */
public interface BusinessTerm extends namedelement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Primary Fdm ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Fdm ID</em>' attribute.
	 * @see #setPrimaryFdmID(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_PrimaryFdmID()
	 * @model
	 * @generated
	 */
	String getPrimaryFdmID();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getPrimaryFdmID <em>Primary Fdm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Fdm ID</em>' attribute.
	 * @see #getPrimaryFdmID()
	 * @generated
	 */
	void setPrimaryFdmID(String value);

	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_GroupID()
	 * @model
	 * @generated
	 */
	String getGroupID();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Primary FDM Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary FDM Name</em>' attribute.
	 * @see #setPrimaryFDMName(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_PrimaryFDMName()
	 * @model
	 * @generated
	 */
	String getPrimaryFDMName();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getPrimaryFDMName <em>Primary FDM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary FDM Name</em>' attribute.
	 * @see #getPrimaryFDMName()
	 * @generated
	 */
	void setPrimaryFDMName(String value);

	/**
	 * Returns the value of the '<em><b>Used By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By</em>' attribute.
	 * @see #setUsedBy(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_UsedBy()
	 * @model
	 * @generated
	 */
	String getUsedBy();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getUsedBy <em>Used By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By</em>' attribute.
	 * @see #getUsedBy()
	 * @generated
	 */
	void setUsedBy(String value);

	/**
	 * Returns the value of the '<em><b>Functional Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Specification</em>' attribute.
	 * @see #setFunctionalSpecification(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_FunctionalSpecification()
	 * @model
	 * @generated
	 */
	String getFunctionalSpecification();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getFunctionalSpecification <em>Functional Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Specification</em>' attribute.
	 * @see #getFunctionalSpecification()
	 * @generated
	 */
	void setFunctionalSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Regulatory Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory Requirements</em>' attribute.
	 * @see #setRegulatoryRequirements(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_RegulatoryRequirements()
	 * @model
	 * @generated
	 */
	String getRegulatoryRequirements();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getRegulatoryRequirements <em>Regulatory Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatory Requirements</em>' attribute.
	 * @see #getRegulatoryRequirements()
	 * @generated
	 */
	void setRegulatoryRequirements(String value);

	/**
	 * Returns the value of the '<em><b>Data Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Owner</em>' attribute.
	 * @see #setDataOwner(String)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_DataOwner()
	 * @model
	 * @generated
	 */
	String getDataOwner();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getDataOwner <em>Data Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Owner</em>' attribute.
	 * @see #getDataOwner()
	 * @generated
	 */
	void setDataOwner(String value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see logmodel.LogmodelPackage#getBusinessTerm_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link logmodel.BusinessTerm#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // BusinessTerm
