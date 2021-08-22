package exercise_1;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Exercise_1_1 {
	
	public static void main(String[] main) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2021, 10, 1);
		Date date1 = calendar.getTime();
		calendar.set(2021, 11, 1);
		Date date2 = calendar.getTime();
		
		Book book1 = new Book("本No.1", date1, "No.1コメント");
		Book book2 = new Book("本No.1", date2, "No.2コメント"); //書名のみ同じ
		Book book3 = new Book("本No.3", date1, "No.3コメント"); //日付のみ同じ
		Book book4 = new Book("本No.1", date1, "No.4コメント"); //書名と日付の両方が同じ
		Book book5 = new Book("本No.5", date2, "No.5コメント"); //書名と日付の両方が異なる
		
		System.out.println(book1.equals(book2));
		System.out.println(book1);
		System.out.println(book2);
		System.out.println("");
		System.out.println(book1.equals(book3));
		System.out.println(book1);
		System.out.println(book3);
		System.out.println("");
		System.out.println(book1.equals(book4));
		System.out.println(book1);
		System.out.println(book4);
		System.out.println("");
		System.out.println(book1.equals(book5));
		System.out.println(book1);
		System.out.println(book5);
		
		Set<Book> books = new HashSet<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		book5 = new Book("本No.5", date2, "No.5コメント");
		books.remove(book5);
		System.out.println("");
		System.out.println("booksの要素数：" + books.size());
		
	}
	
}
