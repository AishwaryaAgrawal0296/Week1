package neebal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexII {
	

	public static void main(String args[])
	{
		//regex pattern for duplicate words:
				String regexPattern = "\\b(\\w+)(\\W+\\1\\b)+";
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of input Strings:");
				int n = sc.nextInt();
				System.out.println("Enter the "+n+" Strings:");
				String[] inputStr = new String[n];
				//consuming the sc.nextInt() new line
				sc.nextLine();
				for(int i=0; i<n; i++)
				{
					inputStr[i] = sc.nextLine();
					//Creating pattern instance form regex
					Pattern p = Pattern.compile(regexPattern);
					//Creating Matcher instance from Pattern instance
					Matcher m = p.matcher(inputStr[i]);
					//find method Attempts to find 
					//the next subsequence of the input sequence that matches the pattern.
					//returns true if it matches
					while(m.find())
					{
						/*replaceAll() method Replaces each substring of this string that matches 
						the given regular expression with the given replacement.
						*/
						
						inputStr[i] = inputStr[i].replaceAll(m.group(), m.group(1));
						
						/*
						group() method will return the group of repeated words
						group(1) method will return only one occurrence of repeated words
						
						For more clarity of group() and group(1) uncomment the below lines:
						/*
						/*
						System.out.println("m.group() : " + m.group());
						System.out.println("m.group(1) : "m.group(1));
						*/
					}
				}
				System.out.println("Output:");
				for(int i = 0; i<n; i++)
				{
					System.out.println(inputStr[i]);
				}
				
				
			}
		}
