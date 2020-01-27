package week1day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int number=1234;
		int temp=0;
		int add=0;
		while (number!=0)
		{
			temp=number%10;
			add=add+temp;
			number/=10;
			
		}
		System.out.println(add);
	}

}
