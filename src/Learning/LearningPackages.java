package Learning;

import java.util.Scanner;

public class LearningPackages {

	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println("Title: Learning Packages");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:");
		System.out.println("\tGiven a pre-defined set of criteria calculate the Total Cost");
		System.out.println("========================\n");

		// Pre-defined Criteria
		System.out.println("Learning Package 1:");
		System.out.println("\t£10/mth (includes 2 courses/month)");
		System.out.println("\tEach additional Course is £6");
		System.out.println("");
		System.out.println("Learning Package 2:");
		System.out.println("\t£12/mth (includes 4 courses/month)");
		System.out.println("\tEach additional Course is £4");
		System.out.println("");
		System.out.println("Learning Package 3:");
		System.out.println("\t£15/mth (includes 6 courses/month)");
		System.out.println("\tEach additional Course is £3");
		System.out.println("");

		// Begin code
		Scanner sc = new Scanner(System.in);

		int pack; // Package Number
		int courses;
		int baseCost;
		int costPerCourse;
		int numInc;
		int totalCost;

		// Let User Select Package
		System.out.println("Which package do you require? (1, 2 or 3)");
		pack = sc.nextInt();
		// Let user input amount of courses this month
		System.out.println("How many courses did you enrol in this month?");
		courses = sc.nextInt();

		if (pack == 1) {
			// Package 1
			baseCost = 10;
			costPerCourse = 6;
			numInc = 2;
		} else if (pack == 2) {
			// Package 2
			baseCost = 12;
			costPerCourse = 4;
			numInc = 4;
		} else {
			// Package 3
			baseCost = 15;
			costPerCourse = 3;
			numInc = 6;
		}

		// Calculate total cost
		if (courses > numInc) {
			totalCost = baseCost + (courses - numInc) * costPerCourse;
		} else {
			totalCost = baseCost;
		}
		System.out.println("Total cost is £" + totalCost);
	}// end main

}
