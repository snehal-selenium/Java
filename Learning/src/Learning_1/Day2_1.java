// Day 2 1st assignment : Solve (((((10+2)+2)-2)*2)/2)

package Learning_1;

public class Day2_1 
{
	int c;

	public int sum(int a,int b)
	{
		c=a+b;
		System.out.println("Sum of values = " +c);
		return c;
	}
	
	public int sub(int a, int b)
	{
		c=a-b;
		System.out.println("Subtraction of values = " +c);
		return c;
	}
	
	public int mul(int a, int b)
	{
		c=a*b;
		System.out.println("Multiplication of values = " + c);
		return c;
	}
	
	public int div(int a, int b)
	{
		c=a/b;
		System.out.println("Division of numbers = " + c);
		return c;
	}
	
	public static void main(String[] args) 
	{
		Day2_1 assi_1 = new Day2_1();
		
		int Sum1 = assi_1.sum(10, 2);
		int Sum2 = assi_1.sum(Sum1, 2);
		int Sub1 = assi_1.sub(Sum2, 2);
		int Mul1 = assi_1.mul(Sub1, 2);
		int res = assi_1.div(Mul1, 2);
		System.out.println("final result = " + res);
	}
	
}
