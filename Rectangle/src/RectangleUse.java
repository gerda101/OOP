
public class RectangleUse {
	public static void main(String[] args) {
		/*Rectangle a_object = new Rectangle(2);
		Rectangle b_object = new Rectangle(2, 5);
		Rectangle c_object = new Rectangle(6, 1);	
		
		System.out.println(a_object);
		System.out.println(b_object);
		System.out.println(c_object);
		
		//change
		a_object.setProp(2, 5);
		
		System.out.println(a_object==b_object);
		System.out.println(a_object==c_object);
		System.out.println(a_object.Equals(b_object));*/
		
		//matrix of Rectangles
		Rectangle[] rectangles = new Rectangle[10];
		for (int i=0; i<rectangles.length; i++)
		{
			rectangles[i]= new Rectangle((int)(Math.random()*9)+2, (int)(Math.random()*9)+2);
			System.out.println(rectangles[i]);
		}
		
		int mini=0;
		for (int i = 1; i < rectangles.length; i++) {
			if (rectangles[mini].Bigger(rectangles[i]))
			{
				mini=i;		
			}
		}
		System.out.println(rectangles[mini]);
		
	}
}
