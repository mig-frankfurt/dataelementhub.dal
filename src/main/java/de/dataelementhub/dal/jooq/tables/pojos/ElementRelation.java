/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.pojos;


import de.dataelementhub.dal.jooq.enums.RelationType;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String leftUrn;
    private Integer leftSource;
    private String rightUrn;
    private Integer rightSource;
    private RelationType relation;
    private Integer createdBy;
    private LocalDateTime createdAt;

    public ElementRelation() {}

    public ElementRelation(ElementRelation value) {
        this.leftUrn = value.leftUrn;
        this.leftSource = value.leftSource;
        this.rightUrn = value.rightUrn;
        this.rightSource = value.rightSource;
        this.relation = value.relation;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
    }

    public ElementRelation(
        String leftUrn,
        Integer leftSource,
        String rightUrn,
        Integer rightSource,
        RelationType relation,
        Integer createdBy,
        LocalDateTime createdAt
    ) {
        this.leftUrn = leftUrn;
        this.leftSource = leftSource;
        this.rightUrn = rightUrn;
        this.rightSource = rightSource;
        this.relation = relation;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }

    /**
     * Getter for <code>public.element_relation.left_urn</code>.
     */
    public String getLeftUrn() {
        return this.leftUrn;
    }

    /**
     * Setter for <code>public.element_relation.left_urn</code>.
     */
    public void setLeftUrn(String leftUrn) {
        this.leftUrn = leftUrn;
    }

    /**
     * Getter for <code>public.element_relation.left_source</code>.
     */
    public Integer getLeftSource() {
        return this.leftSource;
    }

    /**
     * Setter for <code>public.element_relation.left_source</code>.
     */
    public void setLeftSource(Integer leftSource) {
        this.leftSource = leftSource;
    }

    /**
     * Getter for <code>public.element_relation.right_urn</code>.
     */
    public String getRightUrn() {
        return this.rightUrn;
    }

    /**
     * Setter for <code>public.element_relation.right_urn</code>.
     */
    public void setRightUrn(String rightUrn) {
        this.rightUrn = rightUrn;
    }

    /**
     * Getter for <code>public.element_relation.right_source</code>.
     */
    public Integer getRightSource() {
        return this.rightSource;
    }

    /**
     * Setter for <code>public.element_relation.right_source</code>.
     */
    public void setRightSource(Integer rightSource) {
        this.rightSource = rightSource;
    }

    /**
     * Getter for <code>public.element_relation.relation</code>.
     */
    public RelationType getRelation() {
        return this.relation;
    }

    /**
     * Setter for <code>public.element_relation.relation</code>.
     */
    public void setRelation(RelationType relation) {
        this.relation = relation;
    }

    /**
     * Getter for <code>public.element_relation.created_by</code>.
     */
    public Integer getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>public.element_relation.created_by</code>.
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>public.element_relation.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>public.element_relation.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ElementRelation other = (ElementRelation) obj;
        if (this.leftUrn == null) {
            if (other.leftUrn != null)
                return false;
        }
        else if (!this.leftUrn.equals(other.leftUrn))
            return false;
        if (this.leftSource == null) {
            if (other.leftSource != null)
                return false;
        }
        else if (!this.leftSource.equals(other.leftSource))
            return false;
        if (this.rightUrn == null) {
            if (other.rightUrn != null)
                return false;
        }
        else if (!this.rightUrn.equals(other.rightUrn))
            return false;
        if (this.rightSource == null) {
            if (other.rightSource != null)
                return false;
        }
        else if (!this.rightSource.equals(other.rightSource))
            return false;
        if (this.relation == null) {
            if (other.relation != null)
                return false;
        }
        else if (!this.relation.equals(other.relation))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.leftUrn == null) ? 0 : this.leftUrn.hashCode());
        result = prime * result + ((this.leftSource == null) ? 0 : this.leftSource.hashCode());
        result = prime * result + ((this.rightUrn == null) ? 0 : this.rightUrn.hashCode());
        result = prime * result + ((this.rightSource == null) ? 0 : this.rightSource.hashCode());
        result = prime * result + ((this.relation == null) ? 0 : this.relation.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ElementRelation (");

        sb.append(leftUrn);
        sb.append(", ").append(leftSource);
        sb.append(", ").append(rightUrn);
        sb.append(", ").append(rightSource);
        sb.append(", ").append(relation);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdAt);

        sb.append(")");
        return sb.toString();
    }
}
