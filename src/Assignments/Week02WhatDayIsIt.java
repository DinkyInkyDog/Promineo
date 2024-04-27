package Assignments;

public class Week02WhatDayIsIt {

	public static void main(String[] args) {
		String day = "monday";
	      // WRITE YOUR CODE HERE
	        switch (day.toLowerCase()) {
	            case "monday":
	            case "tuesday":
	            case "wednesday":
	            case "thrusday" :
	            case "friday":
	                String fixedCase = day.substring(0,1).toUpperCase() + day.substring(1);
	                System.out.println(fixedCase + " is a weekday.");
	                break;
	            case "saturday":
	            case "sunday":
	                String fixedCase2 = day.substring(0,1).toUpperCase() + day.substring(1);
	                System.out.println(fixedCase2 + " is a weekend day.");
	                break;
	            default:
	                System.out.println("Invalid day!");
	        }
	}
	}
