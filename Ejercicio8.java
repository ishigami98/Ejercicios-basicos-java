//Leer 2 edades e1 y e2. Si ambas son mayores de edad reportar la suma de las edades. Sino calcular y reportar el producto las edades
import java.io.*;
public class Ejercicio8{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int e1, e2, SUMA, PRODUCTO;

  System.out.println("Ingrese la edad 1: ");
  e1=Integer.parseInt(br.readLine());

  System.out.println("Ingrese la edad 2: ");
  e2=Integer.parseInt(br.readLine());

  if(e1>=18 && e2>=18){
    SUMA=e1+e2;
      System.out.println("La suma de la edades es:"+SUMA);
    }
    else{
      PRODUCTO=e1*e2;
     System.out.println("El producto de las edades es:"+PRODUCTO);
  }
  }
}