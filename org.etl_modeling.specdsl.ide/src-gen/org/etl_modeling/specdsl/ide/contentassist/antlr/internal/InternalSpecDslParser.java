package org.etl_modeling.specdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.etl_modeling.specdsl.services.SpecDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aggregation'", "'Dedup'", "'Filter'", "'MultiFire'", "'SingleFire'", "'LEFT'", "'RIGHT'", "'INNER'", "'FULL_OUTER'", "'SpecPackage'", "'Specification'", "'{'", "'target'", "'}'", "'.'", "'RuleType'", "'BusinessRule'", "'targetEntity'", "'targetRelationship'", "'targetIncludeSatelit'", "'PrimarySource'", "'alias'", "'childSources'", "'['", "']'", "'VectoryKeys'", "','", "'JoinViaLink'", "'JoinComment'", "'PrimaryJoinFields'", "'SecondaryJoinField'", "'JoinType'", "'mandatory'", "'isMultiplying'", "'Vector'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSpecDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpecDsl.g"; }


    	private SpecDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SpecDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSpecPackage"
    // InternalSpecDsl.g:53:1: entryRuleSpecPackage : ruleSpecPackage EOF ;
    public final void entryRuleSpecPackage() throws RecognitionException {
        try {
            // InternalSpecDsl.g:54:1: ( ruleSpecPackage EOF )
            // InternalSpecDsl.g:55:1: ruleSpecPackage EOF
            {
             before(grammarAccess.getSpecPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecPackage();

            state._fsp--;

             after(grammarAccess.getSpecPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecPackage"


    // $ANTLR start "ruleSpecPackage"
    // InternalSpecDsl.g:62:1: ruleSpecPackage : ( ( rule__SpecPackage__Group__0 ) ) ;
    public final void ruleSpecPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:66:2: ( ( ( rule__SpecPackage__Group__0 ) ) )
            // InternalSpecDsl.g:67:2: ( ( rule__SpecPackage__Group__0 ) )
            {
            // InternalSpecDsl.g:67:2: ( ( rule__SpecPackage__Group__0 ) )
            // InternalSpecDsl.g:68:3: ( rule__SpecPackage__Group__0 )
            {
             before(grammarAccess.getSpecPackageAccess().getGroup()); 
            // InternalSpecDsl.g:69:3: ( rule__SpecPackage__Group__0 )
            // InternalSpecDsl.g:69:4: rule__SpecPackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpecPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecPackage"


    // $ANTLR start "entryRuleSpecification"
    // InternalSpecDsl.g:78:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalSpecDsl.g:79:1: ( ruleSpecification EOF )
            // InternalSpecDsl.g:80:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSpecDsl.g:87:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:91:2: ( ( ( rule__Specification__Group__0 ) ) )
            // InternalSpecDsl.g:92:2: ( ( rule__Specification__Group__0 ) )
            {
            // InternalSpecDsl.g:92:2: ( ( rule__Specification__Group__0 ) )
            // InternalSpecDsl.g:93:3: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // InternalSpecDsl.g:94:3: ( rule__Specification__Group__0 )
            // InternalSpecDsl.g:94:4: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleEString"
    // InternalSpecDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSpecDsl.g:104:1: ( ruleEString EOF )
            // InternalSpecDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSpecDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSpecDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSpecDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSpecDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSpecDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalSpecDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSpecDsl.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSpecDsl.g:129:1: ( ruleQualifiedName EOF )
            // InternalSpecDsl.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSpecDsl.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSpecDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSpecDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSpecDsl.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSpecDsl.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalSpecDsl.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBusinessRule"
    // InternalSpecDsl.g:153:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // InternalSpecDsl.g:154:1: ( ruleBusinessRule EOF )
            // InternalSpecDsl.g:155:1: ruleBusinessRule EOF
            {
             before(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleBusinessRule();

            state._fsp--;

             after(grammarAccess.getBusinessRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // InternalSpecDsl.g:162:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:166:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // InternalSpecDsl.g:167:2: ( ( rule__BusinessRule__Group__0 ) )
            {
            // InternalSpecDsl.g:167:2: ( ( rule__BusinessRule__Group__0 ) )
            // InternalSpecDsl.g:168:3: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // InternalSpecDsl.g:169:3: ( rule__BusinessRule__Group__0 )
            // InternalSpecDsl.g:169:4: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRulePrimarySource"
    // InternalSpecDsl.g:178:1: entryRulePrimarySource : rulePrimarySource EOF ;
    public final void entryRulePrimarySource() throws RecognitionException {
        try {
            // InternalSpecDsl.g:179:1: ( rulePrimarySource EOF )
            // InternalSpecDsl.g:180:1: rulePrimarySource EOF
            {
             before(grammarAccess.getPrimarySourceRule()); 
            pushFollow(FOLLOW_1);
            rulePrimarySource();

            state._fsp--;

             after(grammarAccess.getPrimarySourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimarySource"


    // $ANTLR start "rulePrimarySource"
    // InternalSpecDsl.g:187:1: rulePrimarySource : ( ( rule__PrimarySource__Group__0 ) ) ;
    public final void rulePrimarySource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:191:2: ( ( ( rule__PrimarySource__Group__0 ) ) )
            // InternalSpecDsl.g:192:2: ( ( rule__PrimarySource__Group__0 ) )
            {
            // InternalSpecDsl.g:192:2: ( ( rule__PrimarySource__Group__0 ) )
            // InternalSpecDsl.g:193:3: ( rule__PrimarySource__Group__0 )
            {
             before(grammarAccess.getPrimarySourceAccess().getGroup()); 
            // InternalSpecDsl.g:194:3: ( rule__PrimarySource__Group__0 )
            // InternalSpecDsl.g:194:4: rule__PrimarySource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimarySourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimarySource"


    // $ANTLR start "entryRuleSource"
    // InternalSpecDsl.g:203:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalSpecDsl.g:204:1: ( ruleSource EOF )
            // InternalSpecDsl.g:205:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalSpecDsl.g:212:1: ruleSource : ( ( rule__Source__Group__0 ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:216:2: ( ( ( rule__Source__Group__0 ) ) )
            // InternalSpecDsl.g:217:2: ( ( rule__Source__Group__0 ) )
            {
            // InternalSpecDsl.g:217:2: ( ( rule__Source__Group__0 ) )
            // InternalSpecDsl.g:218:3: ( rule__Source__Group__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup()); 
            // InternalSpecDsl.g:219:3: ( rule__Source__Group__0 )
            // InternalSpecDsl.g:219:4: rule__Source__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleVectorKey"
    // InternalSpecDsl.g:228:1: entryRuleVectorKey : ruleVectorKey EOF ;
    public final void entryRuleVectorKey() throws RecognitionException {
        try {
            // InternalSpecDsl.g:229:1: ( ruleVectorKey EOF )
            // InternalSpecDsl.g:230:1: ruleVectorKey EOF
            {
             before(grammarAccess.getVectorKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleVectorKey();

            state._fsp--;

             after(grammarAccess.getVectorKeyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVectorKey"


    // $ANTLR start "ruleVectorKey"
    // InternalSpecDsl.g:237:1: ruleVectorKey : ( ( rule__VectorKey__VkFieldAssignment ) ) ;
    public final void ruleVectorKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:241:2: ( ( ( rule__VectorKey__VkFieldAssignment ) ) )
            // InternalSpecDsl.g:242:2: ( ( rule__VectorKey__VkFieldAssignment ) )
            {
            // InternalSpecDsl.g:242:2: ( ( rule__VectorKey__VkFieldAssignment ) )
            // InternalSpecDsl.g:243:3: ( rule__VectorKey__VkFieldAssignment )
            {
             before(grammarAccess.getVectorKeyAccess().getVkFieldAssignment()); 
            // InternalSpecDsl.g:244:3: ( rule__VectorKey__VkFieldAssignment )
            // InternalSpecDsl.g:244:4: rule__VectorKey__VkFieldAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VectorKey__VkFieldAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVectorKeyAccess().getVkFieldAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVectorKey"


    // $ANTLR start "entryRuleJoinField"
    // InternalSpecDsl.g:253:1: entryRuleJoinField : ruleJoinField EOF ;
    public final void entryRuleJoinField() throws RecognitionException {
        try {
            // InternalSpecDsl.g:254:1: ( ruleJoinField EOF )
            // InternalSpecDsl.g:255:1: ruleJoinField EOF
            {
             before(grammarAccess.getJoinFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleJoinField();

            state._fsp--;

             after(grammarAccess.getJoinFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoinField"


    // $ANTLR start "ruleJoinField"
    // InternalSpecDsl.g:262:1: ruleJoinField : ( ( rule__JoinField__FieldAssignment ) ) ;
    public final void ruleJoinField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:266:2: ( ( ( rule__JoinField__FieldAssignment ) ) )
            // InternalSpecDsl.g:267:2: ( ( rule__JoinField__FieldAssignment ) )
            {
            // InternalSpecDsl.g:267:2: ( ( rule__JoinField__FieldAssignment ) )
            // InternalSpecDsl.g:268:3: ( rule__JoinField__FieldAssignment )
            {
             before(grammarAccess.getJoinFieldAccess().getFieldAssignment()); 
            // InternalSpecDsl.g:269:3: ( rule__JoinField__FieldAssignment )
            // InternalSpecDsl.g:269:4: rule__JoinField__FieldAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JoinField__FieldAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJoinFieldAccess().getFieldAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoinField"


    // $ANTLR start "ruleRuleType"
    // InternalSpecDsl.g:278:1: ruleRuleType : ( ( rule__RuleType__Alternatives ) ) ;
    public final void ruleRuleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:282:1: ( ( ( rule__RuleType__Alternatives ) ) )
            // InternalSpecDsl.g:283:2: ( ( rule__RuleType__Alternatives ) )
            {
            // InternalSpecDsl.g:283:2: ( ( rule__RuleType__Alternatives ) )
            // InternalSpecDsl.g:284:3: ( rule__RuleType__Alternatives )
            {
             before(grammarAccess.getRuleTypeAccess().getAlternatives()); 
            // InternalSpecDsl.g:285:3: ( rule__RuleType__Alternatives )
            // InternalSpecDsl.g:285:4: rule__RuleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "ruleJoinType"
    // InternalSpecDsl.g:294:1: ruleJoinType : ( ( rule__JoinType__Alternatives ) ) ;
    public final void ruleJoinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:298:1: ( ( ( rule__JoinType__Alternatives ) ) )
            // InternalSpecDsl.g:299:2: ( ( rule__JoinType__Alternatives ) )
            {
            // InternalSpecDsl.g:299:2: ( ( rule__JoinType__Alternatives ) )
            // InternalSpecDsl.g:300:3: ( rule__JoinType__Alternatives )
            {
             before(grammarAccess.getJoinTypeAccess().getAlternatives()); 
            // InternalSpecDsl.g:301:3: ( rule__JoinType__Alternatives )
            // InternalSpecDsl.g:301:4: rule__JoinType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JoinType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJoinTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoinType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSpecDsl.g:309:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:313:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpecDsl.g:314:2: ( RULE_STRING )
                    {
                    // InternalSpecDsl.g:314:2: ( RULE_STRING )
                    // InternalSpecDsl.g:315:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:320:2: ( RULE_ID )
                    {
                    // InternalSpecDsl.g:320:2: ( RULE_ID )
                    // InternalSpecDsl.g:321:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__BusinessRule__Alternatives_5"
    // InternalSpecDsl.g:330:1: rule__BusinessRule__Alternatives_5 : ( ( ( rule__BusinessRule__Group_5_0__0 ) ) | ( ( rule__BusinessRule__Group_5_1__0 ) ) | ( ( rule__BusinessRule__Group_5_2__0 ) ) );
    public final void rule__BusinessRule__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:334:1: ( ( ( rule__BusinessRule__Group_5_0__0 ) ) | ( ( rule__BusinessRule__Group_5_1__0 ) ) | ( ( rule__BusinessRule__Group_5_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSpecDsl.g:335:2: ( ( rule__BusinessRule__Group_5_0__0 ) )
                    {
                    // InternalSpecDsl.g:335:2: ( ( rule__BusinessRule__Group_5_0__0 ) )
                    // InternalSpecDsl.g:336:3: ( rule__BusinessRule__Group_5_0__0 )
                    {
                     before(grammarAccess.getBusinessRuleAccess().getGroup_5_0()); 
                    // InternalSpecDsl.g:337:3: ( rule__BusinessRule__Group_5_0__0 )
                    // InternalSpecDsl.g:337:4: rule__BusinessRule__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BusinessRule__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBusinessRuleAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:341:2: ( ( rule__BusinessRule__Group_5_1__0 ) )
                    {
                    // InternalSpecDsl.g:341:2: ( ( rule__BusinessRule__Group_5_1__0 ) )
                    // InternalSpecDsl.g:342:3: ( rule__BusinessRule__Group_5_1__0 )
                    {
                     before(grammarAccess.getBusinessRuleAccess().getGroup_5_1()); 
                    // InternalSpecDsl.g:343:3: ( rule__BusinessRule__Group_5_1__0 )
                    // InternalSpecDsl.g:343:4: rule__BusinessRule__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BusinessRule__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBusinessRuleAccess().getGroup_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpecDsl.g:347:2: ( ( rule__BusinessRule__Group_5_2__0 ) )
                    {
                    // InternalSpecDsl.g:347:2: ( ( rule__BusinessRule__Group_5_2__0 ) )
                    // InternalSpecDsl.g:348:3: ( rule__BusinessRule__Group_5_2__0 )
                    {
                     before(grammarAccess.getBusinessRuleAccess().getGroup_5_2()); 
                    // InternalSpecDsl.g:349:3: ( rule__BusinessRule__Group_5_2__0 )
                    // InternalSpecDsl.g:349:4: rule__BusinessRule__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BusinessRule__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBusinessRuleAccess().getGroup_5_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Alternatives_5"


    // $ANTLR start "rule__RuleType__Alternatives"
    // InternalSpecDsl.g:357:1: rule__RuleType__Alternatives : ( ( ( 'Aggregation' ) ) | ( ( 'Dedup' ) ) | ( ( 'Filter' ) ) | ( ( 'MultiFire' ) ) | ( ( 'SingleFire' ) ) );
    public final void rule__RuleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:361:1: ( ( ( 'Aggregation' ) ) | ( ( 'Dedup' ) ) | ( ( 'Filter' ) ) | ( ( 'MultiFire' ) ) | ( ( 'SingleFire' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpecDsl.g:362:2: ( ( 'Aggregation' ) )
                    {
                    // InternalSpecDsl.g:362:2: ( ( 'Aggregation' ) )
                    // InternalSpecDsl.g:363:3: ( 'Aggregation' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getAggregationEnumLiteralDeclaration_0()); 
                    // InternalSpecDsl.g:364:3: ( 'Aggregation' )
                    // InternalSpecDsl.g:364:4: 'Aggregation'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getAggregationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:368:2: ( ( 'Dedup' ) )
                    {
                    // InternalSpecDsl.g:368:2: ( ( 'Dedup' ) )
                    // InternalSpecDsl.g:369:3: ( 'Dedup' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getDedupEnumLiteralDeclaration_1()); 
                    // InternalSpecDsl.g:370:3: ( 'Dedup' )
                    // InternalSpecDsl.g:370:4: 'Dedup'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getDedupEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpecDsl.g:374:2: ( ( 'Filter' ) )
                    {
                    // InternalSpecDsl.g:374:2: ( ( 'Filter' ) )
                    // InternalSpecDsl.g:375:3: ( 'Filter' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getFilterEnumLiteralDeclaration_2()); 
                    // InternalSpecDsl.g:376:3: ( 'Filter' )
                    // InternalSpecDsl.g:376:4: 'Filter'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getFilterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpecDsl.g:380:2: ( ( 'MultiFire' ) )
                    {
                    // InternalSpecDsl.g:380:2: ( ( 'MultiFire' ) )
                    // InternalSpecDsl.g:381:3: ( 'MultiFire' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getMultiFireEnumLiteralDeclaration_3()); 
                    // InternalSpecDsl.g:382:3: ( 'MultiFire' )
                    // InternalSpecDsl.g:382:4: 'MultiFire'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getMultiFireEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpecDsl.g:386:2: ( ( 'SingleFire' ) )
                    {
                    // InternalSpecDsl.g:386:2: ( ( 'SingleFire' ) )
                    // InternalSpecDsl.g:387:3: ( 'SingleFire' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getSingleFireEnumLiteralDeclaration_4()); 
                    // InternalSpecDsl.g:388:3: ( 'SingleFire' )
                    // InternalSpecDsl.g:388:4: 'SingleFire'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getSingleFireEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleType__Alternatives"


    // $ANTLR start "rule__JoinType__Alternatives"
    // InternalSpecDsl.g:396:1: rule__JoinType__Alternatives : ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'INNER' ) ) | ( ( 'FULL_OUTER' ) ) );
    public final void rule__JoinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:400:1: ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'INNER' ) ) | ( ( 'FULL_OUTER' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpecDsl.g:401:2: ( ( 'LEFT' ) )
                    {
                    // InternalSpecDsl.g:401:2: ( ( 'LEFT' ) )
                    // InternalSpecDsl.g:402:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalSpecDsl.g:403:3: ( 'LEFT' )
                    // InternalSpecDsl.g:403:4: 'LEFT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:407:2: ( ( 'RIGHT' ) )
                    {
                    // InternalSpecDsl.g:407:2: ( ( 'RIGHT' ) )
                    // InternalSpecDsl.g:408:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalSpecDsl.g:409:3: ( 'RIGHT' )
                    // InternalSpecDsl.g:409:4: 'RIGHT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpecDsl.g:413:2: ( ( 'INNER' ) )
                    {
                    // InternalSpecDsl.g:413:2: ( ( 'INNER' ) )
                    // InternalSpecDsl.g:414:3: ( 'INNER' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getINNEREnumLiteralDeclaration_2()); 
                    // InternalSpecDsl.g:415:3: ( 'INNER' )
                    // InternalSpecDsl.g:415:4: 'INNER'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getINNEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpecDsl.g:419:2: ( ( 'FULL_OUTER' ) )
                    {
                    // InternalSpecDsl.g:419:2: ( ( 'FULL_OUTER' ) )
                    // InternalSpecDsl.g:420:3: ( 'FULL_OUTER' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getFULL_OUTEREnumLiteralDeclaration_3()); 
                    // InternalSpecDsl.g:421:3: ( 'FULL_OUTER' )
                    // InternalSpecDsl.g:421:4: 'FULL_OUTER'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getFULL_OUTEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinType__Alternatives"


    // $ANTLR start "rule__SpecPackage__Group__0"
    // InternalSpecDsl.g:429:1: rule__SpecPackage__Group__0 : rule__SpecPackage__Group__0__Impl rule__SpecPackage__Group__1 ;
    public final void rule__SpecPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:433:1: ( rule__SpecPackage__Group__0__Impl rule__SpecPackage__Group__1 )
            // InternalSpecDsl.g:434:2: rule__SpecPackage__Group__0__Impl rule__SpecPackage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SpecPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__0"


    // $ANTLR start "rule__SpecPackage__Group__0__Impl"
    // InternalSpecDsl.g:441:1: rule__SpecPackage__Group__0__Impl : ( () ) ;
    public final void rule__SpecPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:445:1: ( ( () ) )
            // InternalSpecDsl.g:446:1: ( () )
            {
            // InternalSpecDsl.g:446:1: ( () )
            // InternalSpecDsl.g:447:2: ()
            {
             before(grammarAccess.getSpecPackageAccess().getSpecPackageAction_0()); 
            // InternalSpecDsl.g:448:2: ()
            // InternalSpecDsl.g:448:3: 
            {
            }

             after(grammarAccess.getSpecPackageAccess().getSpecPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__0__Impl"


    // $ANTLR start "rule__SpecPackage__Group__1"
    // InternalSpecDsl.g:456:1: rule__SpecPackage__Group__1 : rule__SpecPackage__Group__1__Impl rule__SpecPackage__Group__2 ;
    public final void rule__SpecPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:460:1: ( rule__SpecPackage__Group__1__Impl rule__SpecPackage__Group__2 )
            // InternalSpecDsl.g:461:2: rule__SpecPackage__Group__1__Impl rule__SpecPackage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SpecPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__1"


    // $ANTLR start "rule__SpecPackage__Group__1__Impl"
    // InternalSpecDsl.g:468:1: rule__SpecPackage__Group__1__Impl : ( 'SpecPackage' ) ;
    public final void rule__SpecPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:472:1: ( ( 'SpecPackage' ) )
            // InternalSpecDsl.g:473:1: ( 'SpecPackage' )
            {
            // InternalSpecDsl.g:473:1: ( 'SpecPackage' )
            // InternalSpecDsl.g:474:2: 'SpecPackage'
            {
             before(grammarAccess.getSpecPackageAccess().getSpecPackageKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSpecPackageAccess().getSpecPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__1__Impl"


    // $ANTLR start "rule__SpecPackage__Group__2"
    // InternalSpecDsl.g:483:1: rule__SpecPackage__Group__2 : rule__SpecPackage__Group__2__Impl rule__SpecPackage__Group__3 ;
    public final void rule__SpecPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:487:1: ( rule__SpecPackage__Group__2__Impl rule__SpecPackage__Group__3 )
            // InternalSpecDsl.g:488:2: rule__SpecPackage__Group__2__Impl rule__SpecPackage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SpecPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__2"


    // $ANTLR start "rule__SpecPackage__Group__2__Impl"
    // InternalSpecDsl.g:495:1: rule__SpecPackage__Group__2__Impl : ( ( rule__SpecPackage__NameAssignment_2 ) ) ;
    public final void rule__SpecPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:499:1: ( ( ( rule__SpecPackage__NameAssignment_2 ) ) )
            // InternalSpecDsl.g:500:1: ( ( rule__SpecPackage__NameAssignment_2 ) )
            {
            // InternalSpecDsl.g:500:1: ( ( rule__SpecPackage__NameAssignment_2 ) )
            // InternalSpecDsl.g:501:2: ( rule__SpecPackage__NameAssignment_2 )
            {
             before(grammarAccess.getSpecPackageAccess().getNameAssignment_2()); 
            // InternalSpecDsl.g:502:2: ( rule__SpecPackage__NameAssignment_2 )
            // InternalSpecDsl.g:502:3: rule__SpecPackage__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SpecPackage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpecPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__2__Impl"


    // $ANTLR start "rule__SpecPackage__Group__3"
    // InternalSpecDsl.g:510:1: rule__SpecPackage__Group__3 : rule__SpecPackage__Group__3__Impl ;
    public final void rule__SpecPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:514:1: ( rule__SpecPackage__Group__3__Impl )
            // InternalSpecDsl.g:515:2: rule__SpecPackage__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecPackage__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__3"


    // $ANTLR start "rule__SpecPackage__Group__3__Impl"
    // InternalSpecDsl.g:521:1: rule__SpecPackage__Group__3__Impl : ( ( rule__SpecPackage__SpecificationsAssignment_3 )* ) ;
    public final void rule__SpecPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:525:1: ( ( ( rule__SpecPackage__SpecificationsAssignment_3 )* ) )
            // InternalSpecDsl.g:526:1: ( ( rule__SpecPackage__SpecificationsAssignment_3 )* )
            {
            // InternalSpecDsl.g:526:1: ( ( rule__SpecPackage__SpecificationsAssignment_3 )* )
            // InternalSpecDsl.g:527:2: ( rule__SpecPackage__SpecificationsAssignment_3 )*
            {
             before(grammarAccess.getSpecPackageAccess().getSpecificationsAssignment_3()); 
            // InternalSpecDsl.g:528:2: ( rule__SpecPackage__SpecificationsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSpecDsl.g:528:3: rule__SpecPackage__SpecificationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SpecPackage__SpecificationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSpecPackageAccess().getSpecificationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__Group__3__Impl"


    // $ANTLR start "rule__Specification__Group__0"
    // InternalSpecDsl.g:537:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:541:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalSpecDsl.g:542:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // InternalSpecDsl.g:549:1: rule__Specification__Group__0__Impl : ( 'Specification' ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:553:1: ( ( 'Specification' ) )
            // InternalSpecDsl.g:554:1: ( 'Specification' )
            {
            // InternalSpecDsl.g:554:1: ( 'Specification' )
            // InternalSpecDsl.g:555:2: 'Specification'
            {
             before(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // InternalSpecDsl.g:564:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:568:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalSpecDsl.g:569:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // InternalSpecDsl.g:576:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__NameAssignment_1 ) ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:580:1: ( ( ( rule__Specification__NameAssignment_1 ) ) )
            // InternalSpecDsl.g:581:1: ( ( rule__Specification__NameAssignment_1 ) )
            {
            // InternalSpecDsl.g:581:1: ( ( rule__Specification__NameAssignment_1 ) )
            // InternalSpecDsl.g:582:2: ( rule__Specification__NameAssignment_1 )
            {
             before(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 
            // InternalSpecDsl.g:583:2: ( rule__Specification__NameAssignment_1 )
            // InternalSpecDsl.g:583:3: rule__Specification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Specification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Specification__Group__2"
    // InternalSpecDsl.g:591:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:595:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalSpecDsl.g:596:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Specification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2"


    // $ANTLR start "rule__Specification__Group__2__Impl"
    // InternalSpecDsl.g:603:1: rule__Specification__Group__2__Impl : ( '{' ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:607:1: ( ( '{' ) )
            // InternalSpecDsl.g:608:1: ( '{' )
            {
            // InternalSpecDsl.g:608:1: ( '{' )
            // InternalSpecDsl.g:609:2: '{'
            {
             before(grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__2__Impl"


    // $ANTLR start "rule__Specification__Group__3"
    // InternalSpecDsl.g:618:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl rule__Specification__Group__4 ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:622:1: ( rule__Specification__Group__3__Impl rule__Specification__Group__4 )
            // InternalSpecDsl.g:623:2: rule__Specification__Group__3__Impl rule__Specification__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Specification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__3"


    // $ANTLR start "rule__Specification__Group__3__Impl"
    // InternalSpecDsl.g:630:1: rule__Specification__Group__3__Impl : ( 'target' ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:634:1: ( ( 'target' ) )
            // InternalSpecDsl.g:635:1: ( 'target' )
            {
            // InternalSpecDsl.g:635:1: ( 'target' )
            // InternalSpecDsl.g:636:2: 'target'
            {
             before(grammarAccess.getSpecificationAccess().getTargetKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getTargetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__3__Impl"


    // $ANTLR start "rule__Specification__Group__4"
    // InternalSpecDsl.g:645:1: rule__Specification__Group__4 : rule__Specification__Group__4__Impl rule__Specification__Group__5 ;
    public final void rule__Specification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:649:1: ( rule__Specification__Group__4__Impl rule__Specification__Group__5 )
            // InternalSpecDsl.g:650:2: rule__Specification__Group__4__Impl rule__Specification__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Specification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__4"


    // $ANTLR start "rule__Specification__Group__4__Impl"
    // InternalSpecDsl.g:657:1: rule__Specification__Group__4__Impl : ( ( rule__Specification__BusinessrulesAssignment_4 ) ) ;
    public final void rule__Specification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:661:1: ( ( ( rule__Specification__BusinessrulesAssignment_4 ) ) )
            // InternalSpecDsl.g:662:1: ( ( rule__Specification__BusinessrulesAssignment_4 ) )
            {
            // InternalSpecDsl.g:662:1: ( ( rule__Specification__BusinessrulesAssignment_4 ) )
            // InternalSpecDsl.g:663:2: ( rule__Specification__BusinessrulesAssignment_4 )
            {
             before(grammarAccess.getSpecificationAccess().getBusinessrulesAssignment_4()); 
            // InternalSpecDsl.g:664:2: ( rule__Specification__BusinessrulesAssignment_4 )
            // InternalSpecDsl.g:664:3: rule__Specification__BusinessrulesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Specification__BusinessrulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getBusinessrulesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__4__Impl"


    // $ANTLR start "rule__Specification__Group__5"
    // InternalSpecDsl.g:672:1: rule__Specification__Group__5 : rule__Specification__Group__5__Impl ;
    public final void rule__Specification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:676:1: ( rule__Specification__Group__5__Impl )
            // InternalSpecDsl.g:677:2: rule__Specification__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__5"


    // $ANTLR start "rule__Specification__Group__5__Impl"
    // InternalSpecDsl.g:683:1: rule__Specification__Group__5__Impl : ( '}' ) ;
    public final void rule__Specification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:687:1: ( ( '}' ) )
            // InternalSpecDsl.g:688:1: ( '}' )
            {
            // InternalSpecDsl.g:688:1: ( '}' )
            // InternalSpecDsl.g:689:2: '}'
            {
             before(grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__Group__5__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSpecDsl.g:699:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:703:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSpecDsl.g:704:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSpecDsl.g:711:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:715:1: ( ( RULE_ID ) )
            // InternalSpecDsl.g:716:1: ( RULE_ID )
            {
            // InternalSpecDsl.g:716:1: ( RULE_ID )
            // InternalSpecDsl.g:717:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSpecDsl.g:726:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:730:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSpecDsl.g:731:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSpecDsl.g:737:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:741:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSpecDsl.g:742:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSpecDsl.g:742:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSpecDsl.g:743:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSpecDsl.g:744:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSpecDsl.g:744:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSpecDsl.g:753:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:757:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSpecDsl.g:758:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSpecDsl.g:765:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:769:1: ( ( '.' ) )
            // InternalSpecDsl.g:770:1: ( '.' )
            {
            // InternalSpecDsl.g:770:1: ( '.' )
            // InternalSpecDsl.g:771:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSpecDsl.g:780:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:784:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSpecDsl.g:785:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSpecDsl.g:791:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:795:1: ( ( RULE_ID ) )
            // InternalSpecDsl.g:796:1: ( RULE_ID )
            {
            // InternalSpecDsl.g:796:1: ( RULE_ID )
            // InternalSpecDsl.g:797:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__0"
    // InternalSpecDsl.g:807:1: rule__BusinessRule__Group__0 : rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:811:1: ( rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 )
            // InternalSpecDsl.g:812:2: rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BusinessRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__0"


    // $ANTLR start "rule__BusinessRule__Group__0__Impl"
    // InternalSpecDsl.g:819:1: rule__BusinessRule__Group__0__Impl : ( () ) ;
    public final void rule__BusinessRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:823:1: ( ( () ) )
            // InternalSpecDsl.g:824:1: ( () )
            {
            // InternalSpecDsl.g:824:1: ( () )
            // InternalSpecDsl.g:825:2: ()
            {
             before(grammarAccess.getBusinessRuleAccess().getBusinessRuleAction_0()); 
            // InternalSpecDsl.g:826:2: ()
            // InternalSpecDsl.g:826:3: 
            {
            }

             after(grammarAccess.getBusinessRuleAccess().getBusinessRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group__1"
    // InternalSpecDsl.g:834:1: rule__BusinessRule__Group__1 : rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:838:1: ( rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 )
            // InternalSpecDsl.g:839:2: rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BusinessRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__1"


    // $ANTLR start "rule__BusinessRule__Group__1__Impl"
    // InternalSpecDsl.g:846:1: rule__BusinessRule__Group__1__Impl : ( 'RuleType' ) ;
    public final void rule__BusinessRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:850:1: ( ( 'RuleType' ) )
            // InternalSpecDsl.g:851:1: ( 'RuleType' )
            {
            // InternalSpecDsl.g:851:1: ( 'RuleType' )
            // InternalSpecDsl.g:852:2: 'RuleType'
            {
             before(grammarAccess.getBusinessRuleAccess().getRuleTypeKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBusinessRuleAccess().getRuleTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__2"
    // InternalSpecDsl.g:861:1: rule__BusinessRule__Group__2 : rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:865:1: ( rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 )
            // InternalSpecDsl.g:866:2: rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__BusinessRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__2"


    // $ANTLR start "rule__BusinessRule__Group__2__Impl"
    // InternalSpecDsl.g:873:1: rule__BusinessRule__Group__2__Impl : ( ( rule__BusinessRule__RuleTypeAssignment_2 ) ) ;
    public final void rule__BusinessRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:877:1: ( ( ( rule__BusinessRule__RuleTypeAssignment_2 ) ) )
            // InternalSpecDsl.g:878:1: ( ( rule__BusinessRule__RuleTypeAssignment_2 ) )
            {
            // InternalSpecDsl.g:878:1: ( ( rule__BusinessRule__RuleTypeAssignment_2 ) )
            // InternalSpecDsl.g:879:2: ( rule__BusinessRule__RuleTypeAssignment_2 )
            {
             before(grammarAccess.getBusinessRuleAccess().getRuleTypeAssignment_2()); 
            // InternalSpecDsl.g:880:2: ( rule__BusinessRule__RuleTypeAssignment_2 )
            // InternalSpecDsl.g:880:3: rule__BusinessRule__RuleTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__RuleTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getRuleTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__2__Impl"


    // $ANTLR start "rule__BusinessRule__Group__3"
    // InternalSpecDsl.g:888:1: rule__BusinessRule__Group__3 : rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 ;
    public final void rule__BusinessRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:892:1: ( rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 )
            // InternalSpecDsl.g:893:2: rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__BusinessRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__3"


    // $ANTLR start "rule__BusinessRule__Group__3__Impl"
    // InternalSpecDsl.g:900:1: rule__BusinessRule__Group__3__Impl : ( 'BusinessRule' ) ;
    public final void rule__BusinessRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:904:1: ( ( 'BusinessRule' ) )
            // InternalSpecDsl.g:905:1: ( 'BusinessRule' )
            {
            // InternalSpecDsl.g:905:1: ( 'BusinessRule' )
            // InternalSpecDsl.g:906:2: 'BusinessRule'
            {
             before(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__3__Impl"


    // $ANTLR start "rule__BusinessRule__Group__4"
    // InternalSpecDsl.g:915:1: rule__BusinessRule__Group__4 : rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5 ;
    public final void rule__BusinessRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:919:1: ( rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5 )
            // InternalSpecDsl.g:920:2: rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__BusinessRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__4"


    // $ANTLR start "rule__BusinessRule__Group__4__Impl"
    // InternalSpecDsl.g:927:1: rule__BusinessRule__Group__4__Impl : ( ( rule__BusinessRule__NameAssignment_4 ) ) ;
    public final void rule__BusinessRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:931:1: ( ( ( rule__BusinessRule__NameAssignment_4 ) ) )
            // InternalSpecDsl.g:932:1: ( ( rule__BusinessRule__NameAssignment_4 ) )
            {
            // InternalSpecDsl.g:932:1: ( ( rule__BusinessRule__NameAssignment_4 ) )
            // InternalSpecDsl.g:933:2: ( rule__BusinessRule__NameAssignment_4 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_4()); 
            // InternalSpecDsl.g:934:2: ( rule__BusinessRule__NameAssignment_4 )
            // InternalSpecDsl.g:934:3: rule__BusinessRule__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__4__Impl"


    // $ANTLR start "rule__BusinessRule__Group__5"
    // InternalSpecDsl.g:942:1: rule__BusinessRule__Group__5 : rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6 ;
    public final void rule__BusinessRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:946:1: ( rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6 )
            // InternalSpecDsl.g:947:2: rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__BusinessRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__5"


    // $ANTLR start "rule__BusinessRule__Group__5__Impl"
    // InternalSpecDsl.g:954:1: rule__BusinessRule__Group__5__Impl : ( ( rule__BusinessRule__Alternatives_5 ) ) ;
    public final void rule__BusinessRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:958:1: ( ( ( rule__BusinessRule__Alternatives_5 ) ) )
            // InternalSpecDsl.g:959:1: ( ( rule__BusinessRule__Alternatives_5 ) )
            {
            // InternalSpecDsl.g:959:1: ( ( rule__BusinessRule__Alternatives_5 ) )
            // InternalSpecDsl.g:960:2: ( rule__BusinessRule__Alternatives_5 )
            {
             before(grammarAccess.getBusinessRuleAccess().getAlternatives_5()); 
            // InternalSpecDsl.g:961:2: ( rule__BusinessRule__Alternatives_5 )
            // InternalSpecDsl.g:961:3: rule__BusinessRule__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__5__Impl"


    // $ANTLR start "rule__BusinessRule__Group__6"
    // InternalSpecDsl.g:969:1: rule__BusinessRule__Group__6 : rule__BusinessRule__Group__6__Impl ;
    public final void rule__BusinessRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:973:1: ( rule__BusinessRule__Group__6__Impl )
            // InternalSpecDsl.g:974:2: rule__BusinessRule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__6"


    // $ANTLR start "rule__BusinessRule__Group__6__Impl"
    // InternalSpecDsl.g:980:1: rule__BusinessRule__Group__6__Impl : ( ( rule__BusinessRule__SourcesAssignment_6 )* ) ;
    public final void rule__BusinessRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:984:1: ( ( ( rule__BusinessRule__SourcesAssignment_6 )* ) )
            // InternalSpecDsl.g:985:1: ( ( rule__BusinessRule__SourcesAssignment_6 )* )
            {
            // InternalSpecDsl.g:985:1: ( ( rule__BusinessRule__SourcesAssignment_6 )* )
            // InternalSpecDsl.g:986:2: ( rule__BusinessRule__SourcesAssignment_6 )*
            {
             before(grammarAccess.getBusinessRuleAccess().getSourcesAssignment_6()); 
            // InternalSpecDsl.g:987:2: ( rule__BusinessRule__SourcesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpecDsl.g:987:3: rule__BusinessRule__SourcesAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BusinessRule__SourcesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBusinessRuleAccess().getSourcesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__6__Impl"


    // $ANTLR start "rule__BusinessRule__Group_5_0__0"
    // InternalSpecDsl.g:996:1: rule__BusinessRule__Group_5_0__0 : rule__BusinessRule__Group_5_0__0__Impl rule__BusinessRule__Group_5_0__1 ;
    public final void rule__BusinessRule__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1000:1: ( rule__BusinessRule__Group_5_0__0__Impl rule__BusinessRule__Group_5_0__1 )
            // InternalSpecDsl.g:1001:2: rule__BusinessRule__Group_5_0__0__Impl rule__BusinessRule__Group_5_0__1
            {
            pushFollow(FOLLOW_13);
            rule__BusinessRule__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_0__0"


    // $ANTLR start "rule__BusinessRule__Group_5_0__0__Impl"
    // InternalSpecDsl.g:1008:1: rule__BusinessRule__Group_5_0__0__Impl : ( 'targetEntity' ) ;
    public final void rule__BusinessRule__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1012:1: ( ( 'targetEntity' ) )
            // InternalSpecDsl.g:1013:1: ( 'targetEntity' )
            {
            // InternalSpecDsl.g:1013:1: ( 'targetEntity' )
            // InternalSpecDsl.g:1014:2: 'targetEntity'
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetEntityKeyword_5_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBusinessRuleAccess().getTargetEntityKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_0__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group_5_0__1"
    // InternalSpecDsl.g:1023:1: rule__BusinessRule__Group_5_0__1 : rule__BusinessRule__Group_5_0__1__Impl ;
    public final void rule__BusinessRule__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1027:1: ( rule__BusinessRule__Group_5_0__1__Impl )
            // InternalSpecDsl.g:1028:2: rule__BusinessRule__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_0__1"


    // $ANTLR start "rule__BusinessRule__Group_5_0__1__Impl"
    // InternalSpecDsl.g:1034:1: rule__BusinessRule__Group_5_0__1__Impl : ( ( rule__BusinessRule__TargetEntityAssignment_5_0_1 ) ) ;
    public final void rule__BusinessRule__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1038:1: ( ( ( rule__BusinessRule__TargetEntityAssignment_5_0_1 ) ) )
            // InternalSpecDsl.g:1039:1: ( ( rule__BusinessRule__TargetEntityAssignment_5_0_1 ) )
            {
            // InternalSpecDsl.g:1039:1: ( ( rule__BusinessRule__TargetEntityAssignment_5_0_1 ) )
            // InternalSpecDsl.g:1040:2: ( rule__BusinessRule__TargetEntityAssignment_5_0_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetEntityAssignment_5_0_1()); 
            // InternalSpecDsl.g:1041:2: ( rule__BusinessRule__TargetEntityAssignment_5_0_1 )
            // InternalSpecDsl.g:1041:3: rule__BusinessRule__TargetEntityAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__TargetEntityAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getTargetEntityAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_0__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group_5_1__0"
    // InternalSpecDsl.g:1050:1: rule__BusinessRule__Group_5_1__0 : rule__BusinessRule__Group_5_1__0__Impl rule__BusinessRule__Group_5_1__1 ;
    public final void rule__BusinessRule__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1054:1: ( rule__BusinessRule__Group_5_1__0__Impl rule__BusinessRule__Group_5_1__1 )
            // InternalSpecDsl.g:1055:2: rule__BusinessRule__Group_5_1__0__Impl rule__BusinessRule__Group_5_1__1
            {
            pushFollow(FOLLOW_13);
            rule__BusinessRule__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_1__0"


    // $ANTLR start "rule__BusinessRule__Group_5_1__0__Impl"
    // InternalSpecDsl.g:1062:1: rule__BusinessRule__Group_5_1__0__Impl : ( 'targetRelationship' ) ;
    public final void rule__BusinessRule__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1066:1: ( ( 'targetRelationship' ) )
            // InternalSpecDsl.g:1067:1: ( 'targetRelationship' )
            {
            // InternalSpecDsl.g:1067:1: ( 'targetRelationship' )
            // InternalSpecDsl.g:1068:2: 'targetRelationship'
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetRelationshipKeyword_5_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBusinessRuleAccess().getTargetRelationshipKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_1__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group_5_1__1"
    // InternalSpecDsl.g:1077:1: rule__BusinessRule__Group_5_1__1 : rule__BusinessRule__Group_5_1__1__Impl ;
    public final void rule__BusinessRule__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1081:1: ( rule__BusinessRule__Group_5_1__1__Impl )
            // InternalSpecDsl.g:1082:2: rule__BusinessRule__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_1__1"


    // $ANTLR start "rule__BusinessRule__Group_5_1__1__Impl"
    // InternalSpecDsl.g:1088:1: rule__BusinessRule__Group_5_1__1__Impl : ( ( rule__BusinessRule__TargetRelationshipAssignment_5_1_1 ) ) ;
    public final void rule__BusinessRule__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1092:1: ( ( ( rule__BusinessRule__TargetRelationshipAssignment_5_1_1 ) ) )
            // InternalSpecDsl.g:1093:1: ( ( rule__BusinessRule__TargetRelationshipAssignment_5_1_1 ) )
            {
            // InternalSpecDsl.g:1093:1: ( ( rule__BusinessRule__TargetRelationshipAssignment_5_1_1 ) )
            // InternalSpecDsl.g:1094:2: ( rule__BusinessRule__TargetRelationshipAssignment_5_1_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetRelationshipAssignment_5_1_1()); 
            // InternalSpecDsl.g:1095:2: ( rule__BusinessRule__TargetRelationshipAssignment_5_1_1 )
            // InternalSpecDsl.g:1095:3: rule__BusinessRule__TargetRelationshipAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__TargetRelationshipAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getTargetRelationshipAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_1__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group_5_2__0"
    // InternalSpecDsl.g:1104:1: rule__BusinessRule__Group_5_2__0 : rule__BusinessRule__Group_5_2__0__Impl rule__BusinessRule__Group_5_2__1 ;
    public final void rule__BusinessRule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1108:1: ( rule__BusinessRule__Group_5_2__0__Impl rule__BusinessRule__Group_5_2__1 )
            // InternalSpecDsl.g:1109:2: rule__BusinessRule__Group_5_2__0__Impl rule__BusinessRule__Group_5_2__1
            {
            pushFollow(FOLLOW_13);
            rule__BusinessRule__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_2__0"


    // $ANTLR start "rule__BusinessRule__Group_5_2__0__Impl"
    // InternalSpecDsl.g:1116:1: rule__BusinessRule__Group_5_2__0__Impl : ( 'targetIncludeSatelit' ) ;
    public final void rule__BusinessRule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1120:1: ( ( 'targetIncludeSatelit' ) )
            // InternalSpecDsl.g:1121:1: ( 'targetIncludeSatelit' )
            {
            // InternalSpecDsl.g:1121:1: ( 'targetIncludeSatelit' )
            // InternalSpecDsl.g:1122:2: 'targetIncludeSatelit'
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetIncludeSatelitKeyword_5_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBusinessRuleAccess().getTargetIncludeSatelitKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_2__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group_5_2__1"
    // InternalSpecDsl.g:1131:1: rule__BusinessRule__Group_5_2__1 : rule__BusinessRule__Group_5_2__1__Impl ;
    public final void rule__BusinessRule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1135:1: ( rule__BusinessRule__Group_5_2__1__Impl )
            // InternalSpecDsl.g:1136:2: rule__BusinessRule__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_2__1"


    // $ANTLR start "rule__BusinessRule__Group_5_2__1__Impl"
    // InternalSpecDsl.g:1142:1: rule__BusinessRule__Group_5_2__1__Impl : ( ( rule__BusinessRule__TargetIncludeAssignment_5_2_1 ) ) ;
    public final void rule__BusinessRule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1146:1: ( ( ( rule__BusinessRule__TargetIncludeAssignment_5_2_1 ) ) )
            // InternalSpecDsl.g:1147:1: ( ( rule__BusinessRule__TargetIncludeAssignment_5_2_1 ) )
            {
            // InternalSpecDsl.g:1147:1: ( ( rule__BusinessRule__TargetIncludeAssignment_5_2_1 ) )
            // InternalSpecDsl.g:1148:2: ( rule__BusinessRule__TargetIncludeAssignment_5_2_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetIncludeAssignment_5_2_1()); 
            // InternalSpecDsl.g:1149:2: ( rule__BusinessRule__TargetIncludeAssignment_5_2_1 )
            // InternalSpecDsl.g:1149:3: rule__BusinessRule__TargetIncludeAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BusinessRule__TargetIncludeAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getTargetIncludeAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group_5_2__1__Impl"


    // $ANTLR start "rule__PrimarySource__Group__0"
    // InternalSpecDsl.g:1158:1: rule__PrimarySource__Group__0 : rule__PrimarySource__Group__0__Impl rule__PrimarySource__Group__1 ;
    public final void rule__PrimarySource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1162:1: ( rule__PrimarySource__Group__0__Impl rule__PrimarySource__Group__1 )
            // InternalSpecDsl.g:1163:2: rule__PrimarySource__Group__0__Impl rule__PrimarySource__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PrimarySource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__0"


    // $ANTLR start "rule__PrimarySource__Group__0__Impl"
    // InternalSpecDsl.g:1170:1: rule__PrimarySource__Group__0__Impl : ( 'PrimarySource' ) ;
    public final void rule__PrimarySource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1174:1: ( ( 'PrimarySource' ) )
            // InternalSpecDsl.g:1175:1: ( 'PrimarySource' )
            {
            // InternalSpecDsl.g:1175:1: ( 'PrimarySource' )
            // InternalSpecDsl.g:1176:2: 'PrimarySource'
            {
             before(grammarAccess.getPrimarySourceAccess().getPrimarySourceKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimarySourceAccess().getPrimarySourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__0__Impl"


    // $ANTLR start "rule__PrimarySource__Group__1"
    // InternalSpecDsl.g:1185:1: rule__PrimarySource__Group__1 : rule__PrimarySource__Group__1__Impl rule__PrimarySource__Group__2 ;
    public final void rule__PrimarySource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1189:1: ( rule__PrimarySource__Group__1__Impl rule__PrimarySource__Group__2 )
            // InternalSpecDsl.g:1190:2: rule__PrimarySource__Group__1__Impl rule__PrimarySource__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__PrimarySource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__1"


    // $ANTLR start "rule__PrimarySource__Group__1__Impl"
    // InternalSpecDsl.g:1197:1: rule__PrimarySource__Group__1__Impl : ( ( rule__PrimarySource__SourceEntityAssignment_1 ) ) ;
    public final void rule__PrimarySource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1201:1: ( ( ( rule__PrimarySource__SourceEntityAssignment_1 ) ) )
            // InternalSpecDsl.g:1202:1: ( ( rule__PrimarySource__SourceEntityAssignment_1 ) )
            {
            // InternalSpecDsl.g:1202:1: ( ( rule__PrimarySource__SourceEntityAssignment_1 ) )
            // InternalSpecDsl.g:1203:2: ( rule__PrimarySource__SourceEntityAssignment_1 )
            {
             before(grammarAccess.getPrimarySourceAccess().getSourceEntityAssignment_1()); 
            // InternalSpecDsl.g:1204:2: ( rule__PrimarySource__SourceEntityAssignment_1 )
            // InternalSpecDsl.g:1204:3: rule__PrimarySource__SourceEntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__SourceEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimarySourceAccess().getSourceEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__1__Impl"


    // $ANTLR start "rule__PrimarySource__Group__2"
    // InternalSpecDsl.g:1212:1: rule__PrimarySource__Group__2 : rule__PrimarySource__Group__2__Impl rule__PrimarySource__Group__3 ;
    public final void rule__PrimarySource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1216:1: ( rule__PrimarySource__Group__2__Impl rule__PrimarySource__Group__3 )
            // InternalSpecDsl.g:1217:2: rule__PrimarySource__Group__2__Impl rule__PrimarySource__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__PrimarySource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__2"


    // $ANTLR start "rule__PrimarySource__Group__2__Impl"
    // InternalSpecDsl.g:1224:1: rule__PrimarySource__Group__2__Impl : ( ( rule__PrimarySource__Group_2__0 )? ) ;
    public final void rule__PrimarySource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1228:1: ( ( ( rule__PrimarySource__Group_2__0 )? ) )
            // InternalSpecDsl.g:1229:1: ( ( rule__PrimarySource__Group_2__0 )? )
            {
            // InternalSpecDsl.g:1229:1: ( ( rule__PrimarySource__Group_2__0 )? )
            // InternalSpecDsl.g:1230:2: ( rule__PrimarySource__Group_2__0 )?
            {
             before(grammarAccess.getPrimarySourceAccess().getGroup_2()); 
            // InternalSpecDsl.g:1231:2: ( rule__PrimarySource__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpecDsl.g:1231:3: rule__PrimarySource__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimarySource__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimarySourceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__2__Impl"


    // $ANTLR start "rule__PrimarySource__Group__3"
    // InternalSpecDsl.g:1239:1: rule__PrimarySource__Group__3 : rule__PrimarySource__Group__3__Impl ;
    public final void rule__PrimarySource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1243:1: ( rule__PrimarySource__Group__3__Impl )
            // InternalSpecDsl.g:1244:2: rule__PrimarySource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__3"


    // $ANTLR start "rule__PrimarySource__Group__3__Impl"
    // InternalSpecDsl.g:1250:1: rule__PrimarySource__Group__3__Impl : ( ( rule__PrimarySource__Group_3__0 )* ) ;
    public final void rule__PrimarySource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1254:1: ( ( ( rule__PrimarySource__Group_3__0 )* ) )
            // InternalSpecDsl.g:1255:1: ( ( rule__PrimarySource__Group_3__0 )* )
            {
            // InternalSpecDsl.g:1255:1: ( ( rule__PrimarySource__Group_3__0 )* )
            // InternalSpecDsl.g:1256:2: ( rule__PrimarySource__Group_3__0 )*
            {
             before(grammarAccess.getPrimarySourceAccess().getGroup_3()); 
            // InternalSpecDsl.g:1257:2: ( rule__PrimarySource__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpecDsl.g:1257:3: rule__PrimarySource__Group_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__PrimarySource__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPrimarySourceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group__3__Impl"


    // $ANTLR start "rule__PrimarySource__Group_2__0"
    // InternalSpecDsl.g:1266:1: rule__PrimarySource__Group_2__0 : rule__PrimarySource__Group_2__0__Impl rule__PrimarySource__Group_2__1 ;
    public final void rule__PrimarySource__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1270:1: ( rule__PrimarySource__Group_2__0__Impl rule__PrimarySource__Group_2__1 )
            // InternalSpecDsl.g:1271:2: rule__PrimarySource__Group_2__0__Impl rule__PrimarySource__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__PrimarySource__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_2__0"


    // $ANTLR start "rule__PrimarySource__Group_2__0__Impl"
    // InternalSpecDsl.g:1278:1: rule__PrimarySource__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__PrimarySource__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1282:1: ( ( 'alias' ) )
            // InternalSpecDsl.g:1283:1: ( 'alias' )
            {
            // InternalSpecDsl.g:1283:1: ( 'alias' )
            // InternalSpecDsl.g:1284:2: 'alias'
            {
             before(grammarAccess.getPrimarySourceAccess().getAliasKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimarySourceAccess().getAliasKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_2__0__Impl"


    // $ANTLR start "rule__PrimarySource__Group_2__1"
    // InternalSpecDsl.g:1293:1: rule__PrimarySource__Group_2__1 : rule__PrimarySource__Group_2__1__Impl ;
    public final void rule__PrimarySource__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1297:1: ( rule__PrimarySource__Group_2__1__Impl )
            // InternalSpecDsl.g:1298:2: rule__PrimarySource__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_2__1"


    // $ANTLR start "rule__PrimarySource__Group_2__1__Impl"
    // InternalSpecDsl.g:1304:1: rule__PrimarySource__Group_2__1__Impl : ( ( rule__PrimarySource__AliasAssignment_2_1 ) ) ;
    public final void rule__PrimarySource__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1308:1: ( ( ( rule__PrimarySource__AliasAssignment_2_1 ) ) )
            // InternalSpecDsl.g:1309:1: ( ( rule__PrimarySource__AliasAssignment_2_1 ) )
            {
            // InternalSpecDsl.g:1309:1: ( ( rule__PrimarySource__AliasAssignment_2_1 ) )
            // InternalSpecDsl.g:1310:2: ( rule__PrimarySource__AliasAssignment_2_1 )
            {
             before(grammarAccess.getPrimarySourceAccess().getAliasAssignment_2_1()); 
            // InternalSpecDsl.g:1311:2: ( rule__PrimarySource__AliasAssignment_2_1 )
            // InternalSpecDsl.g:1311:3: rule__PrimarySource__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimarySourceAccess().getAliasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_2__1__Impl"


    // $ANTLR start "rule__PrimarySource__Group_3__0"
    // InternalSpecDsl.g:1320:1: rule__PrimarySource__Group_3__0 : rule__PrimarySource__Group_3__0__Impl rule__PrimarySource__Group_3__1 ;
    public final void rule__PrimarySource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1324:1: ( rule__PrimarySource__Group_3__0__Impl rule__PrimarySource__Group_3__1 )
            // InternalSpecDsl.g:1325:2: rule__PrimarySource__Group_3__0__Impl rule__PrimarySource__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__PrimarySource__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__0"


    // $ANTLR start "rule__PrimarySource__Group_3__0__Impl"
    // InternalSpecDsl.g:1332:1: rule__PrimarySource__Group_3__0__Impl : ( 'childSources' ) ;
    public final void rule__PrimarySource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1336:1: ( ( 'childSources' ) )
            // InternalSpecDsl.g:1337:1: ( 'childSources' )
            {
            // InternalSpecDsl.g:1337:1: ( 'childSources' )
            // InternalSpecDsl.g:1338:2: 'childSources'
            {
             before(grammarAccess.getPrimarySourceAccess().getChildSourcesKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimarySourceAccess().getChildSourcesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__0__Impl"


    // $ANTLR start "rule__PrimarySource__Group_3__1"
    // InternalSpecDsl.g:1347:1: rule__PrimarySource__Group_3__1 : rule__PrimarySource__Group_3__1__Impl rule__PrimarySource__Group_3__2 ;
    public final void rule__PrimarySource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1351:1: ( rule__PrimarySource__Group_3__1__Impl rule__PrimarySource__Group_3__2 )
            // InternalSpecDsl.g:1352:2: rule__PrimarySource__Group_3__1__Impl rule__PrimarySource__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__PrimarySource__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__1"


    // $ANTLR start "rule__PrimarySource__Group_3__1__Impl"
    // InternalSpecDsl.g:1359:1: rule__PrimarySource__Group_3__1__Impl : ( '[' ) ;
    public final void rule__PrimarySource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1363:1: ( ( '[' ) )
            // InternalSpecDsl.g:1364:1: ( '[' )
            {
            // InternalSpecDsl.g:1364:1: ( '[' )
            // InternalSpecDsl.g:1365:2: '['
            {
             before(grammarAccess.getPrimarySourceAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrimarySourceAccess().getLeftSquareBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__1__Impl"


    // $ANTLR start "rule__PrimarySource__Group_3__2"
    // InternalSpecDsl.g:1374:1: rule__PrimarySource__Group_3__2 : rule__PrimarySource__Group_3__2__Impl rule__PrimarySource__Group_3__3 ;
    public final void rule__PrimarySource__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1378:1: ( rule__PrimarySource__Group_3__2__Impl rule__PrimarySource__Group_3__3 )
            // InternalSpecDsl.g:1379:2: rule__PrimarySource__Group_3__2__Impl rule__PrimarySource__Group_3__3
            {
            pushFollow(FOLLOW_22);
            rule__PrimarySource__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__2"


    // $ANTLR start "rule__PrimarySource__Group_3__2__Impl"
    // InternalSpecDsl.g:1386:1: rule__PrimarySource__Group_3__2__Impl : ( ( rule__PrimarySource__Group_3_2__0 ) ) ;
    public final void rule__PrimarySource__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1390:1: ( ( ( rule__PrimarySource__Group_3_2__0 ) ) )
            // InternalSpecDsl.g:1391:1: ( ( rule__PrimarySource__Group_3_2__0 ) )
            {
            // InternalSpecDsl.g:1391:1: ( ( rule__PrimarySource__Group_3_2__0 ) )
            // InternalSpecDsl.g:1392:2: ( rule__PrimarySource__Group_3_2__0 )
            {
             before(grammarAccess.getPrimarySourceAccess().getGroup_3_2()); 
            // InternalSpecDsl.g:1393:2: ( rule__PrimarySource__Group_3_2__0 )
            // InternalSpecDsl.g:1393:3: rule__PrimarySource__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_3_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimarySourceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__2__Impl"


    // $ANTLR start "rule__PrimarySource__Group_3__3"
    // InternalSpecDsl.g:1401:1: rule__PrimarySource__Group_3__3 : rule__PrimarySource__Group_3__3__Impl ;
    public final void rule__PrimarySource__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1405:1: ( rule__PrimarySource__Group_3__3__Impl )
            // InternalSpecDsl.g:1406:2: rule__PrimarySource__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__3"


    // $ANTLR start "rule__PrimarySource__Group_3__3__Impl"
    // InternalSpecDsl.g:1412:1: rule__PrimarySource__Group_3__3__Impl : ( ']' ) ;
    public final void rule__PrimarySource__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1416:1: ( ( ']' ) )
            // InternalSpecDsl.g:1417:1: ( ']' )
            {
            // InternalSpecDsl.g:1417:1: ( ']' )
            // InternalSpecDsl.g:1418:2: ']'
            {
             before(grammarAccess.getPrimarySourceAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPrimarySourceAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3__3__Impl"


    // $ANTLR start "rule__PrimarySource__Group_3_2__0"
    // InternalSpecDsl.g:1428:1: rule__PrimarySource__Group_3_2__0 : rule__PrimarySource__Group_3_2__0__Impl rule__PrimarySource__Group_3_2__1 ;
    public final void rule__PrimarySource__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1432:1: ( rule__PrimarySource__Group_3_2__0__Impl rule__PrimarySource__Group_3_2__1 )
            // InternalSpecDsl.g:1433:2: rule__PrimarySource__Group_3_2__0__Impl rule__PrimarySource__Group_3_2__1
            {
            pushFollow(FOLLOW_13);
            rule__PrimarySource__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3_2__0"


    // $ANTLR start "rule__PrimarySource__Group_3_2__0__Impl"
    // InternalSpecDsl.g:1440:1: rule__PrimarySource__Group_3_2__0__Impl : ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_0 ) ) ;
    public final void rule__PrimarySource__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1444:1: ( ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_0 ) ) )
            // InternalSpecDsl.g:1445:1: ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_0 ) )
            {
            // InternalSpecDsl.g:1445:1: ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_0 ) )
            // InternalSpecDsl.g:1446:2: ( rule__PrimarySource__ChildSourcesAssignment_3_2_0 )
            {
             before(grammarAccess.getPrimarySourceAccess().getChildSourcesAssignment_3_2_0()); 
            // InternalSpecDsl.g:1447:2: ( rule__PrimarySource__ChildSourcesAssignment_3_2_0 )
            // InternalSpecDsl.g:1447:3: rule__PrimarySource__ChildSourcesAssignment_3_2_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__ChildSourcesAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimarySourceAccess().getChildSourcesAssignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3_2__0__Impl"


    // $ANTLR start "rule__PrimarySource__Group_3_2__1"
    // InternalSpecDsl.g:1455:1: rule__PrimarySource__Group_3_2__1 : rule__PrimarySource__Group_3_2__1__Impl ;
    public final void rule__PrimarySource__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1459:1: ( rule__PrimarySource__Group_3_2__1__Impl )
            // InternalSpecDsl.g:1460:2: rule__PrimarySource__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySource__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3_2__1"


    // $ANTLR start "rule__PrimarySource__Group_3_2__1__Impl"
    // InternalSpecDsl.g:1466:1: rule__PrimarySource__Group_3_2__1__Impl : ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_1 )* ) ;
    public final void rule__PrimarySource__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1470:1: ( ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_1 )* ) )
            // InternalSpecDsl.g:1471:1: ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_1 )* )
            {
            // InternalSpecDsl.g:1471:1: ( ( rule__PrimarySource__ChildSourcesAssignment_3_2_1 )* )
            // InternalSpecDsl.g:1472:2: ( rule__PrimarySource__ChildSourcesAssignment_3_2_1 )*
            {
             before(grammarAccess.getPrimarySourceAccess().getChildSourcesAssignment_3_2_1()); 
            // InternalSpecDsl.g:1473:2: ( rule__PrimarySource__ChildSourcesAssignment_3_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSpecDsl.g:1473:3: rule__PrimarySource__ChildSourcesAssignment_3_2_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PrimarySource__ChildSourcesAssignment_3_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPrimarySourceAccess().getChildSourcesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__Group_3_2__1__Impl"


    // $ANTLR start "rule__Source__Group__0"
    // InternalSpecDsl.g:1482:1: rule__Source__Group__0 : rule__Source__Group__0__Impl rule__Source__Group__1 ;
    public final void rule__Source__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1486:1: ( rule__Source__Group__0__Impl rule__Source__Group__1 )
            // InternalSpecDsl.g:1487:2: rule__Source__Group__0__Impl rule__Source__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0"


    // $ANTLR start "rule__Source__Group__0__Impl"
    // InternalSpecDsl.g:1494:1: rule__Source__Group__0__Impl : ( () ) ;
    public final void rule__Source__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1498:1: ( ( () ) )
            // InternalSpecDsl.g:1499:1: ( () )
            {
            // InternalSpecDsl.g:1499:1: ( () )
            // InternalSpecDsl.g:1500:2: ()
            {
             before(grammarAccess.getSourceAccess().getSourceAction_0()); 
            // InternalSpecDsl.g:1501:2: ()
            // InternalSpecDsl.g:1501:3: 
            {
            }

             after(grammarAccess.getSourceAccess().getSourceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__0__Impl"


    // $ANTLR start "rule__Source__Group__1"
    // InternalSpecDsl.g:1509:1: rule__Source__Group__1 : rule__Source__Group__1__Impl rule__Source__Group__2 ;
    public final void rule__Source__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1513:1: ( rule__Source__Group__1__Impl rule__Source__Group__2 )
            // InternalSpecDsl.g:1514:2: rule__Source__Group__1__Impl rule__Source__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1"


    // $ANTLR start "rule__Source__Group__1__Impl"
    // InternalSpecDsl.g:1521:1: rule__Source__Group__1__Impl : ( ( rule__Source__SourceEntityAssignment_1 ) ) ;
    public final void rule__Source__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1525:1: ( ( ( rule__Source__SourceEntityAssignment_1 ) ) )
            // InternalSpecDsl.g:1526:1: ( ( rule__Source__SourceEntityAssignment_1 ) )
            {
            // InternalSpecDsl.g:1526:1: ( ( rule__Source__SourceEntityAssignment_1 ) )
            // InternalSpecDsl.g:1527:2: ( rule__Source__SourceEntityAssignment_1 )
            {
             before(grammarAccess.getSourceAccess().getSourceEntityAssignment_1()); 
            // InternalSpecDsl.g:1528:2: ( rule__Source__SourceEntityAssignment_1 )
            // InternalSpecDsl.g:1528:3: rule__Source__SourceEntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__SourceEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getSourceEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__1__Impl"


    // $ANTLR start "rule__Source__Group__2"
    // InternalSpecDsl.g:1536:1: rule__Source__Group__2 : rule__Source__Group__2__Impl rule__Source__Group__3 ;
    public final void rule__Source__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1540:1: ( rule__Source__Group__2__Impl rule__Source__Group__3 )
            // InternalSpecDsl.g:1541:2: rule__Source__Group__2__Impl rule__Source__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2"


    // $ANTLR start "rule__Source__Group__2__Impl"
    // InternalSpecDsl.g:1548:1: rule__Source__Group__2__Impl : ( ( rule__Source__Group_2__0 )? ) ;
    public final void rule__Source__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1552:1: ( ( ( rule__Source__Group_2__0 )? ) )
            // InternalSpecDsl.g:1553:1: ( ( rule__Source__Group_2__0 )? )
            {
            // InternalSpecDsl.g:1553:1: ( ( rule__Source__Group_2__0 )? )
            // InternalSpecDsl.g:1554:2: ( rule__Source__Group_2__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_2()); 
            // InternalSpecDsl.g:1555:2: ( rule__Source__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpecDsl.g:1555:3: rule__Source__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__2__Impl"


    // $ANTLR start "rule__Source__Group__3"
    // InternalSpecDsl.g:1563:1: rule__Source__Group__3 : rule__Source__Group__3__Impl rule__Source__Group__4 ;
    public final void rule__Source__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1567:1: ( rule__Source__Group__3__Impl rule__Source__Group__4 )
            // InternalSpecDsl.g:1568:2: rule__Source__Group__3__Impl rule__Source__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3"


    // $ANTLR start "rule__Source__Group__3__Impl"
    // InternalSpecDsl.g:1575:1: rule__Source__Group__3__Impl : ( ( rule__Source__IsMandatoryAssignment_3 )? ) ;
    public final void rule__Source__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1579:1: ( ( ( rule__Source__IsMandatoryAssignment_3 )? ) )
            // InternalSpecDsl.g:1580:1: ( ( rule__Source__IsMandatoryAssignment_3 )? )
            {
            // InternalSpecDsl.g:1580:1: ( ( rule__Source__IsMandatoryAssignment_3 )? )
            // InternalSpecDsl.g:1581:2: ( rule__Source__IsMandatoryAssignment_3 )?
            {
             before(grammarAccess.getSourceAccess().getIsMandatoryAssignment_3()); 
            // InternalSpecDsl.g:1582:2: ( rule__Source__IsMandatoryAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpecDsl.g:1582:3: rule__Source__IsMandatoryAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__IsMandatoryAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getIsMandatoryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__3__Impl"


    // $ANTLR start "rule__Source__Group__4"
    // InternalSpecDsl.g:1590:1: rule__Source__Group__4 : rule__Source__Group__4__Impl rule__Source__Group__5 ;
    public final void rule__Source__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1594:1: ( rule__Source__Group__4__Impl rule__Source__Group__5 )
            // InternalSpecDsl.g:1595:2: rule__Source__Group__4__Impl rule__Source__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4"


    // $ANTLR start "rule__Source__Group__4__Impl"
    // InternalSpecDsl.g:1602:1: rule__Source__Group__4__Impl : ( ( rule__Source__IsMultiplyingAssignment_4 )? ) ;
    public final void rule__Source__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1606:1: ( ( ( rule__Source__IsMultiplyingAssignment_4 )? ) )
            // InternalSpecDsl.g:1607:1: ( ( rule__Source__IsMultiplyingAssignment_4 )? )
            {
            // InternalSpecDsl.g:1607:1: ( ( rule__Source__IsMultiplyingAssignment_4 )? )
            // InternalSpecDsl.g:1608:2: ( rule__Source__IsMultiplyingAssignment_4 )?
            {
             before(grammarAccess.getSourceAccess().getIsMultiplyingAssignment_4()); 
            // InternalSpecDsl.g:1609:2: ( rule__Source__IsMultiplyingAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpecDsl.g:1609:3: rule__Source__IsMultiplyingAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__IsMultiplyingAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getIsMultiplyingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__4__Impl"


    // $ANTLR start "rule__Source__Group__5"
    // InternalSpecDsl.g:1617:1: rule__Source__Group__5 : rule__Source__Group__5__Impl rule__Source__Group__6 ;
    public final void rule__Source__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1621:1: ( rule__Source__Group__5__Impl rule__Source__Group__6 )
            // InternalSpecDsl.g:1622:2: rule__Source__Group__5__Impl rule__Source__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5"


    // $ANTLR start "rule__Source__Group__5__Impl"
    // InternalSpecDsl.g:1629:1: rule__Source__Group__5__Impl : ( ( rule__Source__IsVectorAssignment_5 )? ) ;
    public final void rule__Source__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1633:1: ( ( ( rule__Source__IsVectorAssignment_5 )? ) )
            // InternalSpecDsl.g:1634:1: ( ( rule__Source__IsVectorAssignment_5 )? )
            {
            // InternalSpecDsl.g:1634:1: ( ( rule__Source__IsVectorAssignment_5 )? )
            // InternalSpecDsl.g:1635:2: ( rule__Source__IsVectorAssignment_5 )?
            {
             before(grammarAccess.getSourceAccess().getIsVectorAssignment_5()); 
            // InternalSpecDsl.g:1636:2: ( rule__Source__IsVectorAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpecDsl.g:1636:3: rule__Source__IsVectorAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__IsVectorAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getIsVectorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__5__Impl"


    // $ANTLR start "rule__Source__Group__6"
    // InternalSpecDsl.g:1644:1: rule__Source__Group__6 : rule__Source__Group__6__Impl rule__Source__Group__7 ;
    public final void rule__Source__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1648:1: ( rule__Source__Group__6__Impl rule__Source__Group__7 )
            // InternalSpecDsl.g:1649:2: rule__Source__Group__6__Impl rule__Source__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__6"


    // $ANTLR start "rule__Source__Group__6__Impl"
    // InternalSpecDsl.g:1656:1: rule__Source__Group__6__Impl : ( ( rule__Source__Group_6__0 )? ) ;
    public final void rule__Source__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1660:1: ( ( ( rule__Source__Group_6__0 )? ) )
            // InternalSpecDsl.g:1661:1: ( ( rule__Source__Group_6__0 )? )
            {
            // InternalSpecDsl.g:1661:1: ( ( rule__Source__Group_6__0 )? )
            // InternalSpecDsl.g:1662:2: ( rule__Source__Group_6__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_6()); 
            // InternalSpecDsl.g:1663:2: ( rule__Source__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpecDsl.g:1663:3: rule__Source__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__6__Impl"


    // $ANTLR start "rule__Source__Group__7"
    // InternalSpecDsl.g:1671:1: rule__Source__Group__7 : rule__Source__Group__7__Impl rule__Source__Group__8 ;
    public final void rule__Source__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1675:1: ( rule__Source__Group__7__Impl rule__Source__Group__8 )
            // InternalSpecDsl.g:1676:2: rule__Source__Group__7__Impl rule__Source__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__7"


    // $ANTLR start "rule__Source__Group__7__Impl"
    // InternalSpecDsl.g:1683:1: rule__Source__Group__7__Impl : ( ( rule__Source__Group_7__0 )? ) ;
    public final void rule__Source__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1687:1: ( ( ( rule__Source__Group_7__0 )? ) )
            // InternalSpecDsl.g:1688:1: ( ( rule__Source__Group_7__0 )? )
            {
            // InternalSpecDsl.g:1688:1: ( ( rule__Source__Group_7__0 )? )
            // InternalSpecDsl.g:1689:2: ( rule__Source__Group_7__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_7()); 
            // InternalSpecDsl.g:1690:2: ( rule__Source__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpecDsl.g:1690:3: rule__Source__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__7__Impl"


    // $ANTLR start "rule__Source__Group__8"
    // InternalSpecDsl.g:1698:1: rule__Source__Group__8 : rule__Source__Group__8__Impl rule__Source__Group__9 ;
    public final void rule__Source__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1702:1: ( rule__Source__Group__8__Impl rule__Source__Group__9 )
            // InternalSpecDsl.g:1703:2: rule__Source__Group__8__Impl rule__Source__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__8"


    // $ANTLR start "rule__Source__Group__8__Impl"
    // InternalSpecDsl.g:1710:1: rule__Source__Group__8__Impl : ( ( rule__Source__Group_8__0 )? ) ;
    public final void rule__Source__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1714:1: ( ( ( rule__Source__Group_8__0 )? ) )
            // InternalSpecDsl.g:1715:1: ( ( rule__Source__Group_8__0 )? )
            {
            // InternalSpecDsl.g:1715:1: ( ( rule__Source__Group_8__0 )? )
            // InternalSpecDsl.g:1716:2: ( rule__Source__Group_8__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_8()); 
            // InternalSpecDsl.g:1717:2: ( rule__Source__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpecDsl.g:1717:3: rule__Source__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__8__Impl"


    // $ANTLR start "rule__Source__Group__9"
    // InternalSpecDsl.g:1725:1: rule__Source__Group__9 : rule__Source__Group__9__Impl rule__Source__Group__10 ;
    public final void rule__Source__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1729:1: ( rule__Source__Group__9__Impl rule__Source__Group__10 )
            // InternalSpecDsl.g:1730:2: rule__Source__Group__9__Impl rule__Source__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__9"


    // $ANTLR start "rule__Source__Group__9__Impl"
    // InternalSpecDsl.g:1737:1: rule__Source__Group__9__Impl : ( ( rule__Source__Group_9__0 )? ) ;
    public final void rule__Source__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1741:1: ( ( ( rule__Source__Group_9__0 )? ) )
            // InternalSpecDsl.g:1742:1: ( ( rule__Source__Group_9__0 )? )
            {
            // InternalSpecDsl.g:1742:1: ( ( rule__Source__Group_9__0 )? )
            // InternalSpecDsl.g:1743:2: ( rule__Source__Group_9__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_9()); 
            // InternalSpecDsl.g:1744:2: ( rule__Source__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpecDsl.g:1744:3: rule__Source__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__9__Impl"


    // $ANTLR start "rule__Source__Group__10"
    // InternalSpecDsl.g:1752:1: rule__Source__Group__10 : rule__Source__Group__10__Impl rule__Source__Group__11 ;
    public final void rule__Source__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1756:1: ( rule__Source__Group__10__Impl rule__Source__Group__11 )
            // InternalSpecDsl.g:1757:2: rule__Source__Group__10__Impl rule__Source__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__10"


    // $ANTLR start "rule__Source__Group__10__Impl"
    // InternalSpecDsl.g:1764:1: rule__Source__Group__10__Impl : ( ( rule__Source__Group_10__0 )? ) ;
    public final void rule__Source__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1768:1: ( ( ( rule__Source__Group_10__0 )? ) )
            // InternalSpecDsl.g:1769:1: ( ( rule__Source__Group_10__0 )? )
            {
            // InternalSpecDsl.g:1769:1: ( ( rule__Source__Group_10__0 )? )
            // InternalSpecDsl.g:1770:2: ( rule__Source__Group_10__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_10()); 
            // InternalSpecDsl.g:1771:2: ( rule__Source__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpecDsl.g:1771:3: rule__Source__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__10__Impl"


    // $ANTLR start "rule__Source__Group__11"
    // InternalSpecDsl.g:1779:1: rule__Source__Group__11 : rule__Source__Group__11__Impl rule__Source__Group__12 ;
    public final void rule__Source__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1783:1: ( rule__Source__Group__11__Impl rule__Source__Group__12 )
            // InternalSpecDsl.g:1784:2: rule__Source__Group__11__Impl rule__Source__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Source__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__11"


    // $ANTLR start "rule__Source__Group__11__Impl"
    // InternalSpecDsl.g:1791:1: rule__Source__Group__11__Impl : ( ( rule__Source__Group_11__0 )? ) ;
    public final void rule__Source__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1795:1: ( ( ( rule__Source__Group_11__0 )? ) )
            // InternalSpecDsl.g:1796:1: ( ( rule__Source__Group_11__0 )? )
            {
            // InternalSpecDsl.g:1796:1: ( ( rule__Source__Group_11__0 )? )
            // InternalSpecDsl.g:1797:2: ( rule__Source__Group_11__0 )?
            {
             before(grammarAccess.getSourceAccess().getGroup_11()); 
            // InternalSpecDsl.g:1798:2: ( rule__Source__Group_11__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpecDsl.g:1798:3: rule__Source__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Source__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__11__Impl"


    // $ANTLR start "rule__Source__Group__12"
    // InternalSpecDsl.g:1806:1: rule__Source__Group__12 : rule__Source__Group__12__Impl ;
    public final void rule__Source__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1810:1: ( rule__Source__Group__12__Impl )
            // InternalSpecDsl.g:1811:2: rule__Source__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__12"


    // $ANTLR start "rule__Source__Group__12__Impl"
    // InternalSpecDsl.g:1817:1: rule__Source__Group__12__Impl : ( ( rule__Source__Group_12__0 )* ) ;
    public final void rule__Source__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1821:1: ( ( ( rule__Source__Group_12__0 )* ) )
            // InternalSpecDsl.g:1822:1: ( ( rule__Source__Group_12__0 )* )
            {
            // InternalSpecDsl.g:1822:1: ( ( rule__Source__Group_12__0 )* )
            // InternalSpecDsl.g:1823:2: ( rule__Source__Group_12__0 )*
            {
             before(grammarAccess.getSourceAccess().getGroup_12()); 
            // InternalSpecDsl.g:1824:2: ( rule__Source__Group_12__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSpecDsl.g:1824:3: rule__Source__Group_12__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Source__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group__12__Impl"


    // $ANTLR start "rule__Source__Group_2__0"
    // InternalSpecDsl.g:1833:1: rule__Source__Group_2__0 : rule__Source__Group_2__0__Impl rule__Source__Group_2__1 ;
    public final void rule__Source__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1837:1: ( rule__Source__Group_2__0__Impl rule__Source__Group_2__1 )
            // InternalSpecDsl.g:1838:2: rule__Source__Group_2__0__Impl rule__Source__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Source__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_2__0"


    // $ANTLR start "rule__Source__Group_2__0__Impl"
    // InternalSpecDsl.g:1845:1: rule__Source__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__Source__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1849:1: ( ( 'alias' ) )
            // InternalSpecDsl.g:1850:1: ( 'alias' )
            {
            // InternalSpecDsl.g:1850:1: ( 'alias' )
            // InternalSpecDsl.g:1851:2: 'alias'
            {
             before(grammarAccess.getSourceAccess().getAliasKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getAliasKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_2__0__Impl"


    // $ANTLR start "rule__Source__Group_2__1"
    // InternalSpecDsl.g:1860:1: rule__Source__Group_2__1 : rule__Source__Group_2__1__Impl ;
    public final void rule__Source__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1864:1: ( rule__Source__Group_2__1__Impl )
            // InternalSpecDsl.g:1865:2: rule__Source__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_2__1"


    // $ANTLR start "rule__Source__Group_2__1__Impl"
    // InternalSpecDsl.g:1871:1: rule__Source__Group_2__1__Impl : ( ( rule__Source__AliasAssignment_2_1 ) ) ;
    public final void rule__Source__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1875:1: ( ( ( rule__Source__AliasAssignment_2_1 ) ) )
            // InternalSpecDsl.g:1876:1: ( ( rule__Source__AliasAssignment_2_1 ) )
            {
            // InternalSpecDsl.g:1876:1: ( ( rule__Source__AliasAssignment_2_1 ) )
            // InternalSpecDsl.g:1877:2: ( rule__Source__AliasAssignment_2_1 )
            {
             before(grammarAccess.getSourceAccess().getAliasAssignment_2_1()); 
            // InternalSpecDsl.g:1878:2: ( rule__Source__AliasAssignment_2_1 )
            // InternalSpecDsl.g:1878:3: rule__Source__AliasAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getAliasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_2__1__Impl"


    // $ANTLR start "rule__Source__Group_6__0"
    // InternalSpecDsl.g:1887:1: rule__Source__Group_6__0 : rule__Source__Group_6__0__Impl rule__Source__Group_6__1 ;
    public final void rule__Source__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1891:1: ( rule__Source__Group_6__0__Impl rule__Source__Group_6__1 )
            // InternalSpecDsl.g:1892:2: rule__Source__Group_6__0__Impl rule__Source__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Source__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__0"


    // $ANTLR start "rule__Source__Group_6__0__Impl"
    // InternalSpecDsl.g:1899:1: rule__Source__Group_6__0__Impl : ( 'VectoryKeys' ) ;
    public final void rule__Source__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1903:1: ( ( 'VectoryKeys' ) )
            // InternalSpecDsl.g:1904:1: ( 'VectoryKeys' )
            {
            // InternalSpecDsl.g:1904:1: ( 'VectoryKeys' )
            // InternalSpecDsl.g:1905:2: 'VectoryKeys'
            {
             before(grammarAccess.getSourceAccess().getVectoryKeysKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getVectoryKeysKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__0__Impl"


    // $ANTLR start "rule__Source__Group_6__1"
    // InternalSpecDsl.g:1914:1: rule__Source__Group_6__1 : rule__Source__Group_6__1__Impl rule__Source__Group_6__2 ;
    public final void rule__Source__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1918:1: ( rule__Source__Group_6__1__Impl rule__Source__Group_6__2 )
            // InternalSpecDsl.g:1919:2: rule__Source__Group_6__1__Impl rule__Source__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__1"


    // $ANTLR start "rule__Source__Group_6__1__Impl"
    // InternalSpecDsl.g:1926:1: rule__Source__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Source__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1930:1: ( ( '{' ) )
            // InternalSpecDsl.g:1931:1: ( '{' )
            {
            // InternalSpecDsl.g:1931:1: ( '{' )
            // InternalSpecDsl.g:1932:2: '{'
            {
             before(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__1__Impl"


    // $ANTLR start "rule__Source__Group_6__2"
    // InternalSpecDsl.g:1941:1: rule__Source__Group_6__2 : rule__Source__Group_6__2__Impl ;
    public final void rule__Source__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1945:1: ( rule__Source__Group_6__2__Impl )
            // InternalSpecDsl.g:1946:2: rule__Source__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__2"


    // $ANTLR start "rule__Source__Group_6__2__Impl"
    // InternalSpecDsl.g:1952:1: rule__Source__Group_6__2__Impl : ( ( rule__Source__Group_6_2__0 ) ) ;
    public final void rule__Source__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1956:1: ( ( ( rule__Source__Group_6_2__0 ) ) )
            // InternalSpecDsl.g:1957:1: ( ( rule__Source__Group_6_2__0 ) )
            {
            // InternalSpecDsl.g:1957:1: ( ( rule__Source__Group_6_2__0 ) )
            // InternalSpecDsl.g:1958:2: ( rule__Source__Group_6_2__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup_6_2()); 
            // InternalSpecDsl.g:1959:2: ( rule__Source__Group_6_2__0 )
            // InternalSpecDsl.g:1959:3: rule__Source__Group_6_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_6_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6__2__Impl"


    // $ANTLR start "rule__Source__Group_6_2__0"
    // InternalSpecDsl.g:1968:1: rule__Source__Group_6_2__0 : rule__Source__Group_6_2__0__Impl rule__Source__Group_6_2__1 ;
    public final void rule__Source__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1972:1: ( rule__Source__Group_6_2__0__Impl rule__Source__Group_6_2__1 )
            // InternalSpecDsl.g:1973:2: rule__Source__Group_6_2__0__Impl rule__Source__Group_6_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Source__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2__0"


    // $ANTLR start "rule__Source__Group_6_2__0__Impl"
    // InternalSpecDsl.g:1980:1: rule__Source__Group_6_2__0__Impl : ( ( rule__Source__VectorkeysAssignment_6_2_0 ) ) ;
    public final void rule__Source__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1984:1: ( ( ( rule__Source__VectorkeysAssignment_6_2_0 ) ) )
            // InternalSpecDsl.g:1985:1: ( ( rule__Source__VectorkeysAssignment_6_2_0 ) )
            {
            // InternalSpecDsl.g:1985:1: ( ( rule__Source__VectorkeysAssignment_6_2_0 ) )
            // InternalSpecDsl.g:1986:2: ( rule__Source__VectorkeysAssignment_6_2_0 )
            {
             before(grammarAccess.getSourceAccess().getVectorkeysAssignment_6_2_0()); 
            // InternalSpecDsl.g:1987:2: ( rule__Source__VectorkeysAssignment_6_2_0 )
            // InternalSpecDsl.g:1987:3: rule__Source__VectorkeysAssignment_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Source__VectorkeysAssignment_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getVectorkeysAssignment_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2__0__Impl"


    // $ANTLR start "rule__Source__Group_6_2__1"
    // InternalSpecDsl.g:1995:1: rule__Source__Group_6_2__1 : rule__Source__Group_6_2__1__Impl rule__Source__Group_6_2__2 ;
    public final void rule__Source__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:1999:1: ( rule__Source__Group_6_2__1__Impl rule__Source__Group_6_2__2 )
            // InternalSpecDsl.g:2000:2: rule__Source__Group_6_2__1__Impl rule__Source__Group_6_2__2
            {
            pushFollow(FOLLOW_26);
            rule__Source__Group_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_6_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2__1"


    // $ANTLR start "rule__Source__Group_6_2__1__Impl"
    // InternalSpecDsl.g:2007:1: rule__Source__Group_6_2__1__Impl : ( ( rule__Source__Group_6_2_1__0 )* ) ;
    public final void rule__Source__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2011:1: ( ( ( rule__Source__Group_6_2_1__0 )* ) )
            // InternalSpecDsl.g:2012:1: ( ( rule__Source__Group_6_2_1__0 )* )
            {
            // InternalSpecDsl.g:2012:1: ( ( rule__Source__Group_6_2_1__0 )* )
            // InternalSpecDsl.g:2013:2: ( rule__Source__Group_6_2_1__0 )*
            {
             before(grammarAccess.getSourceAccess().getGroup_6_2_1()); 
            // InternalSpecDsl.g:2014:2: ( rule__Source__Group_6_2_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSpecDsl.g:2014:3: rule__Source__Group_6_2_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Source__Group_6_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getGroup_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2__1__Impl"


    // $ANTLR start "rule__Source__Group_6_2__2"
    // InternalSpecDsl.g:2022:1: rule__Source__Group_6_2__2 : rule__Source__Group_6_2__2__Impl ;
    public final void rule__Source__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2026:1: ( rule__Source__Group_6_2__2__Impl )
            // InternalSpecDsl.g:2027:2: rule__Source__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_6_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2__2"


    // $ANTLR start "rule__Source__Group_6_2__2__Impl"
    // InternalSpecDsl.g:2033:1: rule__Source__Group_6_2__2__Impl : ( '}' ) ;
    public final void rule__Source__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2037:1: ( ( '}' ) )
            // InternalSpecDsl.g:2038:1: ( '}' )
            {
            // InternalSpecDsl.g:2038:1: ( '}' )
            // InternalSpecDsl.g:2039:2: '}'
            {
             before(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_6_2_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_6_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2__2__Impl"


    // $ANTLR start "rule__Source__Group_6_2_1__0"
    // InternalSpecDsl.g:2049:1: rule__Source__Group_6_2_1__0 : rule__Source__Group_6_2_1__0__Impl rule__Source__Group_6_2_1__1 ;
    public final void rule__Source__Group_6_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2053:1: ( rule__Source__Group_6_2_1__0__Impl rule__Source__Group_6_2_1__1 )
            // InternalSpecDsl.g:2054:2: rule__Source__Group_6_2_1__0__Impl rule__Source__Group_6_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_6_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_6_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2_1__0"


    // $ANTLR start "rule__Source__Group_6_2_1__0__Impl"
    // InternalSpecDsl.g:2061:1: rule__Source__Group_6_2_1__0__Impl : ( ',' ) ;
    public final void rule__Source__Group_6_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2065:1: ( ( ',' ) )
            // InternalSpecDsl.g:2066:1: ( ',' )
            {
            // InternalSpecDsl.g:2066:1: ( ',' )
            // InternalSpecDsl.g:2067:2: ','
            {
             before(grammarAccess.getSourceAccess().getCommaKeyword_6_2_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getCommaKeyword_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2_1__0__Impl"


    // $ANTLR start "rule__Source__Group_6_2_1__1"
    // InternalSpecDsl.g:2076:1: rule__Source__Group_6_2_1__1 : rule__Source__Group_6_2_1__1__Impl ;
    public final void rule__Source__Group_6_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2080:1: ( rule__Source__Group_6_2_1__1__Impl )
            // InternalSpecDsl.g:2081:2: rule__Source__Group_6_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_6_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2_1__1"


    // $ANTLR start "rule__Source__Group_6_2_1__1__Impl"
    // InternalSpecDsl.g:2087:1: rule__Source__Group_6_2_1__1__Impl : ( ( rule__Source__VectorkeysAssignment_6_2_1_1 ) ) ;
    public final void rule__Source__Group_6_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2091:1: ( ( ( rule__Source__VectorkeysAssignment_6_2_1_1 ) ) )
            // InternalSpecDsl.g:2092:1: ( ( rule__Source__VectorkeysAssignment_6_2_1_1 ) )
            {
            // InternalSpecDsl.g:2092:1: ( ( rule__Source__VectorkeysAssignment_6_2_1_1 ) )
            // InternalSpecDsl.g:2093:2: ( rule__Source__VectorkeysAssignment_6_2_1_1 )
            {
             before(grammarAccess.getSourceAccess().getVectorkeysAssignment_6_2_1_1()); 
            // InternalSpecDsl.g:2094:2: ( rule__Source__VectorkeysAssignment_6_2_1_1 )
            // InternalSpecDsl.g:2094:3: rule__Source__VectorkeysAssignment_6_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__VectorkeysAssignment_6_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getVectorkeysAssignment_6_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_6_2_1__1__Impl"


    // $ANTLR start "rule__Source__Group_7__0"
    // InternalSpecDsl.g:2103:1: rule__Source__Group_7__0 : rule__Source__Group_7__0__Impl rule__Source__Group_7__1 ;
    public final void rule__Source__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2107:1: ( rule__Source__Group_7__0__Impl rule__Source__Group_7__1 )
            // InternalSpecDsl.g:2108:2: rule__Source__Group_7__0__Impl rule__Source__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_7__0"


    // $ANTLR start "rule__Source__Group_7__0__Impl"
    // InternalSpecDsl.g:2115:1: rule__Source__Group_7__0__Impl : ( 'JoinViaLink' ) ;
    public final void rule__Source__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2119:1: ( ( 'JoinViaLink' ) )
            // InternalSpecDsl.g:2120:1: ( 'JoinViaLink' )
            {
            // InternalSpecDsl.g:2120:1: ( 'JoinViaLink' )
            // InternalSpecDsl.g:2121:2: 'JoinViaLink'
            {
             before(grammarAccess.getSourceAccess().getJoinViaLinkKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getJoinViaLinkKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_7__0__Impl"


    // $ANTLR start "rule__Source__Group_7__1"
    // InternalSpecDsl.g:2130:1: rule__Source__Group_7__1 : rule__Source__Group_7__1__Impl ;
    public final void rule__Source__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2134:1: ( rule__Source__Group_7__1__Impl )
            // InternalSpecDsl.g:2135:2: rule__Source__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_7__1"


    // $ANTLR start "rule__Source__Group_7__1__Impl"
    // InternalSpecDsl.g:2141:1: rule__Source__Group_7__1__Impl : ( ( rule__Source__SourceReleationshipAssignment_7_1 ) ) ;
    public final void rule__Source__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2145:1: ( ( ( rule__Source__SourceReleationshipAssignment_7_1 ) ) )
            // InternalSpecDsl.g:2146:1: ( ( rule__Source__SourceReleationshipAssignment_7_1 ) )
            {
            // InternalSpecDsl.g:2146:1: ( ( rule__Source__SourceReleationshipAssignment_7_1 ) )
            // InternalSpecDsl.g:2147:2: ( rule__Source__SourceReleationshipAssignment_7_1 )
            {
             before(grammarAccess.getSourceAccess().getSourceReleationshipAssignment_7_1()); 
            // InternalSpecDsl.g:2148:2: ( rule__Source__SourceReleationshipAssignment_7_1 )
            // InternalSpecDsl.g:2148:3: rule__Source__SourceReleationshipAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__SourceReleationshipAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getSourceReleationshipAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_7__1__Impl"


    // $ANTLR start "rule__Source__Group_8__0"
    // InternalSpecDsl.g:2157:1: rule__Source__Group_8__0 : rule__Source__Group_8__0__Impl rule__Source__Group_8__1 ;
    public final void rule__Source__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2161:1: ( rule__Source__Group_8__0__Impl rule__Source__Group_8__1 )
            // InternalSpecDsl.g:2162:2: rule__Source__Group_8__0__Impl rule__Source__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Source__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_8__0"


    // $ANTLR start "rule__Source__Group_8__0__Impl"
    // InternalSpecDsl.g:2169:1: rule__Source__Group_8__0__Impl : ( 'JoinComment' ) ;
    public final void rule__Source__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2173:1: ( ( 'JoinComment' ) )
            // InternalSpecDsl.g:2174:1: ( 'JoinComment' )
            {
            // InternalSpecDsl.g:2174:1: ( 'JoinComment' )
            // InternalSpecDsl.g:2175:2: 'JoinComment'
            {
             before(grammarAccess.getSourceAccess().getJoinCommentKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getJoinCommentKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_8__0__Impl"


    // $ANTLR start "rule__Source__Group_8__1"
    // InternalSpecDsl.g:2184:1: rule__Source__Group_8__1 : rule__Source__Group_8__1__Impl ;
    public final void rule__Source__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2188:1: ( rule__Source__Group_8__1__Impl )
            // InternalSpecDsl.g:2189:2: rule__Source__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_8__1"


    // $ANTLR start "rule__Source__Group_8__1__Impl"
    // InternalSpecDsl.g:2195:1: rule__Source__Group_8__1__Impl : ( ( rule__Source__JoinCommentAssignment_8_1 ) ) ;
    public final void rule__Source__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2199:1: ( ( ( rule__Source__JoinCommentAssignment_8_1 ) ) )
            // InternalSpecDsl.g:2200:1: ( ( rule__Source__JoinCommentAssignment_8_1 ) )
            {
            // InternalSpecDsl.g:2200:1: ( ( rule__Source__JoinCommentAssignment_8_1 ) )
            // InternalSpecDsl.g:2201:2: ( rule__Source__JoinCommentAssignment_8_1 )
            {
             before(grammarAccess.getSourceAccess().getJoinCommentAssignment_8_1()); 
            // InternalSpecDsl.g:2202:2: ( rule__Source__JoinCommentAssignment_8_1 )
            // InternalSpecDsl.g:2202:3: rule__Source__JoinCommentAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__JoinCommentAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getJoinCommentAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_8__1__Impl"


    // $ANTLR start "rule__Source__Group_9__0"
    // InternalSpecDsl.g:2211:1: rule__Source__Group_9__0 : rule__Source__Group_9__0__Impl rule__Source__Group_9__1 ;
    public final void rule__Source__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2215:1: ( rule__Source__Group_9__0__Impl rule__Source__Group_9__1 )
            // InternalSpecDsl.g:2216:2: rule__Source__Group_9__0__Impl rule__Source__Group_9__1
            {
            pushFollow(FOLLOW_7);
            rule__Source__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__0"


    // $ANTLR start "rule__Source__Group_9__0__Impl"
    // InternalSpecDsl.g:2223:1: rule__Source__Group_9__0__Impl : ( 'PrimaryJoinFields' ) ;
    public final void rule__Source__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2227:1: ( ( 'PrimaryJoinFields' ) )
            // InternalSpecDsl.g:2228:1: ( 'PrimaryJoinFields' )
            {
            // InternalSpecDsl.g:2228:1: ( 'PrimaryJoinFields' )
            // InternalSpecDsl.g:2229:2: 'PrimaryJoinFields'
            {
             before(grammarAccess.getSourceAccess().getPrimaryJoinFieldsKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getPrimaryJoinFieldsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__0__Impl"


    // $ANTLR start "rule__Source__Group_9__1"
    // InternalSpecDsl.g:2238:1: rule__Source__Group_9__1 : rule__Source__Group_9__1__Impl rule__Source__Group_9__2 ;
    public final void rule__Source__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2242:1: ( rule__Source__Group_9__1__Impl rule__Source__Group_9__2 )
            // InternalSpecDsl.g:2243:2: rule__Source__Group_9__1__Impl rule__Source__Group_9__2
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__1"


    // $ANTLR start "rule__Source__Group_9__1__Impl"
    // InternalSpecDsl.g:2250:1: rule__Source__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Source__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2254:1: ( ( '{' ) )
            // InternalSpecDsl.g:2255:1: ( '{' )
            {
            // InternalSpecDsl.g:2255:1: ( '{' )
            // InternalSpecDsl.g:2256:2: '{'
            {
             before(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__1__Impl"


    // $ANTLR start "rule__Source__Group_9__2"
    // InternalSpecDsl.g:2265:1: rule__Source__Group_9__2 : rule__Source__Group_9__2__Impl rule__Source__Group_9__3 ;
    public final void rule__Source__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2269:1: ( rule__Source__Group_9__2__Impl rule__Source__Group_9__3 )
            // InternalSpecDsl.g:2270:2: rule__Source__Group_9__2__Impl rule__Source__Group_9__3
            {
            pushFollow(FOLLOW_10);
            rule__Source__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__2"


    // $ANTLR start "rule__Source__Group_9__2__Impl"
    // InternalSpecDsl.g:2277:1: rule__Source__Group_9__2__Impl : ( ( rule__Source__Group_9_2__0 ) ) ;
    public final void rule__Source__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2281:1: ( ( ( rule__Source__Group_9_2__0 ) ) )
            // InternalSpecDsl.g:2282:1: ( ( rule__Source__Group_9_2__0 ) )
            {
            // InternalSpecDsl.g:2282:1: ( ( rule__Source__Group_9_2__0 ) )
            // InternalSpecDsl.g:2283:2: ( rule__Source__Group_9_2__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup_9_2()); 
            // InternalSpecDsl.g:2284:2: ( rule__Source__Group_9_2__0 )
            // InternalSpecDsl.g:2284:3: rule__Source__Group_9_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_9_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__2__Impl"


    // $ANTLR start "rule__Source__Group_9__3"
    // InternalSpecDsl.g:2292:1: rule__Source__Group_9__3 : rule__Source__Group_9__3__Impl ;
    public final void rule__Source__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2296:1: ( rule__Source__Group_9__3__Impl )
            // InternalSpecDsl.g:2297:2: rule__Source__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__3"


    // $ANTLR start "rule__Source__Group_9__3__Impl"
    // InternalSpecDsl.g:2303:1: rule__Source__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Source__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2307:1: ( ( '}' ) )
            // InternalSpecDsl.g:2308:1: ( '}' )
            {
            // InternalSpecDsl.g:2308:1: ( '}' )
            // InternalSpecDsl.g:2309:2: '}'
            {
             before(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9__3__Impl"


    // $ANTLR start "rule__Source__Group_9_2__0"
    // InternalSpecDsl.g:2319:1: rule__Source__Group_9_2__0 : rule__Source__Group_9_2__0__Impl rule__Source__Group_9_2__1 ;
    public final void rule__Source__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2323:1: ( rule__Source__Group_9_2__0__Impl rule__Source__Group_9_2__1 )
            // InternalSpecDsl.g:2324:2: rule__Source__Group_9_2__0__Impl rule__Source__Group_9_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Source__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2__0"


    // $ANTLR start "rule__Source__Group_9_2__0__Impl"
    // InternalSpecDsl.g:2331:1: rule__Source__Group_9_2__0__Impl : ( ( rule__Source__ParentJoinFieldsAssignment_9_2_0 ) ) ;
    public final void rule__Source__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2335:1: ( ( ( rule__Source__ParentJoinFieldsAssignment_9_2_0 ) ) )
            // InternalSpecDsl.g:2336:1: ( ( rule__Source__ParentJoinFieldsAssignment_9_2_0 ) )
            {
            // InternalSpecDsl.g:2336:1: ( ( rule__Source__ParentJoinFieldsAssignment_9_2_0 ) )
            // InternalSpecDsl.g:2337:2: ( rule__Source__ParentJoinFieldsAssignment_9_2_0 )
            {
             before(grammarAccess.getSourceAccess().getParentJoinFieldsAssignment_9_2_0()); 
            // InternalSpecDsl.g:2338:2: ( rule__Source__ParentJoinFieldsAssignment_9_2_0 )
            // InternalSpecDsl.g:2338:3: rule__Source__ParentJoinFieldsAssignment_9_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Source__ParentJoinFieldsAssignment_9_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getParentJoinFieldsAssignment_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2__0__Impl"


    // $ANTLR start "rule__Source__Group_9_2__1"
    // InternalSpecDsl.g:2346:1: rule__Source__Group_9_2__1 : rule__Source__Group_9_2__1__Impl ;
    public final void rule__Source__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2350:1: ( rule__Source__Group_9_2__1__Impl )
            // InternalSpecDsl.g:2351:2: rule__Source__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2__1"


    // $ANTLR start "rule__Source__Group_9_2__1__Impl"
    // InternalSpecDsl.g:2357:1: rule__Source__Group_9_2__1__Impl : ( ( rule__Source__Group_9_2_1__0 )* ) ;
    public final void rule__Source__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2361:1: ( ( ( rule__Source__Group_9_2_1__0 )* ) )
            // InternalSpecDsl.g:2362:1: ( ( rule__Source__Group_9_2_1__0 )* )
            {
            // InternalSpecDsl.g:2362:1: ( ( rule__Source__Group_9_2_1__0 )* )
            // InternalSpecDsl.g:2363:2: ( rule__Source__Group_9_2_1__0 )*
            {
             before(grammarAccess.getSourceAccess().getGroup_9_2_1()); 
            // InternalSpecDsl.g:2364:2: ( rule__Source__Group_9_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSpecDsl.g:2364:3: rule__Source__Group_9_2_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Source__Group_9_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getGroup_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2__1__Impl"


    // $ANTLR start "rule__Source__Group_9_2_1__0"
    // InternalSpecDsl.g:2373:1: rule__Source__Group_9_2_1__0 : rule__Source__Group_9_2_1__0__Impl rule__Source__Group_9_2_1__1 ;
    public final void rule__Source__Group_9_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2377:1: ( rule__Source__Group_9_2_1__0__Impl rule__Source__Group_9_2_1__1 )
            // InternalSpecDsl.g:2378:2: rule__Source__Group_9_2_1__0__Impl rule__Source__Group_9_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_9_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_9_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2_1__0"


    // $ANTLR start "rule__Source__Group_9_2_1__0__Impl"
    // InternalSpecDsl.g:2385:1: rule__Source__Group_9_2_1__0__Impl : ( ',' ) ;
    public final void rule__Source__Group_9_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2389:1: ( ( ',' ) )
            // InternalSpecDsl.g:2390:1: ( ',' )
            {
            // InternalSpecDsl.g:2390:1: ( ',' )
            // InternalSpecDsl.g:2391:2: ','
            {
             before(grammarAccess.getSourceAccess().getCommaKeyword_9_2_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getCommaKeyword_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2_1__0__Impl"


    // $ANTLR start "rule__Source__Group_9_2_1__1"
    // InternalSpecDsl.g:2400:1: rule__Source__Group_9_2_1__1 : rule__Source__Group_9_2_1__1__Impl ;
    public final void rule__Source__Group_9_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2404:1: ( rule__Source__Group_9_2_1__1__Impl )
            // InternalSpecDsl.g:2405:2: rule__Source__Group_9_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_9_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2_1__1"


    // $ANTLR start "rule__Source__Group_9_2_1__1__Impl"
    // InternalSpecDsl.g:2411:1: rule__Source__Group_9_2_1__1__Impl : ( ( rule__Source__ParentJoinFieldsAssignment_9_2_1_1 ) ) ;
    public final void rule__Source__Group_9_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2415:1: ( ( ( rule__Source__ParentJoinFieldsAssignment_9_2_1_1 ) ) )
            // InternalSpecDsl.g:2416:1: ( ( rule__Source__ParentJoinFieldsAssignment_9_2_1_1 ) )
            {
            // InternalSpecDsl.g:2416:1: ( ( rule__Source__ParentJoinFieldsAssignment_9_2_1_1 ) )
            // InternalSpecDsl.g:2417:2: ( rule__Source__ParentJoinFieldsAssignment_9_2_1_1 )
            {
             before(grammarAccess.getSourceAccess().getParentJoinFieldsAssignment_9_2_1_1()); 
            // InternalSpecDsl.g:2418:2: ( rule__Source__ParentJoinFieldsAssignment_9_2_1_1 )
            // InternalSpecDsl.g:2418:3: rule__Source__ParentJoinFieldsAssignment_9_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__ParentJoinFieldsAssignment_9_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getParentJoinFieldsAssignment_9_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_9_2_1__1__Impl"


    // $ANTLR start "rule__Source__Group_10__0"
    // InternalSpecDsl.g:2427:1: rule__Source__Group_10__0 : rule__Source__Group_10__0__Impl rule__Source__Group_10__1 ;
    public final void rule__Source__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2431:1: ( rule__Source__Group_10__0__Impl rule__Source__Group_10__1 )
            // InternalSpecDsl.g:2432:2: rule__Source__Group_10__0__Impl rule__Source__Group_10__1
            {
            pushFollow(FOLLOW_7);
            rule__Source__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__0"


    // $ANTLR start "rule__Source__Group_10__0__Impl"
    // InternalSpecDsl.g:2439:1: rule__Source__Group_10__0__Impl : ( 'SecondaryJoinField' ) ;
    public final void rule__Source__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2443:1: ( ( 'SecondaryJoinField' ) )
            // InternalSpecDsl.g:2444:1: ( 'SecondaryJoinField' )
            {
            // InternalSpecDsl.g:2444:1: ( 'SecondaryJoinField' )
            // InternalSpecDsl.g:2445:2: 'SecondaryJoinField'
            {
             before(grammarAccess.getSourceAccess().getSecondaryJoinFieldKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getSecondaryJoinFieldKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__0__Impl"


    // $ANTLR start "rule__Source__Group_10__1"
    // InternalSpecDsl.g:2454:1: rule__Source__Group_10__1 : rule__Source__Group_10__1__Impl rule__Source__Group_10__2 ;
    public final void rule__Source__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2458:1: ( rule__Source__Group_10__1__Impl rule__Source__Group_10__2 )
            // InternalSpecDsl.g:2459:2: rule__Source__Group_10__1__Impl rule__Source__Group_10__2
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__1"


    // $ANTLR start "rule__Source__Group_10__1__Impl"
    // InternalSpecDsl.g:2466:1: rule__Source__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Source__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2470:1: ( ( '{' ) )
            // InternalSpecDsl.g:2471:1: ( '{' )
            {
            // InternalSpecDsl.g:2471:1: ( '{' )
            // InternalSpecDsl.g:2472:2: '{'
            {
             before(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__1__Impl"


    // $ANTLR start "rule__Source__Group_10__2"
    // InternalSpecDsl.g:2481:1: rule__Source__Group_10__2 : rule__Source__Group_10__2__Impl rule__Source__Group_10__3 ;
    public final void rule__Source__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2485:1: ( rule__Source__Group_10__2__Impl rule__Source__Group_10__3 )
            // InternalSpecDsl.g:2486:2: rule__Source__Group_10__2__Impl rule__Source__Group_10__3
            {
            pushFollow(FOLLOW_10);
            rule__Source__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__2"


    // $ANTLR start "rule__Source__Group_10__2__Impl"
    // InternalSpecDsl.g:2493:1: rule__Source__Group_10__2__Impl : ( ( rule__Source__Group_10_2__0 ) ) ;
    public final void rule__Source__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2497:1: ( ( ( rule__Source__Group_10_2__0 ) ) )
            // InternalSpecDsl.g:2498:1: ( ( rule__Source__Group_10_2__0 ) )
            {
            // InternalSpecDsl.g:2498:1: ( ( rule__Source__Group_10_2__0 ) )
            // InternalSpecDsl.g:2499:2: ( rule__Source__Group_10_2__0 )
            {
             before(grammarAccess.getSourceAccess().getGroup_10_2()); 
            // InternalSpecDsl.g:2500:2: ( rule__Source__Group_10_2__0 )
            // InternalSpecDsl.g:2500:3: rule__Source__Group_10_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_10_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__2__Impl"


    // $ANTLR start "rule__Source__Group_10__3"
    // InternalSpecDsl.g:2508:1: rule__Source__Group_10__3 : rule__Source__Group_10__3__Impl ;
    public final void rule__Source__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2512:1: ( rule__Source__Group_10__3__Impl )
            // InternalSpecDsl.g:2513:2: rule__Source__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__3"


    // $ANTLR start "rule__Source__Group_10__3__Impl"
    // InternalSpecDsl.g:2519:1: rule__Source__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Source__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2523:1: ( ( '}' ) )
            // InternalSpecDsl.g:2524:1: ( '}' )
            {
            // InternalSpecDsl.g:2524:1: ( '}' )
            // InternalSpecDsl.g:2525:2: '}'
            {
             before(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10__3__Impl"


    // $ANTLR start "rule__Source__Group_10_2__0"
    // InternalSpecDsl.g:2535:1: rule__Source__Group_10_2__0 : rule__Source__Group_10_2__0__Impl rule__Source__Group_10_2__1 ;
    public final void rule__Source__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2539:1: ( rule__Source__Group_10_2__0__Impl rule__Source__Group_10_2__1 )
            // InternalSpecDsl.g:2540:2: rule__Source__Group_10_2__0__Impl rule__Source__Group_10_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Source__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2__0"


    // $ANTLR start "rule__Source__Group_10_2__0__Impl"
    // InternalSpecDsl.g:2547:1: rule__Source__Group_10_2__0__Impl : ( ( rule__Source__ChildJoinFieldAssignment_10_2_0 ) ) ;
    public final void rule__Source__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2551:1: ( ( ( rule__Source__ChildJoinFieldAssignment_10_2_0 ) ) )
            // InternalSpecDsl.g:2552:1: ( ( rule__Source__ChildJoinFieldAssignment_10_2_0 ) )
            {
            // InternalSpecDsl.g:2552:1: ( ( rule__Source__ChildJoinFieldAssignment_10_2_0 ) )
            // InternalSpecDsl.g:2553:2: ( rule__Source__ChildJoinFieldAssignment_10_2_0 )
            {
             before(grammarAccess.getSourceAccess().getChildJoinFieldAssignment_10_2_0()); 
            // InternalSpecDsl.g:2554:2: ( rule__Source__ChildJoinFieldAssignment_10_2_0 )
            // InternalSpecDsl.g:2554:3: rule__Source__ChildJoinFieldAssignment_10_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Source__ChildJoinFieldAssignment_10_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getChildJoinFieldAssignment_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2__0__Impl"


    // $ANTLR start "rule__Source__Group_10_2__1"
    // InternalSpecDsl.g:2562:1: rule__Source__Group_10_2__1 : rule__Source__Group_10_2__1__Impl ;
    public final void rule__Source__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2566:1: ( rule__Source__Group_10_2__1__Impl )
            // InternalSpecDsl.g:2567:2: rule__Source__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2__1"


    // $ANTLR start "rule__Source__Group_10_2__1__Impl"
    // InternalSpecDsl.g:2573:1: rule__Source__Group_10_2__1__Impl : ( ( rule__Source__Group_10_2_1__0 )* ) ;
    public final void rule__Source__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2577:1: ( ( ( rule__Source__Group_10_2_1__0 )* ) )
            // InternalSpecDsl.g:2578:1: ( ( rule__Source__Group_10_2_1__0 )* )
            {
            // InternalSpecDsl.g:2578:1: ( ( rule__Source__Group_10_2_1__0 )* )
            // InternalSpecDsl.g:2579:2: ( rule__Source__Group_10_2_1__0 )*
            {
             before(grammarAccess.getSourceAccess().getGroup_10_2_1()); 
            // InternalSpecDsl.g:2580:2: ( rule__Source__Group_10_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSpecDsl.g:2580:3: rule__Source__Group_10_2_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Source__Group_10_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSourceAccess().getGroup_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2__1__Impl"


    // $ANTLR start "rule__Source__Group_10_2_1__0"
    // InternalSpecDsl.g:2589:1: rule__Source__Group_10_2_1__0 : rule__Source__Group_10_2_1__0__Impl rule__Source__Group_10_2_1__1 ;
    public final void rule__Source__Group_10_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2593:1: ( rule__Source__Group_10_2_1__0__Impl rule__Source__Group_10_2_1__1 )
            // InternalSpecDsl.g:2594:2: rule__Source__Group_10_2_1__0__Impl rule__Source__Group_10_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_10_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_10_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2_1__0"


    // $ANTLR start "rule__Source__Group_10_2_1__0__Impl"
    // InternalSpecDsl.g:2601:1: rule__Source__Group_10_2_1__0__Impl : ( ',' ) ;
    public final void rule__Source__Group_10_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2605:1: ( ( ',' ) )
            // InternalSpecDsl.g:2606:1: ( ',' )
            {
            // InternalSpecDsl.g:2606:1: ( ',' )
            // InternalSpecDsl.g:2607:2: ','
            {
             before(grammarAccess.getSourceAccess().getCommaKeyword_10_2_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getCommaKeyword_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2_1__0__Impl"


    // $ANTLR start "rule__Source__Group_10_2_1__1"
    // InternalSpecDsl.g:2616:1: rule__Source__Group_10_2_1__1 : rule__Source__Group_10_2_1__1__Impl ;
    public final void rule__Source__Group_10_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2620:1: ( rule__Source__Group_10_2_1__1__Impl )
            // InternalSpecDsl.g:2621:2: rule__Source__Group_10_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_10_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2_1__1"


    // $ANTLR start "rule__Source__Group_10_2_1__1__Impl"
    // InternalSpecDsl.g:2627:1: rule__Source__Group_10_2_1__1__Impl : ( ( rule__Source__ChildJoinFieldAssignment_10_2_1_1 ) ) ;
    public final void rule__Source__Group_10_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2631:1: ( ( ( rule__Source__ChildJoinFieldAssignment_10_2_1_1 ) ) )
            // InternalSpecDsl.g:2632:1: ( ( rule__Source__ChildJoinFieldAssignment_10_2_1_1 ) )
            {
            // InternalSpecDsl.g:2632:1: ( ( rule__Source__ChildJoinFieldAssignment_10_2_1_1 ) )
            // InternalSpecDsl.g:2633:2: ( rule__Source__ChildJoinFieldAssignment_10_2_1_1 )
            {
             before(grammarAccess.getSourceAccess().getChildJoinFieldAssignment_10_2_1_1()); 
            // InternalSpecDsl.g:2634:2: ( rule__Source__ChildJoinFieldAssignment_10_2_1_1 )
            // InternalSpecDsl.g:2634:3: rule__Source__ChildJoinFieldAssignment_10_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__ChildJoinFieldAssignment_10_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getChildJoinFieldAssignment_10_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_10_2_1__1__Impl"


    // $ANTLR start "rule__Source__Group_11__0"
    // InternalSpecDsl.g:2643:1: rule__Source__Group_11__0 : rule__Source__Group_11__0__Impl rule__Source__Group_11__1 ;
    public final void rule__Source__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2647:1: ( rule__Source__Group_11__0__Impl rule__Source__Group_11__1 )
            // InternalSpecDsl.g:2648:2: rule__Source__Group_11__0__Impl rule__Source__Group_11__1
            {
            pushFollow(FOLLOW_29);
            rule__Source__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_11__0"


    // $ANTLR start "rule__Source__Group_11__0__Impl"
    // InternalSpecDsl.g:2655:1: rule__Source__Group_11__0__Impl : ( 'JoinType' ) ;
    public final void rule__Source__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2659:1: ( ( 'JoinType' ) )
            // InternalSpecDsl.g:2660:1: ( 'JoinType' )
            {
            // InternalSpecDsl.g:2660:1: ( 'JoinType' )
            // InternalSpecDsl.g:2661:2: 'JoinType'
            {
             before(grammarAccess.getSourceAccess().getJoinTypeKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getJoinTypeKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_11__0__Impl"


    // $ANTLR start "rule__Source__Group_11__1"
    // InternalSpecDsl.g:2670:1: rule__Source__Group_11__1 : rule__Source__Group_11__1__Impl ;
    public final void rule__Source__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2674:1: ( rule__Source__Group_11__1__Impl )
            // InternalSpecDsl.g:2675:2: rule__Source__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_11__1"


    // $ANTLR start "rule__Source__Group_11__1__Impl"
    // InternalSpecDsl.g:2681:1: rule__Source__Group_11__1__Impl : ( ( rule__Source__JoinTypeAssignment_11_1 ) ) ;
    public final void rule__Source__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2685:1: ( ( ( rule__Source__JoinTypeAssignment_11_1 ) ) )
            // InternalSpecDsl.g:2686:1: ( ( rule__Source__JoinTypeAssignment_11_1 ) )
            {
            // InternalSpecDsl.g:2686:1: ( ( rule__Source__JoinTypeAssignment_11_1 ) )
            // InternalSpecDsl.g:2687:2: ( rule__Source__JoinTypeAssignment_11_1 )
            {
             before(grammarAccess.getSourceAccess().getJoinTypeAssignment_11_1()); 
            // InternalSpecDsl.g:2688:2: ( rule__Source__JoinTypeAssignment_11_1 )
            // InternalSpecDsl.g:2688:3: rule__Source__JoinTypeAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__JoinTypeAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getJoinTypeAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_11__1__Impl"


    // $ANTLR start "rule__Source__Group_12__0"
    // InternalSpecDsl.g:2697:1: rule__Source__Group_12__0 : rule__Source__Group_12__0__Impl rule__Source__Group_12__1 ;
    public final void rule__Source__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2701:1: ( rule__Source__Group_12__0__Impl rule__Source__Group_12__1 )
            // InternalSpecDsl.g:2702:2: rule__Source__Group_12__0__Impl rule__Source__Group_12__1
            {
            pushFollow(FOLLOW_13);
            rule__Source__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_12__0"


    // $ANTLR start "rule__Source__Group_12__0__Impl"
    // InternalSpecDsl.g:2709:1: rule__Source__Group_12__0__Impl : ( '[' ) ;
    public final void rule__Source__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2713:1: ( ( '[' ) )
            // InternalSpecDsl.g:2714:1: ( '[' )
            {
            // InternalSpecDsl.g:2714:1: ( '[' )
            // InternalSpecDsl.g:2715:2: '['
            {
             before(grammarAccess.getSourceAccess().getLeftSquareBracketKeyword_12_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getLeftSquareBracketKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_12__0__Impl"


    // $ANTLR start "rule__Source__Group_12__1"
    // InternalSpecDsl.g:2724:1: rule__Source__Group_12__1 : rule__Source__Group_12__1__Impl rule__Source__Group_12__2 ;
    public final void rule__Source__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2728:1: ( rule__Source__Group_12__1__Impl rule__Source__Group_12__2 )
            // InternalSpecDsl.g:2729:2: rule__Source__Group_12__1__Impl rule__Source__Group_12__2
            {
            pushFollow(FOLLOW_22);
            rule__Source__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Source__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_12__1"


    // $ANTLR start "rule__Source__Group_12__1__Impl"
    // InternalSpecDsl.g:2736:1: rule__Source__Group_12__1__Impl : ( ( rule__Source__ChildSourcesAssignment_12_1 ) ) ;
    public final void rule__Source__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2740:1: ( ( ( rule__Source__ChildSourcesAssignment_12_1 ) ) )
            // InternalSpecDsl.g:2741:1: ( ( rule__Source__ChildSourcesAssignment_12_1 ) )
            {
            // InternalSpecDsl.g:2741:1: ( ( rule__Source__ChildSourcesAssignment_12_1 ) )
            // InternalSpecDsl.g:2742:2: ( rule__Source__ChildSourcesAssignment_12_1 )
            {
             before(grammarAccess.getSourceAccess().getChildSourcesAssignment_12_1()); 
            // InternalSpecDsl.g:2743:2: ( rule__Source__ChildSourcesAssignment_12_1 )
            // InternalSpecDsl.g:2743:3: rule__Source__ChildSourcesAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Source__ChildSourcesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getChildSourcesAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_12__1__Impl"


    // $ANTLR start "rule__Source__Group_12__2"
    // InternalSpecDsl.g:2751:1: rule__Source__Group_12__2 : rule__Source__Group_12__2__Impl ;
    public final void rule__Source__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2755:1: ( rule__Source__Group_12__2__Impl )
            // InternalSpecDsl.g:2756:2: rule__Source__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Source__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_12__2"


    // $ANTLR start "rule__Source__Group_12__2__Impl"
    // InternalSpecDsl.g:2762:1: rule__Source__Group_12__2__Impl : ( ']' ) ;
    public final void rule__Source__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2766:1: ( ( ']' ) )
            // InternalSpecDsl.g:2767:1: ( ']' )
            {
            // InternalSpecDsl.g:2767:1: ( ']' )
            // InternalSpecDsl.g:2768:2: ']'
            {
             before(grammarAccess.getSourceAccess().getRightSquareBracketKeyword_12_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getRightSquareBracketKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Group_12__2__Impl"


    // $ANTLR start "rule__SpecPackage__NameAssignment_2"
    // InternalSpecDsl.g:2778:1: rule__SpecPackage__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SpecPackage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2782:1: ( ( ruleEString ) )
            // InternalSpecDsl.g:2783:2: ( ruleEString )
            {
            // InternalSpecDsl.g:2783:2: ( ruleEString )
            // InternalSpecDsl.g:2784:3: ruleEString
            {
             before(grammarAccess.getSpecPackageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecPackageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__NameAssignment_2"


    // $ANTLR start "rule__SpecPackage__SpecificationsAssignment_3"
    // InternalSpecDsl.g:2793:1: rule__SpecPackage__SpecificationsAssignment_3 : ( ruleSpecification ) ;
    public final void rule__SpecPackage__SpecificationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2797:1: ( ( ruleSpecification ) )
            // InternalSpecDsl.g:2798:2: ( ruleSpecification )
            {
            // InternalSpecDsl.g:2798:2: ( ruleSpecification )
            // InternalSpecDsl.g:2799:3: ruleSpecification
            {
             before(grammarAccess.getSpecPackageAccess().getSpecificationsSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecPackageAccess().getSpecificationsSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecPackage__SpecificationsAssignment_3"


    // $ANTLR start "rule__Specification__NameAssignment_1"
    // InternalSpecDsl.g:2808:1: rule__Specification__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Specification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2812:1: ( ( ruleEString ) )
            // InternalSpecDsl.g:2813:2: ( ruleEString )
            {
            // InternalSpecDsl.g:2813:2: ( ruleEString )
            // InternalSpecDsl.g:2814:3: ruleEString
            {
             before(grammarAccess.getSpecificationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__NameAssignment_1"


    // $ANTLR start "rule__Specification__BusinessrulesAssignment_4"
    // InternalSpecDsl.g:2823:1: rule__Specification__BusinessrulesAssignment_4 : ( ruleBusinessRule ) ;
    public final void rule__Specification__BusinessrulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2827:1: ( ( ruleBusinessRule ) )
            // InternalSpecDsl.g:2828:2: ( ruleBusinessRule )
            {
            // InternalSpecDsl.g:2828:2: ( ruleBusinessRule )
            // InternalSpecDsl.g:2829:3: ruleBusinessRule
            {
             before(grammarAccess.getSpecificationAccess().getBusinessrulesBusinessRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBusinessRule();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getBusinessrulesBusinessRuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specification__BusinessrulesAssignment_4"


    // $ANTLR start "rule__BusinessRule__RuleTypeAssignment_2"
    // InternalSpecDsl.g:2838:1: rule__BusinessRule__RuleTypeAssignment_2 : ( ruleRuleType ) ;
    public final void rule__BusinessRule__RuleTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2842:1: ( ( ruleRuleType ) )
            // InternalSpecDsl.g:2843:2: ( ruleRuleType )
            {
            // InternalSpecDsl.g:2843:2: ( ruleRuleType )
            // InternalSpecDsl.g:2844:3: ruleRuleType
            {
             before(grammarAccess.getBusinessRuleAccess().getRuleTypeRuleTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleType();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getRuleTypeRuleTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__RuleTypeAssignment_2"


    // $ANTLR start "rule__BusinessRule__NameAssignment_4"
    // InternalSpecDsl.g:2853:1: rule__BusinessRule__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BusinessRule__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2857:1: ( ( ruleEString ) )
            // InternalSpecDsl.g:2858:2: ( ruleEString )
            {
            // InternalSpecDsl.g:2858:2: ( ruleEString )
            // InternalSpecDsl.g:2859:3: ruleEString
            {
             before(grammarAccess.getBusinessRuleAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__NameAssignment_4"


    // $ANTLR start "rule__BusinessRule__TargetEntityAssignment_5_0_1"
    // InternalSpecDsl.g:2868:1: rule__BusinessRule__TargetEntityAssignment_5_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BusinessRule__TargetEntityAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2872:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:2873:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:2873:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:2874:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetEntityEntityCrossReference_5_0_1_0()); 
            // InternalSpecDsl.g:2875:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:2876:4: ruleQualifiedName
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetEntityEntityQualifiedNameParserRuleCall_5_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getTargetEntityEntityQualifiedNameParserRuleCall_5_0_1_0_1()); 

            }

             after(grammarAccess.getBusinessRuleAccess().getTargetEntityEntityCrossReference_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__TargetEntityAssignment_5_0_1"


    // $ANTLR start "rule__BusinessRule__TargetRelationshipAssignment_5_1_1"
    // InternalSpecDsl.g:2887:1: rule__BusinessRule__TargetRelationshipAssignment_5_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BusinessRule__TargetRelationshipAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2891:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:2892:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:2892:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:2893:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetRelationshipRelationshipCrossReference_5_1_1_0()); 
            // InternalSpecDsl.g:2894:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:2895:4: ruleQualifiedName
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetRelationshipRelationshipQualifiedNameParserRuleCall_5_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getTargetRelationshipRelationshipQualifiedNameParserRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getBusinessRuleAccess().getTargetRelationshipRelationshipCrossReference_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__TargetRelationshipAssignment_5_1_1"


    // $ANTLR start "rule__BusinessRule__TargetIncludeAssignment_5_2_1"
    // InternalSpecDsl.g:2906:1: rule__BusinessRule__TargetIncludeAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__BusinessRule__TargetIncludeAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2910:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:2911:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:2911:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:2912:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetIncludeIncludeCrossReference_5_2_1_0()); 
            // InternalSpecDsl.g:2913:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:2914:4: ruleQualifiedName
            {
             before(grammarAccess.getBusinessRuleAccess().getTargetIncludeIncludeQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getTargetIncludeIncludeQualifiedNameParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getBusinessRuleAccess().getTargetIncludeIncludeCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__TargetIncludeAssignment_5_2_1"


    // $ANTLR start "rule__BusinessRule__SourcesAssignment_6"
    // InternalSpecDsl.g:2925:1: rule__BusinessRule__SourcesAssignment_6 : ( rulePrimarySource ) ;
    public final void rule__BusinessRule__SourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2929:1: ( ( rulePrimarySource ) )
            // InternalSpecDsl.g:2930:2: ( rulePrimarySource )
            {
            // InternalSpecDsl.g:2930:2: ( rulePrimarySource )
            // InternalSpecDsl.g:2931:3: rulePrimarySource
            {
             before(grammarAccess.getBusinessRuleAccess().getSourcesPrimarySourceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimarySource();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getSourcesPrimarySourceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__SourcesAssignment_6"


    // $ANTLR start "rule__PrimarySource__SourceEntityAssignment_1"
    // InternalSpecDsl.g:2940:1: rule__PrimarySource__SourceEntityAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PrimarySource__SourceEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2944:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:2945:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:2945:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:2946:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPrimarySourceAccess().getSourceEntityEntityCrossReference_1_0()); 
            // InternalSpecDsl.g:2947:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:2948:4: ruleQualifiedName
            {
             before(grammarAccess.getPrimarySourceAccess().getSourceEntityEntityQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPrimarySourceAccess().getSourceEntityEntityQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPrimarySourceAccess().getSourceEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__SourceEntityAssignment_1"


    // $ANTLR start "rule__PrimarySource__AliasAssignment_2_1"
    // InternalSpecDsl.g:2959:1: rule__PrimarySource__AliasAssignment_2_1 : ( ruleEString ) ;
    public final void rule__PrimarySource__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2963:1: ( ( ruleEString ) )
            // InternalSpecDsl.g:2964:2: ( ruleEString )
            {
            // InternalSpecDsl.g:2964:2: ( ruleEString )
            // InternalSpecDsl.g:2965:3: ruleEString
            {
             before(grammarAccess.getPrimarySourceAccess().getAliasEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimarySourceAccess().getAliasEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__AliasAssignment_2_1"


    // $ANTLR start "rule__PrimarySource__ChildSourcesAssignment_3_2_0"
    // InternalSpecDsl.g:2974:1: rule__PrimarySource__ChildSourcesAssignment_3_2_0 : ( ruleSource ) ;
    public final void rule__PrimarySource__ChildSourcesAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2978:1: ( ( ruleSource ) )
            // InternalSpecDsl.g:2979:2: ( ruleSource )
            {
            // InternalSpecDsl.g:2979:2: ( ruleSource )
            // InternalSpecDsl.g:2980:3: ruleSource
            {
             before(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__ChildSourcesAssignment_3_2_0"


    // $ANTLR start "rule__PrimarySource__ChildSourcesAssignment_3_2_1"
    // InternalSpecDsl.g:2989:1: rule__PrimarySource__ChildSourcesAssignment_3_2_1 : ( ruleSource ) ;
    public final void rule__PrimarySource__ChildSourcesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:2993:1: ( ( ruleSource ) )
            // InternalSpecDsl.g:2994:2: ( ruleSource )
            {
            // InternalSpecDsl.g:2994:2: ( ruleSource )
            // InternalSpecDsl.g:2995:3: ruleSource
            {
             before(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimarySource__ChildSourcesAssignment_3_2_1"


    // $ANTLR start "rule__Source__SourceEntityAssignment_1"
    // InternalSpecDsl.g:3004:1: rule__Source__SourceEntityAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Source__SourceEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3008:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:3009:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:3009:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:3010:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSourceAccess().getSourceEntityEntityCrossReference_1_0()); 
            // InternalSpecDsl.g:3011:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:3012:4: ruleQualifiedName
            {
             before(grammarAccess.getSourceAccess().getSourceEntityEntityQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getSourceEntityEntityQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSourceAccess().getSourceEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__SourceEntityAssignment_1"


    // $ANTLR start "rule__Source__AliasAssignment_2_1"
    // InternalSpecDsl.g:3023:1: rule__Source__AliasAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Source__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3027:1: ( ( ruleEString ) )
            // InternalSpecDsl.g:3028:2: ( ruleEString )
            {
            // InternalSpecDsl.g:3028:2: ( ruleEString )
            // InternalSpecDsl.g:3029:3: ruleEString
            {
             before(grammarAccess.getSourceAccess().getAliasEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getAliasEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__AliasAssignment_2_1"


    // $ANTLR start "rule__Source__IsMandatoryAssignment_3"
    // InternalSpecDsl.g:3038:1: rule__Source__IsMandatoryAssignment_3 : ( ( 'mandatory' ) ) ;
    public final void rule__Source__IsMandatoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3042:1: ( ( ( 'mandatory' ) ) )
            // InternalSpecDsl.g:3043:2: ( ( 'mandatory' ) )
            {
            // InternalSpecDsl.g:3043:2: ( ( 'mandatory' ) )
            // InternalSpecDsl.g:3044:3: ( 'mandatory' )
            {
             before(grammarAccess.getSourceAccess().getIsMandatoryMandatoryKeyword_3_0()); 
            // InternalSpecDsl.g:3045:3: ( 'mandatory' )
            // InternalSpecDsl.g:3046:4: 'mandatory'
            {
             before(grammarAccess.getSourceAccess().getIsMandatoryMandatoryKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getIsMandatoryMandatoryKeyword_3_0()); 

            }

             after(grammarAccess.getSourceAccess().getIsMandatoryMandatoryKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__IsMandatoryAssignment_3"


    // $ANTLR start "rule__Source__IsMultiplyingAssignment_4"
    // InternalSpecDsl.g:3057:1: rule__Source__IsMultiplyingAssignment_4 : ( ( 'isMultiplying' ) ) ;
    public final void rule__Source__IsMultiplyingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3061:1: ( ( ( 'isMultiplying' ) ) )
            // InternalSpecDsl.g:3062:2: ( ( 'isMultiplying' ) )
            {
            // InternalSpecDsl.g:3062:2: ( ( 'isMultiplying' ) )
            // InternalSpecDsl.g:3063:3: ( 'isMultiplying' )
            {
             before(grammarAccess.getSourceAccess().getIsMultiplyingIsMultiplyingKeyword_4_0()); 
            // InternalSpecDsl.g:3064:3: ( 'isMultiplying' )
            // InternalSpecDsl.g:3065:4: 'isMultiplying'
            {
             before(grammarAccess.getSourceAccess().getIsMultiplyingIsMultiplyingKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getIsMultiplyingIsMultiplyingKeyword_4_0()); 

            }

             after(grammarAccess.getSourceAccess().getIsMultiplyingIsMultiplyingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__IsMultiplyingAssignment_4"


    // $ANTLR start "rule__Source__IsVectorAssignment_5"
    // InternalSpecDsl.g:3076:1: rule__Source__IsVectorAssignment_5 : ( ( 'Vector' ) ) ;
    public final void rule__Source__IsVectorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3080:1: ( ( ( 'Vector' ) ) )
            // InternalSpecDsl.g:3081:2: ( ( 'Vector' ) )
            {
            // InternalSpecDsl.g:3081:2: ( ( 'Vector' ) )
            // InternalSpecDsl.g:3082:3: ( 'Vector' )
            {
             before(grammarAccess.getSourceAccess().getIsVectorVectorKeyword_5_0()); 
            // InternalSpecDsl.g:3083:3: ( 'Vector' )
            // InternalSpecDsl.g:3084:4: 'Vector'
            {
             before(grammarAccess.getSourceAccess().getIsVectorVectorKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSourceAccess().getIsVectorVectorKeyword_5_0()); 

            }

             after(grammarAccess.getSourceAccess().getIsVectorVectorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__IsVectorAssignment_5"


    // $ANTLR start "rule__Source__VectorkeysAssignment_6_2_0"
    // InternalSpecDsl.g:3095:1: rule__Source__VectorkeysAssignment_6_2_0 : ( ruleVectorKey ) ;
    public final void rule__Source__VectorkeysAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3099:1: ( ( ruleVectorKey ) )
            // InternalSpecDsl.g:3100:2: ( ruleVectorKey )
            {
            // InternalSpecDsl.g:3100:2: ( ruleVectorKey )
            // InternalSpecDsl.g:3101:3: ruleVectorKey
            {
             before(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVectorKey();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__VectorkeysAssignment_6_2_0"


    // $ANTLR start "rule__Source__VectorkeysAssignment_6_2_1_1"
    // InternalSpecDsl.g:3110:1: rule__Source__VectorkeysAssignment_6_2_1_1 : ( ruleVectorKey ) ;
    public final void rule__Source__VectorkeysAssignment_6_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3114:1: ( ( ruleVectorKey ) )
            // InternalSpecDsl.g:3115:2: ( ruleVectorKey )
            {
            // InternalSpecDsl.g:3115:2: ( ruleVectorKey )
            // InternalSpecDsl.g:3116:3: ruleVectorKey
            {
             before(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVectorKey();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__VectorkeysAssignment_6_2_1_1"


    // $ANTLR start "rule__Source__SourceReleationshipAssignment_7_1"
    // InternalSpecDsl.g:3125:1: rule__Source__SourceReleationshipAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Source__SourceReleationshipAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3129:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:3130:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:3130:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:3131:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSourceAccess().getSourceReleationshipRelationshipCrossReference_7_1_0()); 
            // InternalSpecDsl.g:3132:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:3133:4: ruleQualifiedName
            {
             before(grammarAccess.getSourceAccess().getSourceReleationshipRelationshipQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getSourceReleationshipRelationshipQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getSourceAccess().getSourceReleationshipRelationshipCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__SourceReleationshipAssignment_7_1"


    // $ANTLR start "rule__Source__JoinCommentAssignment_8_1"
    // InternalSpecDsl.g:3144:1: rule__Source__JoinCommentAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Source__JoinCommentAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3148:1: ( ( ruleEString ) )
            // InternalSpecDsl.g:3149:2: ( ruleEString )
            {
            // InternalSpecDsl.g:3149:2: ( ruleEString )
            // InternalSpecDsl.g:3150:3: ruleEString
            {
             before(grammarAccess.getSourceAccess().getJoinCommentEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getJoinCommentEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__JoinCommentAssignment_8_1"


    // $ANTLR start "rule__Source__ParentJoinFieldsAssignment_9_2_0"
    // InternalSpecDsl.g:3159:1: rule__Source__ParentJoinFieldsAssignment_9_2_0 : ( ruleJoinField ) ;
    public final void rule__Source__ParentJoinFieldsAssignment_9_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3163:1: ( ( ruleJoinField ) )
            // InternalSpecDsl.g:3164:2: ( ruleJoinField )
            {
            // InternalSpecDsl.g:3164:2: ( ruleJoinField )
            // InternalSpecDsl.g:3165:3: ruleJoinField
            {
             before(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinField();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ParentJoinFieldsAssignment_9_2_0"


    // $ANTLR start "rule__Source__ParentJoinFieldsAssignment_9_2_1_1"
    // InternalSpecDsl.g:3174:1: rule__Source__ParentJoinFieldsAssignment_9_2_1_1 : ( ruleJoinField ) ;
    public final void rule__Source__ParentJoinFieldsAssignment_9_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3178:1: ( ( ruleJoinField ) )
            // InternalSpecDsl.g:3179:2: ( ruleJoinField )
            {
            // InternalSpecDsl.g:3179:2: ( ruleJoinField )
            // InternalSpecDsl.g:3180:3: ruleJoinField
            {
             before(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinField();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ParentJoinFieldsAssignment_9_2_1_1"


    // $ANTLR start "rule__Source__ChildJoinFieldAssignment_10_2_0"
    // InternalSpecDsl.g:3189:1: rule__Source__ChildJoinFieldAssignment_10_2_0 : ( ruleJoinField ) ;
    public final void rule__Source__ChildJoinFieldAssignment_10_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3193:1: ( ( ruleJoinField ) )
            // InternalSpecDsl.g:3194:2: ( ruleJoinField )
            {
            // InternalSpecDsl.g:3194:2: ( ruleJoinField )
            // InternalSpecDsl.g:3195:3: ruleJoinField
            {
             before(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinField();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ChildJoinFieldAssignment_10_2_0"


    // $ANTLR start "rule__Source__ChildJoinFieldAssignment_10_2_1_1"
    // InternalSpecDsl.g:3204:1: rule__Source__ChildJoinFieldAssignment_10_2_1_1 : ( ruleJoinField ) ;
    public final void rule__Source__ChildJoinFieldAssignment_10_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3208:1: ( ( ruleJoinField ) )
            // InternalSpecDsl.g:3209:2: ( ruleJoinField )
            {
            // InternalSpecDsl.g:3209:2: ( ruleJoinField )
            // InternalSpecDsl.g:3210:3: ruleJoinField
            {
             before(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinField();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ChildJoinFieldAssignment_10_2_1_1"


    // $ANTLR start "rule__Source__JoinTypeAssignment_11_1"
    // InternalSpecDsl.g:3219:1: rule__Source__JoinTypeAssignment_11_1 : ( ruleJoinType ) ;
    public final void rule__Source__JoinTypeAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3223:1: ( ( ruleJoinType ) )
            // InternalSpecDsl.g:3224:2: ( ruleJoinType )
            {
            // InternalSpecDsl.g:3224:2: ( ruleJoinType )
            // InternalSpecDsl.g:3225:3: ruleJoinType
            {
             before(grammarAccess.getSourceAccess().getJoinTypeJoinTypeEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinType();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getJoinTypeJoinTypeEnumRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__JoinTypeAssignment_11_1"


    // $ANTLR start "rule__Source__ChildSourcesAssignment_12_1"
    // InternalSpecDsl.g:3234:1: rule__Source__ChildSourcesAssignment_12_1 : ( ruleSource ) ;
    public final void rule__Source__ChildSourcesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3238:1: ( ( ruleSource ) )
            // InternalSpecDsl.g:3239:2: ( ruleSource )
            {
            // InternalSpecDsl.g:3239:2: ( ruleSource )
            // InternalSpecDsl.g:3240:3: ruleSource
            {
             before(grammarAccess.getSourceAccess().getChildSourcesSourceParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceAccess().getChildSourcesSourceParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__ChildSourcesAssignment_12_1"


    // $ANTLR start "rule__VectorKey__VkFieldAssignment"
    // InternalSpecDsl.g:3249:1: rule__VectorKey__VkFieldAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__VectorKey__VkFieldAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3253:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:3254:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:3254:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:3255:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getVectorKeyAccess().getVkFieldFieldCrossReference_0()); 
            // InternalSpecDsl.g:3256:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:3257:4: ruleQualifiedName
            {
             before(grammarAccess.getVectorKeyAccess().getVkFieldFieldQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getVectorKeyAccess().getVkFieldFieldQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getVectorKeyAccess().getVkFieldFieldCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorKey__VkFieldAssignment"


    // $ANTLR start "rule__JoinField__FieldAssignment"
    // InternalSpecDsl.g:3268:1: rule__JoinField__FieldAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__JoinField__FieldAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpecDsl.g:3272:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:3273:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:3273:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:3274:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getJoinFieldAccess().getFieldFieldCrossReference_0()); 
            // InternalSpecDsl.g:3275:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:3276:4: ruleQualifiedName
            {
             before(grammarAccess.getJoinFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getJoinFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getJoinFieldAccess().getFieldFieldCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoinField__FieldAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00003FD500000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000F0000L});

}