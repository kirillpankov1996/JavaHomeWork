package com.pb.pankov.hw12;

import com.pb.pankov.hw11.PhoneItem;
import com.pb.pankov.hw11.PhoneItemField;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PhoneBook {

    public static final Path FILE_PATH = Paths.get("files/phone_books.txt");
    private final Logger LOGGER = Logger.getLogger(PhoneBook.class.getName());
    private List<PhoneItem> phoneItems;

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

    public List<PhoneItem> find(Predicate<PhoneItem> predicate) {
        return phoneItems.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<PhoneItem> findAll() {
        return phoneItems;
    }

    public List<PhoneItem> findAllSorted(PhoneItemField sortingField) {
        List<PhoneItem> result = null;
        switch (sortingField) {
            case FULL_NAME : result = phoneItems.stream().sorted(Comparator.comparing(PhoneItem::getFullName)).collect(Collectors.toList());
            case BIRTH_DATE : result = phoneItems.stream().sorted(Comparator.comparing(PhoneItem::getBirthDate)).collect(Collectors.toList());
            case ADDRESS : result = phoneItems.stream().sorted(Comparator.comparing(PhoneItem::getAddress)).collect(Collectors.toList());
            case LAST_CHANGE : result = phoneItems.stream().sorted(Comparator.comparing(PhoneItem::getLastChange)).collect(Collectors.toList());
        }
        return result;
    }


    public PhoneItem edit(int index, PhoneItem phone) {
        return phoneItems.set(index, phone);
    }

    public void editByName(String name, PhoneItem phone) {
        phoneItems = phoneItems.stream().map(phoneItem -> {
            if (phoneItem.getFullName().equals(name)) {
                return phone;
            } else {
                return phoneItem;
            }
        }).collect(Collectors.toList());
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

    @Override
    public String toString() {
        String ls = System.lineSeparator();
        return "Phone book: [" + ls +
                phoneItems.stream().map(PhoneItem::toString).collect(Collectors.joining(ls))
                + ls + "]" ;
    }

}

