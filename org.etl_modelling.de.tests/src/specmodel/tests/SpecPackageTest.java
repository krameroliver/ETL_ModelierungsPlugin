/**
 */
package specmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import specmodel.SpecPackage;
import specmodel.SpecmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spec Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecPackageTest extends TestCase {

	/**
	 * The fixture for this Spec Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecPackage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpecPackageTest.class);
	}

	/**
	 * Constructs a new Spec Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecPackageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Spec Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SpecPackage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Spec Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecPackage getFixture() {
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
		setFixture(SpecmodelFactory.eINSTANCE.createSpecPackage());
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

} //SpecPackageTest
