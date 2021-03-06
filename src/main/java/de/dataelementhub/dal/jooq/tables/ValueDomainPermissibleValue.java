/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.tables.records.ValueDomainPermissibleValueRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
public class ValueDomainPermissibleValue extends TableImpl<ValueDomainPermissibleValueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.value_domain_permissible_value</code>
     */
    public static final ValueDomainPermissibleValue VALUE_DOMAIN_PERMISSIBLE_VALUE = new ValueDomainPermissibleValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ValueDomainPermissibleValueRecord> getRecordType() {
        return ValueDomainPermissibleValueRecord.class;
    }

    /**
     * The column
     * <code>public.value_domain_permissible_value.value_domain_scoped_identifier_id</code>.
     */
    public final TableField<ValueDomainPermissibleValueRecord, Integer> VALUE_DOMAIN_SCOPED_IDENTIFIER_ID = createField(DSL.name("value_domain_scoped_identifier_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.value_domain_permissible_value.permissible_value_scoped_identifier_id</code>.
     */
    public final TableField<ValueDomainPermissibleValueRecord, Integer> PERMISSIBLE_VALUE_SCOPED_IDENTIFIER_ID = createField(DSL.name("permissible_value_scoped_identifier_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private ValueDomainPermissibleValue(Name alias, Table<ValueDomainPermissibleValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private ValueDomainPermissibleValue(Name alias, Table<ValueDomainPermissibleValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.value_domain_permissible_value</code>
     * table reference
     */
    public ValueDomainPermissibleValue(String alias) {
        this(DSL.name(alias), VALUE_DOMAIN_PERMISSIBLE_VALUE);
    }

    /**
     * Create an aliased <code>public.value_domain_permissible_value</code>
     * table reference
     */
    public ValueDomainPermissibleValue(Name alias) {
        this(alias, VALUE_DOMAIN_PERMISSIBLE_VALUE);
    }

    /**
     * Create a <code>public.value_domain_permissible_value</code> table
     * reference
     */
    public ValueDomainPermissibleValue() {
        this(DSL.name("value_domain_permissible_value"), null);
    }

    public <O extends Record> ValueDomainPermissibleValue(Table<O> child, ForeignKey<O, ValueDomainPermissibleValueRecord> key) {
        super(child, key, VALUE_DOMAIN_PERMISSIBLE_VALUE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<ForeignKey<ValueDomainPermissibleValueRecord, ?>> getReferences() {
        return Arrays.asList(Keys.VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_VALUE_DOMAIN_SCOPED_IDENTIFI_FKEY, Keys.VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_PERMISSIBLE_VALUE_SCOPED_IDE_FKEY);
    }

    private transient ScopedIdentifier _valueDomainPermissibleValuValueDomainScopedIdentifiFkey;
    private transient ScopedIdentifier _valueDomainPermissibleValuPermissibleValueScopedIdeFkey;

    /**
     * Get the implicit join path to the <code>public.scoped_identifier</code>
     * table, via the
     * <code>value_domain_permissible_valu_value_domain_scoped_identifi_fkey</code>
     * key.
     */
    public ScopedIdentifier valueDomainPermissibleValuValueDomainScopedIdentifiFkey() {
        if (_valueDomainPermissibleValuValueDomainScopedIdentifiFkey == null)
            _valueDomainPermissibleValuValueDomainScopedIdentifiFkey = new ScopedIdentifier(this, Keys.VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_VALUE_DOMAIN_SCOPED_IDENTIFI_FKEY);

        return _valueDomainPermissibleValuValueDomainScopedIdentifiFkey;
    }

    /**
     * Get the implicit join path to the <code>public.scoped_identifier</code>
     * table, via the
     * <code>value_domain_permissible_valu_permissible_value_scoped_ide_fkey</code>
     * key.
     */
    public ScopedIdentifier valueDomainPermissibleValuPermissibleValueScopedIdeFkey() {
        if (_valueDomainPermissibleValuPermissibleValueScopedIdeFkey == null)
            _valueDomainPermissibleValuPermissibleValueScopedIdeFkey = new ScopedIdentifier(this, Keys.VALUE_DOMAIN_PERMISSIBLE_VALUE__VALUE_DOMAIN_PERMISSIBLE_VALU_PERMISSIBLE_VALUE_SCOPED_IDE_FKEY);

        return _valueDomainPermissibleValuPermissibleValueScopedIdeFkey;
    }

    @Override
    public ValueDomainPermissibleValue as(String alias) {
        return new ValueDomainPermissibleValue(DSL.name(alias), this);
    }

    @Override
    public ValueDomainPermissibleValue as(Name alias) {
        return new ValueDomainPermissibleValue(alias, this);
    }

    @Override
    public ValueDomainPermissibleValue as(Table<?> alias) {
        return new ValueDomainPermissibleValue(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ValueDomainPermissibleValue rename(String name) {
        return new ValueDomainPermissibleValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ValueDomainPermissibleValue rename(Name name) {
        return new ValueDomainPermissibleValue(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ValueDomainPermissibleValue rename(Table<?> name) {
        return new ValueDomainPermissibleValue(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
