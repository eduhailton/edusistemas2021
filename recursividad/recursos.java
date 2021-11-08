paquete  pe.edu.upeu.modulo ;
import  java.math.BigInteger ;

 clase  pública Recursividad {

 factorial largo  público ( n largo ) { 
  si (n > 1 ) {
    retorno factorial (n - 1 ) * n;
  }
  return  1 ;
}


public  BigInteger  factorialBig ( long  n ) {
  si (n > 1 ) {
    return factorialBig (n - 1 ) . multiplicar ( nuevo  BigInteger ( String . valueOf (n)));
  }
  devolver  nuevo  BigInteger ( String . valueOf ( 1 ));
}


 fibonacci largo  público ( n largo ) { // 5 
  si (n > 1 ) {
      return fibonacci (n - 1 ) + fibonacci (n - 2 );
  }
  return n;
}


// 0,1,1,2,3,5,8,13,21,34,55.
 fibonaccix largo  público ( n largo ) { 
  int valAnt = 0 , valNew = 1 , valAux = 0 ;
   si (n > 1 ) {
     para ( int i = 1 ; i < n; i ++ ) {
        valAux = valNew;
        valNew = valAnt + valNew;
        valAnt = valAux;
     }
     return valNew;
   }
   return n;
}

public  BigInteger  fibonacciBig ( n larga  ) {
  BigInteger valAnt = nuevo  BigInteger ( " 0 " ), valNew = nuevo  BigInteger ( " 1 " ), valAux = nuevo  BigInteger ( " 0 " );
   si (n > 1 ) {
     para ( int i = 1 ; i < n; i ++ ) {
        valAux = valNew;
        valNew = valAnt . agregar (valNew);
        valAnt = valAux;
     }
     return valNew;
   }
   devolver  nuevo  BigInteger ( String . valueOf (n));
}

}