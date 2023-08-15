package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
	
	private List<Book> bookList;

	public BookCatalog() {
		this.bookList = new ArrayList<>();
	}
	
	public void addBook(String title, String author, int year) {
		Book book = new Book(title, author, year);
		bookList.add(book);
	}
	
	public List<Book> searchByAuthor(String author){
		List<Book> bookByAuthor = new ArrayList<>();
		if(!bookList.isEmpty()) {
			for (Book b : bookList) {
				if (b.getAuthor().equalsIgnoreCase(author)) {
				bookByAuthor.add(b);	
				}
			}	
		}
		return bookByAuthor;
	}
	
	public List<Book> searchByYear(int initialYear, int finalYear){
		List<Book> booksByYear = new ArrayList<>();
		if(!bookList.isEmpty()) {
			for (Book b : bookList) {
				int y = b.getYear();
				if (y >= initialYear && y <= finalYear) {
					booksByYear.add(b);
				}
			}
		}
		return booksByYear;
	}
	
	public Book searchByTitle(String title) {
		Book book = null;
		if (!bookList.isEmpty()) {
			for (Book b : bookList) {
				if (b.getTitle().equalsIgnoreCase(title));
				book = b;
				break;
			}
		}
		return book;
	}
	
	public static void main(String[] args) {
		BookCatalog bookCatalog = new BookCatalog();
		bookCatalog.addBook("Book1", "Mark", 2015);
		bookCatalog.addBook("Book2", "John", 2013);
		bookCatalog.addBook("Book3", "Mark", 2012);
		bookCatalog.addBook("Book1", "John", 2012);
		bookCatalog.addBook("Book5", "Mary", 2015);	
	
		System.out.println(bookCatalog.searchByYear(2011, 2013));
		System.out.println(bookCatalog.searchByAuthor("Mark"));
		System.out.println(bookCatalog.searchByTitle("Book1"));
	}
	

}
