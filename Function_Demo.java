package Statement.com;

public class Function_Demo {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Function_Demo fd=new Function_Demo();
		
		add();
		fd.sub();
	int result=fd.div();
	System.out.println("div" +result);
		

	}
 public static void add() {
	 int a=5;
	 int b=10;
	 int total =a+b;
	 System.out.println("Add" +total);
 }
  public void sub() {
	  int a=1;
	  int b=2;
	  int total=a-b;
	  System.out.println("sub" +total);
    }
  public int div() {
	  int a=1;
	  int b=2;
	  int total =a/b;
	  return total;
	 
			  
  }
  
}
