/**
 */
package package_enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>REPRESENTATIONS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see package_enums.Package_enumsPackage#getREPRESENTATIONS()
 * @model
 * @generated
 */
public enum REPRESENTATIONS implements Enumerator {
	/**
	 * The '<em><b>FLAT TABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT_TABLE(0, "FLAT_TABLE", "FLAT_TABLE"),

	/**
	 * The '<em><b>DATAVAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAVAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DATAVAULT(1, "DATAVAULT", "DATAVAULT"),

	/**
	 * The '<em><b>Third NF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_NF_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_NF(2, "ThirdNF", "ThirdNF"),

	/**
	 * The '<em><b>SNOWFLAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNOWFLAKE_VALUE
	 * @generated
	 * @ordered
	 */
	SNOWFLAKE(3, "SNOWFLAKE", "SNOWFLAKE"),

	/**
	 * The '<em><b>STAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAR_VALUE
	 * @generated
	 * @ordered
	 */
	STAR(4, "STAR", "STAR");

	/**
	 * The '<em><b>FLAT TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_TABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_TABLE_VALUE = 0;

	/**
	 * The '<em><b>DATAVAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATAVAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATAVAULT_VALUE = 1;

	/**
	 * The '<em><b>Third NF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_NF
	 * @model name="ThirdNF"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_NF_VALUE = 2;

	/**
	 * The '<em><b>SNOWFLAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNOWFLAKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNOWFLAKE_VALUE = 3;

	/**
	 * The '<em><b>STAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STAR_VALUE = 4;

	/**
	 * An array of all the '<em><b>REPRESENTATIONS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final REPRESENTATIONS[] VALUES_ARRAY =
		new REPRESENTATIONS[] {
			FLAT_TABLE,
			DATAVAULT,
			THIRD_NF,
			SNOWFLAKE,
			STAR,
		};

	/**
	 * A public read-only list of all the '<em><b>REPRESENTATIONS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<REPRESENTATIONS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>REPRESENTATIONS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static REPRESENTATIONS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			REPRESENTATIONS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>REPRESENTATIONS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static REPRESENTATIONS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			REPRESENTATIONS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>REPRESENTATIONS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static REPRESENTATIONS get(int value) {
		switch (value) {
			case FLAT_TABLE_VALUE: return FLAT_TABLE;
			case DATAVAULT_VALUE: return DATAVAULT;
			case THIRD_NF_VALUE: return THIRD_NF;
			case SNOWFLAKE_VALUE: return SNOWFLAKE;
			case STAR_VALUE: return STAR;
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
	private REPRESENTATIONS(int value, String name, String literal) {
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
	
} //REPRESENTATIONS
