package package1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FirstPanel extends JPanel{
	private int x = 30;
	private int y = 30;
	
	public FirstPanel() {
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 100, 100);
	}
}
