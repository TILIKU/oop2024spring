package simpleMath;
import java.util.Scanner;

public class simpleMath {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
		
	    System.out.printf("Enter the sirst number: ");
	    Float num1 = myObj.nextFloat();  
	    
	    System.out.printf("Enter the second number: ");
	    Float num2 = myObj.nextFloat();  
	    System.out.println("Number 1 is: " + num1);
	    System.out.println("Number 2 is: " + num2);  
	    
	    System.out.printf("Enter the the number for math operator (1 => + ,2 => - ,3 => * ,4 => / ): ");
	    byte mathOperator = myObj.nextByte();  
	    
	    if(mathOperator == 1) {
	    	Float answer = num1 + num2;
	    	System.out.println("the sum of these numbers is: " + answer);
	    }
	    else if(mathOperator == 2) {
	    	Float answer = num1 - num2;
	    	System.out.println("the difference of these numbers is: " + answer);
	    }
	    else if(mathOperator == 3) {
	    	Float answer = num1 * num2;
	    	System.out.println("the product of these numbers is: " + answer);
	    }
	    else if(mathOperator == 4) {
	    	Float answer = num1 / num2;
	    	System.out.println("the difference of these numbers is: " + answer);
	    }
	   
	}

}
