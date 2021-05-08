package Learning_1;

import java.util.Scanner;

public class Fibnocci 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 2 numbers : ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a);
		System.out.println(b);
		for (int i=1; i<=10; i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}
}

