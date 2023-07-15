// User should be able to create an account into our application
// Search rooms based on date and application
// Select a particular room based on pref
// Make Payment to the application
// Confirmation and notification


// NFR
//  1. Scalable
// 2. Available/Reliable


// Actors
// Hotel Admin
// Customers


// Entity
// Booking
// Schedule
// Room
// User
// Payment
// 


class HotelBookingSystem{


	HashMap<Hotels,Address> hotels;
	List<User> user;

	public List<> getHotels(Schedule schedule);
	public bookHotel(Schdule schedule ,User user,  PaymentInfo paymentInfo);


}

class Hotel{

	List<Room> room;
	int hotelId;
	String hotelName;
	Address address;
	double rating;
	List<Comment> comment;
}

class Comment{
	String email;
	String commentDesc;
	String userName;
}

class Room{
	int roomNumber;
	int hotelId;
	List<RoomType> roomType;
	Status status;// room booked or not status
	int bedCount;
	double price;
	List<Amenties> amenty;
	List<Schedule> schedule;
}

class Address{
	String emailId;
	int mobNumber;
	int pinCode; //ZipCode
	String street;
	String city;
	String state;
	String country;	
}

class Schedule{
	Room room;
	TimeStamp checkInTime;
	TimeStamp checkoutTime;
	Date dateOfCheckin;

}

public enum Status{

	BOOKED ,  VACANT
}

class Amenties{

	int geyser;
	int television;
	int towels;
	boolean powerBackup;
	boolean lift;

}

class TimeStamp{
	Date dateTime;
}

public enum RoomType{

	SUITE, NORMAL, SEAFACING, SINGLE
}

class User{
	int userid;
}

class GuestUser extends User{

	public void createAccount();
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

class Booking{
	int bookingId;
	User user;
	Hotel hotel;
	PaymentInfo paymentinfo;

}

class PaymentInfo {
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




