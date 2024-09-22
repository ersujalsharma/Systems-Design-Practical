package SplitWiseLLD.Expense.split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {

    @Override
    public boolean validateSplit(List<Split> splitList, double totalAmount) {
        double amountShouldBePresent = totalAmount/splitList.size();
        for(Split split : splitList){
            if(split.getAmountOwe() !=amountShouldBePresent){
                return false;
            }
        }
        return true;
    }
}
