package com.bridgelabz.workshop3;

public class HotelPojo {
    private String name;
    private double rateWeekdayRegularCustomer;
    private double rateWeekendRegularCustomer;
    private double ratings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateWeekdayRegularCustomer() {
        return rateWeekdayRegularCustomer;
    }

    public void setRateWeekdayRegularCustomer(double rateWeekdayRegularCustomer) {
        this.rateWeekdayRegularCustomer = rateWeekdayRegularCustomer;
    }

    public double getRateWeekendRegularCustomer() {
        return rateWeekendRegularCustomer;
    }

    public void setRateWeekendRegularCustomer(double rateWeekendRegularCustomer) {
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
