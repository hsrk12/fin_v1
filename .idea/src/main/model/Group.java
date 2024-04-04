import java.util.ArrayList;
import java.util.List;
import model.User;

public class group {
private int groupID;
private String groupName;
private List<User> group_members;

    public group(int groupID, String groupName, List<User> group_members) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.group_members = group_members;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getGroup_members() {
        return group_members;
    }

    public void setGroup_members(List<User> group_members) {
        this.group_members = group_members;
    }
}