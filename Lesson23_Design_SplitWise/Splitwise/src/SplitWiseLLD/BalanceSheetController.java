package SplitWiseLLD;

import SplitWiseLLD.Expense.split.Split;
import SplitWiseLLD.user.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {
    public void updateUserExpenseBalanceSheet(User expensePaidByUser, List<Split> splitDetails, double totalExpenseAmount){
        UserExpenseBalanceSheet paidByUserExpenseSheet = expensePaidByUser.getUserExpenseBalanceSheet();
        paidByUserExpenseSheet.setTotalPayment(paidByUserExpenseSheet.getTotalPayment()+totalExpenseAmount);
        for(Split split : splitDetails){
            User userOwe = split.getUser();
            UserExpenseBalanceSheet oweUserExpenseSheet = userOwe.getUserExpenseBalanceSheet();
            double oweAmount = split.getAmountOwe();
            if(expensePaidByUser.getUserId().equals(userOwe.getUserId())){
                paidByUserExpenseSheet.setTotalValueExpense(paidByUserExpenseSheet.totalValueExpense+oweAmount);
            }
            else{
                paidByUserExpenseSheet.setTotalYouGetBack(paidByUserExpenseSheet.totalYouGetBack+oweAmount);
                Balance userOweBalance;
                if(paidByUserExpenseSheet.getUserVsBalance().containsKey(userOwe.getUserId())){
                    userOweBalance = paidByUserExpenseSheet.getUserVsBalance().get(userOwe.getUserId());
                }
                else{
                    userOweBalance = new Balance();
                    paidByUserExpenseSheet.getUserVsBalance().put(userOwe.getUserId(), userOweBalance);
                }
                userOweBalance.setGetBack(userOweBalance.getGetBack()+oweAmount);

                //update the balance sheet of owe user
                oweUserExpenseSheet.setTotalYouOwe(oweUserExpenseSheet.getTotalYouOwe() + oweAmount);
                oweUserExpenseSheet.setTotalValueExpense(oweUserExpenseSheet.getTotalValueExpense() + oweAmount);

                Balance userPaidBalance;
                if(oweUserExpenseSheet.getUserVsBalance().containsKey(expensePaidByUser.getUserId())){
                    userPaidBalance = oweUserExpenseSheet.getUserVsBalance().get(expensePaidByUser.getUserId());
                }
                else{
                    userPaidBalance = new Balance();
                    oweUserExpenseSheet.getUserVsBalance().put(expensePaidByUser.getUserId(), userPaidBalance);
                }
                userPaidBalance.setAmountOwe(userPaidBalance.getAmountOwe() + oweAmount);


            }
        }
    }
    public void showBalanceSheetOfUser(User user){
        System.out.println("--------------------------------------------------");
        System.out.println("SplitWiseLLD.Balance Sheet of User Id - "+user.getUserId() + " with UserName -> "+user.getUserName());
        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();
        System.out.println("Total Your Expenses: "+userExpenseBalanceSheet.getTotalValueExpense());
        System.out.println("Total Your GetBack: "+userExpenseBalanceSheet.getTotalYouGetBack());
        System.out.println("Total Your YourOwe: "+userExpenseBalanceSheet.getTotalYouOwe());
        System.out.println("Total Payment Made: "+userExpenseBalanceSheet.getTotalPayment());
        for(Map.Entry<String,Balance> map : userExpenseBalanceSheet.getUserVsBalance().entrySet()){
            System.out.println("userID: "+map.getKey()+" YouGetBack: "+map.getValue().getBack +"YouGetOwe: "+map.getValue().getAmountOwe());
        }
        System.out.println("------------------------------------------");
    }
}
