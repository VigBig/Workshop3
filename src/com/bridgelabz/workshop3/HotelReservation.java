package com.bridgelabz.workshop3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {

    static Scanner sc = new Scanner(System.in);

    List<HotelPojo> hotelPojoList = new ArrayList<>();
    public void addHotelDetails() {

        HotelPojo hotelPojo = new HotelPojo();

        System.out.println("Enter Hotel Name:");
        String name = sc.next();
        hotelPojo.setName(name);

        System.out.println("Enter weekday rates for regular customer:");
        double ratesWeekdayRegularCustomer = sc.nextDouble();
        hotelPojo.setRateWeekdayRegularCustomer(ratesWeekdayRegularCustomer);

        System.out.println("Enter weekend rates for regular customer:");
        double ratesWeekendRegularCustomer = sc.nextDouble();
        hotelPojo.setRateWeekendRegularCustomer(ratesWeekendRegularCustomer);

        hotelPojoList.add(hotelPojo);

    }
}
