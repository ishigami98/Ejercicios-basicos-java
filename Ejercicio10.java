//Leer 2 N° enteros positivos N1 y N2 e indicar si N1 es divisible entre N2
import java.io.*;
public class  Ejercicio10 {
public static void main(String [] args)throws IOException { 
BufferedReader br= new BufferedReader(new InputStreamReader (System.in));

int NUM1, NUM2;

System.out.println("Ingrese el primer número: ");
NUM1=Integer.parseInt(br.readLine());
System.out.println("Ingrese el segundo número: ");
NUM2=Integer.parseInt(br.readLine());

if(NUM1>0 && NUM2>0){

  if(NUM1 % NUM2==0){
  System.out.println("N1 si es divisible entre N2: ");}
  
else{
System.out.println("N1 no es divisible entre N2: ");}
}
}
}