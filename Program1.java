public class Program1 {

	private Program1() 
	{
     System.out.println("Program1 - Constructor");
	}
	
	Program1(int a) 
	{
     System.out.println(a);
	}
	
	public Program1(int a, int b) 
	{	 
     System.out.println(a+b);
	}
	
}