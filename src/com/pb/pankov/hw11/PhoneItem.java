package com.pb.pankov.hw11;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PhoneItem implements Serializable {

    private String fullName;
    private Date birthDate;
    private List<String> phoneNumbers;
    private String address;
    private long lastChange;

    public PhoneItem(String fullName, Date birthDate, List<String> phoneNumbers, String address, long lastChange) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
        this.lastChange = lastChange;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getLastChange() {
        return lastChange;
    }

    public void setLastChange(long lastChange) {
        this.lastChange = lastChange;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return "PhoneItem{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + formatter.format(birthDate) +
                ", phoneNumbers=" + phoneNumbers +
                ", address='" + address + '\'' +
                ", lastChange=" + lastChange +
                '}';
    }
}