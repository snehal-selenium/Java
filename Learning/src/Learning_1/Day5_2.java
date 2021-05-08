package Learning_1;

import java.util.Scanner;

public class Day5_2 
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
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a value of x1 = ");
		int x1 = s.nextInt();
		System.out.println("Please enter a value of x2 = ");
		int x2 = s.nextInt();
		System.out.println("Please enter a value of x3 = ");
		int x3 = s.nextInt();
		System.out.println("Please enter a value of x4 = ");
		int x4 = s.nextInt();
		System.out.println("Please enter a value of x5 = ");
		int x5 = s.nextInt();
		System.out.println("Please enter a value of x6 = ");
		int x6 = s.nextInt();	
		
		Day5_2 ref = new Day5_2();
		int sub1 = ref.sub(x1, x2);
		int sum1 = ref.sum(sub1, x3);
		int sub2 = ref.sub(sum1, x4);
		int div1 = ref.div(sub2, x5);
		int mul1 = ref.mul(div1, x6);
		
		System.out.println("Final result = "+mul1);
		}
}
