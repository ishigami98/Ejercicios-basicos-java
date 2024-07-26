//Leer 2 números enteros. Si ambos son positivos calcular su suma. Si ambos son negativos calcular su producto. Sino escribir: “Error”
import java.io.*;
public class Ejercicio9{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int N1, N2, SUMA, PRODUCTO;

  System.out.println("Ingrese el primer número: ");
  N1=Integer.parseInt(br.readLine());

  System.out.println("Ingrese el segundo número: ");
  N2=Integer.parseInt(br.readLine());

     if(N1>0 && N2>0){
      SUMA=N1+N2;
      System.out.println("LA SUMA ES: "+SUMA);

    }
    else{
      if(N1<0 && N2<0){
      PRODUCTO=N1*N2;
      System.out.println("EL PRODUCTO ES: "+ PRODUCTO);
      }
      else{
        System.out.println("ERROR");
      }
    }
  }}