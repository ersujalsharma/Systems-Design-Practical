package SplitWiseLLD.Expense.split;

import java.util.List;

public interface ExpenseSplit {
    public boolean validateSplit(List<Split> splitList,double totalAmount);
}
