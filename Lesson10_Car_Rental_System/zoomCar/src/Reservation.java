import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    public int createReserve(User user,Vehicle vehicle){
        reservationId = 12321;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
        return reservationId;
    }
}
