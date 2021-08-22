package exercise_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	
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
	
}
