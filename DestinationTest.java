import org.junit.Test;
import static org.junit.Assert.*;

public class DestinationTest {

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10);
        destination.addActivity(activity);
        assertTrue(destination.getActivities().contains(activity));
    }
}
