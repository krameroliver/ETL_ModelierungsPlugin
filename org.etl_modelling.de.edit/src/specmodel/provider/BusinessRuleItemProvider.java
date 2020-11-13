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

import specmodel.BusinessRule;
import specmodel.SpecmodelFactory;
import specmodel.SpecmodelPackage;

/**
 * This is the item provider adapter for a {@link specmodel.BusinessRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessRuleItemProvider 
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
	public BusinessRuleItemProvider(AdapterFactory adapterFactory) {
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
			addRelationshipTargetEntityPropertyDescriptor(object);
			addTargetEntityPropertyDescriptor(object);
			addTargetParentEntityPropertyDescriptor(object);
			addLookupEntitiesPropertyDescriptor(object);
			addRelationshipSourceEntityPropertyDescriptor(object);
			addRuletypePropertyDescriptor(object);
			addRelationshipTargetEntityUseHashKeyPropertyDescriptor(object);
			addRelationshipSourceEntityUseHashKeyPropertyDescriptor(object);
			addTargetEntityUseHashKeyPropertyDescriptor(object);
			addTargetMappingOutputFieldsPropertyDescriptor(object);
			addTargetRelationshipPropertyDescriptor(object);
			addSourceReleationshipPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Relationship Target Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipTargetEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_relationshipTargetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_relationshipTargetEntity_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_targetEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_targetEntity_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__TARGET_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Parent Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetParentEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_targetParentEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_targetParentEntity_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__TARGET_PARENT_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lookup Entities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLookupEntitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_lookupEntities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_lookupEntities_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__LOOKUP_ENTITIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relationship Source Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipSourceEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_relationshipSourceEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_relationshipSourceEntity_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ruletype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuletypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_ruletype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_ruletype_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__RULETYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relationship Target Entity Use Hash Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipTargetEntityUseHashKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_relationshipTargetEntityUseHashKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_relationshipTargetEntityUseHashKey_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relationship Source Entity Use Hash Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelationshipSourceEntityUseHashKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_relationshipSourceEntityUseHashKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_relationshipSourceEntityUseHashKey_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Entity Use Hash Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetEntityUseHashKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_targetEntityUseHashKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_targetEntityUseHashKey_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Mapping Output Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetMappingOutputFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_targetMappingOutputFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_targetMappingOutputFields_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Relationship feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetRelationshipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessRule_targetRelationship_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_targetRelationship_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__TARGET_RELATIONSHIP,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_BusinessRule_sourceReleationship_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessRule_sourceReleationship_feature", "_UI_BusinessRule_type"),
				 SpecmodelPackage.Literals.BUSINESS_RULE__SOURCE_RELEATIONSHIP,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(SpecmodelPackage.Literals.BUSINESS_RULE__POST_DEDUP);
			childrenFeatures.add(SpecmodelPackage.Literals.BUSINESS_RULE__PRE_DEDUP);
			childrenFeatures.add(SpecmodelPackage.Literals.BUSINESS_RULE__VECTORKEYS);
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
	 * This returns BusinessRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessRule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessRule_type") :
			getString("_UI_BusinessRule_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessRule.class)) {
			case SpecmodelPackage.BUSINESS_RULE__NAME:
			case SpecmodelPackage.BUSINESS_RULE__RULETYPE:
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_TARGET_ENTITY_USE_HASH_KEY:
			case SpecmodelPackage.BUSINESS_RULE__RELATIONSHIP_SOURCE_ENTITY_USE_HASH_KEY:
			case SpecmodelPackage.BUSINESS_RULE__TARGET_ENTITY_USE_HASH_KEY:
			case SpecmodelPackage.BUSINESS_RULE__TARGET_MAPPING_OUTPUT_FIELDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpecmodelPackage.BUSINESS_RULE__POST_DEDUP:
			case SpecmodelPackage.BUSINESS_RULE__PRE_DEDUP:
			case SpecmodelPackage.BUSINESS_RULE__VECTORKEYS:
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
				(SpecmodelPackage.Literals.BUSINESS_RULE__POST_DEDUP,
				 SpecmodelFactory.eINSTANCE.createDedup()));

		newChildDescriptors.add
			(createChildParameter
				(SpecmodelPackage.Literals.BUSINESS_RULE__PRE_DEDUP,
				 SpecmodelFactory.eINSTANCE.createDedup()));

		newChildDescriptors.add
			(createChildParameter
				(SpecmodelPackage.Literals.BUSINESS_RULE__VECTORKEYS,
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
			childFeature == SpecmodelPackage.Literals.BUSINESS_RULE__POST_DEDUP ||
			childFeature == SpecmodelPackage.Literals.BUSINESS_RULE__PRE_DEDUP;

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
