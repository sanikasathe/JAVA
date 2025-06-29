package com.dkte;
import java.util.Scanner;

class Date {
    // fields
    private int day;
    private int month;
    private int year;

    // parameterless ctor
   Date() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day:");
        this.day = sc.nextInt();
        System.out.print("Enter month:");
        this.month = sc.nextInt();
        System.out.print("Enter year:");
        this.year = sc.nextInt();
    }

    // getter fun & setter function
   
    public int getDay() {
        return day;
    }

    // set day
    public int setDay(int day) {
        return this.day = day;
    }

    // get month
    public int getMonth() {
        return month = month;
    }

    // set month
    public int setMonth(int month) {
        return this.month = month;
    }

    // get year
    public int getYear() {
        return year;
    }

    // set year
    public int setYear(int year) {
        return this.year = year;
    }

    // display date
    void displayDate() {
        System.out.println( day + "/" + month + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date dt= new Date();
        System.out.println("\nDisplay date: ");
        System.out.println("Day:" + dt.getDay());
        System.out.println("Month:" + dt.getMonth());
        System.out.println("Year:" + dt.getYear());
        System.out.print("Original Date : ");
		dt.displayDate();
		//update date
		dt.setDay(10);
		dt.setMonth(7);
		dt.setYear(2025);
		System.out.print("\nUpdated date : ");
		dt.displayDate();
		System.out.println("Day : "+ dt.getDay());
		System.out.println("Month : "+ dt.getMonth());
		System.out.println("Year : "+ dt.getYear());
	}
    }
