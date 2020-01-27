package week1day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int [] number= {3,2,11,4,6,7};
		Arrays.sort(number);
		int data= number.length;
		System.out.println(number[data-2]);
		
	}

}
