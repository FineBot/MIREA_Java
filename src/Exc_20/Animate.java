package Exc_20;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


class LabExample3 extends JFrame {
    BufferedImage myPicture = null;
    String imagePath="";

    String convertInt(int i){
        if(i<10)
            return "00"+i;
        if(i>10&&i<100)
            return "0"+i;
        else
            return i+"";
    }

    public void paint(Graphics g){

        for(int i =0;i<148;i++){
            try {
                myPicture = ImageIO.read(new File("D:\\deleteit\\frame_"+convertInt(i)+"_delay-0.1s.gif"));
            } catch (IOException e) {
            }
            g.drawImage(myPicture,0,0,myPicture.getWidth(),myPicture.getHeight(),null);
            setSize(myPicture.getWidth(),myPicture.getHeight());
            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    LabExample3() {
        super("Example");

        setVisible(true);
    }


}


public class Animate {
    Animate(){
        System.out.println("Для проигрывания нужно что-нибудь ввести");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();


        LabExample3 f = new LabExample3();
    }
}
