package org.etl_modeling.specdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.etl_modeling.specdsl.services.SpecDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SpecPackage'", "'Specification'", "'{'", "'target'", "'}'", "'.'", "'RuleType'", "'BusinessRule'", "'targetEntity'", "'targetRelationship'", "'targetIncludeSatelit'", "'PrimarySource'", "'alias'", "'childSources'", "'['", "']'", "'mandatory'", "'isMultiplying'", "'Vector'", "'VectoryKeys'", "','", "'JoinViaLink'", "'JoinComment'", "'PrimaryJoinFields'", "'SecondaryJoinField'", "'JoinType'", "'Aggregation'", "'Dedup'", "'Filter'", "'MultiFire'", "'SingleFire'", "'LEFT'", "'RIGHT'", "'INNER'", "'FULL_OUTER'"
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

        public InternalSpecDslParser(TokenStream input, SpecDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SpecPackage";
       	}

       	@Override
       	protected SpecDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSpecPackage"
    // InternalSpecDsl.g:65:1: entryRuleSpecPackage returns [EObject current=null] : iv_ruleSpecPackage= ruleSpecPackage EOF ;
    public final EObject entryRuleSpecPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecPackage = null;


        try {
            // InternalSpecDsl.g:65:52: (iv_ruleSpecPackage= ruleSpecPackage EOF )
            // InternalSpecDsl.g:66:2: iv_ruleSpecPackage= ruleSpecPackage EOF
            {
             newCompositeNode(grammarAccess.getSpecPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecPackage=ruleSpecPackage();

            state._fsp--;

             current =iv_ruleSpecPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecPackage"


    // $ANTLR start "ruleSpecPackage"
    // InternalSpecDsl.g:72:1: ruleSpecPackage returns [EObject current=null] : ( () otherlv_1= 'SpecPackage' ( (lv_name_2_0= ruleEString ) ) ( (lv_specifications_3_0= ruleSpecification ) )* ) ;
    public final EObject ruleSpecPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_specifications_3_0 = null;



        	enterRule();

        try {
            // InternalSpecDsl.g:78:2: ( ( () otherlv_1= 'SpecPackage' ( (lv_name_2_0= ruleEString ) ) ( (lv_specifications_3_0= ruleSpecification ) )* ) )
            // InternalSpecDsl.g:79:2: ( () otherlv_1= 'SpecPackage' ( (lv_name_2_0= ruleEString ) ) ( (lv_specifications_3_0= ruleSpecification ) )* )
            {
            // InternalSpecDsl.g:79:2: ( () otherlv_1= 'SpecPackage' ( (lv_name_2_0= ruleEString ) ) ( (lv_specifications_3_0= ruleSpecification ) )* )
            // InternalSpecDsl.g:80:3: () otherlv_1= 'SpecPackage' ( (lv_name_2_0= ruleEString ) ) ( (lv_specifications_3_0= ruleSpecification ) )*
            {
            // InternalSpecDsl.g:80:3: ()
            // InternalSpecDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpecPackageAccess().getSpecPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecPackageAccess().getSpecPackageKeyword_1());
            		
            // InternalSpecDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSpecDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalSpecDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalSpecDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpecPackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.etl_modeling.specdsl.SpecDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpecDsl.g:110:3: ( (lv_specifications_3_0= ruleSpecification ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpecDsl.g:111:4: (lv_specifications_3_0= ruleSpecification )
            	    {
            	    // InternalSpecDsl.g:111:4: (lv_specifications_3_0= ruleSpecification )
            	    // InternalSpecDsl.g:112:5: lv_specifications_3_0= ruleSpecification
            	    {

            	    					newCompositeNode(grammarAccess.getSpecPackageAccess().getSpecificationsSpecificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_specifications_3_0=ruleSpecification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specifications",
            	    						lv_specifications_3_0,
            	    						"org.etl_modeling.specdsl.SpecDsl.Specification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecPackage"


    // $ANTLR start "entryRuleSpecification"
    // InternalSpecDsl.g:133:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalSpecDsl.g:133:54: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalSpecDsl.g:134:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSpecDsl.g:140:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'Specification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( (lv_businessrules_4_0= ruleBusinessRule ) ) otherlv_5= '}' ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_businessrules_4_0 = null;



        	enterRule();

        try {
            // InternalSpecDsl.g:146:2: ( (otherlv_0= 'Specification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( (lv_businessrules_4_0= ruleBusinessRule ) ) otherlv_5= '}' ) )
            // InternalSpecDsl.g:147:2: (otherlv_0= 'Specification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( (lv_businessrules_4_0= ruleBusinessRule ) ) otherlv_5= '}' )
            {
            // InternalSpecDsl.g:147:2: (otherlv_0= 'Specification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( (lv_businessrules_4_0= ruleBusinessRule ) ) otherlv_5= '}' )
            // InternalSpecDsl.g:148:3: otherlv_0= 'Specification' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'target' ( (lv_businessrules_4_0= ruleBusinessRule ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
            		
            // InternalSpecDsl.g:152:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSpecDsl.g:153:4: (lv_name_1_0= ruleEString )
            {
            // InternalSpecDsl.g:153:4: (lv_name_1_0= ruleEString )
            // InternalSpecDsl.g:154:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.etl_modeling.specdsl.SpecDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getTargetKeyword_3());
            		
            // InternalSpecDsl.g:179:3: ( (lv_businessrules_4_0= ruleBusinessRule ) )
            // InternalSpecDsl.g:180:4: (lv_businessrules_4_0= ruleBusinessRule )
            {
            // InternalSpecDsl.g:180:4: (lv_businessrules_4_0= ruleBusinessRule )
            // InternalSpecDsl.g:181:5: lv_businessrules_4_0= ruleBusinessRule
            {

            					newCompositeNode(grammarAccess.getSpecificationAccess().getBusinessrulesBusinessRuleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_businessrules_4_0=ruleBusinessRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationRule());
            					}
            					add(
            						current,
            						"businessrules",
            						lv_businessrules_4_0,
            						"org.etl_modeling.specdsl.SpecDsl.BusinessRule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleEString"
    // InternalSpecDsl.g:206:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSpecDsl.g:206:47: (iv_ruleEString= ruleEString EOF )
            // InternalSpecDsl.g:207:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSpecDsl.g:213:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSpecDsl.g:219:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSpecDsl.g:220:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSpecDsl.g:220:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpecDsl.g:221:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:229:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSpecDsl.g:240:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSpecDsl.g:240:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSpecDsl.g:241:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSpecDsl.g:247:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSpecDsl.g:253:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSpecDsl.g:254:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSpecDsl.g:254:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSpecDsl.g:255:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSpecDsl.g:262:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSpecDsl.g:263:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBusinessRule"
    // InternalSpecDsl.g:280:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // InternalSpecDsl.g:280:53: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // InternalSpecDsl.g:281:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             newCompositeNode(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessRule=ruleBusinessRule();

            state._fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // InternalSpecDsl.g:287:1: ruleBusinessRule returns [EObject current=null] : ( () otherlv_1= 'RuleType' ( (lv_RuleType_2_0= ruleRuleType ) ) otherlv_3= 'BusinessRule' ( (lv_name_4_0= ruleEString ) ) ( (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) ) | (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) ) ) ( (lv_sources_11_0= rulePrimarySource ) )* ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_RuleType_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_sources_11_0 = null;



        	enterRule();

        try {
            // InternalSpecDsl.g:293:2: ( ( () otherlv_1= 'RuleType' ( (lv_RuleType_2_0= ruleRuleType ) ) otherlv_3= 'BusinessRule' ( (lv_name_4_0= ruleEString ) ) ( (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) ) | (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) ) ) ( (lv_sources_11_0= rulePrimarySource ) )* ) )
            // InternalSpecDsl.g:294:2: ( () otherlv_1= 'RuleType' ( (lv_RuleType_2_0= ruleRuleType ) ) otherlv_3= 'BusinessRule' ( (lv_name_4_0= ruleEString ) ) ( (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) ) | (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) ) ) ( (lv_sources_11_0= rulePrimarySource ) )* )
            {
            // InternalSpecDsl.g:294:2: ( () otherlv_1= 'RuleType' ( (lv_RuleType_2_0= ruleRuleType ) ) otherlv_3= 'BusinessRule' ( (lv_name_4_0= ruleEString ) ) ( (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) ) | (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) ) ) ( (lv_sources_11_0= rulePrimarySource ) )* )
            // InternalSpecDsl.g:295:3: () otherlv_1= 'RuleType' ( (lv_RuleType_2_0= ruleRuleType ) ) otherlv_3= 'BusinessRule' ( (lv_name_4_0= ruleEString ) ) ( (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) ) | (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) ) ) ( (lv_sources_11_0= rulePrimarySource ) )*
            {
            // InternalSpecDsl.g:295:3: ()
            // InternalSpecDsl.g:296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBusinessRuleAccess().getBusinessRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessRuleAccess().getRuleTypeKeyword_1());
            		
            // InternalSpecDsl.g:306:3: ( (lv_RuleType_2_0= ruleRuleType ) )
            // InternalSpecDsl.g:307:4: (lv_RuleType_2_0= ruleRuleType )
            {
            // InternalSpecDsl.g:307:4: (lv_RuleType_2_0= ruleRuleType )
            // InternalSpecDsl.g:308:5: lv_RuleType_2_0= ruleRuleType
            {

            					newCompositeNode(grammarAccess.getBusinessRuleAccess().getRuleTypeRuleTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_RuleType_2_0=ruleRuleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            					}
            					set(
            						current,
            						"RuleType",
            						lv_RuleType_2_0,
            						"org.etl_modeling.specdsl.SpecDsl.RuleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_3());
            		
            // InternalSpecDsl.g:329:3: ( (lv_name_4_0= ruleEString ) )
            // InternalSpecDsl.g:330:4: (lv_name_4_0= ruleEString )
            {
            // InternalSpecDsl.g:330:4: (lv_name_4_0= ruleEString )
            // InternalSpecDsl.g:331:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBusinessRuleAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.etl_modeling.specdsl.SpecDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpecDsl.g:348:3: ( (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) ) | (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) ) | (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpecDsl.g:349:4: (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSpecDsl.g:349:4: (otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) ) )
                    // InternalSpecDsl.g:350:5: otherlv_5= 'targetEntity' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getBusinessRuleAccess().getTargetEntityKeyword_5_0_0());
                    				
                    // InternalSpecDsl.g:354:5: ( ( ruleQualifiedName ) )
                    // InternalSpecDsl.g:355:6: ( ruleQualifiedName )
                    {
                    // InternalSpecDsl.g:355:6: ( ruleQualifiedName )
                    // InternalSpecDsl.g:356:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBusinessRuleRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBusinessRuleAccess().getTargetEntityEntityCrossReference_5_0_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:372:4: (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSpecDsl.g:372:4: (otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) ) )
                    // InternalSpecDsl.g:373:5: otherlv_7= 'targetRelationship' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getBusinessRuleAccess().getTargetRelationshipKeyword_5_1_0());
                    				
                    // InternalSpecDsl.g:377:5: ( ( ruleQualifiedName ) )
                    // InternalSpecDsl.g:378:6: ( ruleQualifiedName )
                    {
                    // InternalSpecDsl.g:378:6: ( ruleQualifiedName )
                    // InternalSpecDsl.g:379:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBusinessRuleRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBusinessRuleAccess().getTargetRelationshipRelationshipCrossReference_5_1_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSpecDsl.g:395:4: (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalSpecDsl.g:395:4: (otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) ) )
                    // InternalSpecDsl.g:396:5: otherlv_9= 'targetIncludeSatelit' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_10); 

                    					newLeafNode(otherlv_9, grammarAccess.getBusinessRuleAccess().getTargetIncludeSatelitKeyword_5_2_0());
                    				
                    // InternalSpecDsl.g:400:5: ( ( ruleQualifiedName ) )
                    // InternalSpecDsl.g:401:6: ( ruleQualifiedName )
                    {
                    // InternalSpecDsl.g:401:6: ( ruleQualifiedName )
                    // InternalSpecDsl.g:402:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBusinessRuleRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBusinessRuleAccess().getTargetIncludeIncludeCrossReference_5_2_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:418:3: ( (lv_sources_11_0= rulePrimarySource ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSpecDsl.g:419:4: (lv_sources_11_0= rulePrimarySource )
            	    {
            	    // InternalSpecDsl.g:419:4: (lv_sources_11_0= rulePrimarySource )
            	    // InternalSpecDsl.g:420:5: lv_sources_11_0= rulePrimarySource
            	    {

            	    					newCompositeNode(grammarAccess.getBusinessRuleAccess().getSourcesPrimarySourceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_sources_11_0=rulePrimarySource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sources",
            	    						lv_sources_11_0,
            	    						"org.etl_modeling.specdsl.SpecDsl.PrimarySource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRulePrimarySource"
    // InternalSpecDsl.g:441:1: entryRulePrimarySource returns [EObject current=null] : iv_rulePrimarySource= rulePrimarySource EOF ;
    public final EObject entryRulePrimarySource() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimarySource = null;


        try {
            // InternalSpecDsl.g:441:54: (iv_rulePrimarySource= rulePrimarySource EOF )
            // InternalSpecDsl.g:442:2: iv_rulePrimarySource= rulePrimarySource EOF
            {
             newCompositeNode(grammarAccess.getPrimarySourceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimarySource=rulePrimarySource();

            state._fsp--;

             current =iv_rulePrimarySource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimarySource"


    // $ANTLR start "rulePrimarySource"
    // InternalSpecDsl.g:448:1: rulePrimarySource returns [EObject current=null] : (otherlv_0= 'PrimarySource' ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= 'childSources' otherlv_5= '[' ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* ) otherlv_8= ']' )* ) ;
    public final EObject rulePrimarySource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;

        EObject lv_childSources_6_0 = null;

        EObject lv_childSources_7_0 = null;



        	enterRule();

        try {
            // InternalSpecDsl.g:454:2: ( (otherlv_0= 'PrimarySource' ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= 'childSources' otherlv_5= '[' ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* ) otherlv_8= ']' )* ) )
            // InternalSpecDsl.g:455:2: (otherlv_0= 'PrimarySource' ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= 'childSources' otherlv_5= '[' ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* ) otherlv_8= ']' )* )
            {
            // InternalSpecDsl.g:455:2: (otherlv_0= 'PrimarySource' ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= 'childSources' otherlv_5= '[' ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* ) otherlv_8= ']' )* )
            // InternalSpecDsl.g:456:3: otherlv_0= 'PrimarySource' ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? (otherlv_4= 'childSources' otherlv_5= '[' ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* ) otherlv_8= ']' )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimarySourceAccess().getPrimarySourceKeyword_0());
            		
            // InternalSpecDsl.g:460:3: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:461:4: ( ruleQualifiedName )
            {
            // InternalSpecDsl.g:461:4: ( ruleQualifiedName )
            // InternalSpecDsl.g:462:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimarySourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPrimarySourceAccess().getSourceEntityEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpecDsl.g:476:3: (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpecDsl.g:477:4: otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimarySourceAccess().getAliasKeyword_2_0());
                    			
                    // InternalSpecDsl.g:481:4: ( (lv_alias_3_0= ruleEString ) )
                    // InternalSpecDsl.g:482:5: (lv_alias_3_0= ruleEString )
                    {
                    // InternalSpecDsl.g:482:5: (lv_alias_3_0= ruleEString )
                    // InternalSpecDsl.g:483:6: lv_alias_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrimarySourceAccess().getAliasEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_alias_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimarySourceRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"org.etl_modeling.specdsl.SpecDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:501:3: (otherlv_4= 'childSources' otherlv_5= '[' ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* ) otherlv_8= ']' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSpecDsl.g:502:4: otherlv_4= 'childSources' otherlv_5= '[' ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* ) otherlv_8= ']'
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPrimarySourceAccess().getChildSourcesKeyword_3_0());
            	    			
            	    otherlv_5=(Token)match(input,25,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPrimarySourceAccess().getLeftSquareBracketKeyword_3_1());
            	    			
            	    // InternalSpecDsl.g:510:4: ( ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )* )
            	    // InternalSpecDsl.g:511:5: ( (lv_childSources_6_0= ruleSource ) ) ( (lv_childSources_7_0= ruleSource ) )*
            	    {
            	    // InternalSpecDsl.g:511:5: ( (lv_childSources_6_0= ruleSource ) )
            	    // InternalSpecDsl.g:512:6: (lv_childSources_6_0= ruleSource )
            	    {
            	    // InternalSpecDsl.g:512:6: (lv_childSources_6_0= ruleSource )
            	    // InternalSpecDsl.g:513:7: lv_childSources_6_0= ruleSource
            	    {

            	    							newCompositeNode(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_0_0());
            	    						
            	    pushFollow(FOLLOW_18);
            	    lv_childSources_6_0=ruleSource();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPrimarySourceRule());
            	    							}
            	    							add(
            	    								current,
            	    								"childSources",
            	    								lv_childSources_6_0,
            	    								"org.etl_modeling.specdsl.SpecDsl.Source");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalSpecDsl.g:530:5: ( (lv_childSources_7_0= ruleSource ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalSpecDsl.g:531:6: (lv_childSources_7_0= ruleSource )
            	    	    {
            	    	    // InternalSpecDsl.g:531:6: (lv_childSources_7_0= ruleSource )
            	    	    // InternalSpecDsl.g:532:7: lv_childSources_7_0= ruleSource
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_childSources_7_0=ruleSource();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getPrimarySourceRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"childSources",
            	    	    								lv_childSources_7_0,
            	    	    								"org.etl_modeling.specdsl.SpecDsl.Source");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }

            	    otherlv_8=(Token)match(input,26,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPrimarySourceAccess().getRightSquareBracketKeyword_3_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimarySource"


    // $ANTLR start "entryRuleSource"
    // InternalSpecDsl.g:559:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalSpecDsl.g:559:47: (iv_ruleSource= ruleSource EOF )
            // InternalSpecDsl.g:560:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalSpecDsl.g:566:1: ruleSource returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ( (lv_isMandatory_4_0= 'mandatory' ) )? ( (lv_isMultiplying_5_0= 'isMultiplying' ) )? ( (lv_isVector_6_0= 'Vector' ) )? (otherlv_7= 'VectoryKeys' otherlv_8= '{' ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' ) )? (otherlv_13= 'JoinViaLink' ( ( ruleQualifiedName ) ) )? (otherlv_15= 'JoinComment' ( (lv_joinComment_16_0= ruleEString ) ) )? (otherlv_17= 'PrimaryJoinFields' otherlv_18= '{' ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* ) otherlv_22= '}' )? (otherlv_23= 'SecondaryJoinField' otherlv_24= '{' ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* ) otherlv_28= '}' )? (otherlv_29= 'JoinType' ( (lv_JoinType_30_0= ruleJoinType ) ) )? (otherlv_31= '[' ( (lv_childSources_32_0= ruleSource ) ) otherlv_33= ']' )* ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_isMandatory_4_0=null;
        Token lv_isMultiplying_5_0=null;
        Token lv_isVector_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_alias_3_0 = null;

        EObject lv_vectorkeys_9_0 = null;

        EObject lv_vectorkeys_11_0 = null;

        AntlrDatatypeRuleToken lv_joinComment_16_0 = null;

        EObject lv_parentJoinFields_19_0 = null;

        EObject lv_parentJoinFields_21_0 = null;

        EObject lv_childJoinField_25_0 = null;

        EObject lv_childJoinField_27_0 = null;

        Enumerator lv_JoinType_30_0 = null;

        EObject lv_childSources_32_0 = null;



        	enterRule();

        try {
            // InternalSpecDsl.g:572:2: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ( (lv_isMandatory_4_0= 'mandatory' ) )? ( (lv_isMultiplying_5_0= 'isMultiplying' ) )? ( (lv_isVector_6_0= 'Vector' ) )? (otherlv_7= 'VectoryKeys' otherlv_8= '{' ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' ) )? (otherlv_13= 'JoinViaLink' ( ( ruleQualifiedName ) ) )? (otherlv_15= 'JoinComment' ( (lv_joinComment_16_0= ruleEString ) ) )? (otherlv_17= 'PrimaryJoinFields' otherlv_18= '{' ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* ) otherlv_22= '}' )? (otherlv_23= 'SecondaryJoinField' otherlv_24= '{' ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* ) otherlv_28= '}' )? (otherlv_29= 'JoinType' ( (lv_JoinType_30_0= ruleJoinType ) ) )? (otherlv_31= '[' ( (lv_childSources_32_0= ruleSource ) ) otherlv_33= ']' )* ) )
            // InternalSpecDsl.g:573:2: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ( (lv_isMandatory_4_0= 'mandatory' ) )? ( (lv_isMultiplying_5_0= 'isMultiplying' ) )? ( (lv_isVector_6_0= 'Vector' ) )? (otherlv_7= 'VectoryKeys' otherlv_8= '{' ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' ) )? (otherlv_13= 'JoinViaLink' ( ( ruleQualifiedName ) ) )? (otherlv_15= 'JoinComment' ( (lv_joinComment_16_0= ruleEString ) ) )? (otherlv_17= 'PrimaryJoinFields' otherlv_18= '{' ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* ) otherlv_22= '}' )? (otherlv_23= 'SecondaryJoinField' otherlv_24= '{' ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* ) otherlv_28= '}' )? (otherlv_29= 'JoinType' ( (lv_JoinType_30_0= ruleJoinType ) ) )? (otherlv_31= '[' ( (lv_childSources_32_0= ruleSource ) ) otherlv_33= ']' )* )
            {
            // InternalSpecDsl.g:573:2: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ( (lv_isMandatory_4_0= 'mandatory' ) )? ( (lv_isMultiplying_5_0= 'isMultiplying' ) )? ( (lv_isVector_6_0= 'Vector' ) )? (otherlv_7= 'VectoryKeys' otherlv_8= '{' ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' ) )? (otherlv_13= 'JoinViaLink' ( ( ruleQualifiedName ) ) )? (otherlv_15= 'JoinComment' ( (lv_joinComment_16_0= ruleEString ) ) )? (otherlv_17= 'PrimaryJoinFields' otherlv_18= '{' ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* ) otherlv_22= '}' )? (otherlv_23= 'SecondaryJoinField' otherlv_24= '{' ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* ) otherlv_28= '}' )? (otherlv_29= 'JoinType' ( (lv_JoinType_30_0= ruleJoinType ) ) )? (otherlv_31= '[' ( (lv_childSources_32_0= ruleSource ) ) otherlv_33= ']' )* )
            // InternalSpecDsl.g:574:3: () ( ( ruleQualifiedName ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )? ( (lv_isMandatory_4_0= 'mandatory' ) )? ( (lv_isMultiplying_5_0= 'isMultiplying' ) )? ( (lv_isVector_6_0= 'Vector' ) )? (otherlv_7= 'VectoryKeys' otherlv_8= '{' ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' ) )? (otherlv_13= 'JoinViaLink' ( ( ruleQualifiedName ) ) )? (otherlv_15= 'JoinComment' ( (lv_joinComment_16_0= ruleEString ) ) )? (otherlv_17= 'PrimaryJoinFields' otherlv_18= '{' ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* ) otherlv_22= '}' )? (otherlv_23= 'SecondaryJoinField' otherlv_24= '{' ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* ) otherlv_28= '}' )? (otherlv_29= 'JoinType' ( (lv_JoinType_30_0= ruleJoinType ) ) )? (otherlv_31= '[' ( (lv_childSources_32_0= ruleSource ) ) otherlv_33= ']' )*
            {
            // InternalSpecDsl.g:574:3: ()
            // InternalSpecDsl.g:575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceAccess().getSourceAction_0(),
            					current);
            			

            }

            // InternalSpecDsl.g:581:3: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:582:4: ( ruleQualifiedName )
            {
            // InternalSpecDsl.g:582:4: ( ruleQualifiedName )
            // InternalSpecDsl.g:583:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSourceAccess().getSourceEntityEntityCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpecDsl.g:597:3: (otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpecDsl.g:598:4: otherlv_2= 'alias' ( (lv_alias_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getAliasKeyword_2_0());
                    			
                    // InternalSpecDsl.g:602:4: ( (lv_alias_3_0= ruleEString ) )
                    // InternalSpecDsl.g:603:5: (lv_alias_3_0= ruleEString )
                    {
                    // InternalSpecDsl.g:603:5: (lv_alias_3_0= ruleEString )
                    // InternalSpecDsl.g:604:6: lv_alias_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSourceAccess().getAliasEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_alias_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSourceRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_3_0,
                    							"org.etl_modeling.specdsl.SpecDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:622:3: ( (lv_isMandatory_4_0= 'mandatory' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpecDsl.g:623:4: (lv_isMandatory_4_0= 'mandatory' )
                    {
                    // InternalSpecDsl.g:623:4: (lv_isMandatory_4_0= 'mandatory' )
                    // InternalSpecDsl.g:624:5: lv_isMandatory_4_0= 'mandatory'
                    {
                    lv_isMandatory_4_0=(Token)match(input,27,FOLLOW_21); 

                    					newLeafNode(lv_isMandatory_4_0, grammarAccess.getSourceAccess().getIsMandatoryMandatoryKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceRule());
                    					}
                    					setWithLastConsumed(current, "isMandatory", lv_isMandatory_4_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:636:3: ( (lv_isMultiplying_5_0= 'isMultiplying' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpecDsl.g:637:4: (lv_isMultiplying_5_0= 'isMultiplying' )
                    {
                    // InternalSpecDsl.g:637:4: (lv_isMultiplying_5_0= 'isMultiplying' )
                    // InternalSpecDsl.g:638:5: lv_isMultiplying_5_0= 'isMultiplying'
                    {
                    lv_isMultiplying_5_0=(Token)match(input,28,FOLLOW_22); 

                    					newLeafNode(lv_isMultiplying_5_0, grammarAccess.getSourceAccess().getIsMultiplyingIsMultiplyingKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceRule());
                    					}
                    					setWithLastConsumed(current, "isMultiplying", lv_isMultiplying_5_0 != null, "isMultiplying");
                    				

                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:650:3: ( (lv_isVector_6_0= 'Vector' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpecDsl.g:651:4: (lv_isVector_6_0= 'Vector' )
                    {
                    // InternalSpecDsl.g:651:4: (lv_isVector_6_0= 'Vector' )
                    // InternalSpecDsl.g:652:5: lv_isVector_6_0= 'Vector'
                    {
                    lv_isVector_6_0=(Token)match(input,29,FOLLOW_23); 

                    					newLeafNode(lv_isVector_6_0, grammarAccess.getSourceAccess().getIsVectorVectorKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceRule());
                    					}
                    					setWithLastConsumed(current, "isVector", lv_isVector_6_0 != null, "Vector");
                    				

                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:664:3: (otherlv_7= 'VectoryKeys' otherlv_8= '{' ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpecDsl.g:665:4: otherlv_7= 'VectoryKeys' otherlv_8= '{' ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getVectoryKeysKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSpecDsl.g:673:4: ( ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}' )
                    // InternalSpecDsl.g:674:5: ( (lv_vectorkeys_9_0= ruleVectorKey ) ) (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )* otherlv_12= '}'
                    {
                    // InternalSpecDsl.g:674:5: ( (lv_vectorkeys_9_0= ruleVectorKey ) )
                    // InternalSpecDsl.g:675:6: (lv_vectorkeys_9_0= ruleVectorKey )
                    {
                    // InternalSpecDsl.g:675:6: (lv_vectorkeys_9_0= ruleVectorKey )
                    // InternalSpecDsl.g:676:7: lv_vectorkeys_9_0= ruleVectorKey
                    {

                    							newCompositeNode(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_0_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_vectorkeys_9_0=ruleVectorKey();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSourceRule());
                    							}
                    							add(
                    								current,
                    								"vectorkeys",
                    								lv_vectorkeys_9_0,
                    								"org.etl_modeling.specdsl.SpecDsl.VectorKey");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSpecDsl.g:693:5: (otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==31) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSpecDsl.g:694:6: otherlv_10= ',' ( (lv_vectorkeys_11_0= ruleVectorKey ) )
                    	    {
                    	    otherlv_10=(Token)match(input,31,FOLLOW_10); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getSourceAccess().getCommaKeyword_6_2_1_0());
                    	    					
                    	    // InternalSpecDsl.g:698:6: ( (lv_vectorkeys_11_0= ruleVectorKey ) )
                    	    // InternalSpecDsl.g:699:7: (lv_vectorkeys_11_0= ruleVectorKey )
                    	    {
                    	    // InternalSpecDsl.g:699:7: (lv_vectorkeys_11_0= ruleVectorKey )
                    	    // InternalSpecDsl.g:700:8: lv_vectorkeys_11_0= ruleVectorKey
                    	    {

                    	    								newCompositeNode(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_24);
                    	    lv_vectorkeys_11_0=ruleVectorKey();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSourceRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"vectorkeys",
                    	    									lv_vectorkeys_11_0,
                    	    									"org.etl_modeling.specdsl.SpecDsl.VectorKey");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_25); 

                    					newLeafNode(otherlv_12, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_6_2_2());
                    				

                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:724:3: (otherlv_13= 'JoinViaLink' ( ( ruleQualifiedName ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpecDsl.g:725:4: otherlv_13= 'JoinViaLink' ( ( ruleQualifiedName ) )
                    {
                    otherlv_13=(Token)match(input,32,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getSourceAccess().getJoinViaLinkKeyword_7_0());
                    			
                    // InternalSpecDsl.g:729:4: ( ( ruleQualifiedName ) )
                    // InternalSpecDsl.g:730:5: ( ruleQualifiedName )
                    {
                    // InternalSpecDsl.g:730:5: ( ruleQualifiedName )
                    // InternalSpecDsl.g:731:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSourceAccess().getSourceReleationshipRelationshipCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:746:3: (otherlv_15= 'JoinComment' ( (lv_joinComment_16_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpecDsl.g:747:4: otherlv_15= 'JoinComment' ( (lv_joinComment_16_0= ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getSourceAccess().getJoinCommentKeyword_8_0());
                    			
                    // InternalSpecDsl.g:751:4: ( (lv_joinComment_16_0= ruleEString ) )
                    // InternalSpecDsl.g:752:5: (lv_joinComment_16_0= ruleEString )
                    {
                    // InternalSpecDsl.g:752:5: (lv_joinComment_16_0= ruleEString )
                    // InternalSpecDsl.g:753:6: lv_joinComment_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSourceAccess().getJoinCommentEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_joinComment_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSourceRule());
                    						}
                    						set(
                    							current,
                    							"joinComment",
                    							lv_joinComment_16_0,
                    							"org.etl_modeling.specdsl.SpecDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:771:3: (otherlv_17= 'PrimaryJoinFields' otherlv_18= '{' ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* ) otherlv_22= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpecDsl.g:772:4: otherlv_17= 'PrimaryJoinFields' otherlv_18= '{' ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* ) otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getSourceAccess().getPrimaryJoinFieldsKeyword_9_0());
                    			
                    otherlv_18=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSpecDsl.g:780:4: ( ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )* )
                    // InternalSpecDsl.g:781:5: ( (lv_parentJoinFields_19_0= ruleJoinField ) ) (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )*
                    {
                    // InternalSpecDsl.g:781:5: ( (lv_parentJoinFields_19_0= ruleJoinField ) )
                    // InternalSpecDsl.g:782:6: (lv_parentJoinFields_19_0= ruleJoinField )
                    {
                    // InternalSpecDsl.g:782:6: (lv_parentJoinFields_19_0= ruleJoinField )
                    // InternalSpecDsl.g:783:7: lv_parentJoinFields_19_0= ruleJoinField
                    {

                    							newCompositeNode(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_0_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_parentJoinFields_19_0=ruleJoinField();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSourceRule());
                    							}
                    							add(
                    								current,
                    								"parentJoinFields",
                    								lv_parentJoinFields_19_0,
                    								"org.etl_modeling.specdsl.SpecDsl.JoinField");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSpecDsl.g:800:5: (otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==31) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSpecDsl.g:801:6: otherlv_20= ',' ( (lv_parentJoinFields_21_0= ruleJoinField ) )
                    	    {
                    	    otherlv_20=(Token)match(input,31,FOLLOW_10); 

                    	    						newLeafNode(otherlv_20, grammarAccess.getSourceAccess().getCommaKeyword_9_2_1_0());
                    	    					
                    	    // InternalSpecDsl.g:805:6: ( (lv_parentJoinFields_21_0= ruleJoinField ) )
                    	    // InternalSpecDsl.g:806:7: (lv_parentJoinFields_21_0= ruleJoinField )
                    	    {
                    	    // InternalSpecDsl.g:806:7: (lv_parentJoinFields_21_0= ruleJoinField )
                    	    // InternalSpecDsl.g:807:8: lv_parentJoinFields_21_0= ruleJoinField
                    	    {

                    	    								newCompositeNode(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_24);
                    	    lv_parentJoinFields_21_0=ruleJoinField();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSourceRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parentJoinFields",
                    	    									lv_parentJoinFields_21_0,
                    	    									"org.etl_modeling.specdsl.SpecDsl.JoinField");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }

                    otherlv_22=(Token)match(input,15,FOLLOW_28); 

                    				newLeafNode(otherlv_22, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_9_3());
                    			

                    }
                    break;

            }

            // InternalSpecDsl.g:831:3: (otherlv_23= 'SecondaryJoinField' otherlv_24= '{' ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* ) otherlv_28= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpecDsl.g:832:4: otherlv_23= 'SecondaryJoinField' otherlv_24= '{' ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* ) otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getSourceAccess().getSecondaryJoinFieldKeyword_10_0());
                    			
                    otherlv_24=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_24, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSpecDsl.g:840:4: ( ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )* )
                    // InternalSpecDsl.g:841:5: ( (lv_childJoinField_25_0= ruleJoinField ) ) (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )*
                    {
                    // InternalSpecDsl.g:841:5: ( (lv_childJoinField_25_0= ruleJoinField ) )
                    // InternalSpecDsl.g:842:6: (lv_childJoinField_25_0= ruleJoinField )
                    {
                    // InternalSpecDsl.g:842:6: (lv_childJoinField_25_0= ruleJoinField )
                    // InternalSpecDsl.g:843:7: lv_childJoinField_25_0= ruleJoinField
                    {

                    							newCompositeNode(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_0_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_childJoinField_25_0=ruleJoinField();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSourceRule());
                    							}
                    							add(
                    								current,
                    								"childJoinField",
                    								lv_childJoinField_25_0,
                    								"org.etl_modeling.specdsl.SpecDsl.JoinField");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSpecDsl.g:860:5: (otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==31) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSpecDsl.g:861:6: otherlv_26= ',' ( (lv_childJoinField_27_0= ruleJoinField ) )
                    	    {
                    	    otherlv_26=(Token)match(input,31,FOLLOW_10); 

                    	    						newLeafNode(otherlv_26, grammarAccess.getSourceAccess().getCommaKeyword_10_2_1_0());
                    	    					
                    	    // InternalSpecDsl.g:865:6: ( (lv_childJoinField_27_0= ruleJoinField ) )
                    	    // InternalSpecDsl.g:866:7: (lv_childJoinField_27_0= ruleJoinField )
                    	    {
                    	    // InternalSpecDsl.g:866:7: (lv_childJoinField_27_0= ruleJoinField )
                    	    // InternalSpecDsl.g:867:8: lv_childJoinField_27_0= ruleJoinField
                    	    {

                    	    								newCompositeNode(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_24);
                    	    lv_childJoinField_27_0=ruleJoinField();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSourceRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"childJoinField",
                    	    									lv_childJoinField_27_0,
                    	    									"org.etl_modeling.specdsl.SpecDsl.JoinField");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }

                    otherlv_28=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_28, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalSpecDsl.g:891:3: (otherlv_29= 'JoinType' ( (lv_JoinType_30_0= ruleJoinType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSpecDsl.g:892:4: otherlv_29= 'JoinType' ( (lv_JoinType_30_0= ruleJoinType ) )
                    {
                    otherlv_29=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_29, grammarAccess.getSourceAccess().getJoinTypeKeyword_11_0());
                    			
                    // InternalSpecDsl.g:896:4: ( (lv_JoinType_30_0= ruleJoinType ) )
                    // InternalSpecDsl.g:897:5: (lv_JoinType_30_0= ruleJoinType )
                    {
                    // InternalSpecDsl.g:897:5: (lv_JoinType_30_0= ruleJoinType )
                    // InternalSpecDsl.g:898:6: lv_JoinType_30_0= ruleJoinType
                    {

                    						newCompositeNode(grammarAccess.getSourceAccess().getJoinTypeJoinTypeEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_JoinType_30_0=ruleJoinType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSourceRule());
                    						}
                    						set(
                    							current,
                    							"JoinType",
                    							lv_JoinType_30_0,
                    							"org.etl_modeling.specdsl.SpecDsl.JoinType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpecDsl.g:916:3: (otherlv_31= '[' ( (lv_childSources_32_0= ruleSource ) ) otherlv_33= ']' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSpecDsl.g:917:4: otherlv_31= '[' ( (lv_childSources_32_0= ruleSource ) ) otherlv_33= ']'
            	    {
            	    otherlv_31=(Token)match(input,25,FOLLOW_10); 

            	    				newLeafNode(otherlv_31, grammarAccess.getSourceAccess().getLeftSquareBracketKeyword_12_0());
            	    			
            	    // InternalSpecDsl.g:921:4: ( (lv_childSources_32_0= ruleSource ) )
            	    // InternalSpecDsl.g:922:5: (lv_childSources_32_0= ruleSource )
            	    {
            	    // InternalSpecDsl.g:922:5: (lv_childSources_32_0= ruleSource )
            	    // InternalSpecDsl.g:923:6: lv_childSources_32_0= ruleSource
            	    {

            	    						newCompositeNode(grammarAccess.getSourceAccess().getChildSourcesSourceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_childSources_32_0=ruleSource();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"childSources",
            	    							lv_childSources_32_0,
            	    							"org.etl_modeling.specdsl.SpecDsl.Source");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_33=(Token)match(input,26,FOLLOW_31); 

            	    				newLeafNode(otherlv_33, grammarAccess.getSourceAccess().getRightSquareBracketKeyword_12_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleVectorKey"
    // InternalSpecDsl.g:949:1: entryRuleVectorKey returns [EObject current=null] : iv_ruleVectorKey= ruleVectorKey EOF ;
    public final EObject entryRuleVectorKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorKey = null;


        try {
            // InternalSpecDsl.g:949:50: (iv_ruleVectorKey= ruleVectorKey EOF )
            // InternalSpecDsl.g:950:2: iv_ruleVectorKey= ruleVectorKey EOF
            {
             newCompositeNode(grammarAccess.getVectorKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVectorKey=ruleVectorKey();

            state._fsp--;

             current =iv_ruleVectorKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorKey"


    // $ANTLR start "ruleVectorKey"
    // InternalSpecDsl.g:956:1: ruleVectorKey returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleVectorKey() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSpecDsl.g:962:2: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:963:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:963:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:964:3: ( ruleQualifiedName )
            {
            // InternalSpecDsl.g:964:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:965:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVectorKeyRule());
            				}
            			

            				newCompositeNode(grammarAccess.getVectorKeyAccess().getVkFieldFieldCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorKey"


    // $ANTLR start "entryRuleJoinField"
    // InternalSpecDsl.g:982:1: entryRuleJoinField returns [EObject current=null] : iv_ruleJoinField= ruleJoinField EOF ;
    public final EObject entryRuleJoinField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinField = null;


        try {
            // InternalSpecDsl.g:982:50: (iv_ruleJoinField= ruleJoinField EOF )
            // InternalSpecDsl.g:983:2: iv_ruleJoinField= ruleJoinField EOF
            {
             newCompositeNode(grammarAccess.getJoinFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinField=ruleJoinField();

            state._fsp--;

             current =iv_ruleJoinField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinField"


    // $ANTLR start "ruleJoinField"
    // InternalSpecDsl.g:989:1: ruleJoinField returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleJoinField() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSpecDsl.g:995:2: ( ( ( ruleQualifiedName ) ) )
            // InternalSpecDsl.g:996:2: ( ( ruleQualifiedName ) )
            {
            // InternalSpecDsl.g:996:2: ( ( ruleQualifiedName ) )
            // InternalSpecDsl.g:997:3: ( ruleQualifiedName )
            {
            // InternalSpecDsl.g:997:3: ( ruleQualifiedName )
            // InternalSpecDsl.g:998:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJoinFieldRule());
            				}
            			

            				newCompositeNode(grammarAccess.getJoinFieldAccess().getFieldFieldCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinField"


    // $ANTLR start "ruleRuleType"
    // InternalSpecDsl.g:1015:1: ruleRuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Aggregation' ) | (enumLiteral_1= 'Dedup' ) | (enumLiteral_2= 'Filter' ) | (enumLiteral_3= 'MultiFire' ) | (enumLiteral_4= 'SingleFire' ) ) ;
    public final Enumerator ruleRuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSpecDsl.g:1021:2: ( ( (enumLiteral_0= 'Aggregation' ) | (enumLiteral_1= 'Dedup' ) | (enumLiteral_2= 'Filter' ) | (enumLiteral_3= 'MultiFire' ) | (enumLiteral_4= 'SingleFire' ) ) )
            // InternalSpecDsl.g:1022:2: ( (enumLiteral_0= 'Aggregation' ) | (enumLiteral_1= 'Dedup' ) | (enumLiteral_2= 'Filter' ) | (enumLiteral_3= 'MultiFire' ) | (enumLiteral_4= 'SingleFire' ) )
            {
            // InternalSpecDsl.g:1022:2: ( (enumLiteral_0= 'Aggregation' ) | (enumLiteral_1= 'Dedup' ) | (enumLiteral_2= 'Filter' ) | (enumLiteral_3= 'MultiFire' ) | (enumLiteral_4= 'SingleFire' ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt23=1;
                }
                break;
            case 38:
                {
                alt23=2;
                }
                break;
            case 39:
                {
                alt23=3;
                }
                break;
            case 40:
                {
                alt23=4;
                }
                break;
            case 41:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSpecDsl.g:1023:3: (enumLiteral_0= 'Aggregation' )
                    {
                    // InternalSpecDsl.g:1023:3: (enumLiteral_0= 'Aggregation' )
                    // InternalSpecDsl.g:1024:4: enumLiteral_0= 'Aggregation'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getAggregationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRuleTypeAccess().getAggregationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:1031:3: (enumLiteral_1= 'Dedup' )
                    {
                    // InternalSpecDsl.g:1031:3: (enumLiteral_1= 'Dedup' )
                    // InternalSpecDsl.g:1032:4: enumLiteral_1= 'Dedup'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getDedupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRuleTypeAccess().getDedupEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpecDsl.g:1039:3: (enumLiteral_2= 'Filter' )
                    {
                    // InternalSpecDsl.g:1039:3: (enumLiteral_2= 'Filter' )
                    // InternalSpecDsl.g:1040:4: enumLiteral_2= 'Filter'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getFilterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRuleTypeAccess().getFilterEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpecDsl.g:1047:3: (enumLiteral_3= 'MultiFire' )
                    {
                    // InternalSpecDsl.g:1047:3: (enumLiteral_3= 'MultiFire' )
                    // InternalSpecDsl.g:1048:4: enumLiteral_3= 'MultiFire'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getMultiFireEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRuleTypeAccess().getMultiFireEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSpecDsl.g:1055:3: (enumLiteral_4= 'SingleFire' )
                    {
                    // InternalSpecDsl.g:1055:3: (enumLiteral_4= 'SingleFire' )
                    // InternalSpecDsl.g:1056:4: enumLiteral_4= 'SingleFire'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getSingleFireEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRuleTypeAccess().getSingleFireEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "ruleJoinType"
    // InternalSpecDsl.g:1066:1: ruleJoinType returns [Enumerator current=null] : ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'INNER' ) | (enumLiteral_3= 'FULL_OUTER' ) ) ;
    public final Enumerator ruleJoinType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSpecDsl.g:1072:2: ( ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'INNER' ) | (enumLiteral_3= 'FULL_OUTER' ) ) )
            // InternalSpecDsl.g:1073:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'INNER' ) | (enumLiteral_3= 'FULL_OUTER' ) )
            {
            // InternalSpecDsl.g:1073:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'INNER' ) | (enumLiteral_3= 'FULL_OUTER' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt24=1;
                }
                break;
            case 43:
                {
                alt24=2;
                }
                break;
            case 44:
                {
                alt24=3;
                }
                break;
            case 45:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalSpecDsl.g:1074:3: (enumLiteral_0= 'LEFT' )
                    {
                    // InternalSpecDsl.g:1074:3: (enumLiteral_0= 'LEFT' )
                    // InternalSpecDsl.g:1075:4: enumLiteral_0= 'LEFT'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJoinTypeAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpecDsl.g:1082:3: (enumLiteral_1= 'RIGHT' )
                    {
                    // InternalSpecDsl.g:1082:3: (enumLiteral_1= 'RIGHT' )
                    // InternalSpecDsl.g:1083:4: enumLiteral_1= 'RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJoinTypeAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpecDsl.g:1090:3: (enumLiteral_2= 'INNER' )
                    {
                    // InternalSpecDsl.g:1090:3: (enumLiteral_2= 'INNER' )
                    // InternalSpecDsl.g:1091:4: enumLiteral_2= 'INNER'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getINNEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJoinTypeAccess().getINNEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpecDsl.g:1098:3: (enumLiteral_3= 'FULL_OUTER' )
                    {
                    // InternalSpecDsl.g:1098:3: (enumLiteral_3= 'FULL_OUTER' )
                    // InternalSpecDsl.g:1099:4: enumLiteral_3= 'FULL_OUTER'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getFULL_OUTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJoinTypeAccess().getFULL_OUTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001F7A800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001F7A000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001F72000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001F62000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001F42000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001F02000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001E02000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001C02000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001802000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001002000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});

}