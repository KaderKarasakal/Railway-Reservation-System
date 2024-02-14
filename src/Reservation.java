import java.util.Date;

public class Reservation {
    private String reservationNumber;
    private Tren tren;
    private Passenger passenger;
    private Date reservationDate;

    public Reservation(String reservationNumber, Tren tren, Passenger passenger, Date reservationDate) {
        this.reservationNumber = reservationNumber;
        this.tren = tren;
        this.passenger = passenger;
        this.reservationDate = reservationDate;
    }

    public Reservation() {
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
