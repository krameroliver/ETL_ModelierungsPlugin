/**
 */
package specmodel;

import logmodel.Entity;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link specmodel.Source#getSourceBusinessRule <em>Source Business Rule</em>}</li>
 *   <li>{@link specmodel.Source#getSourceSpecification <em>Source Specification</em>}</li>
 *   <li>{@link specmodel.Source#getParentSource <em>Parent Source</em>}</li>
 *   <li>{@link specmodel.Source#getChildSources <em>Child Sources</em>}</li>
 *   <li>{@link specmodel.Source#getSpecification <em>Specification</em>}</li>
 *   <li>{@link specmodel.Source#getParentJoinFields <em>Parent Join Fields</em>}</li>
 *   <li>{@link specmodel.Source#getChildJoinField <em>Child Join Field</em>}</li>
 *   <li>{@link specmodel.Source#getReadEntitySpecification <em>Read Entity Specification</em>}</li>
 *   <li>{@link specmodel.Source#getFilters <em>Filters</em>}</li>
 *   <li>{@link specmodel.Source#getVectorkeys <em>Vectorkeys</em>}</li>
 *   <li>{@link specmodel.Source#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link specmodel.Source#isIsVector <em>Is Vector</em>}</li>
 *   <li>{@link specmodel.Source#isIsMultiplying <em>Is Multiplying</em>}</li>
 *   <li>{@link specmodel.Source#getComment <em>Comment</em>}</li>
 *   <li>{@link specmodel.Source#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see specmodel.SpecmodelPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Business Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Business Rule</em>' reference.
	 * @see #setSourceBusinessRule(BusinessRule)
	 * @see specmodel.SpecmodelPackage#getSource_SourceBusinessRule()
	 * @model
	 * @generated
	 */
	BusinessRule getSourceBusinessRule();

	/**
	 * Sets the value of the '{@link specmodel.Source#getSourceBusinessRule <em>Source Business Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Business Rule</em>' reference.
	 * @see #getSourceBusinessRule()
	 * @generated
	 */
	void setSourceBusinessRule(BusinessRule value);

	/**
	 * Returns the value of the '<em><b>Source Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Specification</em>' reference.
	 * @see #setSourceSpecification(Specification)
	 * @see specmodel.SpecmodelPackage#getSource_SourceSpecification()
	 * @model
	 * @generated
	 */
	Specification getSourceSpecification();

	/**
	 * Sets the value of the '{@link specmodel.Source#getSourceSpecification <em>Source Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Specification</em>' reference.
	 * @see #getSourceSpecification()
	 * @generated
	 */
	void setSourceSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Parent Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getChildSources <em>Child Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Source</em>' container reference.
	 * @see #setParentSource(Source)
	 * @see specmodel.SpecmodelPackage#getSource_ParentSource()
	 * @see specmodel.Source#getChildSources
	 * @model opposite="childSources" transient="false"
	 * @generated
	 */
	Source getParentSource();

	/**
	 * Sets the value of the '{@link specmodel.Source#getParentSource <em>Parent Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Source</em>' container reference.
	 * @see #getParentSource()
	 * @generated
	 */
	void setParentSource(Source value);

	/**
	 * Returns the value of the '<em><b>Child Sources</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Source}.
	 * It is bidirectional and its opposite is '{@link specmodel.Source#getParentSource <em>Parent Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Sources</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getSource_ChildSources()
	 * @see specmodel.Source#getParentSource
	 * @model opposite="parentSource" containment="true"
	 * @generated
	 */
	EList<Source> getChildSources();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link specmodel.Specification#getPrimarySources <em>Primary Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(Specification)
	 * @see specmodel.SpecmodelPackage#getSource_Specification()
	 * @see specmodel.Specification#getPrimarySources
	 * @model opposite="primarySources" transient="false"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link specmodel.Source#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Parent Join Fields</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.JoinField}.
	 * It is bidirectional and its opposite is '{@link specmodel.JoinField#getParentSource <em>Parent Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Join Fields</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getSource_ParentJoinFields()
	 * @see specmodel.JoinField#getParentSource
	 * @model opposite="parentSource" containment="true"
	 * @generated
	 */
	EList<JoinField> getParentJoinFields();

	/**
	 * Returns the value of the '<em><b>Child Join Field</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.JoinField}.
	 * It is bidirectional and its opposite is '{@link specmodel.JoinField#getChildSource <em>Child Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Join Field</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getSource_ChildJoinField()
	 * @see specmodel.JoinField#getChildSource
	 * @model opposite="childSource" containment="true"
	 * @generated
	 */
	EList<JoinField> getChildJoinField();

	/**
	 * Returns the value of the '<em><b>Read Entity Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link specmodel.ReadEntitySpecification#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Entity Specification</em>' reference.
	 * @see #setReadEntitySpecification(ReadEntitySpecification)
	 * @see specmodel.SpecmodelPackage#getSource_ReadEntitySpecification()
	 * @see specmodel.ReadEntitySpecification#getSource
	 * @model opposite="source"
	 * @generated
	 */
	ReadEntitySpecification getReadEntitySpecification();

	/**
	 * Sets the value of the '{@link specmodel.Source#getReadEntitySpecification <em>Read Entity Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Entity Specification</em>' reference.
	 * @see #getReadEntitySpecification()
	 * @generated
	 */
	void setReadEntitySpecification(ReadEntitySpecification value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link specmodel.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see specmodel.SpecmodelPackage#getSource_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Vectorkeys</b></em>' reference list.
	 * The list contents are of type {@link specmodel.VectorKey}.
	 * It is bidirectional and its opposite is '{@link specmodel.VectorKey#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectorkeys</em>' reference list.
	 * @see specmodel.SpecmodelPackage#getSource_Vectorkeys()
	 * @see specmodel.VectorKey#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<VectorKey> getVectorkeys();

	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see #setSourceEntity(Entity)
	 * @see specmodel.SpecmodelPackage#getSource_SourceEntity()
	 * @model
	 * @generated
	 */
	Entity getSourceEntity();

	/**
	 * Sets the value of the '{@link specmodel.Source#getSourceEntity <em>Source Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Entity</em>' reference.
	 * @see #getSourceEntity()
	 * @generated
	 */
	void setSourceEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Is Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Vector</em>' attribute.
	 * @see #setIsVector(boolean)
	 * @see specmodel.SpecmodelPackage#getSource_IsVector()
	 * @model
	 * @generated
	 */
	boolean isIsVector();

	/**
	 * Sets the value of the '{@link specmodel.Source#isIsVector <em>Is Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Vector</em>' attribute.
	 * @see #isIsVector()
	 * @generated
	 */
	void setIsVector(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multiplying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multiplying</em>' attribute.
	 * @see #setIsMultiplying(boolean)
	 * @see specmodel.SpecmodelPackage#getSource_IsMultiplying()
	 * @model
	 * @generated
	 */
	boolean isIsMultiplying();

	/**
	 * Sets the value of the '{@link specmodel.Source#isIsMultiplying <em>Is Multiplying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multiplying</em>' attribute.
	 * @see #isIsMultiplying()
	 * @generated
	 */
	void setIsMultiplying(boolean value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see specmodel.SpecmodelPackage#getSource_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link specmodel.Source#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see specmodel.SpecmodelPackage#getSource_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link specmodel.Source#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // Source
