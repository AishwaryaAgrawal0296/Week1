package neebal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EndofFile {
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("text.txt", false);// FileWriter is used to write in a file fw
		while(sc.hasNextLine())//text.txt is name of file and false is used to open the file
		{
			String[] tokens = sc.nextLine().split("\\s");
			//System.out.println("This is output: " + Arrays.toString(tokens));
			int len = tokens.length;//it stores the length of token
			
			for(int i = 0; i < tokens.length; i++)//loop will go till length of token
			{
				fw.write(tokens[i]);//write into file till ctrl Z is not pressed
				fw.write(" ");
			}
			fw.write("\n");
		}
		sc.close();//close the scanner method
		fw.close();//close the file writer method
		int ch, i =1;
		FileReader fr = null;//set file reader fr to null
		try
		{
			fr = new FileReader("text.txt");//read from file text.txt
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File Not Found");
		}
		System.out.print("1. ");		
		while((ch=fr.read())!= -1)// read till u dont reach end of file
		{
			if((char)ch=='\n')
			{
				i++;
				System.out.print("\n"+ i +". ");//print the line no
				continue;
			}
			System.out.print((char)ch);//output
		}
	}
	
}
