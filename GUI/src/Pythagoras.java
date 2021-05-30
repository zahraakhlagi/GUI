import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pythagoras extends JFrame implements ActionListener{

	JTextField tf1,tf2,tf3;
	JButton b1;
	JLabel lb1,lb2,lb3;
	double x,y,r;
	
	public Pythagoras() {
		this.setLayout(new FlowLayout());
		b1= new JButton("Ok");
		lb1= new JLabel("Ange ketet1:");
		tf1= new JTextField(10);
		lb2= new JLabel("Ange katet2:");
		tf2= new JTextField(10);
		lb3= new JLabel();
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		add(b1);
		b1.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		add(lb3);
	}
	public static void main(String[] args) {
	
		Pythagoras f= new Pythagoras();
		f.setSize(200, 200);
		f.setLocation(100,100);
		f.setTitle("Pythagoras");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x= Double.parseDouble(tf1.getText());
		y=Double.parseDouble(tf2.getText());
		
		r= Math.sqrt(x*x+y*y);
		lb3.setText(String.format("hypotenusa är %5.2f", r));
		
	}

}
