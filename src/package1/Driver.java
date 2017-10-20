package package1;

import java.awt.BorderLayout;

public class Driver {
	public static void main(String[] args) {
		new Driver();
	}
	
	public Driver() {
		FirstFrame frame = new FirstFrame(800, 800);
		FirstPanel panel = new FirstPanel();
		frame.add(panel, BorderLayout.CENTER);
	}
}
