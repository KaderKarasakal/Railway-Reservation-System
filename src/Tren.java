import java.util.Date;

public class Tren {
    private String trenNumber;
    private String departure;
    private String destination;
    private Date date;

    public Tren(String trenNumber, String departure, String destination, Date date) {
        this.trenNumber = trenNumber;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
    }

    public Tren() {
    }

    public String getTrenNumber() {
        return trenNumber;
    }

    public void setTrenNumber(String trenNumber) {
        this.trenNumber = trenNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
