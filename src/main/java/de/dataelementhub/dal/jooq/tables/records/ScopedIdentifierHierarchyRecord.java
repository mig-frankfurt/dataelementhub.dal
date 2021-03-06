/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.tables.ScopedIdentifierHierarchy;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScopedIdentifierHierarchyRecord extends UpdatableRecordImpl<ScopedIdentifierHierarchyRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.scoped_identifier_hierarchy.super_id</code>.
     */
    public void setSuperId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_hierarchy.super_id</code>.
     */
    public Integer getSuperId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.scoped_identifier_hierarchy.sub_id</code>.
     */
    public void setSubId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_hierarchy.sub_id</code>.
     */
    public Integer getSubId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.scoped_identifier_hierarchy.order</code>.
     */
    public void setOrder(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_hierarchy.order</code>.
     */
    public Integer getOrder() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUPER_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.SUB_ID;
    }

    @Override
    public Field<Integer> field3() {
        return ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY.ORDER;
    }

    @Override
    public Integer component1() {
        return getSuperId();
    }

    @Override
    public Integer component2() {
        return getSubId();
    }

    @Override
    public Integer component3() {
        return getOrder();
    }

    @Override
    public Integer value1() {
        return getSuperId();
    }

    @Override
    public Integer value2() {
        return getSubId();
    }

    @Override
    public Integer value3() {
        return getOrder();
    }

    @Override
    public ScopedIdentifierHierarchyRecord value1(Integer value) {
        setSuperId(value);
        return this;
    }

    @Override
    public ScopedIdentifierHierarchyRecord value2(Integer value) {
        setSubId(value);
        return this;
    }

    @Override
    public ScopedIdentifierHierarchyRecord value3(Integer value) {
        setOrder(value);
        return this;
    }

    @Override
    public ScopedIdentifierHierarchyRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScopedIdentifierHierarchyRecord
     */
    public ScopedIdentifierHierarchyRecord() {
        super(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY);
    }

    /**
     * Create a detached, initialised ScopedIdentifierHierarchyRecord
     */
    public ScopedIdentifierHierarchyRecord(Integer superId, Integer subId, Integer order) {
        super(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY);

        setSuperId(superId);
        setSubId(subId);
        setOrder(order);
    }

    /**
     * Create a detached, initialised ScopedIdentifierHierarchyRecord
     */
    public ScopedIdentifierHierarchyRecord(de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierHierarchy value) {
        super(ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY);

        if (value != null) {
            setSuperId(value.getSuperId());
            setSubId(value.getSubId());
            setOrder(value.getOrder());
        }
    }
}
