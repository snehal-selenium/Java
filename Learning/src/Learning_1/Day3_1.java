//Day 3 1st assignment : Constructor chaining

package Learning_1;

public class Day3_1 
{

	public Day3_1()
	{
		this(1);
		System.out.println("This is default constructor");
	}
	
	public Day3_1(int a)
	{
		this(2,3,4,5);
		System.out.println("This is one parameterized constructor");
	}
	
	public Day3_1(int a, int b)
	{
		this(2,3,4);
		System.out.println("This is Two parameterized constructor");
	}
	
	public Day3_1(int a, int b, int c)
	{
		this();
		System.out.println("This is Three parameterized constructor");
	}
	
	public Day3_1(int a, int b, int c, int d)
	{
		System.out.println("This is Four parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
	
	 new Day3_1(1,2);	
		
	}
}
