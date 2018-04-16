package pont;

public class pont {
	
	private int x;
	private int y;
	
	public pont(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Pont: (" + x+";"+ y + ")";
	}
	
}
