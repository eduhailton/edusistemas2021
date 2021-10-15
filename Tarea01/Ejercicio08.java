import java.util.Scanner;
public class Trabajo8{
  static Scanner sc = new Scanner(System.in);
  static void Bono(){
    // definir variables
    double sueldo =0;
    String  bono ="";
    double antiguedad =0;
    String  bono ="";

    //datos de entrada
    System.out.println("Ingrese su sueldo");
    bonoA=sc .nextDouble(); 
    System.out.println("Ingrese su antiguedad");
    bonoB=sc .nextDouble(); 
    
    //proceso
    if (antiguedad>=2 && antiguedad<=5){
      bono="\n20%";
    }
   else if (antiguedad>5){
      bono="\n30%";
    }
    else if(sueldo<=1000){
      bono="\n25%";
      }
   else if(sueldo>1000 && sueldo<=3500){
      bono="15%";
   }
   else if(sueldo>3500){
      bono="10%";
   }

   else{
      bono="Ninguno";
   }
    //datos de salida
    System.out.println("Usted Tiene:"+bono);
  }
    public static void main(String[] arg){
    bono();
  }
}