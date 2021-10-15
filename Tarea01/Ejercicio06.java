import java.util.Scanner;
public class Trabajo6{
  static Scanner sc = new Scanner(System.in);
  static void Articulos(){
    // definir variables
    double precio =0;
    String  descuento ="";
    //datos de entrada
    System.out.println("Ingrese el precio de la compra");
    precio=sc .nextDouble();  
    //proceso
    if (precio>=200){
      descuento="\n15%";
    }
   else if (precio>=100 && precio<=200){
      descuento="\n12%";
    }
    else if(precio<=100){
      descuento="\n10%";
    }

   else{
      descuento="Ninguno";
   }
    //datos de salida
    System.out.println("Usted tiene un descuento de:"+descuento);
  }
    public static void main(String[] arg){
    Articulos();
  }
}