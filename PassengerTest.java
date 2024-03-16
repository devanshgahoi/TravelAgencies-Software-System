import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testCanAffordActivity() {
        Passenger passenger = new Passenger("John", PassengerType.STANDARD, 100.0);
        assertFalse(passenger.canAffordActivity(150.0));
    }

    @Test
    public void testDeductActivityCost() {
        Passenger passenger = new Passenger("John", PassengerType.STANDARD, 100.0);
        double initialBalance = passenger.getBalance();
        passenger.deductActivityCost(50.0);
        assertEquals(initialBalance - 50.0, passenger.getBalance(), 0.0);
    }

    @Test
    public void testAddFunds() {
        Passenger passenger = new Passenger("John", PassengerType.STANDARD, 100.0);
        double initialBalance = passenger.getBalance();
        passenger.addFunds(50.0);
        assertEquals(initialBalance + 50.0, passenger.getBalance(), 0.0);
    }
}
