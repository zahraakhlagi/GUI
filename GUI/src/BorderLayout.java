
import javax.swing.*;
import java.awt.*;

public class BorderLayout extends JFrame{
	JPanel p;
	
	public BorderLayout() {

		this.setLayout(new java.awt.BorderLayout());
		p= new JPanel();
		p.setBackground(Color.red);
		p.setPreferredSize(new Dimension(80,60));
		this.add(p);
	}

	public static void main(String[] args) {
		BorderLayout f= new BorderLayout();
		f.setSize(200,200);
		f.setLocation(100,100);
		f.setTitle("JPanelTest");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
