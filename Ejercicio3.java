//Leer un numero entero N. Si es positivo, calcular su cuadrado y su cubo. Sino escribir un mensaje: “Es negativo o cero”.
import java.io.*;
public class Ejercicio3{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int N, CUA, CUBO;

  System.out.println("Ingrese un número: ");
  N=Integer.parseInt(br.readLine());

  if(N>0){

    CUA=N*N;
    CUBO=N*N*N;
    System.out.println("El cuadrado del número es:"+CUA);
    System.out.println("El cubo del nÚmero es"+CUBO);
    }
    else{
     System.out.println("El número es negativo o cero:");
    }
  }

  
}
