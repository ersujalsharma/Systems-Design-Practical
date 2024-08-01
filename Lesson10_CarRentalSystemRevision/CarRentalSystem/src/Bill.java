public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;
    Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmout();
        isBillPaid = false;
    }
    public double computeBillAmout(){
        return 100.0;
    }
}
