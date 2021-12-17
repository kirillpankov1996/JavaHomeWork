package com.pb.pankov.hw11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ParseException {
        PhoneBook phoneBook = new PhoneBook();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        phoneBook.add(new PhoneItem("Name3", formatter.parse("01.01.2000"), new ArrayList<>(Arrays.asList("111-000-000", "222-000-000", "333-000-000")), "Address3", Calendar.getInstance().getTimeInMillis()));
        phoneBook.add(new PhoneItem("Name1", formatter.parse("03.03.2002"), new ArrayList<>(Arrays.asList("000-000-333", "000-000-111", "000-000-222")), "Address1", Calendar.getInstance().getTimeInMillis()));
        phoneBook.add(new PhoneItem("Name2", formatter.parse("02.02.2001"), new ArrayList<>(Arrays.asList("000-222-000", "000-333-000", "000-111-000")), "Address2", Calendar.getInstance().getTimeInMillis()));
        PhoneItem phoneToRemove = new PhoneItem("NameToRemove", formatter.parse("05.05.2011"), new ArrayList<>(Arrays.asList("000-000-000", "333-333-333", "111-111-111")), "AddressToDelete", Calendar.getInstance().getTimeInMillis());
        phoneBook.add(phoneToRemove);
        System.out.println("Phone book: ");
        System.out.println(phoneBook);
        phoneBook.remove(phoneToRemove);
        System.out.println("Phone book (removed phone item with name \"NameToRemove\"): ");
        System.out.println(phoneBook);
        System.out.println();

        System.out.println("Sorted by Full Name: " + phoneBook.findAllSorted(PhoneItemField.FULL_NAME));
        System.out.println("Sorted by Birth Date: " + phoneBook.findAllSorted(PhoneItemField.BIRTH_DATE));
        System.out.println("Sorted by Address: " + phoneBook.findAllSorted(PhoneItemField.ADDRESS));
        System.out.println("Sorted by Last Change: " + phoneBook.findAllSorted(PhoneItemField.LAST_CHANGE));
        System.out.println();

        PhoneItem phoneItemWithIndex1Edited = new PhoneItem("Name3", formatter.parse("01.01.2000"), new ArrayList<>(Arrays.asList("111-000-000", "222-000-000", "333-000-000")), "NewAddress", Calendar.getInstance().getTimeInMillis());
        System.out.println("Phone item with index 0: " + phoneBook.find(0));
        phoneBook.edit(0, phoneItemWithIndex1Edited);
        System.out.println("Phone item with index 0 (edited address): " + phoneBook.find(0));
        System.out.println();

        System.out.println("Phone book: ");
        System.out.println(phoneBook.findAll());
        phoneBook.writeToFile();
        System.out.println("Phone book from file: ");
        System.out.println(phoneBook.readFromFile());
    }
}