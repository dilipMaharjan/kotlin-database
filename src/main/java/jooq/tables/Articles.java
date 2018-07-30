/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.DefaultSchema;
import jooq.Keys;
import jooq.tables.records.ArticlesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Articles extends TableImpl<ArticlesRecord> {

    private static final long serialVersionUID = 630303119;

    /**
     * The reference instance of <code>articles</code>
     */
    public static final Articles ARTICLES = new Articles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArticlesRecord> getRecordType() {
        return ArticlesRecord.class;
    }

    /**
     * The column <code>articles.id</code>.
     */
    public final TableField<ArticlesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>articles.title</code>.
     */
    public final TableField<ArticlesRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>articles.content</code>.
     */
    public final TableField<ArticlesRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>articles</code> table reference
     */
    public Articles() {
        this(DSL.name("articles"), null);
    }

    /**
     * Create an aliased <code>articles</code> table reference
     */
    public Articles(String alias) {
        this(DSL.name(alias), ARTICLES);
    }

    /**
     * Create an aliased <code>articles</code> table reference
     */
    public Articles(Name alias) {
        this(alias, ARTICLES);
    }

    private Articles(Name alias, Table<ArticlesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Articles(Name alias, Table<ArticlesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Articles(Table<O> child, ForeignKey<O, ArticlesRecord> key) {
        super(child, key, ARTICLES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ArticlesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ARTICLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ArticlesRecord> getPrimaryKey() {
        return Keys.PK_ARTICLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ArticlesRecord>> getKeys() {
        return Arrays.<UniqueKey<ArticlesRecord>>asList(Keys.PK_ARTICLES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Articles as(String alias) {
        return new Articles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Articles as(Name alias) {
        return new Articles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Articles rename(String name) {
        return new Articles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Articles rename(Name name) {
        return new Articles(name, null);
    }
}
