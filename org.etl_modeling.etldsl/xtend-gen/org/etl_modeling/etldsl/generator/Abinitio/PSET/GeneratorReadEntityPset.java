package org.etl_modeling.etldsl.generator.Abinitio.PSET;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import logmodel.Entity;
import logmodel.Field;
import logmodel.Include;
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
public class GeneratorReadEntityPset extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String file = "pset/readEntity/";
    Class<logpackage> p = logpackage.class;
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        String _lowerCase = entity.getName().toLowerCase();
        String _plus = ("pset/readEntity/" + _lowerCase);
        String _plus_1 = (_plus + ".pset");
        file = _plus_1;
        fsa.generateFile(file, this.compile(entity));
      }
    }
  }
  
  public CharSequence compile(final Entity entity) {
    CharSequence pset = this.GenReadentityInputPset(entity);
    pset = pset.toString().replace("],]", "]]");
    return pset;
  }
  
  public CharSequence Tablerecord(final String name, final String origin_field, final String partner_field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("partner_table \"");
    _builder.append(name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("join_condition     \"INNER JOIN\"");
    _builder.newLine();
    _builder.append("related_fields_vec [vector");
    _builder.newLine();
    _builder.append("                          ");
    _builder.append("[record");
    _builder.newLine();
    _builder.append("                           ");
    _builder.append("origin_field  \"");
    _builder.append(origin_field, "                           ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("                           ");
    _builder.append("partner_field \"");
    _builder.append(partner_field, "                           ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("]]]");
    _builder.newLine();
    return _builder;
  }
  
  public String TableRecordJoind(final Entity entity) {
    ArrayList<String> al = new ArrayList<String>();
    String _mainSatName = TableUtils.getMainSatName(entity);
    String _lowerCase = entity.getName().toLowerCase();
    String _plus = (_lowerCase + "_hk");
    String _lowerCase_1 = entity.getName().toLowerCase();
    String _plus_1 = (_lowerCase_1 + "_hk");
    al.add(this.Tablerecord(_mainSatName, _plus, _plus_1).toString());
    EList<Include> _include = entity.getInclude();
    for (final Include include : _include) {
      String _includeName = TableUtils.getIncludeName(entity, include);
      String _lowerCase_2 = entity.getName().toLowerCase();
      String _plus_2 = (_lowerCase_2 + "_hk");
      String _lowerCase_3 = entity.getName().toLowerCase();
      String _plus_3 = (_lowerCase_3 + "_hk");
      al.add(this.Tablerecord(_includeName, _plus_2, _plus_3).toString());
    }
    return IterableExtensions.join(al, ",");
  }
  
  public CharSequence partner_table_descriptions(final String entity_name, final String table_name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[record");
    _builder.newLine();
    _builder.append("table_name \"");
    _builder.append(table_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("historization_type \"full\"");
    _builder.newLine();
    _builder.append("tkey_fields [vector \"");
    _builder.append(entity_name);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("bkey_fields\tNULL");
    _builder.newLine();
    _builder.append("table_relations    [vector]]");
    _builder.newLine();
    return _builder;
  }
  
  public String partner_tableRecordJoind(final Entity entity) {
    ArrayList<String> al = new ArrayList<String>();
    al.add(this.partner_table_descriptions(entity.getName().toLowerCase(), TableUtils.getMainSatName(entity)).toString());
    EList<Include> _include = entity.getInclude();
    for (final Include include : _include) {
      al.add(this.partner_table_descriptions(entity.getName().toLowerCase(), TableUtils.getIncludeName(entity, include)).toString());
    }
    return IterableExtensions.join(al, ",");
  }
  
  public CharSequence GenReadentityInputPset(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$[[record");
    _builder.newLine();
    _builder.append("entity_name \"");
    String _lowerCase = entity.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("entity_type \"\"");
    _builder.newLine();
    _builder.append("layer_type \"BITEMPORAL\"");
    _builder.newLine();
    _builder.append("entity_desc [record");
    _builder.newLine();
    _builder.append("main_table_description  [record");
    _builder.newLine();
    _builder.append("table_name         \"");
    String _hubName = TableUtils.getHubName(entity);
    _builder.append(_hubName);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("historization_type \"BITEMPORAL\"");
    _builder.newLine();
    _builder.append("tkey_fields        [vector \"");
    String _lowerCase_1 = entity.getName().toLowerCase();
    _builder.append(_lowerCase_1);
    _builder.append("_hk\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("bkey_fields        [vector ");
    {
      EList<Field> _entityField = entity.getEntityField();
      for(final Field bkf : _entityField) {
        {
          boolean _isIsBusinessKey = bkf.isIsBusinessKey();
          if (_isIsBusinessKey) {
            _builder.append("\"");
            String _name = bkf.getName();
            _builder.append(_name);
            _builder.append("\",");
          }
        }
      }
    }
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("table_relations    [vector");
    _builder.newLine();
    String _TableRecordJoind = this.TableRecordJoind(entity);
    _builder.append(_TableRecordJoind);
    _builder.newLineIfNotEmpty();
    _builder.append("]]");
    _builder.newLine();
    _builder.append("partner_table_descriptions [vector");
    _builder.newLine();
    String _partner_tableRecordJoind = this.partner_tableRecordJoind(entity);
    _builder.append(_partner_tableRecordJoind);
    _builder.newLineIfNotEmpty();
    _builder.append("]]]]");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
