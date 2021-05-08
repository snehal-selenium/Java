package Learning_1;

import java.util.Scanner;

public class Armstrong 
{

	public static void main(String[] args) 
	
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = s.nextInt();
		int pal=0;
		int Old_num=a;
		while(a>0)
		{
			int b=a%10;
			pal = pal+(b*b*b);
			a=a/10;
		}
		if (Old_num==pal)
		{
			System.out.println("This is Armstrong number : "+pal);
		}
		else
		{
			System.out.println("This is not Armstrong number : "+Old_num);
		}
	}
}
