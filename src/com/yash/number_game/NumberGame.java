package com.yash.number_game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void randomNumGenerator() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int score = 0;
		boolean response = true;

		while (response) {
			int maxAtmt = 3;
			int atmt = 0;
			boolean result = false;
			int rndNum = random.nextInt(1, 100);
			System.out.println("Random number is generated successfully!");
			while (atmt < maxAtmt) {
				atmt++;
				System.out.println("Enter a number to guess: ");
				int gsNum = sc.nextInt();

				if (rndNum == gsNum) {
					System.out.println("Yeh! You have guessed correct number.");
					result = true;
					score++;
					break;
				} else if (rndNum > gsNum) {
					System.out.println("Oh no! Number which you have guessed is smaller.");
				} else {
					System.out.println("Oh no! Number which you have guessed is greater.");
				}
				System.out.println("Please try again. You have " + (maxAtmt - atmt) + " attempts left.");
			}

			if (!result) {
				System.out.println("Sorry! Your attempts are over.");
			}

			System.out.println("Your Score is: " + score);
			System.out.println("Do you want to play again?(y/n): ");
			String ans = sc.next();
			response = ans.equalsIgnoreCase("y");
		}
		System.out.println("Thank you for playing.");
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("====== Welcome to Number Game ======");
		NumberGame.randomNumGenerator();
	}
}
