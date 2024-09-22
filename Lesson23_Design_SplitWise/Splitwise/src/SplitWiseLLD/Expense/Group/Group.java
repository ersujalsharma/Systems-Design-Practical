package SplitWiseLLD.Expense.Group;

import SplitWiseLLD.Expense.Expense;
import SplitWiseLLD.Expense.ExpenseController;
import SplitWiseLLD.Expense.ExpenseSplitFactory;
import SplitWiseLLD.Expense.ExpenseSplitType;
import SplitWiseLLD.Expense.split.ExpenseSplit;
import SplitWiseLLD.Expense.split.Split;
import SplitWiseLLD.user.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<User> groupMembers;
    List<Expense> expenseList;
    ExpenseController expenseController;
    Group(){
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }
    public void addMember(User member){
        groupMembers.add(member);
    }
    public String getGroupId(){
        return groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public Expense createExpense(String expenseId, String description, double expenseAmount, List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
//        ExpenseSplit expenceSplit = ExpenseSplitFactory.getExpenceSplit(splitType);
//        expenceSplit.validateSplit(splitDetails,expenseAmount);
        Expense expense = expenseController.createExpense(expenseId,description,expenseAmount,splitDetails,splitType,paidByUser);
        expenseList.add(expense);
        return expense;
    }
}
