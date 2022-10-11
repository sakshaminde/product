package prime;

public class Prime 
{
int i, a=0, flag=0;
boolean prime(int n)
{
	a=n/2;
	if(n==0 || n==1)
	{
		System.out.println("Number is not prime");
		return false;
	}
	else
	{
		for(i=2;i<=a;i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is not prime");
				flag=1;
				return false;
			}
		}
		if(flag==0)
		{
			System.out.println("Number is prime");
			return true;
		}
	}
	return prime(n);
}
public static void main(String[] args)
{
	Prime P1 = new Prime();
	P1.prime(5);
}
}
