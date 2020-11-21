/**
 */
package specmodel.provider;


import ETL_MODEL.ETL_MODELPackage;

import ETL_MODEL.provider.LogmodelEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import specmodel.Source;
import specmodel.SpecmodelFactory;
import specmodel.SpecmodelPackage;

/**
 * This is the item provider adapter for a {@link specmodel.Source} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addSourceSpecificationPropertyDescriptor(object);
			addParentSourcePropertyDescriptor(object);
			addChildSourcesPropertyDescriptor(object);
			addSpecificationPropertyDescriptor(object);
			addParentJoinFieldsPropertyDescriptor(object);
			addChildJoinFieldPropertyDescriptor(object);
			addFiltersPropertyDescriptor(object);
			addVectorkeysPropertyDescriptor(object);
			addSourceEntityPropertyDescriptor(object);
			addIsVectorPropertyDescriptor(object);
			addIsMultiplyingPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addAliasPropertyDescriptor(object);
			addIsMandatoryPropertyDescriptor(object);
			addJoinCommentPropertyDescriptor(object);
			addRelationshipAliasPropertyDescriptor(object);
			addSourceReleationshipPropertyDescriptor(object);
			addJoinEntityPropertyDescriptor(object);
			addBusinessrulePropertyDescriptor(object);
			addJoinTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_namedelement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_namedelement_name_feature", "_UI_namedelement_type"),
				 ETL_MODELPackage.Literals.NAMEDELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_sourceSpecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_sourceSpecification_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__SOURCE_SPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_parentSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_parentSource_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__PARENT_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Sources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildSourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_childSources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_childSources_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__CHILD_SOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_specification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_specification_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__SPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Join Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentJoinFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_parentJoinFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_parentJoinFields_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__PARENT_JOIN_FIELDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Join Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildJoinFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_childJoinField_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_childJoinField_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__CHILD_JOIN_FIELD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_filters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_filters_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__FILTERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vectorkeys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVectorkeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_vectorkeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_vectorkeys_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__VECTORKEYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_sourceEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_sourceEntity_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__SOURCE_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Vector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsVectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_isVector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_isVector_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__IS_VECTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Multiplying feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMultiplyingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_isMultiplying_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_isMultiplying_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__IS_MULTIPLYING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_comment_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_alias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_alias_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Mandatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMandatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_isMandatory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_isMandatory_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__IS_MANDATORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Join Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoinCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_joinComment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_joinComment_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__JOIN_COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relationship Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_relationshipAlias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_relationshipAlias_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__RELATIONSHIP_ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Releationship feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceReleationshipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_sourceReleationship_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_sourceReleationship_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__SOURCE_RELEATIONSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Join Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoinEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_joinEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_joinEntity_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__JOIN_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Businessrule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessrulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_businessrule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_businessrule_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__BUSINESSRULE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Join Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoinTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Source_JoinType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Source_JoinType_feature", "_UI_Source_type"),
				 SpecmodelPackage.Literals.SOURCE__JOIN_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpecmodelPackage.Literals.SOURCE__CHILD_SOURCES);
			childrenFeatures.add(SpecmodelPackage.Literals.SOURCE__PARENT_JOIN_FIELDS);
			childrenFeatures.add(SpecmodelPackage.Literals.SOURCE__CHILD_JOIN_FIELD);
			childrenFeatures.add(SpecmodelPackage.Literals.SOURCE__FILTERS);
			childrenFeatures.add(SpecmodelPackage.Literals.SOURCE__VECTORKEYS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Source.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Source"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Source)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Source_type") :
			getString("_UI_Source_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Source.class)) {
			case SpecmodelPackage.SOURCE__NAME:
			case SpecmodelPackage.SOURCE__IS_VECTOR:
			case SpecmodelPackage.SOURCE__IS_MULTIPLYING:
			case SpecmodelPackage.SOURCE__COMMENT:
			case SpecmodelPackage.SOURCE__ALIAS:
			case SpecmodelPackage.SOURCE__IS_MANDATORY:
			case SpecmodelPackage.SOURCE__JOIN_COMMENT:
			case SpecmodelPackage.SOURCE__RELATIONSHIP_ALIAS:
			case SpecmodelPackage.SOURCE__JOIN_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpecmodelPackage.SOURCE__CHILD_SOURCES:
			case SpecmodelPackage.SOURCE__PARENT_JOIN_FIELDS:
			case SpecmodelPackage.SOURCE__CHILD_JOIN_FIELD:
			case SpecmodelPackage.SOURCE__FILTERS:
			case SpecmodelPackage.SOURCE__VECTORKEYS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpecmodelPackage.Literals.SOURCE__CHILD_SOURCES,
				 SpecmodelFactory.eINSTANCE.createSource()));

		newChildDescriptors.add
			(createChildParameter
				(SpecmodelPackage.Literals.SOURCE__PARENT_JOIN_FIELDS,
				 SpecmodelFactory.eINSTANCE.createJoinField()));

		newChildDescriptors.add
			(createChildParameter
				(SpecmodelPackage.Literals.SOURCE__CHILD_JOIN_FIELD,
				 SpecmodelFactory.eINSTANCE.createJoinField()));

		newChildDescriptors.add
			(createChildParameter
				(SpecmodelPackage.Literals.SOURCE__FILTERS,
				 SpecmodelFactory.eINSTANCE.createFilter()));

		newChildDescriptors.add
			(createChildParameter
				(SpecmodelPackage.Literals.SOURCE__VECTORKEYS,
				 SpecmodelFactory.eINSTANCE.createVectorKey()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SpecmodelPackage.Literals.SOURCE__PARENT_JOIN_FIELDS ||
			childFeature == SpecmodelPackage.Literals.SOURCE__CHILD_JOIN_FIELD;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LogmodelEditPlugin.INSTANCE;
	}

}
