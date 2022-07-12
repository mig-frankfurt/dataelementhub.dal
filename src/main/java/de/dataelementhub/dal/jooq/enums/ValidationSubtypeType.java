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
public enum ValidationSubtypeType implements EnumType {

    PLAIN_TEXT("PLAIN_TEXT"),

    REGEX("REGEX"),

    INTEGER("INTEGER"),

    FLOAT("FLOAT"),

    INTEGERRANGE("INTEGERRANGE"),

    FLOATRANGE("FLOATRANGE"),

    DATE("DATE"),

    DATETIME("DATETIME"),

    TIME("TIME");

    private final String literal;

    private ValidationSubtypeType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "validation_subtype_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ValidationSubtypeType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ValidationSubtypeType.class, literal);
    }
}
