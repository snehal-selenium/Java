package Learning_1;

import java.util.Scanner;

public class SwappingThirdVariable 
{

public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value of a = ");
	int a=s.nextInt();
	System.out.println("Enter value of b = ");
	int b=s.nextInt();
	System.out.println("Value of numbers before swapp a = "+a +" and b = "+b);
	int c = b;
	b=a;
	a=c;
	System.out.println("Value of numbers after swapp a = "+a+ " and b = "+b);
}
}
