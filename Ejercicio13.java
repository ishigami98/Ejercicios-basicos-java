//Leer 2 números enteros N1, N2. Si alguno de ellos es negativo y ninguno es cero, calcular la división N1/N2, sino calcular la resta N1-N2.
import java.io.*;
public class Ejercicio13{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int N1, N2, DIVISION, RESTA;

  System.out.println("Ingrese el número 1: ");
  N1=Integer.parseInt(br.readLine());
  System.out.println("Ingrese la número 2: ");
  N2=Integer.parseInt(br.readLine());

  if(N1!=0 && N2!=0){
    if(N1<0 || N2<0){
    DIVISION=N1/N2;
     System.out.println("La división de los números es:"
     +DIVISION);}
     else{
       RESTA=N1-N2;
      System.out.println("La resta de los números es:"+RESTA);
     }
    }
    else{
      RESTA=N1-N2;
      System.out.println("La resta de los números es:"+RESTA);
  }
  }
}