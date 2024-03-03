package CostComputation;

import Ticket.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FourWheelerCostComputation implements CostComputation{
    @Override
    public int price(Ticket ticket) {
        return (int) ChronoUnit.MICROS.between(ticket.localDateTime, LocalDateTime.now())*60;
    }
}
