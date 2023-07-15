// User should be able to search flights bases on arrival and destination and date of travel
// User login
// Select flight based on time/preference
// Enter prsonal details
// Payment 
// Confirmation mail/notification


// NFR
// 1. Scalable
// 2. Reliable
// 3. Modular


// Actors
// 1. Admin
// 2. Customers(users)
// 3.Airline Authority


// Enitity
// 1.Users
// 2. Flights
// 3.Booking
// 4. Payment
// 5. Notification




// 1. Entities: - ------
class FlightBookingSystem{
	List<Flight> flight;
	List <User> user;

	public void getFlightDetails(Airport start, Airport destination , TimeStamp dateTime )
	public boolean bookFlight(Flight flight, User user, PaymentInfo paymentInfo);
}


class Flight{
	String FlightNumber;
	AirlineCompany airlineCompany;
	int numberOfSeats;
	List<Seat> seat;
	List <Schedule> schedule;
}


class Airline{
	String name;
	List<Flight> flights;
}

class AirlineCompany{
	int id;
	String name;
	// add or remove flights
}

class Seat{
	String seatNumber;
	SeatClassName seatClassName;//can also be an enum
}

public enum SeatClassName{
	BUSINESS, ECONOMY, FIRST
}

class Schedule{
	Flight flight;
	Airport start;
	Airport destination;
	TimeStamp start;
	TimeStamp end;
	FlightStatus status;
	List<FlightSeat> fare; // for dynamic pricing of the flight seat fare
}

public enum FlightStatus{
	DELAYED , ONTIME, CANCELLED
}

class FlightSeat extends Seat{
	int price;
	SeatStatus status;
}

public enum SeatStatus{
	OPEN, BOOKED;
}

class Airport{
	String name;
	Address address;
	List<Flights> flights;
}

class TimeStamp{
	Date dateTime;
}

class User{
	int userid;
}

// Now since a user can be a guest(only to search and see) / customer(member of the syetem)
class Guest extends User{

	public Account createAccount();
}

class Customer extends User{
	
	Account account;
}

class Account {

	String name;
	String email;
	String phoneNumber;
	String userName;
	String password;

	List<Booking> booking;
}

class Booking {
	Flight flight;
	User user;
	Date dateTime;
	String pnr;
	Airport start;
	Airport destination;
}

class PaymentInfo{
	PaymentType paymentType;
	double totalAmount;
	Date paymentDate;
	String transactionId;
	PaymentStatus paymentStatus
}

public enum PaymentStatus{

	UNPAID, PENDING, COMPLETED, DECLINED, CANCELLED, REFUNDED;
}

public enum PaymentType {

	CREDIT_CARD, DEBIT_CARD, NET_BANKING, UPI;
}