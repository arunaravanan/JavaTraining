package com.java.training.assignment_tws.Nov21st;

import java.util.ArrayList;
import java.util.List;

public class LibraryBookComposition {
	public static void main(String[] args) {
		Book book1 = new Book("Game of Thrones", "George RR Martin");
		Book book2 = new Book("Sherlock Holmes", "Sir Connan Doyle");
		Book book3 = new Book("Hamlet", "William Shakespeare");
		Book book4 = new Book("Harry Potter", "JK Rowling");
		List <Book> lib1 = new ArrayList <Book>();
		lib1.add(book1);
		lib1.add(book2);
		List <Book> lib2 = new ArrayList <Book>();
		lib2.add(book3);
		lib2.add(book4);
		
		Library library = new Library(lib1);
		List<Book> books = library.getTotalBooksInLibrary ( );
		System.out.println("First Library\n");
		for (Book bookdet : books)
			System.out.println(bookdet);
		Library library1 = new Library(lib2);
		System.out.println("Second Library\n");
		List<Book> books1 = library1.getTotalBooksInLibrary ( ); 
		for (Book bookdet : books1)
			System.out.println(bookdet);
		
		
		
	}

}
