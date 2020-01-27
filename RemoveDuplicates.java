package week1Asignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] array=text.split(" ");
		int[] count= new int[256];
		for(int i=0; i<array.length;i++)
		{
			for(int j=0; j<array.length; j++)
			{
				if(array[i].equals(array[j]))
				{
					count[i]++;
										
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if(count[i]<=1)
			{
			System.out.print(array[i]+" ");
			}
		}

	}

}
