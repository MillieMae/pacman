package pacgame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Maze {

    public void go() {
        JFrame frame;
        frame = new JFrame("Pacman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacmanScreen drawPanel = new PacmanScreen();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300, 300);
        frame.setLocation(375, 55);
        //moveIt();
    }

    class PacmanScreen extends JPanel {
            // For refernce: http://codereview.stackexchange.com/questions/29630/simple-java-animation-with-swing
            public void paintComponent(Graphics g) {

                //blue background color
                Color LIGHTBLUE = Color.decode("#59D1FC");
                //blue background
                g.setColor(LIGHTBLUE);
                g.fillRect(0, 0, this.getWidth(), this.getHeight());

                //red banner
                g.setColor(Color.RED);
                g.fillRect(0, 0, this.getWidth(), this.getHeight()/8);

                //blue rectangle x,y,w,h
                int rectwid = this.getWidth()/16;
                int rectx = this.getWidth()/6;
                int recty = this.getHeight()/3;
                int recthi = this.getHeight()/3+this.getHeight()/10;
                //blue rectangle
                g.setColor(Color.BLUE);
                g.fillRect(rectx, recty, rectwid, recthi);

                //white square w/ orange outline x,y,w and color
                int squwid = this.getWidth()/4;
                int squx = this.getWidth()/2;
                int squy = this.getHeight()/3+this.getHeight()/10;
                Color DARKORANGE = Color.decode("#FC9E45");
                //white square w/ orange outline
                g.setColor(DARKORANGE);
                g.fillRect(squx, squy, squwid, squwid);
                g.setColor(Color.WHITE);
                g.fillRect(squx+3, squy+3, squwid-6, squwid-6);

                //yellow circle w/ green outline x,y,r
                int cirr = squwid/3;
                int cirx = squx+squwid-cirr;
                int ciry = squy-cirr;
                Color DARKGREEN = Color.decode("#029C0A");
                //yellow circle w/ green outline
                g.setColor(DARKGREEN);
                g.fillOval(cirx, ciry, 2*cirr, 2*cirr);
                g.setColor(Color.YELLOW);
                g.fillOval(cirx+3, ciry+3, 2*cirr-6, 2*cirr-6);

                //purple line color
                Color PURPLE = Color.decode("#920292");
                //purple line
                g.setColor(PURPLE);
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(3));
                g2.draw(new Line2D.Float(0, 0, this.getWidth(), this.getHeight()));


            }
        }

}
