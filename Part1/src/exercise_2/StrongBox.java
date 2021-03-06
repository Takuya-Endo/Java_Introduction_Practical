package exercise_2;

public class StrongBox<Element> {
	
	private Element element;
	private KeyType keyType;
	
	private int countPadlock = 0;
	private int countButton = 0;
	private int countDial = 0;
	private int countFinger = 0;
	
	public StrongBox(KeyType keyType) {
		this.keyType = keyType;
	}
	
	public void put(Element element) {
		this.element = element;
	}
	
	public Element get() {
		switch (this.keyType) {
		case PADLOCK:
			countPadlock++;
			if (countPadlock >= 1_024) {
				return this.element;
			}
			return null;
			
		case BUTTON:
			countButton++;
			if (countButton >= 10_000) {
				return this.element;
			}
			return null;
			
		case DIAL:
			countDial++;
			if (countDial >= 30_000) {
				return this.element;
			}
			return null;
			
		case FINGER:
			countFinger++;
			if (countFinger >= 1_000_000) {
				return this.element;
			}
			return null;
			
		default:
			return null;
		}
	}

}
