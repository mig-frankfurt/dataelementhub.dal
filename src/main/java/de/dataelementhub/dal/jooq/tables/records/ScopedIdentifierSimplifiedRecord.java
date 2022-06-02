/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.ElementType;
import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.tables.ScopedIdentifierSimplified;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScopedIdentifierSimplifiedRecord extends TableRecordImpl<ScopedIdentifierSimplifiedRecord> implements Record9<Integer, String, Integer, Integer, Status, ElementType, Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.scoped_identifier_simplified.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.scoped_identifier_simplified.urn</code>.
     */
    public void setUrn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.urn</code>.
     */
    public String getUrn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.scoped_identifier_simplified.identifier</code>.
     */
    public void setIdentifier(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.identifier</code>.
     */
    public Integer getIdentifier() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.scoped_identifier_simplified.revision</code>.
     */
    public void setRevision(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.revision</code>.
     */
    public Integer getRevision() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.scoped_identifier_simplified.status</code>.
     */
    public void setStatus(Status value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.status</code>.
     */
    public Status getStatus() {
        return (Status) get(4);
    }

    /**
     * Setter for <code>public.scoped_identifier_simplified.element_type</code>.
     */
    public void setElementType(ElementType value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.element_type</code>.
     */
    public ElementType getElementType() {
        return (ElementType) get(5);
    }

    /**
     * Setter for <code>public.scoped_identifier_simplified.element_id</code>.
     */
    public void setElementId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.element_id</code>.
     */
    public Integer getElementId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.scoped_identifier_simplified.namespace_id</code>.
     */
    public void setNamespaceId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.scoped_identifier_simplified.namespace_id</code>.
     */
    public Integer getNamespaceId() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>public.scoped_identifier_simplified.namespace_urn</code>.
     */
    public void setNamespaceUrn(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>public.scoped_identifier_simplified.namespace_urn</code>.
     */
    public String getNamespaceUrn() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, Integer, Integer, Status, ElementType, Integer, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, Integer, Integer, Status, ElementType, Integer, Integer, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.ID;
    }

    @Override
    public Field<String> field2() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.URN;
    }

    @Override
    public Field<Integer> field3() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.IDENTIFIER;
    }

    @Override
    public Field<Integer> field4() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.REVISION;
    }

    @Override
    public Field<Status> field5() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.STATUS;
    }

    @Override
    public Field<ElementType> field6() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.ELEMENT_TYPE;
    }

    @Override
    public Field<Integer> field7() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.ELEMENT_ID;
    }

    @Override
    public Field<Integer> field8() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.NAMESPACE_ID;
    }

    @Override
    public Field<String> field9() {
        return ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED.NAMESPACE_URN;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUrn();
    }

    @Override
    public Integer component3() {
        return getIdentifier();
    }

    @Override
    public Integer component4() {
        return getRevision();
    }

    @Override
    public Status component5() {
        return getStatus();
    }

    @Override
    public ElementType component6() {
        return getElementType();
    }

    @Override
    public Integer component7() {
        return getElementId();
    }

    @Override
    public Integer component8() {
        return getNamespaceId();
    }

    @Override
    public String component9() {
        return getNamespaceUrn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUrn();
    }

    @Override
    public Integer value3() {
        return getIdentifier();
    }

    @Override
    public Integer value4() {
        return getRevision();
    }

    @Override
    public Status value5() {
        return getStatus();
    }

    @Override
    public ElementType value6() {
        return getElementType();
    }

    @Override
    public Integer value7() {
        return getElementId();
    }

    @Override
    public Integer value8() {
        return getNamespaceId();
    }

    @Override
    public String value9() {
        return getNamespaceUrn();
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value2(String value) {
        setUrn(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value3(Integer value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value4(Integer value) {
        setRevision(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value5(Status value) {
        setStatus(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value6(ElementType value) {
        setElementType(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value7(Integer value) {
        setElementId(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value8(Integer value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord value9(String value) {
        setNamespaceUrn(value);
        return this;
    }

    @Override
    public ScopedIdentifierSimplifiedRecord values(Integer value1, String value2, Integer value3, Integer value4, Status value5, ElementType value6, Integer value7, Integer value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScopedIdentifierSimplifiedRecord
     */
    public ScopedIdentifierSimplifiedRecord() {
        super(ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED);
    }

    /**
     * Create a detached, initialised ScopedIdentifierSimplifiedRecord
     */
    public ScopedIdentifierSimplifiedRecord(Integer id, String urn, Integer identifier, Integer revision, Status status, ElementType elementType, Integer elementId, Integer namespaceId, String namespaceUrn) {
        super(ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED);

        setId(id);
        setUrn(urn);
        setIdentifier(identifier);
        setRevision(revision);
        setStatus(status);
        setElementType(elementType);
        setElementId(elementId);
        setNamespaceId(namespaceId);
        setNamespaceUrn(namespaceUrn);
    }

    /**
     * Create a detached, initialised ScopedIdentifierSimplifiedRecord
     */
    public ScopedIdentifierSimplifiedRecord(de.dataelementhub.dal.jooq.tables.pojos.ScopedIdentifierSimplified value) {
        super(ScopedIdentifierSimplified.SCOPED_IDENTIFIER_SIMPLIFIED);

        if (value != null) {
            setId(value.getId());
            setUrn(value.getUrn());
            setIdentifier(value.getIdentifier());
            setRevision(value.getRevision());
            setStatus(value.getStatus());
            setElementType(value.getElementType());
            setElementId(value.getElementId());
            setNamespaceId(value.getNamespaceId());
            setNamespaceUrn(value.getNamespaceUrn());
        }
    }
}
