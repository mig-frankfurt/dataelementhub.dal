/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.tables.records.GetDefinitionByUrnRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class GetDefinitionByUrn extends TableImpl<GetDefinitionByUrnRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.get_definition_by_urn</code>
     */
    public static final GetDefinitionByUrn GET_DEFINITION_BY_URN = new GetDefinitionByUrn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetDefinitionByUrnRecord> getRecordType() {
        return GetDefinitionByUrnRecord.class;
    }

    /**
     * The column <code>public.get_definition_by_urn.id</code>.
     */
    public final TableField<GetDefinitionByUrnRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true).defaultValue(DSL.field("nextval('definition_id_seq'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>public.get_definition_by_urn.scoped_identifier_id</code>.
     */
    public final TableField<GetDefinitionByUrnRecord, Integer> SCOPED_IDENTIFIER_ID = createField(DSL.name("scoped_identifier_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_definition_by_urn.designation</code>.
     */
    public final TableField<GetDefinitionByUrnRecord, String> DESIGNATION = createField(DSL.name("designation"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.get_definition_by_urn.definition</code>.
     */
    public final TableField<GetDefinitionByUrnRecord, String> DEFINITION = createField(DSL.name("definition"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_definition_by_urn.language</code>.
     */
    public final TableField<GetDefinitionByUrnRecord, String> LANGUAGE = createField(DSL.name("language"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.get_definition_by_urn.element_id</code>.
     */
    public final TableField<GetDefinitionByUrnRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private GetDefinitionByUrn(Name alias, Table<GetDefinitionByUrnRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private GetDefinitionByUrn(Name alias, Table<GetDefinitionByUrnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.get_definition_by_urn</code> table
     * reference
     */
    public GetDefinitionByUrn(String alias) {
        this(DSL.name(alias), GET_DEFINITION_BY_URN);
    }

    /**
     * Create an aliased <code>public.get_definition_by_urn</code> table
     * reference
     */
    public GetDefinitionByUrn(Name alias) {
        this(alias, GET_DEFINITION_BY_URN);
    }

    /**
     * Create a <code>public.get_definition_by_urn</code> table reference
     */
    public GetDefinitionByUrn() {
        this(DSL.name("get_definition_by_urn"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<GetDefinitionByUrnRecord, Integer> getIdentity() {
        return (Identity<GetDefinitionByUrnRecord, Integer>) super.getIdentity();
    }

    @Override
    public GetDefinitionByUrn as(String alias) {
        return new GetDefinitionByUrn(DSL.name(alias), this, parameters);
    }

    @Override
    public GetDefinitionByUrn as(Name alias) {
        return new GetDefinitionByUrn(alias, this, parameters);
    }

    @Override
    public GetDefinitionByUrn as(Table<?> alias) {
        return new GetDefinitionByUrn(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetDefinitionByUrn rename(String name) {
        return new GetDefinitionByUrn(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetDefinitionByUrn rename(Name name) {
        return new GetDefinitionByUrn(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetDefinitionByUrn rename(Table<?> name) {
        return new GetDefinitionByUrn(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetDefinitionByUrn call(
          String urn
    ) {
        GetDefinitionByUrn result = new GetDefinitionByUrn(DSL.name("get_definition_by_urn"), null, new Field[] {
            DSL.val(urn, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GetDefinitionByUrn call(
          Field<String> urn
    ) {
        GetDefinitionByUrn result = new GetDefinitionByUrn(DSL.name("get_definition_by_urn"), null, new Field[] {
            urn
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
