package com.mrstride;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ImageServiceTest {

    @Autowired
    private ImageService imageService;

    @Test
    public void testGetImage() {
        try {
            // Act
            BufferedImage image = imageService.getImage();

            // Assert
            assertNotNull(image, "The image should not be null");
            assertTrue(image.getWidth() > 0 && image.getHeight() > 0, "The image should have valid dimensions");
        } catch (IOException e) {
            fail("IOException was thrown while loading the image: " + e.getMessage());
        }
    }
}