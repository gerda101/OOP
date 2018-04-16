
public class bmicalc {
	
	public static void main(String[] args) {
	person Person= new person();
	
	Person.setName("Kiss Béla");
	Person.setWeight(90);
	Person.setHeight(1.73);
	
	double bmi = Person.weight/(Person.height*Person.height);
	
	Person.setBmi(bmi);
	
    if(bmi > 25)
    {
    	Person.setBuild("Túlsúlyos");
    }
    else if(bmi < 18.5)
    {
    	Person.setBuild("Sovány");
    }
    else
    {
    	Person.setBuild("Normál");
    }
	
	System.out.println(Person.getName());
	System.out.println(Person.getWeight());
	System.out.println(Person.getHeight());
	System.out.println(Person.getBmi());
	System.out.println(Person.getBuild());	
	}

}
