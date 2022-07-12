/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.ProcessStatus;
import de.dataelementhub.dal.jooq.tables.Import;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImportRecord extends UpdatableRecordImpl<ImportRecord> implements Record8<Integer, LocalDateTime, Integer, Integer, String, String, Integer, ProcessStatus> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.import.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.import.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.import.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.import.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.import.created_by</code>.
     */
    public void setCreatedBy(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.import.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.import.namespace_id</code>.
     */
    public void setNamespaceId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.import.namespace_id</code>.
     */
    public Integer getNamespaceId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.import.source</code>.
     */
    public void setSource(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.import.source</code>.
     */
    public String getSource() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.import.label</code>.
     */
    public void setLabel(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.import.label</code>.
     */
    public String getLabel() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.import.number_of_elements</code>.
     */
    public void setNumberOfElements(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.import.number_of_elements</code>.
     */
    public Integer getNumberOfElements() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.import.status</code>.
     */
    public void setStatus(ProcessStatus value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.import.status</code>.
     */
    public ProcessStatus getStatus() {
        return (ProcessStatus) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, LocalDateTime, Integer, Integer, String, String, Integer, ProcessStatus> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, LocalDateTime, Integer, Integer, String, String, Integer, ProcessStatus> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Import.IMPORT.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Import.IMPORT.CREATED_AT;
    }

    @Override
    public Field<Integer> field3() {
        return Import.IMPORT.CREATED_BY;
    }

    @Override
    public Field<Integer> field4() {
        return Import.IMPORT.NAMESPACE_ID;
    }

    @Override
    public Field<String> field5() {
        return Import.IMPORT.SOURCE;
    }

    @Override
    public Field<String> field6() {
        return Import.IMPORT.LABEL;
    }

    @Override
    public Field<Integer> field7() {
        return Import.IMPORT.NUMBER_OF_ELEMENTS;
    }

    @Override
    public Field<ProcessStatus> field8() {
        return Import.IMPORT.STATUS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreatedAt();
    }

    @Override
    public Integer component3() {
        return getCreatedBy();
    }

    @Override
    public Integer component4() {
        return getNamespaceId();
    }

    @Override
    public String component5() {
        return getSource();
    }

    @Override
    public String component6() {
        return getLabel();
    }

    @Override
    public Integer component7() {
        return getNumberOfElements();
    }

    @Override
    public ProcessStatus component8() {
        return getStatus();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreatedAt();
    }

    @Override
    public Integer value3() {
        return getCreatedBy();
    }

    @Override
    public Integer value4() {
        return getNamespaceId();
    }

    @Override
    public String value5() {
        return getSource();
    }

    @Override
    public String value6() {
        return getLabel();
    }

    @Override
    public Integer value7() {
        return getNumberOfElements();
    }

    @Override
    public ProcessStatus value8() {
        return getStatus();
    }

    @Override
    public ImportRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ImportRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ImportRecord value3(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ImportRecord value4(Integer value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public ImportRecord value5(String value) {
        setSource(value);
        return this;
    }

    @Override
    public ImportRecord value6(String value) {
        setLabel(value);
        return this;
    }

    @Override
    public ImportRecord value7(Integer value) {
        setNumberOfElements(value);
        return this;
    }

    @Override
    public ImportRecord value8(ProcessStatus value) {
        setStatus(value);
        return this;
    }

    @Override
    public ImportRecord values(Integer value1, LocalDateTime value2, Integer value3, Integer value4, String value5, String value6, Integer value7, ProcessStatus value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ImportRecord
     */
    public ImportRecord() {
        super(Import.IMPORT);
    }

    /**
     * Create a detached, initialised ImportRecord
     */
    public ImportRecord(Integer id, LocalDateTime createdAt, Integer createdBy, Integer namespaceId, String source, String label, Integer numberOfElements, ProcessStatus status) {
        super(Import.IMPORT);

        setId(id);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setNamespaceId(namespaceId);
        setSource(source);
        setLabel(label);
        setNumberOfElements(numberOfElements);
        setStatus(status);
    }

    /**
     * Create a detached, initialised ImportRecord
     */
    public ImportRecord(de.dataelementhub.dal.jooq.tables.pojos.Import value) {
        super(Import.IMPORT);

        if (value != null) {
            setId(value.getId());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setNamespaceId(value.getNamespaceId());
            setSource(value.getSource());
            setLabel(value.getLabel());
            setNumberOfElements(value.getNumberOfElements());
            setStatus(value.getStatus());
        }
    }
}
