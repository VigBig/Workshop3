package com.bridgelabz.workshop3;

public class HotelPojo {
    private String name;
    private int rateWeekdayRegularCustomer;
    private int rateWeekendRegularCustomer;
    private double ratings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRateWeekdayRegularCustomer() {
        return rateWeekdayRegularCustomer;
    }

    public void setRateWeekdayRegularCustomer(int rateWeekdayRegularCustomer) {
        this.rateWeekdayRegularCustomer = rateWeekdayRegularCustomer;
    }

    public int getRateWeekendRegularCustomer() {
        return rateWeekendRegularCustomer;
    }

    public void setRateWeekendRegularCustomer(int rateWeekendRegularCustomer) {
        this.rateWeekendRegularCustomer = rateWeekendRegularCustomer;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "HotelPojo{" +
                "name='" + name + '\'' +
                ", rateWeekdayRegularCustomer=" + rateWeekdayRegularCustomer +
                ", rateWeekendRegularCustomer=" + rateWeekendRegularCustomer +
                ", ratings=" + ratings +
                '}';
    }
}
