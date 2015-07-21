package com.constgor.eepractice.ch02.interceptors;

import com.constgor.eepractice.ch02.qualifiers.Loggable;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;


@Loggable   // personal mark of this interceptor
@Interceptor
public class LoggingInterceptor {
    @Inject
    Logger logger;

    @AroundInvoke
    Object logMethod(InvocationContext ic) throws Exception {
        logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        try{
            return ic.proceed();
        } finally {
            logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        }
    }
}
