package exercise_1;

import java.util.ArrayList;
import java.util.Calendar;
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
		
		List<Book> listBooks = new ArrayList<Book>();
		listBooks.add(book1);
		listBooks.add(book2);
		listBooks.add(book3);
		listBooks.add(book4);
		listBooks.add(book5);
		System.out.println("");
		System.out.println("ArrayList格納要素");
		for (Book listElement : listBooks) {
			System.out.println(listElement);
		}
		System.out.println(listBooks.get(1));
		
	}
	
}
