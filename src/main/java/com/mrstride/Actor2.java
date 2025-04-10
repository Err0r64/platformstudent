package com.mrstride;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * By putting the @Primary annotation on this class, we are saying that this is the default implementation of MyBehavior.
 */
@Component
@Primary
public class Actor2 implements MyBehavior {
    public void act() {
        System.out.println("I can kinda act!");
    }

    public boolean earnAnOscar(Logger logger) {
        logger.info("I earned an Oscar!");
        return true;
    }
    
}