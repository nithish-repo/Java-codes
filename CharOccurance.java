package week1day2;

public class CharOccurance {

	public static void main(String[] args) {
		int i;
		
		String str="welcome to chennai";
		char[] array= new char[str.length()];
		int []count=new int[256];
		for(i=0;i<array.length;i++)
		{
			count[str.charAt(i)]++;
		}
		for(i=0; i<array.length; i++)
		{
			array[i]=str.charAt(i);
			int flag=0;
			for(int j=0;j<=i;j++)
			{
			if(str.charAt(i)==array[j])
				{
					flag++;
				}
			}	
			if(flag==1)
			{
			System.out.println(str.charAt(i) +" has"+ count[str.charAt(i)] +" number of occurences");
			}
			
		}
		
		
	}

}

