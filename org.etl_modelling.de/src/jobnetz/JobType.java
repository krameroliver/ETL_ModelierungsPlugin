/**
 */
package jobnetz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Job Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jobnetz.JobnetzPackage#getJobType()
 * @model
 * @generated
 */
public enum JobType implements Enumerator {
	/**
	 * The '<em><b>Trigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER(0, "Trigger", "Trigger"),

	/**
	 * The '<em><b>Import</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPORT(1, "Import", "Import"),

	/**
	 * The '<em><b>Integration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATION(2, "Integration", "Integration"),

	/**
	 * The '<em><b>I2I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2I_VALUE
	 * @generated
	 * @ordered
	 */
	I2I(3, "I2I", "I2I"),

	/**
	 * The '<em><b>Export</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPORT(4, "Export", "Export"),

	/**
	 * The '<em><b>Processig Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSIG_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSIG_POINT(5, "ProcessigPoint", "ProcessigPoint");

	/**
	 * The '<em><b>Trigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER
	 * @model name="Trigger"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_VALUE = 0;

	/**
	 * The '<em><b>Import</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORT
	 * @model name="Import"
	 * @generated
	 * @ordered
	 */
	public static final int IMPORT_VALUE = 1;

	/**
	 * The '<em><b>Integration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATION
	 * @model name="Integration"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATION_VALUE = 2;

	/**
	 * The '<em><b>I2I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2I
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I2I_VALUE = 3;

	/**
	 * The '<em><b>Export</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORT
	 * @model name="Export"
	 * @generated
	 * @ordered
	 */
	public static final int EXPORT_VALUE = 4;

	/**
	 * The '<em><b>Processig Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSIG_POINT
	 * @model name="ProcessigPoint"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSIG_POINT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Job Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JobType[] VALUES_ARRAY =
		new JobType[] {
			TRIGGER,
			IMPORT,
			INTEGRATION,
			I2I,
			EXPORT,
			PROCESSIG_POINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Job Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JobType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Job Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JobType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JobType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JobType get(int value) {
		switch (value) {
			case TRIGGER_VALUE: return TRIGGER;
			case IMPORT_VALUE: return IMPORT;
			case INTEGRATION_VALUE: return INTEGRATION;
			case I2I_VALUE: return I2I;
			case EXPORT_VALUE: return EXPORT;
			case PROCESSIG_POINT_VALUE: return PROCESSIG_POINT;
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
	private JobType(int value, String name, String literal) {
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
	
} //JobType
