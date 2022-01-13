import java.util.Scanner;

public class nombre{
  public static void main(String args[]){

  String nombre_uno = "", nombre_dos = "";
  Scanner entrada = new Scanner(System.in);

   System.out.print("Porfavor ingresa el primer nombre: ");
   nombre_uno = entrada.nextLine();
   
   System.out.print("Porfavor el segundo nombre: ");
   nombre_dos = entrada.nextLine();

  if(nombre_uno.equalsIgnoreCase(nombre_dos)){
   System.out.println("los nombres son iguales");
  }else{
   System.out.println("los nombres son diferentes");
  }  
 }
}