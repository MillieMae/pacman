package pacgame;

import javax.swing.*;
import java.awt.*;

public class Maze {

    public void go() {
        JFrame frame;
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacmanScreen drawPanel = new PacmanScreen();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(600, 300);
        frame.setLocation(375, 55);
        //moveIt();
    }

    class PacmanScreen extends JPanel {
            // For refernce: http://codereview.stackexchange.com/questions/29630/simple-java-animation-with-swing
            public void paintComponent(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
                g.setColor(Color.RED);
                g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);
                g.setColor(Color.WHITE);
                g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);
                g.setColor(Color.BLACK);
                g.fillRect(77, 77, 6, 6);
            }
        }

}
