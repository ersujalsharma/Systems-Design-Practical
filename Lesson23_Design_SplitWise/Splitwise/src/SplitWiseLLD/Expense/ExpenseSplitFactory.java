package SplitWiseLLD.Expense;

import SplitWiseLLD.Expense.split.EqualExpenseSplit;
import SplitWiseLLD.Expense.split.ExpenseSplit;
import SplitWiseLLD.Expense.split.PercentageExpenseSplit;
import SplitWiseLLD.Expense.split.UnEqualExpenseSplit;

public class ExpenseSplitFactory {
    public static ExpenseSplit getExpenceSplit(ExpenseSplitType expenseSplitType){
        if(expenseSplitType == ExpenseSplitType.EQUAL){
            return new EqualExpenseSplit();
        }
        else if(expenseSplitType == ExpenseSplitType.UNEQUAL){
            return new UnEqualExpenseSplit();
        }
        else if(expenseSplitType == ExpenseSplitType.PERCENTAGE){
            return new PercentageExpenseSplit();
        }
        return null;
    }
}
