import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JTextField t1;
    private JLabel l1;

    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize(600,200);
	this.setLocation(50,50);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	
	JLabel l2 = new JLabel();
	l2.setText("Enter temperature and press the desired conversion option. -exceptions not yet handled");
	t1 = new JTextField(5);

	l1 = new JLabel();
	l1.setText("output");

	JButton b1 = new JButton("C to F");
	b1.addActionListener(this);
	b1.setActionCommand("CtoF");
	JButton b2 = new JButton("F to C");
	b2.addActionListener(this);
	b2.setActionCommand("FtoC");

	pane.add(l2);
	pane.add(t1);
	pane.add(b1);
	pane.add(b2);
	pane.add(l1);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("CtoF")){
	    String s = t1.getText();
	    double n = Integer.parseInt(s);
	    double out = CtoF(n);
	    l1.setText("That is "+out+" degrees Fahrenheit.");
	}
	if(event.equals("FtoC")){
	    String s = t1.getText();
	    double n = Integer.parseInt(s);
	    double out = FtoC(n);
	    l1.setText("That is "+out+ " degrees Celsius.");  
	}
    }

    public static double CtoF(double t){
	return t * 1.8 + 32;
    }

    public static double FtoC(double t){
	return (t - 32) / 1.8;
    }
}
