package basics.uml.composition;

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
      // Initialize the list of books
      books = new ArrayList<>();
  }

  // Add a book to the library
  public void addBook(String title) {
      Book book = new Book(title);  // Book instance is created and managed by Library
      books.add(book);
  }

  // Display all books in the library
  public void showBooks() {
      for (Book book : books) {
          System.out.println("Book: " + book.getTitle());
      }
  }
}

public class Composition {
  public static void main(String[] args) {
      Library library = new Library();
      library.addBook("The Great Gatsby");
      library.addBook("1984");
      library.addBook("To Kill a Mockingbird");

      System.out.println("Books in the library:");
      library.showBooks();
  }
}

