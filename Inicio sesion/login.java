import java.util.Scanner;

public class login{
  public static void main(String args[]){

  String usuario = "", password = "";
  Scanner entrada = new Scanner(System.in); 

  System.out.print("ingresa tu nombre de usuario: ");
  usuario = entrada.nextLine();
  
  System.out.print("ingresa tu contraseña de usuario: ");
  password = entrada.nextLine();

  if(usuario.equals("David") && password.equalsIgnoreCase("david1914")){
  System.out.println("inicio de sesion correcto"); 
  }else{
 
 System.out.println("es incorrecto eres hacker baneando tu cuenta en 3");
 System.out.println("2");
 System.out.println("1");
 System.out.println("Boom chacalaca");
  
  }
 }
}