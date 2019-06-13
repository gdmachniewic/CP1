/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){
        
        Graphics2D g2 = (Graphics2D)g;
        
        /******** Put your code here  *********/
        
        
        
        
        Rectangle r1 = new Rectangle(0, 300, 600, 100);
        g2.draw(r1);
        
        g2.setColor(Color.green);
        
        g2.fill(r1);
        
        Rectangle r2 = new Rectangle(250, 50, 150, 250);
        g2.draw(r2);
        
        g2.setColor(Color.red);
        
        g2.fill(r2);
        
        Rectangle r3 = new Rectangle(100, 150, 50, 150);
        g2.draw(r3);
        
        g2.setColor(Color.orange);
        
        g2.fill(r3);
        
        Rectangle dr1 = new Rectangle(300, 250, 50, 50);
        g2.draw(dr1);
        
        g2.setColor(Color.orange);
        
        g2.fill(dr1);
        
        Rectangle w1 = new Rectangle(260, 200, 50, 50);
        g2.draw(w1);
        
        g2.setColor(Color.cyan);
        
        g2.fill(w1);
        
        
        Rectangle w2 = new Rectangle(340, 200, 50, 50);
        g2.draw(w2);
        
        g2.setColor(Color.cyan);
        
        g2.fill(w2);
        
        Rectangle w3 = new Rectangle(260, 100, 50, 50);
        g2.draw(w3);
        
        g2.setColor(Color.cyan);
        
        g2.fill(w3);
        
        Rectangle w4 = new Rectangle(340, 100, 50, 50);
        g2.draw(w4);
        
        g2.setColor(Color.cyan);
        
        g2.fill(w4);
        
        Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 150, 100);
        
        g2.setColor(Color.green);
        g2.fill(circle);
        
        Ellipse2D.Double sun = new Ellipse2D.Double(450, 0, 150, 150);
        
        g2.setColor(Color.yellow);
        g2.fill(sun);
        
        g2.draw(new Line2D.Double(475, 125, 450, 150));
        g2.draw(new Line2D.Double(450, 75, 425, 75));
        g2.draw(new Line2D.Double(525, 150, 525, 175));
        g2.draw(new Line2D.Double(575, 125, 600, 150));
        g2.draw(new Line2D.Double(600, 75, 625, 75));
        g2.draw(new Line2D.Double(575, 25, 600, 0));
        // comment this out once you have finished
        }
    
}
