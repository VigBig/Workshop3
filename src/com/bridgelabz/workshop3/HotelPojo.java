package com.bridgelabz.workshop3;

public class HotelPojo {
    private String name;
    private int rateWeekdayRegularCustomer;
    private int rateWeekendRegularCustomer;
    private int rateWeekdayRewardsCustomer;
    private int rateWeekendRewardsCustomer;
    private int ratings;

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

    public int getRateWeekdayRewardsCustomer() {
        return rateWeekdayRewardsCustomer;
    }

    public void setRateWeekdayRewardsCustomer(int rateWeekdayRewardsCustomer) {
        this.rateWeekdayRewardsCustomer = rateWeekdayRewardsCustomer;
    }

    public int getRateWeekendRewardsCustomer() {
        return rateWeekendRewardsCustomer;
    }

    public void setRateWeekendRewardsCustomer(int rateWeekendRewardsCustomer) {
        this.rateWeekendRewardsCustomer = rateWeekendRewardsCustomer;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "HotelPojo{" +
                "name='" + name + '\'' +
                ", rateWeekdayRegularCustomer=" + rateWeekdayRegularCustomer +
                ", rateWeekendRegularCustomer=" + rateWeekendRegularCustomer +
                ", rateWeekdayRewardsCustomer=" + rateWeekdayRewardsCustomer +
                ", rateWeekendRewardsCustomer=" + rateWeekendRewardsCustomer +
                ", ratings=" + ratings +
                '}';
    }
}
