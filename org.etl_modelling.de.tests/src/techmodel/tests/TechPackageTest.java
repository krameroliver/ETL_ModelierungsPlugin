/**
 */
package techmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import techmodel.TechPackage;
import techmodel.TechmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tech Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechPackageTest extends TestCase {

	/**
	 * The fixture for this Tech Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechPackage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TechPackageTest.class);
	}

	/**
	 * Constructs a new Tech Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechPackageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tech Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TechPackage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tech Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechPackage getFixture() {
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
		setFixture(TechmodelFactory.eINSTANCE.createTechPackage());
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

} //TechPackageTest
