package com.exercise;

import java.sql.Date;
import java.util.Comparator;

public class Book  implements Comparable<Book>{

	private String id;
	private String author;
	private String title;
	private String genre;
	private double price;
	private Date publish_date;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	/*
     * Comparator implementation to Sort Book object based on Author
     */
    public static class OrderByAuthor implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.author.compareTo(o2.author);
        }
    }
	
	
    
    /*
     * Comparator implementation to Sort Book object based on Price
     */
    public static class OrderByPrice implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
        	 return o1.price > o2.price ? 1 : (o1.price < o2.price ? -1 : 0);
        }
    }
	    
    
    /*
     * Comparator implementation to Sort Book object based on publish_date
     */
    public static class OrderByPublishDate implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.publish_date.compareTo(o2.publish_date);
        }
    }


	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
