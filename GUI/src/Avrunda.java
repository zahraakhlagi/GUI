import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Avrunda extends JFrame implements ActionListener{

	JButton butt;
	JTextField tf;
	JLabel lb1_ledtext,lb1_area, lb1_omkrets;
	double radie,area,omkrets;
	
	public Avrunda() {
		this.setLayout(new FlowLayout());
		butt= new JButton("Ok");
		lb1_ledtext= new JLabel("Ange radie");
		tf= new JTextField(10);
		lb1_area= new JLabel();
		lb1_omkrets= new JLabel();
		add(butt);
		add(tf);
		add(lb1_ledtext);
		butt.addActionListener(this);
		tf.addActionListener(this);
		add(lb1_area);
		add(lb1_omkrets);
		
	}
	public static void main(String[] args) {
		DecimalFormat df2=new DecimalFormat("0.00");
		Cirkeln f = new Cirkeln ();
		f.setSize(200,200);
		f.setLocation(100,100);
		f.setTitle("Cirkeln");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		radie=Double.parseDouble(tf.getText());
		area= radie*radie*Math.PI;
		omkrets= 2*Math.PI*radie;
		lb1_area.setText(String.format("area=%5.2f", area));
		lb1_omkrets.setText(String.format("omkrets=%6.2f", omkrets));
		}
		catch(Exception e1) {
			
			area=0;
			omkrets=0;
			lb1_area.setText("Felaktig inmatning");
			lb1_omkrets.setText("Felaktig inmatning");
			
		}
		
	}

}
