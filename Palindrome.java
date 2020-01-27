package week1Asignments;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		int j=0;
		char[] array=str.toCharArray();
		char[] rev= new char[array.length];
		for(int i=str.length()-1;i>=0;i--)
		{
			
				rev[j]=array[i];
				j++;
			
			
		}
		
		String rev1= new String(rev);
		//System.out.println(rev1);
		if(str.equals(rev1))
		{
			System.out.println(str+ " is an palindrome");
		}
		else
		{
			System.out.println(str+ " is not an palindrome");
		}
	}
	

}
