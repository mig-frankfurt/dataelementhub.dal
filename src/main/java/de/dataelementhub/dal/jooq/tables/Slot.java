/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Indexes;
import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.tables.records.SlotRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class Slot extends TableImpl<SlotRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.slot</code>
     */
    public static final Slot SLOT = new Slot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SlotRecord> getRecordType() {
        return SlotRecord.class;
    }

    /**
     * The column <code>public.slot.id</code>.
     */
    public final TableField<SlotRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.slot.scoped_identifier_id</code>.
     */
    public final TableField<SlotRecord, Integer> SCOPED_IDENTIFIER_ID = createField(DSL.name("scoped_identifier_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.slot.key</code>.
     */
    public final TableField<SlotRecord, String> KEY = createField(DSL.name("key"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.slot.value</code>.
     */
    public final TableField<SlotRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB.nullable(false), this, "");

    private Slot(Name alias, Table<SlotRecord> aliased) {
        this(alias, aliased, null);
    }

    private Slot(Name alias, Table<SlotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.slot</code> table reference
     */
    public Slot(String alias) {
        this(DSL.name(alias), SLOT);
    }

    /**
     * Create an aliased <code>public.slot</code> table reference
     */
    public Slot(Name alias) {
        this(alias, SLOT);
    }

    /**
     * Create a <code>public.slot</code> table reference
     */
    public Slot() {
        this(DSL.name("slot"), null);
    }

    public <O extends Record> Slot(Table<O> child, ForeignKey<O, SlotRecord> key) {
        super(child, key, SLOT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.SLOT_SCOPED_IDENTIFIER_ID_IDX);
    }

    @Override
    public Identity<SlotRecord, Integer> getIdentity() {
        return (Identity<SlotRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SlotRecord> getPrimaryKey() {
        return Keys.SLOT_PKEY;
    }

    @Override
    public List<ForeignKey<SlotRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SLOT__SLOT_SCOPED_IDENTIFIER_ID_FKEY);
    }

    private transient ScopedIdentifier _scopedIdentifier;

    /**
     * Get the implicit join path to the <code>public.scoped_identifier</code>
     * table.
     */
    public ScopedIdentifier scopedIdentifier() {
        if (_scopedIdentifier == null)
            _scopedIdentifier = new ScopedIdentifier(this, Keys.SLOT__SLOT_SCOPED_IDENTIFIER_ID_FKEY);

        return _scopedIdentifier;
    }

    @Override
    public Slot as(String alias) {
        return new Slot(DSL.name(alias), this);
    }

    @Override
    public Slot as(Name alias) {
        return new Slot(alias, this);
    }

    @Override
    public Slot as(Table<?> alias) {
        return new Slot(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Slot rename(String name) {
        return new Slot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Slot rename(Name name) {
        return new Slot(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Slot rename(Table<?> name) {
        return new Slot(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
