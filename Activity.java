public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int filledSeats;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.filledSeats = 0;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFilledSeats() {
        return filledSeats;
    }

    public void setFilledSeats(int filledSeats) {
        this.filledSeats = filledSeats;
    }

    // Method to check if there are available seats for the activity
    public boolean hasAvailableSeats() {
        return filledSeats < capacity;
    }

    // Method to book a seat for the activity
    public boolean bookSeat() {
        if (hasAvailableSeats()) {
            filledSeats++;
            return true;
        }
        return false;
    }

    // Method to cancel a booked seat for the activity
    public boolean cancelSeat() {
        if (filledSeats > 0) {
            filledSeats--;
            return true;
        }
        return false;
    }
}