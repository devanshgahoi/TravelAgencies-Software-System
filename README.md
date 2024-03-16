# TravelAgencies-Software-System



## Overview

The Travel Agency Software System is a Java-based application designed to assist travel agencies in managing their travel packages, itineraries, destinations, activities, and passengers. The system allows travel agencies to create and maintain travel packages, manage passenger bookings, and provide detailed information about destinations and activities.

## Classes

### 1. TravelPackage

The `TravelPackage` class represents a travel package offered by the travel agency. It contains information about the package name, passenger capacity, itinerary, and list of passengers enrolled in the package.

**Attributes:**
- `name: String` - The name of the travel package.
- `passengerCapacity: int` - The maximum number of passengers the package can accommodate.
- `itinerary: List<Destination>` - The list of destinations included in the itinerary of the travel package.
- `passengers: List<Passenger>` - The list of passengers enrolled in the travel package.

**Methods:**
- `TravelPackage(name: String, passengerCapacity: int)` - Constructor to initialize a new travel package with the given name and passenger capacity.
- `addDestination(destination: Destination): void` - Adds a destination to the itinerary of the travel package.
- `addPassenger(passenger: Passenger): void` - Adds a passenger to the list of passengers enrolled in the travel package.
- `printItinerary(): void` - Prints the itinerary of the travel package including destinations and activities.
- `printPassengerList(): void` - Prints the list of passengers enrolled in the travel package.

### 2. Destination

The `Destination` class represents a destination included in a travel package itinerary. It contains information about the destination name and the list of activities available at the destination.

**Attributes:**
- `name: String` - The name of the destination.
- `activities: List<Activity>` - The list of activities available at the destination.

**Methods:**
- `Destination(name: String)` - Constructor to initialize a new destination with the given name.
- `addActivity(activity: Activity): void` - Adds an activity to the list of activities available at the destination.

### 3. Activity

The `Activity` class represents an activity available at a destination. It contains information about the activity name, description, cost, and capacity.

**Attributes:**
- `name: String` - The name of the activity.
- `description: String` - Description of the activity.
- `cost: double` - The cost of participating in the activity.
- `capacity: int` - The maximum number of participants allowed for the activity.

**Methods:**
- `Activity(name: String, description: String, cost: double, capacity: int)` - Constructor to initialize a new activity with the given details.
- `hasAvailableSeats(): boolean` - Checks if there are available seats for the activity.
- `bookSeat(): boolean` - Books a seat for the activity.
- `cancelSeat(): boolean` - Cancels a previously booked seat for the activity.

### 4. Passenger

The `Passenger` class represents a passenger enrolled in a travel package. It contains information about the passenger's name, passenger number, type, and balance.

**Attributes:**
- `name: String` - The name of the passenger.
- `passengerNumber: int` - The unique identifier of the passenger.
- `type: PassengerType` - The type of passenger (Standard, Gold, or Premium).
- `balance: double` - The balance amount available for the passenger (applicable for Standard and Gold passengers).

**Methods:**
- `Passenger(name: String, type: PassengerType, balance: double)` - Constructor to initialize a new passenger with the given details.
- `canAffordActivity(cost: double): boolean` - Checks if the passenger can afford the cost of an activity.
- `deductActivityCost(cost: double): void` - Deducts the cost of an activity from the passenger's balance.
- `addFunds(amount: double): void` - Adds funds to the passenger's balance.

### Enums

#### PassengerType

The `PassengerType` enum represents the type of passenger. It includes three types: Standard, Gold, and Premium.

## Unit Tests

Unit tests have been written for each class using the JUnit framework to ensure the correctness of their functionality. These tests cover various scenarios and edge cases to validate the behavior of the classes and their methods.

## Conclusion

The Travel Agency Software System provides a robust solution for travel agencies to manage their travel packages, itineraries, destinations, activities, and passengers effectively. It offers comprehensive features to create, maintain, and monitor travel packages, ensuring a seamless experience for both travel agencies and passengers.

---

This documentation provides an overview of the travel agency software system, descriptions of its classes, methods, attributes, and enums, along with unit tests to verify their functionality. Adjustments can be made based on specific project requirements and additional details as needed.
