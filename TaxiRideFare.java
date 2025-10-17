/*Taxi Ride Fare:
--------------------
You are tasked with writing a program that calculates the fare for a taxi ride based on:
A base fare of 60 for first 2 kilometers.
A rate of 15 per kilometer for the next 8 kilometers.
A rate of 10 per kilometer for distance above 10 kilometers.
Additionally, if the distance is more than 20 kilometers, the fare gets a 5% discount.*/



package com.codegnan.operatorexamples;

import java.util.Scanner;

public class TaxiRideFare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of kilometers travelled :");
		int km=sc.nextInt();
		//first 2kms 50 and next 8kms are 8*15
		double fare=(km<=2)?50 :
			(km<=8) ?(50+(km-2)*15):
				//first 2kms=50+next 8*15 +above 10*10
				(50+(8*15)+(km-10)*10);
		fare=(km>20)?fare*0.95:fare;
		System.out.println(+fare);
		sc.close();
		
	}

}
