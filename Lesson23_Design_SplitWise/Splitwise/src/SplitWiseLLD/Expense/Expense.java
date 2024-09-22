package SplitWiseLLD.Expense;

import SplitWiseLLD.Expense.split.Split;
import SplitWiseLLD.user.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    String expenseId;
    String description;
    double expenseAmount;
    User paidByUser;
    ExpenseSplitType splitType;
    List<Split> splitDetails = new ArrayList<>();
    public Expense(String expenseId,double expenseAmount,String description,User paidByUser,ExpenseSplitType splitType,List<Split> splitDetails){
        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.description = description;
        this.paidByUser  = paidByUser;
        this.splitType = splitType;
        this.splitDetails = splitDetails;
    }
}