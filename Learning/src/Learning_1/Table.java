package Learning_1;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int a = s.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(a*i);
			
		}
		
	}
}
