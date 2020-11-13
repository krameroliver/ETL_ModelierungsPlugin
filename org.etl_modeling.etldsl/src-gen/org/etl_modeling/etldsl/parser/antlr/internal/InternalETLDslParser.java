package org.etl_modeling.etldsl.parser.antlr.internal;

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
import org.etl_modeling.etldsl.services.ETLDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalETLDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'logpackage'", "'LAYER'", "'LAYER_TYPE'", "'HISTORISATION'", "'REPRESENTATION'", "','", "'commonmapping'", "'{'", "'InputField'", "'}'", "'OutputField'", "'Entity'", "'entityFields'", "'INCLUDES'", "'['", "']'", "'Relationship'", "'Field'", "'type'", "'length'", "'precision'", "'scale'", "'original_name'", "'short_describtion'", "'dateFormat'", "'NullIndicator'", "'allowExponent:'", "'hasImplicitComma:'", "'interfaceOnly:'", "'tableOnly:'", "'isFastChanging:'", "'.'", "'-'", "'true'", "'false'", "'FROM: '", "'To: '", "'DescribingFields:{'", "'IdentifyingFields:{'", "'STAGE'", "'INTEGRATION'", "'EXPORT'", "'REPORTING'", "'HARMONISATION'", "'NONE'", "'DAY_PARTITIONED'", "'MONTH_PARTITIONED'", "'BITEMPORAL'", "'FLAT_TABLE'", "'ThirdNF'", "'SNOWFLAKE'", "'STAR'", "'String'", "'Date'", "'Decimal'", "'HK'", "'Int'", "'TimeStamp'", "'TrueFalse'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalETLDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalETLDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalETLDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalETLDsl.g"; }



     	private ETLDslGrammarAccess grammarAccess;

        public InternalETLDslParser(TokenStream input, ETLDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "logpackage";
       	}

       	@Override
       	protected ETLDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulelogpackage"
    // InternalETLDsl.g:65:1: entryRulelogpackage returns [EObject current=null] : iv_rulelogpackage= rulelogpackage EOF ;
    public final EObject entryRulelogpackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelogpackage = null;


        try {
            // InternalETLDsl.g:65:51: (iv_rulelogpackage= rulelogpackage EOF )
            // InternalETLDsl.g:66:2: iv_rulelogpackage= rulelogpackage EOF
            {
             newCompositeNode(grammarAccess.getLogpackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelogpackage=rulelogpackage();

            state._fsp--;

             current =iv_rulelogpackage; 
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
    // $ANTLR end "entryRulelogpackage"


    // $ANTLR start "rulelogpackage"
    // InternalETLDsl.g:72:1: rulelogpackage returns [EObject current=null] : ( () otherlv_1= 'logpackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'LAYER' ( (lv_LAYER_4_0= ruleEString ) ) )? (otherlv_5= 'LAYER_TYPE' ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) ) )? (otherlv_7= 'HISTORISATION' ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) ) )? (otherlv_9= 'REPRESENTATION' ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) ) )? ( ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )* )? ) ;
    public final EObject rulelogpackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_LAYER_4_0 = null;

        Enumerator lv_LAYER_TYPE_6_0 = null;

        Enumerator lv_HISTORISATION_8_0 = null;

        Enumerator lv_REPRESENTATION_10_0 = null;

        EObject lv_commonmapping_11_0 = null;

        EObject lv_entity_12_0 = null;

        EObject lv_commonmapping_14_0 = null;

        EObject lv_entity_15_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:78:2: ( ( () otherlv_1= 'logpackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'LAYER' ( (lv_LAYER_4_0= ruleEString ) ) )? (otherlv_5= 'LAYER_TYPE' ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) ) )? (otherlv_7= 'HISTORISATION' ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) ) )? (otherlv_9= 'REPRESENTATION' ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) ) )? ( ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )* )? ) )
            // InternalETLDsl.g:79:2: ( () otherlv_1= 'logpackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'LAYER' ( (lv_LAYER_4_0= ruleEString ) ) )? (otherlv_5= 'LAYER_TYPE' ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) ) )? (otherlv_7= 'HISTORISATION' ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) ) )? (otherlv_9= 'REPRESENTATION' ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) ) )? ( ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )* )? )
            {
            // InternalETLDsl.g:79:2: ( () otherlv_1= 'logpackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'LAYER' ( (lv_LAYER_4_0= ruleEString ) ) )? (otherlv_5= 'LAYER_TYPE' ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) ) )? (otherlv_7= 'HISTORISATION' ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) ) )? (otherlv_9= 'REPRESENTATION' ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) ) )? ( ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )* )? )
            // InternalETLDsl.g:80:3: () otherlv_1= 'logpackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'LAYER' ( (lv_LAYER_4_0= ruleEString ) ) )? (otherlv_5= 'LAYER_TYPE' ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) ) )? (otherlv_7= 'HISTORISATION' ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) ) )? (otherlv_9= 'REPRESENTATION' ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) ) )? ( ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )* )?
            {
            // InternalETLDsl.g:80:3: ()
            // InternalETLDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogpackageAccess().getLogpackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLogpackageAccess().getLogpackageKeyword_1());
            		
            // InternalETLDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalETLDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalETLDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalETLDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogpackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogpackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.etl_modeling.etldsl.ETLDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalETLDsl.g:110:3: (otherlv_3= 'LAYER' ( (lv_LAYER_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalETLDsl.g:111:4: otherlv_3= 'LAYER' ( (lv_LAYER_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogpackageAccess().getLAYERKeyword_3_0());
                    			
                    // InternalETLDsl.g:115:4: ( (lv_LAYER_4_0= ruleEString ) )
                    // InternalETLDsl.g:116:5: (lv_LAYER_4_0= ruleEString )
                    {
                    // InternalETLDsl.g:116:5: (lv_LAYER_4_0= ruleEString )
                    // InternalETLDsl.g:117:6: lv_LAYER_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLogpackageAccess().getLAYEREStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_LAYER_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogpackageRule());
                    						}
                    						set(
                    							current,
                    							"LAYER",
                    							lv_LAYER_4_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:135:3: (otherlv_5= 'LAYER_TYPE' ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalETLDsl.g:136:4: otherlv_5= 'LAYER_TYPE' ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogpackageAccess().getLAYER_TYPEKeyword_4_0());
                    			
                    // InternalETLDsl.g:140:4: ( (lv_LAYER_TYPE_6_0= ruleLAYERTYPE ) )
                    // InternalETLDsl.g:141:5: (lv_LAYER_TYPE_6_0= ruleLAYERTYPE )
                    {
                    // InternalETLDsl.g:141:5: (lv_LAYER_TYPE_6_0= ruleLAYERTYPE )
                    // InternalETLDsl.g:142:6: lv_LAYER_TYPE_6_0= ruleLAYERTYPE
                    {

                    						newCompositeNode(grammarAccess.getLogpackageAccess().getLAYER_TYPELAYERTYPEEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_LAYER_TYPE_6_0=ruleLAYERTYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogpackageRule());
                    						}
                    						set(
                    							current,
                    							"LAYER_TYPE",
                    							lv_LAYER_TYPE_6_0,
                    							"org.etl_modeling.etldsl.ETLDsl.LAYERTYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:160:3: (otherlv_7= 'HISTORISATION' ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalETLDsl.g:161:4: otherlv_7= 'HISTORISATION' ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogpackageAccess().getHISTORISATIONKeyword_5_0());
                    			
                    // InternalETLDsl.g:165:4: ( (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE ) )
                    // InternalETLDsl.g:166:5: (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE )
                    {
                    // InternalETLDsl.g:166:5: (lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE )
                    // InternalETLDsl.g:167:6: lv_HISTORISATION_8_0= ruleHISTORISATIONTYPE
                    {

                    						newCompositeNode(grammarAccess.getLogpackageAccess().getHISTORISATIONHISTORISATIONTYPEEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_HISTORISATION_8_0=ruleHISTORISATIONTYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogpackageRule());
                    						}
                    						set(
                    							current,
                    							"HISTORISATION",
                    							lv_HISTORISATION_8_0,
                    							"org.etl_modeling.etldsl.ETLDsl.HISTORISATIONTYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:185:3: (otherlv_9= 'REPRESENTATION' ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalETLDsl.g:186:4: otherlv_9= 'REPRESENTATION' ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) )
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogpackageAccess().getREPRESENTATIONKeyword_6_0());
                    			
                    // InternalETLDsl.g:190:4: ( (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS ) )
                    // InternalETLDsl.g:191:5: (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS )
                    {
                    // InternalETLDsl.g:191:5: (lv_REPRESENTATION_10_0= ruleREPRESENTATIONS )
                    // InternalETLDsl.g:192:6: lv_REPRESENTATION_10_0= ruleREPRESENTATIONS
                    {

                    						newCompositeNode(grammarAccess.getLogpackageAccess().getREPRESENTATIONREPRESENTATIONSEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_REPRESENTATION_10_0=ruleREPRESENTATIONS();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogpackageRule());
                    						}
                    						set(
                    							current,
                    							"REPRESENTATION",
                    							lv_REPRESENTATION_10_0,
                    							"org.etl_modeling.etldsl.ETLDsl.REPRESENTATIONS");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:210:3: ( ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17||LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalETLDsl.g:211:4: ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )*
                    {
                    // InternalETLDsl.g:211:4: ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==22) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalETLDsl.g:212:5: ( (lv_commonmapping_11_0= ruleCommonMapping ) )
                            {
                            // InternalETLDsl.g:212:5: ( (lv_commonmapping_11_0= ruleCommonMapping ) )
                            // InternalETLDsl.g:213:6: (lv_commonmapping_11_0= ruleCommonMapping )
                            {
                            // InternalETLDsl.g:213:6: (lv_commonmapping_11_0= ruleCommonMapping )
                            // InternalETLDsl.g:214:7: lv_commonmapping_11_0= ruleCommonMapping
                            {

                            							newCompositeNode(grammarAccess.getLogpackageAccess().getCommonmappingCommonMappingParserRuleCall_7_0_0_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_commonmapping_11_0=ruleCommonMapping();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLogpackageRule());
                            							}
                            							add(
                            								current,
                            								"commonmapping",
                            								lv_commonmapping_11_0,
                            								"org.etl_modeling.etldsl.ETLDsl.CommonMapping");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalETLDsl.g:232:5: ( (lv_entity_12_0= ruleEntity ) )
                            {
                            // InternalETLDsl.g:232:5: ( (lv_entity_12_0= ruleEntity ) )
                            // InternalETLDsl.g:233:6: (lv_entity_12_0= ruleEntity )
                            {
                            // InternalETLDsl.g:233:6: (lv_entity_12_0= ruleEntity )
                            // InternalETLDsl.g:234:7: lv_entity_12_0= ruleEntity
                            {

                            							newCompositeNode(grammarAccess.getLogpackageAccess().getEntityEntityParserRuleCall_7_0_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_entity_12_0=ruleEntity();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getLogpackageRule());
                            							}
                            							add(
                            								current,
                            								"entity",
                            								lv_entity_12_0,
                            								"org.etl_modeling.etldsl.ETLDsl.Entity");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalETLDsl.g:252:4: (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalETLDsl.g:253:5: otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getLogpackageAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalETLDsl.g:257:5: ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==17) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==22) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalETLDsl.g:258:6: ( (lv_commonmapping_14_0= ruleCommonMapping ) )
                    	            {
                    	            // InternalETLDsl.g:258:6: ( (lv_commonmapping_14_0= ruleCommonMapping ) )
                    	            // InternalETLDsl.g:259:7: (lv_commonmapping_14_0= ruleCommonMapping )
                    	            {
                    	            // InternalETLDsl.g:259:7: (lv_commonmapping_14_0= ruleCommonMapping )
                    	            // InternalETLDsl.g:260:8: lv_commonmapping_14_0= ruleCommonMapping
                    	            {

                    	            								newCompositeNode(grammarAccess.getLogpackageAccess().getCommonmappingCommonMappingParserRuleCall_7_1_1_0_0());
                    	            							
                    	            pushFollow(FOLLOW_12);
                    	            lv_commonmapping_14_0=ruleCommonMapping();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getLogpackageRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"commonmapping",
                    	            									lv_commonmapping_14_0,
                    	            									"org.etl_modeling.etldsl.ETLDsl.CommonMapping");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalETLDsl.g:278:6: ( (lv_entity_15_0= ruleEntity ) )
                    	            {
                    	            // InternalETLDsl.g:278:6: ( (lv_entity_15_0= ruleEntity ) )
                    	            // InternalETLDsl.g:279:7: (lv_entity_15_0= ruleEntity )
                    	            {
                    	            // InternalETLDsl.g:279:7: (lv_entity_15_0= ruleEntity )
                    	            // InternalETLDsl.g:280:8: lv_entity_15_0= ruleEntity
                    	            {

                    	            								newCompositeNode(grammarAccess.getLogpackageAccess().getEntityEntityParserRuleCall_7_1_1_1_0());
                    	            							
                    	            pushFollow(FOLLOW_12);
                    	            lv_entity_15_0=ruleEntity();

                    	            state._fsp--;


                    	            								if (current==null) {
                    	            									current = createModelElementForParent(grammarAccess.getLogpackageRule());
                    	            								}
                    	            								add(
                    	            									current,
                    	            									"entity",
                    	            									lv_entity_15_0,
                    	            									"org.etl_modeling.etldsl.ETLDsl.Entity");
                    	            								afterParserOrEnumRuleCall();
                    	            							

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "rulelogpackage"


    // $ANTLR start "entryRuleEString"
    // InternalETLDsl.g:304:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalETLDsl.g:304:47: (iv_ruleEString= ruleEString EOF )
            // InternalETLDsl.g:305:2: iv_ruleEString= ruleEString EOF
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
    // InternalETLDsl.g:311:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalETLDsl.g:317:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalETLDsl.g:318:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalETLDsl.g:318:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalETLDsl.g:319:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:327:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleCommonMapping"
    // InternalETLDsl.g:338:1: entryRuleCommonMapping returns [EObject current=null] : iv_ruleCommonMapping= ruleCommonMapping EOF ;
    public final EObject entryRuleCommonMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonMapping = null;


        try {
            // InternalETLDsl.g:338:54: (iv_ruleCommonMapping= ruleCommonMapping EOF )
            // InternalETLDsl.g:339:2: iv_ruleCommonMapping= ruleCommonMapping EOF
            {
             newCompositeNode(grammarAccess.getCommonMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonMapping=ruleCommonMapping();

            state._fsp--;

             current =iv_ruleCommonMapping; 
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
    // $ANTLR end "entryRuleCommonMapping"


    // $ANTLR start "ruleCommonMapping"
    // InternalETLDsl.g:345:1: ruleCommonMapping returns [EObject current=null] : (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleCommonMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_commonmappinginputfields_5_0 = null;

        EObject lv_commonmappinginputfields_7_0 = null;

        EObject lv_commonmappingoutputfields_11_0 = null;

        EObject lv_commonmappingoutputfields_13_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:351:2: ( (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalETLDsl.g:352:2: (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalETLDsl.g:352:2: (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalETLDsl.g:353:3: otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCommonMappingAccess().getCommonmappingKeyword_0());
            		
            // InternalETLDsl.g:357:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalETLDsl.g:358:4: (lv_name_1_0= RULE_ID )
            {
            // InternalETLDsl.g:358:4: (lv_name_1_0= RULE_ID )
            // InternalETLDsl.g:359:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCommonMappingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCommonMappingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalETLDsl.g:379:3: (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalETLDsl.g:380:4: otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommonMappingAccess().getInputFieldKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommonMappingAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalETLDsl.g:388:4: ( (lv_commonmappinginputfields_5_0= ruleField ) )
                    // InternalETLDsl.g:389:5: (lv_commonmappinginputfields_5_0= ruleField )
                    {
                    // InternalETLDsl.g:389:5: (lv_commonmappinginputfields_5_0= ruleField )
                    // InternalETLDsl.g:390:6: lv_commonmappinginputfields_5_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappinginputfieldsFieldParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_commonmappinginputfields_5_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommonMappingRule());
                    						}
                    						add(
                    							current,
                    							"commonmappinginputfields",
                    							lv_commonmappinginputfields_5_0,
                    							"org.etl_modeling.etldsl.ETLDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalETLDsl.g:407:4: (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalETLDsl.g:408:5: otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCommonMappingAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalETLDsl.g:412:5: ( (lv_commonmappinginputfields_7_0= ruleField ) )
                    	    // InternalETLDsl.g:413:6: (lv_commonmappinginputfields_7_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:413:6: (lv_commonmappinginputfields_7_0= ruleField )
                    	    // InternalETLDsl.g:414:7: lv_commonmappinginputfields_7_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappinginputfieldsFieldParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_commonmappinginputfields_7_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommonMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"commonmappinginputfields",
                    	    								lv_commonmappinginputfields_7_0,
                    	    								"org.etl_modeling.etldsl.ETLDsl.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getCommonMappingAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalETLDsl.g:437:3: (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalETLDsl.g:438:4: otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommonMappingAccess().getOutputFieldKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getCommonMappingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalETLDsl.g:446:4: ( (lv_commonmappingoutputfields_11_0= ruleField ) )
                    // InternalETLDsl.g:447:5: (lv_commonmappingoutputfields_11_0= ruleField )
                    {
                    // InternalETLDsl.g:447:5: (lv_commonmappingoutputfields_11_0= ruleField )
                    // InternalETLDsl.g:448:6: lv_commonmappingoutputfields_11_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappingoutputfieldsFieldParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_commonmappingoutputfields_11_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommonMappingRule());
                    						}
                    						add(
                    							current,
                    							"commonmappingoutputfields",
                    							lv_commonmappingoutputfields_11_0,
                    							"org.etl_modeling.etldsl.ETLDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalETLDsl.g:465:4: (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalETLDsl.g:466:5: otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getCommonMappingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalETLDsl.g:470:5: ( (lv_commonmappingoutputfields_13_0= ruleField ) )
                    	    // InternalETLDsl.g:471:6: (lv_commonmappingoutputfields_13_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:471:6: (lv_commonmappingoutputfields_13_0= ruleField )
                    	    // InternalETLDsl.g:472:7: lv_commonmappingoutputfields_13_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappingoutputfieldsFieldParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_commonmappingoutputfields_13_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommonMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"commonmappingoutputfields",
                    	    								lv_commonmappingoutputfields_13_0,
                    	    								"org.etl_modeling.etldsl.ETLDsl.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommonMappingAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getCommonMappingAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCommonMapping"


    // $ANTLR start "entryRuleEntity"
    // InternalETLDsl.g:503:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalETLDsl.g:503:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalETLDsl.g:504:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalETLDsl.g:510:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'entityFields' otherlv_5= '{' ( (lv_entityField_6_0= ruleField ) ) ( (lv_entityField_7_0= ruleField ) )* otherlv_8= '}' )? ( (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )? | (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )? ) otherlv_21= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_entityField_6_0 = null;

        EObject lv_entityField_7_0 = null;

        EObject lv_include_11_0 = null;

        EObject lv_include_13_0 = null;

        EObject lv_relationships_17_0 = null;

        EObject lv_relationships_19_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:516:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'entityFields' otherlv_5= '{' ( (lv_entityField_6_0= ruleField ) ) ( (lv_entityField_7_0= ruleField ) )* otherlv_8= '}' )? ( (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )? | (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )? ) otherlv_21= '}' ) )
            // InternalETLDsl.g:517:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'entityFields' otherlv_5= '{' ( (lv_entityField_6_0= ruleField ) ) ( (lv_entityField_7_0= ruleField ) )* otherlv_8= '}' )? ( (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )? | (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )? ) otherlv_21= '}' )
            {
            // InternalETLDsl.g:517:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'entityFields' otherlv_5= '{' ( (lv_entityField_6_0= ruleField ) ) ( (lv_entityField_7_0= ruleField ) )* otherlv_8= '}' )? ( (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )? | (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )? ) otherlv_21= '}' )
            // InternalETLDsl.g:518:3: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'entityFields' otherlv_5= '{' ( (lv_entityField_6_0= ruleField ) ) ( (lv_entityField_7_0= ruleField ) )* otherlv_8= '}' )? ( (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )? | (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )? ) otherlv_21= '}'
            {
            // InternalETLDsl.g:518:3: ()
            // InternalETLDsl.g:519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalETLDsl.g:529:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalETLDsl.g:530:4: (lv_name_2_0= RULE_ID )
            {
            // InternalETLDsl.g:530:4: (lv_name_2_0= RULE_ID )
            // InternalETLDsl.g:531:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalETLDsl.g:551:3: (otherlv_4= 'entityFields' otherlv_5= '{' ( (lv_entityField_6_0= ruleField ) ) ( (lv_entityField_7_0= ruleField ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalETLDsl.g:552:4: otherlv_4= 'entityFields' otherlv_5= '{' ( (lv_entityField_6_0= ruleField ) ) ( (lv_entityField_7_0= ruleField ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getEntityFieldsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalETLDsl.g:560:4: ( (lv_entityField_6_0= ruleField ) )
                    // InternalETLDsl.g:561:5: (lv_entityField_6_0= ruleField )
                    {
                    // InternalETLDsl.g:561:5: (lv_entityField_6_0= ruleField )
                    // InternalETLDsl.g:562:6: lv_entityField_6_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getEntityFieldFieldParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_entityField_6_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"entityField",
                    							lv_entityField_6_0,
                    							"org.etl_modeling.etldsl.ETLDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalETLDsl.g:579:4: ( (lv_entityField_7_0= ruleField ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalETLDsl.g:580:5: (lv_entityField_7_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:580:5: (lv_entityField_7_0= ruleField )
                    	    // InternalETLDsl.g:581:6: lv_entityField_7_0= ruleField
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getEntityFieldFieldParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_entityField_7_0=ruleField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entityField",
                    	    							lv_entityField_7_0,
                    	    							"org.etl_modeling.etldsl.ETLDsl.Field");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalETLDsl.g:603:3: ( (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )? | (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )? )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 20:
                {
                alt20=1;
                }
                break;
            case 27:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalETLDsl.g:604:4: (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )?
                    {
                    // InternalETLDsl.g:604:4: (otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalETLDsl.g:605:5: otherlv_9= 'INCLUDES' otherlv_10= '[' ( (lv_include_11_0= ruleInclude ) ) (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )* otherlv_14= ']'
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_24); 

                            					newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getINCLUDESKeyword_5_0_0());
                            				
                            otherlv_10=(Token)match(input,25,FOLLOW_25); 

                            					newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_5_0_1());
                            				
                            // InternalETLDsl.g:613:5: ( (lv_include_11_0= ruleInclude ) )
                            // InternalETLDsl.g:614:6: (lv_include_11_0= ruleInclude )
                            {
                            // InternalETLDsl.g:614:6: (lv_include_11_0= ruleInclude )
                            // InternalETLDsl.g:615:7: lv_include_11_0= ruleInclude
                            {

                            							newCompositeNode(grammarAccess.getEntityAccess().getIncludeIncludeParserRuleCall_5_0_2_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_include_11_0=ruleInclude();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEntityRule());
                            							}
                            							add(
                            								current,
                            								"include",
                            								lv_include_11_0,
                            								"org.etl_modeling.etldsl.ETLDsl.Include");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalETLDsl.g:632:5: (otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==16) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalETLDsl.g:633:6: otherlv_12= ',' ( (lv_include_13_0= ruleInclude ) )
                            	    {
                            	    otherlv_12=(Token)match(input,16,FOLLOW_25); 

                            	    						newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getCommaKeyword_5_0_3_0());
                            	    					
                            	    // InternalETLDsl.g:637:6: ( (lv_include_13_0= ruleInclude ) )
                            	    // InternalETLDsl.g:638:7: (lv_include_13_0= ruleInclude )
                            	    {
                            	    // InternalETLDsl.g:638:7: (lv_include_13_0= ruleInclude )
                            	    // InternalETLDsl.g:639:8: lv_include_13_0= ruleInclude
                            	    {

                            	    								newCompositeNode(grammarAccess.getEntityAccess().getIncludeIncludeParserRuleCall_5_0_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_26);
                            	    lv_include_13_0=ruleInclude();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEntityRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"include",
                            	    									lv_include_13_0,
                            	    									"org.etl_modeling.etldsl.ETLDsl.Include");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,26,FOLLOW_20); 

                            					newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5_0_4());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:663:4: (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )?
                    {
                    // InternalETLDsl.g:663:4: (otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalETLDsl.g:664:5: otherlv_15= 'Relationship' otherlv_16= '[' ( (lv_relationships_17_0= ruleRelationship ) ) (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )* otherlv_20= ']'
                            {
                            otherlv_15=(Token)match(input,27,FOLLOW_24); 

                            					newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRelationshipKeyword_5_1_0());
                            				
                            otherlv_16=(Token)match(input,25,FOLLOW_14); 

                            					newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_5_1_1());
                            				
                            // InternalETLDsl.g:672:5: ( (lv_relationships_17_0= ruleRelationship ) )
                            // InternalETLDsl.g:673:6: (lv_relationships_17_0= ruleRelationship )
                            {
                            // InternalETLDsl.g:673:6: (lv_relationships_17_0= ruleRelationship )
                            // InternalETLDsl.g:674:7: lv_relationships_17_0= ruleRelationship
                            {

                            							newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_1_2_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_relationships_17_0=ruleRelationship();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEntityRule());
                            							}
                            							add(
                            								current,
                            								"relationships",
                            								lv_relationships_17_0,
                            								"org.etl_modeling.etldsl.ETLDsl.Relationship");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalETLDsl.g:691:5: (otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==16) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalETLDsl.g:692:6: otherlv_18= ',' ( (lv_relationships_19_0= ruleRelationship ) )
                            	    {
                            	    otherlv_18=(Token)match(input,16,FOLLOW_14); 

                            	    						newLeafNode(otherlv_18, grammarAccess.getEntityAccess().getCommaKeyword_5_1_3_0());
                            	    					
                            	    // InternalETLDsl.g:696:6: ( (lv_relationships_19_0= ruleRelationship ) )
                            	    // InternalETLDsl.g:697:7: (lv_relationships_19_0= ruleRelationship )
                            	    {
                            	    // InternalETLDsl.g:697:7: (lv_relationships_19_0= ruleRelationship )
                            	    // InternalETLDsl.g:698:8: lv_relationships_19_0= ruleRelationship
                            	    {

                            	    								newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_5_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_26);
                            	    lv_relationships_19_0=ruleRelationship();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getEntityRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"relationships",
                            	    									lv_relationships_19_0,
                            	    									"org.etl_modeling.etldsl.ETLDsl.Relationship");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_20=(Token)match(input,26,FOLLOW_20); 

                            					newLeafNode(otherlv_20, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_5_1_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalETLDsl.g:730:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalETLDsl.g:730:46: (iv_ruleField= ruleField EOF )
            // InternalETLDsl.g:731:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalETLDsl.g:737:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? (otherlv_20= 'allowExponent:' ( (lv_allowExponent_21_0= ruleEBoolean ) ) )? (otherlv_22= 'hasImplicitComma:' ( (lv_hasImplicitComma_23_0= ruleEBoolean ) ) )? (otherlv_24= 'interfaceOnly:' ( (lv_interfaceOnly_25_0= ruleEBoolean ) ) )? (otherlv_26= 'tableOnly:' ( (lv_tableOnly_27_0= ruleEBoolean ) ) )? (otherlv_28= 'isFastChanging:' ( (lv_isFastChanging_29_0= ruleEBoolean ) ) )? otherlv_30= ']' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_length_7_0 = null;

        AntlrDatatypeRuleToken lv_precision_9_0 = null;

        AntlrDatatypeRuleToken lv_scale_11_0 = null;

        AntlrDatatypeRuleToken lv_original_name_13_0 = null;

        AntlrDatatypeRuleToken lv_short_describtion_15_0 = null;

        AntlrDatatypeRuleToken lv_dateFormat_17_0 = null;

        AntlrDatatypeRuleToken lv_NullIndicator_19_0 = null;

        AntlrDatatypeRuleToken lv_allowExponent_21_0 = null;

        AntlrDatatypeRuleToken lv_hasImplicitComma_23_0 = null;

        AntlrDatatypeRuleToken lv_interfaceOnly_25_0 = null;

        AntlrDatatypeRuleToken lv_tableOnly_27_0 = null;

        AntlrDatatypeRuleToken lv_isFastChanging_29_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:743:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? (otherlv_20= 'allowExponent:' ( (lv_allowExponent_21_0= ruleEBoolean ) ) )? (otherlv_22= 'hasImplicitComma:' ( (lv_hasImplicitComma_23_0= ruleEBoolean ) ) )? (otherlv_24= 'interfaceOnly:' ( (lv_interfaceOnly_25_0= ruleEBoolean ) ) )? (otherlv_26= 'tableOnly:' ( (lv_tableOnly_27_0= ruleEBoolean ) ) )? (otherlv_28= 'isFastChanging:' ( (lv_isFastChanging_29_0= ruleEBoolean ) ) )? otherlv_30= ']' ) )
            // InternalETLDsl.g:744:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? (otherlv_20= 'allowExponent:' ( (lv_allowExponent_21_0= ruleEBoolean ) ) )? (otherlv_22= 'hasImplicitComma:' ( (lv_hasImplicitComma_23_0= ruleEBoolean ) ) )? (otherlv_24= 'interfaceOnly:' ( (lv_interfaceOnly_25_0= ruleEBoolean ) ) )? (otherlv_26= 'tableOnly:' ( (lv_tableOnly_27_0= ruleEBoolean ) ) )? (otherlv_28= 'isFastChanging:' ( (lv_isFastChanging_29_0= ruleEBoolean ) ) )? otherlv_30= ']' )
            {
            // InternalETLDsl.g:744:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? (otherlv_20= 'allowExponent:' ( (lv_allowExponent_21_0= ruleEBoolean ) ) )? (otherlv_22= 'hasImplicitComma:' ( (lv_hasImplicitComma_23_0= ruleEBoolean ) ) )? (otherlv_24= 'interfaceOnly:' ( (lv_interfaceOnly_25_0= ruleEBoolean ) ) )? (otherlv_26= 'tableOnly:' ( (lv_tableOnly_27_0= ruleEBoolean ) ) )? (otherlv_28= 'isFastChanging:' ( (lv_isFastChanging_29_0= ruleEBoolean ) ) )? otherlv_30= ']' )
            // InternalETLDsl.g:745:3: () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? (otherlv_20= 'allowExponent:' ( (lv_allowExponent_21_0= ruleEBoolean ) ) )? (otherlv_22= 'hasImplicitComma:' ( (lv_hasImplicitComma_23_0= ruleEBoolean ) ) )? (otherlv_24= 'interfaceOnly:' ( (lv_interfaceOnly_25_0= ruleEBoolean ) ) )? (otherlv_26= 'tableOnly:' ( (lv_tableOnly_27_0= ruleEBoolean ) ) )? (otherlv_28= 'isFastChanging:' ( (lv_isFastChanging_29_0= ruleEBoolean ) ) )? otherlv_30= ']'
            {
            // InternalETLDsl.g:745:3: ()
            // InternalETLDsl.g:746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalETLDsl.g:756:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalETLDsl.g:757:4: (lv_name_2_0= RULE_ID )
            {
            // InternalETLDsl.g:757:4: (lv_name_2_0= RULE_ID )
            // InternalETLDsl.g:758:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalETLDsl.g:778:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) )
            // InternalETLDsl.g:779:4: otherlv_4= 'type' ( (lv_type_5_0= ruleft ) )
            {
            otherlv_4=(Token)match(input,29,FOLLOW_28); 

            				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
            			
            // InternalETLDsl.g:783:4: ( (lv_type_5_0= ruleft ) )
            // InternalETLDsl.g:784:5: (lv_type_5_0= ruleft )
            {
            // InternalETLDsl.g:784:5: (lv_type_5_0= ruleft )
            // InternalETLDsl.g:785:6: lv_type_5_0= ruleft
            {

            						newCompositeNode(grammarAccess.getFieldAccess().getTypeFtEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_29);
            lv_type_5_0=ruleft();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFieldRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_5_0,
            							"org.etl_modeling.etldsl.ETLDsl.ft");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalETLDsl.g:803:3: (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalETLDsl.g:804:4: otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLengthKeyword_5_0());
                    			
                    // InternalETLDsl.g:808:4: ( (lv_length_7_0= ruleEInt ) )
                    // InternalETLDsl.g:809:5: (lv_length_7_0= ruleEInt )
                    {
                    // InternalETLDsl.g:809:5: (lv_length_7_0= ruleEInt )
                    // InternalETLDsl.g:810:6: lv_length_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getLengthEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_length_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_7_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:828:3: (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalETLDsl.g:829:4: otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getPrecisionKeyword_6_0());
                    			
                    // InternalETLDsl.g:833:4: ( (lv_precision_9_0= ruleEInt ) )
                    // InternalETLDsl.g:834:5: (lv_precision_9_0= ruleEInt )
                    {
                    // InternalETLDsl.g:834:5: (lv_precision_9_0= ruleEInt )
                    // InternalETLDsl.g:835:6: lv_precision_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getPrecisionEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_precision_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"precision",
                    							lv_precision_9_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:853:3: (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalETLDsl.g:854:4: otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getScaleKeyword_7_0());
                    			
                    // InternalETLDsl.g:858:4: ( (lv_scale_11_0= ruleEInt ) )
                    // InternalETLDsl.g:859:5: (lv_scale_11_0= ruleEInt )
                    {
                    // InternalETLDsl.g:859:5: (lv_scale_11_0= ruleEInt )
                    // InternalETLDsl.g:860:6: lv_scale_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getScaleEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_scale_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"scale",
                    							lv_scale_11_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:878:3: (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalETLDsl.g:879:4: otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getOriginal_nameKeyword_8_0());
                    			
                    // InternalETLDsl.g:883:4: ( (lv_original_name_13_0= ruleEString ) )
                    // InternalETLDsl.g:884:5: (lv_original_name_13_0= ruleEString )
                    {
                    // InternalETLDsl.g:884:5: (lv_original_name_13_0= ruleEString )
                    // InternalETLDsl.g:885:6: lv_original_name_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getOriginal_nameEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_original_name_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"original_name",
                    							lv_original_name_13_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:903:3: (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalETLDsl.g:904:4: otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getFieldAccess().getShort_describtionKeyword_9_0());
                    			
                    // InternalETLDsl.g:908:4: ( (lv_short_describtion_15_0= ruleEString ) )
                    // InternalETLDsl.g:909:5: (lv_short_describtion_15_0= ruleEString )
                    {
                    // InternalETLDsl.g:909:5: (lv_short_describtion_15_0= ruleEString )
                    // InternalETLDsl.g:910:6: lv_short_describtion_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getShort_describtionEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_short_describtion_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"short_describtion",
                    							lv_short_describtion_15_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:928:3: (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalETLDsl.g:929:4: otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getFieldAccess().getDateFormatKeyword_10_0());
                    			
                    // InternalETLDsl.g:933:4: ( (lv_dateFormat_17_0= ruleEString ) )
                    // InternalETLDsl.g:934:5: (lv_dateFormat_17_0= ruleEString )
                    {
                    // InternalETLDsl.g:934:5: (lv_dateFormat_17_0= ruleEString )
                    // InternalETLDsl.g:935:6: lv_dateFormat_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getDateFormatEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_dateFormat_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"dateFormat",
                    							lv_dateFormat_17_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:953:3: (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalETLDsl.g:954:4: otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getFieldAccess().getNullIndicatorKeyword_11_0());
                    			
                    // InternalETLDsl.g:958:4: ( (lv_NullIndicator_19_0= ruleEString ) )
                    // InternalETLDsl.g:959:5: (lv_NullIndicator_19_0= ruleEString )
                    {
                    // InternalETLDsl.g:959:5: (lv_NullIndicator_19_0= ruleEString )
                    // InternalETLDsl.g:960:6: lv_NullIndicator_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getNullIndicatorEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_NullIndicator_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"NullIndicator",
                    							lv_NullIndicator_19_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:978:3: (otherlv_20= 'allowExponent:' ( (lv_allowExponent_21_0= ruleEBoolean ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalETLDsl.g:979:4: otherlv_20= 'allowExponent:' ( (lv_allowExponent_21_0= ruleEBoolean ) )
                    {
                    otherlv_20=(Token)match(input,37,FOLLOW_38); 

                    				newLeafNode(otherlv_20, grammarAccess.getFieldAccess().getAllowExponentKeyword_12_0());
                    			
                    // InternalETLDsl.g:983:4: ( (lv_allowExponent_21_0= ruleEBoolean ) )
                    // InternalETLDsl.g:984:5: (lv_allowExponent_21_0= ruleEBoolean )
                    {
                    // InternalETLDsl.g:984:5: (lv_allowExponent_21_0= ruleEBoolean )
                    // InternalETLDsl.g:985:6: lv_allowExponent_21_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getAllowExponentEBooleanParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_allowExponent_21_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"allowExponent",
                    							lv_allowExponent_21_0 != null,
                    							"org.etl_modeling.etldsl.ETLDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1003:3: (otherlv_22= 'hasImplicitComma:' ( (lv_hasImplicitComma_23_0= ruleEBoolean ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalETLDsl.g:1004:4: otherlv_22= 'hasImplicitComma:' ( (lv_hasImplicitComma_23_0= ruleEBoolean ) )
                    {
                    otherlv_22=(Token)match(input,38,FOLLOW_38); 

                    				newLeafNode(otherlv_22, grammarAccess.getFieldAccess().getHasImplicitCommaKeyword_13_0());
                    			
                    // InternalETLDsl.g:1008:4: ( (lv_hasImplicitComma_23_0= ruleEBoolean ) )
                    // InternalETLDsl.g:1009:5: (lv_hasImplicitComma_23_0= ruleEBoolean )
                    {
                    // InternalETLDsl.g:1009:5: (lv_hasImplicitComma_23_0= ruleEBoolean )
                    // InternalETLDsl.g:1010:6: lv_hasImplicitComma_23_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getHasImplicitCommaEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_hasImplicitComma_23_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"hasImplicitComma",
                    							lv_hasImplicitComma_23_0 != null,
                    							"org.etl_modeling.etldsl.ETLDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1028:3: (otherlv_24= 'interfaceOnly:' ( (lv_interfaceOnly_25_0= ruleEBoolean ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalETLDsl.g:1029:4: otherlv_24= 'interfaceOnly:' ( (lv_interfaceOnly_25_0= ruleEBoolean ) )
                    {
                    otherlv_24=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_24, grammarAccess.getFieldAccess().getInterfaceOnlyKeyword_14_0());
                    			
                    // InternalETLDsl.g:1033:4: ( (lv_interfaceOnly_25_0= ruleEBoolean ) )
                    // InternalETLDsl.g:1034:5: (lv_interfaceOnly_25_0= ruleEBoolean )
                    {
                    // InternalETLDsl.g:1034:5: (lv_interfaceOnly_25_0= ruleEBoolean )
                    // InternalETLDsl.g:1035:6: lv_interfaceOnly_25_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getInterfaceOnlyEBooleanParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_interfaceOnly_25_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"interfaceOnly",
                    							lv_interfaceOnly_25_0 != null,
                    							"org.etl_modeling.etldsl.ETLDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1053:3: (otherlv_26= 'tableOnly:' ( (lv_tableOnly_27_0= ruleEBoolean ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalETLDsl.g:1054:4: otherlv_26= 'tableOnly:' ( (lv_tableOnly_27_0= ruleEBoolean ) )
                    {
                    otherlv_26=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_26, grammarAccess.getFieldAccess().getTableOnlyKeyword_15_0());
                    			
                    // InternalETLDsl.g:1058:4: ( (lv_tableOnly_27_0= ruleEBoolean ) )
                    // InternalETLDsl.g:1059:5: (lv_tableOnly_27_0= ruleEBoolean )
                    {
                    // InternalETLDsl.g:1059:5: (lv_tableOnly_27_0= ruleEBoolean )
                    // InternalETLDsl.g:1060:6: lv_tableOnly_27_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getTableOnlyEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_tableOnly_27_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"tableOnly",
                    							lv_tableOnly_27_0 != null,
                    							"org.etl_modeling.etldsl.ETLDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1078:3: (otherlv_28= 'isFastChanging:' ( (lv_isFastChanging_29_0= ruleEBoolean ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalETLDsl.g:1079:4: otherlv_28= 'isFastChanging:' ( (lv_isFastChanging_29_0= ruleEBoolean ) )
                    {
                    otherlv_28=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_28, grammarAccess.getFieldAccess().getIsFastChangingKeyword_16_0());
                    			
                    // InternalETLDsl.g:1083:4: ( (lv_isFastChanging_29_0= ruleEBoolean ) )
                    // InternalETLDsl.g:1084:5: (lv_isFastChanging_29_0= ruleEBoolean )
                    {
                    // InternalETLDsl.g:1084:5: (lv_isFastChanging_29_0= ruleEBoolean )
                    // InternalETLDsl.g:1085:6: lv_isFastChanging_29_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getIsFastChangingEBooleanParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_isFastChanging_29_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"isFastChanging",
                    							lv_isFastChanging_29_0 != null,
                    							"org.etl_modeling.etldsl.ETLDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getFieldAccess().getRightSquareBracketKeyword_17());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalETLDsl.g:1111:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalETLDsl.g:1111:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalETLDsl.g:1112:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalETLDsl.g:1118:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1124:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalETLDsl.g:1125:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalETLDsl.g:1125:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalETLDsl.g:1126:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalETLDsl.g:1133:3: (kw= '.' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==42) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalETLDsl.g:1134:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_14); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
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


    // $ANTLR start "entryRuleEInt"
    // InternalETLDsl.g:1151:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalETLDsl.g:1151:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalETLDsl.g:1152:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalETLDsl.g:1158:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1164:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalETLDsl.g:1165:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalETLDsl.g:1165:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalETLDsl.g:1166:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalETLDsl.g:1166:3: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalETLDsl.g:1167:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_45); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalETLDsl.g:1184:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalETLDsl.g:1184:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalETLDsl.g:1185:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalETLDsl.g:1191:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1197:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalETLDsl.g:1198:2: (kw= 'true' | kw= 'false' )
            {
            // InternalETLDsl.g:1198:2: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalETLDsl.g:1199:3: kw= 'true'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1205:3: kw= 'false'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleInclude"
    // InternalETLDsl.g:1214:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalETLDsl.g:1214:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalETLDsl.g:1215:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalETLDsl.g:1221:1: ruleInclude returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '{' ( (lv_includeFields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_includeFields_2_0 = null;

        EObject lv_includeFields_4_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:1227:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '{' ( (lv_includeFields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )* otherlv_5= '}' )? ) )
            // InternalETLDsl.g:1228:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '{' ( (lv_includeFields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )* otherlv_5= '}' )? )
            {
            // InternalETLDsl.g:1228:2: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '{' ( (lv_includeFields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )* otherlv_5= '}' )? )
            // InternalETLDsl.g:1229:3: ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= '{' ( (lv_includeFields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )* otherlv_5= '}' )?
            {
            // InternalETLDsl.g:1229:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalETLDsl.g:1230:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalETLDsl.g:1230:4: (lv_name_0_0= RULE_STRING )
            // InternalETLDsl.g:1231:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIncludeAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalETLDsl.g:1247:3: (otherlv_1= '{' ( (lv_includeFields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )* otherlv_5= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalETLDsl.g:1248:4: otherlv_1= '{' ( (lv_includeFields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalETLDsl.g:1252:4: ( (lv_includeFields_2_0= ruleField ) )
                    // InternalETLDsl.g:1253:5: (lv_includeFields_2_0= ruleField )
                    {
                    // InternalETLDsl.g:1253:5: (lv_includeFields_2_0= ruleField )
                    // InternalETLDsl.g:1254:6: lv_includeFields_2_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getIncludeAccess().getIncludeFieldsFieldParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_includeFields_2_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIncludeRule());
                    						}
                    						add(
                    							current,
                    							"includeFields",
                    							lv_includeFields_2_0,
                    							"org.etl_modeling.etldsl.ETLDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalETLDsl.g:1271:4: (otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalETLDsl.g:1272:5: otherlv_3= ',' ( (lv_includeFields_4_0= ruleField ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalETLDsl.g:1276:5: ( (lv_includeFields_4_0= ruleField ) )
                    	    // InternalETLDsl.g:1277:6: (lv_includeFields_4_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:1277:6: (lv_includeFields_4_0= ruleField )
                    	    // InternalETLDsl.g:1278:7: lv_includeFields_4_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getIncludeAccess().getIncludeFieldsFieldParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_includeFields_4_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIncludeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"includeFields",
                    	    								lv_includeFields_4_0,
                    	    								"org.etl_modeling.etldsl.ETLDsl.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleRelationship"
    // InternalETLDsl.g:1305:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalETLDsl.g:1305:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalETLDsl.g:1306:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalETLDsl.g:1312:1: ruleRelationship returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM: ' ( ( ruleQualifiedName ) ) otherlv_4= 'To: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) otherlv_11= '}' )? ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1318:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM: ' ( ( ruleQualifiedName ) ) otherlv_4= 'To: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) otherlv_11= '}' )? ) )
            // InternalETLDsl.g:1319:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM: ' ( ( ruleQualifiedName ) ) otherlv_4= 'To: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) otherlv_11= '}' )? )
            {
            // InternalETLDsl.g:1319:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM: ' ( ( ruleQualifiedName ) ) otherlv_4= 'To: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) otherlv_11= '}' )? )
            // InternalETLDsl.g:1320:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'FROM: ' ( ( ruleQualifiedName ) ) otherlv_4= 'To: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) otherlv_11= '}' )?
            {
            // InternalETLDsl.g:1320:3: ()
            // InternalETLDsl.g:1321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
            					current);
            			

            }

            // InternalETLDsl.g:1327:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalETLDsl.g:1328:4: (lv_name_1_0= RULE_ID )
            {
            // InternalETLDsl.g:1328:4: (lv_name_1_0= RULE_ID )
            // InternalETLDsl.g:1329:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getFROMKeyword_2());
            		
            // InternalETLDsl.g:1349:3: ( ( ruleQualifiedName ) )
            // InternalETLDsl.g:1350:4: ( ruleQualifiedName )
            {
            // InternalETLDsl.g:1350:4: ( ruleQualifiedName )
            // InternalETLDsl.g:1351:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationshipAccess().getFromEntityEntityCrossReference_3_0());
            				
            pushFollow(FOLLOW_48);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getToKeyword_4());
            		
            // InternalETLDsl.g:1369:3: ( ( ruleQualifiedName ) )
            // InternalETLDsl.g:1370:4: ( ruleQualifiedName )
            {
            // InternalETLDsl.g:1370:4: ( ruleQualifiedName )
            // InternalETLDsl.g:1371:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationshipAccess().getToEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_49);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalETLDsl.g:1385:3: (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) otherlv_8= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalETLDsl.g:1386:4: otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getDescribingFieldsKeyword_6_0());
                    			
                    // InternalETLDsl.g:1390:4: ( ( ruleQualifiedName ) )
                    // InternalETLDsl.g:1391:5: ( ruleQualifiedName )
                    {
                    // InternalETLDsl.g:1391:5: ( ruleQualifiedName )
                    // InternalETLDsl.g:1392:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationshipRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getDescribingFieldsRelFieldCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_50); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalETLDsl.g:1411:3: (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) otherlv_11= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalETLDsl.g:1412:4: otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getIdentifyingFieldsKeyword_7_0());
                    			
                    // InternalETLDsl.g:1416:4: ( ( ruleQualifiedName ) )
                    // InternalETLDsl.g:1417:5: ( ruleQualifiedName )
                    {
                    // InternalETLDsl.g:1417:5: ( ruleQualifiedName )
                    // InternalETLDsl.g:1418:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationshipRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getIdentifiyingFieldsRelFieldCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "ruleLAYERTYPE"
    // InternalETLDsl.g:1441:1: ruleLAYERTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) ) ;
    public final Enumerator ruleLAYERTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1447:2: ( ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) ) )
            // InternalETLDsl.g:1448:2: ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) )
            {
            // InternalETLDsl.g:1448:2: ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt40=1;
                }
                break;
            case 51:
                {
                alt40=2;
                }
                break;
            case 52:
                {
                alt40=3;
                }
                break;
            case 53:
                {
                alt40=4;
                }
                break;
            case 54:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalETLDsl.g:1449:3: (enumLiteral_0= 'STAGE' )
                    {
                    // InternalETLDsl.g:1449:3: (enumLiteral_0= 'STAGE' )
                    // InternalETLDsl.g:1450:4: enumLiteral_0= 'STAGE'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getSTAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLAYERTYPEAccess().getSTAGEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1457:3: (enumLiteral_1= 'INTEGRATION' )
                    {
                    // InternalETLDsl.g:1457:3: (enumLiteral_1= 'INTEGRATION' )
                    // InternalETLDsl.g:1458:4: enumLiteral_1= 'INTEGRATION'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getINTEGRATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLAYERTYPEAccess().getINTEGRATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1465:3: (enumLiteral_2= 'EXPORT' )
                    {
                    // InternalETLDsl.g:1465:3: (enumLiteral_2= 'EXPORT' )
                    // InternalETLDsl.g:1466:4: enumLiteral_2= 'EXPORT'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getEXPORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLAYERTYPEAccess().getEXPORTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1473:3: (enumLiteral_3= 'REPORTING' )
                    {
                    // InternalETLDsl.g:1473:3: (enumLiteral_3= 'REPORTING' )
                    // InternalETLDsl.g:1474:4: enumLiteral_3= 'REPORTING'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getREPORTINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLAYERTYPEAccess().getREPORTINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalETLDsl.g:1481:3: (enumLiteral_4= 'HARMONISATION' )
                    {
                    // InternalETLDsl.g:1481:3: (enumLiteral_4= 'HARMONISATION' )
                    // InternalETLDsl.g:1482:4: enumLiteral_4= 'HARMONISATION'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getHARMONISATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLAYERTYPEAccess().getHARMONISATIONEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleLAYERTYPE"


    // $ANTLR start "ruleHISTORISATIONTYPE"
    // InternalETLDsl.g:1492:1: ruleHISTORISATIONTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) ) ;
    public final Enumerator ruleHISTORISATIONTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1498:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) ) )
            // InternalETLDsl.g:1499:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) )
            {
            // InternalETLDsl.g:1499:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt41=1;
                }
                break;
            case 56:
                {
                alt41=2;
                }
                break;
            case 57:
                {
                alt41=3;
                }
                break;
            case 58:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalETLDsl.g:1500:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalETLDsl.g:1500:3: (enumLiteral_0= 'NONE' )
                    // InternalETLDsl.g:1501:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getHISTORISATIONTYPEAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHISTORISATIONTYPEAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1508:3: (enumLiteral_1= 'DAY_PARTITIONED' )
                    {
                    // InternalETLDsl.g:1508:3: (enumLiteral_1= 'DAY_PARTITIONED' )
                    // InternalETLDsl.g:1509:4: enumLiteral_1= 'DAY_PARTITIONED'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getHISTORISATIONTYPEAccess().getDAY_PARTITIONEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHISTORISATIONTYPEAccess().getDAY_PARTITIONEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1516:3: (enumLiteral_2= 'MONTH_PARTITIONED' )
                    {
                    // InternalETLDsl.g:1516:3: (enumLiteral_2= 'MONTH_PARTITIONED' )
                    // InternalETLDsl.g:1517:4: enumLiteral_2= 'MONTH_PARTITIONED'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getHISTORISATIONTYPEAccess().getMONTH_PARTITIONEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHISTORISATIONTYPEAccess().getMONTH_PARTITIONEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1524:3: (enumLiteral_3= 'BITEMPORAL' )
                    {
                    // InternalETLDsl.g:1524:3: (enumLiteral_3= 'BITEMPORAL' )
                    // InternalETLDsl.g:1525:4: enumLiteral_3= 'BITEMPORAL'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getHISTORISATIONTYPEAccess().getBITEMPORALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHISTORISATIONTYPEAccess().getBITEMPORALEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleHISTORISATIONTYPE"


    // $ANTLR start "ruleREPRESENTATIONS"
    // InternalETLDsl.g:1535:1: ruleREPRESENTATIONS returns [Enumerator current=null] : ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'BITEMPORAL' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) ) ;
    public final Enumerator ruleREPRESENTATIONS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1541:2: ( ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'BITEMPORAL' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) ) )
            // InternalETLDsl.g:1542:2: ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'BITEMPORAL' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) )
            {
            // InternalETLDsl.g:1542:2: ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'BITEMPORAL' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt42=1;
                }
                break;
            case 58:
                {
                alt42=2;
                }
                break;
            case 60:
                {
                alt42=3;
                }
                break;
            case 61:
                {
                alt42=4;
                }
                break;
            case 62:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalETLDsl.g:1543:3: (enumLiteral_0= 'FLAT_TABLE' )
                    {
                    // InternalETLDsl.g:1543:3: (enumLiteral_0= 'FLAT_TABLE' )
                    // InternalETLDsl.g:1544:4: enumLiteral_0= 'FLAT_TABLE'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getFLAT_TABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getREPRESENTATIONSAccess().getFLAT_TABLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1551:3: (enumLiteral_1= 'BITEMPORAL' )
                    {
                    // InternalETLDsl.g:1551:3: (enumLiteral_1= 'BITEMPORAL' )
                    // InternalETLDsl.g:1552:4: enumLiteral_1= 'BITEMPORAL'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getBITEMPORALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getREPRESENTATIONSAccess().getBITEMPORALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1559:3: (enumLiteral_2= 'ThirdNF' )
                    {
                    // InternalETLDsl.g:1559:3: (enumLiteral_2= 'ThirdNF' )
                    // InternalETLDsl.g:1560:4: enumLiteral_2= 'ThirdNF'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getThirdNFEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getREPRESENTATIONSAccess().getThirdNFEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1567:3: (enumLiteral_3= 'SNOWFLAKE' )
                    {
                    // InternalETLDsl.g:1567:3: (enumLiteral_3= 'SNOWFLAKE' )
                    // InternalETLDsl.g:1568:4: enumLiteral_3= 'SNOWFLAKE'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getSNOWFLAKEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getREPRESENTATIONSAccess().getSNOWFLAKEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalETLDsl.g:1575:3: (enumLiteral_4= 'STAR' )
                    {
                    // InternalETLDsl.g:1575:3: (enumLiteral_4= 'STAR' )
                    // InternalETLDsl.g:1576:4: enumLiteral_4= 'STAR'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getSTAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getREPRESENTATIONSAccess().getSTAREnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleREPRESENTATIONS"


    // $ANTLR start "ruleft"
    // InternalETLDsl.g:1586:1: ruleft returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) ) ;
    public final Enumerator ruleft() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1592:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) ) )
            // InternalETLDsl.g:1593:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) )
            {
            // InternalETLDsl.g:1593:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) )
            int alt43=7;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt43=1;
                }
                break;
            case 64:
                {
                alt43=2;
                }
                break;
            case 65:
                {
                alt43=3;
                }
                break;
            case 66:
                {
                alt43=4;
                }
                break;
            case 67:
                {
                alt43=5;
                }
                break;
            case 68:
                {
                alt43=6;
                }
                break;
            case 69:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalETLDsl.g:1594:3: (enumLiteral_0= 'String' )
                    {
                    // InternalETLDsl.g:1594:3: (enumLiteral_0= 'String' )
                    // InternalETLDsl.g:1595:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFtAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1602:3: (enumLiteral_1= 'Date' )
                    {
                    // InternalETLDsl.g:1602:3: (enumLiteral_1= 'Date' )
                    // InternalETLDsl.g:1603:4: enumLiteral_1= 'Date'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getDateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFtAccess().getDateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1610:3: (enumLiteral_2= 'Decimal' )
                    {
                    // InternalETLDsl.g:1610:3: (enumLiteral_2= 'Decimal' )
                    // InternalETLDsl.g:1611:4: enumLiteral_2= 'Decimal'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getDecimalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFtAccess().getDecimalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1618:3: (enumLiteral_3= 'HK' )
                    {
                    // InternalETLDsl.g:1618:3: (enumLiteral_3= 'HK' )
                    // InternalETLDsl.g:1619:4: enumLiteral_3= 'HK'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getHKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFtAccess().getHKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalETLDsl.g:1626:3: (enumLiteral_4= 'Int' )
                    {
                    // InternalETLDsl.g:1626:3: (enumLiteral_4= 'Int' )
                    // InternalETLDsl.g:1627:4: enumLiteral_4= 'Int'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getIntEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFtAccess().getIntEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalETLDsl.g:1634:3: (enumLiteral_5= 'TimeStamp' )
                    {
                    // InternalETLDsl.g:1634:3: (enumLiteral_5= 'TimeStamp' )
                    // InternalETLDsl.g:1635:4: enumLiteral_5= 'TimeStamp'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getTimeStampEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFtAccess().getTimeStampEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalETLDsl.g:1642:3: (enumLiteral_6= 'TrueFalse' )
                    {
                    // InternalETLDsl.g:1642:3: (enumLiteral_6= 'TrueFalse' )
                    // InternalETLDsl.g:1643:4: enumLiteral_6= 'TrueFalse'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getTrueFalseEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFtAccess().getTrueFalseEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleft"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000042F002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000042E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x007C000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000042C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000428002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x7C00000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000009900000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000009100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003FFC4000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000003FF84000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003FF04000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003FE04000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003FC04000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000003F804000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000003F004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000003E004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000003C004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000038004000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000030004000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000002L});

}