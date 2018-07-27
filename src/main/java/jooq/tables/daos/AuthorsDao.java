/*
 * This file is generated by jOOQ.
 */
package jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.tables.Authors;
import jooq.tables.records.AuthorsRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorsDao extends DAOImpl<AuthorsRecord, jooq.tables.pojos.Authors, Integer> {

    /**
     * Create a new AuthorsDao without any configuration
     */
    public AuthorsDao() {
        super(Authors.AUTHORS, jooq.tables.pojos.Authors.class);
    }

    /**
     * Create a new AuthorsDao with an attached configuration
     */
    public AuthorsDao(Configuration configuration) {
        super(Authors.AUTHORS, jooq.tables.pojos.Authors.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.tables.pojos.Authors object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.tables.pojos.Authors> fetchById(Integer... values) {
        return fetch(Authors.AUTHORS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.tables.pojos.Authors fetchOneById(Integer value) {
        return fetchOne(Authors.AUTHORS.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.tables.pojos.Authors> fetchByName(String... values) {
        return fetch(Authors.AUTHORS.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public jooq.tables.pojos.Authors fetchOneByName(String value) {
        return fetchOne(Authors.AUTHORS.NAME, value);
    }
}
