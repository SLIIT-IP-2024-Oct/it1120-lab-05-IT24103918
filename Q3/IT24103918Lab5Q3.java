import java.util.Scanner;

public class IT24103918Lab5Q3 {
	public static void main(String[] args){
		
		final double ROOM_CHARGE_PER_DAY = 48000.0;
		final double DISCOUNT_3_TO_4_DAYS = 0.10;
		final double DISCOUNT_5_OR_MORE_DAYS = 0.20;
		
		//create an object called input to scanner class
		Scanner input = new Scanner(System.in);
		
		int start_Day, end_Day, Number_Of_Days_Reserved;
		double discount, Total_Amount;
		
		//take user inputs
		System.out.print("Enter start Date (1-31):");
		start_Day = input.nextInt();
		
		System.out.print("Enter End Date (1-31):");
		end_Day = input.nextInt();
		
		//validiation checks
		if((start_Day < 1 || start_Day > 31) || (end_Day < 1 || end_Day > 31)){
			System.out.println("Error: Days must be between 1 and 31");
			
			return;		//Exit the program
		}
		
		if(start_Day >= end_Day){
			System.out.println("Error: Start Date must be less than End Date");
			
			return;		//Exit the program
		}
		
		//Calculate date reserved
		Number_Of_Days_Reserved = end_Day - start_Day;
		
		//Check if the reservation is eligible for discount
		discount = 0.0;
		if(3 <= Number_Of_Days_Reserved && Number_Of_Days_Reserved <= 4){
			discount = Number_Of_Days_Reserved * DISCOUNT_3_TO_4_DAYS;
		}
		
		else if(Number_Of_Days_Reserved >= 5){
			discount = ROOM_CHARGE_PER_DAY * Number_Of_Days_Reserved * DISCOUNT_5_OR_MORE_DAYS;
		}
		
		//Calculate Total amount to be paid
		Total_Amount = (ROOM_CHARGE_PER_DAY * Number_Of_Days_Reserved) - discount;
		
		//Display Output 
		System.out.println();
		System.out.println("Room Charge Per Day: Rs." + ROOM_CHARGE_PER_DAY + "/=");
		System.out.println("Number of Days Reserved: " + Number_Of_Days_Reserved);
		System.out.println("Total Amount to be Paid: " + Total_Amount);
		
		
	}
}