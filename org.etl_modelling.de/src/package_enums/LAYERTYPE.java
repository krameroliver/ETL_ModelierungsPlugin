/**
 */
package package_enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LAYERTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see package_enums.Package_enumsPackage#getLAYERTYPE()
 * @model
 * @generated
 */
public enum LAYERTYPE implements Enumerator {
	/**
	 * The '<em><b>STAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STAGE(0, "STAGE", "STAGE"),

	/**
	 * The '<em><b>INTEGRATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATION(1, "INTEGRATION", "INTEGRATION"),

	/**
	 * The '<em><b>EXPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPORT(2, "EXPORT", "EXPORT"),

	/**
	 * The '<em><b>REPORTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTING_VALUE
	 * @generated
	 * @ordered
	 */
	REPORTING(3, "REPORTING", "REPORTING"),

	/**
	 * The '<em><b>HARMONISATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONISATION_VALUE
	 * @generated
	 * @ordered
	 */
	HARMONISATION(4, "HARMONISATION", "HARMONISATION");

	/**
	 * The '<em><b>STAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STAGE_VALUE = 0;

	/**
	 * The '<em><b>INTEGRATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATION_VALUE = 1;

	/**
	 * The '<em><b>EXPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPORT_VALUE = 2;

	/**
	 * The '<em><b>REPORTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPORTING_VALUE = 3;

	/**
	 * The '<em><b>HARMONISATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARMONISATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HARMONISATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>LAYERTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LAYERTYPE[] VALUES_ARRAY =
		new LAYERTYPE[] {
			STAGE,
			INTEGRATION,
			EXPORT,
			REPORTING,
			HARMONISATION,
		};

	/**
	 * A public read-only list of all the '<em><b>LAYERTYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LAYERTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>LAYERTYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LAYERTYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LAYERTYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LAYERTYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LAYERTYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LAYERTYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LAYERTYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LAYERTYPE get(int value) {
		switch (value) {
			case STAGE_VALUE: return STAGE;
			case INTEGRATION_VALUE: return INTEGRATION;
			case EXPORT_VALUE: return EXPORT;
			case REPORTING_VALUE: return REPORTING;
			case HARMONISATION_VALUE: return HARMONISATION;
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
	private LAYERTYPE(int value, String name, String literal) {
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
	
} //LAYERTYPE
