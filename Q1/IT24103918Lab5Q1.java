import java.util.Scanner;

public class IT24103918Lab5Q1 {
	public static void main(String[] args) {
	
	//Create an object called input to Scanner class
	Scanner input = new Scanner(System.in);
	
	//take user inputs
	System.out.print("Enter the first integer: ");
	int First_Integer = input.nextInt();
	
	System.out.print("Enter the second integer: ");
	int Second_Integer = input.nextInt();
	
	System.out.print("Enter the third integer: ");
	int Third_Integer = input.nextInt();
	
	System.out.println(); //Print line
	
	//print entered integers
	System.out.println("User entered number are :" + First_Integer + " " + Second_Integer + " " + Third_Integer);
	
	//Assign smallest and largest to "first integer" initially
	int smallest = First_Integer;
	int largest = First_Integer;
	
	//Compare 'second integer' with smallest and largest
	if(Second_Integer < smallest){
		smallest = Second_Integer;
	}
	if(Second_Integer > largest){
		largest = Second_Integer;
	}
	
	//Compare 'third integer' with smallestand largest
	if(Third_Integer < smallest){
		smallest = Third_Integer;
	}
	if(Third_Integer > largest){
		largest = Third_Integer;
	}
	
	//print output
	System.out.println("Enter Smallest number is: " + smallest);
	System.out.println("Enter Largest number is: " + largest);
	}
}