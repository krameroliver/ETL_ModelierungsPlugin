/*
 * generated by Xtext 2.22.0
 */
grammar InternalJobDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.etl_modeling.jobdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSchedulePackage
entryRuleSchedulePackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSchedulePackageRule()); }
	iv_ruleSchedulePackage=ruleSchedulePackage
	{ $current=$iv_ruleSchedulePackage.current; }
	EOF;

// Rule SchedulePackage
ruleSchedulePackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSchedulePackageAccess().getSchedulePackageAction_0(),
					$current);
			}
		)
		otherlv_1='SchedulePackage'
		{
			newLeafNode(otherlv_1, grammarAccess.getSchedulePackageAccess().getSchedulePackageKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSchedulePackageAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.etl_modeling.jobdsl.JobDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='ProcessingPoint'
			{
				newLeafNode(otherlv_3, grammarAccess.getSchedulePackageAccess().getProcessingPointKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getSchedulePackageAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSchedulePackageAccess().getProcessingpointProcessingPointParserRuleCall_3_2_0());
					}
					lv_processingpoint_5_0=ruleProcessingPoint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
						}
						set(
							$current,
							"processingpoint",
							lv_processingpoint_5_0,
							"org.etl_modeling.jobdsl.JobDsl.ProcessingPoint");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6='}'
			{
				newLeafNode(otherlv_6, grammarAccess.getSchedulePackageAccess().getRightCurlyBracketKeyword_3_3());
			}
			otherlv_7='################################## Jobs #################################'
			{
				newLeafNode(otherlv_7, grammarAccess.getSchedulePackageAccess().getJobsKeyword_3_4());
			}
		)
		(
			otherlv_8='Jobs'
			{
				newLeafNode(otherlv_8, grammarAccess.getSchedulePackageAccess().getJobsKeyword_4_0());
			}
			otherlv_9='{'
			{
				newLeafNode(otherlv_9, grammarAccess.getSchedulePackageAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSchedulePackageAccess().getJobsJobParserRuleCall_4_2_0());
					}
					lv_jobs_10_0=ruleJob
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
						}
						add(
							$current,
							"jobs",
							lv_jobs_10_0,
							"org.etl_modeling.jobdsl.JobDsl.Job");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSchedulePackageAccess().getJobsJobParserRuleCall_4_3_0());
					}
					lv_jobs_11_0=ruleJob
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSchedulePackageRule());
						}
						add(
							$current,
							"jobs",
							lv_jobs_11_0,
							"org.etl_modeling.jobdsl.JobDsl.Job");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_12='}'
			{
				newLeafNode(otherlv_12, grammarAccess.getSchedulePackageAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleJob
entryRuleJob returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJobRule()); }
	iv_ruleJob=ruleJob
	{ $current=$iv_ruleJob.current; }
	EOF;

// Rule Job
ruleJob returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJobAccess().getJobAction_0(),
					$current);
			}
		)
		otherlv_1='Job'
		{
			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getJobKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJobRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.etl_modeling.jobdsl.JobDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='RunTime'
			{
				newLeafNode(otherlv_4, grammarAccess.getJobAccess().getRunTimeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJobAccess().getRunTimeRunningTimeEnumRuleCall_4_1_0());
					}
					lv_RunTime_5_0=ruleRunningTime
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJobRule());
						}
						set(
							$current,
							"RunTime",
							lv_RunTime_5_0,
							"org.etl_modeling.jobdsl.JobDsl.RunningTime");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_6='JobType'
			{
				newLeafNode(otherlv_6, grammarAccess.getJobAccess().getJobTypeKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJobAccess().getJobTypeJobTypeEnumRuleCall_5_1_0());
					}
					lv_JobType_7_0=ruleJobType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJobRule());
						}
						set(
							$current,
							"JobType",
							lv_JobType_7_0,
							"org.etl_modeling.jobdsl.JobDsl.JobType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_8='TECH_SYSTEM'
			{
				newLeafNode(otherlv_8, grammarAccess.getJobAccess().getTECH_SYSTEMKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJobAccess().getTECH_SYSTEMEStringParserRuleCall_6_1_0());
					}
					lv_TECH_SYSTEM_9_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJobRule());
						}
						set(
							$current,
							"TECH_SYSTEM",
							lv_TECH_SYSTEM_9_0,
							"org.etl_modeling.jobdsl.JobDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_10='ExecutableName'
			{
				newLeafNode(otherlv_10, grammarAccess.getJobAccess().getExecutableNameKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJobAccess().getExecutableNameEStringParserRuleCall_7_1_0());
					}
					lv_ExecutableName_11_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJobRule());
						}
						set(
							$current,
							"ExecutableName",
							lv_ExecutableName_11_0,
							"org.etl_modeling.jobdsl.JobDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_12='DependentJobs'
			{
				newLeafNode(otherlv_12, grammarAccess.getJobAccess().getDependentJobsKeyword_8_0());
			}
			otherlv_13='{'
			{
				newLeafNode(otherlv_13, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_8_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJobRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getJobAccess().getPreDecessorJobCrossReference_8_2_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_15=','
				{
					newLeafNode(otherlv_15, grammarAccess.getJobAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getJobRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getJobAccess().getPreDecessorJobCrossReference_8_3_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_17='}'
			{
				newLeafNode(otherlv_17, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_8_4());
			}
		)?
		(
			otherlv_18='DependentProcessingPoint'
			{
				newLeafNode(otherlv_18, grammarAccess.getJobAccess().getDependentProcessingPointKeyword_9_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJobRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getJobAccess().getPpPreDecessorprocessingpointProcessingPointCrossReference_9_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				lv_isTestJob_20_0='isTestJob'
				{
					newLeafNode(lv_isTestJob_20_0, grammarAccess.getJobAccess().getIsTestJobIsTestJobKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJobRule());
					}
					setWithLastConsumed($current, "isTestJob", lv_isTestJob_20_0 != null, "isTestJob");
				}
			)
		)?
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleProcessingPoint
entryRuleProcessingPoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessingPointRule()); }
	iv_ruleProcessingPoint=ruleProcessingPoint
	{ $current=$iv_ruleProcessingPoint.current; }
	EOF;

// Rule ProcessingPoint
ruleProcessingPoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProcessingPointAccess().getProcessingPointAction_0(),
					$current);
			}
		)
		otherlv_1='ProcessingPoint'
		{
			newLeafNode(otherlv_1, grammarAccess.getProcessingPointAccess().getProcessingPointKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessingPointAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessingPointRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.etl_modeling.jobdsl.JobDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getProcessingPointAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='ProcessingPointType'
			{
				newLeafNode(otherlv_4, grammarAccess.getProcessingPointAccess().getProcessingPointTypeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProcessingPointAccess().getProcessingPointTypeProcessingPointTypeEnumRuleCall_4_1_0());
					}
					lv_ProcessingPointType_5_0=ruleProcessingPointType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProcessingPointRule());
						}
						set(
							$current,
							"ProcessingPointType",
							lv_ProcessingPointType_5_0,
							"org.etl_modeling.jobdsl.JobDsl.ProcessingPointType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_6='DependentJobs'
			{
				newLeafNode(otherlv_6, grammarAccess.getProcessingPointAccess().getDependentJobsKeyword_5_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getProcessingPointAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProcessingPointRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getProcessingPointAccess().getPreDecessorJobCrossReference_5_2_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getProcessingPointAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getProcessingPointRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getProcessingPointAccess().getPreDecessorJobCrossReference_5_3_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getProcessingPointAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getProcessingPointAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Rule RunningTime
ruleRunningTime returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='EveryDay'
			{
				$current = grammarAccess.getRunningTimeAccess().getEveryDayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRunningTimeAccess().getEveryDayEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='WorkingDay'
			{
				$current = grammarAccess.getRunningTimeAccess().getWorkingDayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRunningTimeAccess().getWorkingDayEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Weekly'
			{
				$current = grammarAccess.getRunningTimeAccess().getWeeklyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRunningTimeAccess().getWeeklyEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MonthlyUltimo'
			{
				$current = grammarAccess.getRunningTimeAccess().getMonthlyUltimoEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getRunningTimeAccess().getMonthlyUltimoEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule JobType
ruleJobType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Trigger'
			{
				$current = grammarAccess.getJobTypeAccess().getTriggerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getJobTypeAccess().getTriggerEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Import'
			{
				$current = grammarAccess.getJobTypeAccess().getImportEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getJobTypeAccess().getImportEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Integration'
			{
				$current = grammarAccess.getJobTypeAccess().getIntegrationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getJobTypeAccess().getIntegrationEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='I2I'
			{
				$current = grammarAccess.getJobTypeAccess().getI2IEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getJobTypeAccess().getI2IEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Export'
			{
				$current = grammarAccess.getJobTypeAccess().getExportEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getJobTypeAccess().getExportEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='ProcessigPoint'
			{
				$current = grammarAccess.getJobTypeAccess().getProcessigPointEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getJobTypeAccess().getProcessigPointEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule ProcessingPointType
ruleProcessingPointType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Business'
			{
				$current = grammarAccess.getProcessingPointTypeAccess().getBusinessEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getProcessingPointTypeAccess().getBusinessEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Tech'
			{
				$current = grammarAccess.getProcessingPointTypeAccess().getTechEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getProcessingPointTypeAccess().getTechEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Test'
			{
				$current = grammarAccess.getProcessingPointTypeAccess().getTestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getProcessingPointTypeAccess().getTestEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
