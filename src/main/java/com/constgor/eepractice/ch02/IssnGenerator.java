package com.constgor.eepractice.ch02;

import com.constgor.eepractice.ch02.qualifiers.EightDigits;
import com.constgor.eepractice.ch02.qualifiers.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@EightDigits    // name of this implementation
public class IssnGenerator implements NumberGenerator{
    @Inject
    private Logger logger;

    @Override
    @Loggable       // plugin interceptor
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISSN : " + issn);
        return issn;
    }
}


