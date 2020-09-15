package com.he.addressBook;

public class Address {

    public String label;
    public String Address;

    public Address() {
    }
    public Address(String label, String address) {
        this.label = label;
        this.Address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "label='" + label + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
