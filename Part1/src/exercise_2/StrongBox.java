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
		switch (this.keyType) {
		case PADLOCK:
			return this.element;
		case BUTTON:
			return this.element;
		case DIAL:
			return this.element;
		case FINGER:
			return this.element;
		default:
			return this.element;
		}
	}

}
