/**
 */
package specmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import specmodel.Dedup;
import specmodel.SpecmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dedup</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DedupTest extends TestCase {

	/**
	 * The fixture for this Dedup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dedup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DedupTest.class);
	}

	/**
	 * Constructs a new Dedup test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DedupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dedup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dedup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dedup test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dedup getFixture() {
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
		setFixture(SpecmodelFactory.eINSTANCE.createDedup());
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

} //DedupTest
