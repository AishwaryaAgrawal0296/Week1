package neebal;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the 2 strings");
String a = sc.next();//1 string input
String b = sc.next();//2 string
int c = a.length() + b.length();//addition of length of both the strings and store result in c

int asc = a.charAt(0);//find Askey value of first charachter of String 1 and store in asc
int e = b.charAt(0);//find Askey value of first charachter of String 2 and store in e
System.out.println(+c);//print c
//compare both the Askey value of first charachter
if(asc > e) {//if asc is larger
	System.out.println("Yes");
}
else {//if e is larger
	System.out.println("NO");
}
	System.out.println(a    + b);// add string a and b and output
}
	}

