package neebal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsQuestion5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("enter the integer");
		int n = sc.nextInt();
		int result = 1 ;
		if(n >= 2 && n <= 20)//value of should not be less than 2 and greater than 20
		{
		
		for(int i = 1 ; i <= 10;i++)
		{
			String x ;
			System.out.println(n+ "x"+i +" = "+(n*i));//here the n multiply by i 
			//System.out.println( result = n*i);
			//n = ;
			//System.out.println(+ result);
		}

	}
		else//if n is less 2 or greater 20
		System.out.println("Enter n in between 2 and 20");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter valid input");
		}

}
}
