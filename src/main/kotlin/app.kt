import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement


/**
 * Created by Dilip Maharjan on 26/07/2018
 */

fun stmt(): Statement? {
    try {
        Class.forName("org.sqlite.JDBC")
        return DriverManager.getConnection("jdbc:sqlite:blog.sqlite").createStatement()
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}

fun insert(stmt: Statement, value: String) {
    stmt.execute("INSERT INTO authors(name)values(\"$value\")")

}

fun createTable(stmt: Statement, sql: String) {
    stmt.execute(sql)
}

fun getAuthor(stmt: Statement, sql: String): ResultSet {
    return stmt.executeQuery(sql)
}

fun findById(stmt: Statement, id: Int): ResultSet {
    return stmt.executeQuery("SELECT * FROM authors where id=$id")
}

fun delete(stmt: Statement, id: Int) {
    stmt.execute("DELETE FROM authors where id=$id")
}

fun update(stmt: Statement, id: Int, author_name: String) {
    stmt.executeUpdate("UPDATE authors set name=\"$author_name\" WHERE id=$id")
}

fun deleteAll(stmt: Statement) {
    stmt.execute("DELETE FROM authors")
}

fun main(args: Array<String>) {

    val stmt = stmt()

    stmt?.apply {

        createTable(stmt, "CREATE TABLE  if not exists authors(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)")


        insert(stmt, "Dilip")

        val authors = getAuthor(stmt, "SELECT * from authors")

        while (authors.next()) {
            println(authors.getString("name"))
        }

        val author = findById(stmt, 5)
        while (author.next()) {
            println("Author name is : ${author.getString("name")}")
        }

//        delete(stmt, 1)
        update(stmt, 5, "Dilip")
//        deleteAll(stmt)
    }
}