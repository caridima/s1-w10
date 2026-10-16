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
      g.setColor(Color.CYAN);
      g.fillOval(100,100,50,50);
      g.setColor(Color.RED);
      g.fillRect(200,200,25,25);
      this.drawBullseye(10,10);

   }
   public void drawBullseye(Graphics g, int c, int r){
      g.setColor(Color.red);
      g.fillOval(c , c , c+r,c+r);
      
   }
   public void olympicRings(Graphics g){

   }
   public void trafficLight(Graphics g){

   }
       public static void main(String[] args) {
        new Shapes();
    }
}
