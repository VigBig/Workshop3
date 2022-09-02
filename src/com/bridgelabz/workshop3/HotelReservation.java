package com.bridgelabz.workshop3;

import java.util.*;
import java.util.stream.Collectors;

public class HotelReservation {

    static Scanner sc = new Scanner(System.in);
    List<HotelPojo> hotelPojoList = new ArrayList<>();
    

    public void addHotelDetails() {

        HotelPojo hotelPojo = new HotelPojo();

        System.out.println("Enter Hotel Name:");
        String name = sc.next();
        hotelPojo.setName(name);

        System.out.println("Enter weekday rates for regular customer:");
        int ratesWeekdayRegularCustomer = sc.nextInt();
        hotelPojo.setRateWeekdayRegularCustomer(ratesWeekdayRegularCustomer);

        System.out.println("Enter weekend rates for regular customer:");
        int ratesWeekendRegularCustomer = sc.nextInt();
        hotelPojo.setRateWeekendRegularCustomer(ratesWeekendRegularCustomer);

        System.out.println("Enter ratings:");
        int ratings = sc.nextInt();
        hotelPojo.setRatings(ratings);

        hotelPojoList.add(hotelPojo);

    }

    public void cheapestHotelByDate() {

        Map<HotelPojo,Integer> cheapHotelPriceMap = new HashMap<>();
        List<Integer> hotelIndex = new ArrayList<>();
        DateRangeCalculate dateRangeCalculate = new DateRangeCalculate();

        System.out.println("Enter From Date:");
        String fromDate = sc.next();

        System.out.println("Enter To Date:");
        String toDate = sc.next();

        int daysDifferenceWithWeekend[] = dateRangeCalculate.calculateDateDifferenceInDays(fromDate,toDate);

        if(daysDifferenceWithWeekend == null){
            System.out.println("Error in calculating date Difference...");
        }else{

            for (HotelPojo hotelElement: hotelPojoList) {

                int numberOfWeekdays = daysDifferenceWithWeekend[0]-daysDifferenceWithWeekend[1];

                int totalHotelPrice =  hotelElement.getRateWeekdayRegularCustomer()*numberOfWeekdays + hotelElement.getRateWeekendRegularCustomer()*daysDifferenceWithWeekend[1];
                cheapHotelPriceMap.put(hotelElement,totalHotelPrice);
                
            }

        }
        LinkedHashMap<HotelPojo, Integer> sortedCheapHotelMap = new LinkedHashMap<>();

        cheapHotelPriceMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedCheapHotelMap.put(x.getKey(), x.getValue()));

        System.out.println("Map sorted by hotel prices   : " + sortedCheapHotelMap);

        Integer cheapestPrice = sortedCheapHotelMap.values().stream().findFirst().orElse(0);

        System.out.println("Cheapest Hotel Price from options based on Date Range: "+fromDate+" - "+toDate+" is "+ cheapestPrice+"$");

        for (Map.Entry<HotelPojo, Integer> cheapHotelMapElement : sortedCheapHotelMap.entrySet()){

            if(cheapestPrice == cheapHotelMapElement.getValue()){

                System.out.println("*******************************************************************************");
                System.out.println(cheapHotelMapElement.getKey().getName() + "\n"
                        +"has weekday rates of :"+cheapHotelMapElement.getKey().getRateWeekdayRegularCustomer() +"\n"
                        +"and weekend rates of :"+cheapHotelMapElement.getKey().getRateWeekendRegularCustomer() +"\n");

                System.out.println("*******************************************************************************");

            }

        }

    }


}
