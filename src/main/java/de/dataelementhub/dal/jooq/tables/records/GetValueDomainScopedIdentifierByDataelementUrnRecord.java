/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.records;


import de.dataelementhub.dal.jooq.enums.Status;
import de.dataelementhub.dal.jooq.tables.GetValueDomainScopedIdentifierByDataelementUrn;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetValueDomainScopedIdentifierByDataelementUrnRecord extends TableRecordImpl<GetValueDomainScopedIdentifierByDataelementUrnRecord> implements Record8<Integer, Integer, Integer, Integer, Status, Integer, Integer, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.revision</code>.
     */
    public void setRevision(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.revision</code>.
     */
    public Integer getRevision() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.identifier</code>.
     */
    public void setIdentifier(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.identifier</code>.
     */
    public Integer getIdentifier() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.created_by</code>.
     */
    public void setCreatedBy(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.status</code>.
     */
    public void setStatus(Status value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.status</code>.
     */
    public Status getStatus() {
        return (Status) get(4);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_id</code>.
     */
    public void setElementId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.element_id</code>.
     */
    public Integer getElementId() {
        return (Integer) get(5);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.namespace_id</code>.
     */
    public void setNamespaceId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.namespace_id</code>.
     */
    public Integer getNamespaceId() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.hidden</code>.
     */
    public void setHidden(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>public.get_value_domain_scoped_identifier_by_dataelement_urn.hidden</code>.
     */
    public Boolean getHidden() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Integer, Status, Integer, Integer, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Integer, Integer, Status, Integer, Integer, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.ID;
    }

    @Override
    public Field<Integer> field2() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.REVISION;
    }

    @Override
    public Field<Integer> field3() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.IDENTIFIER;
    }

    @Override
    public Field<Integer> field4() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.CREATED_BY;
    }

    @Override
    public Field<Status> field5() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.STATUS;
    }

    @Override
    public Field<Integer> field6() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.ELEMENT_ID;
    }

    @Override
    public Field<Integer> field7() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.NAMESPACE_ID;
    }

    @Override
    public Field<Boolean> field8() {
        return GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN.HIDDEN;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getRevision();
    }

    @Override
    public Integer component3() {
        return getIdentifier();
    }

    @Override
    public Integer component4() {
        return getCreatedBy();
    }

    @Override
    public Status component5() {
        return getStatus();
    }

    @Override
    public Integer component6() {
        return getElementId();
    }

    @Override
    public Integer component7() {
        return getNamespaceId();
    }

    @Override
    public Boolean component8() {
        return getHidden();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getRevision();
    }

    @Override
    public Integer value3() {
        return getIdentifier();
    }

    @Override
    public Integer value4() {
        return getCreatedBy();
    }

    @Override
    public Status value5() {
        return getStatus();
    }

    @Override
    public Integer value6() {
        return getElementId();
    }

    @Override
    public Integer value7() {
        return getNamespaceId();
    }

    @Override
    public Boolean value8() {
        return getHidden();
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value2(Integer value) {
        setRevision(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value3(Integer value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value4(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value5(Status value) {
        setStatus(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value6(Integer value) {
        setElementId(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value7(Integer value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord value8(Boolean value) {
        setHidden(value);
        return this;
    }

    @Override
    public GetValueDomainScopedIdentifierByDataelementUrnRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Status value5, Integer value6, Integer value7, Boolean value8) {
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
     * Create a detached GetValueDomainScopedIdentifierByDataelementUrnRecord
     */
    public GetValueDomainScopedIdentifierByDataelementUrnRecord() {
        super(GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);
    }

    /**
     * Create a detached, initialised
     * GetValueDomainScopedIdentifierByDataelementUrnRecord
     */
    public GetValueDomainScopedIdentifierByDataelementUrnRecord(Integer id, Integer revision, Integer identifier, Integer createdBy, Status status, Integer elementId, Integer namespaceId, Boolean hidden) {
        super(GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);

        setId(id);
        setRevision(revision);
        setIdentifier(identifier);
        setCreatedBy(createdBy);
        setStatus(status);
        setElementId(elementId);
        setNamespaceId(namespaceId);
        setHidden(hidden);
    }

    /**
     * Create a detached, initialised
     * GetValueDomainScopedIdentifierByDataelementUrnRecord
     */
    public GetValueDomainScopedIdentifierByDataelementUrnRecord(de.dataelementhub.dal.jooq.tables.pojos.GetValueDomainScopedIdentifierByDataelementUrn value) {
        super(GetValueDomainScopedIdentifierByDataelementUrn.GET_VALUE_DOMAIN_SCOPED_IDENTIFIER_BY_DATAELEMENT_URN);

        if (value != null) {
            setId(value.getId());
            setRevision(value.getRevision());
            setIdentifier(value.getIdentifier());
            setCreatedBy(value.getCreatedBy());
            setStatus(value.getStatus());
            setElementId(value.getElementId());
            setNamespaceId(value.getNamespaceId());
            setHidden(value.getHidden());
        }
    }
}
