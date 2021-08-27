package exercise_1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
		
		Set<Book> setBooks = new HashSet<Book>();
		setBooks.add(book1);
		setBooks.add(book2);
		setBooks.add(book3);
		setBooks.add(book4);
		setBooks.add(book5);
		book5 = new Book("本No.5", date2, "No.5コメント");
		setBooks.remove(book5);
		System.out.println("");
		System.out.println("booksの要素数：" + setBooks.size());

		calendar.set(2021, 5, 6);
		Book book6 = new Book("本No.6", calendar.getTime(), "No.6コメント");
		calendar.set(2021, 7, 7);
		Book book7 = new Book("本No.7", calendar.getTime(), "No.7コメント");
		calendar.set(2021, 6, 8);
		Book book8 = new Book("本No.8", calendar.getTime(), "No.8コメント");
		calendar.set(2021, 9, 9);
		Book book9 = new Book("本No.9", calendar.getTime(), "No.9コメント");
		calendar.set(2021, 8, 10);
		Book book10 = new Book("本No.10", calendar.getTime(), "No.10コメント");
		
		List<Book> listBooks = new ArrayList<Book>();
		listBooks.add(book6);
		listBooks.add(book7);
		listBooks.add(book8);
		listBooks.add(book9);
		listBooks.add(book10);
		System.out.println("");
		System.out.println("ArrayList格納要素");
		System.out.println("格納順" + listBooks);
		Collections.sort(listBooks);
		System.out.println("発行順" + listBooks);
		
		Book book1clone = book1.clone();
		System.out.println("");
		System.out.println(book1);
		System.out.println(book1clone);
		
	}
	
}
