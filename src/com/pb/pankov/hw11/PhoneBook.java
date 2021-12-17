package com.pb.pankov.hw11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PhoneBook {

    public static final Path FILE_PATH = Paths.get("files/phone_books.txt");

    private final Logger LOGGER = Logger.getLogger(PhoneBook.class.getName());

    private final List<PhoneItem> phoneItems;

    public PhoneBook() {
        this.phoneItems = new ArrayList<>();
    }

    public boolean add(PhoneItem phone) {
        return phoneItems.add(phone);
    }

    public boolean remove(PhoneItem phone) {
        return phoneItems.remove(phone);
    }

    public PhoneItem find(int index) {
        return phoneItems.get(index);

    }

    public List<PhoneItem> findAll() {
        return phoneItems;
    }

    public List<PhoneItem> findAllSorted(PhoneItemField sortingField) {
        List<PhoneItem> result = new ArrayList<>(phoneItems);
        switch (sortingField) {
            case FULL_NAME : {
                result.sort(new FullNameComparator());
            }
            case BIRTH_DATE : {
                result.sort(new BirthDateComparator());
            }
            case ADDRESS : {
                result.sort(new AddressComparator());
            }
            case LAST_CHANGE : {
                result.sort(new LastChangeComparator());
            }
        }
        return result;
    }

    public PhoneItem edit(int index, PhoneItem phone) {
        return phoneItems.set(index, phone);
    }

    public void writeToFile() {
        createDirsAndFileIfNotExist(FILE_PATH);

        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(FILE_PATH.toFile()))) {
            writer.writeObject(phoneItems);
            LOGGER.log(Level.INFO, "Writing to file: " + FILE_PATH + " done!");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Error occurred: ", ex);
        }
    }


    private void createDirsAndFileIfNotExist(Path filePath) {
        try {
            Files.createDirectories(filePath.getParent());
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error occurred: ", e);
        }
    }

    public List<PhoneItem> readFromFile() {
        List<PhoneItem> result = null;
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(FILE_PATH.toFile()))) {
            result = (List<PhoneItem>) reader.readObject();
            LOGGER.log(Level.INFO, "Reading from file: " + FILE_PATH + " done!");
        } catch (IOException | ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Error occurred: ", e);
        }
        return result;
    }

    private static class FullNameComparator implements Comparator<PhoneItem> {
        @Override
        public int compare(PhoneItem o1, PhoneItem o2) {
            return o1.getFullName().compareTo(o2.getFullName());
        }
    }

    private static class BirthDateComparator implements Comparator<PhoneItem> {
        @Override
        public int compare(PhoneItem o1, PhoneItem o2) {
            return o1.getBirthDate().compareTo(o2.getBirthDate());
        }
    }

    private static class AddressComparator implements Comparator<PhoneItem> {
        @Override
        public int compare(PhoneItem o1, PhoneItem o2) {
            return o1.getAddress().compareTo(o2.getAddress());
        }
    }

    private static class LastChangeComparator implements Comparator<PhoneItem> {
        @Override
        public int compare(PhoneItem o1, PhoneItem o2) {
            return Long.compare(o1.getLastChange(), o2.getLastChange());
        }
    }
}