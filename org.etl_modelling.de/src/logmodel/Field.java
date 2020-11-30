/**
 */
package logmodel;

import ETL_MODEL.namedelement;

import techmodel.Table;
import type_enum.FieldTypes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmodel.Field#getEntity <em>Entity</em>}</li>
 *   <li>{@link logmodel.Field#getInclude <em>Include</em>}</li>
 *   <li>{@link logmodel.Field#getLength <em>Length</em>}</li>
 *   <li>{@link logmodel.Field#getPrecision <em>Precision</em>}</li>
 *   <li>{@link logmodel.Field#getScale <em>Scale</em>}</li>
 *   <li>{@link logmodel.Field#getOriginal_name <em>Original name</em>}</li>
 *   <li>{@link logmodel.Field#getShort_describtion <em>Short describtion</em>}</li>
 *   <li>{@link logmodel.Field#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link logmodel.Field#getNullIndicator <em>Null Indicator</em>}</li>
 *   <li>{@link logmodel.Field#isAllowExponent <em>Allow Exponent</em>}</li>
 *   <li>{@link logmodel.Field#isHasImplicitComma <em>Has Implicit Comma</em>}</li>
 *   <li>{@link logmodel.Field#isInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link logmodel.Field#isTableOnly <em>Table Only</em>}</li>
 *   <li>{@link logmodel.Field#isIsFastChanging <em>Is Fast Changing</em>}</li>
 *   <li>{@link logmodel.Field#getType <em>Type</em>}</li>
 *   <li>{@link logmodel.Field#isIsBusinessKey <em>Is Business Key</em>}</li>
 *   <li>{@link logmodel.Field#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see logmodel.LogmodelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends namedelement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logmodel.Entity#getEntityField <em>Entity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see logmodel.LogmodelPackage#getField_Entity()
	 * @see logmodel.Entity#getEntityField
	 * @model opposite="entityField" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link logmodel.Field#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logmodel.Include#getIncludeFields <em>Include Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' container reference.
	 * @see #setInclude(Include)
	 * @see logmodel.LogmodelPackage#getField_Include()
	 * @see logmodel.Include#getIncludeFields
	 * @model opposite="includeFields" transient="false"
	 * @generated
	 */
	Include getInclude();

	/**
	 * Sets the value of the '{@link logmodel.Field#getInclude <em>Include</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' container reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(Include value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see logmodel.LogmodelPackage#getField_Length()
	 * @model default="1"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link logmodel.Field#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see logmodel.LogmodelPackage#getField_Precision()
	 * @model
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link logmodel.Field#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see logmodel.LogmodelPackage#getField_Scale()
	 * @model
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link logmodel.Field#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Original name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original name</em>' attribute.
	 * @see #setOriginal_name(String)
	 * @see logmodel.LogmodelPackage#getField_Original_name()
	 * @model
	 * @generated
	 */
	String getOriginal_name();

	/**
	 * Sets the value of the '{@link logmodel.Field#getOriginal_name <em>Original name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original name</em>' attribute.
	 * @see #getOriginal_name()
	 * @generated
	 */
	void setOriginal_name(String value);

	/**
	 * Returns the value of the '<em><b>Short describtion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short describtion</em>' attribute.
	 * @see #setShort_describtion(String)
	 * @see logmodel.LogmodelPackage#getField_Short_describtion()
	 * @model
	 * @generated
	 */
	String getShort_describtion();

	/**
	 * Sets the value of the '{@link logmodel.Field#getShort_describtion <em>Short describtion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short describtion</em>' attribute.
	 * @see #getShort_describtion()
	 * @generated
	 */
	void setShort_describtion(String value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see #setDateFormat(String)
	 * @see logmodel.LogmodelPackage#getField_DateFormat()
	 * @model
	 * @generated
	 */
	String getDateFormat();

	/**
	 * Sets the value of the '{@link logmodel.Field#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(String value);

	/**
	 * Returns the value of the '<em><b>Null Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Indicator</em>' attribute.
	 * @see #setNullIndicator(String)
	 * @see logmodel.LogmodelPackage#getField_NullIndicator()
	 * @model
	 * @generated
	 */
	String getNullIndicator();

	/**
	 * Sets the value of the '{@link logmodel.Field#getNullIndicator <em>Null Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Indicator</em>' attribute.
	 * @see #getNullIndicator()
	 * @generated
	 */
	void setNullIndicator(String value);

	/**
	 * Returns the value of the '<em><b>Allow Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Exponent</em>' attribute.
	 * @see #setAllowExponent(boolean)
	 * @see logmodel.LogmodelPackage#getField_AllowExponent()
	 * @model
	 * @generated
	 */
	boolean isAllowExponent();

	/**
	 * Sets the value of the '{@link logmodel.Field#isAllowExponent <em>Allow Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Exponent</em>' attribute.
	 * @see #isAllowExponent()
	 * @generated
	 */
	void setAllowExponent(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Implicit Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Implicit Comma</em>' attribute.
	 * @see #setHasImplicitComma(boolean)
	 * @see logmodel.LogmodelPackage#getField_HasImplicitComma()
	 * @model
	 * @generated
	 */
	boolean isHasImplicitComma();

	/**
	 * Sets the value of the '{@link logmodel.Field#isHasImplicitComma <em>Has Implicit Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Implicit Comma</em>' attribute.
	 * @see #isHasImplicitComma()
	 * @generated
	 */
	void setHasImplicitComma(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Only</em>' attribute.
	 * @see #setInterfaceOnly(boolean)
	 * @see logmodel.LogmodelPackage#getField_InterfaceOnly()
	 * @model
	 * @generated
	 */
	boolean isInterfaceOnly();

	/**
	 * Sets the value of the '{@link logmodel.Field#isInterfaceOnly <em>Interface Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Only</em>' attribute.
	 * @see #isInterfaceOnly()
	 * @generated
	 */
	void setInterfaceOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Table Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Only</em>' attribute.
	 * @see #setTableOnly(boolean)
	 * @see logmodel.LogmodelPackage#getField_TableOnly()
	 * @model
	 * @generated
	 */
	boolean isTableOnly();

	/**
	 * Sets the value of the '{@link logmodel.Field#isTableOnly <em>Table Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Only</em>' attribute.
	 * @see #isTableOnly()
	 * @generated
	 */
	void setTableOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Fast Changing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fast Changing</em>' attribute.
	 * @see #setIsFastChanging(boolean)
	 * @see logmodel.LogmodelPackage#getField_IsFastChanging()
	 * @model
	 * @generated
	 */
	boolean isIsFastChanging();

	/**
	 * Sets the value of the '{@link logmodel.Field#isIsFastChanging <em>Is Fast Changing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fast Changing</em>' attribute.
	 * @see #isIsFastChanging()
	 * @generated
	 */
	void setIsFastChanging(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link type_enum.FieldTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see type_enum.FieldTypes
	 * @see #setType(FieldTypes)
	 * @see logmodel.LogmodelPackage#getField_Type()
	 * @model
	 * @generated
	 */
	FieldTypes getType();

	/**
	 * Sets the value of the '{@link logmodel.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see type_enum.FieldTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(FieldTypes value);

	/**
	 * Returns the value of the '<em><b>Is Business Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Business Key</em>' attribute.
	 * @see #setIsBusinessKey(boolean)
	 * @see logmodel.LogmodelPackage#getField_IsBusinessKey()
	 * @model
	 * @generated
	 */
	boolean isIsBusinessKey();

	/**
	 * Sets the value of the '{@link logmodel.Field#isIsBusinessKey <em>Is Business Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Business Key</em>' attribute.
	 * @see #isIsBusinessKey()
	 * @generated
	 */
	void setIsBusinessKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link techmodel.Table#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see logmodel.LogmodelPackage#getField_Table()
	 * @see techmodel.Table#getFields
	 * @model opposite="fields"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link logmodel.Field#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // Field
