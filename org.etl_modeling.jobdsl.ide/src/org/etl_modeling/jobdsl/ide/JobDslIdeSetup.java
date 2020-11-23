/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.jobdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.etl_modeling.jobdsl.JobDslRuntimeModule;
import org.etl_modeling.jobdsl.JobDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class JobDslIdeSetup extends JobDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new JobDslRuntimeModule(), new JobDslIdeModule()));
	}
	
}
