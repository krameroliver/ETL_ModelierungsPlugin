package org.etl_modeling.etldsl.generator.Abinitio.PSET;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import logmodel.Entity;
import logmodel.Field;
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
public class LinkPsetLoader extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<logpackage> _filter = Iterables.<logpackage>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), logpackage.class);
    for (final logpackage p : _filter) {
      {
        String layer = p.getLAYER().toLowerCase();
        Iterable<Entity> _filter_1 = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
        for (final Entity entity : _filter_1) {
          EList<Relationship> _relationships = entity.getRelationships();
          for (final Relationship rel : _relationships) {
            {
              String _lowerCase = rel.getName().toLowerCase();
              String _plus = ("pset/WriteEntity/Relationship/" + _lowerCase);
              String rel_file = (_plus + ".txt");
              fsa.generateFile(rel_file, this.LinkEntityPsets(rel, entity, layer));
            }
          }
        }
      }
    }
  }
  
  public String IdentifyingFields(final Relationship rel) {
    ArrayList<String> al = new ArrayList<String>();
    EList<Field> _identifiyingFieldsRel = rel.getIdentifiyingFieldsRel();
    for (final Field field : _identifiyingFieldsRel) {
      String _lowerCase = field.getName().toLowerCase();
      String _plus = ("\'" + _lowerCase);
      String _plus_1 = (_plus + "\'");
      al.add(_plus_1);
    }
    return IterableExtensions.join(al, ",");
  }
  
  public CharSequence LinkEntityPsets(final Relationship relationship, final Entity entity, final String layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("layer \"");
    _builder.append(layer);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_name \"");
    String _lowerCase = relationship.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("hub_name    \"");
    String _relationLinkName = TableUtils.getRelationLinkName(entity, relationship);
    _builder.append(_relationLinkName);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("sat_name    \"");
    String _relationSatName = TableUtils.getRelationSatName(entity, relationship);
    _builder.append(_relationSatName);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("tech_keys   [vector \"");
    String _lowerCase_1 = relationship.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("business_keys [vector \"");
    String _lowerCase_2 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_2);
    _builder.append("_hk\",\"");
    String _lowerCase_3 = relationship.getToEntity().getName().toLowerCase();
    _builder.append(_lowerCase_3);
    _builder.append("_hk\" ]");
    _builder.newLineIfNotEmpty();
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
}
