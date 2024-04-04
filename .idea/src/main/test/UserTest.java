import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import .idea/src/main/model/User.java

class UserTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Create User")
    User testUser = new User(1, "Henry" "test@email.com", 6043744477);
    void create_user() {
        assertEquals(1, testUser.getId());
        assertEquals("Henry", testUser.getUsername());
        assertEquals("test@email.com", testUser.getEmail());
        assertEquals(6043744477, getPhone_number.());
    }

}