
public class Rectangle {
	
	private int a, b;
	
	//Constructor
	public Rectangle(int a, int b) {
		setProp(a, b);
	}
	public Rectangle(int a) {
		setProp(a);
	}
	
	public int T() {
		return a*b;
	}
	public boolean Bigger(Rectangle otherRectangle) {
		return T() > otherRectangle.T();
	}
	public boolean Equals(Rectangle otherRectangle) {
		return T() == otherRectangle.T();
	}

	//ToString
	public String toString() {
		return "Properties of the rectangle: [a=" + a + ", b=" + b + ", T=" + a*b + "]";
	}
	
	//Setter
	public void setProp(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void setProp(int a) {
		this.a = a;
		this.b = a;
	}

}
