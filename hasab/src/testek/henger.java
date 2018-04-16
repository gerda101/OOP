package testek;

public class henger extends hasab{

	private double sugar;
	
	public henger(int magas, int sugar) {
		super(magas);
		this.sugar = sugar;
	}
	
	public double getAlapterulet() {
		return sugar * sugar *Math.PI;
	}

	@Override
	public String toString() {
		return "henger [sugar=" + sugar + ", Alapterulet="
				+ getAlapterulet() + ", Magassag=" + getMagas() + "]";
	}
	
	

}
