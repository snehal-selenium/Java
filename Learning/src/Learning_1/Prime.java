package Learning_1;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = s.nextInt();
		int b=a/2;
		int Flag=1;
		
		if(a<=1)
		{
			System.out.println("This is not valid number");
		}
		else
		{
		
		for (int i=2; i<=b; i++)
		{
			if (a%i==0)
			{
				System.out.println("This number is not prime number = "+a);
				Flag=0;
				break;
			}
			
		}
		if (Flag==1)
		{
			System.out.println("This is prime number");
		}
	}
	}
}
