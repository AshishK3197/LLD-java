// The below reuirement is to build a LLD solution for Online BookStore with given requirements;
// Books and its tyoes
// The book store in itself
// Purchase a book;
// Add a book to the Book Store by seller(assuming he has a admin account);

class OnlineBookStore{

	// Ebooks
	// Regukar books

	List<Book> book;

	public isBookAvailable(Ebook ebook , Author author); //To check if a book is available

}

class Book {

	int id; //Unique id for a Single book(both types)
	String name;
	Author author;
	List<Reviews> reviews;
	List<Images> images;
	double price;

}

class Reviews{

	int id; //Unique id for a review
	String review;
	String reviewverName;
	int starCount;
}

class Images{

	int id;
	String imageUrl;

}

class Author {

	int id; //Unique id for author
	String name;

}


class Ebook extends Book{

	List<Ebooks> ebooks;

}

class RegularBooks extends Book{

	List<RegularBooks> ebooks;
}


//Payment and purchase a book; 

public enum PaymentType {

	CASH, CEDIT_CARD, DEBIT_CARD, UPI;
}



class Payment {

	public PaymentInfo makePayment(Book book , PaymentType paymentType)

}

public class PaymentInfo {

	int paymentId;
	double totalAmount;
	Date paymentDate;
	Book book;
	PaymentStatus paymentStatus;
}

public enum PaymentStatus{

	UNPAID, PENDING, COMPLETED, DECLINED, CANCELLED, REFUNDED;
}


// Add a book to the store;

class Account{
	int accountId;
	String accountName;
	String email;
	String password;
	String empId;
	Address address;
}

class Seller extends Account {

	public boolean addBookToBookStore(Book book);
	public boolean addOrUpdateInformationToBook(Book book, Images image ,Reviews review , Author author); //Seller can add or update book information
}


























