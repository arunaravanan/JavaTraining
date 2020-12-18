package com.java.springboot.SpringJDBCconnection;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
//	 Array<{id:String,title:String,image:String,subtitle:String,author:String,published:String,publisher:String,pages:Number,description:String,website:String}>
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "isbn")
	private String isbn;
	@Column(name = "title")
	private String title;
	@Column(name = "image")
	private String image;
	@Column(name = "subtitle")
	private String subtitle;
	@Column(name = "author")
	private String author;
	@Column(name = "published")
	private String published;
	@Column(name = "publisher")
	private String publisher;
	@Column(name = "pages")
	private Integer pages;
	@Column(name = "description", length=1000)
	private String description;
	@Column(name = "website")
	private String website;

	public Book() {
		
	}
	public Book(String isbn, String title, String image, String subtitle, String author, String published,
			String publisher, Integer pages, String description, String website) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.image = image;
		this.subtitle = subtitle;
		this.author = author;
		this.published = published;
		this.publisher = publisher;
		this.pages = pages;
		this.description = description;
		this.website = website;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
