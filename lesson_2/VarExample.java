package HatikvaCoders;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * VarExample - a robot by (your name here)
 */
public class VarExample extends Robot
{
	public void run() {
		int a,alice,bob;
		String firstName, lastName, fullName;
		char myFavoriteLetter;
		double blah, eve;
		
		a = 5;
		System.out.println("The value of a is: " + a);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		a = 6;
		System.out.println("The value of a is: " + a);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		a = a*2;
		System.out.println("The value of a is: " + a);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		alice = a;
		System.out.println("The value of a is: " + a);
		System.out.println("The value of alice is: " + alice);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		alice = alice+1;
		a = a-2;
		System.out.println("The value of a is: " + a);
		System.out.println("The value of alice is: " + alice);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		bob = a*alice;
		System.out.println("The value of a is: " + a);
		System.out.println("The value of alice is: " + alice);
		System.out.println("The value of bob is: " + bob);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		firstName = "Harry";
		lastName = "Potter";
		fullName = firstName + lastName;
		System.out.println("Your full name is: " + fullName);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		firstName = "Jenny";
		myFavoriteLetter = 'J';
		System.out.println("You like " + firstName );
		System.out.println("And your favorite letter is " + myFavoriteLetter);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		eve = 0.5;
		System.out.println("My invented formula value is: " + eve*(alice+bob)*eve );
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//a = 0.5;
		//System.out.println("Look what happend when I put 0.5 in a: " + a);
		
		while (true){
			ahead(1);
			turnRight(90);
		}
	}
}