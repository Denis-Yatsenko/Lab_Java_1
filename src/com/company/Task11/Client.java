//Client
package com.company.Task11;

public class Client {
    private String Name;
    private String ClientID;
    private String PhoneNumber;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Client(String name,String clientID,String phoneNumber) {
        Name = name;
        ClientID = clientID;
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Name='" + Name + '\'' +
                ", ClientID='" + ClientID + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
