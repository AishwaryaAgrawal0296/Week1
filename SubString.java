package neebal;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
try {
	String s1 = null;
	
	String s = sc.nextLine();//enter a string
	
	int n = sc.nextInt(); //index of the string from where we want substring
	int p = sc.nextInt();//end of index
	for(int j = n ;j<p;j++)//loop till start and end index
	{
		 s1 = s.substring(n ,p);//transfer the substring to empty string
		
	}
	System.out.println(s1);//output
}

catch(Exception e) {
System.out.println("Invalid DataTypes");
}		

}
}