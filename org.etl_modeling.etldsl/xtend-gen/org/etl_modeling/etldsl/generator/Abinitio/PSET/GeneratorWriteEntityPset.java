package org.etl_modeling.etldsl.generator.Abinitio.PSET;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
import logmodel.Relationship;
import logmodel.logpackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.etl_modeling.etldsl.utils.TableUtils;

@SuppressWarnings("all")
public class GeneratorWriteEntityPset extends AbstractGenerator {
  private String entity_file = "";
  
  private String include_file = "";
  
  private String link_file = "";
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<logpackage> _filter = Iterables.<logpackage>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), logpackage.class);
    for (final logpackage p : _filter) {
      {
        String layer = p.getLAYER().toLowerCase();
        Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
        for (final Entity entity : _filter_1) {
          {
            String _lowerCase = entity.getName().toLowerCase();
            String _plus = ("pset/WriteEntity/Entity/" + _lowerCase);
            String _plus_1 = (_plus + ".txt");
            this.entity_file = _plus_1;
            fsa.generateFile(this.entity_file, this.BasicEntityPsets(entity, layer));
            EList<Include> _include = entity.getInclude();
            for (final Include include : _include) {
              {
                String _includeName = TableUtils.getIncludeName(entity, include);
                String _plus_2 = ("pset/WriteEntity/Include/" + _includeName);
                String _plus_3 = (_plus_2 + ".txt");
                this.include_file = _plus_3;
                fsa.generateFile(this.include_file, this.IncludeEntityPsets(include, entity, layer));
              }
            }
          }
        }
      }
    }
  }
  
  public String BuildBusinessKeys(final Entity entity) {
    ArrayList<String> bk_fields = new ArrayList<String>();
    EList<Field> _entityField = entity.getEntityField();
    for (final Field field : _entityField) {
      boolean _isIsBusinessKey = field.isIsBusinessKey();
      if (_isIsBusinessKey) {
        String _lowerCase = field.getName().toLowerCase();
        String _plus = ("\"" + _lowerCase);
        String _plus_1 = (_plus + "\"");
        bk_fields.add(_plus_1);
      }
    }
    return IterableExtensions.join(bk_fields, ",");
  }
  
  public String BuildIdentifyingKeys(final Relationship rel) {
    ArrayList<String> bk_fields = new ArrayList<String>();
    EList<Field> _identifiyingFieldsRel = rel.getIdentifiyingFieldsRel();
    for (final Field field : _identifiyingFieldsRel) {
      String _lowerCase = field.getName().toLowerCase();
      String _plus = ("\"" + _lowerCase);
      String _plus_1 = (_plus + "\"");
      bk_fields.add(_plus_1);
    }
    return IterableExtensions.join(bk_fields, ",");
  }
  
  public CharSequence BasicEntityPsets(final Entity entity, final String layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("layer \"");
    _builder.append(layer);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_name \"");
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("hub_name    \"");
    String _hubName = TableUtils.getHubName(entity);
    _builder.append(_hubName);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("sat_name    \"");
    String _mainSatName = TableUtils.getMainSatName(entity);
    _builder.append(_mainSatName);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("tech_keys   [vector \"");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("business_keys [vector ");
    String _BuildBusinessKeys = this.BuildBusinessKeys(entity);
    _builder.append(_BuildBusinessKeys);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence IncludeEntityPsets(final Include include, final Entity entity, final String layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("layer \"");
    _builder.append(layer);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_name \"");
    String _lowerCase = include.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("_");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("hub_name    \"");
    String _hubName = TableUtils.getHubName(entity);
    _builder.append(_hubName);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("sat_name    \"");
    String _includeName = TableUtils.getIncludeName(entity, include);
    _builder.append(_includeName);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("tech_keys   [vector \"");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("business_keys [vector ");
    String _BuildBusinessKeys = this.BuildBusinessKeys(entity);
    _builder.append(_BuildBusinessKeys);
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
}
