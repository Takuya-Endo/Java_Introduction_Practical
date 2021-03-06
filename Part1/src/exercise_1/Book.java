package exercise_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
	
	private String title;
	private Date publishDate;
	private String comment;
	
	//コンストラクタ
	public Book(String title, Date publishDate, String comment) {
		this.title = title;
		this.publishDate = publishDate;
		this.comment = comment;
	}	
	
	//getter
	public String getTitle() { return this.title; }
	public Date getPublishDate() { return this.publishDate; }
	public String getComment() { return this.comment; }
	//setter
	public void setTitle(String title) { this.title = title; }
	public void setPublishDate(Date publishDate) { this.publishDate = publishDate; }
	public void setComment(String comment) { this.comment = comment; }
	
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		return this.title + " ／ " + dateFormat.format(this.publishDate) + " ／ " + this.comment;
	}
	
	public boolean equals(Object object) {
		if (! (object instanceof Book) ) {
			return false;
		}
		Book book = (Book) object;
		if ( (this.title.equals(book.title)) && (this.publishDate == book.publishDate) ) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	public int compareTo(Book book) {
		if (this.publishDate.getTime() < book.publishDate.getTime()) {
			return -1;
		} else if (this.publishDate.getTime() == book.publishDate.getTime()) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public Book clone() {		
		Book bookClone = new Book(this.title, this.publishDate, this.comment);
		return bookClone;
	}
	
}
