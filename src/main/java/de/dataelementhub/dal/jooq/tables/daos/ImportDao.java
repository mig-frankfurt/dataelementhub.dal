/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.daos;


import de.dataelementhub.dal.jooq.enums.ProcessStatus;
import de.dataelementhub.dal.jooq.tables.Import;
import de.dataelementhub.dal.jooq.tables.records.ImportRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImportDao extends DAOImpl<ImportRecord, de.dataelementhub.dal.jooq.tables.pojos.Import, Integer> {

    /**
     * Create a new ImportDao without any configuration
     */
    public ImportDao() {
        super(Import.IMPORT, de.dataelementhub.dal.jooq.tables.pojos.Import.class);
    }

    /**
     * Create a new ImportDao with an attached configuration
     */
    public ImportDao(Configuration configuration) {
        super(Import.IMPORT, de.dataelementhub.dal.jooq.tables.pojos.Import.class, configuration);
    }

    @Override
    public Integer getId(de.dataelementhub.dal.jooq.tables.pojos.Import object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Import.IMPORT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchById(Integer... values) {
        return fetch(Import.IMPORT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.dataelementhub.dal.jooq.tables.pojos.Import fetchOneById(Integer value) {
        return fetchOne(Import.IMPORT.ID, value);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Import.IMPORT.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(Import.IMPORT.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfCreatedBy(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Import.IMPORT.CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchByCreatedBy(Integer... values) {
        return fetch(Import.IMPORT.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>namespace_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfNamespaceId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Import.IMPORT.NAMESPACE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>namespace_id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchByNamespaceId(Integer... values) {
        return fetch(Import.IMPORT.NAMESPACE_ID, values);
    }

    /**
     * Fetch records that have <code>source BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfSource(String lowerInclusive, String upperInclusive) {
        return fetchRange(Import.IMPORT.SOURCE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchBySource(String... values) {
        return fetch(Import.IMPORT.SOURCE, values);
    }

    /**
     * Fetch records that have <code>label BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfLabel(String lowerInclusive, String upperInclusive) {
        return fetchRange(Import.IMPORT.LABEL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>label IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchByLabel(String... values) {
        return fetch(Import.IMPORT.LABEL, values);
    }

    /**
     * Fetch records that have <code>uuid BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfUuid(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(Import.IMPORT.UUID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>uuid IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchByUuid(UUID... values) {
        return fetch(Import.IMPORT.UUID, values);
    }

    /**
     * Fetch records that have <code>number_of_elements BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfNumberOfElements(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Import.IMPORT.NUMBER_OF_ELEMENTS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>number_of_elements IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchByNumberOfElements(Integer... values) {
        return fetch(Import.IMPORT.NUMBER_OF_ELEMENTS, values);
    }

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchRangeOfStatus(ProcessStatus lowerInclusive, ProcessStatus upperInclusive) {
        return fetchRange(Import.IMPORT.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.Import> fetchByStatus(ProcessStatus... values) {
        return fetch(Import.IMPORT.STATUS, values);
    }
}
