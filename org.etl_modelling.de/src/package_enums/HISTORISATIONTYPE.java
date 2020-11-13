/**
 */
package package_enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HISTORISATIONTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see package_enums.Package_enumsPackage#getHISTORISATIONTYPE()
 * @model
 * @generated
 */
public enum HISTORISATIONTYPE implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>DAY PARTITIONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_PARTITIONED_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_PARTITIONED(1, "DAY_PARTITIONED", "DAY_PARTITIONED"),

	/**
	 * The '<em><b>MONTH PARTITIONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_PARTITIONED_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH_PARTITIONED(2, "MONTH_PARTITIONED", "MONTH_PARTITIONED"),

	/**
	 * The '<em><b>BITEMPORAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITEMPORAL_VALUE
	 * @generated
	 * @ordered
	 */
	BITEMPORAL(3, "BITEMPORAL", "BITEMPORAL");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>DAY PARTITIONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_PARTITIONED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAY_PARTITIONED_VALUE = 1;

	/**
	 * The '<em><b>MONTH PARTITIONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_PARTITIONED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_PARTITIONED_VALUE = 2;

	/**
	 * The '<em><b>BITEMPORAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITEMPORAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BITEMPORAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>HISTORISATIONTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HISTORISATIONTYPE[] VALUES_ARRAY =
		new HISTORISATIONTYPE[] {
			NONE,
			DAY_PARTITIONED,
			MONTH_PARTITIONED,
			BITEMPORAL,
		};

	/**
	 * A public read-only list of all the '<em><b>HISTORISATIONTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HISTORISATIONTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HISTORISATIONTYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HISTORISATIONTYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HISTORISATIONTYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HISTORISATIONTYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HISTORISATIONTYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HISTORISATIONTYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HISTORISATIONTYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HISTORISATIONTYPE get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case DAY_PARTITIONED_VALUE: return DAY_PARTITIONED;
			case MONTH_PARTITIONED_VALUE: return MONTH_PARTITIONED;
			case BITEMPORAL_VALUE: return BITEMPORAL;
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
	private HISTORISATIONTYPE(int value, String name, String literal) {
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
	
} //HISTORISATIONTYPE
