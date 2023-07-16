class RailwayReservationSystem{
	List<Train> train;
	List<User> user;

	public void getTrainDetails(Station start, Station end, TimeStamp departTime);
	public boolean bookTrain(Train train , User user , PaymentInfo paymentinfo);
}


class Train{
	String Name;
	Strin TrainNumber;
	int numberOfSeats;
	List<Seat> seat;
	List<Schedule> schedule;
}

class Seat{
	String seatNumber;
	SeatClassName seatClassName;//can also be an enum
}

public enum SeatClassName{
	GENERAL, AC_2TIER, AC_3TIER
}

class Schedule{
	Train train;
	Station start;
	Station end;
	TimeStamp start;
	TimeStamp end;
	TrainStatus status;
	List<TrainSeat> fare;
}

public enum TrainStatus{
	DELAYED , ONTIME, CANCELLED
}

class TrainSeat extends Seat{
	int price;
	SeatStatus status;
}

public enum SeatStatus{
	OPEN, BOOKED;
}

class Station{
	String name;
	Address address;
	List<Train> trains;
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
	Train train;
	User user;
	Date dateTime;
	String pnr;
	Station start;
	Station end;
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





