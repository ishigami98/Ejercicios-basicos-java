//Leer un número N, si es negativo calcular su cubo sino calcular su cuadrado.
import java.io.*;
public class Ejercicio4{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int N, CUA, CUBO;

  System.out.println("Ingrese un número: ");
  N=Integer.parseInt(br.readLine());

  if(N<0){

    CUBO=N*N*N;
    
    System.out.println("El cubo del nÚmero es"+CUBO);
    }
    else{
      CUA=N*N;
     System.out.println("El cuadrado del número es:"+CUA);
    }
  }

  
}