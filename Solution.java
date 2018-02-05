package neebal;
//question no 12
import java.util.Scanner;

public class Solution {
	
	
		static int b;
		static int h;
		private static void input()
		{
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter Breadth: ");
				b = sc.nextInt();
				System.out.println("Enter Height: ");
				h = sc.nextInt();
		}
		public static void main(String args[])
		{
			input();
			if(b>=-100 && h>=-100 && b<=100 && h<=100)
			{
				if(b>0 && h>0)
					System.out.println("Area of parallelogram: "+ b*h);
				else
				{System.out.println("java.lang.Exception: Breadth"+
				" and height must be positive");
				}
			}
			
		}
	}

	
		
	


