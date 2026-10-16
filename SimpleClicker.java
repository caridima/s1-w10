import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {
    private int xClick = -11111;
	private int yClick = -11111;
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
    public void paintComponent(Graphics g){
		if(xClick !=-11111 && yClick != -11111){
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
		System.out.println ("You're tickling me!");
		this.xClick= event.getX();
		this.yClick= event.getY();
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
