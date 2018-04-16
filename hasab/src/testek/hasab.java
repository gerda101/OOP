package testek;

public abstract class hasab {
	
	private double magas;

	public hasab(double magas) {
		this.magas = magas;
	}

	public double getMagas() {
		return magas;
	}
	
	public abstract double getAlapterulet();
	
	public double terfogat() {
		return getAlapterulet()*magas;
	}
	
	public boolean terfogatnagyobb(hasab masik) {
		return terfogat() > masik.terfogat();
	}
		
}
