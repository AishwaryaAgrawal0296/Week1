package neebal;
import java.math.BigDecimal;
import java.util.*;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the no of input between 1 to 200 ");
        int n=sc.nextInt();// no of inputs from user
       if(n>=1 && n<=200) {
        String []s=new String[n];//Declaration of  array
        for(int i=0;i<n;i++){
            s[i]=sc.next();// taking input from user
          // if(s[i].length()<300==true) {
            	//System.out.println("invalid ");
            	//return ;
        
        
        } 
        for (int i = 0; i < n; i++) { // used insertion sort because its a stable algorithm
        	//that means if 2 values mean the same meaning then in our sorted array we 
        	//the input which is given first will be print first in the output.
        	// for eg 1 ,2 ,4,0.12,.12 is an array of length = 5
        	//then in output we will get
        	//4,2,1,0.12,.12
            for (int j = 1; j < (n - i); j++)  {
             String temp="";
             // instead of && compareTo is used for BigDecimal
             if(new BigDecimal(s[j-1]).compareTo(new BigDecimal(s[j])) < 0) {
                 temp = s[j-1];
                s[j-1] = s[j];
                s[j] = temp;
             }
          }
            }
        for(int i = 0;i< n ;i++)//output
        {
        	System.out.println(s[i]);// sorted array is print as output
        }
        
	}
       else
       {
    	   System.out.println("enter th value of n again");
       }
	}
}
