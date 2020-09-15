package com.he.addressBook;


public class ValidationUtils {
        public static  boolean validateContact(Contact contact){
            boolean flag1 = false;
            if(validateString(contact.getName()) && validateString(contact.getOrganisation())) {
                flag1 = true;
            }
            boolean flag2 = false;
            if(null != contact.getPhoneNumbers() && contact.getPhoneNumbers().size() >0 ){
                for (PhoneNumber phoneNumber : contact.getPhoneNumbers()){
                    if (phoneNumber != null && validateNumber(phoneNumber.getPhoneNumber())){
                        flag2 = true;
                    } else {
                        flag2 =false;
                        break;
                    }
                }
            }
            boolean flag3 = false;
            if(null != contact.getAddresses() && contact.getAddresses().size() >0 ){
                for (Address address : contact.getAddresses()){
                    if (address != null && validateString(address.getAddress())){
                        flag2 = true;
                    } else {
                        flag2 =false;
                        break;
                    }
                }
            }
            if(flag1 && flag2 && flag3){
                return  true;
            }else {
                return  false;
            }
        }
        public static boolean validateNumber(String number){
            if (null != number && number.trim() !="" && number.length() ==10){
                return true;
            }else {
                return false;
            }
        }
        public static boolean validateString(String value){
            if (null != value && value.trim() !="" && value.length() <=255){
                return true;
            }else {
                return false;
            }
        }
    }

