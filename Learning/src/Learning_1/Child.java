package Learning_1;

public class Child extends Parent
{
	public Child()
	{
		super(1,3);
		System.out.println("Child default constructor");
	}
	public Child(int a)
	{
		this(1,2,3);
		System.out.println("Child one parameterized constructor");
	}
	public Child(int a, int b)
	{
		this(2);
		System.out.println("Child two parameterized constructor");
	}
	public Child(int a, int b, int c)
	{
		this();
		System.out.println("Child three parameterized constructor");
	}
	public Child(int a, int b, int c, int d)
	{
		this(1,2);
		System.out.println("Child four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		new Child(1,2,3,4);
	}
}
