package neebal;
import java.io.*;
import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();// no of inputs
		for(int i = 0;i<t;i++)
		{
			try//if exception arises
			{
				long x = sc.nextLong();//declare x as long
				System.out.println("x can be fitted in :");
				if(x >= -128 && x<= 127)//range of byte
					System.out.println("*byte");
				if(x>=-32768 && x<= 32767)
					System.out.println("*short");//range of short
				if(x>=-2147483648 && x<=2147483647)
				System.out.println("*Integer");//range of integer
				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)//range of long
					System.out.println("*Long");
			}
			catch(Exception e){//to catch the exception of type mismatch
				System.out.println(sc.next()+"can't be fitted anywhere");//the x value will be print along the message can fit anywhere
			}
				
		}		
		}			
}
