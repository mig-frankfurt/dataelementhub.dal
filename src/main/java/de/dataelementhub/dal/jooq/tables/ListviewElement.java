/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.enums.ValidationDatatypeType;
import de.dataelementhub.dal.jooq.enums.ValidationSubtypeType;
import de.dataelementhub.dal.jooq.tables.records.ListviewElementRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ListviewElement extends TableImpl<ListviewElementRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.listview_element</code>
     */
    public static final ListviewElement LISTVIEW_ELEMENT = new ListviewElement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ListviewElementRecord> getRecordType() {
        return ListviewElementRecord.class;
    }

    /**
     * The column <code>public.listview_element.si_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_ID = createField(DSL.name("si_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.si_identifier</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_IDENTIFIER = createField(DSL.name("si_identifier"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.si_revision</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_REVISION = createField(DSL.name("si_revision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.si_status</code>.
     */
    public final TableField<ListviewElementRecord, Status> SI_STATUS = createField(DSL.name("si_status"), SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.Status.class), this, "");

    /**
     * The column <code>public.listview_element.si_namespace_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> SI_NAMESPACE_ID = createField(DSL.name("si_namespace_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.si_hidden</code>.
     */
    public final TableField<ListviewElementRecord, Boolean> SI_HIDDEN = createField(DSL.name("si_hidden"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.listview_element.e_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> E_ID = createField(DSL.name("e_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.e_element_type</code>.
     */
    public final TableField<ListviewElementRecord, ElementType> E_ELEMENT_TYPE = createField(DSL.name("e_element_type"), SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.listview_element.e_created_by</code>.
     */
    public final TableField<ListviewElementRecord, Integer> E_CREATED_BY = createField(DSL.name("e_created_by"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.e_element_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> E_ELEMENT_ID = createField(DSL.name("e_element_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.e_permitted_value</code>.
     */
    public final TableField<ListviewElementRecord, String> E_PERMITTED_VALUE = createField(DSL.name("e_permitted_value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.v_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> V_ID = createField(DSL.name("v_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.v_element_id</code>.
     */
    public final TableField<ListviewElementRecord, Integer> V_ELEMENT_ID = createField(DSL.name("v_element_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.listview_element.v_datatype</code>.
     */
    public final TableField<ListviewElementRecord, ValidationDatatypeType> V_DATATYPE = createField(DSL.name("v_datatype"), SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ValidationDatatypeType.class), this, "");

    /**
     * The column <code>public.listview_element.v_subtype</code>.
     */
    public final TableField<ListviewElementRecord, ValidationSubtypeType> V_SUBTYPE = createField(DSL.name("v_subtype"), SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ValidationSubtypeType.class), this, "");

    /**
     * The column <code>public.listview_element.v_format</code>.
     */
    public final TableField<ListviewElementRecord, String> V_FORMAT = createField(DSL.name("v_format"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.v_unit_of_measure</code>.
     */
    public final TableField<ListviewElementRecord, String> V_UNIT_OF_MEASURE = createField(DSL.name("v_unit_of_measure"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.listview_element.v_maximum_characters</code>.
     */
    public final TableField<ListviewElementRecord, Integer> V_MAXIMUM_CHARACTERS = createField(DSL.name("v_maximum_characters"), SQLDataType.INTEGER, this, "");

    private ListviewElement(Name alias, Table<ListviewElementRecord> aliased) {
        this(alias, aliased, null);
    }

    private ListviewElement(Name alias, Table<ListviewElementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"listview_element\" as  SELECT si.id AS si_id,\n    si.identifier AS si_identifier,\n    si.revision AS si_revision,\n    si.status AS si_status,\n    si.namespace_id AS si_namespace_id,\n    si.hidden AS si_hidden,\n    e.id AS e_id,\n    e.element_type AS e_element_type,\n    e.created_by AS e_created_by,\n    e.element_id AS e_element_id,\n    e.permitted_value AS e_permitted_value,\n    v.id AS v_id,\n    v.element_id AS v_element_id,\n    v.datatype AS v_datatype,\n    v.subtype AS v_subtype,\n    v.format AS v_format,\n    v.unit_of_measure AS v_unit_of_measure,\n    v.maximum_characters AS v_maximum_characters\n   FROM ((((scoped_identifier si\n     LEFT JOIN element ns ON ((si.namespace_id = ns.id)))\n     LEFT JOIN element e ON ((e.id = si.element_id)))\n     LEFT JOIN element vd ON ((e.element_id = vd.id)))\n     LEFT JOIN validation v ON ((e.id = v.element_id)));"));
    }

    /**
     * Create an aliased <code>public.listview_element</code> table reference
     */
    public ListviewElement(String alias) {
        this(DSL.name(alias), LISTVIEW_ELEMENT);
    }

    /**
     * Create an aliased <code>public.listview_element</code> table reference
     */
    public ListviewElement(Name alias) {
        this(alias, LISTVIEW_ELEMENT);
    }

    /**
     * Create a <code>public.listview_element</code> table reference
     */
    public ListviewElement() {
        this(DSL.name("listview_element"), null);
    }

    public <O extends Record> ListviewElement(Table<O> child, ForeignKey<O, ListviewElementRecord> key) {
        super(child, key, LISTVIEW_ELEMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public ListviewElement as(String alias) {
        return new ListviewElement(DSL.name(alias), this);
    }

    @Override
    public ListviewElement as(Name alias) {
        return new ListviewElement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ListviewElement rename(String name) {
        return new ListviewElement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ListviewElement rename(Name name) {
        return new ListviewElement(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, Integer, Status, Integer, Boolean, Integer, ElementType, Integer, Integer, String, Integer, Integer, ValidationDatatypeType, ValidationSubtypeType, String, String, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
