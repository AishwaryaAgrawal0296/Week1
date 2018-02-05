package neebal;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Int_to_String {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();//no of inputs
		for(int i = 0 ;i<a;i++) {
		
			int n = sc.nextInt();//integer input
		
		
		if(n>=-100 && n<=100)
		{
			String s = Integer.toString(n);//convert integer to string
		
			System.out.println("Good Job");//if sucessful then print good job			
		}
		else
		{
			System.out.println("Wrong answer");//if not print wrong answer
		}

	}
		}
		catch(InputMismatchException e) {
		System.out.println("Invalid value of n");
}
}
}
