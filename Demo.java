package abc;

import  java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	//int Prachi=19;
		
	Scanner sc = new Scanner(System.in);
			
	System.out.println("Enter the Age");
	int age = sc.nextInt();
	if(age>=18) {
		 System.out.println("Eligible for voting");
	} else {
		System.out.println("Not Eligible for voting");

	}
	
	}

}
