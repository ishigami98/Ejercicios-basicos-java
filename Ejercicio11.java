//Leer un N° N entero positivo e indicar si es divisible entre 2 y/o si es divisible entre 3 o entre ninguno de ellos.
import java.io.*;
public class Ejercicio11 {
public static void main(String [] args)throws IOException { 
BufferedReader br= new BufferedReader(new InputStreamReader (System.in));

int N;

System.out.println("Ingrese el número: ");
N=Integer.parseInt(br.readLine());

if(N>0){

  if(N % 2==0){
    System.out.println("N si divisible entre 2: ");}
    if(N % 3==0){
      System.out.println("N es divisible entre 3");}
  
  }
  else{
    System.out.println("N no es divisible ni con 2, ni con 3: ");
  }
}
}