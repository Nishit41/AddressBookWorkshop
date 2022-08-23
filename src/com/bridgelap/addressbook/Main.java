package com.bridgelap.addressbook;

import java.util.HashMap;
import java.util.Map;

public class Main {
       static String addressbookName = "FistAddressBook";
    public static void main(String[] args) {
        Map<String,AddressBook> addressBookMap = new HashMap<>();
        AddressBook firstAddressBook = new AddressBook();
        firstAddressBook.addContacts();
        System.out.println(firstAddressBook.contactList);
        AddressBook secondAddressBook = new AddressBook();
        secondAddressBook.addContacts();
        System.out.println(secondAddressBook.contactList);
        addressBookMap.put(addressbookName,firstAddressBook);

    }
}
