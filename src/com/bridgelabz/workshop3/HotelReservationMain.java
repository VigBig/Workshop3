package com.bridgelabz.workshop3;

import java.util.Scanner;

public class HotelReservationMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System :");
        int choice;

        HotelReservation hotelReservation = new HotelReservation();
        do{

            System.out.println("Select options provided in the menu below. Entering anything else will exit the menu :");
            System.out.println("1. Add Hotel Details");
            System.out.println("2. Cheapest Hotel based on Date");
            System.out.println("3. View All Hotel Details");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    hotelReservation.addHotelDetails();

                    System.out.println("Printing All Hotel Details:");
                    for (HotelPojo hotelElement: hotelReservation.hotelPojoList) {

                        System.out.println(hotelElement);

                    }
                    break;

                case 2:
                    hotelReservation.cheapestHotelByDate();
                    break;

                case 3:
                    System.out.println("Printing All Hotel Details:");
                    for (HotelPojo hotelElement: hotelReservation.hotelPojoList) {

                        System.out.println(hotelElement);

                    }
                    break;
                default:
                    System.out.println("Exiting Menu...");
            }

        }while (choice >= 1 && choice <=3);
    }
}
