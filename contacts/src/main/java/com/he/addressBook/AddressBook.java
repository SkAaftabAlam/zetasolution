package com.he.addressBook;

import java.util.List;


import java.util.*;

public class AddressBook extends Contact {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {

        if (ValidationUtils.validateContact(contact)) {
            contacts.add(contact);
        } else {
            throw new RuntimeException("Invalid Contact");
        }
    }

    public List<Contact> searchByName(String name) {

        List<Contact> contactList = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contactList.add(contact);
            }
        }
        return contactList;
    }

    public List<Contact> searchByOrganisation(String organisation) {
        List<Contact> contactList = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getOrganisation().equalsIgnoreCase(organisation)) {
                contactList.add(contact);
            }
        }
        return contactList;
    }

    public void updateContact(String name, Contact contact) {
        if (ValidationUtils.validateContact(contact)) {
            boolean flag1 = false;
            for (Contact contact1 : contacts) {
                if (contact1.getName().equalsIgnoreCase(name) && !contact1.getName().equalsIgnoreCase(contact1.getName())) {
                    flag1 = true;
                    break;
                }
            }
            if (flag1) {
                contacts.add(contact);
            } else {
                throw new RuntimeException("Either Duplicate Record found or Name doesn't exist");
            }
        } else {
            throw new RuntimeException("Invalid Contact");
        }
    }

    public void deleteContact(String name) {
        Contact findContact = null;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                findContact = contact;
                break;
            }
        }
        if (findContact != null) {
            contacts.remove(findContact);
        } else {
            throw new RuntimeException("Name does not exist");
        }
    }
}
