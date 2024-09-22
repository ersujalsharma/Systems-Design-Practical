package SplitWiseLLD.Expense.split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit {
    @Override
    public boolean validateSplit(List<Split> splitList, double totalAmount) {
        double sum = 0;
        for(Split split : splitList) {
            sum += split.getAmountOwe();
        }
        return sum==totalAmount;
    }
}
