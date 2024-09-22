package SplitWiseLLD.Expense.Group;

import SplitWiseLLD.user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;
    public GroupController(){
        groupList = new ArrayList<>();
    }
    public void createNewGroup(String groupId, String groupName, User createdByUser){
        Group group = new Group();
        group.setGroupId(groupId);
        group.setGroupName(groupName);
        group.addMember(createdByUser);
        groupList.add(group);
    }
    public Group getGroup(String groupId){
        for(Group group : groupList){
            if(group.getGroupId()==groupId){
                return group;
            }
        }
        return null;
    }
}
