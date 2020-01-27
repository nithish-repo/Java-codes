package week1Asignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		int count=0;
		if(text1.length()==text2.length())
		{
			char[] array1=text1.toCharArray();
			char[] array2=text2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			for(int i=0;i<array1.length;i++)
			{
			   if (array1[i]!=array2[i])
			   {
				System.out.println("Both arrays does not have same value");
				count++;
				break;
			   }	
			}
			
			if(count<1)
			{
				System.out.println("Both arrays have same value");
			}
				
		}
		else
		{
			System.out.println("Both arrays does not have same length");
		}

	}

}
