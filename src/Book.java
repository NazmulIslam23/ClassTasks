public class Book {
    // Attributes
    private String title;
    private String author;

    // Constructor with only title
    public Book(String title) {
        this.title = title;
        this.author = null; // author not set
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        } else {
            System.out.println("Author: Not provided");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Effective Java", "Joshua Bloch");

        book1.displayInfo();
        System.out.println("------");
        book2.displayInfo();
    }
}
