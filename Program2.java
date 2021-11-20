public class Program2 {

	public static void main(String[] args) 
	{
		Program1 prgm1_obj1 = new Program1(30);
		Program1 prgm1_obj2 = new Program1(30, 30);
	}
}


/*
30
60


In Program1, zero argument constructor is private. So, we can't create zero argument object from Program2 class.
In Program1, single & double argument constructor is not private. So, we can create single & double argument object from Program2 class.
*/
