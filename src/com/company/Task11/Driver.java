//Driver
package com.company.Task11;

public class Driver {
    private String Name;
    private int DriverID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDriverID() {
        return DriverID;
    }

    public void setDriverID(int driverID) {
        DriverID = driverID;
    }

    public Driver(String name,int driverID) {
        Name = name;
        DriverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "Name='" + Name + '\'' +
                ", DriverID=" + DriverID +
                '}';
    }
}
