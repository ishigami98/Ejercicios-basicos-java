//Un restaurante ofrece sus ofertas de acuerdo a la siguiente escala de consumo. En todos los casos se aplica un impuesto del 16%. Determinar el importe a pagar por lo consumido, mostrando cuanto es el descuento en cada caso.
import java.io.*;
public class Ejercicio17{
public static void main(String[] args)throws IOException{ BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

int PRECIO;
double IMPUESTO, D;

System.out.println("Ingrese el precio inicial: ");
PRECIO=Integer.parseInt(br.readLine());

if(PRECIO>0){
  if(PRECIO>=250){
  D=(PRECIO-(PRECIO*0.2))*(0.16);
  System.out.println("El descuento es de 20% y el importe a pagar es:"+D);}
  else{
   if(PRECIO>=120 && PRECIO<=249){
    D=(PRECIO-(PRECIO*0.15))*(0.16);
    System.out.println("El descuento es de 15% y el importe a pagar es:"+D);}
    else{
     if(PRECIO>=30 && PRECIO<=119){
      D=(PRECIO-(PRECIO*0.1))*(0.16);
      System.out.println("El descuento es de 10% y el importe a pagar es:"+D);}
      else{
       if(PRECIO<=29){
        D=(PRECIO-(PRECIO*0.05))*(0.16);
        System.out.println("El descuento es de 5% y el impuesto es:"+D);}
}}}}
else{
  System.out.println("ERROR");
}
}}