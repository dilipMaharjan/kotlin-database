/*
 * This file is generated by jOOQ.
 */
package jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.tables.Articles;
import jooq.tables.records.ArticlesRecord;

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
public class ArticlesDao extends DAOImpl<ArticlesRecord, jooq.tables.pojos.Articles, Integer> {

    /**
     * Create a new ArticlesDao without any configuration
     */
    public ArticlesDao() {
        super(Articles.ARTICLES, jooq.tables.pojos.Articles.class);
    }

    /**
     * Create a new ArticlesDao with an attached configuration
     */
    public ArticlesDao(Configuration configuration) {
        super(Articles.ARTICLES, jooq.tables.pojos.Articles.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.tables.pojos.Articles object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.tables.pojos.Articles> fetchById(Integer... values) {
        return fetch(Articles.ARTICLES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.tables.pojos.Articles fetchOneById(Integer value) {
        return fetchOne(Articles.ARTICLES.ID, value);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<jooq.tables.pojos.Articles> fetchByTitle(String... values) {
        return fetch(Articles.ARTICLES.TITLE, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<jooq.tables.pojos.Articles> fetchByContent(String... values) {
        return fetch(Articles.ARTICLES.CONTENT, values);
    }
}
