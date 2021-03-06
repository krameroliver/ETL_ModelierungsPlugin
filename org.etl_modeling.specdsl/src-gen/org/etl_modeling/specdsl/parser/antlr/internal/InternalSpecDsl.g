/*
 * generated by Xtext 2.22.0
 */
grammar InternalSpecDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.etl_modeling.specdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSpecPackage
entryRuleSpecPackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecPackageRule()); }
	iv_ruleSpecPackage=ruleSpecPackage
	{ $current=$iv_ruleSpecPackage.current; }
	EOF;

// Rule SpecPackage
ruleSpecPackage returns [EObject current=null]
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
					grammarAccess.getSpecPackageAccess().getSpecPackageAction_0(),
					$current);
			}
		)
		otherlv_1='SpecPackage'
		{
			newLeafNode(otherlv_1, grammarAccess.getSpecPackageAccess().getSpecPackageKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecPackageAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecPackageRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.etl_modeling.specdsl.SpecDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecPackageAccess().getSpecificationsSpecificationParserRuleCall_3_0());
				}
				lv_specifications_3_0=ruleSpecification
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecPackageRule());
					}
					add(
						$current,
						"specifications",
						lv_specifications_3_0,
						"org.etl_modeling.specdsl.SpecDsl.Specification");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSpecification
entryRuleSpecification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpecificationRule()); }
	iv_ruleSpecification=ruleSpecification
	{ $current=$iv_ruleSpecification.current; }
	EOF;

// Rule Specification
ruleSpecification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Specification'
		{
			newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecificationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecificationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.etl_modeling.specdsl.SpecDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='target'
		{
			newLeafNode(otherlv_3, grammarAccess.getSpecificationAccess().getTargetKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSpecificationAccess().getBusinessrulesBusinessRuleParserRuleCall_4_0());
				}
				lv_businessrules_4_0=ruleBusinessRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSpecificationRule());
					}
					add(
						$current,
						"businessrules",
						lv_businessrules_4_0,
						"org.etl_modeling.specdsl.SpecDsl.BusinessRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_5());
		}
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

// Entry rule entryRuleBusinessRule
entryRuleBusinessRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBusinessRuleRule()); }
	iv_ruleBusinessRule=ruleBusinessRule
	{ $current=$iv_ruleBusinessRule.current; }
	EOF;

// Rule BusinessRule
ruleBusinessRule returns [EObject current=null]
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
					grammarAccess.getBusinessRuleAccess().getBusinessRuleAction_0(),
					$current);
			}
		)
		otherlv_1='RuleType'
		{
			newLeafNode(otherlv_1, grammarAccess.getBusinessRuleAccess().getRuleTypeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBusinessRuleAccess().getRuleTypeRuleTypeEnumRuleCall_2_0());
				}
				lv_RuleType_2_0=ruleRuleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
					}
					set(
						$current,
						"RuleType",
						lv_RuleType_2_0,
						"org.etl_modeling.specdsl.SpecDsl.RuleType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='BusinessRule'
		{
			newLeafNode(otherlv_3, grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBusinessRuleAccess().getNameEStringParserRuleCall_4_0());
				}
				lv_name_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
					}
					set(
						$current,
						"name",
						lv_name_4_0,
						"org.etl_modeling.specdsl.SpecDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_5='targetEntity'
				{
					newLeafNode(otherlv_5, grammarAccess.getBusinessRuleAccess().getTargetEntityKeyword_5_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBusinessRuleRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getBusinessRuleAccess().getTargetEntityEntityCrossReference_5_0_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_7='targetRelationship'
				{
					newLeafNode(otherlv_7, grammarAccess.getBusinessRuleAccess().getTargetRelationshipKeyword_5_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBusinessRuleRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getBusinessRuleAccess().getTargetRelationshipRelationshipCrossReference_5_1_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_9='targetIncludeSatelit'
				{
					newLeafNode(otherlv_9, grammarAccess.getBusinessRuleAccess().getTargetIncludeSatelitKeyword_5_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBusinessRuleRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getBusinessRuleAccess().getTargetIncludeIncludeCrossReference_5_2_1_0());
						}
						ruleQualifiedName
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBusinessRuleAccess().getSourcesPrimarySourceParserRuleCall_6_0());
				}
				lv_sources_11_0=rulePrimarySource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
					}
					add(
						$current,
						"sources",
						lv_sources_11_0,
						"org.etl_modeling.specdsl.SpecDsl.PrimarySource");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePrimarySource
entryRulePrimarySource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimarySourceRule()); }
	iv_rulePrimarySource=rulePrimarySource
	{ $current=$iv_rulePrimarySource.current; }
	EOF;

// Rule PrimarySource
rulePrimarySource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PrimarySource'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrimarySourceAccess().getPrimarySourceKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimarySourceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPrimarySourceAccess().getSourceEntityEntityCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='alias'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimarySourceAccess().getAliasKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimarySourceAccess().getAliasEStringParserRuleCall_2_1_0());
					}
					lv_alias_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimarySourceRule());
						}
						set(
							$current,
							"alias",
							lv_alias_3_0,
							"org.etl_modeling.specdsl.SpecDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_4='childSources'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimarySourceAccess().getChildSourcesKeyword_3_0());
			}
			otherlv_5='['
			{
				newLeafNode(otherlv_5, grammarAccess.getPrimarySourceAccess().getLeftSquareBracketKeyword_3_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_0_0());
						}
						lv_childSources_6_0=ruleSource
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPrimarySourceRule());
							}
							add(
								$current,
								"childSources",
								lv_childSources_6_0,
								"org.etl_modeling.specdsl.SpecDsl.Source");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getPrimarySourceAccess().getChildSourcesSourceParserRuleCall_3_2_1_0());
						}
						lv_childSources_7_0=ruleSource
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPrimarySourceRule());
							}
							add(
								$current,
								"childSources",
								lv_childSources_7_0,
								"org.etl_modeling.specdsl.SpecDsl.Source");
							afterParserOrEnumRuleCall();
						}
					)
				)*
			)
			otherlv_8=']'
			{
				newLeafNode(otherlv_8, grammarAccess.getPrimarySourceAccess().getRightSquareBracketKeyword_3_3());
			}
		)*
	)
;

// Entry rule entryRuleSource
entryRuleSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSourceRule()); }
	iv_ruleSource=ruleSource
	{ $current=$iv_ruleSource.current; }
	EOF;

// Rule Source
ruleSource returns [EObject current=null]
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
					grammarAccess.getSourceAccess().getSourceAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSourceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSourceAccess().getSourceEntityEntityCrossReference_1_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='alias'
			{
				newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getAliasKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSourceAccess().getAliasEStringParserRuleCall_2_1_0());
					}
					lv_alias_3_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSourceRule());
						}
						set(
							$current,
							"alias",
							lv_alias_3_0,
							"org.etl_modeling.specdsl.SpecDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				lv_isMandatory_4_0='mandatory'
				{
					newLeafNode(lv_isMandatory_4_0, grammarAccess.getSourceAccess().getIsMandatoryMandatoryKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSourceRule());
					}
					setWithLastConsumed($current, "isMandatory", lv_isMandatory_4_0 != null, "mandatory");
				}
			)
		)?
		(
			(
				lv_isMultiplying_5_0='isMultiplying'
				{
					newLeafNode(lv_isMultiplying_5_0, grammarAccess.getSourceAccess().getIsMultiplyingIsMultiplyingKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSourceRule());
					}
					setWithLastConsumed($current, "isMultiplying", lv_isMultiplying_5_0 != null, "isMultiplying");
				}
			)
		)?
		(
			(
				lv_isVector_6_0='Vector'
				{
					newLeafNode(lv_isVector_6_0, grammarAccess.getSourceAccess().getIsVectorVectorKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSourceRule());
					}
					setWithLastConsumed($current, "isVector", lv_isVector_6_0 != null, "Vector");
				}
			)
		)?
		(
			otherlv_7='VectoryKeys'
			{
				newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getVectoryKeysKeyword_6_0());
			}
			otherlv_8='{'
			{
				newLeafNode(otherlv_8, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_0_0());
						}
						lv_vectorkeys_9_0=ruleVectorKey
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSourceRule());
							}
							add(
								$current,
								"vectorkeys",
								lv_vectorkeys_9_0,
								"org.etl_modeling.specdsl.SpecDsl.VectorKey");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_10=','
					{
						newLeafNode(otherlv_10, grammarAccess.getSourceAccess().getCommaKeyword_6_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getSourceAccess().getVectorkeysVectorKeyParserRuleCall_6_2_1_1_0());
							}
							lv_vectorkeys_11_0=ruleVectorKey
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSourceRule());
								}
								add(
									$current,
									"vectorkeys",
									lv_vectorkeys_11_0,
									"org.etl_modeling.specdsl.SpecDsl.VectorKey");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				otherlv_12='}'
				{
					newLeafNode(otherlv_12, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_6_2_2());
				}
			)
		)?
		(
			otherlv_13='JoinViaLink'
			{
				newLeafNode(otherlv_13, grammarAccess.getSourceAccess().getJoinViaLinkKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSourceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSourceAccess().getSourceReleationshipRelationshipCrossReference_7_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_15='JoinComment'
			{
				newLeafNode(otherlv_15, grammarAccess.getSourceAccess().getJoinCommentKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSourceAccess().getJoinCommentEStringParserRuleCall_8_1_0());
					}
					lv_joinComment_16_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSourceRule());
						}
						set(
							$current,
							"joinComment",
							lv_joinComment_16_0,
							"org.etl_modeling.specdsl.SpecDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_17='PrimaryJoinFields'
			{
				newLeafNode(otherlv_17, grammarAccess.getSourceAccess().getPrimaryJoinFieldsKeyword_9_0());
			}
			otherlv_18='{'
			{
				newLeafNode(otherlv_18, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_0_0());
						}
						lv_parentJoinFields_19_0=ruleJoinField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSourceRule());
							}
							add(
								$current,
								"parentJoinFields",
								lv_parentJoinFields_19_0,
								"org.etl_modeling.specdsl.SpecDsl.JoinField");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_20=','
					{
						newLeafNode(otherlv_20, grammarAccess.getSourceAccess().getCommaKeyword_9_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getSourceAccess().getParentJoinFieldsJoinFieldParserRuleCall_9_2_1_1_0());
							}
							lv_parentJoinFields_21_0=ruleJoinField
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSourceRule());
								}
								add(
									$current,
									"parentJoinFields",
									lv_parentJoinFields_21_0,
									"org.etl_modeling.specdsl.SpecDsl.JoinField");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			otherlv_22='}'
			{
				newLeafNode(otherlv_22, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_9_3());
			}
		)?
		(
			otherlv_23='SecondaryJoinField'
			{
				newLeafNode(otherlv_23, grammarAccess.getSourceAccess().getSecondaryJoinFieldKeyword_10_0());
			}
			otherlv_24='{'
			{
				newLeafNode(otherlv_24, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_0_0());
						}
						lv_childJoinField_25_0=ruleJoinField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSourceRule());
							}
							add(
								$current,
								"childJoinField",
								lv_childJoinField_25_0,
								"org.etl_modeling.specdsl.SpecDsl.JoinField");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_26=','
					{
						newLeafNode(otherlv_26, grammarAccess.getSourceAccess().getCommaKeyword_10_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getSourceAccess().getChildJoinFieldJoinFieldParserRuleCall_10_2_1_1_0());
							}
							lv_childJoinField_27_0=ruleJoinField
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSourceRule());
								}
								add(
									$current,
									"childJoinField",
									lv_childJoinField_27_0,
									"org.etl_modeling.specdsl.SpecDsl.JoinField");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			otherlv_28='}'
			{
				newLeafNode(otherlv_28, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_10_3());
			}
		)?
		(
			otherlv_29='JoinType'
			{
				newLeafNode(otherlv_29, grammarAccess.getSourceAccess().getJoinTypeKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSourceAccess().getJoinTypeJoinTypeEnumRuleCall_11_1_0());
					}
					lv_JoinType_30_0=ruleJoinType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSourceRule());
						}
						set(
							$current,
							"JoinType",
							lv_JoinType_30_0,
							"org.etl_modeling.specdsl.SpecDsl.JoinType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_31='['
			{
				newLeafNode(otherlv_31, grammarAccess.getSourceAccess().getLeftSquareBracketKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSourceAccess().getChildSourcesSourceParserRuleCall_12_1_0());
					}
					lv_childSources_32_0=ruleSource
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSourceRule());
						}
						add(
							$current,
							"childSources",
							lv_childSources_32_0,
							"org.etl_modeling.specdsl.SpecDsl.Source");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_33=']'
			{
				newLeafNode(otherlv_33, grammarAccess.getSourceAccess().getRightSquareBracketKeyword_12_2());
			}
		)*
	)
;

// Entry rule entryRuleVectorKey
entryRuleVectorKey returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVectorKeyRule()); }
	iv_ruleVectorKey=ruleVectorKey
	{ $current=$iv_ruleVectorKey.current; }
	EOF;

// Rule VectorKey
ruleVectorKey returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVectorKeyRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getVectorKeyAccess().getVkFieldFieldCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleJoinField
entryRuleJoinField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJoinFieldRule()); }
	iv_ruleJoinField=ruleJoinField
	{ $current=$iv_ruleJoinField.current; }
	EOF;

// Rule JoinField
ruleJoinField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getJoinFieldRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getJoinFieldAccess().getFieldFieldCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Rule RuleType
ruleRuleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Aggregation'
			{
				$current = grammarAccess.getRuleTypeAccess().getAggregationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRuleTypeAccess().getAggregationEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Dedup'
			{
				$current = grammarAccess.getRuleTypeAccess().getDedupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRuleTypeAccess().getDedupEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Filter'
			{
				$current = grammarAccess.getRuleTypeAccess().getFilterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRuleTypeAccess().getFilterEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MultiFire'
			{
				$current = grammarAccess.getRuleTypeAccess().getMultiFireEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getRuleTypeAccess().getMultiFireEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='SingleFire'
			{
				$current = grammarAccess.getRuleTypeAccess().getSingleFireEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getRuleTypeAccess().getSingleFireEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule JoinType
ruleJoinType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LEFT'
			{
				$current = grammarAccess.getJoinTypeAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getJoinTypeAccess().getLEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='RIGHT'
			{
				$current = grammarAccess.getJoinTypeAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getJoinTypeAccess().getRIGHTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='INNER'
			{
				$current = grammarAccess.getJoinTypeAccess().getINNEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getJoinTypeAccess().getINNEREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='FULL_OUTER'
			{
				$current = grammarAccess.getJoinTypeAccess().getFULL_OUTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getJoinTypeAccess().getFULL_OUTEREnumLiteralDeclaration_3());
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
