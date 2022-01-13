import java.util.Scanner;

public class Switch{
  public static void main(String args[]){
  
   int numuno = 0; 
   int numdos = 0; 
   int resultado = 0;
   int parametro = 0;
   Scanner in = new Scanner(System.in);

System.out.println("Buenos dias gente esto es un ejemplo de switch en programacion java por ello");
System.out.println("segun que parametro del 1-4 eligas sera una operacion distinta segun tus nuimeros escoguidos");
System.out.println("caso 1 suma del 1 y 2, caso 2 resta del 1 y 2, caso 3 multipilicacion del caso 1 y 2, y caso 4 division del caso 1 y 2. ");


System.out.println("¿dime tu numero 1?");
System.out.println("");
numuno = in.nextInt();

System.out.println("¿dime tu numero 2?");
System.out.println("");
numdos = in.nextInt();

System.out.println("¿dime tu numero parametro?");
System.out.println("");
parametro = in.nextInt();

   switch(parametro){

     case 1: resultado = numuno + numdos;
             System.out.println("El resultado del caso 1 es: " + resultado);
             break;
   
     case 2: resultado = numuno - numdos;
             System.out.println("El resultado del caso 2 es: " + resultado);
             break;
 
     case 3: resultado = numuno * numdos;
             System.out.println("El resultado del caso 3 es: " + resultado);
             break;

     case 4: resultado = numuno / numdos;
             System.out.println("El resultado del caso 4 es: " + resultado);
             break;
     
     default: System.out.println("ERROR LA OPCION NO EXSISTE");
              break;
  
  } 
 }
}