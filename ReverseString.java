package week1day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		char[] array=test.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]);
		}
		
		String test1= "feeling good";
		int array1=test1.length();
		for(int i=array1-1;i>=0;i--)
		{
			System.out.print(test1.charAt(i));
		}

	}

}
