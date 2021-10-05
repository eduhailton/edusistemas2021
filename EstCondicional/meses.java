import java.util.Scanner;

public class mesnum{

static Scanner sc = new Scanner(System.in);

static void mesdelanho(){
  int mesnum;
  String mesLetra="";
  System.out.println("ingrese el numero de mes entre 1 - 12");

  mesnum=sc.nextInt();


  switch(mesnum){
    case 1: mesLetra="Enero"; break;
    case 2: mesLetra="Febrero"; break;
    case 3: mesLetra="Marzo"; break;
    case 4: mesLetra="Abril"; break;
    case 5: mesLetra="Mayo"; break;
    case 6: mesLetra="Junio"; break;
    case 7: mesLetra="Julio"; break;
    case 8: mesLetra="Agosto"; break;
    case 9: mesLetra="Setiembre"; break;
    case 10: mesLetra="Octubre"; break;
    case 11: mesLetra="Noviembre"; break;
    case 12: mesLetra="Diciembre"; break;
    default:System.out.println("este mes no es valido:");
    
  }
  System.out.println("elmes"+mesnum+"es:"+mesLetra);
}
public static void main(String[] arg){
  mesdelanho();
}
}