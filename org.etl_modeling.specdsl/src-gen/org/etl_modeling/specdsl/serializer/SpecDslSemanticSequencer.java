/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.specdsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.etl_modeling.specdsl.services.SpecDslGrammarAccess;
import specmodel.BusinessRule;
import specmodel.JoinField;
import specmodel.Source;
import specmodel.SpecPackage;
import specmodel.Specification;
import specmodel.SpecmodelPackage;
import specmodel.VectorKey;

@SuppressWarnings("all")
public class SpecDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpecDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SpecmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SpecmodelPackage.BUSINESS_RULE:
				sequence_BusinessRule(context, (BusinessRule) semanticObject); 
				return; 
			case SpecmodelPackage.JOIN_FIELD:
				sequence_JoinField(context, (JoinField) semanticObject); 
				return; 
			case SpecmodelPackage.SOURCE:
				if (rule == grammarAccess.getPrimarySourceRule()) {
					sequence_PrimarySource(context, (Source) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSourceRule()) {
					sequence_Source(context, (Source) semanticObject); 
					return; 
				}
				else break;
			case SpecmodelPackage.SPEC_PACKAGE:
				sequence_SpecPackage(context, (SpecPackage) semanticObject); 
				return; 
			case SpecmodelPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case SpecmodelPackage.VECTOR_KEY:
				sequence_VectorKey(context, (VectorKey) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BusinessRule returns BusinessRule
	 *
	 * Constraint:
	 *     (
	 *         RuleType=RuleType 
	 *         name=EString 
	 *         (targetEntity=[Entity|QualifiedName] | targetRelationship=[Relationship|QualifiedName] | targetInclude=[Include|QualifiedName]) 
	 *         sources+=PrimarySource*
	 *     )
	 */
	protected void sequence_BusinessRule(ISerializationContext context, BusinessRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JoinField returns JoinField
	 *
	 * Constraint:
	 *     field=[Field|QualifiedName]
	 */
	protected void sequence_JoinField(ISerializationContext context, JoinField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpecmodelPackage.Literals.JOIN_FIELD__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecmodelPackage.Literals.JOIN_FIELD__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJoinFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(SpecmodelPackage.Literals.JOIN_FIELD__FIELD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimarySource returns Source
	 *
	 * Constraint:
	 *     (sourceEntity=[Entity|QualifiedName] alias=EString? (childSources+=Source childSources+=Source*)*)
	 */
	protected void sequence_PrimarySource(ISerializationContext context, Source semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Source returns Source
	 *
	 * Constraint:
	 *     (
	 *         sourceEntity=[Entity|QualifiedName] 
	 *         alias=EString? 
	 *         isMandatory?='mandatory'? 
	 *         isMultiplying?='isMultiplying'? 
	 *         isVector?='Vector'? 
	 *         (vectorkeys+=VectorKey vectorkeys+=VectorKey*)? 
	 *         sourceReleationship=[Relationship|QualifiedName]? 
	 *         joinComment=EString? 
	 *         (parentJoinFields+=JoinField parentJoinFields+=JoinField*)? 
	 *         (childJoinField+=JoinField childJoinField+=JoinField*)? 
	 *         JoinType=JoinType 
	 *         childSources+=Source*
	 *     )
	 */
	protected void sequence_Source(ISerializationContext context, Source semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecPackage returns SpecPackage
	 *
	 * Constraint:
	 *     (name=EString specifications+=Specification*)
	 */
	protected void sequence_SpecPackage(ISerializationContext context, SpecPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (name=EString businessrules+=BusinessRule)
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VectorKey returns VectorKey
	 *
	 * Constraint:
	 *     vkField=[Field|QualifiedName]
	 */
	protected void sequence_VectorKey(ISerializationContext context, VectorKey semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SpecmodelPackage.Literals.VECTOR_KEY__VK_FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecmodelPackage.Literals.VECTOR_KEY__VK_FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVectorKeyAccess().getVkFieldFieldQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(SpecmodelPackage.Literals.VECTOR_KEY__VK_FIELD, false));
		feeder.finish();
	}
	
	
}
