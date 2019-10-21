//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		try {
			Scanner scan = new Scanner(new File("DogFood.txt"));
			
			while(scan.hasNextLine()) {
			String weight = scan.nextLine();
			DogFood DF = new DogFood(weight);
			
			System.out.println(weight);
			System.out.println(DF);
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}