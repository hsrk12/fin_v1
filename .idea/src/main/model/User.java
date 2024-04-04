import java.util.ArrayList;
import java.util.List;

public class User{
    private int id;
    private String username;
    private String email;
    private int phone_number;

    public User(int id, String username, String email, int phone_number){
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone_number  = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return this.phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
}