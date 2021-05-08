package Learning_1;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int Factorial = 1;
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int a = s.nextInt();
		for (int i=1; i<=a; i++)
		{
			Factorial = Factorial*i;
		}
		System.out.println("Factorial of number : "+a+" is = "+Factorial);
	}
}
