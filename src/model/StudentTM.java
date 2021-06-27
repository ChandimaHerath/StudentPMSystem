package model;

import java.io.Serializable;

public class StudentTM implements Serializable
{
    private String Name;
    private String NIC;
    private String Address;

    public StudentTM(){

    }

    public StudentTM(String name, String NIC, String address) {
        Name = name;
        this.NIC = NIC;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
