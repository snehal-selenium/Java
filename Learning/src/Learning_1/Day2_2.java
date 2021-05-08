//Day 2 2nd assignment : Solve (((((10-2)+2)-2)*2)/2)

package Learning_1;

public class Day2_2 
{
		int c;
		
		public int Sum (int a, int b)
		{
			c=a+b;
			System.out.println("Addition of numbers = "+c);
			return c;
		}
		
		public int Sub (int a,int b)
		{
			c=a-b;
			System.out.println("Subtraction of numbers = "+c);
			return c;
		}
		
		public int Mul (int a, int b)
		{
			c=a*b;
			System.out.println("Multiplication of numbers = "+c);
			return c;
		}
		
		
		
		public int Div (int a, int b)
		{
			c=a/b;
			System.out.println("Division of numbers = "+c);
			return c;
		}
	
		public static void main(String[] args) 
		{
		Day2_2  assi= new Day2_2();
		int Sub1 = assi.Sub(10, 2);
		int Sum1 = assi.Sum(Sub1, 2);
		int Sub2 = assi.Sub(Sum1, 2);
		int Mul1 = assi.Mul(Sub2, 2);
		int Div1 = assi.Div(Mul1, 2);
		
		System.out.println("Final Result = "+Div1);
		
		
		}
	
	
}
