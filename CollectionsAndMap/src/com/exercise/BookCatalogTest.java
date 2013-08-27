package com.exercise;

import java.sql.Date;
import java.util.List;


public class BookCatalogTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		BookCatalog bookCatalog = new BookCatalog("books.xml");
			
		
		/**
		 * Get Book by ID
		 */
		
		Book book1 = bookCatalog.findBookById("bk110");
		System.out.println(" Find Bookby Id ");
		
		System.out.println("-------------------------------");
		System.out.println("Book Id : " + book1.getId());
		System.out.println("author : " + book1.getAuthor());
		System.out.println("title : "+book1.getTitle());
		System.out.println("genre :"+book1.getGenre());
		System.out.println("price :"+book1.getPrice());
		System.out.println("publish_date :"+book1.getPublish_date());
		System.out.println("description :"+book1.getDescription());
		System.out.println("-------------------------------");
		
		
		
		/**
		 * Book List by Genre
		 */
		System.out.println(" FindBookListByGenre ");
		List<Book>  bookListByGenre = bookCatalog.findBookByGenre("Computer");
		printBookList(bookListByGenre);
		
		
		/**
		 *  findBookByAuthor
		 */
		System.out.println(" findBookByAuthor ");
		List<Book>  bookListByAuthor = bookCatalog.findBookByAuthor("Knorr, Stefan");
		printBookList(bookListByAuthor);
		
		/**
		 * findBookByPublishDate
		 */
		System.out.println(" findBookByPublishDate ");
		List<Book>  bookListByPublishDate = bookCatalog.findBookByPublishDate(new Date(2001,01,01),new Date(2005,01,01));
		printBookList(bookListByPublishDate);
		
		
		
		/**
		 * SortBooksByAuthor
		 */
		System.out.println(" SortBooksByAuthor ");
		List<Book>  sortedBookListByAuthor = bookCatalog.sortBooksByAuthor(bookCatalog.getBookList());
		printBookList(sortedBookListByAuthor);
		
		/**
		 * SortBookByPrice
		 */
		System.out.println(" SortBookByPrice ");
		List<Book>  sortedBookListByPrice = bookCatalog.sortBooksByPrice(bookCatalog.getBookList());
		printBookList(sortedBookListByPrice);
		
		/**
		 * sortBooksByPublishDate
		 */
		System.out.println(" sortBooksByPublishDate ");
		List<Book>  sortedBooksByPublishDate = bookCatalog.sortBooksByPublishDate(bookCatalog.getBookList());
		printBookList(sortedBooksByPublishDate);

	}
	
	
	public static void printBookList(List<Book> booklist)
	{
		Book book1 = null;
		for(int i=0;i<booklist.size();i++)
		{
			book1 = booklist.get(i);
			
			System.out.println("-------------------------------");
			System.out.print("BOOK ID : " + book1.getId());
			System.out.print(" --   AUTHOR : " + book1.getAuthor());
			System.out.print("  -- TITLE : "+book1.getTitle());
			System.out.println("  -- GENRE :"+book1.getGenre());
			System.out.print(" --   PRICE :"+book1.getPrice());
			System.out.print(" --   PUBLISH_DATE :"+book1.getPublish_date());
			System.out.println("  -- DESCRIPTION :"+book1.getDescription());
			
		}
	}
	

}
