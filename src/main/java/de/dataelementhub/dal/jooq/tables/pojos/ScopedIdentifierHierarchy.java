/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScopedIdentifierHierarchy implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer superId;
    private Integer subId;
    private Integer order;

    public ScopedIdentifierHierarchy() {}

    public ScopedIdentifierHierarchy(ScopedIdentifierHierarchy value) {
        this.superId = value.superId;
        this.subId = value.subId;
        this.order = value.order;
    }

    public ScopedIdentifierHierarchy(
        Integer superId,
        Integer subId,
        Integer order
    ) {
        this.superId = superId;
        this.subId = subId;
        this.order = order;
    }

    /**
     * Getter for <code>public.scoped_identifier_hierarchy.super_id</code>.
     */
    public Integer getSuperId() {
        return this.superId;
    }

    /**
     * Setter for <code>public.scoped_identifier_hierarchy.super_id</code>.
     */
    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    /**
     * Getter for <code>public.scoped_identifier_hierarchy.sub_id</code>.
     */
    public Integer getSubId() {
        return this.subId;
    }

    /**
     * Setter for <code>public.scoped_identifier_hierarchy.sub_id</code>.
     */
    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    /**
     * Getter for <code>public.scoped_identifier_hierarchy.order</code>.
     */
    public Integer getOrder() {
        return this.order;
    }

    /**
     * Setter for <code>public.scoped_identifier_hierarchy.order</code>.
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ScopedIdentifierHierarchy other = (ScopedIdentifierHierarchy) obj;
        if (this.superId == null) {
            if (other.superId != null)
                return false;
        }
        else if (!this.superId.equals(other.superId))
            return false;
        if (this.subId == null) {
            if (other.subId != null)
                return false;
        }
        else if (!this.subId.equals(other.subId))
            return false;
        if (this.order == null) {
            if (other.order != null)
                return false;
        }
        else if (!this.order.equals(other.order))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.superId == null) ? 0 : this.superId.hashCode());
        result = prime * result + ((this.subId == null) ? 0 : this.subId.hashCode());
        result = prime * result + ((this.order == null) ? 0 : this.order.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ScopedIdentifierHierarchy (");

        sb.append(superId);
        sb.append(", ").append(subId);
        sb.append(", ").append(order);

        sb.append(")");
        return sb.toString();
    }
}
