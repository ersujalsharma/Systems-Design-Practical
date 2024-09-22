package SplitWiseLLD.Expense;

import SplitWiseLLD.BalanceSheetController;
import SplitWiseLLD.Expense.split.ExpenseSplit;
import SplitWiseLLD.Expense.split.Split;
import SplitWiseLLD.user.User;

import java.util.List;

public class ExpenseController {
    BalanceSheetController balanceSheetController;
    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }
    public Expense createExpense(String expenseId, String description, double expenseAmount, List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
        ExpenseSplit expenceSplit = ExpenseSplitFactory.getExpenceSplit(splitType);
        expenceSplit.validateSplit(splitDetails,expenseAmount);
        Expense expense = new Expense(expenseId,expenseAmount,description,paidByUser,splitType,splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser,splitDetails,expenseAmount);
        return expense;
    }
}
