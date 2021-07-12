package Task06;

import java.awt.Font;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Fonts {

    public static void main(String[] args) {

        int width = 100;
        int height = 30;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.PLAIN, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("41072819", 10, 20); // ввод числа

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++)
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "*"); // символы из которых состоит "большая цифра"

            if (sb.toString().trim().isEmpty())
                continue;
            System.out.println(sb);
        }
    }
}
