import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Inmata extends JFrame implements ActionListener{
	JTextField tf;
	JButton b;
	JLabel lb1,lb2;
	String namn;
	
	
	public Inmata() {
		this.setLayout(new FlowLayout());
		lb1= new JLabel("skriv ditt namn");
		tf= new JTextField(15);
		b=new JButton("tryck här");
		lb2= new JLabel();
		add(lb1);
		add(tf);
		add(b);
		add(lb2);
		b.addActionListener(this);
		lb2.setFont(new Font("Arial" ,Font.ITALIC,40));
		lb2.setForeground(Color.blue);
		
	}

	public static void main(String[] args) {
		Inmata f= new Inmata();
		f.setSize(400,150);
		f.setLocation(100,100);
		f.setTitle("Inmata");
		f.setDefaultCloseOperation(Inmata.EXIT_ON_CLOSE);
		f.setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		namn= tf.getText();
		lb2.setText("Hej "+ namn);
		
	}

}
