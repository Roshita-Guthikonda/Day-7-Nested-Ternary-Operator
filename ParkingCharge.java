/*Total Parking Fees:
-----------------------
A parking lot charges $2 per hour for the first 3 hours and 1$ per hour thereafter.
Calculate the total parking fee based on the number of hours parked.*/



package com.codegnan.operatorexamples;

import java.util.Scanner;

public class ParkingCharge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hours to park an vehicle(24 hrs-format)");
		int hours=sc.nextInt();
		int fee=(hours<=3)?(hours*2):(3*2+(hours-3)*1);
		System.out.println(fee);
		sc.close();

	}

}
