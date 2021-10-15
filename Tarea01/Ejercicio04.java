import java.util.Scanner;
public class Trabajo4{
  static Scanner sc = new Scanner(System.in);
  static void Estacionamiento(){
    
    double horas =0;
    String  soles ="";
    
    System.out.println("Ingrese las horas que estara estacionado");
    horas=sc .nextDouble();  
    //proceso
    if (horas>=1 && horas<=2){
      soles="\n5.oo";
    }
   else if (horas>=3 && horas<=6){
      soles="\n4.oo";
    }
    else if(horas>=7 && horas<=12){
      soles="\n3.00";
      }
   else if(horas>10){
     soles="\n2.00";
   }
   else{
      soles="Ninguno";
   }
    
    System.out.println("Usted deve:"+soles);
  }
    public static void main(String[] arg){
    Estacionamiento();
  }
}