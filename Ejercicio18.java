//Una empresa tiene tres categorías de trabajadores: Funcionarios, Administrativos y Obreros. Cada uno de ellos tiene formas de pago diferentes. Un funcionario recibe X soles por hora. Un administrativo recibe W soles por hora y los obreros ganan Z soles por hora. Ingresar la categoría del trabajador y el número de horas laboradas y determinar su sueldo neto, si sobre su sueldo básico se le descuenta el 18 % por impuestos.
import java.io.*;
public class Ejercicio18
{ public static void main( String[ ] args ) throws IOException
  { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double NHL, SN, SB, D, X, W,Z;
char CAT;
System.out.print("Ingrese la categoria del trabajador: ");
CAT=br.readLine().charAt(0);
System.out.print("Ingrese el número de horas laboradas: ");
NHL=Double.parseDouble(br.readLine());
if((CAT=='F' || CAT=='A' || CAT=='O')  && (NHL>0)){
if(CAT=='F'){
System.out.print("INGRESE EL PRECIO de la hora Funcionario: ");
X=Double.parseDouble(br.readLine());
SB= X*NHL;}
else{
if(CAT=='A'){
System.out.print("INGRESE EL PRECIO de la hora Administrativo: ");
W=Double.parseDouble(br.readLine());
SB= W*NHL;}
  else{
System.out.print("INGRESE EL PRECIO de la hora Obrero: ");
Z=Double.parseDouble(br.readLine());
SB= Z*NHL;}
}
D= SB*0.18;
SN=SB-D;
System.out.println("El sueldo Neto es: " +SN);}
else {System.out.println("Error en data ingresada");}
  }
 }