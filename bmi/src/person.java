
public class person {
	String name;
	int weight;
	double height;
	String build;
	double bmi;
	
	public String toString() {
		return "Personal information: [name=" + name + ", weight=" + weight + ", height="
				+ height + ", Bmi=" + bmi + ", build=" + build + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBuild() {
		return build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
}
