package com.cake.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class savePhoto {
    public static byte[] InputStreamToByte(InputStream is) throws IOException {
        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[100];
        int rc = 0;
        while ((rc = is.read(buff, 0, 100)) > 0){
            swapStream.write(buff, 0, rc);
        }
        return swapStream.toByteArray();
    }
    public static BufferedImage byteToBufferedImage(byte[] bytes) throws IOException {
        InputStream buffin = new ByteArrayInputStream(bytes);
        BufferedImage image = ImageIO.read(buffin);
        return image;
    }
}
