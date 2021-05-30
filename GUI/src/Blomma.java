

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Blomma extends JPanel {
	
	public Blomma() {
		this.setBackground(Color.white);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillArc(100, 150, 50, 50, 0, 360);

		g.setColor(Color.yellow);
		g.fillArc(150, 150, 50, 50, 0, 360);
	
		g.setColor(Color.blue);
		g.fillArc(200, 150, 50, 50, 0, 360);
		
		g.setColor(Color.blue);
		g.fillArc(150, 100, 50, 50, 0, 360);
		
		g.setColor(Color.blue);
		g.fillArc(150, 200, 50, 50, 0, 360);
		
		g.setColor(Color.red);
		g.fillArc(122, 197, 30, 30, 0, 360);
		
		g.setColor(Color.red);
		g.fillArc(197, 197, 30, 30, 0, 360);
	
		g.setColor(Color.red);
		g.fillArc(122, 123, 30, 30, 0, 360);
	
		g.setColor(Color.red);
		g.fillArc(197, 123, 30, 30, 0, 360);
	
		g.setColor(Color.green);
		g.drawRect(173, 250, 3,100);
		
		g.setColor(Color.green);
		g.fillArc(176, 275, 50, 50, 0, 360);
		
		g.setColor(Color.green);
		g.fillArc(125, 275, 50, 50, 0, 360);
	}
	
	
	
	
	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setSize(400,400);
		f.setLocation(100, 100);
		f.setTitle("Min Blomma");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Blomma p= new Blomma();
		f.add(p);
		f.setVisible(true);
	}

	}





