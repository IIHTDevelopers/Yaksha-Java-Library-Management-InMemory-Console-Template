package com.elibrary.inventory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.elibrary.exception.ISBNAlreadyExistsException;
import com.elibrary.models.Book;
import com.elibrary.models.User;

public class Inventory {
	public List<Book> books = new ArrayList<>();
	public Map<String, User> users;

	public void addBook(Book book) throws ISBNAlreadyExistsException {
		// write your code here
	}

	public Optional<Book> getBookByName(String name) {
		// write your code here
		return null;
	}

	public List<Book> searchBooksByAuthor(String author) {
		// write your code here
		return null;
	}

	public List<Book> searchBooksByPublisher(String publisher) {
		// write your code here
		return null;
	}

	public Book updateBook(Book updatedBook) {
		// write your code here
		return null;
	}

	public List<Book> getAllBooks() {
		// write your code here
		return null;
	}

	public List<Book> getBooksByIssuedDate(LocalDate issuedDate) {
		// write your code here
		return null;
	}

	public boolean issueBook(String isbn, User user, LocalDate dueDate) {
		// write your code here
		return false;
	}

	public boolean returnBook(String isbn, User user) {
		// write your code here
		return true;
	}

	public boolean isBookAvailable(String isbn) {
		// write your code here
		return false;
	}

	public List<Book> getBorrowedBooks() {
		// write your code here
		return null;
	}

	public boolean renewBook(String isbn, User user, LocalDate newDueDate) {
		// write your code here
		return false;
	}

	public List<User> getTopBorrowers(int count) {
		// write your code here
		return null;
	}

	public List<Book> getPopularBooks(int count) {
		// write your code here
		return null;
	}

	public User getUserById(String userId) {
		// write your code here
		return null;
	}

	public Map<String, User> getUsers() {
		// write your code here
		return null;
	}
}
