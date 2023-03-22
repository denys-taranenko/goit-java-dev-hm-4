package databaseutil;

import util.FileSQLReader;

import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {

    public static void main(String[] args) {

        try (Statement statement = Database.getInstance().getConnection().createStatement()){
            statement.executeUpdate(FileSQLReader.readFromFile("src/main/java/sql/init_db.sql"));
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
