public class Switch{
  public static void main(String args[]){
  
   int numuno = 5, numdos = 3, resultado = 0;
   int parametro = 2;
 
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