//Leer un número entero N. Si N es positivo calcular N+N, si N es negativo calcular N*N, sino escribir el número N en letras.
import java.io.*;
public class Ejercicio6{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    double N, SUMA, PRODUCTO;

    System.out.println("Ingrese un número: ");
    N=Integer.parseInt(br.readLine());

    if(N>0 && N!=0){
      SUMA=N+N;
      System.out.println("LA SUMA ES: "+SUMA);

    }
    else{
      if(N<0 && N!=0){
      PRODUCTO=N*N;
      System.out.println("EL PRODUCTO ES: "+ PRODUCTO);
      }
      else{
        System.out.println("Ud ingreso el número: CERO");
      }
    }
  }}
