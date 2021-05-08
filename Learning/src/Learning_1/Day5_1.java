//solve = (((((x1*x2)+x3)+x3)-x5)/x6)

package Learning_1;

import java.util.Scanner;

public class Day5_1 
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
		System.out.println("Please enter a value of x1 = ");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		System.out.println("Please enter a value of x2 = ");
		int x2 = s.nextInt();
		System.out.println("Please enter a value of x3 = ");
		int x3 = s.nextInt();
		System.out.println("Please enter a value of x5 = ");
		int x5 = s.nextInt();
		System.out.println("Please enter a value of x6 = ");
		int x6 = s.nextInt();	
		
		Day5_1 ref = new Day5_1();
		int mul1 = ref.mul(x1, x2);
		int sum1 =ref.sum(mul1, x3);
		int sum2 = ref.sum(sum1, x3);
		int sub1 = ref.sub(sum2, x5);
		int div1 = ref.div(sub1, x6);
		
		System.out.println("Final result = "+div1);	
	}
}
