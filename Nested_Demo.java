package Statement.com;

public class Nested_Demo {
	
	public static void Nested_Demo() {
		int  k =5;
		for  (int i =  1 ; i <= 5; i++) 
		{
			for (int j = 1 ; j <= i; j++) {
				
				if(i == 5 && j>2)
				{
					System.out.println(k);
					k--;
				} else {
					System.out.println(j);
				}
			}
		System.out.println();
	  
		}
	}
	public static void main(String[] args) {
		Nested_Demo();
	}
}
