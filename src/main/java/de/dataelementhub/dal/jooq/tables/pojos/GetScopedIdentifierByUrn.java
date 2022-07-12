/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.pojos;


import de.dataelementhub.dal.jooq.enums.Status;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetScopedIdentifierByUrn implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer revision;
    private Integer identifier;
    private Integer createdBy;
    private Status  status;
    private Integer elementId;
    private Integer namespaceId;
    private Boolean hidden;

    public GetScopedIdentifierByUrn() {}

    public GetScopedIdentifierByUrn(GetScopedIdentifierByUrn value) {
        this.id = value.id;
        this.revision = value.revision;
        this.identifier = value.identifier;
        this.createdBy = value.createdBy;
        this.status = value.status;
        this.elementId = value.elementId;
        this.namespaceId = value.namespaceId;
        this.hidden = value.hidden;
    }

    public GetScopedIdentifierByUrn(
        Integer id,
        Integer revision,
        Integer identifier,
        Integer createdBy,
        Status  status,
        Integer elementId,
        Integer namespaceId,
        Boolean hidden
    ) {
        this.id = id;
        this.revision = revision;
        this.identifier = identifier;
        this.createdBy = createdBy;
        this.status = status;
        this.elementId = elementId;
        this.namespaceId = namespaceId;
        this.hidden = hidden;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.revision</code>.
     */
    public Integer getRevision() {
        return this.revision;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.revision</code>.
     */
    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.identifier</code>.
     */
    public Integer getIdentifier() {
        return this.identifier;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.identifier</code>.
     */
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.created_by</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.created_by</code>.
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.status</code>.
     */
    public Status getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.status</code>.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.element_id</code>.
     */
    public Integer getElementId() {
        return this.elementId;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.element_id</code>.
     */
    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.namespace_id</code>.
     */
    public Integer getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.namespace_id</code>.
     */
    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * Getter for <code>public.get_scoped_identifier_by_urn.hidden</code>.
     */
    public Boolean getHidden() {
        return this.hidden;
    }

    /**
     * Setter for <code>public.get_scoped_identifier_by_urn.hidden</code>.
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GetScopedIdentifierByUrn (");

        sb.append(id);
        sb.append(", ").append(revision);
        sb.append(", ").append(identifier);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(status);
        sb.append(", ").append(elementId);
        sb.append(", ").append(namespaceId);
        sb.append(", ").append(hidden);

        sb.append(")");
        return sb.toString();
    }
}
