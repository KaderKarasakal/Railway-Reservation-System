import java.util.Date;
public class Main {
    public static void main(String[] args) {
        RailwayReservationSystem railwayReservationSystem = new RailwayReservationSystem();

        Passenger passenger1 = new Passenger("Kader","Karasakal","09994446","kader@sdfg.com");
        Passenger passenger2 = new Passenger("Burak","Yasar","034562344","burak@hnm.com");

        Tren tren1 = new Tren("T005","A5","Adana",new Date());
        Tren tren2 = new Tren("T010","B09","Samsun",new Date());

        railwayReservationSystem.addPassenger(passenger1);
        railwayReservationSystem.addPassenger(passenger2);
        railwayReservationSystem.addTren(tren1);
        railwayReservationSystem.addTren(tren2);

        railwayReservationSystem.makeReservation(passenger1,tren1);
        railwayReservationSystem.makeReservation(passenger2,tren2);

        railwayReservationSystem.displayReservations();


    }
}