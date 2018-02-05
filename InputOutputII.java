package neebal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutputII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
try {
int d = sc.nextInt();//enter no of inputs
for(int i = 0;i<d;i++) {
	

System.out.println("Enter the ingeter number");
int a = sc.nextInt();
System.out.println("enter a double number");
double b = sc.nextDouble();
System.out.println("enter a string");
sc.nextLine();//use this empty the previous buffer of double
String c = sc.nextLine();
//System.out.println("String" +c.length());
System.out.println("String:" +c);//print string
//System.out.println( +c.length());
System.out.println("double:"+b);//print double output
System.out.println("Integer:"+a);//print integer
	}

}

catch(InputMismatchException e) {
System.out.println( "Invalid Input ,renter the input");

}
	}
}
