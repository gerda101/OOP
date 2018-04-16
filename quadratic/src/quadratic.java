public class quadratic {
	public static void main(String[] args) {
		int a, b, c;
		double d, root1, root2;
		Scanner in = new Scanner(System.in); 

        //input
        System.out.print("Enter a:");
        a = in.nextInt();
        System.out.print("Enter b:");
        b = in.nextInt();
        System.out.print("Enter c:");
        c = in.nextInt();
        System.out.println("The quadratic equation:"+a+"x^2 + "+b+"x + "+c);
        
        //determinator
        d = b * b - 4 * a * c;

        //selection
        if(d > 0)
        {
            root1 = ( - b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("First root: "+root1);
            System.out.println("Second root: "+root2);
        }
        else if(d == 0)
        {
            root1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("There is olny one root: "+root1);
        }
        else
        {
            System.out.println("Number of roots are 0.");
	}

}

