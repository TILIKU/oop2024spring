package timeConverter;
import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
		
		System.out.printf("Enter the amount of minutes: ");
	    int min = myObj.nextInt();
	    
	    System.out.printf("Seconds in " + min + " minutes is : " + (min * 60));
	}

}
