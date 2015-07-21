package com.constgor.eepractice.ch02;

import com.constgor.eepractice.ch02.qualifiers.ThirteenDigits;

import javax.inject.Inject;

public class BookService {

    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String name, String description, Float price){
        String number = numberGenerator.generateNumber();
        return new Book(name, description, number, price);
    }
}
