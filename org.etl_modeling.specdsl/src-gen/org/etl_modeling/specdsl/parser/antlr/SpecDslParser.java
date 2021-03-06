/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.specdsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.etl_modeling.specdsl.parser.antlr.internal.InternalSpecDslParser;
import org.etl_modeling.specdsl.services.SpecDslGrammarAccess;

public class SpecDslParser extends AbstractAntlrParser {

	@Inject
	private SpecDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSpecDslParser createParser(XtextTokenStream stream) {
		return new InternalSpecDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SpecPackage";
	}

	public SpecDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SpecDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
