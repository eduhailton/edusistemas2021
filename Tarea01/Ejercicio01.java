import java.util.Scanner;
public class Trabajo1{
  static Scanner sc = new Scanner(System.in);

  static void Elecciones(){
    
    double edad =0;
    String voto ="";
    System.out.println("Ingrese su edad");
    edad=sc .nextDouble();
    
    if (edad>=18 && edad<=60){
      voto="\nsi vota";
    }
    else{
      voto="no vota";
   }
   System.out.println("Usted:"+voto);
   
  
  }
   public static void main(String[] arg){
    Elecciones();
  }


}