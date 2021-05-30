import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RaknaMedBrak extends JFrame implements ActionListener {
	JLabel lb1,lb2;
	JTextField tf1,tf2;
	JButton b;
	int x,y,kvot,rest;
	
	
	public RaknaMedBrak() {
		this.setLayout(new FlowLayout());
		lb1= new JLabel("skriv in täljare resp, nämnare");
		tf1= new JTextField(5);
		tf2= new JTextField(5);
		b= new JButton("visa bråk på blandad form");
		lb2= new JLabel();
		add(lb1);
		add(tf1);
		add(tf2);
		add(b);
		add(lb2);
		b.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		
		
	
	}
	

	public static void main(String[] args) {
		RaknaMedBrak f= new RaknaMedBrak();
		f.setSize(200,200);
		f.setLocation(100, 100);
		f.setTitle("Räkna med bråk");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		x= Integer.parseInt(tf1.getText());
		y= Integer.parseInt(tf2.getText());
		
		if(x%y==0) {
			kvot= x/y;
			
			lb2.setText(""+ kvot );
		}else {
			kvot=x/y;
			rest= x%y;
			lb2.setText(""+ kvot+"  "+ rest +"/"+ y);
		}
		
		
		
	}

}
