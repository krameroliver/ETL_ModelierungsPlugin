/**
 */
package specmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import specmodel.BusinessRule;
import specmodel.SpecmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessRuleTest extends TestCase {

	/**
	 * The fixture for this Business Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessRuleTest.class);
	}

	/**
	 * Constructs a new Business Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Business Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BusinessRule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Business Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRule getFixture() {
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
		setFixture(SpecmodelFactory.eINSTANCE.createBusinessRule());
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

} //BusinessRuleTest
