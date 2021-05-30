import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InmataTal extends JFrame implements ActionListener{
	JTextField tf1,tf2;
	JButton b,b1,b2,b3;
	JLabel lb1, lb2;
	double  x, y, summa,diff,produkt,dec_kvot;
	double rest;
	
	public InmataTal() {
		this.setLayout(new FlowLayout());
		lb1= new JLabel("skriv ett tal i vardera rutan");
		tf1= new JTextField(5);
		tf2= new JTextField(5);
		b= new JButton("addera talen!");
		b1=new JButton("dividera talen!");
		b2= new JButton("multiplicera talen!");
		b3= new JButton("subtrahera talen!");
		
		lb2= new JLabel();
		
		add(lb1);
		add(tf1);
		add(tf2);
		add(b);add(b1);add(b2);add(b3);
		add(lb2);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
	}

	public static void main(String[] args) {
		InmataTal f= new InmataTal();
		f.setSize(200,200);
		f.setLocation(100, 100);
		f.setTitle("Mata in Tal");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x= Double.parseDouble(tf1.getText());
		y= Double.parseDouble(tf2.getText());
		
		
		if(e.getSource()==b) { 
			summa= x +y;
			lb2.setText("summan är :"+ summa);
		}else if(e.getSource()==b3){
			diff= x-y;
			lb2.setText("difference är :"+ diff);
			
		}else if(e.getSource()==b1){
			
				dec_kvot= x/y;
			lb2.setText("kvot är :"+ dec_kvot);
			}/*else {
				dec_kvot=x/y;
			rest= x%y;
			lb2.setText("kvot är :"+ dec_kvot+ " rest är "+ rest);
			}*/
			
			
		else if(e.getSource()==b2){
			produkt= x*y;
			lb2.setText("produkt är :"+ produkt);
			
		}
		
		/*summa= x +y;
		diff= x-y;
		kvot= x/y;
		produkt= x*y;
		
	
		lb2.setText("difference är :"+ diff);
		
	
		
		lb2.setText("kvot är :"+ kvot);
		
		
		
		lb2.setText("produkt är :"+ produkt);
		
		*/
	}

}
