/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.ValidationType;
import de.dataelementhub.dal.jooq.tables.records.GetValueDomainByUrnRecord;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class GetValueDomainByUrn extends TableImpl<GetValueDomainByUrnRecord> {

    private static final long serialVersionUID = 88339172;

    /**
     * The reference instance of <code>public.get_value_domain_by_urn</code>
     */
    public static final GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN = new GetValueDomainByUrn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetValueDomainByUrnRecord> getRecordType() {
        return GetValueDomainByUrnRecord.class;
    }

    /**
     * The column <code>public.get_value_domain_by_urn.id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('element_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.element_type</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, ElementType> ELEMENT_TYPE = createField(DSL.name("element_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(de.dataelementhub.dal.jooq.enums.ElementType.class), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.hidden</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Boolean> HIDDEN = createField(DSL.name("hidden"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.created_by</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.element_id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> ELEMENT_ID = createField(DSL.name("element_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.scoped_identifier_id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> SCOPED_IDENTIFIER_ID = createField(DSL.name("scoped_identifier_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.code</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.is_valid</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Boolean> IS_VALID = createField(DSL.name("is_valid"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.format</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> FORMAT = createField(DSL.name("format"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.datatype</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> DATATYPE = createField(DSL.name("datatype"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.unit_of_measure</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> UNIT_OF_MEASURE = createField(DSL.name("unit_of_measure"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.maximum_characters</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, Integer> MAXIMUM_CHARACTERS = createField(DSL.name("maximum_characters"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.description</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.validation_type</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, ValidationType> VALIDATION_TYPE = createField(DSL.name("validation_type"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(de.dataelementhub.dal.jooq.enums.ValidationType.class), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.validation_data</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> VALIDATION_DATA = createField(DSL.name("validation_data"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.permitted_value</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> PERMITTED_VALUE = createField(DSL.name("permitted_value"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.data</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, JSON> DATA = createField(DSL.name("data"), org.jooq.impl.SQLDataType.JSON.defaultValue(org.jooq.impl.DSL.field("'{}'::json", org.jooq.impl.SQLDataType.JSON)), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.uuid</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, UUID> UUID = createField(DSL.name("uuid"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.get_value_domain_by_urn.external_id</code>.
     */
    public final TableField<GetValueDomainByUrnRecord, String> EXTERNAL_ID = createField(DSL.name("external_id"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.get_value_domain_by_urn</code> table reference
     */
    public GetValueDomainByUrn() {
        this(DSL.name("get_value_domain_by_urn"), null);
    }

    /**
     * Create an aliased <code>public.get_value_domain_by_urn</code> table reference
     */
    public GetValueDomainByUrn(String alias) {
        this(DSL.name(alias), GET_VALUE_DOMAIN_BY_URN);
    }

    /**
     * Create an aliased <code>public.get_value_domain_by_urn</code> table reference
     */
    public GetValueDomainByUrn(Name alias) {
        this(alias, GET_VALUE_DOMAIN_BY_URN);
    }

    private GetValueDomainByUrn(Name alias, Table<GetValueDomainByUrnRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private GetValueDomainByUrn(Name alias, Table<GetValueDomainByUrnRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    public <O extends Record> GetValueDomainByUrn(Table<O> child, ForeignKey<O, GetValueDomainByUrnRecord> key) {
        super(child, key, GET_VALUE_DOMAIN_BY_URN);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<GetValueDomainByUrnRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GET_VALUE_DOMAIN_BY_URN;
    }

    @Override
    public GetValueDomainByUrn as(String alias) {
        return new GetValueDomainByUrn(DSL.name(alias), this, parameters);
    }

    @Override
    public GetValueDomainByUrn as(Name alias) {
        return new GetValueDomainByUrn(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetValueDomainByUrn rename(String name) {
        return new GetValueDomainByUrn(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetValueDomainByUrn rename(Name name) {
        return new GetValueDomainByUrn(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, ElementType, Boolean, Integer, Integer, Integer, String, Boolean, String, String, String, Integer, String, ValidationType, String, String, JSON, UUID, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetValueDomainByUrn call(String urn) {
        return new GetValueDomainByUrn(DSL.name(getName()), null, new Field[] { 
              DSL.val(urn, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public GetValueDomainByUrn call(Field<String> urn) {
        return new GetValueDomainByUrn(DSL.name(getName()), null, new Field[] { 
              urn
        });
    }
}