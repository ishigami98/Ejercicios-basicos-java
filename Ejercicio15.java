//Diseñe un algoritmo que permita leer los 3 lados de un triángulo L1,L2 y L3, y que,determine el tipo de triangulo que se tiene (Escaleno=Tres lados diferentes, Isósceles=dos lados iguales, equilátero=Tres lados iguales).
import java.io.*;
public class Ejercicio15{
public static void main(String[] args)throws IOException{ BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

int L1, L2, L3;

System.out.println("Ingrese el primer lado: ");
L1=Integer.parseInt(br.readLine());
System.out.println("Ingrese el segundo lado: ");
L2=Integer.parseInt(br.readLine());
System.out.println("Ingrese el tercer lado: ");
L3=Integer.parseInt(br.readLine());

if(L1==L2 && L1==L3){
  System.out.println("El triángulo es equilátero");
}
else{
  if(L1==L2 || L2==L3 || L1==L3){
    System.out.println("El triángulo es isosceles");
  }
  else{
    System.out.println("El triángulo es escaleno");
  }
}
}
}
