import javax.swing.*;

import java.awt.event.*;

public class Prueba1 extends JFrame implements ActionListener{
	
	private JLabel nombre, apellidos,respondo;
	private JTextField textfield, textfield1;
	private JButton boton,botonoff;
	
	public Prueba1() {
		setLayout(null);
		
		nombre = new JLabel("Nombre:");
		nombre.setBounds(10, 10, 300, 30);
		add(nombre);
		
		apellidos = new JLabel("Apellidos");
		apellidos.setBounds(10, 40, 300, 30);
		add(apellidos);
		
		textfield = new JTextField();
		textfield.setBounds(100,10,150,20);
		add(textfield);
		
		textfield1 = new JTextField();
		textfield1.setBounds(100,40,150,20);
		add(textfield1);
		
		boton = new JButton("¿Que saldrá?");
		boton.setBounds(10,80,120,30);
		boton.addActionListener(this);
		add(boton);
		
		botonoff = new JButton("Salir");
		botonoff.setBounds(10,120,120,30);
		botonoff.addActionListener(this);
		add(botonoff);
		
		respondo = new JLabel("UwU");
		respondo.setBounds(160,80,300,30);
		add(respondo);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == boton) {
			String nombreyapellidos, nombre1, apellidos1;
			nombre1 = textfield.getText();
			apellidos1 = textfield1.getText();
			
			nombreyapellidos = nombre1 + apellidos1;
			
			respondo.setText(nombreyapellidos);
			
		}
		
	
	
	}
	
public void actionPerformed1(ActionEvent a) {
		
		
		if(a.getSource() == botonoff) {
			System.exit(0);
			frame.dispose();
			frame.setVisible(false);
		}
	
	}
	
	public static void main(String args[]) {
		
		Prueba1 clase = new Prueba1();
		clase.setVisible(true);
		clase.setBounds(0, 0, 500, 500);
		clase.setResizable(true);
		clase.setLocationRelativeTo(null);
	}
	
}
