package com.mrstride;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Actor1 implements MyBehavior {
    public void act() {
        System.out.println("I can act!");
    }

    public boolean earnAnOscar(Logger logger) {
        logger.info("I earned an Oscar!");
        return true;
    }
}