/*
 * generated by Xtext 2.22.0
 */
package org.etl_modeling.etldsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.etl_modeling.etldsl.ide.contentassist.antlr.internal.InternalETLDslParser;
import org.etl_modeling.etldsl.services.ETLDslGrammarAccess;

public class ETLDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ETLDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ETLDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLogpackageAccess().getAlternatives_7_0(), "rule__Logpackage__Alternatives_7_0");
			builder.put(grammarAccess.getLogpackageAccess().getAlternatives_7_1_1(), "rule__Logpackage__Alternatives_7_1_1");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEntityAccess().getAlternatives_5(), "rule__Entity__Alternatives_5");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getLAYERTYPEAccess().getAlternatives(), "rule__LAYERTYPE__Alternatives");
			builder.put(grammarAccess.getHISTORISATIONTYPEAccess().getAlternatives(), "rule__HISTORISATIONTYPE__Alternatives");
			builder.put(grammarAccess.getREPRESENTATIONSAccess().getAlternatives(), "rule__REPRESENTATIONS__Alternatives");
			builder.put(grammarAccess.getFtAccess().getAlternatives(), "rule__Ft__Alternatives");
			builder.put(grammarAccess.getLogpackageAccess().getGroup(), "rule__Logpackage__Group__0");
			builder.put(grammarAccess.getLogpackageAccess().getGroup_3(), "rule__Logpackage__Group_3__0");
			builder.put(grammarAccess.getLogpackageAccess().getGroup_4(), "rule__Logpackage__Group_4__0");
			builder.put(grammarAccess.getLogpackageAccess().getGroup_5(), "rule__Logpackage__Group_5__0");
			builder.put(grammarAccess.getLogpackageAccess().getGroup_6(), "rule__Logpackage__Group_6__0");
			builder.put(grammarAccess.getLogpackageAccess().getGroup_7(), "rule__Logpackage__Group_7__0");
			builder.put(grammarAccess.getLogpackageAccess().getGroup_7_1(), "rule__Logpackage__Group_7_1__0");
			builder.put(grammarAccess.getCommonMappingAccess().getGroup(), "rule__CommonMapping__Group__0");
			builder.put(grammarAccess.getCommonMappingAccess().getGroup_3(), "rule__CommonMapping__Group_3__0");
			builder.put(grammarAccess.getCommonMappingAccess().getGroup_3_3(), "rule__CommonMapping__Group_3_3__0");
			builder.put(grammarAccess.getCommonMappingAccess().getGroup_4(), "rule__CommonMapping__Group_4__0");
			builder.put(grammarAccess.getCommonMappingAccess().getGroup_4_3(), "rule__CommonMapping__Group_4_3__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_5_0(), "rule__Entity__Group_5_0__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_5_0_3(), "rule__Entity__Group_5_0_3__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_5_1(), "rule__Entity__Group_5_1__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_5_1_3(), "rule__Entity__Group_5_1_3__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_4(), "rule__Field__Group_4__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_5(), "rule__Field__Group_5__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_6(), "rule__Field__Group_6__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_7(), "rule__Field__Group_7__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_8(), "rule__Field__Group_8__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_9(), "rule__Field__Group_9__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_10(), "rule__Field__Group_10__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_11(), "rule__Field__Group_11__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_12(), "rule__Field__Group_12__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_13(), "rule__Field__Group_13__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_14(), "rule__Field__Group_14__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_15(), "rule__Field__Group_15__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_16(), "rule__Field__Group_16__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup_1(), "rule__Include__Group_1__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup_1_2(), "rule__Include__Group_1_2__0");
			builder.put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
			builder.put(grammarAccess.getRelationshipAccess().getGroup_6(), "rule__Relationship__Group_6__0");
			builder.put(grammarAccess.getRelationshipAccess().getGroup_7(), "rule__Relationship__Group_7__0");
			builder.put(grammarAccess.getLogpackageAccess().getNameAssignment_2(), "rule__Logpackage__NameAssignment_2");
			builder.put(grammarAccess.getLogpackageAccess().getLAYERAssignment_3_1(), "rule__Logpackage__LAYERAssignment_3_1");
			builder.put(grammarAccess.getLogpackageAccess().getLAYER_TYPEAssignment_4_1(), "rule__Logpackage__LAYER_TYPEAssignment_4_1");
			builder.put(grammarAccess.getLogpackageAccess().getHISTORISATIONAssignment_5_1(), "rule__Logpackage__HISTORISATIONAssignment_5_1");
			builder.put(grammarAccess.getLogpackageAccess().getREPRESENTATIONAssignment_6_1(), "rule__Logpackage__REPRESENTATIONAssignment_6_1");
			builder.put(grammarAccess.getLogpackageAccess().getCommonmappingAssignment_7_0_0(), "rule__Logpackage__CommonmappingAssignment_7_0_0");
			builder.put(grammarAccess.getLogpackageAccess().getEntityAssignment_7_0_1(), "rule__Logpackage__EntityAssignment_7_0_1");
			builder.put(grammarAccess.getLogpackageAccess().getCommonmappingAssignment_7_1_1_0(), "rule__Logpackage__CommonmappingAssignment_7_1_1_0");
			builder.put(grammarAccess.getLogpackageAccess().getEntityAssignment_7_1_1_1(), "rule__Logpackage__EntityAssignment_7_1_1_1");
			builder.put(grammarAccess.getCommonMappingAccess().getNameAssignment_1(), "rule__CommonMapping__NameAssignment_1");
			builder.put(grammarAccess.getCommonMappingAccess().getCommonmappinginputfieldsAssignment_3_2(), "rule__CommonMapping__CommonmappinginputfieldsAssignment_3_2");
			builder.put(grammarAccess.getCommonMappingAccess().getCommonmappinginputfieldsAssignment_3_3_1(), "rule__CommonMapping__CommonmappinginputfieldsAssignment_3_3_1");
			builder.put(grammarAccess.getCommonMappingAccess().getCommonmappingoutputfieldsAssignment_4_2(), "rule__CommonMapping__CommonmappingoutputfieldsAssignment_4_2");
			builder.put(grammarAccess.getCommonMappingAccess().getCommonmappingoutputfieldsAssignment_4_3_1(), "rule__CommonMapping__CommonmappingoutputfieldsAssignment_4_3_1");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
			builder.put(grammarAccess.getEntityAccess().getEntityFieldAssignment_4_2(), "rule__Entity__EntityFieldAssignment_4_2");
			builder.put(grammarAccess.getEntityAccess().getEntityFieldAssignment_4_3(), "rule__Entity__EntityFieldAssignment_4_3");
			builder.put(grammarAccess.getEntityAccess().getIncludeAssignment_5_0_2(), "rule__Entity__IncludeAssignment_5_0_2");
			builder.put(grammarAccess.getEntityAccess().getIncludeAssignment_5_0_3_1(), "rule__Entity__IncludeAssignment_5_0_3_1");
			builder.put(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_1_2(), "rule__Entity__RelationshipsAssignment_5_1_2");
			builder.put(grammarAccess.getEntityAccess().getRelationshipsAssignment_5_1_3_1(), "rule__Entity__RelationshipsAssignment_5_1_3_1");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_2(), "rule__Field__NameAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getTypeAssignment_4_1(), "rule__Field__TypeAssignment_4_1");
			builder.put(grammarAccess.getFieldAccess().getLengthAssignment_5_1(), "rule__Field__LengthAssignment_5_1");
			builder.put(grammarAccess.getFieldAccess().getPrecisionAssignment_6_1(), "rule__Field__PrecisionAssignment_6_1");
			builder.put(grammarAccess.getFieldAccess().getScaleAssignment_7_1(), "rule__Field__ScaleAssignment_7_1");
			builder.put(grammarAccess.getFieldAccess().getOriginal_nameAssignment_8_1(), "rule__Field__Original_nameAssignment_8_1");
			builder.put(grammarAccess.getFieldAccess().getShort_describtionAssignment_9_1(), "rule__Field__Short_describtionAssignment_9_1");
			builder.put(grammarAccess.getFieldAccess().getDateFormatAssignment_10_1(), "rule__Field__DateFormatAssignment_10_1");
			builder.put(grammarAccess.getFieldAccess().getNullIndicatorAssignment_11_1(), "rule__Field__NullIndicatorAssignment_11_1");
			builder.put(grammarAccess.getFieldAccess().getAllowExponentAssignment_12_1(), "rule__Field__AllowExponentAssignment_12_1");
			builder.put(grammarAccess.getFieldAccess().getHasImplicitCommaAssignment_13_1(), "rule__Field__HasImplicitCommaAssignment_13_1");
			builder.put(grammarAccess.getFieldAccess().getInterfaceOnlyAssignment_14_1(), "rule__Field__InterfaceOnlyAssignment_14_1");
			builder.put(grammarAccess.getFieldAccess().getTableOnlyAssignment_15_1(), "rule__Field__TableOnlyAssignment_15_1");
			builder.put(grammarAccess.getFieldAccess().getIsFastChangingAssignment_16_1(), "rule__Field__IsFastChangingAssignment_16_1");
			builder.put(grammarAccess.getIncludeAccess().getNameAssignment_0(), "rule__Include__NameAssignment_0");
			builder.put(grammarAccess.getIncludeAccess().getIncludeFieldsAssignment_1_1(), "rule__Include__IncludeFieldsAssignment_1_1");
			builder.put(grammarAccess.getIncludeAccess().getIncludeFieldsAssignment_1_2_1(), "rule__Include__IncludeFieldsAssignment_1_2_1");
			builder.put(grammarAccess.getRelationshipAccess().getNameAssignment_1(), "rule__Relationship__NameAssignment_1");
			builder.put(grammarAccess.getRelationshipAccess().getFromEntityAssignment_3(), "rule__Relationship__FromEntityAssignment_3");
			builder.put(grammarAccess.getRelationshipAccess().getToEntityAssignment_5(), "rule__Relationship__ToEntityAssignment_5");
			builder.put(grammarAccess.getRelationshipAccess().getDescribingFieldsRelAssignment_6_1(), "rule__Relationship__DescribingFieldsRelAssignment_6_1");
			builder.put(grammarAccess.getRelationshipAccess().getIdentifiyingFieldsRelAssignment_7_1(), "rule__Relationship__IdentifiyingFieldsRelAssignment_7_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ETLDslGrammarAccess grammarAccess;

	@Override
	protected InternalETLDslParser createParser() {
		InternalETLDslParser result = new InternalETLDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ETLDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ETLDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
