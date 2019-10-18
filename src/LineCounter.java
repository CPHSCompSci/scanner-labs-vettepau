//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Vetter

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class LineCounter
{
	private ArrayList<String> lines;
   private String line;

  /* public LineCounter()
   {
		
   }*/

   public LineCounter()
   {
	   setLine();
	   getLine();
   }

	public void setLine()
	{
		try {
			Scanner fileScanner = new Scanner(new File("LineCounter"));
			
			while(fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			lines.add(line);
			}
			fileScanner.close();
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}

	public int getCount(String s)
	{
		int count=1;	
		int num = indexRepeat(' ', s);
		if(num != 0) {
			count = num++;
		}
		return count;
	}

	public void getLine()
	{
		for(String a: lines) {
			String line = a.toString();
			int b = getCount(line);
			System.out.println("count = " + b);
		}
	}

	public String toString(int a)
	{
		return lines.get(a);
	}
	public static int indexRepeat(char letter, String word)		
	  {
		  int a;
		  int num = 0;
		  for(a = 0; a < word.length()-1; a++)
		  {
			  if(word.charAt(a) == letter)
			  {
				  num++;
			  }
		  }	  
		return num;
	  }
}