package com.company.Task11;

public class Task11 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","BC2345AA");
        Car car2 = new Car("Ford","BC2345BB");
        Client client1 = new Client("Denys","01","0631234567");
        Client client2 = new Client("Ivan","02","0631234500");
        Driver driver1 = new Driver("Jhon",1);
        Driver driver2 = new Driver("Edward",2);
        Order order1 = new Order(1,car1,client1,driver1,4.05);
        order1.CountFee();
        order1.setFee();
        System.out.println(order1);
        System.out.println("Fee is: "+order1.getFee());
    }

}
