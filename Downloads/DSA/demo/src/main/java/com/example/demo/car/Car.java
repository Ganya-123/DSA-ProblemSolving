package com.example.demo.car;

public class Car {
    private long id;
    private double price;
    private String brand;
    private String model;
    private double mileageInKM;
    private double rating;

    public Car(long id, double price, String brand, String model, double mileageInKM, double rating) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.mileageInKM = mileageInKM;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileageInKM() {
        return mileageInKM;
    }

    public void setMileageInKM(double mileageInKM) {
        this.mileageInKM = mileageInKM;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileageInKM=" + mileageInKM +
                ", rating=" + rating +
                '}';
    }
}
