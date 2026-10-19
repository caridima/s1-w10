import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener, MouseMotionListener {
    private int xClick = -11111;
	private int yClick = -11111;
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
		addMouseMotionListener(this);
    }
    public void paintComponent(Graphics g){
		if(xClick !=-11111 && yClick != -11111){
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(8.0f));
        	g2d.setColor(Color.BLUE);
			g.drawOval(xClick,yClick, 100,100);

		}
	}
     public void mouseClicked (MouseEvent event) {
	 	System.out.println ("You're tickling me!");
	 	this.xClick= event.getX() -50;
		this.yClick= event.getY() -50;
		repaint();

	 }
	public void mouseMoved(MouseEvent event) {
		System.out.println ("Here");
		this.xClick= event.getX() -50;
		this.yClick= event.getY() -50;
		repaint();
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
