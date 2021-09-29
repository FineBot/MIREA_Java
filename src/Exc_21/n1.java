package Exc_21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class n1 {
    Random r = new Random();
    int t = Math.abs(r.nextInt()%21);
    int p=0;


    n1() {
        JTextField text = new JTextField(15);
        JLabel jl = new JLabel();

        JPanel parent = new JPanel();
        JButton bt = new JButton("Тык");
        bt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int buff = Integer.parseInt(text.getText());
                p++;
                if(3-p<=0)
                    jl.setText("Попытки закончились. Число: "+t);

                else{
                    if(buff>t)
                        jl.setText("Меньше "+(3-p));
                    else if(buff<t)
                        jl.setText("Больше "+(3-p) );
                    else
                        jl.setText("Именно оно!");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });

        JPanel jp = new JPanel();
        jp.add(bt);

        JPanel jp1 = new JPanel();
        Font ft = new Font("Calibre", Font.BOLD, 20);
        jp1.setLayout(new BoxLayout(jp1, BoxLayout.Y_AXIS));


        text.setAlignmentX(Component.CENTER_ALIGNMENT);
        text.setFont(ft);
        jp1.add(text);

        parent.setLayout(new BoxLayout(parent, BoxLayout.Y_AXIS));
        parent.add(jp1);
        parent.add(jp);


        JPanel jp2 = new JPanel();
        jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
        jl.setFont(ft);
        jp2.add(jl);
        parent.add(jp2);


        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(parent);
        frame.show();
    }

}
