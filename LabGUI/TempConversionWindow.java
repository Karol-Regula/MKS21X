import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JTextField t1;
    private JLabel l1;

    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize(500,500);
	this.setLocation(50,50);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	
	JLabel l2 = new JLabel();
	l2.setText("Enter temperature and press the desired conversion option");
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
	if(e.equals("CtoF")){
	    String s = t1.getText();
	    l1.setText(s);
	}
	if(e.equals("FtoC")){
	    String s = t1.getText();
	    l1.setText(s);
	}
    }
}
