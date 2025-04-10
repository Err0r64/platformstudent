package com.mrstride;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;


@Service
public class ImageService {

    /**
     * Loads an image from the resources directory.
     * 
     * @return BufferedImage object representing the loaded image.
     * @throws IOException if the image cannot be loaded.
     */
    public BufferedImage getImage() throws IOException {
        // Load the image from the resources directory
        try (InputStream imageStream = getClass().getResourceAsStream("/example.png")) {
            if (imageStream == null) {
                throw new IOException("Image not found in resources: /example.png");
            }
            return ImageIO.read(imageStream);
        }
    }
}