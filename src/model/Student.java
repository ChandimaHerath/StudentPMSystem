package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable
{
    private String name;
    private String nic;
    private String telephone;
    private String address;
    private String email;
    private String course;
    private String batch;
    private String paymentmethod;
    private String recieptdate;

    public Student(){

    }

    public Student(String name, String nic, String telephone,String address, String email, String course, String batch, String paymentmethod, String recieptdate) {
        this.name = name;
        this.nic = nic;
        this.telephone = telephone;
        this.address= address;
        this.email = email;
        this.course = course;
        this.batch = batch;
        this.paymentmethod = paymentmethod;
        this.recieptdate = recieptdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getRecieptdate() {
        return recieptdate;
    }

    public void setRecieptdate(String recieptdate) {
        this.recieptdate = recieptdate;
    }

}
