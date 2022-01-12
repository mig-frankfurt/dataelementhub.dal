/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.enums;


import de.dataelementhub.dal.jooq.Public;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum RelationType implements EnumType {

    undefined("undefined"),

    equal("equal"),

    equivalent("equivalent"),

    wider("wider"),

    subsumes("subsumes"),

    narrower("narrower"),

    specializes("specializes"),

    inexact("inexact"),

    supersedes("supersedes");

    private final String literal;

    private RelationType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "relation_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}