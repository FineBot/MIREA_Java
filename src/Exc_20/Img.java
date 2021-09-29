package Exc_20;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


class LabExample2 extends JFrame {
    BufferedImage myPicture = null;
    String imagePath="";

    public void paint(Graphics g){
        try {
            myPicture = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(myPicture,0,0,myPicture.getWidth(),myPicture.getHeight(),null);
        setSize(myPicture.getWidth(),myPicture.getHeight());
    }
    LabExample2(String path) {
        super("Example");
        imagePath=path;
        setVisible(true);
    }


}


public class Img {
    Img(){
        System.out.println("Укажите полный путь к картинке:");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        if(path=="")
            path="D:\\dsa.png";

        LabExample2 f = new LabExample2(path);
    }
}
