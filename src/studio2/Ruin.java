package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount: ");
		double startStart = in.nextDouble(); 
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		int totalSimulations;
		double winLimit = in.nextDouble();
		double expectedRuin;
		System.out.println("Total Simulations: ");
		totalSimulations = in.nextInt();

		for (int i = totalSimulations; i > 0; i--)
		{
			int playsPerDay = 0;
			double startAmount = startStart;

			while (startAmount > 0 && startAmount < winLimit)
			{
				
				playsPerDay++;

				if (winChance > Math.random())
				{
					startAmount++;
					System.out.println("$" + startAmount);
				}
				else
				{
					startAmount--;
					System.out.println("$" + startAmount);
				}
				
				if (startAmount == 0)
				{
					System.out.println("Day ended in ruin.");
				}
				else if (startAmount == winLimit)
				{
					System.out.println("Day ended in win!");
				}

			}
			System.out.println("Day: " + (totalSimulations - i + 1));
			System.out.println("Plays per day: " + playsPerDay); 
			System.out.println("Ruin Rate: "+ ((1-winChance) * totalSimulations));
		
			if (winChance == 0.5)
			{
				expectedRuin = (1-startAmount /(winLimit));
			}
			else 
				{
					double a;
				a = ((1-winChance)/winChance);
					expectedRuin = ((((Math.pow(a, startAmount))-(Math.pow(a, winLimit)))/(1-Math.pow(a,  winLimit))));
				}
			}
		System.out.println(expectedRuin);
		}







	}

