import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TrafficLight extends JPanel implements MouseListener{

    private int xClick = -11111;
	private int yClick = -11111;
    public TrafficLight() {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (400, 1000);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
		
    }
    public void paintComponent(Graphics g){
		if(xClick !=-11111 && yClick != -11111){
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(9.0f));
        	g2d.setColor(Color.black);
			g.drawOval(100,100, 200,200);
            g.drawOval(100,350, 200,200);
            g.drawOval(100,600, 200,200);
            if ((xClick >= 100 && xClick <=200) && (yClick>=100 && yClick<=200)) {
                g.setColor(Color.red);
                g.fillOval(100, 100, 200, 200);
            }
            if ((xClick >= 100 && xClick <=200) && (yClick>=100 && yClick<=200)) {
                g.setColor(Color.yellow);
                g.fillOval(100,350, 200,200);
            }
            if ((xClick >= 100 && xClick <=200) && (yClick>=100 && yClick<=200)) {
                g.setColor(Color.green);
                g.fillOval(100,600, 200,200);
            }
            //draw three circles well cpaced, conditionals that determine whether or not to fill an oval
            //in a particualr color

		}
	}
     public void mouseClicked (MouseEvent event) {
	 	System.out.println ("You're tickling me!");
	 	this.xClick= event.getX() -50;
		this.yClick= event.getY() -50;
		repaint();

	 }
	public void mouseMoved(MouseEvent event) {
		
	}
	public void mouseDragged (MouseEvent event) {
		
	}
	public void mouseReleased (MouseEvent event) {
		
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}

