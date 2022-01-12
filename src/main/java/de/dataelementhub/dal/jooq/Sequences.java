/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq;


import org.jooq.Sequence;
import org.jooq.impl.Internal;


/**
 * Convenience access to all sequences in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.concepts_id_seq</code>
     */
    public static final Sequence<Integer> CONCEPTS_ID_SEQ = Internal.createSequence("concepts_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.config_id_seq</code>
     */
    public static final Sequence<Integer> CONFIG_ID_SEQ = Internal.createSequence("config_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.definition_id_seq</code>
     */
    public static final Sequence<Integer> DEFINITION_ID_SEQ = Internal.createSequence("definition_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.dehub_user_id_seq</code>
     */
    public static final Sequence<Integer> DEHUB_USER_ID_SEQ = Internal.createSequence("dehub_user_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.element_id_seq</code>
     */
    public static final Sequence<Integer> ELEMENT_ID_SEQ = Internal.createSequence("element_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.import_id_seq</code>
     */
    public static final Sequence<Integer> IMPORT_ID_SEQ = Internal.createSequence("import_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.scoped_identifier_id_seq</code>
     */
    public static final Sequence<Integer> SCOPED_IDENTIFIER_ID_SEQ = Internal.createSequence("scoped_identifier_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.slot_id_seq</code>
     */
    public static final Sequence<Integer> SLOT_ID_SEQ = Internal.createSequence("slot_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.source_id_seq</code>
     */
    public static final Sequence<Integer> SOURCE_ID_SEQ = Internal.createSequence("source_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.staging_id_seq</code>
     */
    public static final Sequence<Integer> STAGING_ID_SEQ = Internal.createSequence("staging_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);
}