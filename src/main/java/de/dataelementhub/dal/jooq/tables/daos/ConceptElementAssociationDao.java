/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.daos;


import de.dataelementhub.dal.jooq.enums.RelationType;
import de.dataelementhub.dal.jooq.tables.ConceptElementAssociation;
import de.dataelementhub.dal.jooq.tables.records.ConceptElementAssociationRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConceptElementAssociationDao extends DAOImpl<ConceptElementAssociationRecord, de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation, Record2<Integer, Integer>> {

    /**
     * Create a new ConceptElementAssociationDao without any configuration
     */
    public ConceptElementAssociationDao() {
        super(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION, de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation.class);
    }

    /**
     * Create a new ConceptElementAssociationDao with an attached configuration
     */
    public ConceptElementAssociationDao(Configuration configuration) {
        super(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION, de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation.class, configuration);
    }

    @Override
    public Record2<Integer, Integer> getId(de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation object) {
        return compositeKeyRecord(object.getConceptId(), object.getScopedidentifierId());
    }

    /**
     * Fetch records that have <code>concept_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchRangeOfConceptId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.CONCEPT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>concept_id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchByConceptId(Integer... values) {
        return fetch(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.CONCEPT_ID, values);
    }

    /**
     * Fetch records that have <code>scopedidentifier_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchRangeOfScopedidentifierId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.SCOPEDIDENTIFIER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>scopedidentifier_id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchByScopedidentifierId(Integer... values) {
        return fetch(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.SCOPEDIDENTIFIER_ID, values);
    }

    /**
     * Fetch records that have <code>linktype BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchRangeOfLinktype(RelationType lowerInclusive, RelationType upperInclusive) {
        return fetchRange(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.LINKTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>linktype IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchByLinktype(RelationType... values) {
        return fetch(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.LINKTYPE, values);
    }

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchRangeOfCreatedBy(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchByCreatedBy(Integer... values) {
        return fetch(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ConceptElementAssociation> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(ConceptElementAssociation.CONCEPT_ELEMENT_ASSOCIATION.CREATED_AT, values);
    }
}
