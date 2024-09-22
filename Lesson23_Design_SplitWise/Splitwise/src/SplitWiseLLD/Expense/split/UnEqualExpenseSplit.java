package SplitWiseLLD.Expense.split;

import java.util.List;

public class UnEqualExpenseSplit implements ExpenseSplit {

    @Override
    public boolean validateSplit(List<Split> splitList, double totalAmount) {
        return false;
    }
}
