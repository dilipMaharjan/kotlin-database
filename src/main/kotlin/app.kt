//import jooq.Tables.ARTICLES
//import jooq.Tables.AUTHORS
//import org.jooq.DSLContext
//import org.jooq.Record
//import org.jooq.Result
//import org.jooq.SQLDialect
//import org.jooq.impl.DSL
//import java.sql.DriverManager
//
//
///**
// * Created by Dilip Maharjan on 26/07/2018
// */
//
//fun dslContext(): DSLContext? {
//    try {
//        Class.forName("org.sqlite.JDBC")
//        val conn = DriverManager.getConnection("jdbc:sqlite:blog")
//        return DSL.using(conn, SQLDialect.SQLITE)
//    } catch (e: Exception) {
//        e.printStackTrace()
//    }
//    return null
//}
//
//
//fun insertArticle(dslContext: DSLContext, title: String, content: String, authorId: Int): Int {
//    return dslContext.insertInto(ARTICLES, ARTICLES.TITLE, ARTICLES.CONTENT, AUTHORS.ID).values(
//            title, content, authorId
//    ).execute()
//}
//
//fun insert(dslContext: DSLContext, name: String): Int {
//    return dslContext.insertInto(AUTHORS, AUTHORS.NAME).values(name).execute()
//}
//
//fun getAuthors(dslContext: DSLContext): Result<Record> {
//    return dslContext.select().from(AUTHORS).fetch()
//}
//
//fun getArticles(dslContext: DSLContext): Result<Record> {
//    return dslContext.select().from(ARTICLES).fetch()
//}
//
//fun getAuthor(dslContext: DSLContext, id: Int): Result<Record> {
//    return dslContext.select().from(AUTHORS).where(AUTHORS.ID.eq(id)).fetch()
//}
//
//fun update(dslContext: DSLContext, id: Int, name: String): Int {
//    return dslContext.update(AUTHORS).set(AUTHORS.NAME, name).where(AUTHORS.ID.eq(id)).execute()
//}
//
//fun delete(dslContext: DSLContext, id: Int): Int {
//    return dslContext.delete(AUTHORS).where(AUTHORS.ID.eq(id)).execute()
//}
//
//fun getAuthorByArticle(dslContext: DSLContext, articleId: Int): Result<Record> {
//    return dslContext.select().from(AUTHORS).leftJoin(ARTICLES).on(AUTHORS.ID.eq(articleId)).fetch()
//}
//
//fun main(args: Array<String>) {
//    val dslContext = dslContext()
//    dslContext?.apply {
//
//        //authors
//        //        insert(dslContext, "Jane")
//        update(dslContext, 3, "Jen")
//        delete(dslContext, 4)
//        val authors = getAuthors(dslContext)
//        for (record in authors) {
//            println(record.getValue("name"))
//        }
//
//        val author = getAuthor(dslContext, 3)
//        for (record in author) {
//            println("Author  with id ${record.getValue("id")} is ${record.getValue("name")}")
//        }
//
//        //articles
//
//        // insertArticle(dslContext, "title2", "Content2", 1)
//        val articles = getArticles(dslContext)
//
//        for (record in articles) {
//            println(record.getValue("title"))
//            println(record.getValue("content"))
//        }
//
//        val article_author = getAuthorByArticle(dslContext, 1)
//
//        for (record in article_author) {
//            println(record.getValue("name"))
//        }
//    }
//}
