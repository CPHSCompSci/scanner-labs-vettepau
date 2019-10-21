//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
	   setLine(" ");
   }

   public OddEvenCounter(String s)
   {
	   setLine(s);
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getEvenCount()
	{
		int evenCount = 0;
		
		Scanner counter = new Scanner(line);
		
		while(counter.hasNextInt())
		{
			int x = counter.nextInt();
			if(x % 2 == 0) {
			evenCount++;
			}
			else {}
		}
		counter.close();
		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount = 0;
		
		Scanner counter2 = new Scanner(line);
		
		while(counter2.hasNextInt()) {
			int x = counter2.nextInt();
			if(x % 2 == 0) {
				
			}
			else
			{
				oddCount++;
			}
		}
		counter2.close();
		return oddCount;
	}

	public String toString( )
	{
		return "even count = " + getEvenCount() + "\nodd count = " + getOddCount() + "\n";
	}
}