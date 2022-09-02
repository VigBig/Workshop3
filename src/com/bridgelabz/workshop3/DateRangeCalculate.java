package com.bridgelabz.workshop3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRangeCalculate {

    String[] weekDays = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    public int[] calculateDateDifferenceInDays(String fromDate, String toDate) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy");
        try{

            Date dateBefore = dateFormat.parse(fromDate);
            Date dateAfter = dateFormat.parse(toDate);
            long difference = dateAfter.getTime() - dateBefore.getTime();
            int daysBetween = (int)(difference / (1000*60*60*24)) +1 ;

            System.out.println("Number of Days between dates: "+daysBetween);

            int fromDay = dayOfWeek(fromDate);
            int toDay = dayOfWeek(toDate);

             int daysDifferenceWithWeekend[] = countWeekend(fromDay,daysBetween);

            return daysDifferenceWithWeekend;
        }catch(ParseException e){
            e.printStackTrace();
            return null;
        }

    }

    public int[] countWeekend(int fromDay, int daysBetween) {

        int daysDifferenceWithWeekend[] = new int[2];
        int saturdayCounter = 0;
        int sundayCounter = 0;
        int numberOfWeeks = daysBetween/7;
        int additionalDays = daysBetween%7;

        if(numberOfWeeks!=0){

            for(int i=1 ; i<=numberOfWeeks;i++){

                saturdayCounter++;
                sundayCounter++;
            }

        }


        int[] additionalDaysArray = new int[additionalDays];
        int i=0;

        while(i< additionalDaysArray.length){

            if(fromDay+i == 7){
                additionalDaysArray[i] = fromDay+i-7;
            }else{
                additionalDaysArray[i] = fromDay+i;
            }
            i++;
        }

        for(int j=0; j<additionalDaysArray.length; j++){

            if(additionalDaysArray[j]==0){
                sundayCounter++;
            }
            if(additionalDaysArray[j]==6){
                saturdayCounter++;
            }

        }

        int numberOfWeekends = saturdayCounter + sundayCounter;

        daysDifferenceWithWeekend[0] = daysBetween;
        daysDifferenceWithWeekend[1] = numberOfWeekends;

        return daysDifferenceWithWeekend;
    }

    public int dayOfWeek(String date) {

//        System.out.println("Enter Date:");
//        String date = sc.next();

        int day = Integer.parseInt(date.substring(0,2));
        String monthString = date.substring(2,5);
        int month =-1;
        for(int i= 0; i< months.length;i++){

            if(monthString.equals(months[i])){
                month = i+1;
            }
        }

        int year = Integer.parseInt(date.substring(5,9));

//        System.out.println("Day of Month "+monthString+": "+ day);
//        System.out.println("Month of Calendar: "+ month);
//        System.out.println("Year of Calendar: "+ year);

        int y0 = year - (14 - month) / 12;
        int x = y0 + (y0 /4) - (y0 /100) + (y0 /400);
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31*m0) / 12) % 7;

//        System.out.println("Day of Week is :"+d0);
        return d0;

    }
}
