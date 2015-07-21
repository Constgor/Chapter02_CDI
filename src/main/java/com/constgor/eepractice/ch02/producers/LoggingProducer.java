package com.constgor.eepractice.ch02.producers;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

// Wrapper needed to supply Logger injection (jdk Logger doesn't have beans.xml)
public class LoggingProducer {
    @Produces
    public Logger produceLogger(InjectionPoint ip){
        return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
    }
}
