// Day 1 assignament to call method and veriable.

package Learning_1;

public class Student {
	
	int a;
	int b;
	
	public void display1()
	{
		System.out.println("This is first method");
	}
	
	public void display2()
	{
		System.out.println("This is second method");
	}
	
	
	public static void main(String[] args) 
	{
		Student assignment_1 = new Student();
		assignment_1.a=25;
		System.out.println(assignment_1.a);
		assignment_1.b=20;
		System.out.println(assignment_1.b);
		assignment_1.display1();
		assignment_1.display2();				
				
	}
	

}
