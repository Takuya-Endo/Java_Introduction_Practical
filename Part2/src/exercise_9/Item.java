package exercise_9;

public class Item {
	
	private String name;
	private int price;
	private int weight;
	
	public Item(String name, int price, int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public int getWeight() { return this.weight; }
	
	public void setName(String name) { this.name = name; }
	public void setPrice(int price) { this.price = price; }
	public void setWeight(int weight) { this.weight = weight; }
	
	public String toString() {
		return "名前：" + this.name + "／値段：" + this.price + "円／重さ：" + this.weight + "g";
	}
	
}
