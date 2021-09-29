package Exc_21;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

class Panel extends JPanel{
    JPanel Panel(Color cl, String text){
        JPanel pn = new JPanel();
        pn.setBackground(cl);
        pn.add(new JLabel(text, SwingConstants.CENTER));

        pn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                String t = "";
                switch (text){
                    case "Север":
                        t="сервер";
                        break;
                    case "Восток":
                        t="Дахране";
                        break;
                    case "Запад":
                        t="Джидда";
                        break;
                    case "Центр":
                        t="центр";
                        break;
                    case "Юг":
                        t="Абха";
                        break;
                }
                JOptionPane.showMessageDialog(pn,
                        "Добро пожаловать в "+t);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        return pn;
    }
}

public class n2 extends JFrame {
    public n2() {
        super("n2");
        setSize(300, 300);
        Container container = getContentPane();

        container.add(new Panel().Panel(Color.BLUE,"Север"), "North");
        container.add(new Panel().Panel(Color.ORANGE,"Юг"), "South");
        container.add(new Panel().Panel(Color.GREEN,"Запад"), BorderLayout.WEST);
        container.add(new Panel().Panel(Color.YELLOW,"Восток"), BorderLayout.EAST);
        // При отсутствии 2-го параметра компонент размещается в центре
        container.add(new Panel().Panel(Color.WHITE,"Центр"));
        // Открываем окно
        setVisible(true);
    }

    public static void main(String[] args) {
        new n2();
    }
}
