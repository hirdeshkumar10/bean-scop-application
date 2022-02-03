package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address")
@Scope("prototype")
public class Address {

    private String addressLine1 ;
    private String addressLine2 ;
    private String city ;
    private String state ;
    private String country ;
    private String zipcode ;

    public Address(){
        System.out.println("Address object is created:");
    }

    public Address(String addressLine1, String addressLine2, String city, String state, String country, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    @Value("Khurrampur")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    @Value("Mohanpura")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    @Value("kasganj")
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    @Value("uttar pradesh")
    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    @Value("India")
    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Value("5755")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
