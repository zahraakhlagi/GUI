import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cirkeldiagram extends JPanel {
	
	public Cirkeldiagram() {
		this.setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.blue);
		g.fillArc(50,50, 200, 200, 0, 90);
		g.setColor(Color.yellow);
		g.fillArc(50,50, 200, 200, 90, 120);
		g.setColor(Color.red);
		g.fillArc(50,50, 200, 200, 210, 150);
		
	}
			
			
		
	

	public static void main(String[] args) {
		
		JFrame f= new JFrame();
		f.setSize(400,400);
		f.setLocation(100, 100);
		f.setTitle("Min Cirkeldiagram");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Cirkeldiagram p= new Cirkeldiagram();
		f.add(p);
		f.setVisible(true);

	}

}
