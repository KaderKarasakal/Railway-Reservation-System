import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RailwayReservationSystem {
    private List<Passenger> passengers = new ArrayList<>();
    private List<Tren> trens = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public RailwayReservationSystem(List<Passenger> passengers, List<Tren> trens, List<Reservation> reservations) {
        this.passengers = passengers;
        this.trens = trens;
        this.reservations = reservations;
    }
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
    public void addTren(Tren tren){
        trens.add(tren);
    }
    public void makeReservation(Passenger passenger, Tren tren){
        Reservation reservation = new Reservation();
        reservation.setPassenger(passenger);
        reservation.setTren(tren);
        reservation.setReservationDate(new Date());
        reservation.setReservationNumber("N"+this.reservations.size() + 1 );

        this.reservations.add(reservation);
        System.out.println("Reservation made success");
        System.out.println("Reservation No:" + reservation.getReservationNumber());

    }

    @Override
    public String toString() {
        return "RailwayReservationSystem{" +
                "passengers=" + passengers +
                ", trens=" + trens +
                ", reservations=" + reservations +
                '}';
    }

    public RailwayReservationSystem() {
    }

    public void displayReservations(){
        System.out.println("All reservations");
        for(Reservation res:this.reservations){
            System.out.println(
                    "Reservation No: "+ res.getReservationNumber()+
                            "  Reservation Name: "+ res.getPassenger().getFirstName()+
                                "  Reservation Tren: "+ res.getTren().getTrenNumber()
            );
        }





    }






}
