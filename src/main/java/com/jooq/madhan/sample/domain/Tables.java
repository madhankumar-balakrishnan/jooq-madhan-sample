/*
 * This file is generated by jOOQ.
*/
package com.jooq.madhan.sample.domain;


import com.jooq.madhan.sample.domain.tables.Author;
import com.jooq.madhan.sample.domain.tables.AuthorBook;
import com.jooq.madhan.sample.domain.tables.Book;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in jooqschema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>jooqschema.author</code>.
     */
    public static final Author AUTHOR = com.jooq.madhan.sample.domain.tables.Author.AUTHOR;

    /**
     * The table <code>jooqschema.author_book</code>.
     */
    public static final AuthorBook AUTHOR_BOOK = com.jooq.madhan.sample.domain.tables.AuthorBook.AUTHOR_BOOK;

    /**
     * The table <code>jooqschema.book</code>.
     */
    public static final Book BOOK = com.jooq.madhan.sample.domain.tables.Book.BOOK;
}
