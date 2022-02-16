package com.company;

public class Month {
    private int month;

    public Month (int month){
        this.month = month;
    }

    @Override
    public String toString(){
        return String.format("%2d", month);
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
}
