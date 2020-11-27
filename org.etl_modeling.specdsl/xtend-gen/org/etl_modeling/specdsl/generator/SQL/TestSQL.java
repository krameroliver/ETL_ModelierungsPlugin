package org.etl_modeling.specdsl.generator.SQL;

import com.google.common.collect.Iterables;
import logmodel.Entity;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import specmodel.BusinessRule;
import specmodel.Source;

@SuppressWarnings("all")
public class TestSQL extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<BusinessRule> _filter = Iterables.<BusinessRule>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), BusinessRule.class);
    for (final BusinessRule br : _filter) {
      {
        String _name = br.getName();
        String _plus = ("sql/TestSQL/" + _name);
        String test_sql = (_plus + ".sql");
        fsa.generateFile(test_sql, this.GenerateTestSQL(br));
      }
    }
  }
  
  public CharSequence entityJoin(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Select sqt.* FROM s_");
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append(" as sat");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("inner join h_");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1, "    ");
    _builder.append(" as hub");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("on sat.");
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2, "    ");
    _builder.append("_hk = hub.");
    String _lowerCase_3 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_3, "    ");
    _builder.append("_hk) as ");
    String _lowerCase_4 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_4, "    ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String GenerateTestSQL(final BusinessRule br) {
    Source p_s = IterableExtensions.<Source>last(br.getSources());
    String context = "";
    context = (context + "SELECT * FROM \n");
    CharSequence _entityJoin = this.entityJoin(p_s.getSourceEntity());
    String _plus = (context + _entityJoin);
    context = _plus;
    EList<Source> _childSources = p_s.getChildSources();
    for (final Source source : _childSources) {
      {
        String _literal = source.getJoinType().getLiteral();
        String _plus_1 = (context + _literal);
        String _plus_2 = (_plus_1 + "JOIN ");
        context = _plus_2;
        this.entityJoin(IterableExtensions.<Source>last(source.getChildSources()).getSourceEntity());
      }
    }
    context = (context + "\n;");
    return context;
  }
}
