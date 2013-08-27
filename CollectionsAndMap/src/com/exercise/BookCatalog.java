package com.exercise;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class BookCatalog {

	private List<Book> bookList = null;


	public BookCatalog(String filename)
	{
		parseBooksCatalog(filename);
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

		Node nValue = (Node) nlList.item(0);

		return nValue.getNodeValue();
	}


	private static Date stringToDate(String dateString,String dateFormat)
	{
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		Date parseDate = null;
		try {
			parseDate = new java.sql.Date(format.parse(dateString).getTime());
			} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		return parseDate;
	}



	public void parseBooksCatalog(String filename)
	{
		try
		{
			File fXmlFile = new File(filename);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();


			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("book");
			System.out.println("-----------------------");

			Book book = null;
			this.bookList = new ArrayList<Book>();
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					book = new Book();

					book.setId(eElement.getAttribute("id"));
					book.setAuthor(getTagValue("author", eElement));
					book.setTitle(getTagValue("title",eElement));
					book.setGenre(getTagValue("genre", eElement));
					book.setPrice(Double.parseDouble(getTagValue("price", eElement)));
					book.setPublish_date(stringToDate(getTagValue("publish_date", eElement),"yyyy-MM-DD"));
					book.setDescription(getTagValue("description", eElement));


					// Add the Book to list

					this.bookList.add(book);
				}
			}

		}

		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}


	public List<Book> getBookList()
	{
		return bookList;

	}

	
	/**
	 * This method is used to find Book by BookId
	 * @param id
	 * @return
	 */
	
	public Book findBookById(String id)
	{
		Book book = null;
		try
		{
			Iterator<Book> iteratror = bookList.iterator();
			for(Book b : bookList)
			{
				if(b.getId().equals(id))
					book = b;
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return book;

	}

	public  List<Book>  findBookByGenre(String genre)
	{
		Book book = null;
		List<Book> bookListByGenre = null;
		try
		{
			if(genre != null)
				bookListByGenre = new ArrayList<Book>();
			Iterator<Book> iterator = bookList.iterator();
			for(Book b : bookList)
			{
				if(b.getGenre().equalsIgnoreCase(genre))
				{	
					book = b;
					bookListByGenre.add(b);
				}

			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return bookListByGenre;


	}

	
	/**
	 * This is method is used to find Book by Author Name
	 * @param author
	 * @return
	 */
	
	public  List<Book> findBookByAuthor(String author)
	{
		Book book = null;
		List<Book> bookListByAuthor = null;
		try
		{
			if(author != null)
				bookListByAuthor = new ArrayList<Book>();
			Iterator<Book> iterator = bookList.iterator();
			for(Book b : bookList)
			{
				if(b.getAuthor().equalsIgnoreCase(author))
				{	
					book = b;
					bookListByAuthor.add(b);
				}

			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return bookListByAuthor;



	}

	/**
	 * This method is used to find Books based on given range of price
	 * @param startPrice
	 * @param endPrice
	 * @return
	 */
	public  List<Book> findBookByPrice(double startPrice, double endPrice)
	{
		Book book = null;
		List<Book> bookListByPrice = null;
		try
		{
			if(startPrice != 0 && endPrice != 0)
				bookListByPrice = new ArrayList<Book>();
			Iterator<Book> iterator = bookList.iterator();
			for(Book b : bookList)
			{
				if(b.getPrice()>=startPrice && b.getPrice()<= endPrice)
				{	
					book = b;
					bookListByPrice.add(b);
				}

			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return bookListByPrice;


	}

	/**
	 * This method is used to find Book for a given range of publishDate
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public   List<Book> findBookByPublishDate(Date startDate, Date endDate)
	{
		Book book = null;
		List<Book> bookListByPublishDate = null;
		try
		{
			if(startDate != null && endDate != null)
				bookListByPublishDate = new ArrayList<Book>();
			Iterator<Book> iterator = bookList.iterator();
			for(Book b : bookList)
			{
				if(b.getPublish_date().after(startDate)  && b.getPublish_date().before(endDate))
				{	
					book = b;
					bookListByPublishDate.add(b);
				}

			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return bookListByPublishDate;


	}

	/**
	 * This method is used to sort Books based on Author Name
	 * @param bookList
	 * @return
	 */

	public List<Book> sortBooksByAuthor(List<Book> bookList)
	{
		Collections.sort(bookList, new Book.OrderByAuthor());
		return bookList;

	}

	/**
	 * This method is used to sort Books based on BooksPrice
	 * @param bookList
	 * @return
	 */
	public List<Book> sortBooksByPrice(List<Book> bookList)
	{
		Collections.sort(bookList, new Book.OrderByPrice());
		return bookList;

	}

	/**
	 * This method is used to sort Books based on PublishDate
	 * @param bookList
	 * @return
	 */
	public  List<Book> sortBooksByPublishDate(List<Book> bookList)
	{
		Collections.sort(bookList, new Book.OrderByPublishDate());
		return bookList;

	}


}
