/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq;


import de.dataelementhub.dal.jooq.tables.Definition;
import de.dataelementhub.dal.jooq.tables.Element;
import de.dataelementhub.dal.jooq.tables.Hierarchy;
import de.dataelementhub.dal.jooq.tables.PermissibleCode;
import de.dataelementhub.dal.jooq.tables.ScopedIdentifier;
import de.dataelementhub.dal.jooq.tables.ScopedIdentifierHierarchy;
import de.dataelementhub.dal.jooq.tables.Slot;
import de.dataelementhub.dal.jooq.tables.UserNamespaceAccess;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index DEFINITION_ELEMENT_ID_IDX = Internal.createIndex(DSL.name("definition_element_id_idx"), Definition.DEFINITION, new OrderField[] { Definition.DEFINITION.ELEMENT_ID }, false);
    public static final Index DEFINITION_SCOPED_IDENTIFIER_ID_IDX = Internal.createIndex(DSL.name("definition_scoped_identifier_id_idx"), Definition.DEFINITION, new OrderField[] { Definition.DEFINITION.SCOPED_IDENTIFIER_ID }, false);
    public static final Index ELEMENT_CREATED_BY_IDX = Internal.createIndex(DSL.name("element_created_by_idx"), Element.ELEMENT, new OrderField[] { Element.ELEMENT.CREATED_BY }, false);
    public static final Index ELEMENT_ELEMENT_ID_IDX = Internal.createIndex(DSL.name("element_element_id_idx"), Element.ELEMENT, new OrderField[] { Element.ELEMENT.ELEMENT_ID }, false);
    public static final Index ELEMENT_ELEMENT_TYPE_IDX = Internal.createIndex(DSL.name("element_element_type_idx"), Element.ELEMENT, new OrderField[] { Element.ELEMENT.ELEMENT_TYPE }, false);
    public static final Index ELEMENT_ID_ELEMENT_TYPE_IDX = Internal.createIndex(DSL.name("element_id_element_type_idx"), Element.ELEMENT, new OrderField[] { Element.ELEMENT.ID, Element.ELEMENT.ELEMENT_TYPE }, false);
    public static final Index HIERARCHY_ROOT_IDX = Internal.createIndex(DSL.name("hierarchy_root_idx"), Hierarchy.HIERARCHY, new OrderField[] { Hierarchy.HIERARCHY.ROOT }, false);
    public static final Index HIERARCHY_SUB_IDX = Internal.createIndex(DSL.name("hierarchy_sub_idx"), Hierarchy.HIERARCHY, new OrderField[] { Hierarchy.HIERARCHY.SUB }, false);
    public static final Index HIERARCHY_SUPER_IDX = Internal.createIndex(DSL.name("hierarchy_super_idx"), Hierarchy.HIERARCHY, new OrderField[] { Hierarchy.HIERARCHY.SUPER }, false);
    public static final Index HIERARCHY_SUPER_SUB_IDX = Internal.createIndex(DSL.name("hierarchy_super_sub_idx"), Hierarchy.HIERARCHY, new OrderField[] { Hierarchy.HIERARCHY.SUPER, Hierarchy.HIERARCHY.SUB }, false);
    public static final Index PERMISSIBLE_CODE_CATALOG_ID_IDX = Internal.createIndex(DSL.name("permissible_code_catalog_id_idx"), PermissibleCode.PERMISSIBLE_CODE, new OrderField[] { PermissibleCode.PERMISSIBLE_CODE.CATALOG_VALUE_DOMAIN_ID }, false);
    public static final Index PERMISSIBLE_CODE_CODE_SCOPED_IDENTIFIER_ID_IDX = Internal.createIndex(DSL.name("permissible_code_code_scoped_identifier_id_idx"), PermissibleCode.PERMISSIBLE_CODE, new OrderField[] { PermissibleCode.PERMISSIBLE_CODE.CODE_SCOPED_IDENTIFIER_ID }, false);
    public static final Index SCOPED_IDENTIFIER_CREATED_BY_IDX = Internal.createIndex(DSL.name("scoped_identifier_created_by_idx"), ScopedIdentifier.SCOPED_IDENTIFIER, new OrderField[] { ScopedIdentifier.SCOPED_IDENTIFIER.CREATED_BY }, false);
    public static final Index SCOPED_IDENTIFIER_ELEMENT_ID_IDX = Internal.createIndex(DSL.name("scoped_identifier_element_id_idx"), ScopedIdentifier.SCOPED_IDENTIFIER, new OrderField[] { ScopedIdentifier.SCOPED_IDENTIFIER.ELEMENT_ID }, false);
    public static final Index SCOPED_IDENTIFIER_HIERARCHY_SUB_ID_IDX = Internal.createIndex(DSL.name("scoped_identifier_hierarchy_sub_id_idx"), ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY, new OrderField[] { ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUB_ID }, false);
    public static final Index SCOPED_IDENTIFIER_HIERARCHY_SUPER_ID_IDX = Internal.createIndex(DSL.name("scoped_identifier_hierarchy_super_id_idx"), ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY, new OrderField[] { ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUPER_ID }, false);
    public static final Index SCOPED_IDENTIFIER_IDENTIFIER_IDX = Internal.createIndex(DSL.name("scoped_identifier_identifier_idx"), ScopedIdentifier.SCOPED_IDENTIFIER, new OrderField[] { ScopedIdentifier.SCOPED_IDENTIFIER.IDENTIFIER }, false);
    public static final Index SCOPED_IDENTIFIER_NAMESPACE_ID_IDX = Internal.createIndex(DSL.name("scoped_identifier_namespace_id_idx"), ScopedIdentifier.SCOPED_IDENTIFIER, new OrderField[] { ScopedIdentifier.SCOPED_IDENTIFIER.NAMESPACE_ID }, false);
    public static final Index SCOPED_IDENTIFIER_STATUS_IDX = Internal.createIndex(DSL.name("scoped_identifier_status_idx"), ScopedIdentifier.SCOPED_IDENTIFIER, new OrderField[] { ScopedIdentifier.SCOPED_IDENTIFIER.STATUS }, false);
    public static final Index SCOPED_IDENTIFIER_UUID_IDX = Internal.createIndex(DSL.name("scoped_identifier_uuid_idx"), ScopedIdentifier.SCOPED_IDENTIFIER, new OrderField[] { ScopedIdentifier.SCOPED_IDENTIFIER.UUID }, false);
    public static final Index SCOPED_IDENTIFIER_VERSION_IDX = Internal.createIndex(DSL.name("scoped_identifier_version_idx"), ScopedIdentifier.SCOPED_IDENTIFIER, new OrderField[] { ScopedIdentifier.SCOPED_IDENTIFIER.VERSION }, false);
    public static final Index SLOT_SCOPED_IDENTIFIER_ID_IDX = Internal.createIndex(DSL.name("slot_scoped_identifier_id_idx"), Slot.SLOT, new OrderField[] { Slot.SLOT.SCOPED_IDENTIFIER_ID }, false);
    public static final Index USER_NAMESPACE_ACCESS_NAMESPACE_ID_IDX = Internal.createIndex(DSL.name("user_namespace_access_namespace_id_idx"), UserNamespaceAccess.USER_NAMESPACE_ACCESS, new OrderField[] { UserNamespaceAccess.USER_NAMESPACE_ACCESS.NAMESPACE_ID }, false);
    public static final Index USER_NAMESPACE_ACCESS_USER_ID_IDX = Internal.createIndex(DSL.name("user_namespace_access_user_id_idx"), UserNamespaceAccess.USER_NAMESPACE_ACCESS, new OrderField[] { UserNamespaceAccess.USER_NAMESPACE_ACCESS.USER_ID }, false);
}
