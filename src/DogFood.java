//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.lang.Math;

public class DogFood
{
   private double cups;

   public DogFood()
   {		
   }

   public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		double cups = 0;

		while(chopper.hasNextInt()) {
			int x = chopper.nextInt();
			if(x <= 4) {
				cups += .5*7;
			}
			else if(x <= 7) {
				cups += 1*7;
			}
			else if(x <= 9) {
				cups += 1.5*7;
			}
			else if(x <= 19) {
				cups += 2*7;
			}
			else if(x <= 39) {
				cups += 3.5*7;
			}
			else if(x <= 59) {
				cups += 4.5*7;
			}
			else if(x <= 79) {
				cups += 6.0*7;
			}
			else {
				cups += 7.5*7;
			}
		}
		this.cups = cups;
		chopper.close();
   }

   public double getAmount()
   {
	double amount = Math.ceil(cups/60);
   	return amount;
   }

	public String toString()
	{
		return getAmount() + " - 10 Pound Bags\n";
	}
}