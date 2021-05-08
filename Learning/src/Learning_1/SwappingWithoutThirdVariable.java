package Learning_1;

public class SwappingWithoutThirdVariable 
{
	public static void main(String[] args) 
	{
		int a=12, b=23;
		System.out.println("Numbers before swapp a = "+a+" and b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapp a = "+a+" and b= "+b);
	}
	
	
	
}
