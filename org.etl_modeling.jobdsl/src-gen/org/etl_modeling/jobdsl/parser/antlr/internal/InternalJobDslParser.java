package org.etl_modeling.jobdsl.parser.antlr.internal;

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
import org.etl_modeling.jobdsl.services.JobDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJobDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SchedulePackage'", "'ProcessingPoint'", "'{'", "'}'", "'################################## Jobs #################################'", "'Jobs'", "'.'", "'Job'", "'RunTime'", "'JobType'", "'TECH_SYSTEM'", "'ExecutableName'", "'DependentJobs'", "','", "'DependentProcessingPoint'", "'isTestJob'", "'ProcessingPointType'", "'EveryDay'", "'WorkingDay'", "'Weekly'", "'MonthlyUltimo'", "'Trigger'", "'Import'", "'Integration'", "'I2I'", "'Export'", "'ProcessigPoint'", "'Business'", "'Tech'", "'Test'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJobDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJobDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJobDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJobDsl.g"; }



     	private JobDslGrammarAccess grammarAccess;

        public InternalJobDslParser(TokenStream input, JobDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SchedulePackage";
       	}

       	@Override
       	protected JobDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSchedulePackage"
    // InternalJobDsl.g:65:1: entryRuleSchedulePackage returns [EObject current=null] : iv_ruleSchedulePackage= ruleSchedulePackage EOF ;
    public final EObject entryRuleSchedulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedulePackage = null;


        try {
            // InternalJobDsl.g:65:56: (iv_ruleSchedulePackage= ruleSchedulePackage EOF )
            // InternalJobDsl.g:66:2: iv_ruleSchedulePackage= ruleSchedulePackage EOF
            {
             newCompositeNode(grammarAccess.getSchedulePackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedulePackage=ruleSchedulePackage();

            state._fsp--;

             current =iv_ruleSchedulePackage; 
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
    // $ANTLR end "entryRuleSchedulePackage"


    // $ANTLR start "ruleSchedulePackage"
    // InternalJobDsl.g:72:1: ruleSchedulePackage returns [EObject current=null] : ( () otherlv_1= 'SchedulePackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'ProcessingPoint' otherlv_4= '{' ( (lv_processingpoint_5_0= ruleProcessingPoint ) ) otherlv_6= '}' otherlv_7= '################################## Jobs #################################' ) (otherlv_8= 'Jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleJob ) ) ( (lv_jobs_11_0= ruleJob ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleSchedulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_processingpoint_5_0 = null;

        EObject lv_jobs_10_0 = null;

        EObject lv_jobs_11_0 = null;



        	enterRule();

        try {
            // InternalJobDsl.g:78:2: ( ( () otherlv_1= 'SchedulePackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'ProcessingPoint' otherlv_4= '{' ( (lv_processingpoint_5_0= ruleProcessingPoint ) ) otherlv_6= '}' otherlv_7= '################################## Jobs #################################' ) (otherlv_8= 'Jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleJob ) ) ( (lv_jobs_11_0= ruleJob ) )* otherlv_12= '}' )? ) )
            // InternalJobDsl.g:79:2: ( () otherlv_1= 'SchedulePackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'ProcessingPoint' otherlv_4= '{' ( (lv_processingpoint_5_0= ruleProcessingPoint ) ) otherlv_6= '}' otherlv_7= '################################## Jobs #################################' ) (otherlv_8= 'Jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleJob ) ) ( (lv_jobs_11_0= ruleJob ) )* otherlv_12= '}' )? )
            {
            // InternalJobDsl.g:79:2: ( () otherlv_1= 'SchedulePackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'ProcessingPoint' otherlv_4= '{' ( (lv_processingpoint_5_0= ruleProcessingPoint ) ) otherlv_6= '}' otherlv_7= '################################## Jobs #################################' ) (otherlv_8= 'Jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleJob ) ) ( (lv_jobs_11_0= ruleJob ) )* otherlv_12= '}' )? )
            // InternalJobDsl.g:80:3: () otherlv_1= 'SchedulePackage' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'ProcessingPoint' otherlv_4= '{' ( (lv_processingpoint_5_0= ruleProcessingPoint ) ) otherlv_6= '}' otherlv_7= '################################## Jobs #################################' ) (otherlv_8= 'Jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleJob ) ) ( (lv_jobs_11_0= ruleJob ) )* otherlv_12= '}' )?
            {
            // InternalJobDsl.g:80:3: ()
            // InternalJobDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchedulePackageAccess().getSchedulePackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSchedulePackageAccess().getSchedulePackageKeyword_1());
            		
            // InternalJobDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJobDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalJobDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalJobDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSchedulePackageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.etl_modeling.jobdsl.JobDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJobDsl.g:110:3: (otherlv_3= 'ProcessingPoint' otherlv_4= '{' ( (lv_processingpoint_5_0= ruleProcessingPoint ) ) otherlv_6= '}' otherlv_7= '################################## Jobs #################################' )
            // InternalJobDsl.g:111:4: otherlv_3= 'ProcessingPoint' otherlv_4= '{' ( (lv_processingpoint_5_0= ruleProcessingPoint ) ) otherlv_6= '}' otherlv_7= '################################## Jobs #################################'
            {
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            				newLeafNode(otherlv_3, grammarAccess.getSchedulePackageAccess().getProcessingPointKeyword_3_0());
            			
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getSchedulePackageAccess().getLeftCurlyBracketKeyword_3_1());
            			
            // InternalJobDsl.g:119:4: ( (lv_processingpoint_5_0= ruleProcessingPoint ) )
            // InternalJobDsl.g:120:5: (lv_processingpoint_5_0= ruleProcessingPoint )
            {
            // InternalJobDsl.g:120:5: (lv_processingpoint_5_0= ruleProcessingPoint )
            // InternalJobDsl.g:121:6: lv_processingpoint_5_0= ruleProcessingPoint
            {

            						newCompositeNode(grammarAccess.getSchedulePackageAccess().getProcessingpointProcessingPointParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_6);
            lv_processingpoint_5_0=ruleProcessingPoint();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
            						}
            						set(
            							current,
            							"processingpoint",
            							lv_processingpoint_5_0,
            							"org.etl_modeling.jobdsl.JobDsl.ProcessingPoint");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            				newLeafNode(otherlv_6, grammarAccess.getSchedulePackageAccess().getRightCurlyBracketKeyword_3_3());
            			
            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_7, grammarAccess.getSchedulePackageAccess().getJobsKeyword_3_4());
            			

            }

            // InternalJobDsl.g:147:3: (otherlv_8= 'Jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleJob ) ) ( (lv_jobs_11_0= ruleJob ) )* otherlv_12= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJobDsl.g:148:4: otherlv_8= 'Jobs' otherlv_9= '{' ( (lv_jobs_10_0= ruleJob ) ) ( (lv_jobs_11_0= ruleJob ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getSchedulePackageAccess().getJobsKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getSchedulePackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalJobDsl.g:156:4: ( (lv_jobs_10_0= ruleJob ) )
                    // InternalJobDsl.g:157:5: (lv_jobs_10_0= ruleJob )
                    {
                    // InternalJobDsl.g:157:5: (lv_jobs_10_0= ruleJob )
                    // InternalJobDsl.g:158:6: lv_jobs_10_0= ruleJob
                    {

                    						newCompositeNode(grammarAccess.getSchedulePackageAccess().getJobsJobParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_jobs_10_0=ruleJob();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
                    						}
                    						add(
                    							current,
                    							"jobs",
                    							lv_jobs_10_0,
                    							"org.etl_modeling.jobdsl.JobDsl.Job");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJobDsl.g:175:4: ( (lv_jobs_11_0= ruleJob ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalJobDsl.g:176:5: (lv_jobs_11_0= ruleJob )
                    	    {
                    	    // InternalJobDsl.g:176:5: (lv_jobs_11_0= ruleJob )
                    	    // InternalJobDsl.g:177:6: lv_jobs_11_0= ruleJob
                    	    {

                    	    						newCompositeNode(grammarAccess.getSchedulePackageAccess().getJobsJobParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_jobs_11_0=ruleJob();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"jobs",
                    	    							lv_jobs_11_0,
                    	    							"org.etl_modeling.jobdsl.JobDsl.Job");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getSchedulePackageAccess().getRightCurlyBracketKeyword_4_4());
                    			

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
    // $ANTLR end "ruleSchedulePackage"


    // $ANTLR start "entryRuleEString"
    // InternalJobDsl.g:203:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJobDsl.g:203:47: (iv_ruleEString= ruleEString EOF )
            // InternalJobDsl.g:204:2: iv_ruleEString= ruleEString EOF
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
    // InternalJobDsl.g:210:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJobDsl.g:216:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJobDsl.g:217:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJobDsl.g:217:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJobDsl.g:218:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJobDsl.g:226:3: this_ID_1= RULE_ID
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
    // InternalJobDsl.g:237:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalJobDsl.g:237:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalJobDsl.g:238:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalJobDsl.g:244:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalJobDsl.g:250:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalJobDsl.g:251:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalJobDsl.g:251:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalJobDsl.g:252:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalJobDsl.g:259:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJobDsl.g:260:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleJob"
    // InternalJobDsl.g:277:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalJobDsl.g:277:44: (iv_ruleJob= ruleJob EOF )
            // InternalJobDsl.g:278:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
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
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalJobDsl.g:284:1: ruleJob returns [EObject current=null] : ( () otherlv_1= 'Job' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'RunTime' ( (lv_RunTime_5_0= ruleRunningTime ) ) ) (otherlv_6= 'JobType' ( (lv_JobType_7_0= ruleJobType ) ) ) (otherlv_8= 'TECH_SYSTEM' ( (lv_TECH_SYSTEM_9_0= ruleEString ) ) ) (otherlv_10= 'ExecutableName' ( (lv_ExecutableName_11_0= ruleEString ) ) ) (otherlv_12= 'DependentJobs' otherlv_13= '{' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= '}' )? (otherlv_18= 'DependentProcessingPoint' ( ( ruleQualifiedName ) ) )? ( (lv_isTestJob_20_0= 'isTestJob' ) )? otherlv_21= '}' ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_isTestJob_20_0=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_RunTime_5_0 = null;

        Enumerator lv_JobType_7_0 = null;

        AntlrDatatypeRuleToken lv_TECH_SYSTEM_9_0 = null;

        AntlrDatatypeRuleToken lv_ExecutableName_11_0 = null;



        	enterRule();

        try {
            // InternalJobDsl.g:290:2: ( ( () otherlv_1= 'Job' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'RunTime' ( (lv_RunTime_5_0= ruleRunningTime ) ) ) (otherlv_6= 'JobType' ( (lv_JobType_7_0= ruleJobType ) ) ) (otherlv_8= 'TECH_SYSTEM' ( (lv_TECH_SYSTEM_9_0= ruleEString ) ) ) (otherlv_10= 'ExecutableName' ( (lv_ExecutableName_11_0= ruleEString ) ) ) (otherlv_12= 'DependentJobs' otherlv_13= '{' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= '}' )? (otherlv_18= 'DependentProcessingPoint' ( ( ruleQualifiedName ) ) )? ( (lv_isTestJob_20_0= 'isTestJob' ) )? otherlv_21= '}' ) )
            // InternalJobDsl.g:291:2: ( () otherlv_1= 'Job' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'RunTime' ( (lv_RunTime_5_0= ruleRunningTime ) ) ) (otherlv_6= 'JobType' ( (lv_JobType_7_0= ruleJobType ) ) ) (otherlv_8= 'TECH_SYSTEM' ( (lv_TECH_SYSTEM_9_0= ruleEString ) ) ) (otherlv_10= 'ExecutableName' ( (lv_ExecutableName_11_0= ruleEString ) ) ) (otherlv_12= 'DependentJobs' otherlv_13= '{' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= '}' )? (otherlv_18= 'DependentProcessingPoint' ( ( ruleQualifiedName ) ) )? ( (lv_isTestJob_20_0= 'isTestJob' ) )? otherlv_21= '}' )
            {
            // InternalJobDsl.g:291:2: ( () otherlv_1= 'Job' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'RunTime' ( (lv_RunTime_5_0= ruleRunningTime ) ) ) (otherlv_6= 'JobType' ( (lv_JobType_7_0= ruleJobType ) ) ) (otherlv_8= 'TECH_SYSTEM' ( (lv_TECH_SYSTEM_9_0= ruleEString ) ) ) (otherlv_10= 'ExecutableName' ( (lv_ExecutableName_11_0= ruleEString ) ) ) (otherlv_12= 'DependentJobs' otherlv_13= '{' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= '}' )? (otherlv_18= 'DependentProcessingPoint' ( ( ruleQualifiedName ) ) )? ( (lv_isTestJob_20_0= 'isTestJob' ) )? otherlv_21= '}' )
            // InternalJobDsl.g:292:3: () otherlv_1= 'Job' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'RunTime' ( (lv_RunTime_5_0= ruleRunningTime ) ) ) (otherlv_6= 'JobType' ( (lv_JobType_7_0= ruleJobType ) ) ) (otherlv_8= 'TECH_SYSTEM' ( (lv_TECH_SYSTEM_9_0= ruleEString ) ) ) (otherlv_10= 'ExecutableName' ( (lv_ExecutableName_11_0= ruleEString ) ) ) (otherlv_12= 'DependentJobs' otherlv_13= '{' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= '}' )? (otherlv_18= 'DependentProcessingPoint' ( ( ruleQualifiedName ) ) )? ( (lv_isTestJob_20_0= 'isTestJob' ) )? otherlv_21= '}'
            {
            // InternalJobDsl.g:292:3: ()
            // InternalJobDsl.g:293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJobAccess().getJobAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getJobKeyword_1());
            		
            // InternalJobDsl.g:303:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJobDsl.g:304:4: (lv_name_2_0= ruleEString )
            {
            // InternalJobDsl.g:304:4: (lv_name_2_0= ruleEString )
            // InternalJobDsl.g:305:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.etl_modeling.jobdsl.JobDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJobDsl.g:326:3: (otherlv_4= 'RunTime' ( (lv_RunTime_5_0= ruleRunningTime ) ) )
            // InternalJobDsl.g:327:4: otherlv_4= 'RunTime' ( (lv_RunTime_5_0= ruleRunningTime ) )
            {
            otherlv_4=(Token)match(input,19,FOLLOW_14); 

            				newLeafNode(otherlv_4, grammarAccess.getJobAccess().getRunTimeKeyword_4_0());
            			
            // InternalJobDsl.g:331:4: ( (lv_RunTime_5_0= ruleRunningTime ) )
            // InternalJobDsl.g:332:5: (lv_RunTime_5_0= ruleRunningTime )
            {
            // InternalJobDsl.g:332:5: (lv_RunTime_5_0= ruleRunningTime )
            // InternalJobDsl.g:333:6: lv_RunTime_5_0= ruleRunningTime
            {

            						newCompositeNode(grammarAccess.getJobAccess().getRunTimeRunningTimeEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_15);
            lv_RunTime_5_0=ruleRunningTime();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJobRule());
            						}
            						set(
            							current,
            							"RunTime",
            							lv_RunTime_5_0,
            							"org.etl_modeling.jobdsl.JobDsl.RunningTime");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJobDsl.g:351:3: (otherlv_6= 'JobType' ( (lv_JobType_7_0= ruleJobType ) ) )
            // InternalJobDsl.g:352:4: otherlv_6= 'JobType' ( (lv_JobType_7_0= ruleJobType ) )
            {
            otherlv_6=(Token)match(input,20,FOLLOW_16); 

            				newLeafNode(otherlv_6, grammarAccess.getJobAccess().getJobTypeKeyword_5_0());
            			
            // InternalJobDsl.g:356:4: ( (lv_JobType_7_0= ruleJobType ) )
            // InternalJobDsl.g:357:5: (lv_JobType_7_0= ruleJobType )
            {
            // InternalJobDsl.g:357:5: (lv_JobType_7_0= ruleJobType )
            // InternalJobDsl.g:358:6: lv_JobType_7_0= ruleJobType
            {

            						newCompositeNode(grammarAccess.getJobAccess().getJobTypeJobTypeEnumRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_17);
            lv_JobType_7_0=ruleJobType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJobRule());
            						}
            						set(
            							current,
            							"JobType",
            							lv_JobType_7_0,
            							"org.etl_modeling.jobdsl.JobDsl.JobType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJobDsl.g:376:3: (otherlv_8= 'TECH_SYSTEM' ( (lv_TECH_SYSTEM_9_0= ruleEString ) ) )
            // InternalJobDsl.g:377:4: otherlv_8= 'TECH_SYSTEM' ( (lv_TECH_SYSTEM_9_0= ruleEString ) )
            {
            otherlv_8=(Token)match(input,21,FOLLOW_3); 

            				newLeafNode(otherlv_8, grammarAccess.getJobAccess().getTECH_SYSTEMKeyword_6_0());
            			
            // InternalJobDsl.g:381:4: ( (lv_TECH_SYSTEM_9_0= ruleEString ) )
            // InternalJobDsl.g:382:5: (lv_TECH_SYSTEM_9_0= ruleEString )
            {
            // InternalJobDsl.g:382:5: (lv_TECH_SYSTEM_9_0= ruleEString )
            // InternalJobDsl.g:383:6: lv_TECH_SYSTEM_9_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getJobAccess().getTECH_SYSTEMEStringParserRuleCall_6_1_0());
            					
            pushFollow(FOLLOW_18);
            lv_TECH_SYSTEM_9_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJobRule());
            						}
            						set(
            							current,
            							"TECH_SYSTEM",
            							lv_TECH_SYSTEM_9_0,
            							"org.etl_modeling.jobdsl.JobDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJobDsl.g:401:3: (otherlv_10= 'ExecutableName' ( (lv_ExecutableName_11_0= ruleEString ) ) )
            // InternalJobDsl.g:402:4: otherlv_10= 'ExecutableName' ( (lv_ExecutableName_11_0= ruleEString ) )
            {
            otherlv_10=(Token)match(input,22,FOLLOW_3); 

            				newLeafNode(otherlv_10, grammarAccess.getJobAccess().getExecutableNameKeyword_7_0());
            			
            // InternalJobDsl.g:406:4: ( (lv_ExecutableName_11_0= ruleEString ) )
            // InternalJobDsl.g:407:5: (lv_ExecutableName_11_0= ruleEString )
            {
            // InternalJobDsl.g:407:5: (lv_ExecutableName_11_0= ruleEString )
            // InternalJobDsl.g:408:6: lv_ExecutableName_11_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getJobAccess().getExecutableNameEStringParserRuleCall_7_1_0());
            					
            pushFollow(FOLLOW_19);
            lv_ExecutableName_11_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getJobRule());
            						}
            						set(
            							current,
            							"ExecutableName",
            							lv_ExecutableName_11_0,
            							"org.etl_modeling.jobdsl.JobDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJobDsl.g:426:3: (otherlv_12= 'DependentJobs' otherlv_13= '{' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJobDsl.g:427:4: otherlv_12= 'DependentJobs' otherlv_13= '{' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getJobAccess().getDependentJobsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalJobDsl.g:435:4: ( ( ruleQualifiedName ) )
                    // InternalJobDsl.g:436:5: ( ruleQualifiedName )
                    {
                    // InternalJobDsl.g:436:5: ( ruleQualifiedName )
                    // InternalJobDsl.g:437:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getPreDecessorJobCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJobDsl.g:451:4: (otherlv_15= ',' ( ( ruleQualifiedName ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJobDsl.g:452:5: otherlv_15= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_15=(Token)match(input,24,FOLLOW_12); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getJobAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalJobDsl.g:456:5: ( ( ruleQualifiedName ) )
                    	    // InternalJobDsl.g:457:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalJobDsl.g:457:6: ( ruleQualifiedName )
                    	    // InternalJobDsl.g:458:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJobRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJobAccess().getPreDecessorJobCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalJobDsl.g:478:3: (otherlv_18= 'DependentProcessingPoint' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJobDsl.g:479:4: otherlv_18= 'DependentProcessingPoint' ( ( ruleQualifiedName ) )
                    {
                    otherlv_18=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getJobAccess().getDependentProcessingPointKeyword_9_0());
                    			
                    // InternalJobDsl.g:483:4: ( ( ruleQualifiedName ) )
                    // InternalJobDsl.g:484:5: ( ruleQualifiedName )
                    {
                    // InternalJobDsl.g:484:5: ( ruleQualifiedName )
                    // InternalJobDsl.g:485:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getPpPreDecessorprocessingpointProcessingPointCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJobDsl.g:500:3: ( (lv_isTestJob_20_0= 'isTestJob' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJobDsl.g:501:4: (lv_isTestJob_20_0= 'isTestJob' )
                    {
                    // InternalJobDsl.g:501:4: (lv_isTestJob_20_0= 'isTestJob' )
                    // InternalJobDsl.g:502:5: lv_isTestJob_20_0= 'isTestJob'
                    {
                    lv_isTestJob_20_0=(Token)match(input,26,FOLLOW_6); 

                    					newLeafNode(lv_isTestJob_20_0, grammarAccess.getJobAccess().getIsTestJobIsTestJobKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJobRule());
                    					}
                    					setWithLastConsumed(current, "isTestJob", lv_isTestJob_20_0 != null, "isTestJob");
                    				

                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleProcessingPoint"
    // InternalJobDsl.g:522:1: entryRuleProcessingPoint returns [EObject current=null] : iv_ruleProcessingPoint= ruleProcessingPoint EOF ;
    public final EObject entryRuleProcessingPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingPoint = null;


        try {
            // InternalJobDsl.g:522:56: (iv_ruleProcessingPoint= ruleProcessingPoint EOF )
            // InternalJobDsl.g:523:2: iv_ruleProcessingPoint= ruleProcessingPoint EOF
            {
             newCompositeNode(grammarAccess.getProcessingPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessingPoint=ruleProcessingPoint();

            state._fsp--;

             current =iv_ruleProcessingPoint; 
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
    // $ANTLR end "entryRuleProcessingPoint"


    // $ANTLR start "ruleProcessingPoint"
    // InternalJobDsl.g:529:1: ruleProcessingPoint returns [EObject current=null] : ( () otherlv_1= 'ProcessingPoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ProcessingPointType' ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) ) ) (otherlv_6= 'DependentJobs' otherlv_7= '{' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleProcessingPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_ProcessingPointType_5_0 = null;



        	enterRule();

        try {
            // InternalJobDsl.g:535:2: ( ( () otherlv_1= 'ProcessingPoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ProcessingPointType' ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) ) ) (otherlv_6= 'DependentJobs' otherlv_7= '{' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalJobDsl.g:536:2: ( () otherlv_1= 'ProcessingPoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ProcessingPointType' ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) ) ) (otherlv_6= 'DependentJobs' otherlv_7= '{' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalJobDsl.g:536:2: ( () otherlv_1= 'ProcessingPoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ProcessingPointType' ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) ) ) (otherlv_6= 'DependentJobs' otherlv_7= '{' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalJobDsl.g:537:3: () otherlv_1= 'ProcessingPoint' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ProcessingPointType' ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) ) ) (otherlv_6= 'DependentJobs' otherlv_7= '{' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalJobDsl.g:537:3: ()
            // InternalJobDsl.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessingPointAccess().getProcessingPointAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessingPointAccess().getProcessingPointKeyword_1());
            		
            // InternalJobDsl.g:548:3: ( (lv_name_2_0= ruleEString ) )
            // InternalJobDsl.g:549:4: (lv_name_2_0= ruleEString )
            {
            // InternalJobDsl.g:549:4: (lv_name_2_0= ruleEString )
            // InternalJobDsl.g:550:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessingPointAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessingPointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.etl_modeling.jobdsl.JobDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessingPointAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJobDsl.g:571:3: (otherlv_4= 'ProcessingPointType' ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) ) )
            // InternalJobDsl.g:572:4: otherlv_4= 'ProcessingPointType' ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) )
            {
            otherlv_4=(Token)match(input,27,FOLLOW_24); 

            				newLeafNode(otherlv_4, grammarAccess.getProcessingPointAccess().getProcessingPointTypeKeyword_4_0());
            			
            // InternalJobDsl.g:576:4: ( (lv_ProcessingPointType_5_0= ruleProcessingPointType ) )
            // InternalJobDsl.g:577:5: (lv_ProcessingPointType_5_0= ruleProcessingPointType )
            {
            // InternalJobDsl.g:577:5: (lv_ProcessingPointType_5_0= ruleProcessingPointType )
            // InternalJobDsl.g:578:6: lv_ProcessingPointType_5_0= ruleProcessingPointType
            {

            						newCompositeNode(grammarAccess.getProcessingPointAccess().getProcessingPointTypeProcessingPointTypeEnumRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_25);
            lv_ProcessingPointType_5_0=ruleProcessingPointType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getProcessingPointRule());
            						}
            						set(
            							current,
            							"ProcessingPointType",
            							lv_ProcessingPointType_5_0,
            							"org.etl_modeling.jobdsl.JobDsl.ProcessingPointType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalJobDsl.g:596:3: (otherlv_6= 'DependentJobs' otherlv_7= '{' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* otherlv_11= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJobDsl.g:597:4: otherlv_6= 'DependentJobs' otherlv_7= '{' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcessingPointAccess().getDependentJobsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcessingPointAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalJobDsl.g:605:4: ( ( ruleQualifiedName ) )
                    // InternalJobDsl.g:606:5: ( ruleQualifiedName )
                    {
                    // InternalJobDsl.g:606:5: ( ruleQualifiedName )
                    // InternalJobDsl.g:607:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessingPointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProcessingPointAccess().getPreDecessorJobCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJobDsl.g:621:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalJobDsl.g:622:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,24,FOLLOW_12); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getProcessingPointAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalJobDsl.g:626:5: ( ( ruleQualifiedName ) )
                    	    // InternalJobDsl.g:627:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalJobDsl.g:627:6: ( ruleQualifiedName )
                    	    // InternalJobDsl.g:628:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProcessingPointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProcessingPointAccess().getPreDecessorJobCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getProcessingPointAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getProcessingPointAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProcessingPoint"


    // $ANTLR start "ruleRunningTime"
    // InternalJobDsl.g:656:1: ruleRunningTime returns [Enumerator current=null] : ( (enumLiteral_0= 'EveryDay' ) | (enumLiteral_1= 'WorkingDay' ) | (enumLiteral_2= 'Weekly' ) | (enumLiteral_3= 'MonthlyUltimo' ) ) ;
    public final Enumerator ruleRunningTime() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJobDsl.g:662:2: ( ( (enumLiteral_0= 'EveryDay' ) | (enumLiteral_1= 'WorkingDay' ) | (enumLiteral_2= 'Weekly' ) | (enumLiteral_3= 'MonthlyUltimo' ) ) )
            // InternalJobDsl.g:663:2: ( (enumLiteral_0= 'EveryDay' ) | (enumLiteral_1= 'WorkingDay' ) | (enumLiteral_2= 'Weekly' ) | (enumLiteral_3= 'MonthlyUltimo' ) )
            {
            // InternalJobDsl.g:663:2: ( (enumLiteral_0= 'EveryDay' ) | (enumLiteral_1= 'WorkingDay' ) | (enumLiteral_2= 'Weekly' ) | (enumLiteral_3= 'MonthlyUltimo' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 31:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalJobDsl.g:664:3: (enumLiteral_0= 'EveryDay' )
                    {
                    // InternalJobDsl.g:664:3: (enumLiteral_0= 'EveryDay' )
                    // InternalJobDsl.g:665:4: enumLiteral_0= 'EveryDay'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getRunningTimeAccess().getEveryDayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRunningTimeAccess().getEveryDayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJobDsl.g:672:3: (enumLiteral_1= 'WorkingDay' )
                    {
                    // InternalJobDsl.g:672:3: (enumLiteral_1= 'WorkingDay' )
                    // InternalJobDsl.g:673:4: enumLiteral_1= 'WorkingDay'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getRunningTimeAccess().getWorkingDayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRunningTimeAccess().getWorkingDayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJobDsl.g:680:3: (enumLiteral_2= 'Weekly' )
                    {
                    // InternalJobDsl.g:680:3: (enumLiteral_2= 'Weekly' )
                    // InternalJobDsl.g:681:4: enumLiteral_2= 'Weekly'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getRunningTimeAccess().getWeeklyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRunningTimeAccess().getWeeklyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJobDsl.g:688:3: (enumLiteral_3= 'MonthlyUltimo' )
                    {
                    // InternalJobDsl.g:688:3: (enumLiteral_3= 'MonthlyUltimo' )
                    // InternalJobDsl.g:689:4: enumLiteral_3= 'MonthlyUltimo'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getRunningTimeAccess().getMonthlyUltimoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRunningTimeAccess().getMonthlyUltimoEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleRunningTime"


    // $ANTLR start "ruleJobType"
    // InternalJobDsl.g:699:1: ruleJobType returns [Enumerator current=null] : ( (enumLiteral_0= 'Trigger' ) | (enumLiteral_1= 'Import' ) | (enumLiteral_2= 'Integration' ) | (enumLiteral_3= 'I2I' ) | (enumLiteral_4= 'Export' ) | (enumLiteral_5= 'ProcessigPoint' ) ) ;
    public final Enumerator ruleJobType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalJobDsl.g:705:2: ( ( (enumLiteral_0= 'Trigger' ) | (enumLiteral_1= 'Import' ) | (enumLiteral_2= 'Integration' ) | (enumLiteral_3= 'I2I' ) | (enumLiteral_4= 'Export' ) | (enumLiteral_5= 'ProcessigPoint' ) ) )
            // InternalJobDsl.g:706:2: ( (enumLiteral_0= 'Trigger' ) | (enumLiteral_1= 'Import' ) | (enumLiteral_2= 'Integration' ) | (enumLiteral_3= 'I2I' ) | (enumLiteral_4= 'Export' ) | (enumLiteral_5= 'ProcessigPoint' ) )
            {
            // InternalJobDsl.g:706:2: ( (enumLiteral_0= 'Trigger' ) | (enumLiteral_1= 'Import' ) | (enumLiteral_2= 'Integration' ) | (enumLiteral_3= 'I2I' ) | (enumLiteral_4= 'Export' ) | (enumLiteral_5= 'ProcessigPoint' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            case 36:
                {
                alt12=5;
                }
                break;
            case 37:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalJobDsl.g:707:3: (enumLiteral_0= 'Trigger' )
                    {
                    // InternalJobDsl.g:707:3: (enumLiteral_0= 'Trigger' )
                    // InternalJobDsl.g:708:4: enumLiteral_0= 'Trigger'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getJobTypeAccess().getTriggerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJobTypeAccess().getTriggerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJobDsl.g:715:3: (enumLiteral_1= 'Import' )
                    {
                    // InternalJobDsl.g:715:3: (enumLiteral_1= 'Import' )
                    // InternalJobDsl.g:716:4: enumLiteral_1= 'Import'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getJobTypeAccess().getImportEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJobTypeAccess().getImportEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJobDsl.g:723:3: (enumLiteral_2= 'Integration' )
                    {
                    // InternalJobDsl.g:723:3: (enumLiteral_2= 'Integration' )
                    // InternalJobDsl.g:724:4: enumLiteral_2= 'Integration'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getJobTypeAccess().getIntegrationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJobTypeAccess().getIntegrationEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJobDsl.g:731:3: (enumLiteral_3= 'I2I' )
                    {
                    // InternalJobDsl.g:731:3: (enumLiteral_3= 'I2I' )
                    // InternalJobDsl.g:732:4: enumLiteral_3= 'I2I'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getJobTypeAccess().getI2IEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJobTypeAccess().getI2IEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJobDsl.g:739:3: (enumLiteral_4= 'Export' )
                    {
                    // InternalJobDsl.g:739:3: (enumLiteral_4= 'Export' )
                    // InternalJobDsl.g:740:4: enumLiteral_4= 'Export'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getJobTypeAccess().getExportEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getJobTypeAccess().getExportEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJobDsl.g:747:3: (enumLiteral_5= 'ProcessigPoint' )
                    {
                    // InternalJobDsl.g:747:3: (enumLiteral_5= 'ProcessigPoint' )
                    // InternalJobDsl.g:748:4: enumLiteral_5= 'ProcessigPoint'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getJobTypeAccess().getProcessigPointEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getJobTypeAccess().getProcessigPointEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleJobType"


    // $ANTLR start "ruleProcessingPointType"
    // InternalJobDsl.g:758:1: ruleProcessingPointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Business' ) | (enumLiteral_1= 'Tech' ) | (enumLiteral_2= 'Test' ) ) ;
    public final Enumerator ruleProcessingPointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJobDsl.g:764:2: ( ( (enumLiteral_0= 'Business' ) | (enumLiteral_1= 'Tech' ) | (enumLiteral_2= 'Test' ) ) )
            // InternalJobDsl.g:765:2: ( (enumLiteral_0= 'Business' ) | (enumLiteral_1= 'Tech' ) | (enumLiteral_2= 'Test' ) )
            {
            // InternalJobDsl.g:765:2: ( (enumLiteral_0= 'Business' ) | (enumLiteral_1= 'Tech' ) | (enumLiteral_2= 'Test' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt13=1;
                }
                break;
            case 39:
                {
                alt13=2;
                }
                break;
            case 40:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalJobDsl.g:766:3: (enumLiteral_0= 'Business' )
                    {
                    // InternalJobDsl.g:766:3: (enumLiteral_0= 'Business' )
                    // InternalJobDsl.g:767:4: enumLiteral_0= 'Business'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getProcessingPointTypeAccess().getBusinessEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessingPointTypeAccess().getBusinessEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJobDsl.g:774:3: (enumLiteral_1= 'Tech' )
                    {
                    // InternalJobDsl.g:774:3: (enumLiteral_1= 'Tech' )
                    // InternalJobDsl.g:775:4: enumLiteral_1= 'Tech'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getProcessingPointTypeAccess().getTechEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessingPointTypeAccess().getTechEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJobDsl.g:782:3: (enumLiteral_2= 'Test' )
                    {
                    // InternalJobDsl.g:782:3: (enumLiteral_2= 'Test' )
                    // InternalJobDsl.g:783:4: enumLiteral_2= 'Test'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getProcessingPointTypeAccess().getTestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProcessingPointTypeAccess().getTestEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleProcessingPointType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003F00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006804000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000804000L});

}