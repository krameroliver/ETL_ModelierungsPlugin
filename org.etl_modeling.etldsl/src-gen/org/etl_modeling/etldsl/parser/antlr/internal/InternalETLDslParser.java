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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'logpackage'", "'LAYER'", "'LAYER_TYPE'", "'HISTORISATION'", "'REPRESENTATION'", "','", "'.'", "'-'", "'commonmapping'", "'{'", "'InputField'", "'}'", "'OutputField'", "'Entity'", "'metadata'", "'FileName'", "'ColumnDelimiter'", "'lineDelimiter'", "'entityFields'", "'Includes'", "'Relationships'", "'Field'", "'['", "'type'", "'length'", "'precision'", "'scale'", "'original_name'", "'short_describtion'", "'dateFormat'", "'NullIndicator'", "'allowExponent'", "'hasImplicitComma'", "'interfaceOnly'", "'tableOnly'", "'isFastChanging'", "'BusinessKey'", "']'", "'Include'", "'IncludeFields'", "'IdentifyingFields:{'", "'Relationship'", "'ToEntity: '", "'DescribingFields:{'", "'String'", "'Date'", "'Decimal'", "'HK'", "'Int'", "'TimeStamp'", "'TrueFalse'", "'STAGE'", "'INTEGRATION'", "'EXPORT'", "'REPORTING'", "'HARMONISATION'", "'NONE'", "'DAY_PARTITIONED'", "'MONTH_PARTITIONED'", "'BITEMPORAL'", "'FLAT_TABLE'", "'DATAVAULT'", "'ThirdNF'", "'SNOWFLAKE'", "'STAR'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
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

            if ( (LA8_0==19||LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalETLDsl.g:211:4: ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) ) (otherlv_13= ',' ( ( (lv_commonmapping_14_0= ruleCommonMapping ) ) | ( (lv_entity_15_0= ruleEntity ) ) ) )*
                    {
                    // InternalETLDsl.g:211:4: ( ( (lv_commonmapping_11_0= ruleCommonMapping ) ) | ( (lv_entity_12_0= ruleEntity ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==24) ) {
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

                    	    if ( (LA6_0==19) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==24) ) {
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalETLDsl.g:304:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalETLDsl.g:304:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalETLDsl.g:305:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalETLDsl.g:311:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalETLDsl.g:317:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalETLDsl.g:318:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalETLDsl.g:318:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalETLDsl.g:319:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalETLDsl.g:326:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalETLDsl.g:327:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalETLDsl.g:344:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalETLDsl.g:344:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalETLDsl.g:345:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalETLDsl.g:351:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalETLDsl.g:357:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalETLDsl.g:358:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalETLDsl.g:358:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalETLDsl.g:359:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalETLDsl.g:359:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalETLDsl.g:360:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_16); 

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


    // $ANTLR start "entryRuleEString"
    // InternalETLDsl.g:377:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalETLDsl.g:377:47: (iv_ruleEString= ruleEString EOF )
            // InternalETLDsl.g:378:2: iv_ruleEString= ruleEString EOF
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
    // InternalETLDsl.g:384:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalETLDsl.g:390:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalETLDsl.g:391:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalETLDsl.g:391:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalETLDsl.g:392:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:400:3: this_ID_1= RULE_ID
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
    // InternalETLDsl.g:411:1: entryRuleCommonMapping returns [EObject current=null] : iv_ruleCommonMapping= ruleCommonMapping EOF ;
    public final EObject entryRuleCommonMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonMapping = null;


        try {
            // InternalETLDsl.g:411:54: (iv_ruleCommonMapping= ruleCommonMapping EOF )
            // InternalETLDsl.g:412:2: iv_ruleCommonMapping= ruleCommonMapping EOF
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
    // InternalETLDsl.g:418:1: ruleCommonMapping returns [EObject current=null] : (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalETLDsl.g:424:2: ( (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalETLDsl.g:425:2: (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalETLDsl.g:425:2: (otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalETLDsl.g:426:3: otherlv_0= 'commonmapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCommonMappingAccess().getCommonmappingKeyword_0());
            		
            // InternalETLDsl.g:430:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalETLDsl.g:431:4: (lv_name_1_0= RULE_ID )
            {
            // InternalETLDsl.g:431:4: (lv_name_1_0= RULE_ID )
            // InternalETLDsl.g:432:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCommonMappingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalETLDsl.g:452:3: (otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalETLDsl.g:453:4: otherlv_3= 'InputField' otherlv_4= '{' ( (lv_commonmappinginputfields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommonMappingAccess().getInputFieldKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommonMappingAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalETLDsl.g:461:4: ( (lv_commonmappinginputfields_5_0= ruleField ) )
                    // InternalETLDsl.g:462:5: (lv_commonmappinginputfields_5_0= ruleField )
                    {
                    // InternalETLDsl.g:462:5: (lv_commonmappinginputfields_5_0= ruleField )
                    // InternalETLDsl.g:463:6: lv_commonmappinginputfields_5_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappinginputfieldsFieldParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalETLDsl.g:480:4: (otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalETLDsl.g:481:5: otherlv_6= ',' ( (lv_commonmappinginputfields_7_0= ruleField ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCommonMappingAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalETLDsl.g:485:5: ( (lv_commonmappinginputfields_7_0= ruleField ) )
                    	    // InternalETLDsl.g:486:6: (lv_commonmappinginputfields_7_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:486:6: (lv_commonmappinginputfields_7_0= ruleField )
                    	    // InternalETLDsl.g:487:7: lv_commonmappinginputfields_7_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappinginputfieldsFieldParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getCommonMappingAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalETLDsl.g:510:3: (otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalETLDsl.g:511:4: otherlv_9= 'OutputField' otherlv_10= '{' ( (lv_commonmappingoutputfields_11_0= ruleField ) ) (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommonMappingAccess().getOutputFieldKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getCommonMappingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalETLDsl.g:519:4: ( (lv_commonmappingoutputfields_11_0= ruleField ) )
                    // InternalETLDsl.g:520:5: (lv_commonmappingoutputfields_11_0= ruleField )
                    {
                    // InternalETLDsl.g:520:5: (lv_commonmappingoutputfields_11_0= ruleField )
                    // InternalETLDsl.g:521:6: lv_commonmappingoutputfields_11_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappingoutputfieldsFieldParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalETLDsl.g:538:4: (otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalETLDsl.g:539:5: otherlv_12= ',' ( (lv_commonmappingoutputfields_13_0= ruleField ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getCommonMappingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalETLDsl.g:543:5: ( (lv_commonmappingoutputfields_13_0= ruleField ) )
                    	    // InternalETLDsl.g:544:6: (lv_commonmappingoutputfields_13_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:544:6: (lv_commonmappingoutputfields_13_0= ruleField )
                    	    // InternalETLDsl.g:545:7: lv_commonmappingoutputfields_13_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommonMappingAccess().getCommonmappingoutputfieldsFieldParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getCommonMappingAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,22,FOLLOW_2); 

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
    // InternalETLDsl.g:576:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalETLDsl.g:576:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalETLDsl.g:577:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalETLDsl.g:583:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'metadata' otherlv_4= '{' otherlv_5= 'FileName' ( (lv_filename_6_0= ruleEString ) ) otherlv_7= 'ColumnDelimiter' ( (lv_delimiter_8_0= ruleEString ) ) otherlv_9= 'lineDelimiter' ( (lv_lineend_10_0= ruleEString ) ) otherlv_11= '}' )? otherlv_12= '{' (otherlv_13= 'entityFields' otherlv_14= '{' ( (lv_entityField_15_0= ruleField ) ) ( (lv_entityField_16_0= ruleField ) )* otherlv_17= '}' )? (otherlv_18= 'Includes' otherlv_19= '{' ( (lv_include_20_0= ruleInclude ) ) (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )* otherlv_23= '}' )? (otherlv_24= 'Relationships' otherlv_25= '{' ( (lv_relationships_26_0= ruleRelationship ) ) (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_filename_6_0 = null;

        AntlrDatatypeRuleToken lv_delimiter_8_0 = null;

        AntlrDatatypeRuleToken lv_lineend_10_0 = null;

        EObject lv_entityField_15_0 = null;

        EObject lv_entityField_16_0 = null;

        EObject lv_include_20_0 = null;

        EObject lv_include_22_0 = null;

        EObject lv_relationships_26_0 = null;

        EObject lv_relationships_28_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:589:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'metadata' otherlv_4= '{' otherlv_5= 'FileName' ( (lv_filename_6_0= ruleEString ) ) otherlv_7= 'ColumnDelimiter' ( (lv_delimiter_8_0= ruleEString ) ) otherlv_9= 'lineDelimiter' ( (lv_lineend_10_0= ruleEString ) ) otherlv_11= '}' )? otherlv_12= '{' (otherlv_13= 'entityFields' otherlv_14= '{' ( (lv_entityField_15_0= ruleField ) ) ( (lv_entityField_16_0= ruleField ) )* otherlv_17= '}' )? (otherlv_18= 'Includes' otherlv_19= '{' ( (lv_include_20_0= ruleInclude ) ) (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )* otherlv_23= '}' )? (otherlv_24= 'Relationships' otherlv_25= '{' ( (lv_relationships_26_0= ruleRelationship ) ) (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalETLDsl.g:590:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'metadata' otherlv_4= '{' otherlv_5= 'FileName' ( (lv_filename_6_0= ruleEString ) ) otherlv_7= 'ColumnDelimiter' ( (lv_delimiter_8_0= ruleEString ) ) otherlv_9= 'lineDelimiter' ( (lv_lineend_10_0= ruleEString ) ) otherlv_11= '}' )? otherlv_12= '{' (otherlv_13= 'entityFields' otherlv_14= '{' ( (lv_entityField_15_0= ruleField ) ) ( (lv_entityField_16_0= ruleField ) )* otherlv_17= '}' )? (otherlv_18= 'Includes' otherlv_19= '{' ( (lv_include_20_0= ruleInclude ) ) (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )* otherlv_23= '}' )? (otherlv_24= 'Relationships' otherlv_25= '{' ( (lv_relationships_26_0= ruleRelationship ) ) (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalETLDsl.g:590:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'metadata' otherlv_4= '{' otherlv_5= 'FileName' ( (lv_filename_6_0= ruleEString ) ) otherlv_7= 'ColumnDelimiter' ( (lv_delimiter_8_0= ruleEString ) ) otherlv_9= 'lineDelimiter' ( (lv_lineend_10_0= ruleEString ) ) otherlv_11= '}' )? otherlv_12= '{' (otherlv_13= 'entityFields' otherlv_14= '{' ( (lv_entityField_15_0= ruleField ) ) ( (lv_entityField_16_0= ruleField ) )* otherlv_17= '}' )? (otherlv_18= 'Includes' otherlv_19= '{' ( (lv_include_20_0= ruleInclude ) ) (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )* otherlv_23= '}' )? (otherlv_24= 'Relationships' otherlv_25= '{' ( (lv_relationships_26_0= ruleRelationship ) ) (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalETLDsl.g:591:3: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'metadata' otherlv_4= '{' otherlv_5= 'FileName' ( (lv_filename_6_0= ruleEString ) ) otherlv_7= 'ColumnDelimiter' ( (lv_delimiter_8_0= ruleEString ) ) otherlv_9= 'lineDelimiter' ( (lv_lineend_10_0= ruleEString ) ) otherlv_11= '}' )? otherlv_12= '{' (otherlv_13= 'entityFields' otherlv_14= '{' ( (lv_entityField_15_0= ruleField ) ) ( (lv_entityField_16_0= ruleField ) )* otherlv_17= '}' )? (otherlv_18= 'Includes' otherlv_19= '{' ( (lv_include_20_0= ruleInclude ) ) (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )* otherlv_23= '}' )? (otherlv_24= 'Relationships' otherlv_25= '{' ( (lv_relationships_26_0= ruleRelationship ) ) (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // InternalETLDsl.g:591:3: ()
            // InternalETLDsl.g:592:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalETLDsl.g:602:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalETLDsl.g:603:4: (lv_name_2_0= RULE_ID )
            {
            // InternalETLDsl.g:603:4: (lv_name_2_0= RULE_ID )
            // InternalETLDsl.g:604:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            // InternalETLDsl.g:620:3: (otherlv_3= 'metadata' otherlv_4= '{' otherlv_5= 'FileName' ( (lv_filename_6_0= ruleEString ) ) otherlv_7= 'ColumnDelimiter' ( (lv_delimiter_8_0= ruleEString ) ) otherlv_9= 'lineDelimiter' ( (lv_lineend_10_0= ruleEString ) ) otherlv_11= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalETLDsl.g:621:4: otherlv_3= 'metadata' otherlv_4= '{' otherlv_5= 'FileName' ( (lv_filename_6_0= ruleEString ) ) otherlv_7= 'ColumnDelimiter' ( (lv_delimiter_8_0= ruleEString ) ) otherlv_9= 'lineDelimiter' ( (lv_lineend_10_0= ruleEString ) ) otherlv_11= '}'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getMetadataKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getFileNameKeyword_3_2());
                    			
                    // InternalETLDsl.g:633:4: ( (lv_filename_6_0= ruleEString ) )
                    // InternalETLDsl.g:634:5: (lv_filename_6_0= ruleEString )
                    {
                    // InternalETLDsl.g:634:5: (lv_filename_6_0= ruleEString )
                    // InternalETLDsl.g:635:6: lv_filename_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getFilenameEStringParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_filename_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"filename",
                    							lv_filename_6_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getColumnDelimiterKeyword_3_4());
                    			
                    // InternalETLDsl.g:656:4: ( (lv_delimiter_8_0= ruleEString ) )
                    // InternalETLDsl.g:657:5: (lv_delimiter_8_0= ruleEString )
                    {
                    // InternalETLDsl.g:657:5: (lv_delimiter_8_0= ruleEString )
                    // InternalETLDsl.g:658:6: lv_delimiter_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getDelimiterEStringParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_delimiter_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"delimiter",
                    							lv_delimiter_8_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getLineDelimiterKeyword_3_6());
                    			
                    // InternalETLDsl.g:679:4: ( (lv_lineend_10_0= ruleEString ) )
                    // InternalETLDsl.g:680:5: (lv_lineend_10_0= ruleEString )
                    {
                    // InternalETLDsl.g:680:5: (lv_lineend_10_0= ruleEString )
                    // InternalETLDsl.g:681:6: lv_lineend_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getLineendEStringParserRuleCall_3_7_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_lineend_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"lineend",
                    							lv_lineend_10_0,
                    							"org.etl_modeling.etldsl.ETLDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_8());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalETLDsl.g:707:3: (otherlv_13= 'entityFields' otherlv_14= '{' ( (lv_entityField_15_0= ruleField ) ) ( (lv_entityField_16_0= ruleField ) )* otherlv_17= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalETLDsl.g:708:4: otherlv_13= 'entityFields' otherlv_14= '{' ( (lv_entityField_15_0= ruleField ) ) ( (lv_entityField_16_0= ruleField ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getEntityFieldsKeyword_5_0());
                    			
                    otherlv_14=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalETLDsl.g:716:4: ( (lv_entityField_15_0= ruleField ) )
                    // InternalETLDsl.g:717:5: (lv_entityField_15_0= ruleField )
                    {
                    // InternalETLDsl.g:717:5: (lv_entityField_15_0= ruleField )
                    // InternalETLDsl.g:718:6: lv_entityField_15_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getEntityFieldFieldParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_entityField_15_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"entityField",
                    							lv_entityField_15_0,
                    							"org.etl_modeling.etldsl.ETLDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalETLDsl.g:735:4: ( (lv_entityField_16_0= ruleField ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==32) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalETLDsl.g:736:5: (lv_entityField_16_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:736:5: (lv_entityField_16_0= ruleField )
                    	    // InternalETLDsl.g:737:6: lv_entityField_16_0= ruleField
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getEntityFieldFieldParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_entityField_16_0=ruleField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entityField",
                    	    							lv_entityField_16_0,
                    	    							"org.etl_modeling.etldsl.ETLDsl.Field");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,22,FOLLOW_29); 

                    				newLeafNode(otherlv_17, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalETLDsl.g:759:3: (otherlv_18= 'Includes' otherlv_19= '{' ( (lv_include_20_0= ruleInclude ) ) (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )* otherlv_23= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalETLDsl.g:760:4: otherlv_18= 'Includes' otherlv_19= '{' ( (lv_include_20_0= ruleInclude ) ) (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getEntityAccess().getIncludesKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,20,FOLLOW_30); 

                    				newLeafNode(otherlv_19, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalETLDsl.g:768:4: ( (lv_include_20_0= ruleInclude ) )
                    // InternalETLDsl.g:769:5: (lv_include_20_0= ruleInclude )
                    {
                    // InternalETLDsl.g:769:5: (lv_include_20_0= ruleInclude )
                    // InternalETLDsl.g:770:6: lv_include_20_0= ruleInclude
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getIncludeIncludeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_include_20_0=ruleInclude();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"include",
                    							lv_include_20_0,
                    							"org.etl_modeling.etldsl.ETLDsl.Include");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalETLDsl.g:787:4: (otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalETLDsl.g:788:5: otherlv_21= ',' ( (lv_include_22_0= ruleInclude ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_30); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getEntityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalETLDsl.g:792:5: ( (lv_include_22_0= ruleInclude ) )
                    	    // InternalETLDsl.g:793:6: (lv_include_22_0= ruleInclude )
                    	    {
                    	    // InternalETLDsl.g:793:6: (lv_include_22_0= ruleInclude )
                    	    // InternalETLDsl.g:794:7: lv_include_22_0= ruleInclude
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getIncludeIncludeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_include_22_0=ruleInclude();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"include",
                    	    								lv_include_22_0,
                    	    								"org.etl_modeling.etldsl.ETLDsl.Include");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,22,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalETLDsl.g:817:3: (otherlv_24= 'Relationships' otherlv_25= '{' ( (lv_relationships_26_0= ruleRelationship ) ) (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )* otherlv_29= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalETLDsl.g:818:4: otherlv_24= 'Relationships' otherlv_25= '{' ( (lv_relationships_26_0= ruleRelationship ) ) (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_24, grammarAccess.getEntityAccess().getRelationshipsKeyword_7_0());
                    			
                    otherlv_25=(Token)match(input,20,FOLLOW_32); 

                    				newLeafNode(otherlv_25, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalETLDsl.g:826:4: ( (lv_relationships_26_0= ruleRelationship ) )
                    // InternalETLDsl.g:827:5: (lv_relationships_26_0= ruleRelationship )
                    {
                    // InternalETLDsl.g:827:5: (lv_relationships_26_0= ruleRelationship )
                    // InternalETLDsl.g:828:6: lv_relationships_26_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_relationships_26_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"relationships",
                    							lv_relationships_26_0,
                    							"org.etl_modeling.etldsl.ETLDsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalETLDsl.g:845:4: (otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalETLDsl.g:846:5: otherlv_27= ',' ( (lv_relationships_28_0= ruleRelationship ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_32); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getEntityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalETLDsl.g:850:5: ( (lv_relationships_28_0= ruleRelationship ) )
                    	    // InternalETLDsl.g:851:6: (lv_relationships_28_0= ruleRelationship )
                    	    {
                    	    // InternalETLDsl.g:851:6: (lv_relationships_28_0= ruleRelationship )
                    	    // InternalETLDsl.g:852:7: lv_relationships_28_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getRelationshipsRelationshipParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_relationships_28_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relationships",
                    	    								lv_relationships_28_0,
                    	    								"org.etl_modeling.etldsl.ETLDsl.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_29, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalETLDsl.g:883:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalETLDsl.g:883:46: (iv_ruleField= ruleField EOF )
            // InternalETLDsl.g:884:2: iv_ruleField= ruleField EOF
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
    // InternalETLDsl.g:890:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? ( (lv_allowExponent_20_0= 'allowExponent' ) )? ( (lv_hasImplicitComma_21_0= 'hasImplicitComma' ) )? ( (lv_interfaceOnly_22_0= 'interfaceOnly' ) )? ( (lv_tableOnly_23_0= 'tableOnly' ) )? ( (lv_isFastChanging_24_0= 'isFastChanging' ) )? ( (lv_isBusinessKey_25_0= 'BusinessKey' ) )? otherlv_26= ']' ) ;
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
        Token lv_allowExponent_20_0=null;
        Token lv_hasImplicitComma_21_0=null;
        Token lv_interfaceOnly_22_0=null;
        Token lv_tableOnly_23_0=null;
        Token lv_isFastChanging_24_0=null;
        Token lv_isBusinessKey_25_0=null;
        Token otherlv_26=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_length_7_0 = null;

        AntlrDatatypeRuleToken lv_precision_9_0 = null;

        AntlrDatatypeRuleToken lv_scale_11_0 = null;

        AntlrDatatypeRuleToken lv_original_name_13_0 = null;

        AntlrDatatypeRuleToken lv_short_describtion_15_0 = null;

        AntlrDatatypeRuleToken lv_dateFormat_17_0 = null;

        AntlrDatatypeRuleToken lv_NullIndicator_19_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:896:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? ( (lv_allowExponent_20_0= 'allowExponent' ) )? ( (lv_hasImplicitComma_21_0= 'hasImplicitComma' ) )? ( (lv_interfaceOnly_22_0= 'interfaceOnly' ) )? ( (lv_tableOnly_23_0= 'tableOnly' ) )? ( (lv_isFastChanging_24_0= 'isFastChanging' ) )? ( (lv_isBusinessKey_25_0= 'BusinessKey' ) )? otherlv_26= ']' ) )
            // InternalETLDsl.g:897:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? ( (lv_allowExponent_20_0= 'allowExponent' ) )? ( (lv_hasImplicitComma_21_0= 'hasImplicitComma' ) )? ( (lv_interfaceOnly_22_0= 'interfaceOnly' ) )? ( (lv_tableOnly_23_0= 'tableOnly' ) )? ( (lv_isFastChanging_24_0= 'isFastChanging' ) )? ( (lv_isBusinessKey_25_0= 'BusinessKey' ) )? otherlv_26= ']' )
            {
            // InternalETLDsl.g:897:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? ( (lv_allowExponent_20_0= 'allowExponent' ) )? ( (lv_hasImplicitComma_21_0= 'hasImplicitComma' ) )? ( (lv_interfaceOnly_22_0= 'interfaceOnly' ) )? ( (lv_tableOnly_23_0= 'tableOnly' ) )? ( (lv_isFastChanging_24_0= 'isFastChanging' ) )? ( (lv_isBusinessKey_25_0= 'BusinessKey' ) )? otherlv_26= ']' )
            // InternalETLDsl.g:898:3: () otherlv_1= 'Field' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) ) (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )? (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )? (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )? (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )? (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )? (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )? (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )? ( (lv_allowExponent_20_0= 'allowExponent' ) )? ( (lv_hasImplicitComma_21_0= 'hasImplicitComma' ) )? ( (lv_interfaceOnly_22_0= 'interfaceOnly' ) )? ( (lv_tableOnly_23_0= 'tableOnly' ) )? ( (lv_isFastChanging_24_0= 'isFastChanging' ) )? ( (lv_isBusinessKey_25_0= 'BusinessKey' ) )? otherlv_26= ']'
            {
            // InternalETLDsl.g:898:3: ()
            // InternalETLDsl.g:899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalETLDsl.g:909:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalETLDsl.g:910:4: (lv_name_2_0= RULE_ID )
            {
            // InternalETLDsl.g:910:4: (lv_name_2_0= RULE_ID )
            // InternalETLDsl.g:911:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalETLDsl.g:931:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleft ) ) )
            // InternalETLDsl.g:932:4: otherlv_4= 'type' ( (lv_type_5_0= ruleft ) )
            {
            otherlv_4=(Token)match(input,34,FOLLOW_35); 

            				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
            			
            // InternalETLDsl.g:936:4: ( (lv_type_5_0= ruleft ) )
            // InternalETLDsl.g:937:5: (lv_type_5_0= ruleft )
            {
            // InternalETLDsl.g:937:5: (lv_type_5_0= ruleft )
            // InternalETLDsl.g:938:6: lv_type_5_0= ruleft
            {

            						newCompositeNode(grammarAccess.getFieldAccess().getTypeFtEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_36);
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

            // InternalETLDsl.g:956:3: (otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalETLDsl.g:957:4: otherlv_6= 'length' ( (lv_length_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getLengthKeyword_5_0());
                    			
                    // InternalETLDsl.g:961:4: ( (lv_length_7_0= ruleEInt ) )
                    // InternalETLDsl.g:962:5: (lv_length_7_0= ruleEInt )
                    {
                    // InternalETLDsl.g:962:5: (lv_length_7_0= ruleEInt )
                    // InternalETLDsl.g:963:6: lv_length_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getLengthEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalETLDsl.g:981:3: (otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalETLDsl.g:982:4: otherlv_8= 'precision' ( (lv_precision_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getPrecisionKeyword_6_0());
                    			
                    // InternalETLDsl.g:986:4: ( (lv_precision_9_0= ruleEInt ) )
                    // InternalETLDsl.g:987:5: (lv_precision_9_0= ruleEInt )
                    {
                    // InternalETLDsl.g:987:5: (lv_precision_9_0= ruleEInt )
                    // InternalETLDsl.g:988:6: lv_precision_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getPrecisionEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalETLDsl.g:1006:3: (otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalETLDsl.g:1007:4: otherlv_10= 'scale' ( (lv_scale_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldAccess().getScaleKeyword_7_0());
                    			
                    // InternalETLDsl.g:1011:4: ( (lv_scale_11_0= ruleEInt ) )
                    // InternalETLDsl.g:1012:5: (lv_scale_11_0= ruleEInt )
                    {
                    // InternalETLDsl.g:1012:5: (lv_scale_11_0= ruleEInt )
                    // InternalETLDsl.g:1013:6: lv_scale_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getScaleEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalETLDsl.g:1031:3: (otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalETLDsl.g:1032:4: otherlv_12= 'original_name' ( (lv_original_name_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getFieldAccess().getOriginal_nameKeyword_8_0());
                    			
                    // InternalETLDsl.g:1036:4: ( (lv_original_name_13_0= ruleEString ) )
                    // InternalETLDsl.g:1037:5: (lv_original_name_13_0= ruleEString )
                    {
                    // InternalETLDsl.g:1037:5: (lv_original_name_13_0= ruleEString )
                    // InternalETLDsl.g:1038:6: lv_original_name_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getOriginal_nameEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

            // InternalETLDsl.g:1056:3: (otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalETLDsl.g:1057:4: otherlv_14= 'short_describtion' ( (lv_short_describtion_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getFieldAccess().getShort_describtionKeyword_9_0());
                    			
                    // InternalETLDsl.g:1061:4: ( (lv_short_describtion_15_0= ruleEString ) )
                    // InternalETLDsl.g:1062:5: (lv_short_describtion_15_0= ruleEString )
                    {
                    // InternalETLDsl.g:1062:5: (lv_short_describtion_15_0= ruleEString )
                    // InternalETLDsl.g:1063:6: lv_short_describtion_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getShort_describtionEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalETLDsl.g:1081:3: (otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalETLDsl.g:1082:4: otherlv_16= 'dateFormat' ( (lv_dateFormat_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getFieldAccess().getDateFormatKeyword_10_0());
                    			
                    // InternalETLDsl.g:1086:4: ( (lv_dateFormat_17_0= ruleEString ) )
                    // InternalETLDsl.g:1087:5: (lv_dateFormat_17_0= ruleEString )
                    {
                    // InternalETLDsl.g:1087:5: (lv_dateFormat_17_0= ruleEString )
                    // InternalETLDsl.g:1088:6: lv_dateFormat_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getDateFormatEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

            // InternalETLDsl.g:1106:3: (otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalETLDsl.g:1107:4: otherlv_18= 'NullIndicator' ( (lv_NullIndicator_19_0= ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getFieldAccess().getNullIndicatorKeyword_11_0());
                    			
                    // InternalETLDsl.g:1111:4: ( (lv_NullIndicator_19_0= ruleEString ) )
                    // InternalETLDsl.g:1112:5: (lv_NullIndicator_19_0= ruleEString )
                    {
                    // InternalETLDsl.g:1112:5: (lv_NullIndicator_19_0= ruleEString )
                    // InternalETLDsl.g:1113:6: lv_NullIndicator_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getNullIndicatorEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalETLDsl.g:1131:3: ( (lv_allowExponent_20_0= 'allowExponent' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalETLDsl.g:1132:4: (lv_allowExponent_20_0= 'allowExponent' )
                    {
                    // InternalETLDsl.g:1132:4: (lv_allowExponent_20_0= 'allowExponent' )
                    // InternalETLDsl.g:1133:5: lv_allowExponent_20_0= 'allowExponent'
                    {
                    lv_allowExponent_20_0=(Token)match(input,42,FOLLOW_45); 

                    					newLeafNode(lv_allowExponent_20_0, grammarAccess.getFieldAccess().getAllowExponentAllowExponentKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "allowExponent", lv_allowExponent_20_0 != null, "allowExponent");
                    				

                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1145:3: ( (lv_hasImplicitComma_21_0= 'hasImplicitComma' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalETLDsl.g:1146:4: (lv_hasImplicitComma_21_0= 'hasImplicitComma' )
                    {
                    // InternalETLDsl.g:1146:4: (lv_hasImplicitComma_21_0= 'hasImplicitComma' )
                    // InternalETLDsl.g:1147:5: lv_hasImplicitComma_21_0= 'hasImplicitComma'
                    {
                    lv_hasImplicitComma_21_0=(Token)match(input,43,FOLLOW_46); 

                    					newLeafNode(lv_hasImplicitComma_21_0, grammarAccess.getFieldAccess().getHasImplicitCommaHasImplicitCommaKeyword_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "hasImplicitComma", lv_hasImplicitComma_21_0 != null, "hasImplicitComma");
                    				

                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1159:3: ( (lv_interfaceOnly_22_0= 'interfaceOnly' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalETLDsl.g:1160:4: (lv_interfaceOnly_22_0= 'interfaceOnly' )
                    {
                    // InternalETLDsl.g:1160:4: (lv_interfaceOnly_22_0= 'interfaceOnly' )
                    // InternalETLDsl.g:1161:5: lv_interfaceOnly_22_0= 'interfaceOnly'
                    {
                    lv_interfaceOnly_22_0=(Token)match(input,44,FOLLOW_47); 

                    					newLeafNode(lv_interfaceOnly_22_0, grammarAccess.getFieldAccess().getInterfaceOnlyInterfaceOnlyKeyword_14_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "interfaceOnly", lv_interfaceOnly_22_0 != null, "interfaceOnly");
                    				

                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1173:3: ( (lv_tableOnly_23_0= 'tableOnly' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalETLDsl.g:1174:4: (lv_tableOnly_23_0= 'tableOnly' )
                    {
                    // InternalETLDsl.g:1174:4: (lv_tableOnly_23_0= 'tableOnly' )
                    // InternalETLDsl.g:1175:5: lv_tableOnly_23_0= 'tableOnly'
                    {
                    lv_tableOnly_23_0=(Token)match(input,45,FOLLOW_48); 

                    					newLeafNode(lv_tableOnly_23_0, grammarAccess.getFieldAccess().getTableOnlyTableOnlyKeyword_15_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "tableOnly", lv_tableOnly_23_0 != null, "tableOnly");
                    				

                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1187:3: ( (lv_isFastChanging_24_0= 'isFastChanging' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalETLDsl.g:1188:4: (lv_isFastChanging_24_0= 'isFastChanging' )
                    {
                    // InternalETLDsl.g:1188:4: (lv_isFastChanging_24_0= 'isFastChanging' )
                    // InternalETLDsl.g:1189:5: lv_isFastChanging_24_0= 'isFastChanging'
                    {
                    lv_isFastChanging_24_0=(Token)match(input,46,FOLLOW_49); 

                    					newLeafNode(lv_isFastChanging_24_0, grammarAccess.getFieldAccess().getIsFastChangingIsFastChangingKeyword_16_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "isFastChanging", lv_isFastChanging_24_0 != null, "isFastChanging");
                    				

                    }


                    }
                    break;

            }

            // InternalETLDsl.g:1201:3: ( (lv_isBusinessKey_25_0= 'BusinessKey' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalETLDsl.g:1202:4: (lv_isBusinessKey_25_0= 'BusinessKey' )
                    {
                    // InternalETLDsl.g:1202:4: (lv_isBusinessKey_25_0= 'BusinessKey' )
                    // InternalETLDsl.g:1203:5: lv_isBusinessKey_25_0= 'BusinessKey'
                    {
                    lv_isBusinessKey_25_0=(Token)match(input,47,FOLLOW_50); 

                    					newLeafNode(lv_isBusinessKey_25_0, grammarAccess.getFieldAccess().getIsBusinessKeyBusinessKeyKeyword_17_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "isBusinessKey", lv_isBusinessKey_25_0 != null, "BusinessKey");
                    				

                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getFieldAccess().getRightSquareBracketKeyword_18());
            		

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


    // $ANTLR start "entryRuleInclude"
    // InternalETLDsl.g:1223:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalETLDsl.g:1223:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalETLDsl.g:1224:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalETLDsl.g:1230:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_includeFields_5_0 = null;

        EObject lv_includeFields_7_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:1236:2: ( (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ) )
            // InternalETLDsl.g:1237:2: (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            {
            // InternalETLDsl.g:1237:2: (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalETLDsl.g:1238:3: otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalETLDsl.g:1242:3: ( (lv_name_1_0= ruleEString ) )
            // InternalETLDsl.g:1243:4: (lv_name_1_0= ruleEString )
            {
            // InternalETLDsl.g:1243:4: (lv_name_1_0= ruleEString )
            // InternalETLDsl.g:1244:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIncludeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIncludeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.etl_modeling.etldsl.ETLDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalETLDsl.g:1261:3: (otherlv_2= '{' (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalETLDsl.g:1262:4: otherlv_2= '{' (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )? (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_2=(Token)match(input,20,FOLLOW_51); 

            				newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_0());
            			
            // InternalETLDsl.g:1266:4: (otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalETLDsl.g:1267:5: otherlv_3= 'IncludeFields' otherlv_4= '{' ( (lv_includeFields_5_0= ruleField ) ) (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_17); 

                    					newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getIncludeFieldsKeyword_2_1_0());
                    				
                    otherlv_4=(Token)match(input,20,FOLLOW_19); 

                    					newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1_1());
                    				
                    // InternalETLDsl.g:1275:5: ( (lv_includeFields_5_0= ruleField ) )
                    // InternalETLDsl.g:1276:6: (lv_includeFields_5_0= ruleField )
                    {
                    // InternalETLDsl.g:1276:6: (lv_includeFields_5_0= ruleField )
                    // InternalETLDsl.g:1277:7: lv_includeFields_5_0= ruleField
                    {

                    							newCompositeNode(grammarAccess.getIncludeAccess().getIncludeFieldsFieldParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_includeFields_5_0=ruleField();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getIncludeRule());
                    							}
                    							add(
                    								current,
                    								"includeFields",
                    								lv_includeFields_5_0,
                    								"org.etl_modeling.etldsl.ETLDsl.Field");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalETLDsl.g:1294:5: (otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalETLDsl.g:1295:6: otherlv_6= ',' ( (lv_includeFields_7_0= ruleField ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getCommaKeyword_2_1_3_0());
                    	    					
                    	    // InternalETLDsl.g:1299:6: ( (lv_includeFields_7_0= ruleField ) )
                    	    // InternalETLDsl.g:1300:7: (lv_includeFields_7_0= ruleField )
                    	    {
                    	    // InternalETLDsl.g:1300:7: (lv_includeFields_7_0= ruleField )
                    	    // InternalETLDsl.g:1301:8: lv_includeFields_7_0= ruleField
                    	    {

                    	    								newCompositeNode(grammarAccess.getIncludeAccess().getIncludeFieldsFieldParserRuleCall_2_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_20);
                    	    lv_includeFields_7_0=ruleField();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getIncludeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"includeFields",
                    	    									lv_includeFields_7_0,
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

                    otherlv_8=(Token)match(input,22,FOLLOW_52); 

                    					newLeafNode(otherlv_8, grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_1_4());
                    				

                    }
                    break;

            }

            // InternalETLDsl.g:1324:4: (otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalETLDsl.g:1325:5: otherlv_9= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,51,FOLLOW_15); 

                    					newLeafNode(otherlv_9, grammarAccess.getIncludeAccess().getIdentifyingFieldsKeyword_2_2_0());
                    				
                    // InternalETLDsl.g:1329:5: ( ( ruleQualifiedName ) )
                    // InternalETLDsl.g:1330:6: ( ruleQualifiedName )
                    {
                    // InternalETLDsl.g:1330:6: ( ruleQualifiedName )
                    // InternalETLDsl.g:1331:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIncludeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getIncludeAccess().getIdentifyingfieldsFieldCrossReference_2_2_1_0());
                    						
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalETLDsl.g:1345:5: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==16) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalETLDsl.g:1346:6: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_15); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getIncludeAccess().getCommaKeyword_2_2_2_0());
                    	    					
                    	    // InternalETLDsl.g:1350:6: ( ( ruleQualifiedName ) )
                    	    // InternalETLDsl.g:1351:7: ( ruleQualifiedName )
                    	    {
                    	    // InternalETLDsl.g:1351:7: ( ruleQualifiedName )
                    	    // InternalETLDsl.g:1352:8: ruleQualifiedName
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getIncludeRule());
                    	    								}
                    	    							

                    	    								newCompositeNode(grammarAccess.getIncludeAccess().getIdentifyingfieldsFieldCrossReference_2_2_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FOLLOW_22); 

                    					newLeafNode(otherlv_13, grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_2_3());
                    				

                    }
                    break;

            }

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(otherlv_14, grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_3());
            			

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
    // InternalETLDsl.g:1381:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalETLDsl.g:1381:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalETLDsl.g:1382:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalETLDsl.g:1388:1: ruleRelationship returns [EObject current=null] : ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'ToEntity: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )? (otherlv_11= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalETLDsl.g:1394:2: ( ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'ToEntity: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )? (otherlv_11= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalETLDsl.g:1395:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'ToEntity: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )? (otherlv_11= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalETLDsl.g:1395:2: ( () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'ToEntity: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )? (otherlv_11= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalETLDsl.g:1396:3: () otherlv_1= 'Relationship' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'ToEntity: ' ( ( ruleQualifiedName ) ) (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )? (otherlv_11= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalETLDsl.g:1396:3: ()
            // InternalETLDsl.g:1397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationshipAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getRelationshipKeyword_1());
            		
            // InternalETLDsl.g:1407:3: ( (lv_name_2_0= ruleEString ) )
            // InternalETLDsl.g:1408:4: (lv_name_2_0= ruleEString )
            {
            // InternalETLDsl.g:1408:4: (lv_name_2_0= ruleEString )
            // InternalETLDsl.g:1409:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.etl_modeling.etldsl.ETLDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,53,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getToEntityKeyword_4());
            		
            // InternalETLDsl.g:1434:3: ( ( ruleQualifiedName ) )
            // InternalETLDsl.g:1435:4: ( ruleQualifiedName )
            {
            // InternalETLDsl.g:1435:4: ( ruleQualifiedName )
            // InternalETLDsl.g:1436:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationshipAccess().getToEntityEntityCrossReference_5_0());
            				
            pushFollow(FOLLOW_54);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalETLDsl.g:1450:3: (otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalETLDsl.g:1451:4: otherlv_6= 'DescribingFields:{' ( ( ruleQualifiedName ) ) (otherlv_8= ',' ( ( ruleQualifiedName ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getDescribingFieldsKeyword_6_0());
                    			
                    // InternalETLDsl.g:1455:4: ( ( ruleQualifiedName ) )
                    // InternalETLDsl.g:1456:5: ( ruleQualifiedName )
                    {
                    // InternalETLDsl.g:1456:5: ( ruleQualifiedName )
                    // InternalETLDsl.g:1457:6: ruleQualifiedName
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

                    // InternalETLDsl.g:1471:4: (otherlv_8= ',' ( ( ruleQualifiedName ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==16) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalETLDsl.g:1472:5: otherlv_8= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalETLDsl.g:1476:5: ( ( ruleQualifiedName ) )
                    	    // InternalETLDsl.g:1477:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalETLDsl.g:1477:6: ( ruleQualifiedName )
                    	    // InternalETLDsl.g:1478:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRelationshipRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getDescribingFieldsRelFieldCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_52); 

                    				newLeafNode(otherlv_10, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalETLDsl.g:1498:3: (otherlv_11= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalETLDsl.g:1499:4: otherlv_11= 'IdentifyingFields:{' ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationshipAccess().getIdentifyingFieldsKeyword_7_0());
                    			
                    // InternalETLDsl.g:1503:4: ( ( ruleQualifiedName ) )
                    // InternalETLDsl.g:1504:5: ( ruleQualifiedName )
                    {
                    // InternalETLDsl.g:1504:5: ( ruleQualifiedName )
                    // InternalETLDsl.g:1505:6: ruleQualifiedName
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

                    // InternalETLDsl.g:1519:4: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==16) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalETLDsl.g:1520:5: otherlv_13= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRelationshipAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalETLDsl.g:1524:5: ( ( ruleQualifiedName ) )
                    	    // InternalETLDsl.g:1525:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalETLDsl.g:1525:6: ( ruleQualifiedName )
                    	    // InternalETLDsl.g:1526:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRelationshipRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRelationshipAccess().getIdentifiyingFieldsRelFieldCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "ruleft"
    // InternalETLDsl.g:1554:1: ruleft returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) ) ;
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
            // InternalETLDsl.g:1560:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) ) )
            // InternalETLDsl.g:1561:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) )
            {
            // InternalETLDsl.g:1561:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Date' ) | (enumLiteral_2= 'Decimal' ) | (enumLiteral_3= 'HK' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'TimeStamp' ) | (enumLiteral_6= 'TrueFalse' ) )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt44=1;
                }
                break;
            case 56:
                {
                alt44=2;
                }
                break;
            case 57:
                {
                alt44=3;
                }
                break;
            case 58:
                {
                alt44=4;
                }
                break;
            case 59:
                {
                alt44=5;
                }
                break;
            case 60:
                {
                alt44=6;
                }
                break;
            case 61:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalETLDsl.g:1562:3: (enumLiteral_0= 'String' )
                    {
                    // InternalETLDsl.g:1562:3: (enumLiteral_0= 'String' )
                    // InternalETLDsl.g:1563:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFtAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1570:3: (enumLiteral_1= 'Date' )
                    {
                    // InternalETLDsl.g:1570:3: (enumLiteral_1= 'Date' )
                    // InternalETLDsl.g:1571:4: enumLiteral_1= 'Date'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getDateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFtAccess().getDateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1578:3: (enumLiteral_2= 'Decimal' )
                    {
                    // InternalETLDsl.g:1578:3: (enumLiteral_2= 'Decimal' )
                    // InternalETLDsl.g:1579:4: enumLiteral_2= 'Decimal'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getDecimalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFtAccess().getDecimalEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1586:3: (enumLiteral_3= 'HK' )
                    {
                    // InternalETLDsl.g:1586:3: (enumLiteral_3= 'HK' )
                    // InternalETLDsl.g:1587:4: enumLiteral_3= 'HK'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getHKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFtAccess().getHKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalETLDsl.g:1594:3: (enumLiteral_4= 'Int' )
                    {
                    // InternalETLDsl.g:1594:3: (enumLiteral_4= 'Int' )
                    // InternalETLDsl.g:1595:4: enumLiteral_4= 'Int'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getIntEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFtAccess().getIntEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalETLDsl.g:1602:3: (enumLiteral_5= 'TimeStamp' )
                    {
                    // InternalETLDsl.g:1602:3: (enumLiteral_5= 'TimeStamp' )
                    // InternalETLDsl.g:1603:4: enumLiteral_5= 'TimeStamp'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getFtAccess().getTimeStampEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFtAccess().getTimeStampEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalETLDsl.g:1610:3: (enumLiteral_6= 'TrueFalse' )
                    {
                    // InternalETLDsl.g:1610:3: (enumLiteral_6= 'TrueFalse' )
                    // InternalETLDsl.g:1611:4: enumLiteral_6= 'TrueFalse'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_2); 

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


    // $ANTLR start "ruleLAYERTYPE"
    // InternalETLDsl.g:1621:1: ruleLAYERTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) ) ;
    public final Enumerator ruleLAYERTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1627:2: ( ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) ) )
            // InternalETLDsl.g:1628:2: ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) )
            {
            // InternalETLDsl.g:1628:2: ( (enumLiteral_0= 'STAGE' ) | (enumLiteral_1= 'INTEGRATION' ) | (enumLiteral_2= 'EXPORT' ) | (enumLiteral_3= 'REPORTING' ) | (enumLiteral_4= 'HARMONISATION' ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt45=1;
                }
                break;
            case 63:
                {
                alt45=2;
                }
                break;
            case 64:
                {
                alt45=3;
                }
                break;
            case 65:
                {
                alt45=4;
                }
                break;
            case 66:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalETLDsl.g:1629:3: (enumLiteral_0= 'STAGE' )
                    {
                    // InternalETLDsl.g:1629:3: (enumLiteral_0= 'STAGE' )
                    // InternalETLDsl.g:1630:4: enumLiteral_0= 'STAGE'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getSTAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLAYERTYPEAccess().getSTAGEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1637:3: (enumLiteral_1= 'INTEGRATION' )
                    {
                    // InternalETLDsl.g:1637:3: (enumLiteral_1= 'INTEGRATION' )
                    // InternalETLDsl.g:1638:4: enumLiteral_1= 'INTEGRATION'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getINTEGRATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLAYERTYPEAccess().getINTEGRATIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1645:3: (enumLiteral_2= 'EXPORT' )
                    {
                    // InternalETLDsl.g:1645:3: (enumLiteral_2= 'EXPORT' )
                    // InternalETLDsl.g:1646:4: enumLiteral_2= 'EXPORT'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getEXPORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLAYERTYPEAccess().getEXPORTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1653:3: (enumLiteral_3= 'REPORTING' )
                    {
                    // InternalETLDsl.g:1653:3: (enumLiteral_3= 'REPORTING' )
                    // InternalETLDsl.g:1654:4: enumLiteral_3= 'REPORTING'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getLAYERTYPEAccess().getREPORTINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLAYERTYPEAccess().getREPORTINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalETLDsl.g:1661:3: (enumLiteral_4= 'HARMONISATION' )
                    {
                    // InternalETLDsl.g:1661:3: (enumLiteral_4= 'HARMONISATION' )
                    // InternalETLDsl.g:1662:4: enumLiteral_4= 'HARMONISATION'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

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
    // InternalETLDsl.g:1672:1: ruleHISTORISATIONTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) ) ;
    public final Enumerator ruleHISTORISATIONTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1678:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) ) )
            // InternalETLDsl.g:1679:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) )
            {
            // InternalETLDsl.g:1679:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'DAY_PARTITIONED' ) | (enumLiteral_2= 'MONTH_PARTITIONED' ) | (enumLiteral_3= 'BITEMPORAL' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt46=1;
                }
                break;
            case 68:
                {
                alt46=2;
                }
                break;
            case 69:
                {
                alt46=3;
                }
                break;
            case 70:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalETLDsl.g:1680:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalETLDsl.g:1680:3: (enumLiteral_0= 'NONE' )
                    // InternalETLDsl.g:1681:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getHISTORISATIONTYPEAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHISTORISATIONTYPEAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1688:3: (enumLiteral_1= 'DAY_PARTITIONED' )
                    {
                    // InternalETLDsl.g:1688:3: (enumLiteral_1= 'DAY_PARTITIONED' )
                    // InternalETLDsl.g:1689:4: enumLiteral_1= 'DAY_PARTITIONED'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getHISTORISATIONTYPEAccess().getDAY_PARTITIONEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHISTORISATIONTYPEAccess().getDAY_PARTITIONEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1696:3: (enumLiteral_2= 'MONTH_PARTITIONED' )
                    {
                    // InternalETLDsl.g:1696:3: (enumLiteral_2= 'MONTH_PARTITIONED' )
                    // InternalETLDsl.g:1697:4: enumLiteral_2= 'MONTH_PARTITIONED'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getHISTORISATIONTYPEAccess().getMONTH_PARTITIONEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHISTORISATIONTYPEAccess().getMONTH_PARTITIONEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1704:3: (enumLiteral_3= 'BITEMPORAL' )
                    {
                    // InternalETLDsl.g:1704:3: (enumLiteral_3= 'BITEMPORAL' )
                    // InternalETLDsl.g:1705:4: enumLiteral_3= 'BITEMPORAL'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

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
    // InternalETLDsl.g:1715:1: ruleREPRESENTATIONS returns [Enumerator current=null] : ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'DATAVAULT' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) ) ;
    public final Enumerator ruleREPRESENTATIONS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalETLDsl.g:1721:2: ( ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'DATAVAULT' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) ) )
            // InternalETLDsl.g:1722:2: ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'DATAVAULT' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) )
            {
            // InternalETLDsl.g:1722:2: ( (enumLiteral_0= 'FLAT_TABLE' ) | (enumLiteral_1= 'DATAVAULT' ) | (enumLiteral_2= 'ThirdNF' ) | (enumLiteral_3= 'SNOWFLAKE' ) | (enumLiteral_4= 'STAR' ) )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt47=1;
                }
                break;
            case 72:
                {
                alt47=2;
                }
                break;
            case 73:
                {
                alt47=3;
                }
                break;
            case 74:
                {
                alt47=4;
                }
                break;
            case 75:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalETLDsl.g:1723:3: (enumLiteral_0= 'FLAT_TABLE' )
                    {
                    // InternalETLDsl.g:1723:3: (enumLiteral_0= 'FLAT_TABLE' )
                    // InternalETLDsl.g:1724:4: enumLiteral_0= 'FLAT_TABLE'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getFLAT_TABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getREPRESENTATIONSAccess().getFLAT_TABLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalETLDsl.g:1731:3: (enumLiteral_1= 'DATAVAULT' )
                    {
                    // InternalETLDsl.g:1731:3: (enumLiteral_1= 'DATAVAULT' )
                    // InternalETLDsl.g:1732:4: enumLiteral_1= 'DATAVAULT'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getDATAVAULTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getREPRESENTATIONSAccess().getDATAVAULTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalETLDsl.g:1739:3: (enumLiteral_2= 'ThirdNF' )
                    {
                    // InternalETLDsl.g:1739:3: (enumLiteral_2= 'ThirdNF' )
                    // InternalETLDsl.g:1740:4: enumLiteral_2= 'ThirdNF'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getThirdNFEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getREPRESENTATIONSAccess().getThirdNFEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalETLDsl.g:1747:3: (enumLiteral_3= 'SNOWFLAKE' )
                    {
                    // InternalETLDsl.g:1747:3: (enumLiteral_3= 'SNOWFLAKE' )
                    // InternalETLDsl.g:1748:4: enumLiteral_3= 'SNOWFLAKE'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getREPRESENTATIONSAccess().getSNOWFLAKEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getREPRESENTATIONSAccess().getSNOWFLAKEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalETLDsl.g:1755:3: (enumLiteral_4= 'STAR' )
                    {
                    // InternalETLDsl.g:1755:3: (enumLiteral_4= 'STAR' )
                    // InternalETLDsl.g:1756:4: enumLiteral_4= 'STAR'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000108F002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000108E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000108C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001088002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000E0400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000C0400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x3F80000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001FFF800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001FFF000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001FFE000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001FFC000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001FF8000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001FE0000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000C000000400000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0048000000400000L});

}