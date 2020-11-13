/**
 */
package logmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import logmodel.CommonMapping;
import logmodel.LogmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Common Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonMappingTest extends TestCase {

	/**
	 * The fixture for this Common Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonMapping fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommonMappingTest.class);
	}

	/**
	 * Constructs a new Common Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonMappingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Common Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CommonMapping fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Common Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonMapping getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LogmodelFactory.eINSTANCE.createCommonMapping());
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

} //CommonMappingTest
