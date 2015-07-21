package com.constgor.eepractice.ch02;

import com.constgor.eepractice.ch02.qualifiers.Loggable;
import com.constgor.eepractice.ch02.qualifiers.ThirteenDigits;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@ThirteenDigits     // name of this implementation
public class IsbnGenerator implements NumberGenerator{
    @Inject
    private Logger logger;

    @Override
    @Loggable       // plugin interceptor
    public String generateNumber() {
        String isbn = "12-34567" + Math.abs(new Random().nextInt());
        logger.info("Generated isbn: " + isbn);
        return isbn;
    }
}
