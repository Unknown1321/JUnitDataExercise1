package com.company;

public class Day {
    private int day;

    public Day (int day){
        this.day = day;
    }
    @Override
    public String toString(){
        return String.format("%2d", day);
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
}
