package neebal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static boolean isValidIP(String ipAddr)
	{
        Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher mtch = ptn.matcher(ipAddr);//match with pattern
        return mtch.find();//return value
    }
 
    public static void main(String args[])
	{
     //   System.out.println("10.23.45.12 "+RegexDemoIp.isValidIP("10.23.45.12"));
    //System.out.println("10.2a.56.32 "+RegexDemoIp.isValidIP("10.2a.56.32"));
      //  System.out.println("10.23.45 "+RegexDemoIp.isValidIP("10.23.45"));
    	String[] str = new String[100];//string array has size 100
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(sc.hasNextLine())
		{
			str[i] = sc.nextLine();// the input will stop taking when press enter 2 times
			if(str[i].isEmpty())
				break;
			i++;
		}
		for(int j = 0 ; j< i; j++)
		{
				System.out.println( RegexDemoIp.isValidIP(str[j]));//output will print
		}
    }
}
    

/*
^ -->start of the line
( -->start of block
\\d{1,3} -->any digit of length 1 to 3
) --> end of the block
*/

