/**
 */
package logmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import logmodel.BusinessTerm;
import logmodel.LogmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Term</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessTermTest extends TestCase {

	/**
	 * The fixture for this Business Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessTerm fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessTermTest.class);
	}

	/**
	 * Constructs a new Business Term test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessTermTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Business Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BusinessTerm fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Business Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessTerm getFixture() {
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
		setFixture(LogmodelFactory.eINSTANCE.createBusinessTerm());
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

} //BusinessTermTest
