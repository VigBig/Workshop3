package com.bridgelabz.workshop3;

public class HotelPojo {
    private String name;
    private double rateRegularCustomer;
    private double ratings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateRegularCustomer() {
        return rateRegularCustomer;
    }

    public void setRateRegularCustomer(double rateRegularCustomer) {
        this.rateRegularCustomer = rateRegularCustomer;
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
                ", rate=" + rateRegularCustomer +
                ", ratings=" + ratings +
                '}';
    }

}
