//Leer un número positivo N1 y un número Negativo N2. Calcular el promedio. Si el promedio es positivo escribir “Promedio Positivo” Sino calcular N1/N2.
import java.io.*;
public class Ejercicio7 {
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    double N1, N2, PROM, DIV;

    System.out.println("Ingrese número 1: ");
    N1=Double.parseDouble(br.readLine());
    System.out.println("Ingrese número 2: ");
    N2=Double.parseDouble(br.readLine());

    if(N1 !=0 && N2!=0){

      if(N1>0 && N2<0){
        PROM=(N1+N2)/2;

        if (PROM>0){
           System.out.println("Promedio ="+ PROM);
           System.out.println("Promedio positivo");

        }
        else {
          DIV=N1/N2;
           System.out.println("La division de N1/N2 es: "+DIV);
        }

      }
    }
  }}
