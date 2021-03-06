/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.tables.records.GetScopedIdentifierByUrnRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function10;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row10;
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
public class GetScopedIdentifierByUrn extends TableImpl<GetScopedIdentifierByUrnRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.get_scoped_identifier_by_urn</code>
     */
    public static final GetScopedIdentifierByUrn GET_SCOPED_IDENTIFIER_BY_URN = new GetScopedIdentifierByUrn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetScopedIdentifierByUrnRecord> getRecordType() {
        return GetScopedIdentifierByUrnRecord.class;
    }

    /**
     * The column <code>public.get_scoped_identifier_by_urn.id</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true).defaultValue(DSL.field("nextval('scoped_identifier_id_seq'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.element_type</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, ElementType> ELEMENT_TYPE = createField(DSL.name("element_type"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.version</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.identifier</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> IDENTIFIER = createField(DSL.name("identifier"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.url</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, String> URL = createField(DSL.name("url"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.created_by</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.status</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Status> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.Status.class), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.element_id</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.namespace_id</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, Integer> NAMESPACE_ID = createField(DSL.name("namespace_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.get_scoped_identifier_by_urn.uuid</code>.
     */
    public final TableField<GetScopedIdentifierByUrnRecord, java.util.UUID> UUID = createField(DSL.name("uuid"), SQLDataType.UUID.nullable(false), this, "");

    private GetScopedIdentifierByUrn(Name alias, Table<GetScopedIdentifierByUrnRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB)
        });
    }

    private GetScopedIdentifierByUrn(Name alias, Table<GetScopedIdentifierByUrnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>public.get_scoped_identifier_by_urn</code> table
     * reference
     */
    public GetScopedIdentifierByUrn(String alias) {
        this(DSL.name(alias), GET_SCOPED_IDENTIFIER_BY_URN);
    }

    /**
     * Create an aliased <code>public.get_scoped_identifier_by_urn</code> table
     * reference
     */
    public GetScopedIdentifierByUrn(Name alias) {
        this(alias, GET_SCOPED_IDENTIFIER_BY_URN);
    }

    /**
     * Create a <code>public.get_scoped_identifier_by_urn</code> table reference
     */
    public GetScopedIdentifierByUrn() {
        this(DSL.name("get_scoped_identifier_by_urn"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<GetScopedIdentifierByUrnRecord, Integer> getIdentity() {
        return (Identity<GetScopedIdentifierByUrnRecord, Integer>) super.getIdentity();
    }

    @Override
    public GetScopedIdentifierByUrn as(String alias) {
        return new GetScopedIdentifierByUrn(DSL.name(alias), this, parameters);
    }

    @Override
    public GetScopedIdentifierByUrn as(Name alias) {
        return new GetScopedIdentifierByUrn(alias, this, parameters);
    }

    @Override
    public GetScopedIdentifierByUrn as(Table<?> alias) {
        return new GetScopedIdentifierByUrn(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetScopedIdentifierByUrn rename(String name) {
        return new GetScopedIdentifierByUrn(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetScopedIdentifierByUrn rename(Name name) {
        return new GetScopedIdentifierByUrn(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetScopedIdentifierByUrn rename(Table<?> name) {
        return new GetScopedIdentifierByUrn(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, ElementType, Integer, Integer, String, Integer, Status, Integer, Integer, java.util.UUID> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetScopedIdentifierByUrn call(
          String urn
    ) {
        GetScopedIdentifierByUrn result = new GetScopedIdentifierByUrn(DSL.name("get_scoped_identifier_by_urn"), null, new Field[] {
            DSL.val(urn, SQLDataType.CLOB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GetScopedIdentifierByUrn call(
          Field<String> urn
    ) {
        GetScopedIdentifierByUrn result = new GetScopedIdentifierByUrn(DSL.name("get_scoped_identifier_by_urn"), null, new Field[] {
            urn
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Integer, ? super ElementType, ? super Integer, ? super Integer, ? super String, ? super Integer, ? super Status, ? super Integer, ? super Integer, ? super java.util.UUID, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Integer, ? super ElementType, ? super Integer, ? super Integer, ? super String, ? super Integer, ? super Status, ? super Integer, ? super Integer, ? super java.util.UUID, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
