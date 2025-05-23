import java.util.Date;

class Person {
    int id;
    String name;
    int phoneNo;

    public Person(int id, String name, int phoneNo) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    void displayPersonInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNo);
    }
}

class User extends Person {
    String userAddress;

    public User(int id, String name, int phoneNo, String userAddress) {
        super(id, name, phoneNo);
        this.userAddress = userAddress;
    }

    void ReturnBooks() {
        System.out.println(name + " returned a book.");
    }

    void PayFine(Date dt) {
        System.out.println(name + " paid fine on: " + dt);
    }

    void AddNewUser() {
        System.out.println("New user added: " + name);
    }

    void DeleteUser() {
        System.out.println("User deleted: " + name);
    }

    void UpdateDetails() {
        System.out.println("User details updated: " + name);
    }

    void BookPurchase() {
        System.out.println(name + " purchased a book.");
    }
}

class Librarian extends Person {
    public Librarian(int id, String name, int phoneNo) {
        super(id, name, phoneNo);
    }

    void SearchBook(String bookName) {
        System.out.println("Searching for book: " + bookName);
    }

    boolean VerifyMember(int memberId) {
        System.out.println("Verifying member with ID: " + memberId);
        return true;
    }

    void OrderBooks() {
        System.out.println("Books ordered by librarian.");
    }

    void SellBooks() {
        System.out.println("Books sold by librarian.");
    }
}

class Books {
    int BookId;
    String BookName;
    String BookAuthor;
    String YearOfPub;
    float Price;
    String Status;

    void AddNewBooks() {
        System.out.println("Book added: " + BookName);
    }

    void DeleteBooks() {
        System.out.println("Book deleted: " + BookName);
    }

    void DisplayBookDetails() {
        System.out.println("Book: " + BookName + ", Author: " + BookAuthor + ", Price: " + Price);
    }

    void InquiryBook() {
        System.out.println("Inquiry made for book: " + BookName);
    }
}

class Publisher {
    int Id;
    String Name;
    String Address;
    int PhoneNo;

    void AddPub() {
        System.out.println("Publisher added: " + Name);
    }

    void ModifyPub() {
        System.out.println("Publisher modified: " + Name);
    }

    void DeletePub() {
        System.out.println("Publisher deleted: " + Name);
    }

    void OrderStatus() {
        System.out.println("Order status checked for publisher: " + Name);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create user and librarian
        User user = new User(1, "Alice", 123456789, "123 Main St");
        Librarian librarian = new Librarian(2, "Bob", 987654321);

        // Create a book
        Books book = new Books();
        book.BookId = 1001;
        book.BookName = "Data Structures";
        book.BookAuthor = "Mark Allen";
        book.YearOfPub = "2022";
        book.Price = 59.99f;
        book.Status = "Available";

        // Create a publisher
        Publisher pub = new Publisher();
        pub.Id = 301;
        pub.Name = "Pearson";
        pub.Address = "New York";
        pub.PhoneNo = 444555666;

        // Test functionality
        user.displayPersonInfo();
        user.BookPurchase();
        user.PayFine(new Date());

        System.out.println("------");

        librarian.displayPersonInfo();
        librarian.SearchBook(book.BookName);
        librarian.VerifyMember(user.id);

        System.out.println("------");

        book.DisplayBookDetails();
        book.InquiryBook();

        System.out.println("------");

        pub.AddPub();
        pub.OrderStatus();
    }
}
