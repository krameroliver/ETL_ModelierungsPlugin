/**
 */
package specmodel.tests;

import junit.textui.TestRunner;

import logmodel.tests.FieldTest;

import specmodel.JoinField;
import specmodel.SpecmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Join Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinFieldTest extends FieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JoinFieldTest.class);
	}

	/**
	 * Constructs a new Join Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Join Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JoinField getFixture() {
		return (JoinField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpecmodelFactory.eINSTANCE.createJoinField());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //JoinFieldTest
