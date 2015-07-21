package com.constgor.eepractice.ch02;

/**
 * Created by user on 7/20/15.
 */
public class Book {
    private String name;
    private String description;
    private String number;
    private Float price;

    public Book() {
    }
    public Book(String name, String description, String number, Float price) {
        this.name = name;
        this.description = description;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
