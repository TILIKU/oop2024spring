package circle;
import java.util.Scanner;


public class AreaOfCircle {

	public static void main(String[] args) {
		// formula area = Math.PI * radius * radius.
		Scanner myObj = new Scanner(System.in);  
		
		System.out.printf("Enter the radius of a circle number in cm: ");
	    Float radius = myObj.nextFloat();
	    
	    System.out.printf("area of " + radius + "cm radius circle is: " + (radius * radius) + "\u03C0");
	}

}
