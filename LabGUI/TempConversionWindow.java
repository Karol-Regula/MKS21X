import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JTextField t;
    private JLabel l;

    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize(500,500);
	this.setLocation(50,50);
    }
}
