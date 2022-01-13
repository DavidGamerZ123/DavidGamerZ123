public class Promedio{
  public static void main(String argss[]){
 
  int matematicas = 3;
  int biologia = 2;
  int quimica = 7;
  int promedio = 0;
 
   promedio = (matematicas + biologia + quimica) / 3;
   
   if(promedio >= 6){
    System.out.println("El alumno aprobó" + promedio); 
  } else {
    System.out.println("El alumno suspendió" + promedio);   
   } 
 }
}