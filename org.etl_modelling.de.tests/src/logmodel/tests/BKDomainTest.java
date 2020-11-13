/**
 */
package logmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import logmodel.BKDomain;
import logmodel.LogmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BK Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BKDomainTest extends TestCase {

	/**
	 * The fixture for this BK Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BKDomain fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BKDomainTest.class);
	}

	/**
	 * Constructs a new BK Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BKDomainTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BK Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BKDomain fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BK Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BKDomain getFixture() {
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
		setFixture(LogmodelFactory.eINSTANCE.createBKDomain());
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

} //BKDomainTest
