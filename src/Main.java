import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn=db.connect_to_db("database", "postgres", "123");
        //db.createTable(conn, "employee");
        //db.readData(conn, "employee");
        //db.updateName(conn, "employee", "Assan", "Nobody");
        //db.deleteTable(conn, "employee");
        //db.insertRow(conn, "employee", "Assan", "Astana");
    }
}