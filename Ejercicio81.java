/* Leer 2 edades e1 y e2. Si ambas son mayores de edad reportar la suma de las edades.
Sino calcular y reportar el producto las edades */

import java.io.*;
public class Ejercicio81 {
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    int e1,e2,suma, prod;

    System.out.println("Ingrese e1:");
    e1=Integer.parseInt(br.readLine());
      System.out.println("Ingrese e2:");
    e2=Integer.parseInt(br.readLine());

    if(e1>0 && e1<120 && e2>0 && e2<120){

    if(e1>=18 && e2>=18){
      suma=e1+e2;
      System.out.println("La suma de edades es: "+suma); 
    }
    else{
      prod=e1*e2;
      System.out.println("El producto de edades es: "+prod);
    }
    }
    else{
      System.out.println("Error en el dato ingresado..");
    }
  }}
