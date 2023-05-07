package com.geekster.ecommerce.models;

public class Address {
    private int addressId;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipCode;
    private String state;
    private int UserId;

    public Address(int addressId, String name, String landmark, String phoneNumber, String zipCode, String state, int userId) {
        this.addressId = addressId;
        this.name = name;
        this.landmark = landmark;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        UserId = userId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }
}
