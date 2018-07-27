import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.Result
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import java.sql.DriverManager


/**
 * Created by Dilip Maharjan on 26/07/2018
 */

fun dslContext(): DSLContext? {
    try {
        Class.forName("org.sqlite.JDBC")
        val conn = DriverManager.getConnection("jdbc:sqlite:blog.sqlite")
        return DSL.using(conn, SQLDialect.SQLITE)
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}

fun insert(dslContext: DSLContext): Int {
    return dslContext.execute("INSERT INTO authors(name)values(\"Philip\")")
}

fun getAuthors(dslContext: DSLContext): Result<Record> {
    return dslContext.select().from("authors").fetch()
}

fun getAuthor(dslContext: DSLContext, id: Int): Result<Record> {
    return dslContext.select().from("authors").where("id=$id").fetch()
}

fun update(dslContext: DSLContext, id: Int, value: String): Int {
    return dslContext.execute("UPDATE authors set name=\"$value\" where id=$id")
}

fun delete(dslContext: DSLContext, id: Int): Int {
    return dslContext.execute("DELETE FROM authors WHERE id=$id")
}

fun main(args: Array<String>) {
    val dslContext = dslContext()
    dslContext?.apply {
        //        insert(dslContext)
        val authors = getAuthors(dslContext)
        for (record in authors) {
            println(record.getValue("name"))
        }

        val author = getAuthor(dslContext, 1)
        for (record in author) {
            println("Author with id ${record.getValue("id")} is ${record.getValue("name")}")
        }
        if (update(dslContext, 3, "Max") == 1) {
            println("Success")
        }

        if (delete(dslContext, 2) == 1) {
            println("Deleted")
        }
    }

}
