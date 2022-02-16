package com.company;

public class Main {

    public static void main(String[] args) {
	    Date newDate = new Date(new Year(2022), new Month(3), new Day(16));
        System.out.println(newDate);
        System.out.println(newDate.addDays(30, newDate.getDay(), newDate.getMonth(), newDate.getYear()));
    }
}
