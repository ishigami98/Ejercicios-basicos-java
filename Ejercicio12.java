//Leer 2 notas N1, N2. Si alguna de ellas es aprobatoria calcular y reportar su producto, sino calcular y reportar su suma.
import java.io.*;
public class Ejercicio12{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int N1, N2, PRODUCTO, SUMA;

  System.out.println("Ingrese la nota 1: ");
  N1=Integer.parseInt(br.readLine());

  System.out.println("Ingrese la nota 2: ");
  N2=Integer.parseInt(br.readLine());

  if(N1>=11 || N2>=11){
    PRODUCTO=N1*N2;
     System.out.println("El producto de las notas es:"
     +PRODUCTO);
    }
    else{
     SUMA=N1+N2;
      System.out.println("La suma de las notas es:"+SUMA);
  }
  }
}