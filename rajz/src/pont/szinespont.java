package pont;

import java.awt.Color;
import rajz.ISzinezheto;

public class szinespont extends pont implements ISzinezheto {

	private Color color;
	
	public szinespont(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public szinespont(Color color) {
		super(0, 0);
		this.color = color;		
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color=color;
	}

	@Override
	public String toString() {
		return "Szinespont [color=" + color + ", getColor()=" + getColor()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
