////Day 3 2nd assignment : Constructor chaining

package Learning_1;

public class Day3_2 
{
	public Day3_2()
	{
		this(1,2,3);
		System.out.println("This is Default constructor");
	}
	public Day3_2(int a)
	{
		this();
		System.out.println("This is One parameterized constructor");
	}
	public Day3_2(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("This is Two parameterized constructor");
	}
	public Day3_2(int a, int b, int c)
	{
		System.out.println("This is Three parameterized construcror");
	}
	public Day3_2(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("This is four parameterized contructor");
	}
	
	public static void main(String[] args) 
	{
		new Day3_2(1,2);
	}
}
