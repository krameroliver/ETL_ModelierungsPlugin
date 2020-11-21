/**
 */
package type_enum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Field Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see type_enum.Type_enumPackage#getFieldTypes()
 * @model
 * @generated
 */
public enum FieldTypes implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "String", "String"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(1, "Int", "Int"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(2, "Decimal", "Decimal"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(3, "Date", "Date"),

	/**
	 * The '<em><b>Time Stamp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_STAMP(4, "TimeStamp", "TimeStamp"),

	/**
	 * The '<em><b>HK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HK_VALUE
	 * @generated
	 * @ordered
	 */
	HK(5, "HK", "HK"),

	/**
	 * The '<em><b>True False</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE_FALSE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUE_FALSE(6, "TrueFalse", "TrueFalse");

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="Int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 1;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model name="Decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 2;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 3;

	/**
	 * The '<em><b>Time Stamp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_STAMP
	 * @model name="TimeStamp"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_STAMP_VALUE = 4;

	/**
	 * The '<em><b>HK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HK_VALUE = 5;

	/**
	 * The '<em><b>True False</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE_FALSE
	 * @model name="TrueFalse"
	 * @generated
	 * @ordered
	 */
	public static final int TRUE_FALSE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Field Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FieldTypes[] VALUES_ARRAY =
		new FieldTypes[] {
			STRING,
			INT,
			DECIMAL,
			DATE,
			TIME_STAMP,
			HK,
			TRUE_FALSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Field Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FieldTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Field Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FieldTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FieldTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FieldTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FieldTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FieldTypes get(int value) {
		switch (value) {
			case STRING_VALUE: return STRING;
			case INT_VALUE: return INT;
			case DECIMAL_VALUE: return DECIMAL;
			case DATE_VALUE: return DATE;
			case TIME_STAMP_VALUE: return TIME_STAMP;
			case HK_VALUE: return HK;
			case TRUE_FALSE_VALUE: return TRUE_FALSE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FieldTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FieldTypes
