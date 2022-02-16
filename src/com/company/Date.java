package com.company;

public class Date {
    private Year year;
    private Month month;
    private Day day;

    public Date (Year year, Month month, Day day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
      public int addDays(int days, Day day, Month month){
        int totalDays = day.getDay() + days;
        if (totalDays > 28 && month.getMonth() == 2 ){
            return (totalDays - 28);

        } else if (day.getDay() > 30 && (month.getMonth() == 4) || (month.getMonth() == 6) || (month.getMonth() == 9) ||
                (month.getMonth() == 11) ){
           return (day.getDay() - 30);

        } else if (day.getDay() > 31 && (month.getMonth() == 1) || (month.getMonth() == 3) || (month.getMonth() == 5) ||
                (month.getMonth() == 7) || (month.getMonth() == 8) || (month.getMonth() == 10) || (month.getMonth() == 12)){
            return (day.getDay() - 31);
        } else
        return (day.getDay() + days);
      }
      /*public int daysInMonth(int month) {
          int daysInMonth = 0;

      }*
    /*public Date addDays(int days, Day day Month month){

        if(day.getDay() > new Day(28) && day.getDay() == new Day(02)){
            return day.getMonth(+1);
        } else if(date.getDay() > 30 && date.getMonth() == 1 || 3 || 5 || 7 || 8 || 10 || 12){

        }else {

        }
    }*/
    @Override
    public String toString(){
        return String.format("%4s-%2s-%2s", year, month, day );
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
