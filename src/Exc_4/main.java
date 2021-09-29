package Exc_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class main {
    private static int madrid = 0, milan = 0;
    private static String lastScorer = "N/A";

    private static JLabel jl1 = new JLabel("Result: 0 X 0");
    private static JLabel jl2 = new JLabel("Last Scorer: N/A");
    private static JLabel jl3 = new JLabel("Winner: DRAW");


    void btclick(int cm) {
        if (cm == 0) {

        } else {
            madrid++;
            lastScorer = "Real Mardid";
        }
    }

    public static void main(String[] args) {
        JPanel parent = new JPanel();


        JButton btMilan = new JButton("AC Milan");
        btMilan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milan++;
                lastScorer = "AC Milan";
                jl2.setText("Last Scorer: " + lastScorer);
                jl1.setText("Result: " + madrid + " X " + milan);
                if (madrid > milan)
                    jl3.setText("Winner: Real Madrid");
                else if (madrid < milan)
                    jl3.setText("Winner: AC Milan");
                else
                    jl3.setText("Winner: DRAW");


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

        JButton btMardid = new JButton("Real Madrid");
        btMardid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madrid++;
                lastScorer = "RealMadrid";
                jl2.setText("Last Scorer: " + lastScorer);
                jl1.setText("Result: " + madrid + " X " + milan);
                if (madrid > milan)
                    jl3.setText("Winner: Real Madrid");
                else if (madrid < milan)
                    jl3.setText("Winner: AC Milan");
                else
                    jl3.setText("Winner: DRAW");
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
        jp.add(btMardid);
        jp.add(btMilan);

        JPanel jp1 = new JPanel();
        Font ft = new Font("Calibre", Font.BOLD, 20);
        jp1.setLayout(new BoxLayout(jp1, BoxLayout.Y_AXIS));

        jl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jl1.setFont(ft);
        jp1.add(jl1);

        jl2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jl2.setFont(ft);
        jp1.add(jl2);

        jl3.setAlignmentX(Component.CENTER_ALIGNMENT);
        jl3.setFont(ft);
        jp1.add(jl3);

        parent.setLayout(new BoxLayout(parent, BoxLayout.Y_AXIS));
        parent.add(jp);
        parent.add(jp1);

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(parent);
        frame.show();
    }

}
