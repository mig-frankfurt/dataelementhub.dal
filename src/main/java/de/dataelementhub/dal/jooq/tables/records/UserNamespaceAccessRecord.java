/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.AccessLevelType;
import de.dataelementhub.dal.jooq.tables.UserNamespaceAccess;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserNamespaceAccessRecord extends TableRecordImpl<UserNamespaceAccessRecord> implements Record3<Integer, Integer, AccessLevelType> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user_namespace_access.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_namespace_access.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.user_namespace_access.namespace_id</code>.
     */
    public void setNamespaceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_namespace_access.namespace_id</code>.
     */
    public Integer getNamespaceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.user_namespace_access.access_level</code>.
     */
    public void setAccessLevel(AccessLevelType value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user_namespace_access.access_level</code>.
     */
    public AccessLevelType getAccessLevel() {
        return (AccessLevelType) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, AccessLevelType> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, AccessLevelType> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserNamespaceAccess.USER_NAMESPACE_ACCESS.USER_ID;
    }

    @Override
    public Field<Integer> field2() {
        return UserNamespaceAccess.USER_NAMESPACE_ACCESS.NAMESPACE_ID;
    }

    @Override
    public Field<AccessLevelType> field3() {
        return UserNamespaceAccess.USER_NAMESPACE_ACCESS.ACCESS_LEVEL;
    }

    @Override
    public Integer component1() {
        return getUserId();
    }

    @Override
    public Integer component2() {
        return getNamespaceId();
    }

    @Override
    public AccessLevelType component3() {
        return getAccessLevel();
    }

    @Override
    public Integer value1() {
        return getUserId();
    }

    @Override
    public Integer value2() {
        return getNamespaceId();
    }

    @Override
    public AccessLevelType value3() {
        return getAccessLevel();
    }

    @Override
    public UserNamespaceAccessRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserNamespaceAccessRecord value2(Integer value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public UserNamespaceAccessRecord value3(AccessLevelType value) {
        setAccessLevel(value);
        return this;
    }

    @Override
    public UserNamespaceAccessRecord values(Integer value1, Integer value2, AccessLevelType value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserNamespaceAccessRecord
     */
    public UserNamespaceAccessRecord() {
        super(UserNamespaceAccess.USER_NAMESPACE_ACCESS);
    }

    /**
     * Create a detached, initialised UserNamespaceAccessRecord
     */
    public UserNamespaceAccessRecord(Integer userId, Integer namespaceId, AccessLevelType accessLevel) {
        super(UserNamespaceAccess.USER_NAMESPACE_ACCESS);

        setUserId(userId);
        setNamespaceId(namespaceId);
        setAccessLevel(accessLevel);
    }

    /**
     * Create a detached, initialised UserNamespaceAccessRecord
     */
    public UserNamespaceAccessRecord(de.dataelementhub.dal.jooq.tables.pojos.UserNamespaceAccess value) {
        super(UserNamespaceAccess.USER_NAMESPACE_ACCESS);

        if (value != null) {
            setUserId(value.getUserId());
            setNamespaceId(value.getNamespaceId());
            setAccessLevel(value.getAccessLevel());
        }
    }
}
