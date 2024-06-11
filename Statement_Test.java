package Statement.com;

import java.util.Scanner;

public class Statement_Test {

	public static void main(String[] args) {
		String ans;
		do {
		Scanner input =new Scanner(System.in);
		System.out.println("Curiosity is the starting point for great adventure");
		System.out.println("Enter the quantity:");
		int quantity= input.nextInt();
		System.out.println("Enter the price:");
		int price=input.nextInt();
		double total=quantity*price;
		System.out.println("Total is:" +total);
		
		System.out.println("###############");
		
		System.out.println("Do you want to perform again");
	    ans =input.next();
		}while(ans.equals("Yes"));
	    

	}

}
