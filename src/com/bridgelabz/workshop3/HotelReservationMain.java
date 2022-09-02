package com.bridgelabz.workshop3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelReservationMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System :");
        int choice;
        int cheapestPrice = 0;
        int cheapestPriceHighestRating = 0;

        HotelReservation hotelReservation = new HotelReservation();
        do{

            System.out.println("Select options provided in the menu below. Entering anything else will exit the menu :");
            System.out.println("1. Add Hotel Details");
            System.out.println("2. Cheapest Hotel based on Date");
            System.out.println("3. Cheapest Best Rated Hotel based on Date");
            System.out.println("4. Best Rated Hotel based on Date");
            System.out.println("5. View All Hotel Details");
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
                    LinkedHashMap<HotelPojo, Integer> sortedCheapHotelByPriceMap = hotelReservation.cheapestHotelPriceByDate();

                    cheapestPrice = sortedCheapHotelByPriceMap.values().stream().findFirst().orElse(0);

                    System.out.println("Cheapest Hotel Price from options based on Date Range is "+ cheapestPrice+"$");


                    for (Map.Entry<HotelPojo, Integer> cheapHotelMapElement : sortedCheapHotelByPriceMap.entrySet()) {

                        if (cheapestPrice == cheapHotelMapElement.getValue()) {

                            System.out.println("*******************************************************************************");
                            System.out.println(cheapHotelMapElement.getKey().getName() + "\n"
                                    + "has weekday rates of :" + cheapHotelMapElement.getKey().getRateWeekdayRegularCustomer() + "\n"
                                    + "and weekend rates of :" + cheapHotelMapElement.getKey().getRateWeekendRegularCustomer() + "\n"
                                    + "and rating of :" + cheapHotelMapElement.getKey().getRatings() + "\n");

                            System.out.println("*******************************************************************************");


                        }
                    }
                    break;

                case 3:
                    LinkedHashMap<HotelPojo, Integer> sortedBestCheapHotelByPriceMap = hotelReservation.cheapestBestHotelPriceByDate(hotelReservation.cheapestHotelPriceByDate());

                    cheapestPrice = sortedBestCheapHotelByPriceMap.values().stream().findFirst().orElse(0);
                    cheapestPriceHighestRating = sortedBestCheapHotelByPriceMap.keySet().stream().findFirst().get().getRatings();

                    System.out.println("Cheapest Best Rated Hotel Price from options based on Date Range is "+ cheapestPrice+"$");


                    for (Map.Entry<HotelPojo, Integer> cheapHotelMapElement : sortedBestCheapHotelByPriceMap.entrySet()) {

                        if( (cheapestPriceHighestRating < cheapHotelMapElement.getKey().getRatings()) && (cheapestPrice == cheapHotelMapElement.getValue()) ){

                            cheapestPriceHighestRating = cheapHotelMapElement.getKey().getRatings();

                        }
                    }

                    for (Map.Entry<HotelPojo, Integer> cheapHotelMapElement : sortedBestCheapHotelByPriceMap.entrySet()) {

                        if( (cheapestPriceHighestRating == cheapHotelMapElement.getKey().getRatings()) && (cheapestPrice == cheapHotelMapElement.getValue()) ){

                            System.out.println("*******************************************************************************");
                            System.out.println(cheapHotelMapElement.getKey().getName() + "\n"
                                    + "has weekday rates of :" + cheapHotelMapElement.getKey().getRateWeekdayRegularCustomer() + "\n"
                                    + "and weekend rates of :" + cheapHotelMapElement.getKey().getRateWeekendRegularCustomer() + "\n"
                                    + "and rating of :" + cheapHotelMapElement.getKey().getRatings() + "\n");
                            System.out.println("*******************************************************************************");

                        }
                    }

//                    int finalCheapestPriceHighestRating = cheapestPriceHighestRating;
//                    sortedBestCheapHotelByPriceMap.keySet().stream().filter(x ->( finalCheapestPriceHighestRating == x.getRatings()) ).forEach(System.out::println);
                    break;

                case 4:
                    sortedCheapHotelByPriceMap = hotelReservation.cheapestHotelPriceByDate();

                    for (Map.Entry<HotelPojo, Integer> cheapHotelMapElement : sortedCheapHotelByPriceMap.entrySet()) {

                        if( cheapestPriceHighestRating < cheapHotelMapElement.getKey().getRatings()){

                            cheapestPriceHighestRating = cheapHotelMapElement.getKey().getRatings();
                            cheapestPrice = cheapHotelMapElement.getValue();

                        }
                    }

                    System.out.println("Best Rated Hotel from options based on Date Range is "+ cheapestPrice+"$");
                    for (Map.Entry<HotelPojo, Integer> cheapHotelMapElement : sortedCheapHotelByPriceMap.entrySet()) {

                        if( cheapestPriceHighestRating == cheapHotelMapElement.getKey().getRatings() ){

                            System.out.println("*******************************************************************************");
                            System.out.println(cheapHotelMapElement.getKey().getName() + "\n"
                                    + "has weekday rates of :" + cheapHotelMapElement.getKey().getRateWeekdayRegularCustomer() + "\n"
                                    + "and weekend rates of :" + cheapHotelMapElement.getKey().getRateWeekendRegularCustomer() + "\n"
                                    + "and rating of :" + cheapHotelMapElement.getKey().getRatings() + "\n");
                            System.out.println("*******************************************************************************");

                        }
                    }

                    break;

                case 5:

                    System.out.println("Printing All Hotel Details:");
                    for (HotelPojo hotelElement: hotelReservation.hotelPojoList) {

                        System.out.println(hotelElement);

                    }
                    break;

                default:
                    System.out.println("Exiting Menu...");
                    break;
            }

        }while (choice >= 1 && choice <=3);
    }
}
