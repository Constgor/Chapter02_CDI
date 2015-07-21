package com.constgor.eepractice.ch02;

import javax.inject.Inject;

/**
 * Created by user on 7/20/15.
 */
public class BookService {

    @Inject
    private NumberGenerator numberGenerator;

    public Book createBook(String name, String description, Float price){
        String number = numberGenerator.generateNumber();
        return new Book(name, description, number, price);
    }
}
