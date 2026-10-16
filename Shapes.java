/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!
      //g.setColor(Color.CYAN);
      //g.fillOval(100,100,50,50);
      //g.setColor(Color.RED);
      //g.fillRect(200,200,25,25);
      this.drawBullseye(g, 50,50);
      this.olympicRings(g);

   }
   public void drawBullseye(Graphics g, int c, int r){
      g.setColor(Color.red);
      g.fillOval(c , c , c+r,c+r);
      g.setColor(Color.black);
      g.fillOval(c+10 , c +10, c+r-20,c+r-20);
      g.setColor(Color.red);
      g.fillOval(c+20 , c +20, c+r-40,c+r-40);
      g.setColor(Color.black);
      g.fillOval(c+30 , c +30, c+r-60,c+r-60);
      g.setColor(Color.red);
      g.fillOval(c+40 , c +40, c+r-80,c+r-80);
      
      
   }
   public void olympicRings(Graphics g){
      g.setColor(Color.blue);
      g.drawOval(50,200,60,60);
      g.setColor(Color.yellow);
      g.drawOval(80,230,60,60);
      g.setColor(Color.black);
      g.drawOval(110,200,60,60);
      g.setColor(Color.green);
      g.drawOval(140,230,60,60);
      g.setColor(Color.red);
      g.drawOval(170,200,60,60);
   }
   public void trafficLight(Graphics g){

   }
       public static void main(String[] args) {
        new Shapes();
    }
}
