/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.etldsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ETLDslStandaloneSetup extends ETLDslStandaloneSetupGenerated {

	public static void doSetup() {
		new ETLDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
