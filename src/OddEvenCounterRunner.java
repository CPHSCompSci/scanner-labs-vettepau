//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   try {
		   Scanner scan = new Scanner(new File("OELine.txt"));
	
		   for(;scan.hasNextLine();)
			{
				String line = scan.nextLine();
				LineCounter OE = new LineCounter(line);
				
				System.out.println(line);
				System.out.println(OE);
			}
		   scan.close();
		   
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}