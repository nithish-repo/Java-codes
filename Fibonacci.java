package week1day1;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8,first=0,second=1,sum=0;
		for(int i=0;i<range;i++)
		{
			System.out.println(first);
			sum=first+second;
			first=second;
			second=sum;
			
		}

	}

}
