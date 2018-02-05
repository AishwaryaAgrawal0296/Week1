package neebal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIII {
	public static boolean NameValidator(String ipAddr)
	{
      //  Pattern ptn = Pattern.compile("[A-Za-z0-9]{10}");
Pattern ptn = Pattern.compile("^[A-Za-z_]+\\d*[A-Za-z_]*\\w{8,30}\\b");//the pattern will match the 
//the given input name.the first b;ock means fist charchter should be a alphabetic charchter and agter that 
//there may be digts and a underscore any other than this will not be valid.
        Matcher mtch = ptn.matcher(ipAddr);//the macher method matches our with our pattern
        return mtch.find();
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
try {
int b = sc.nextInt();//no of inputs form user
sc.nextLine();
	String[] str = new String[100];//an array pf string to store inputs

	int i = 0;
	while(sc.hasNextLine())
{
		str[i] = sc.nextLine();
		if(str[i].isEmpty())// if 2 times enter the press then end of input array
			break;
		i++;
	}
	for(int j = 0 ; j< i; j++)//output
	{
			System.out.println(RegexIII.NameValidator(str[j]));
		
	}
}
catch(Exception e) {
System.out.println("Invalid Input");
}
	}
}
