package com.cake.utils;

import javax.annotation.Resource;
import java.awt.*;
import java.awt.image.BufferedImage;

// 验证码的工具类
public class Vcode {
    BufferedImage bufferedImage;
    String text;

    public Vcode() {
        text = "";
        for(int i=0; i<4; i++){
            text += ((int)(Math.random() * 987) % 10);
        }
        int width = 80, height = 30;
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(new Font(null, Font.ITALIC, 24));
        graphics.drawString(text, 15, 22);
        graphics.dispose();
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public String getText() {
        return text;
    }
}
