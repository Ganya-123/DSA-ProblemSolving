package com.example.demo.stock;

public class Stock {
    private String id;
    private String name;
    private double totalValue;
    private long availableUnits;
    private double totalExpectedProfitPerMonth;

    public Stock(String id, String name, double totalValue, long availableUnits, double totalExpectedProfitPerMonth) {
        this.id = id;
        this.name = name;
        this.totalValue = totalValue;
        this.availableUnits = availableUnits;
        this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
    }

    public double getTotalExpectedProfitPerMonth() {
        return totalExpectedProfitPerMonth;
    }

    public void setTotalExpectedProfitPerMonth(double totalExpectedProfitPerMonth) {
        this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", totalValue=" + totalValue +
                ", availableUnits=" + availableUnits +
                ", totalExpectedProfitPerMonth=" + totalExpectedProfitPerMonth +
                '}';
    }
}
