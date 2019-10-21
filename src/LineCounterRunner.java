//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
	   try {
		   Scanner scan = new Scanner(new File("LineCounter.txt"));
	
		   for(;scan.hasNextLine();)
			{
				String line = scan.nextLine();
				LineCounter lc = new LineCounter(line);
				
				System.out.println(line);
				System.out.println(lc);
			}
		   scan.close();
		   
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}
}