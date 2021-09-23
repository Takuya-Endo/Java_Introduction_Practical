package exercise_9;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("1円以上のアイテム一覧表を表示します");
		
		ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
		
		for (Item item : items) {
			
			System.out.printf("%10s%4d%4d", item.getName(), item.getPrice(), item.getWeight());
			
//			System.out.println(item + "\n");
			
		}
		
	}

}
