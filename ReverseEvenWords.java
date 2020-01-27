package week1Asignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] array=test.split(" ");
		for(int i=0;i<array.length;i++)
		{
			if(i%2!=0)
			{
				for (int j = array[i].length()-1 ; j>=0 ; j--)
				{
					System.out.print(array[i].charAt(j));
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(array[i]+" ");
			}
				
		}
		

	}

}
