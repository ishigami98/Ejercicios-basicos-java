//Leer un número Entero positivo. Si es par reportar su cuadrado, sino reportar su cubo.
import java.io.*;
public class Ejercicio2{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int NUM, CUA, CUBO;

  System.out.println("Ingrese un numero: ");
  NUM=Integer.parseInt(br.readLine());

  if(NUM>0){

    if(NUM % 2==0){
      CUA=NUM*NUM;
       System.out.println("El cuadrado del número es:"+CUA);
    }
    else{
      CUBO=NUM*NUM*NUM;
       System.out.println("El cubo del nÚmero es"+CUBO);
    }
    }

    else{
       System.out.println("Error en el dato ingresado");
    }
  }

  
}
