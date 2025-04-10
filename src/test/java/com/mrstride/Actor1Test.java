package com.mrstride;

import org.apache.logging.log4j.Logger;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Actor1Test {
    // This is a test class for Actor1
    // You can add test methods here to test the functionality of Actor1
    // For example, you can use JUnit or any other testing framework to write tests

    // AAA pattern: Arrange, Act, Assert
    // Example test method
    @Test
    public void testAct() {
        Actor1 actor = new Actor1();
        actor.act();
        // Add assertions to verify the behavior of the act method
    }

    @Test
    public void testEarnAnOscar() {
        // Arrange
        Actor1 actor = new Actor1();
        Logger mockLogger = mock(Logger.class);
        
        // Woah an actor earned an Oscar :O
        boolean result = actor.earnAnOscar(mockLogger);

        // Assert
        assertTrue(result, "The earnAnOscar method should return true");
        verify(mockLogger).info("I earned an Oscar!"); // Checking if the method was called.
        /*
         * If we want to verify that it was called a specific number of times, we can do:
         *  Mockito.verify(logger, times(2)).info("I earned an Oscar!");
         */
    }
}