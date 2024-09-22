package SplitWiseLLD;

import java.util.HashMap;
import java.util.Map;
public class UserExpenseBalanceSheet {
    Map<String,Balance> userVsBalance;
    double totalValueExpense;
    double totalPayment;
    double totalYouOwe;
    double totalYouGetBack;
    public UserExpenseBalanceSheet(){
        userVsBalance = new HashMap<>();
        totalValueExpense = 0;
        totalYouOwe = 0;
        totalYouGetBack = 0;
    }

    public Map<String, Balance> getUserVsBalance() {
        return userVsBalance;
    }

    public void setUserVsBalance(Map<String, Balance> userVsBalance) {
        this.userVsBalance = userVsBalance;
    }

    public double getTotalValueExpense() {
        return totalValueExpense;
    }

    public void setTotalValueExpense(double totalValueExpense) {
        this.totalValueExpense = totalValueExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }
}
