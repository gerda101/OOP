package testek;

public class teglatest extends hasab {

	private double a, b;
	
	public teglatest(double magas, double a, double b) {
		super(magas);
		this.a = a;
		this.b = b;
	}

	@Override
	public double getAlapterulet() {
		return a*b;
	}

	@Override
	public String toString() {
		return "teglatest [a=" + a + ", b=" + b + ", Magassag=" + getMagas()
				+ "]";
	}
}
