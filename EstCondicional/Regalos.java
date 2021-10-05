import java.util.Scanner;

public class Regalos{

static Scanner sc = new Scanner(System.in);

static void algoritmoRegalos(){
 //
 double monto=0;
 String regalo="";
 //datos de entrada
 System.out.println("ingese el monto que dispone:");
 monto=sc.nextDouble();
 //proceso
 if(monto<10){
   regalo="\nTarjeta";
 } else if(monto>=11 && monto<=100){
   regalo="\nChocolate\nTarjeta";
 } else if(monto>=101 && monto<=250){
   regalo="\nFlores\nChocolate\nTarjeta";
 } else if(monto>250){
   regalo="\nAnillo\nFlores\nChocolate\nTarjeta";
 } else{
   regalo="Ninguno";
 }
 //datos de salida
  System.out.println("ud. puede elegir los siguentes:"+ regalo);
}

public static void main(String[] arg){
 algoritmoRegalos(); 
}

}