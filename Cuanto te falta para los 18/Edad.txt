import java.util.Scanner;

public class Edad{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   int edad = 0;
   int numuno = 18;  
   int resultado = 0;

   System.out.println("Cual es tu numero de edad");
   edad = in.nextInt();

   resultado = numuno - edad;  

   System.out.println("lo que te falta para los 18 son " + resultado + " años ");
 }
}