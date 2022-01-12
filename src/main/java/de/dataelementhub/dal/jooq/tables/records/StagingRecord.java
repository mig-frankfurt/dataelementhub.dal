/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.tables.Staging;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StagingRecord extends UpdatableRecordImpl<StagingRecord> implements Record10<Integer, String, ElementType, String, Integer, Integer, LocalDateTime, Integer, String, String> {

    private static final long serialVersionUID = -682246354;

    /**
     * Setter for <code>public.staging.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.staging.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.staging.data</code>.
     */
    public void setData(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.staging.data</code>.
     */
    public String getData() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.staging.element_type</code>.
     */
    public void setElementType(ElementType value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.staging.element_type</code>.
     */
    public ElementType getElementType() {
        return (ElementType) get(2);
    }

    /**
     * Setter for <code>public.staging.designation</code>.
     */
    public void setDesignation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.staging.designation</code>.
     */
    public String getDesignation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.staging.import_id</code>.
     */
    public void setImportId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.staging.import_id</code>.
     */
    public Integer getImportId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.staging.scoped_identifier_id</code>.
     */
    public void setScopedIdentifierId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.staging.scoped_identifier_id</code>.
     */
    public Integer getScopedIdentifierId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.staging.converted_at</code>.
     */
    public void setConvertedAt(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.staging.converted_at</code>.
     */
    public LocalDateTime getConvertedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.staging.converted_by</code>.
     */
    public void setConvertedBy(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.staging.converted_by</code>.
     */
    public Integer getConvertedBy() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.staging.staged_element_id</code>.
     */
    public void setStagedElementId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.staging.staged_element_id</code>.
     */
    public String getStagedElementId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.staging.members</code>.
     */
    public void setMembers(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.staging.members</code>.
     */
    public String getMembers() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, ElementType, String, Integer, Integer, LocalDateTime, Integer, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, ElementType, String, Integer, Integer, LocalDateTime, Integer, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Staging.STAGING.ID;
    }

    @Override
    public Field<String> field2() {
        return Staging.STAGING.DATA;
    }

    @Override
    public Field<ElementType> field3() {
        return Staging.STAGING.ELEMENT_TYPE;
    }

    @Override
    public Field<String> field4() {
        return Staging.STAGING.DESIGNATION;
    }

    @Override
    public Field<Integer> field5() {
        return Staging.STAGING.IMPORT_ID;
    }

    @Override
    public Field<Integer> field6() {
        return Staging.STAGING.SCOPED_IDENTIFIER_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Staging.STAGING.CONVERTED_AT;
    }

    @Override
    public Field<Integer> field8() {
        return Staging.STAGING.CONVERTED_BY;
    }

    @Override
    public Field<String> field9() {
        return Staging.STAGING.STAGED_ELEMENT_ID;
    }

    @Override
    public Field<String> field10() {
        return Staging.STAGING.MEMBERS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getData();
    }

    @Override
    public ElementType component3() {
        return getElementType();
    }

    @Override
    public String component4() {
        return getDesignation();
    }

    @Override
    public Integer component5() {
        return getImportId();
    }

    @Override
    public Integer component6() {
        return getScopedIdentifierId();
    }

    @Override
    public LocalDateTime component7() {
        return getConvertedAt();
    }

    @Override
    public Integer component8() {
        return getConvertedBy();
    }

    @Override
    public String component9() {
        return getStagedElementId();
    }

    @Override
    public String component10() {
        return getMembers();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getData();
    }

    @Override
    public ElementType value3() {
        return getElementType();
    }

    @Override
    public String value4() {
        return getDesignation();
    }

    @Override
    public Integer value5() {
        return getImportId();
    }

    @Override
    public Integer value6() {
        return getScopedIdentifierId();
    }

    @Override
    public LocalDateTime value7() {
        return getConvertedAt();
    }

    @Override
    public Integer value8() {
        return getConvertedBy();
    }

    @Override
    public String value9() {
        return getStagedElementId();
    }

    @Override
    public String value10() {
        return getMembers();
    }

    @Override
    public StagingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public StagingRecord value2(String value) {
        setData(value);
        return this;
    }

    @Override
    public StagingRecord value3(ElementType value) {
        setElementType(value);
        return this;
    }

    @Override
    public StagingRecord value4(String value) {
        setDesignation(value);
        return this;
    }

    @Override
    public StagingRecord value5(Integer value) {
        setImportId(value);
        return this;
    }

    @Override
    public StagingRecord value6(Integer value) {
        setScopedIdentifierId(value);
        return this;
    }

    @Override
    public StagingRecord value7(LocalDateTime value) {
        setConvertedAt(value);
        return this;
    }

    @Override
    public StagingRecord value8(Integer value) {
        setConvertedBy(value);
        return this;
    }

    @Override
    public StagingRecord value9(String value) {
        setStagedElementId(value);
        return this;
    }

    @Override
    public StagingRecord value10(String value) {
        setMembers(value);
        return this;
    }

    @Override
    public StagingRecord values(Integer value1, String value2, ElementType value3, String value4, Integer value5, Integer value6, LocalDateTime value7, Integer value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StagingRecord
     */
    public StagingRecord() {
        super(Staging.STAGING);
    }

    /**
     * Create a detached, initialised StagingRecord
     */
    public StagingRecord(Integer id, String data, ElementType elementType, String designation, Integer importId, Integer scopedIdentifierId, LocalDateTime convertedAt, Integer convertedBy, String stagedElementId, String members) {
        super(Staging.STAGING);

        set(0, id);
        set(1, data);
        set(2, elementType);
        set(3, designation);
        set(4, importId);
        set(5, scopedIdentifierId);
        set(6, convertedAt);
        set(7, convertedBy);
        set(8, stagedElementId);
        set(9, members);
    }
}