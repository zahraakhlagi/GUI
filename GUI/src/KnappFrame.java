import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KnappFrame extends JFrame implements ActionListener {
			JLabel lb1;
			JButton b,b2;
			
	
	 	public KnappFrame() {
	 		this.setLayout(new FlowLayout());
	 		lb1= new JLabel("Detta är en JLabel!");
	 	
	 		lb1.setFont(new Font("Arial",Font.ITALIC,20));
	 		lb1.setForeground(Color.yellow);
	 		lb1.setOpaque(true);
	 		lb1.setBackground(Color.blue);
	 		b=new JButton("Blå");
	 		b2=new JButton("Röd");
	 		this.add(b);
	 		this.add(b2);
	 		b.addActionListener(this);
	 		b2.addActionListener(this);
	 		this.add(lb1);
	 		
		
	}
	 	public void actionPerformed(ActionEvent e) {
	 		if(e.getSource()==b) lb1.setBackground(Color.blue);
	 		if(e.getSource()==b2) lb1.setBackground(Color.red);
	 	}
	 	public static void main(String[] args) {
			
			KnappFrame f= new KnappFrame();
			f.setSize(220, 200);
			f.setLocation(100,100);
			f.setTitle("Min första GUI-applikation");
			f.setDefaultCloseOperation(KnappFrame.EXIT_ON_CLOSE);
			f.setVisible(true);

		}

	

}
