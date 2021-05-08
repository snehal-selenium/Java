package Learning_1;

public class Palindrome 
{

	public static void main(String[] args) 
	{
	int a=1221;
	int rev=0;
	int old_num=a;
	while(a>0)
	{
		int b=a%10;   
		rev = rev*10+b;  
		a=a/10;   
	}
	if (old_num==rev)
	{
		System.out.println("Nuumber is palindrome");
	}
	else
	{
		System.out.println("Number is not a palinadrome");
	}
	}
}
