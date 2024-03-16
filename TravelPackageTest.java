import org.junit.Test;
import static org.junit.Assert.*;

public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 10);
        Destination destination = new Destination("Test Destination");
        travelPackage.addDestination(destination);
        assertTrue(travelPackage.getItinerary().contains(destination));
    }

    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 10);
        Passenger passenger = new Passenger("John", PassengerType.STANDARD, 100.0);
        travelPackage.addPassenger(passenger);
        assertTrue(travelPackage.getPassengers().contains(passenger));
    }
}
