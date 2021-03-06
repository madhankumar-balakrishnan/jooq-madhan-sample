/*
 * This file is generated by jOOQ.
*/
package com.jooq.madhan.sample.domain;


import com.jooq.madhan.sample.domain.tables.Author;
import com.jooq.madhan.sample.domain.tables.AuthorBook;
import com.jooq.madhan.sample.domain.tables.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Jooqschema extends SchemaImpl {

    private static final long serialVersionUID = 1774444939;

    /**
     * The reference instance of <code>jooqschema</code>
     */
    public static final Jooqschema JOOQSCHEMA = new Jooqschema();

    /**
     * The table <code>jooqschema.author</code>.
     */
    public final Author AUTHOR = com.jooq.madhan.sample.domain.tables.Author.AUTHOR;

    /**
     * The table <code>jooqschema.author_book</code>.
     */
    public final AuthorBook AUTHOR_BOOK = com.jooq.madhan.sample.domain.tables.AuthorBook.AUTHOR_BOOK;

    /**
     * The table <code>jooqschema.book</code>.
     */
    public final Book BOOK = com.jooq.madhan.sample.domain.tables.Book.BOOK;

    /**
     * No further instances allowed
     */
    private Jooqschema() {
        super("jooqschema", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Author.AUTHOR,
            AuthorBook.AUTHOR_BOOK,
            Book.BOOK);
    }
}
