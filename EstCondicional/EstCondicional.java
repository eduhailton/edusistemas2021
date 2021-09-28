import java.util.Scanner;
public class EstCondicional {

static Scanner sc = new Scanner(System.in);

  static void ventalapices(){
    //definir variable
    int cantidadlap;
    double pago;
    //datos de entrada
    System.out.println("ingese la cantidad de lapices a comprar");
    cantidadlap=sc.nextInt();
    //proceso
     if (cantidadlap>=1000) {
      pago=cantidadlap*0.85;
    } else {
      pago=cantidadlap*0.90;
    }
    //Datos de Salida
    System.out.println("el pago a realizar es:"+pago);
 

  }
   public static void main(String[] args) {
     System.out.println("Hello World"); 
     ventalapices();
     
}
}