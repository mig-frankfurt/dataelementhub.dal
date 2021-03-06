/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.daos;


import de.dataelementhub.dal.jooq.enums.RelationType;
import de.dataelementhub.dal.jooq.tables.ElementRelation;
import de.dataelementhub.dal.jooq.tables.records.ElementRelationRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record4;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementRelationDao extends DAOImpl<ElementRelationRecord, de.dataelementhub.dal.jooq.tables.pojos.ElementRelation, Record4<String, Integer, String, Integer>> {

    /**
     * Create a new ElementRelationDao without any configuration
     */
    public ElementRelationDao() {
        super(ElementRelation.ELEMENT_RELATION, de.dataelementhub.dal.jooq.tables.pojos.ElementRelation.class);
    }

    /**
     * Create a new ElementRelationDao with an attached configuration
     */
    public ElementRelationDao(Configuration configuration) {
        super(ElementRelation.ELEMENT_RELATION, de.dataelementhub.dal.jooq.tables.pojos.ElementRelation.class, configuration);
    }

    @Override
    public Record4<String, Integer, String, Integer> getId(de.dataelementhub.dal.jooq.tables.pojos.ElementRelation object) {
        return compositeKeyRecord(object.getLeftUrn(), object.getLeftSource(), object.getRightUrn(), object.getRightSource());
    }

    /**
     * Fetch records that have <code>left_urn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchRangeOfLeftUrn(String lowerInclusive, String upperInclusive) {
        return fetchRange(ElementRelation.ELEMENT_RELATION.LEFT_URN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>left_urn IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchByLeftUrn(String... values) {
        return fetch(ElementRelation.ELEMENT_RELATION.LEFT_URN, values);
    }

    /**
     * Fetch records that have <code>left_source BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchRangeOfLeftSource(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ElementRelation.ELEMENT_RELATION.LEFT_SOURCE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>left_source IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchByLeftSource(Integer... values) {
        return fetch(ElementRelation.ELEMENT_RELATION.LEFT_SOURCE, values);
    }

    /**
     * Fetch records that have <code>right_urn BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchRangeOfRightUrn(String lowerInclusive, String upperInclusive) {
        return fetchRange(ElementRelation.ELEMENT_RELATION.RIGHT_URN, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>right_urn IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchByRightUrn(String... values) {
        return fetch(ElementRelation.ELEMENT_RELATION.RIGHT_URN, values);
    }

    /**
     * Fetch records that have <code>right_source BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchRangeOfRightSource(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ElementRelation.ELEMENT_RELATION.RIGHT_SOURCE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>right_source IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchByRightSource(Integer... values) {
        return fetch(ElementRelation.ELEMENT_RELATION.RIGHT_SOURCE, values);
    }

    /**
     * Fetch records that have <code>relation BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchRangeOfRelation(RelationType lowerInclusive, RelationType upperInclusive) {
        return fetchRange(ElementRelation.ELEMENT_RELATION.RELATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>relation IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchByRelation(RelationType... values) {
        return fetch(ElementRelation.ELEMENT_RELATION.RELATION, values);
    }

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchRangeOfCreatedBy(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(ElementRelation.ELEMENT_RELATION.CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchByCreatedBy(Integer... values) {
        return fetch(ElementRelation.ELEMENT_RELATION.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ElementRelation.ELEMENT_RELATION.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.ElementRelation> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(ElementRelation.ELEMENT_RELATION.CREATED_AT, values);
    }
}
