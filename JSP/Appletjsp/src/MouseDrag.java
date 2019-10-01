import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseDrag extends Applet implements MouseMotionListener {
	public void init(){
		addMouseMotionListener(this);
		setBackground(Color.red);		
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		Graphics g=getGraphics();
		g.setColor(Color.white);
		g.fillOval(me.getX(),me.getY(),20,20);
		
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

}
