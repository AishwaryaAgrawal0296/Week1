package neebal;
import java.util.Scanner;
public class Printf 
{

    private static void printRowOutlined(String left, int right) 
	{
        //System.out.printf("%-15s", left);
        //System.out.printf("%03d\n", right);
		System.out.printf("%-15s%03d%n", left, right);
    }
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        String[] text = new String[a];
        int[] number = new int[a];
       for(int j = 0; j < a; j++)
		{
            text[j] = sc.next();
           number[j] = sc.nextInt();
          // if(text[j].length() > 10) {
        	  // System.out.println("String is too long");
        	  // break;
           }
		
		System.out.println("================================");
        
		for(int i=0; i < a; i++)
		{
			if(text[i].length() > 10) {
	        	   System.out.println( text[i]+"String is too long");
	        	   continue ;
			}
	        else 
			printRowOutlined(text[i], number[i]);
	        }
			   
    System.out.println("================================");
	}
}
