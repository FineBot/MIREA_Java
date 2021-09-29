package Exc_21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class n3 extends JFrame {
    n3(){
        JTextArea jta = new JTextArea();

        Font font = new Font("Verdana", Font.PLAIN, 12);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Шрифт");
        fileMenu.setFont(font);

        JMenuItem Times = new JMenuItem("Times New Roman");
        Times.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            }
        });
        Times.setFont(font);
        fileMenu.add(Times);

        JMenuItem MSSans = new JMenuItem("MS Sans Serif");
        MSSans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("MS Sans Serif", Font.PLAIN, 18));
            }
        });
        MSSans.setFont(font);
        fileMenu.add(MSSans);

        JMenuItem Courer = new JMenuItem("Courier New");
        Courer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("Courier New", Font.PLAIN, 18));
            }
        });
        Courer.setFont(font);
        fileMenu.add(Courer);




        JMenu fileMenu1 = new JMenu("Цвет");
        fileMenu1.setFont(font);

        JMenuItem blue = new JMenuItem("Синий");
        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLUE);
            }
        });
        blue.setFont(font);
        fileMenu1.add(blue);

        JMenuItem red = new JMenuItem("Красный");
        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.RED);
            }
        });
        red.setFont(font);
        fileMenu1.add(red);

        JMenuItem black = new JMenuItem("Черный");
        black.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLACK);
            }
        });
        black.setFont(font);
        fileMenu1.add(black);

        Font font2 = new Font("Times New Roman", Font.PLAIN, 18);

        jta.setFont(font2);
        add(jta);


        menuBar.add(fileMenu);
        menuBar.add(fileMenu1);

        setJMenuBar(menuBar);

        setPreferredSize(new Dimension(270, 225));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
