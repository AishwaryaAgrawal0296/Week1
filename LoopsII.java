package neebal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsII 
{
	 static int b = 0;
		
	public static void main(String[] args)
{

Scanner sc = new Scanner (System.in);
try {
int q = sc.nextInt();// no of times we have to run a query

for(int i = 0;i<q;i++)//loop will run q-1 times
{
	int a = sc.nextInt();//value of a
	int b = sc.nextInt();//value of b
	int n = sc.nextInt();//value of n

	int sum = 0;
	sum =  a + sum;
for(int j = 0;j< n ;j++) //inner loop run till n
{
	sum = sum +(int)Math.pow(2 ,j) * b	;//the result of 2^j will be calculate then multiply by b and then add to sum
	System.out.print(+sum);//print the required answer
	System.out.print("  ");// for spacing
}
}
}

catch (InputMismatchException  e)
{
System.out.println( "Enter the valid value of q,a,b,or n");
}
catch(Exception e )
{
	System.out.println( "Exception occured");
}
}
}


