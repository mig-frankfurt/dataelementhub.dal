/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.daos;


import de.dataelementhub.dal.jooq.tables.UserSourceCredentials;
import de.dataelementhub.dal.jooq.tables.records.UserSourceCredentialsRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSourceCredentialsDao extends DAOImpl<UserSourceCredentialsRecord, de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials, Record2<Integer, Integer>> {

    /**
     * Create a new UserSourceCredentialsDao without any configuration
     */
    public UserSourceCredentialsDao() {
        super(UserSourceCredentials.USER_SOURCE_CREDENTIALS, de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials.class);
    }

    /**
     * Create a new UserSourceCredentialsDao with an attached configuration
     */
    public UserSourceCredentialsDao(Configuration configuration) {
        super(UserSourceCredentials.USER_SOURCE_CREDENTIALS, de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials.class, configuration);
    }

    @Override
    public Record2<Integer, Integer> getId(de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials object) {
        return compositeKeyRecord(object.getUserId(), object.getSourceId());
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials> fetchRangeOfUserId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(UserSourceCredentials.USER_SOURCE_CREDENTIALS.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials> fetchByUserId(Integer... values) {
        return fetch(UserSourceCredentials.USER_SOURCE_CREDENTIALS.USER_ID, values);
    }

    /**
     * Fetch records that have <code>credential BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials> fetchRangeOfCredential(String lowerInclusive, String upperInclusive) {
        return fetchRange(UserSourceCredentials.USER_SOURCE_CREDENTIALS.CREDENTIAL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>credential IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials> fetchByCredential(String... values) {
        return fetch(UserSourceCredentials.USER_SOURCE_CREDENTIALS.CREDENTIAL, values);
    }

    /**
     * Fetch records that have <code>source_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials> fetchRangeOfSourceId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(UserSourceCredentials.USER_SOURCE_CREDENTIALS.SOURCE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>source_id IN (values)</code>
     */
    public List<de.dataelementhub.dal.jooq.tables.pojos.UserSourceCredentials> fetchBySourceId(Integer... values) {
        return fetch(UserSourceCredentials.USER_SOURCE_CREDENTIALS.SOURCE_ID, values);
    }
}