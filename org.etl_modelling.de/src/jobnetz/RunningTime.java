/**
 */
package jobnetz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Running Time</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see jobnetz.JobnetzPackage#getRunningTime()
 * @model
 * @generated
 */
public enum RunningTime implements Enumerator {
	/**
	 * The '<em><b>Every Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERY_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	EVERY_DAY(0, "EveryDay", "EveryDay"),

	/**
	 * The '<em><b>Working Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	WORKING_DAY(1, "WorkingDay", "WorkingDay"),

	/**
	 * The '<em><b>Weekly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKLY_VALUE
	 * @generated
	 * @ordered
	 */
	WEEKLY(2, "Weekly", "Weekly"),

	/**
	 * The '<em><b>Monthly Ultimo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHLY_ULTIMO_VALUE
	 * @generated
	 * @ordered
	 */
	MONTHLY_ULTIMO(3, "MonthlyUltimo", "MonthlyUltimo");

	/**
	 * The '<em><b>Every Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERY_DAY
	 * @model name="EveryDay"
	 * @generated
	 * @ordered
	 */
	public static final int EVERY_DAY_VALUE = 0;

	/**
	 * The '<em><b>Working Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_DAY
	 * @model name="WorkingDay"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING_DAY_VALUE = 1;

	/**
	 * The '<em><b>Weekly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKLY
	 * @model name="Weekly"
	 * @generated
	 * @ordered
	 */
	public static final int WEEKLY_VALUE = 2;

	/**
	 * The '<em><b>Monthly Ultimo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTHLY_ULTIMO
	 * @model name="MonthlyUltimo"
	 * @generated
	 * @ordered
	 */
	public static final int MONTHLY_ULTIMO_VALUE = 3;

	/**
	 * An array of all the '<em><b>Running Time</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RunningTime[] VALUES_ARRAY =
		new RunningTime[] {
			EVERY_DAY,
			WORKING_DAY,
			WEEKLY,
			MONTHLY_ULTIMO,
		};

	/**
	 * A public read-only list of all the '<em><b>Running Time</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RunningTime> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Running Time</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RunningTime get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RunningTime result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Running Time</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RunningTime getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RunningTime result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Running Time</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RunningTime get(int value) {
		switch (value) {
			case EVERY_DAY_VALUE: return EVERY_DAY;
			case WORKING_DAY_VALUE: return WORKING_DAY;
			case WEEKLY_VALUE: return WEEKLY;
			case MONTHLY_ULTIMO_VALUE: return MONTHLY_ULTIMO;
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
	private RunningTime(int value, String name, String literal) {
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
	
} //RunningTime
