package neebal;
import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerA {

public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
System.out.println("enter two no");

BigInteger a = sc.nextBigInteger();//a is 1 big Integer input from user
BigInteger b = sc.nextBigInteger();// b is 2 big Integer input from user
BigInteger c = a.add(b);//addition of a and b
BigInteger d = a.multiply(b);// multiplication of a and b
System.out.println(c);// result of addition
System.out.println(d);// result of multiplication

	}

}