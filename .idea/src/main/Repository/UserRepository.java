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

    public void addUser(User newUser) {
        String query = "INSERT INTO users (id, username, email, number) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, newUser.getId());
            statement.setString(2, newUser.getUsername());
            statement.setString(3, newUser.getEmail());
            statement.setInt(4, newUser.getPhone_number());
            statement.executeUpdate();
            System.out.println("User" + newUser.getUsername + "added successfully.");
        }
    }

    public void updateUsername(String name, int userId){
        String query = "UPDATE users SET username = ?, WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, userId);
            statement.executeUpdate();
            System.out.println("User " + userId + " name updated to" + name " successfully.");
        }
    }

    //implement later
    public void updateUserNumber(){
    }

    //implement later
    public void updateUserEmail(){
    }

}