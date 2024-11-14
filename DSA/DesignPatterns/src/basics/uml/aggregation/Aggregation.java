package basics.uml.aggregation;

import java.util.ArrayList;
import java.util.List;

class Book {
  private String title;

  public Book(String title) {
      this.title = title;
  }

  public String getTitle() {
      return title;
  }
}

class Library {
  private List<Book> books;

  public Library() {
      books = new ArrayList<>();
  }

  // Add an existing book to the library
  public void addBook(Book book) {
      books.add(book);  // Library just holds a reference to the Book
  }

  // Display all books in the library
  public void showBooks() {
      for (Book book : books) {
          System.out.println("Book: " + book.getTitle());
      }
  }
}

public class Aggregation {
  public static void main(String[] args) {
      // Create Book instances independently of any Library
      Book book1 = new Book("The Great Gatsby");
      Book book2 = new Book("1984");
      Book book3 = new Book("To Kill a Mockingbird");

      // Create Library instances
      Library library1 = new Library();
      Library library2 = new Library();

      // Add books to libraries
      library1.addBook(book1);
      library1.addBook(book2);
      
      library2.addBook(book2);  // Same book can be added to another library (aggregation)
      library2.addBook(book3);

      System.out.println("Books in Library 1:");
      library1.showBooks();

      System.out.println("\nBooks in Library 2:");
      library2.showBooks();
  }
}

