package Exc_20;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;


class LabExample extends JFrame {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        Random rand = new Random();

        int x = 20;
        int y=60;

        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                x=100;
            }else{
                x=20;
                y=y+55;
            }

            int width = 70;
            int height = 50;
            int arcWidth = 20;
            int arcHeight = 20;

            switch (Math.abs(rand.nextInt()%5)){
                case 0:
                    g2d.setColor(Color.RED);
                    break;
                case 1:
                    g2d.setColor(Color.GREEN);
                    break;
                case 2:
                    g2d.setColor(Color.BLUE);
                    break;
                case 4:
                    g2d.setColor(Color.PINK);
                    break;
            }
            switch (Math.abs(rand.nextInt() % 4)) {
                case 0:
                    g2d.drawOval(x, y, 50, 50);
                    break;
                case 1:
                    g2d.drawRect(x,y,50,50);
                    break;
                case 2:
                    g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
                    break;
                case 3:
                    g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
                    g2d.drawRoundRect(x + 10, y + 10, width - 20, height - 20, arcWidth + 10, arcHeight + 10);
                    g2d.drawRoundRect(x + 20, y + 20, width - 40, height - 40, arcWidth + 20, arcHeight + 10);
                    g2d.drawRoundRect(x + 30, y + 30, width - 60, height - 60, arcWidth + 40, arcHeight + 20);
                    break;
            }

        }

    }

    LabExample() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(750, 1000);


        setVisible(true);
    }

    public static void main(String[] args) {
        new LabExample();
    }
}

public class Shapes {
    Shapes() {
        LabExample f = new LabExample();
    }
}
