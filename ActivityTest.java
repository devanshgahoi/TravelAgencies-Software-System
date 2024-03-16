import org.junit.Test;
import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void testHasAvailableSeats() {
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10);
        assertTrue(activity.hasAvailableSeats());
    }

    @Test
    public void testBookSeat() {
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10);
        assertTrue(activity.bookSeat());
    }

    @Test
    public void testCancelSeat() {
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10);
        activity.bookSeat();
        assertTrue(activity.cancelSeat());
    }
}
