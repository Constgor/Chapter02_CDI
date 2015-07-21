package com.constgor.eepractice.ch02;

import com.constgor.eepractice.ch02.qualifiers.Loggable;
import com.constgor.eepractice.ch02.qualifiers.ThirteenDigits;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.logging.Logger;

@Alternative
@ThirteenDigits     // Alternative implementation
public class MockGenerator implements NumberGenerator{
    @Inject
    private Logger logger;

    @Loggable
    @Override
    public String generateNumber() {
        logger.info("Generate Mock number!");
        return "Mock number marck!";
    }
}
