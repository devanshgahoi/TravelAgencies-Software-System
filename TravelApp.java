public class TravelApp {
    public static void main(String[] args) {
        // Creating a new travel package
        TravelPackage europeTrip = new TravelPackage("Europe Trip", 20);

        // Adding destinations to the travel package
        Destination paris = new Destination("Paris");
        paris.addActivity(new Activity("Eiffel Tower Tour", "Guided tour of the Eiffel Tower", 50, 10));
        paris.addActivity(new Activity("Louvre Museum Visit", "Visit the famous Louvre Museum", 40, 15));
        europeTrip.addDestination(paris);

        // Printing itinerary of the travel package
        System.out.println("Itinerary of the Europe Trip:");
        europeTrip.printItinerary();
        System.out.println();

        // Creating passengers
        Passenger passenger1 = new Passenger("Alice", PassengerType.STANDARD, 100);
        Passenger passenger2 = new Passenger("Bob", PassengerType.GOLD, 200);

        // Booking activities for passengers
        bookActivity(paris, passenger1, "Eiffel Tower Tour");
        bookActivity(paris, passenger2, "Louvre Museum Visit");

        // Printing details of passengers
        System.out.println("Details of Passengers:");
        printPassengerDetails(passenger1);
        printPassengerDetails(passenger2);
        System.out.println();

        // Printing available seats for activities
        System.out.println("Available Seats for Activities:");
        printAvailableSeats(paris);
    }

    // Method to book activity for a passenger
    private static void bookActivity(Destination destination, Passenger passenger, String activityName) {
        for (Activity activity : destination.getActivities()) {
            if (activity.getName().equals(activityName)) {
                if (activity.hasAvailableSeats() && passenger.canAffordActivity(activity.getCost())) {
                    activity.bookSeat();
                    passenger.deductActivityCost(activity.getCost());
                    System.out.println(passenger.getName() + " booked " + activityName + " at " + destination.getName());
                } else {
                    System.out.println("Booking failed for " + passenger.getName() + " for " + activityName);
                }
                return;
            }
        }
        System.out.println("Activity not found: " + activityName);
    }

    // Method to print details of a passenger
    private static void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        System.out.println("Passenger Type: " + passenger.getType());
        System.out.println("Passenger Balance: " + passenger.getBalance());
        System.out.println("Activities Booked:");
        // Here you can iterate through the activities booked by the passenger
        System.out.println();
    }

    // Method to print available seats for activities
    private static void printAvailableSeats(Destination destination) {
        for (Activity activity : destination.getActivities()) {
            int availableSeats = activity.getCapacity() - activity.getFilledSeats();
            System.out.println(activity.getName() + " at " + destination.getName() + ": Available Seats = " + availableSeats);
        }
    }
}
