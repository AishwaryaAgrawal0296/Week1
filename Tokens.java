package neebal;
//question no 19
import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();//take a input string
	int	p =t.length();// calculate the length of t string and store it in integer p
		if(p>=1 && p<=(int)Math.pow(5,10)*4) {//length of string should not be less than 1 and more than 4*10^5
		//String [] str = t.split("\\s");
		String [] str = t.split("[\\s  \\'\\,\\_ \\@ \\.\\?]");//the split function with re it will split string after a space,
		//presence of  symbol like ,'@.?
		System.out.println(str.length);//print no of substrings
		for(String a : str)
		{
			
			System.out.println(a);// print substrings
		
			}
		}
		else
			System.out.println("enter the valid string");
		}

	}

