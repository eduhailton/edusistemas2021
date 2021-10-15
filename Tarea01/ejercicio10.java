import java.util.Scanner;
public class Trabajo10{
  static Scanner sc = new Scanner(System.in);
  static void tortuga(){
    // definir variables
    double monto =0;
    String  kilometros ="";
    //datos de entrada
    System.out.println("Ingrese el monto de dinero que dispone");
    monto=sc .nextDouble();  
    //proceso
    if (monto>=10 && monto<=20){
      kilometros="\nMexico";
    }
   else if (monto>=21 && monto<=50){
      kilometros="\nAcapulco\nMexico";
    }
    else if(monto>=51 && monto<=100){
      kilometros="\ncancun\nAcapulco\nMexico";
      }
   else if(monto<10){
     kilometros="\nningun lugar";
   }
   else{
      kilometros="Ninguno";
   }
    //datos de salida
    System.out.println("Usted puede viajar a:"+kilometros);
  }
    public static void main(String[] arg){
    tortuga();
  }
}