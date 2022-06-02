/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Indexes;
import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.tables.records.ScopedIdentifierRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScopedIdentifier extends TableImpl<ScopedIdentifierRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.scoped_identifier</code>
     */
    public static final ScopedIdentifier SCOPED_IDENTIFIER = new ScopedIdentifier();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScopedIdentifierRecord> getRecordType() {
        return ScopedIdentifierRecord.class;
    }

    /**
     * The column <code>public.scoped_identifier.id</code>.
     */
    public final TableField<ScopedIdentifierRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.scoped_identifier.revision</code>.
     */
    public final TableField<ScopedIdentifierRecord, Integer> REVISION = createField(DSL.name("revision"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.scoped_identifier.identifier</code>.
     */
    public final TableField<ScopedIdentifierRecord, Integer> IDENTIFIER = createField(DSL.name("identifier"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.scoped_identifier.created_by</code>.
     */
    public final TableField<ScopedIdentifierRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.scoped_identifier.status</code>.
     */
    public final TableField<ScopedIdentifierRecord, Status> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.Status.class), this, "");

    /**
     * The column <code>public.scoped_identifier.element_id</code>.
     */
    public final TableField<ScopedIdentifierRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.scoped_identifier.namespace_id</code>.
     */
    public final TableField<ScopedIdentifierRecord, Integer> NAMESPACE_ID = createField(DSL.name("namespace_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.scoped_identifier.hidden</code>.
     */
    public final TableField<ScopedIdentifierRecord, Boolean> HIDDEN = createField(DSL.name("hidden"), SQLDataType.BOOLEAN, this, "");

    private ScopedIdentifier(Name alias, Table<ScopedIdentifierRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScopedIdentifier(Name alias, Table<ScopedIdentifierRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.scoped_identifier</code> table reference
     */
    public ScopedIdentifier(String alias) {
        this(DSL.name(alias), SCOPED_IDENTIFIER);
    }

    /**
     * Create an aliased <code>public.scoped_identifier</code> table reference
     */
    public ScopedIdentifier(Name alias) {
        this(alias, SCOPED_IDENTIFIER);
    }

    /**
     * Create a <code>public.scoped_identifier</code> table reference
     */
    public ScopedIdentifier() {
        this(DSL.name("scoped_identifier"), null);
    }

    public <O extends Record> ScopedIdentifier(Table<O> child, ForeignKey<O, ScopedIdentifierRecord> key) {
        super(child, key, SCOPED_IDENTIFIER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.SCOPED_IDENTIFIER_CREATED_BY_IDX, Indexes.SCOPED_IDENTIFIER_ELEMENT_ID_IDX, Indexes.SCOPED_IDENTIFIER_IDENTIFIER_IDX, Indexes.SCOPED_IDENTIFIER_NAMESPACE_ID_IDX, Indexes.SCOPED_IDENTIFIER_STATUS_IDX, Indexes.SCOPED_IDENTIFIER_VERSION_IDX);
    }

    @Override
    public Identity<ScopedIdentifierRecord, Integer> getIdentity() {
        return (Identity<ScopedIdentifierRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ScopedIdentifierRecord> getPrimaryKey() {
        return Keys.SCOPED_IDENTIFIER_PKEY;
    }

    @Override
    public List<ForeignKey<ScopedIdentifierRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_CREATED_BY_FKEY, Keys.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_ELEMENT_ID_FKEY, Keys.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_NAMESPACE_ID2_FKEY);
    }

    private transient DehubUser _dehubUser;
    private transient Element _scopedIdentifierElementIdFkey;
    private transient Element _scopedIdentifierNamespaceId2Fkey;

    /**
     * Get the implicit join path to the <code>public.dehub_user</code> table.
     */
    public DehubUser dehubUser() {
        if (_dehubUser == null)
            _dehubUser = new DehubUser(this, Keys.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_CREATED_BY_FKEY);

        return _dehubUser;
    }

    /**
     * Get the implicit join path to the <code>public.element</code> table, via
     * the <code>scoped_identifier_element_id_fkey</code> key.
     */
    public Element scopedIdentifierElementIdFkey() {
        if (_scopedIdentifierElementIdFkey == null)
            _scopedIdentifierElementIdFkey = new Element(this, Keys.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_ELEMENT_ID_FKEY);

        return _scopedIdentifierElementIdFkey;
    }

    /**
     * Get the implicit join path to the <code>public.element</code> table, via
     * the <code>scoped_identifier_namespace_id2_fkey</code> key.
     */
    public Element scopedIdentifierNamespaceId2Fkey() {
        if (_scopedIdentifierNamespaceId2Fkey == null)
            _scopedIdentifierNamespaceId2Fkey = new Element(this, Keys.SCOPED_IDENTIFIER__SCOPED_IDENTIFIER_NAMESPACE_ID2_FKEY);

        return _scopedIdentifierNamespaceId2Fkey;
    }

    @Override
    public ScopedIdentifier as(String alias) {
        return new ScopedIdentifier(DSL.name(alias), this);
    }

    @Override
    public ScopedIdentifier as(Name alias) {
        return new ScopedIdentifier(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScopedIdentifier rename(String name) {
        return new ScopedIdentifier(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScopedIdentifier rename(Name name) {
        return new ScopedIdentifier(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Integer, Status, Integer, Integer, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
