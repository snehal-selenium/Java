package Learning_1;

public class Parent 
{
	public Parent()
	{
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	public Parent(int a)
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	public Parent(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("Parent two parameterized constructor");
	}
	public Parent(int a, int b, int c)
	{
		System.out.println("Parent three parameterized constructor");
	}
	public Parent(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("Parent four parameterized constructor");
	}
}
