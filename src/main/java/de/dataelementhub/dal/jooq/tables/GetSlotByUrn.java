/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.tables.records.GetSlotByUrnRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetSlotByUrn extends TableImpl<GetSlotByUrnRecord> {

    private static final long serialVersionUID = -469992622;

    /**
     * The reference instance of <code>public.get_slot_by_urn</code>
     */
    public static final GetSlotByUrn GET_SLOT_BY_URN = new GetSlotByUrn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetSlotByUrnRecord> getRecordType() {
        return GetSlotByUrnRecord.class;
    }

    /**
     * The column <code>public.get_slot_by_urn.id</code>.
     */
    public final TableField<GetSlotByUrnRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('slot_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.get_slot_by_urn.scoped_identifier_id</code>.
     */
    public final TableField<GetSlotByUrnRecord, Integer> SCOPED_IDENTIFIER_ID = createField(DSL.name("scoped_identifier_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_slot_by_urn.key</code>.
     */
    public final TableField<GetSlotByUrnRecord, String> KEY = createField(DSL.name("key"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.get_slot_by_urn.value</code>.
     */
    public final TableField<GetSlotByUrnRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.get_slot_by_urn</code> table reference
     */
    public GetSlotByUrn() {
        this(DSL.name("get_slot_by_urn"), null);
    }

    /**
     * Create an aliased <code>public.get_slot_by_urn</code> table reference
     */
    public GetSlotByUrn(String alias) {
        this(DSL.name(alias), GET_SLOT_BY_URN);
    }

    /**
     * Create an aliased <code>public.get_slot_by_urn</code> table reference
     */
    public GetSlotByUrn(Name alias) {
        this(alias, GET_SLOT_BY_URN);
    }

    private GetSlotByUrn(Name alias, Table<GetSlotByUrnRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private GetSlotByUrn(Name alias, Table<GetSlotByUrnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public <O extends Record> GetSlotByUrn(Table<O> child, ForeignKey<O, GetSlotByUrnRecord> key) {
        super(child, key, GET_SLOT_BY_URN);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<GetSlotByUrnRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GET_SLOT_BY_URN;
    }

    @Override
    public GetSlotByUrn as(String alias) {
        return new GetSlotByUrn(DSL.name(alias), this, parameters);
    }

    @Override
    public GetSlotByUrn as(Name alias) {
        return new GetSlotByUrn(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetSlotByUrn rename(String name) {
        return new GetSlotByUrn(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetSlotByUrn rename(Name name) {
        return new GetSlotByUrn(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetSlotByUrn call(String urn) {
        return new GetSlotByUrn(DSL.name(getName()), null, new Field[] { 
              DSL.val(urn, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetSlotByUrn call(Field<String> urn) {
        return new GetSlotByUrn(DSL.name(getName()), null, new Field[] { 
              urn
        });
    }
}