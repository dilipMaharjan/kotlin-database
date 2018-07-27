/*
 * This file is generated by jOOQ.
 */
package jooq;


import javax.annotation.Generated;

import jooq.tables.Authors;
import jooq.tables.records.AuthorsRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AuthorsRecord, Integer> IDENTITY_AUTHORS = Identities0.IDENTITY_AUTHORS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorsRecord> CONSTRAINT_D = UniqueKeys0.CONSTRAINT_D;
    public static final UniqueKey<AuthorsRecord> CONSTRAINT_D9 = UniqueKeys0.CONSTRAINT_D9;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AuthorsRecord, Integer> IDENTITY_AUTHORS = Internal.createIdentity(Authors.AUTHORS, Authors.AUTHORS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorsRecord> CONSTRAINT_D = Internal.createUniqueKey(Authors.AUTHORS, "CONSTRAINT_D", Authors.AUTHORS.ID);
        public static final UniqueKey<AuthorsRecord> CONSTRAINT_D9 = Internal.createUniqueKey(Authors.AUTHORS, "CONSTRAINT_D9", Authors.AUTHORS.NAME);
    }
}
