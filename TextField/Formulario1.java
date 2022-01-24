import javax.swing.*;
import java.awt.event.*;

public class Formulario1 extends JFrame implements ActionListener{
	private JButton boton1,boton2;
	private JLabel label1;
	
 public Formulario1(){
	setLayout(null);
	
	boton1 = new JButton(" UwU ");
	boton1.setBounds(10,20,50,50);
	add(boton1);
	boton1.addActionListener(this);
	
	boton2 = new JButton(" :V ");
	boton2.setBounds(10,20,50,50);
	add(boton2);
	boton2.addActionListener(this);
	
	label1 = new JLabel("DIME LO QUE TU YA SABE");
	label1.setBounds(30,30,50,50);
	add(label1);
 }
 
 public void Actionperformed(ActionEvent e) {
	 if(e.getSource() == boton1){
		 label1.setText("mmm rico opino igual");
	 }
	 
	 if(e.getSource() == boton2){
		 label1.setText("rata asqueroso");
	 }
	 
	 
 }
 
 public static void main(String args[]) {
	 Formulario1 formulario = new Formulario1();
	 formulario.setBounds(0,0,300,300);
	 formulario.setResizable(false);
	 formulario.setVisible(true);
	 formulario.setLocationRelativeTo(null);
	 
 
 
 }
}