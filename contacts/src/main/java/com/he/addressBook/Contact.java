package com.he.addressBook;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String name;
    private String organisation;
    private List<PhoneNumber> phoneNumbers;
    private List<Address> addresses;

    public Contact() {
    }

    public Contact(String name, String organisation, List<PhoneNumber> phoneNumbers, List<Address> addresses) {
        this.name = name;
        this.organisation = organisation;
        this.phoneNumbers = phoneNumbers;
        this.addresses = addresses;
    }
    public Contact(String worker, String hackerEarth) {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }
    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (null != phoneNumber || ValidationUtils.validateNumber(phoneNumber.getPhoneNumber())) {
            if (this.phoneNumbers != null) {
                this.phoneNumbers = new ArrayList<>();
                this.phoneNumbers.add(phoneNumber);
            } else {
                this.phoneNumbers.add(phoneNumber);
            }
        } else {
            throw new RuntimeException("Invalid Phone Number");
        }
    }

    public void addAddress(Address address) {
        if (null != address || ValidationUtils.validateNumber(address.getAddress())) {
            if (this.addresses != null) {
                this.addresses = new ArrayList<>();
                this.addresses.add(address);
            } else {
                this.addresses.add(address);
            }
        } else {
            throw new RuntimeException("Invalid Address");
        }
    }
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", organisation='" + organisation + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                '}';
    }
}