import javax.swing.*;

public class Formulario extends JFrame{
  public JLabel etiqueta;
  
  public Formulario(){
  
  setLayout(null);
  etiqueta = new JLabel("LA DAVIDPEDIA DE DAVID");
  etiqueta.setBounds(100,200,200,300);	
  add(etiqueta);

 }
  
  public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);

 }
}