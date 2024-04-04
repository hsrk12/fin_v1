import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import model.User;
public class UserRepository{

    private Connection connection;

    public void connect() {
        try {
            // Establish a connection to the SQLite database
            connection = DriverManager.getConnection("jdbc:sqlite:fin.db");
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUser(){

    }

    public void removeUser(){

    }


}