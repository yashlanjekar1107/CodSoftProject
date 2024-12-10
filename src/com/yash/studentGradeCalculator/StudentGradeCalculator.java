package com.yash.studentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void studentGrade() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number of subjects: ");
		int numSubjects = sc.nextInt();

		int[] marks = new int[numSubjects];

		int totalMarks = 0;

		System.out.println("Enter the marks in each subject out of 100: ");
		for (int i = 0; i < numSubjects; i++) {
			System.out.println("Marks in subject " + (i + 1) + " :");
			marks[i] = sc.nextInt();
			totalMarks += marks[i];
		}

		double avgPercentage = (double) totalMarks / numSubjects;

		String gradeObtain;
		if (avgPercentage >= 90) {
			gradeObtain = "A";
		} else if (avgPercentage >= 80) {
			gradeObtain = "B";
		} else if (avgPercentage >= 70) {
			gradeObtain = "C";
		} else if (avgPercentage >= 60) {
			gradeObtain = "D";
		} else {
			gradeObtain = "F";
		}

		System.out.println("====== Result Declaration ======");
		System.out.println("Total Sum of Marks : " + totalMarks);
		System.out.println("Average Percentage Scored : " + avgPercentage + " %");
		System.out.println("Obatined Grade According to Avg. Percentage : " + gradeObtain);
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("====== Welcome to Student Grade Calculator ======");
		StudentGradeCalculator.studentGrade();
	}

}
