/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.tables.records.DehubUserRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class DehubUser extends TableImpl<DehubUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.dehub_user</code>
     */
    public static final DehubUser DEHUB_USER = new DehubUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DehubUserRecord> getRecordType() {
        return DehubUserRecord.class;
    }

    /**
     * The column <code>public.dehub_user.id</code>.
     */
    public final TableField<DehubUserRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.dehub_user.auth_id</code>.
     */
    public final TableField<DehubUserRecord, String> AUTH_ID = createField(DSL.name("auth_id"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.dehub_user.first_name</code>.
     */
    public final TableField<DehubUserRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.dehub_user.last_name</code>.
     */
    public final TableField<DehubUserRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.dehub_user.user_name</code>.
     */
    public final TableField<DehubUserRecord, String> USER_NAME = createField(DSL.name("user_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.dehub_user.email</code>.
     */
    public final TableField<DehubUserRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.CLOB.nullable(false), this, "");

    private DehubUser(Name alias, Table<DehubUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private DehubUser(Name alias, Table<DehubUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.dehub_user</code> table reference
     */
    public DehubUser(String alias) {
        this(DSL.name(alias), DEHUB_USER);
    }

    /**
     * Create an aliased <code>public.dehub_user</code> table reference
     */
    public DehubUser(Name alias) {
        this(alias, DEHUB_USER);
    }

    /**
     * Create a <code>public.dehub_user</code> table reference
     */
    public DehubUser() {
        this(DSL.name("dehub_user"), null);
    }

    public <O extends Record> DehubUser(Table<O> child, ForeignKey<O, DehubUserRecord> key) {
        super(child, key, DEHUB_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<DehubUserRecord, Integer> getIdentity() {
        return (Identity<DehubUserRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DehubUserRecord> getPrimaryKey() {
        return Keys.DEHUB_USER_PKEY;
    }

    @Override
    public List<UniqueKey<DehubUserRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.DEHUB_USER_AUTH_ID_KEY);
    }

    @Override
    public DehubUser as(String alias) {
        return new DehubUser(DSL.name(alias), this);
    }

    @Override
    public DehubUser as(Name alias) {
        return new DehubUser(alias, this);
    }

    @Override
    public DehubUser as(Table<?> alias) {
        return new DehubUser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DehubUser rename(String name) {
        return new DehubUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DehubUser rename(Name name) {
        return new DehubUser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DehubUser rename(Table<?> name) {
        return new DehubUser(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
