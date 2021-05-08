package Learning_1;

public class ChildMethod extends ParentMethod
{
	public void ChildMethod1()
	{
		System.out.println("Child Default method");
	}
	public void ChildMethod1(int a)
	{
		System.out.println("Child 1 parameter method");
	}
	public void ChildMethod1(int a, int b)
	{
		super.ParentMethod1();
		this.ParentMethod1(1, 2, 3, 4);
		this.ParentMethod1(1);
		this.ParentMethod1(1, 2);
		this.ParentMethod1(1, 2, 3);
		this.ChildMethod1();
		this.ChildMethod1(1, 2, 3, 4);
		this.ChildMethod1(1, 2, 3);
		this.ChildMethod1(1);
		System.out.println("Child 2 parmeter method");
	}
	public void ChildMethod1(int a, int b, int c)
	{
		System.out.println("Child 3 parameter method");
	}
	public void ChildMethod1(int a, int b, int c, int d)
	{
		System.out.println("Child 4 parameter method");
	}
	
	public static void main(String[] args) 
	{
		ChildMethod ref = new ChildMethod();
		ref.ChildMethod1(1, 2);
	}
}
