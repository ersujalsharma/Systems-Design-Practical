package SplitWiseLLD;

import SplitWiseLLD.Expense.ExpenseSplitType;
import SplitWiseLLD.Expense.Group.Group;
import SplitWiseLLD.Expense.Group.GroupController;
import SplitWiseLLD.Expense.split.Split;
import SplitWiseLLD.user.User;
import SplitWiseLLD.user.UserController;

import java.util.ArrayList;
import java.util.List;

public class SplitWise {
    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;
    SplitWise(){
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }
    public void demo(){
        setUpUserAndGroup();
        // Step1 : add members to the group
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUser("U2001"));
        group.addMember(userController.getUser("U3001"));

        // Step2 : create and expense inside Group;
        List<Split> splits = new ArrayList<>();
        splits.add(new Split(userController.getUser("U1001"),300));
        splits.add(new Split(userController.getUser("U2001"),300));
        splits.add(new Split(userController.getUser("U3001"),300));
        group.createExpense("Exp1001","BreakFast",900,splits, ExpenseSplitType.EQUAL,userController.getUser("U1001"));

        List<Split> splits2 = new ArrayList<>();
        splits2.add(new Split(userController.getUser("U1001"),400));
        splits2.add(new Split(userController.getUser("U2001"),100));
        group.createExpense("Exp2001","Lunch",500,splits2, ExpenseSplitType.UNEQUAL,userController.getUser("U2001"));

        for(User user : userController.getAllUsers()){
            balanceSheetController.showBalanceSheetOfUser(user);
        }
    }

    private void setUpUserAndGroup() {

        addUsersToSplitApp();
        User user1 = userController.getUser("U1001");
        groupController.createNewGroup("G1001","Outing with Friends",user1);
    }

    private void addUsersToSplitApp() {
        User user1 = new User("U1001","User1");
        User user2 = new User("U2001","User2");
        User user3 = new User("U3001","User3");
        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }
}
