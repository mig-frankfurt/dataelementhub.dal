/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables;


import de.dataelementhub.dal.jooq.Keys;
import de.dataelementhub.dal.jooq.Public;
import de.dataelementhub.dal.jooq.tables.records.UserSourceCredentialsRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class UserSourceCredentials extends TableImpl<UserSourceCredentialsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.user_source_credentials</code>
     */
    public static final UserSourceCredentials USER_SOURCE_CREDENTIALS = new UserSourceCredentials();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSourceCredentialsRecord> getRecordType() {
        return UserSourceCredentialsRecord.class;
    }

    /**
     * The column <code>public.user_source_credentials.user_id</code>.
     */
    public final TableField<UserSourceCredentialsRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user_source_credentials.credential</code>.
     */
    public final TableField<UserSourceCredentialsRecord, String> CREDENTIAL = createField(DSL.name("credential"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.user_source_credentials.source_id</code>.
     */
    public final TableField<UserSourceCredentialsRecord, Integer> SOURCE_ID = createField(DSL.name("source_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private UserSourceCredentials(Name alias, Table<UserSourceCredentialsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSourceCredentials(Name alias, Table<UserSourceCredentialsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.user_source_credentials</code> table
     * reference
     */
    public UserSourceCredentials(String alias) {
        this(DSL.name(alias), USER_SOURCE_CREDENTIALS);
    }

    /**
     * Create an aliased <code>public.user_source_credentials</code> table
     * reference
     */
    public UserSourceCredentials(Name alias) {
        this(alias, USER_SOURCE_CREDENTIALS);
    }

    /**
     * Create a <code>public.user_source_credentials</code> table reference
     */
    public UserSourceCredentials() {
        this(DSL.name("user_source_credentials"), null);
    }

    public <O extends Record> UserSourceCredentials(Table<O> child, ForeignKey<O, UserSourceCredentialsRecord> key) {
        super(child, key, USER_SOURCE_CREDENTIALS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<UserSourceCredentialsRecord> getPrimaryKey() {
        return Keys.USER_SOURCE_CREDENTIALS_PKEY;
    }

    @Override
    public List<UniqueKey<UserSourceCredentialsRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CREDENTIALS_UNIQUE);
    }

    @Override
    public List<ForeignKey<UserSourceCredentialsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.USER_SOURCE_CREDENTIALS__USER_ID_FKEY, Keys.USER_SOURCE_CREDENTIALS__SOURCE_ID_FKEY);
    }

    private transient DehubUser _dehubUser;
    private transient Source _source;

    /**
     * Get the implicit join path to the <code>public.dehub_user</code> table.
     */
    public DehubUser dehubUser() {
        if (_dehubUser == null)
            _dehubUser = new DehubUser(this, Keys.USER_SOURCE_CREDENTIALS__USER_ID_FKEY);

        return _dehubUser;
    }

    /**
     * Get the implicit join path to the <code>public.source</code> table.
     */
    public Source source() {
        if (_source == null)
            _source = new Source(this, Keys.USER_SOURCE_CREDENTIALS__SOURCE_ID_FKEY);

        return _source;
    }

    @Override
    public UserSourceCredentials as(String alias) {
        return new UserSourceCredentials(DSL.name(alias), this);
    }

    @Override
    public UserSourceCredentials as(Name alias) {
        return new UserSourceCredentials(alias, this);
    }

    @Override
    public UserSourceCredentials as(Table<?> alias) {
        return new UserSourceCredentials(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSourceCredentials rename(String name) {
        return new UserSourceCredentials(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSourceCredentials rename(Name name) {
        return new UserSourceCredentials(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSourceCredentials rename(Table<?> name) {
        return new UserSourceCredentials(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
