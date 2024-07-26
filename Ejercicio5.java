//Leer un N° diferente de cero. Si N es positivo calcular 2N sino calcular 5N.
import java.io.*;
public class Ejercicio5{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int N, NUM2, NUM5;

  System.out.println("Ingrese un número: ");
  N=Integer.parseInt(br.readLine());

  if(N!=0){

    if(N>0){
      NUM2=2*N;
      System.out.println("El resultado de 2N es:"+NUM2);
    }
    else{
      NUM5=5*N;
     System.out.println("El resultado de 5N es:"+NUM5);
    }
  }
  else{
     System.out.println("Usted ingreso un cero...");
  }
  }
}