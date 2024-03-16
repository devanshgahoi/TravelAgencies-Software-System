public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType type;
    private double balance;

    public Passenger(String name, PassengerType type, double balance) {
        this.name = name;
        this.type = type;
        this.balance = balance;
        // Generating a unique passenger number (can be improved for a real-world scenario)
        this.passengerNumber = generatePassengerNumber();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public PassengerType getType() {
        return type;
    }

    public void setType(PassengerType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to generate a unique passenger number (for demonstration purposes)
    private int generatePassengerNumber() {
        return (int) (Math.random() * 1000) + 1;
    }

    // Method to check if the passenger can afford an activity
    public boolean canAffordActivity(double cost) {
        if (type == PassengerType.STANDARD) {
            return balance >= cost;
        } else if (type == PassengerType.GOLD) {
            // Apply 10% discount for gold passengers
            return balance >= cost * 0.9;
        } else {
            // Premium passengers can always afford activities
            return true;
        }
    }

    // Method to deduct the activity cost from the passenger's balance
    public void deductActivityCost(double cost) {
        if (type == PassengerType.STANDARD) {
            balance -= cost;
        } else if (type == PassengerType.GOLD) {
            // Apply 10% discount for gold passengers
            balance -= cost * 0.9;
        }
    }

    // Method to add funds to the passenger's balance
    public void addFunds(double amount) {
        balance += amount;
    }
}