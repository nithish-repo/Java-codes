package week1Asignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum=0;
		text=text.replaceAll("[\\D]", "");
        System.out.print(text);
        System.out.println();
        char[] array=text.toCharArray();
        for(int i=0;i<text.length();i++)
        {
        	sum=sum+Character.getNumericValue(array[i]);
        }
        System.out.println("Sum of digits present in a string is "+sum);
        
	}

}
