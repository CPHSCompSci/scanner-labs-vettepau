//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Paul Vetter

import java.util.Scanner;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
	setLine(" ");	
   }

   public LineCounter(String line)
   {
	setLine(line);
   }

	public void setLine(String line)
	{	
		this.line = line;
	}

	public int getCount()
	{
		int count = 0;
		
		Scanner counter = new Scanner(line);
		
		while(counter.hasNextInt())
		{
			counter.nextInt();
			count++;
		}
		counter.close();
		return count;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return "count = " + getCount();
	}
	/*public static int indexRepeat(char letter, String word)		
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
	  }*/
}