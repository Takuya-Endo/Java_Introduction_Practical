package exercise_2;

public class StrongBox<Element> {
	
	private Element element;
	
	public void put(Element element) {
		this.element = element;
	}
	
	public Element get() {
		return this.element;
	}

}
