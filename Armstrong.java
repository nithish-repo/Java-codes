package week1day1;

public class Armstrong {
	

	public static void main(String[] args) {
		Armstrong arm=new Armstrong();
		int i=153;
		int count=0,n,result=0,temp=0;
		int k,m;
		k=i;
		m=i;
		while(k!=0)
		{
			k=k/10;
			count++;
		}
		
		
		 while(i!=0) 
		 {
			 n=i%10; 
			 temp=arm.pow(n,count); 
			 result=temp+result;
			 i=i/10;
		
		 }
		 
		if(m==result) 
		{
			System.out.println(m +" is a Armstrong number");
		}
		else
		{
			System.out.println(m +" is not a Armstrong number");
		}

	}
	public int pow(int a ,int b)
	   {
		int c=1;
	   	while(b!=0)
	   	{
	   		c=c*a;
	   		b--;
	   		
	   	}
	   	 	return c;
	   }
	
}
