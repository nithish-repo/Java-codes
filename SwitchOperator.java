package week1day1;

public class SwitchOperator {

	public static void main(String[] args) {
		int a=2, b=3, c=0;
		String num = "mul";
		switch(num) {
		   case "add":
			  c= a+b;
			  System.out.println(c);
			  break;
		   case "sub":
			  c= a-b;
			  System.out.println(c);
			  break;
		   case "mul":
			  c= a*b;
			 System.out.println(c);
			 break;
		   default:
			 c=a/b;
			 System.out.println(c);
			 break;
		}

	}

}
