//Order
package com.company.Task11;

public class Order {
    private int OrderID;
    private Client client;
    private Driver driver;
    private Car car;
    private double PointB;
    private double Taryf = 12.50;
    private double Fee;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getPointB() {
        return PointB;
    }

    public void setPointB(int pointB) {
        PointB = pointB;
    }

    public double getFee() {
        return Fee;
    }

    public void setFee() {
        Fee = CountFee();
    }

    public Order(int orderID, Car car, Client client, Driver driver, double pointB) {
        this.OrderID = orderID;
        this.car = car;
        this.client = client;
        this.driver = driver;
        this.PointB = pointB;
    }
    public double CountFee(){
        return getPointB()*Taryf;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderID=" + OrderID +
                ", client=" + client +
                ", driver=" + driver +
                ", car=" + car +
                ", PointB=" + PointB +
                ", Taryf=" + Taryf +
                ", Fee=" + Fee +
                '}';

    }
}
