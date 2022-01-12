/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq;


import de.dataelementhub.dal.jooq.tables.ConceptElementAssociations;
import de.dataelementhub.dal.jooq.tables.Concepts;
import de.dataelementhub.dal.jooq.tables.Config;
import de.dataelementhub.dal.jooq.tables.Definition;
import de.dataelementhub.dal.jooq.tables.DehubUser;
import de.dataelementhub.dal.jooq.tables.Element;
import de.dataelementhub.dal.jooq.tables.ElementRelation;
import de.dataelementhub.dal.jooq.tables.GetDefinitionByUrn;
import de.dataelementhub.dal.jooq.tables.GetScopedIdentifierByUrn;
import de.dataelementhub.dal.jooq.tables.GetSlotByUrn;
import de.dataelementhub.dal.jooq.tables.GetValueDomainByUrn;
import de.dataelementhub.dal.jooq.tables.GetValueDomainScopedIdentifierByDataelementUrn;
import de.dataelementhub.dal.jooq.tables.Import;
import de.dataelementhub.dal.jooq.tables.PermissibleCode;
import de.dataelementhub.dal.jooq.tables.ScopedIdentifier;
import de.dataelementhub.dal.jooq.tables.ScopedIdentifierHierarchy;
import de.dataelementhub.dal.jooq.tables.Slot;
import de.dataelementhub.dal.jooq.tables.Source;
import de.dataelementhub.dal.jooq.tables.Staging;
import de.dataelementhub.dal.jooq.tables.UserNamespaceAccess;
import de.dataelementhub.dal.jooq.tables.UserSourceCredentials;
import de.dataelementhub.dal.jooq.tables.ValueDomainPermissibleValue;
import de.dataelementhub.dal.jooq.tables.records.ConceptElementAssociationsRecord;
import de.dataelementhub.dal.jooq.tables.records.ConceptsRecord;
import de.dataelementhub.dal.jooq.tables.records.ConfigRecord;
import de.dataelementhub.dal.jooq.tables.records.DefinitionRecord;
import de.dataelementhub.dal.jooq.tables.records.DehubUserRecord;
import de.dataelementhub.dal.jooq.tables.records.ElementRecord;
import de.dataelementhub.dal.jooq.tables.records.ElementRelationRecord;
import de.dataelementhub.dal.jooq.tables.records.GetDefinitionByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetScopedIdentifierByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetSlotByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetValueDomainByUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.GetValueDomainScopedIdentifierByDataelementUrnRecord;
import de.dataelementhub.dal.jooq.tables.records.ImportRecord;
import de.dataelementhub.dal.jooq.tables.records.PermissibleCodeRecord;
import de.dataelementhub.dal.jooq.tables.records.ScopedIdentifierHierarchyRecord;
import de.dataelementhub.dal.jooq.tables.records.ScopedIdentifierRecord;
import de.dataelementhub.dal.jooq.tables.records.SlotRecord;
import de.dataelementhub.dal.jooq.tables.records.SourceRecord;
import de.dataelementhub.dal.jooq.tables.records.StagingRecord;
import de.dataelementhub.dal.jooq.tables.records.UserNamespaceAccessRecord;
import de.dataelementhub.dal.jooq.tables.records.UserSourceCredentialsRecord;
import de.dataelementhub.dal.jooq.tables.records.ValueDomainPermissibleValueRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ConceptsRecord, Integer> IDENTITY_CONCEPTS = Identities0.IDENTITY_CONCEPTS;
    public static final Identity<ConfigRecord, Integer> IDENTITY_CONFIG = Identities0.IDENTITY_CONFIG;
    public static final Identity<DefinitionRecord, Integer> IDENTITY_DEFINITION = Identities0.IDENTITY_DEFINITION;
    public static final Identity<DehubUserRecord, Integer> IDENTITY_DEHUB_USER = Identities0.IDENTITY_DEHUB_USER;
    public static final Identity<ElementRecord, Integer> IDENTITY_ELEMENT = Identities0.IDENTITY_ELEMENT;
    public static final Identity<GetDefinitionByUrnRecord, Integer> IDENTITY_GET_DEFINITION_BY_URN = Identities0.IDENTITY_GET_DEFINITION_BY_URN;
    public static final Identity<GetScopedIdentifierByUrnRecord, Integer> IDENTITY_GET_SCOPED_IDENTIFIER_BY_URN = Identities0.IDENTITY_GET_SCOPED_IDENTIFIER_BY_URN;
    public static final Identity<GetSlotByUrnRecord, Integer> IDENTITY_GET_SLOT_BY_URN = Identities0.IDENTITY_GET_SLOT_BY_URN;
    public static final Identity<GetValueDomainByUrnRecord, Integer> IDENTITY_GET_VALUE_DOMAIN_BY_URN = Identities0.IDENTITY_GET_VALUE_DOMAIN_BY_URN;
    public static final Identity<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> IDENTITY_GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN = Identities0.IDENTITY_GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN;
    public static final Identity<ImportRecord, Integer> IDENTITY_IMPORT = Identities0.IDENTITY_IMPORT;
    public static final Identity<ScopedIdentifierRecord, Integer> IDENTITY_SCOPED_IDENTIFIER = Identities0.IDENTITY_SCOPED_IDENTIFIER;
    public static final Identity<SlotRecord, Integer> IDENTITY_SLOT = Identities0.IDENTITY_SLOT;
    public static final Identity<SourceRecord, Integer> IDENTITY_SOURCE = Identities0.IDENTITY_SOURCE;
    public static final Identity<StagingRecord, Integer> IDENTITY_STAGING = Identities0.IDENTITY_STAGING;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ConceptElementAssociationsRecord> CONCEPT_ELEMENT_ASSOCIATIONS_PKEY = UniqueKeys0.CONCEPT_ELEMENT_ASSOCIATIONS_PKEY;
    public static final UniqueKey<ConceptsRecord> CONCEPTS_PKEY = UniqueKeys0.CONCEPTS_PKEY;
    public static final UniqueKey<ConceptsRecord> CONCEPTS_SOURCE_ID_SYSTEM_VERSION_TERM_TEXT_KEY = UniqueKeys0.CONCEPTS_SOURCE_ID_SYSTEM_VERSION_TERM_TEXT_KEY;
    public static final UniqueKey<ConfigRecord> CONFIG_PKEY = UniqueKeys0.CONFIG_PKEY;
    public static final UniqueKey<ConfigRecord> CONFIG_NAME_KEY = UniqueKeys0.CONFIG_NAME_KEY;
    public static final UniqueKey<DefinitionRecord> DEFINITION_PKEY = UniqueKeys0.DEFINITION_PKEY;
    public static final UniqueKey<DehubUserRecord> DEHUB_USER_PKEY = UniqueKeys0.DEHUB_USER_PKEY;
    public static final UniqueKey<DehubUserRecord> DEHUB_USER_AUTH_ID_KEY = UniqueKeys0.DEHUB_USER_AUTH_ID_KEY;
    public static final UniqueKey<ElementRecord> ELEMENT_PKEY = UniqueKeys0.ELEMENT_PKEY;
    public static final UniqueKey<ElementRelationRecord> ELEMENT_RELATION_PKEY = UniqueKeys0.ELEMENT_RELATION_PKEY;
    public static final UniqueKey<ImportRecord> IMPORT_PKEY = UniqueKeys0.IMPORT_PKEY;
    public static final UniqueKey<ScopedIdentifierRecord> SCOPED_IDENTIFIER_PKEY = UniqueKeys0.SCOPED_IDENTIFIER_PKEY;
    public static final UniqueKey<ScopedIdentifierRecord> UNIQUE_ELEMENT_TYPE_IDENTIFIER = UniqueKeys0.UNIQUE_ELEMENT_TYPE_IDENTIFIER;
    public static final UniqueKey<ScopedIdentifierHierarchyRecord> SCOPED_IDENTIFIER_HIERARCHY_PKEY = UniqueKeys0.SCOPED_IDENTIFIER_HIERARCHY_PKEY;
    public static final UniqueKey<SlotRecord> SLOT_PKEY = UniqueKeys0.SLOT_PKEY;
    public static final UniqueKey<SourceRecord> SOURCE_PKEY = UniqueKeys0.SOURCE_PKEY;
    public static final UniqueKey<SourceRecord> SOURCE_NAME_KEY = UniqueKeys0.SOURCE_NAME_KEY;
    public static final UniqueKey<SourceRecord> SOURCE_PREFIX_KEY = UniqueKeys0.SOURCE_PREFIX_KEY;
    public static final UniqueKey<SourceRecord> SOURCE_BASE_URL_KEY = UniqueKeys0.SOURCE_BASE_URL_KEY;
    public static final UniqueKey<StagingRecord> STAGING_PKEY = UniqueKeys0.STAGING_PKEY;
    public static final UniqueKey<UserNamespaceAccessRecord> USER_NAMESPACE_ACCESS_UNIQUE = UniqueKeys0.USER_NAMESPACE_ACCESS_UNIQUE;
    public static final UniqueKey<UserSourceCredentialsRecord> USER_SOURCE_CREDENTIALS_PKEY = UniqueKeys0.USER_SOURCE_CREDENTIALS_PKEY;
    public static final UniqueKey<UserSourceCredentialsRecord> CREDENTIALS_UNIQUE = UniqueKeys0.CREDENTIALS_UNIQUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ConceptElementAssociationsRecord, ConceptsRecord> CONCEPT_ELEMENT_ASSOCIATIONS__CONCEPT_ID_FKEY = ForeignKeys0.CONCEPT_ELEMENT_ASSOCIATIONS__CONCEPT_ID_FKEY;
    public static final ForeignKey<ConceptElementAssociationsRecord, ScopedIdentifierRecord> CONCEPT_ELEMENT_ASSOCIATIONS__SCOPEDIDENTIFIER_ID_FKEY = ForeignKeys0.CONCEPT_ELEMENT_ASSOCIATIONS__SCOPEDIDENTIFIER_ID_FKEY;
    public static final ForeignKey<ConceptsRecord, SourceRecord> CONCEPTS__SOURCE_ID_FKEY = ForeignKeys0.CONCEPTS__SOURCE_ID_FKEY;
    public static final ForeignKey<DefinitionRecord, ScopedIdentifierRecord> DEFINITION__DEFINITION_SCOPEDIDENTIFIER_ID_FKEY = ForeignKeys0.DEFINITION__DEFINITION_SCOPEDIDENTIFIER_ID_FKEY;
    public static final ForeignKey<DefinitionRecord, ElementRecord> DEFINITION__DEFINITION_ELEMENT_ID_FKEY = ForeignKeys0.DEFINITION__DEFINITION_ELEMENT_ID_FKEY;
    public static final ForeignKey<ElementRecord, DehubUserRecord> ELEMENT__ELEMENT_CREATED_BY_FKEY = ForeignKeys0.ELEMENT__ELEMENT_CREATED_BY_FKEY;
    public static final ForeignKey<ElementRecord, ElementRecord> ELEMENT__ELEMENT_ELEMENT_ID_FKEY = ForeignKeys0.ELEMENT__ELEMENT_ELEMENT_ID_FKEY;
    public static final ForeignKey<ElementRecord, ScopedIdentifierRecord> ELEMENT__ELEMENT_SCOPED_IDENTIFIER_ID_FKEY = ForeignKeys0.ELEMENT__ELEMENT_SCOPED_IDENTIFIER_ID_FKEY;
    public static final ForeignKey<ElementRelationRecord, SourceRecord> ELEMENT_RELATION__LEFT_SOURCE_ID_FKEY = ForeignKeys0.ELEMENT_RELATION__LEFT_SOURCE_ID_FKEY;
    public static final ForeignKey<ElementRelationRecord, SourceRecord> ELEMENT_RELATION__RIGHT_SOURCE_ID_FKEY = ForeignKeys0.ELEMENT_RELATION__RIGHT_SOURCE_ID_FKEY;
    public static final ForeignKey<PermissibleCodeRecord, ScopedIdentifierRecord> PERMISSIBLE_CODE__PERMISSIBLE_CODE_CODE_SCOPED_IDENTIFIER_ID_FKEY = ForeignKeys0.PERMISSIBLE_CODE__PERMISSIBLE_CODE_CODE_SCOPED_IDENTIFIER_ID_FKEY;
    public static final ForeignKey<PermissibleCodeRecord, ElementRecord> PERMISSIBLE_CODE__PERMISSIBLE_CODE_CATALOG_ID_FKEY = ForeignKeys0.PERMISSIBLE_CODE__PERMISSIBLE_CODE_CATALOG_ID_FKEY;
    public static final ForeignKey<ScopedIdentifierRecord, DehubUserRecord> SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_CREATED_BY_FKEY = ForeignKeys0.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_CREATED_BY_FKEY;
    public static final ForeignKey<ScopedIdentifierRecord, ElementRecord> SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_ELEMENT_ID_FKEY = ForeignKeys0.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_ELEMENT_ID_FKEY;
    public static final ForeignKey<ScopedIdentifierRecord, ElementRecord> SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_NAMESPACE_ID2_FKEY = ForeignKeys0.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_NAMESPACE_ID2_FKEY;
    public static final ForeignKey<ScopedIdentifierHierarchyRecord, ScopedIdentifierRecord> SCOPED_IDENTIFIER_HIERARCHY__SCOPED_IDENTIFIER_HIERARCHY_SUPER_ID_FKEY = ForeignKeys0.SCOPED_IDENTIFIER_HIERARCHY__SCOPED_IDENTIFIER_HIERARCHY_SUPER_ID_FKEY;
    public static final ForeignKey<ScopedIdentifierHierarchyRecord, ScopedIdentifierRecord> SCOPED_IDENTIFIER_HIERARCHY__SCOPED_IDENTIFIER_HIERARCHY_SUB_ID_FKEY = ForeignKeys0.SCOPED_IDENTIFIER_HIERARCHY__SCOPED_IDENTIFIER_HIERARCHY_SUB_ID_FKEY;
    public static final ForeignKey<SlotRecord, ScopedIdentifierRecord> SLOT__SLOT_SCOPED_IDENTIFIER_ID_FKEY = ForeignKeys0.SLOT__SLOT_SCOPED_IDENTIFIER_ID_FKEY;
    public static final ForeignKey<StagingRecord, ImportRecord> STAGING__STAGING_IMPORT_FKEY = ForeignKeys0.STAGING__STAGING_IMPORT_FKEY;
    public static final ForeignKey<StagingRecord, ElementRecord> STAGING__STAGING_ELEMENT_FKEY = ForeignKeys0.STAGING__STAGING_ELEMENT_FKEY;
    public static final ForeignKey<UserNamespaceAccessRecord, DehubUserRecord> USER_NAMESPACE_ACCESS__USER_NAMESPACE_ACCESS_USER_FKEY = ForeignKeys0.USER_NAMESPACE_ACCESS__USER_NAMESPACE_ACCESS_USER_FKEY;
    public static final ForeignKey<UserNamespaceAccessRecord, ElementRecord> USER_NAMESPACE_ACCESS__USER_NAMESPACE_ACCESS_NAMESPACE_FKEY = ForeignKeys0.USER_NAMESPACE_ACCESS__USER_NAMESPACE_ACCESS_NAMESPACE_FKEY;
    public static final ForeignKey<UserNamespaceGrantsRecord, DehubUserRecord> USER_NAMESPACE_GRANTS__USER_NAMESPACE_GRANTS_USER_FKEY = ForeignKeys0.USER_NAMESPACE_GRANTS__USER_NAMESPACE_GRANTS_USER_FKEY;
    public static final ForeignKey<UserNamespaceGrantsRecord, ElementRecord> USER_NAMESPACE_GRANTS__USER_NAMESPACE_GRANTS_NAMESPACE_FKEY = ForeignKeys0.USER_NAMESPACE_GRANTS__USER_NAMESPACE_GRANTS_NAMESPACE_FKEY;
    public static final ForeignKey<UserSourceCredentialsRecord, DehubUserRecord> USER_SOURCE_CREDENTIALS__USER_ID_FKEY = ForeignKeys0.USER_SOURCE_CREDENTIALS__USER_ID_FKEY;
    public static final ForeignKey<UserSourceCredentialsRecord, SourceRecord> USER_SOURCE_CREDENTIALS__SOURCE_ID_FKEY = ForeignKeys0.USER_SOURCE_CREDENTIALS__SOURCE_ID_FKEY;
    public static final ForeignKey<ValueDomainPermissibleValueRecord, ScopedIdentifierRecord> VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_VALUE_DOMAIN_SCOPED_IDENTIFI_FKEY = ForeignKeys0.VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_VALUE_DOMAIN_SCOPED_IDENTIFI_FKEY;
    public static final ForeignKey<ValueDomainPermissibleValueRecord, ScopedIdentifierRecord> VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_PERMISSIBLE_VALUE_SCOPED_IDE_FKEY = ForeignKeys0.VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_PERMISSIBLE_VALUE_SCOPED_IDE_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ConceptsRecord, Integer> IDENTITY_CONCEPTS = Internal.createIdentity(Concepts.CONCEPTS, Concepts.CONCEPTS.ID);
        public static Identity<ConfigRecord, Integer> IDENTITY_CONFIG = Internal.createIdentity(Config.CONFIG, Config.CONFIG.ID);
        public static Identity<DefinitionRecord, Integer> IDENTITY_DEFINITION = Internal.createIdentity(Definition.DEFINITION, Definition.DEFINITION.ID);
        public static Identity<DehubUserRecord, Integer> IDENTITY_DEHUB_USER = Internal.createIdentity(DehubUser.DEHUB_USER, DehubUser.DEHUB_USER.ID);
        public static Identity<ElementRecord, Integer> IDENTITY_ELEMENT = Internal.createIdentity(Element.ELEMENT, Element.ELEMENT.ID);
        public static Identity<GetDefinitionByUrnRecord, Integer> IDENTITY_GET_DEFINITION_BY_URN = Internal.createIdentity(GetDefinitionByUrn.GET_DEFINITION_BY_URN, GetDefinitionByUrn.GET_DEFINITION_BY_URN.ID);
        public static Identity<GetScopedIdentifierByUrnRecord, Integer> IDENTITY_GET_SCOPED_IDENTIFIER_BY_URN = Internal.createIdentity(GetScopedIdentifierByUrn.GET_SCOPED_IDENTIFIER_BY_URN, GetScopedIdentifierByUrn.GET_SCOPED_IDENTIFIER_BY_URN.ID);
        public static Identity<GetSlotByUrnRecord, Integer> IDENTITY_GET_SLOT_BY_URN = Internal.createIdentity(GetSlotByUrn.GET_SLOT_BY_URN, GetSlotByUrn.GET_SLOT_BY_URN.ID);
        public static Identity<GetValueDomainByUrnRecord, Integer> IDENTITY_GET_VALUE_DOMAIN_BY_URN = Internal.createIdentity(GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN, GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN.ID);
        public static Identity<GetValueDomainScopedIdentifierByDataelementUrnRecord, Integer> IDENTITY_GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN = Internal.createIdentity(GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN, GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.ID);
        public static Identity<ImportRecord, Integer> IDENTITY_IMPORT = Internal.createIdentity(Import.IMPORT, Import.IMPORT.ID);
        public static Identity<ScopedIdentifierRecord, Integer> IDENTITY_SCOPED_IDENTIFIER = Internal.createIdentity(ScopedIdentifier.SCOPED_IDENTIFIER, ScopedIdentifier.SCOPED_IDENTIFIER.ID);
        public static Identity<SlotRecord, Integer> IDENTITY_SLOT = Internal.createIdentity(Slot.SLOT, Slot.SLOT.ID);
        public static Identity<SourceRecord, Integer> IDENTITY_SOURCE = Internal.createIdentity(Source.SOURCE, Source.SOURCE.ID);
        public static Identity<StagingRecord, Integer> IDENTITY_STAGING = Internal.createIdentity(Staging.STAGING, Staging.STAGING.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ConceptElementAssociationsRecord> CONCEPT_ELEMENT_ASSOCIATIONS_PKEY = Internal.createUniqueKey(ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS, "concept_element_associations_pkey", new TableField[] { ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.CONCEPT_ID, ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.SCOPEDIDENTIFIER_ID }, true);
        public static final UniqueKey<ConceptsRecord> CONCEPTS_PKEY = Internal.createUniqueKey(Concepts.CONCEPTS, "concepts_pkey", new TableField[] { Concepts.CONCEPTS.ID }, true);
        public static final UniqueKey<ConceptsRecord> CONCEPTS_SOURCE_ID_SYSTEM_VERSION_TERM_TEXT_KEY = Internal.createUniqueKey(Concepts.CONCEPTS, "concepts_source_id_system_version_term_text_key", new TableField[] { Concepts.CONCEPTS.SOURCE_ID, Concepts.CONCEPTS.SYSTEM, Concepts.CONCEPTS.VERSION, Concepts.CONCEPTS.TERM, Concepts.CONCEPTS.TEXT }, true);
        public static final UniqueKey<ConfigRecord> CONFIG_PKEY = Internal.createUniqueKey(Config.CONFIG, "config_pkey", new TableField[] { Config.CONFIG.ID }, true);
        public static final UniqueKey<ConfigRecord> CONFIG_NAME_KEY = Internal.createUniqueKey(Config.CONFIG, "config_name_key", new TableField[] { Config.CONFIG.NAME }, true);
        public static final UniqueKey<DefinitionRecord> DEFINITION_PKEY = Internal.createUniqueKey(Definition.DEFINITION, "definition_pkey", new TableField[] { Definition.DEFINITION.ID }, true);
        public static final UniqueKey<DehubUserRecord> DEHUB_USER_PKEY = Internal.createUniqueKey(DehubUser.DEHUB_USER, "dehub_user_pkey", new TableField[] { DehubUser.DEHUB_USER.ID }, true);
        public static final UniqueKey<DehubUserRecord> DEHUB_USER_AUTH_ID_KEY = Internal.createUniqueKey(DehubUser.DEHUB_USER, "dehub_user_auth_id_key", new TableField[] { DehubUser.DEHUB_USER.AUTH_ID }, true);
        public static final UniqueKey<ElementRecord> ELEMENT_PKEY = Internal.createUniqueKey(Element.ELEMENT, "element_pkey", new TableField[] { Element.ELEMENT.ID }, true);
        public static final UniqueKey<ElementRelationRecord> ELEMENT_RELATION_PKEY = Internal.createUniqueKey(ElementRelation.ELEMENT_RELATION, "element_relation_pkey", new TableField[] { ElementRelation.ELEMENT_RELATION.LEFT_URN, ElementRelation.ELEMENT_RELATION.LEFT_SOURCE, ElementRelation.ELEMENT_RELATION.RIGHT_URN, ElementRelation.ELEMENT_RELATION.RIGHT_SOURCE }, true);
        public static final UniqueKey<ImportRecord> IMPORT_PKEY = Internal.createUniqueKey(Import.IMPORT, "import_pkey", new TableField[] { Import.IMPORT.ID }, true);
        public static final UniqueKey<ScopedIdentifierRecord> SCOPED_IDENTIFIER_PKEY = Internal.createUniqueKey(ScopedIdentifier.SCOPED_IDENTIFIER, "scoped_identifier_pkey", new TableField[] { ScopedIdentifier.SCOPED_IDENTIFIER.ID }, true);
        public static final UniqueKey<ScopedIdentifierRecord> UNIQUE_ELEMENT_TYPE_IDENTIFIER = Internal.createUniqueKey(ScopedIdentifier.SCOPED_IDENTIFIER, "unique_element_type_identifier", new TableField[] { ScopedIdentifier.SCOPED_IDENTIFIER.ELEMENT_TYPE, ScopedIdentifier.SCOPED_IDENTIFIER.IDENTIFIER, ScopedIdentifier.SCOPED_IDENTIFIER.VERSION, ScopedIdentifier.SCOPED_IDENTIFIER.NAMESPACE_ID }, true);
        public static final UniqueKey<ScopedIdentifierHierarchyRecord> SCOPED_IDENTIFIER_HIERARCHY_PKEY = Internal.createUniqueKey(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY, "scoped_identifier_hierarchy_pkey", new TableField[] { ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUPER_ID, ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUB_ID }, true);
        public static final UniqueKey<SlotRecord> SLOT_PKEY = Internal.createUniqueKey(Slot.SLOT, "slot_pkey", new TableField[] { Slot.SLOT.ID }, true);
        public static final UniqueKey<SourceRecord> SOURCE_PKEY = Internal.createUniqueKey(Source.SOURCE, "source_pkey", new TableField[] { Source.SOURCE.ID }, true);
        public static final UniqueKey<SourceRecord> SOURCE_NAME_KEY = Internal.createUniqueKey(Source.SOURCE, "source_name_key", new TableField[] { Source.SOURCE.NAME }, true);
        public static final UniqueKey<SourceRecord> SOURCE_PREFIX_KEY = Internal.createUniqueKey(Source.SOURCE, "source_prefix_key", new TableField[] { Source.SOURCE.PREFIX }, true);
        public static final UniqueKey<SourceRecord> SOURCE_BASE_URL_KEY = Internal.createUniqueKey(Source.SOURCE, "source_base_url_key", new TableField[] { Source.SOURCE.BASE_URL }, true);
        public static final UniqueKey<StagingRecord> STAGING_PKEY = Internal.createUniqueKey(Staging.STAGING, "staging_pkey", new TableField[] { Staging.STAGING.ID }, true);
        public static final UniqueKey<UserNamespaceAccessRecord> USER_NAMESPACE_ACCESS_UNIQUE = Internal.createUniqueKey(UserNamespaceAccess.USER_NAMESPACE_ACCESS, "user_namespace_access_unique", new TableField[] { UserNamespaceAccess.USER_NAMESPACE_ACCESS.USER_ID, UserNamespaceAccess.USER_NAMESPACE_ACCESS.NAMESPACE_ID }, true);
        public static final UniqueKey<UserSourceCredentialsRecord> USER_SOURCE_CREDENTIALS_PKEY = Internal.createUniqueKey(UserSourceCredentials.USER_SOURCE_CREDENTIALS, "user_source_credentials_pkey", new TableField[] { UserSourceCredentials.USER_SOURCE_CREDENTIALS.USER_ID, UserSourceCredentials.USER_SOURCE_CREDENTIALS.SOURCE_ID }, true);
        public static final UniqueKey<UserSourceCredentialsRecord> CREDENTIALS_UNIQUE = Internal.createUniqueKey(UserSourceCredentials.USER_SOURCE_CREDENTIALS, "credentials_unique", new TableField[] { UserSourceCredentials.USER_SOURCE_CREDENTIALS.USER_ID, UserSourceCredentials.USER_SOURCE_CREDENTIALS.CREDENTIAL, UserSourceCredentials.USER_SOURCE_CREDENTIALS.SOURCE_ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<ConceptElementAssociationsRecord, ConceptsRecord> CONCEPT_ELEMENT_ASSOCIATIONS__CONCEPT_ID_FKEY = Internal.createForeignKey(Keys.CONCEPTS_PKEY, ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS, "concept_id_fkey", new TableField[] { ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.CONCEPT_ID }, true);
        public static final ForeignKey<ConceptElementAssociationsRecord, ScopedIdentifierRecord> CONCEPT_ELEMENT_ASSOCIATIONS__SCOPEDIDENTIFIER_ID_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS, "scopedidentifier_id_fkey", new TableField[] { ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS.SCOPEDIDENTIFIER_ID }, true);
        public static final ForeignKey<ConceptsRecord, SourceRecord> CONCEPTS__SOURCE_ID_FKEY = Internal.createForeignKey(Keys.SOURCE_PKEY, Concepts.CONCEPTS, "source_id_fkey", new TableField[] { Concepts.CONCEPTS.SOURCE_ID }, true);
        public static final ForeignKey<DefinitionRecord, ScopedIdentifierRecord> DEFINITION__DEFINITION_SCOPEDIDENTIFIER_ID_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, Definition.DEFINITION, "definition_scopedidentifier_id_fkey", new TableField[] { Definition.DEFINITION.SCOPED_IDENTIFIER_ID }, true);
        public static final ForeignKey<DefinitionRecord, ElementRecord> DEFINITION__DEFINITION_ELEMENT_ID_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, Definition.DEFINITION, "definition_element_id_fkey", new TableField[] { Definition.DEFINITION.ELEMENT_ID }, true);
        public static final ForeignKey<ElementRecord, DehubUserRecord> ELEMENT__ELEMENT_CREATED_BY_FKEY = Internal.createForeignKey(Keys.DEHUB_USER_PKEY, Element.ELEMENT, "element_created_by_fkey", new TableField[] { Element.ELEMENT.CREATED_BY }, true);
        public static final ForeignKey<ElementRecord, ElementRecord> ELEMENT__ELEMENT_ELEMENT_ID_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, Element.ELEMENT, "element_element_id_fkey", new TableField[] { Element.ELEMENT.ELEMENT_ID }, true);
        public static final ForeignKey<ElementRecord, ScopedIdentifierRecord> ELEMENT__ELEMENT_SCOPED_IDENTIFIER_ID_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, Element.ELEMENT, "element_scoped_identifier_id_fkey", new TableField[] { Element.ELEMENT.SCOPED_IDENTIFIER_ID }, true);
        public static final ForeignKey<ElementRelationRecord, SourceRecord> ELEMENT_RELATION__LEFT_SOURCE_ID_FKEY = Internal.createForeignKey(Keys.SOURCE_PKEY, ElementRelation.ELEMENT_RELATION, "left_source_id_fkey", new TableField[] { ElementRelation.ELEMENT_RELATION.LEFT_SOURCE }, true);
        public static final ForeignKey<ElementRelationRecord, SourceRecord> ELEMENT_RELATION__RIGHT_SOURCE_ID_FKEY = Internal.createForeignKey(Keys.SOURCE_PKEY, ElementRelation.ELEMENT_RELATION, "right_source_id_fkey", new TableField[] { ElementRelation.ELEMENT_RELATION.RIGHT_SOURCE }, true);
        public static final ForeignKey<PermissibleCodeRecord, ScopedIdentifierRecord> PERMISSIBLE_CODE__PERMISSIBLE_CODE_CODE_SCOPED_IDENTIFIER_ID_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, PermissibleCode.PERMISSIBLE_CODE, "permissible_code_code_scoped_identifier_id_fkey", new TableField[] { PermissibleCode.PERMISSIBLE_CODE.CODE_SCOPED_IDENTIFIER_ID }, true);
        public static final ForeignKey<PermissibleCodeRecord, ElementRecord> PERMISSIBLE_CODE__PERMISSIBLE_CODE_CATALOG_ID_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, PermissibleCode.PERMISSIBLE_CODE, "permissible_code_catalog_id_fkey", new TableField[] { PermissibleCode.PERMISSIBLE_CODE.CATALOG_VALUE_DOMAIN_ID }, true);
        public static final ForeignKey<ScopedIdentifierRecord, DehubUserRecord> SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_CREATED_BY_FKEY = Internal.createForeignKey(Keys.DEHUB_USER_PKEY, ScopedIdentifier.SCOPED_IDENTIFIER, "scoped_identifier_created_by_fkey", new TableField[] { ScopedIdentifier.SCOPED_IDENTIFIER.CREATED_BY }, true);
        public static final ForeignKey<ScopedIdentifierRecord, ElementRecord> SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_ELEMENT_ID_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, ScopedIdentifier.SCOPED_IDENTIFIER, "scoped_identifier_element_id_fkey", new TableField[] { ScopedIdentifier.SCOPED_IDENTIFIER.ELEMENT_ID }, true);
        public static final ForeignKey<ScopedIdentifierRecord, ElementRecord> SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_NAMESPACE_ID2_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, ScopedIdentifier.SCOPED_IDENTIFIER, "scoped_identifier_namespace_id2_fkey", new TableField[] { ScopedIdentifier.SCOPED_IDENTIFIER.NAMESPACE_ID }, true);
        public static final ForeignKey<ScopedIdentifierHierarchyRecord, ScopedIdentifierRecord> SCOPED_IDENTIFIER_HIERARCHY__SCOPED_IDENTIFIER_HIERARCHY_SUPER_ID_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY, "scoped_identifier_hierarchy_super_id_fkey", new TableField[] { ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUPER_ID }, true);
        public static final ForeignKey<ScopedIdentifierHierarchyRecord, ScopedIdentifierRecord> SCOPED_IDENTIFIER_HIERARCHY__SCOPED_IDENTIFIER_HIERARCHY_SUB_ID_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY, "scoped_identifier_hierarchy_sub_id_fkey", new TableField[] { ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUB_ID }, true);
        public static final ForeignKey<SlotRecord, ScopedIdentifierRecord> SLOT__SLOT_SCOPED_IDENTIFIER_ID_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, Slot.SLOT, "slot_scoped_identifier_id_fkey", new TableField[] { Slot.SLOT.SCOPED_IDENTIFIER_ID }, true);
        public static final ForeignKey<StagingRecord, ImportRecord> STAGING__STAGING_IMPORT_FKEY = Internal.createForeignKey(Keys.IMPORT_PKEY, Staging.STAGING, "staging_import_fkey", new TableField[] { Staging.STAGING.IMPORT_ID }, true);
        public static final ForeignKey<UserNamespaceGrantsRecord, DehubUserRecord> USER_NAMESPACE_GRANTS__USER_NAMESPACE_GRANTS_USER_FKEY = Internal.createForeignKey(Keys.DEHUB_USER_PKEY, UserNamespaceGrants.USER_NAMESPACE_GRANTS, "user_namespace_grants_user_fkey", new TableField[] { UserNamespaceGrants.USER_NAMESPACE_GRANTS.USER_ID }, true);
        public static final ForeignKey<UserNamespaceGrantsRecord, ElementRecord> USER_NAMESPACE_GRANTS__USER_NAMESPACE_GRANTS_NAMESPACE_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, UserNamespaceGrants.USER_NAMESPACE_GRANTS, "user_namespace_grants_namespace_fkey", new TableField[] { UserNamespaceGrants.USER_NAMESPACE_GRANTS.NAMESPACE_ID }, true);
        public static final ForeignKey<StagingRecord, ElementRecord> STAGING__STAGING_ELEMENT_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, Staging.STAGING, "staging_element_fkey", new TableField[] { Staging.STAGING.ELEMENT_ID }, true);
        public static final ForeignKey<UserNamespaceAccessRecord, DehubUserRecord> USER_NAMESPACE_ACCESS__USER_NAMESPACE_ACCESS_USER_FKEY = Internal.createForeignKey(Keys.DEHUB_USER_PKEY, UserNamespaceAccess.USER_NAMESPACE_ACCESS, "user_namespace_access_user_fkey", new TableField[] { UserNamespaceAccess.USER_NAMESPACE_ACCESS.USER_ID }, true);
        public static final ForeignKey<UserNamespaceAccessRecord, ElementRecord> USER_NAMESPACE_ACCESS__USER_NAMESPACE_ACCESS_NAMESPACE_FKEY = Internal.createForeignKey(Keys.ELEMENT_PKEY, UserNamespaceAccess.USER_NAMESPACE_ACCESS, "user_namespace_access_namespace_fkey", new TableField[] { UserNamespaceAccess.USER_NAMESPACE_ACCESS.NAMESPACE_ID }, true);
        public static final ForeignKey<UserSourceCredentialsRecord, DehubUserRecord> USER_SOURCE_CREDENTIALS__USER_ID_FKEY = Internal.createForeignKey(Keys.DEHUB_USER_PKEY, UserSourceCredentials.USER_SOURCE_CREDENTIALS, "user_id_fkey", new TableField[] { UserSourceCredentials.USER_SOURCE_CREDENTIALS.USER_ID }, true);
        public static final ForeignKey<UserSourceCredentialsRecord, SourceRecord> USER_SOURCE_CREDENTIALS__SOURCE_ID_FKEY = Internal.createForeignKey(Keys.SOURCE_PKEY, UserSourceCredentials.USER_SOURCE_CREDENTIALS, "source_id_fkey", new TableField[] { UserSourceCredentials.USER_SOURCE_CREDENTIALS.SOURCE_ID }, true);
        public static final ForeignKey<ValueDomainPermissibleValueRecord, ScopedIdentifierRecord> VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_VALUE_DOMAIN_SCOPED_IDENTIFI_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, ValueDomainPermissibleValue.VALUE_DOMAIN_PERMISSIBLE_VALUE, "value_domain_permissible_valu_value_domain_scoped_identifi_fkey", new TableField[] { ValueDomainPermissibleValue.VALUE_DOMAIN_PERMISSIBLE_VALUE.VALUE_DOMAIN_SCOPED_IDENTIFIER_ID }, true);
        public static final ForeignKey<ValueDomainPermissibleValueRecord, ScopedIdentifierRecord> VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_PERMISSIBLE_VALUE_SCOPED_IDE_FKEY = Internal.createForeignKey(Keys.SCOPED_IDENTIFIER_PKEY, ValueDomainPermissibleValue.VALUE_DOMAIN_PERMISSIBLE_VALUE, "value_domain_permissible_valu_permissible_value_scoped_ide_fkey", new TableField[] { ValueDomainPermissibleValue.VALUE_DOMAIN_PERMISSIBLE_VALUE.PERMISSIBLE_VALUE_SCOPED_IDENTIFIER_ID }, true);
    }
}
