package exercise_2;

public class StrongBox<Element> {
	
	private Element element;
	private KeyType keyType;
	
	public StrongBox(KeyType keyType) {
		this.keyType = keyType;
	}
	
	public void put(Element element) {
		this.element = element;
	}
	
	public Element get() {
		return this.element;
	}

}
