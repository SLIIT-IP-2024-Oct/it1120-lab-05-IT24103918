import java.util.Scanner;

public class IT24103918Lab5Q2 {
	public static void main(String[] args)
	
		//create an object called input to scanner class
		Scanner input = new Scanner(System.in);
		
		int number_of_members;
		
		//take user input
		System.out.print("Enter the number of new members introduced: ");
		number_of_members = input.nextInt();
		
		//Determine the prize based on the number of new members
		switch(number_of_members){
			
			case 0:
				System.out.println();
				System.out.print("No Price");
			
				break;
			
			case 1:
				System.out.println();
				System.out.print("Price is a : Pen");
				
				break;
			
			case 2:
				System.out.println();
				System.out.print("Price is a : Umbrella");
				
				break;
			
			case 3:
				System.out.println();
				System.out.print("Price is a : Bag");
				
				break;
			
			case 4:
				System.out.println();
				System.out.print("Price is a : Travelling Chair");
				
				break;
				
			default:
				if(number_of_members >= 5){
					System.out.println();
					System.out.print("Price is a : Headphone");
				}
			
				else{
					System.out.println();
					System.out.print("Input must be a number 0 or greater");
				}				
				
				break;
			
		}
	}
}