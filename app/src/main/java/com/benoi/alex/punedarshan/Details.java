package com.benoi.alex.punedarshan;


import android.util.Log;


public class Details {

    private String name;
    private String description;
    private String address;
    private String phone;
    private String mail;
    private String website;
    private String height;
    private String schedule;
    private String price;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Details(String name, String description, String address, String phone, String mail, String website, String height, String schedule,
                   String price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
        this.website = website;
        this.height = height;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getWebsite() {
        return website;
    }

    public String getHeight() {
        return height;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice() {
        return getPrice() != null;
    }

    public boolean hasPhone() {
        return getPhone() != null;
    }

    public boolean hasMail() {
        return getMail() != null;
    }

    public boolean hasWebsite() {
        return getWebsite() != null;
    }

    public boolean hasHeight() {
        return getHeight() != null;
    }


    public boolean hasAddress() {
        return getAddress() != null;
    }

    public boolean hasSchedule() {
        return getSchedule() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getMail() + "\n" +
                getWebsite() + "\n" +
                getHeight() + "\n" +
                getPrice() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId();

        return output;
    }
}
