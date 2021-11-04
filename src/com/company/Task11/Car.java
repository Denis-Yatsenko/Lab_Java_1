//Car

package com.company.Task11;

public class Car {
    private String CarMark;
    private String CarNumber;

    public String getCarMark() {
        return CarMark;
    }

    public void setCarMark(String carMark) {
        CarMark = carMark;
    }


    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    public Car(String carMark,String carNumber) {
        CarMark = carMark;
        CarNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarMark='" + CarMark + '\'' +
                ", CarNumber='" + CarNumber + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return CarNumber == car.CarNumber
                && (CarMark == car.CarMark
                || (CarMark != null && CarMark.equals(car.getCarMark())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +
                ((CarMark == null) ? 0 : CarMark.hashCode());
        result = prime * result;
        return result;
    }
}
