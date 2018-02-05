package neebal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseQuestion2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the postive integer ");//take input from user

try {//user may enter a value other than integer
	int p = s.nextInt();//integer
	
if(p >=1 && p <=100) //if p is greater or equal to one and less than and equal to 100
{
if(p % 2 == 0 )//if p is even
	System.out.println(" Not Weird");	//print weird
	else //if p is odd
	System.out.println("Weird");
}
	if(p >100)//if p is greater than 100
	{
		if(p%2==0)//if p is even
			System.out.println("NotWeird");//print not weird
		else//if p is odd
			System.out.println("Weird");//print weird
	}
	
	
	}
catch(InputMismatchException e) {
System.out.println( "Invalid Input ,renter the input");

}
	}
}
