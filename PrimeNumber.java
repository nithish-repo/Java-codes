package week1day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=13;
		int flag=0;
		for(int n=1; n<i/2; n++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(i+" is a prime number");
		}
		else
		{
			System.out.println(i+" is not a prime number");
		}

	}

}
