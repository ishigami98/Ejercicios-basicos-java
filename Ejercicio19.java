//En una tienda se ha establecido la siguiente oferta: por compras menores a 150 soles se hace un descuento de 8%, pero para compras a partir de 150 el descuento es de 15%. En cualquier caso, se le incrementa el 18% de lo que se debería pagar, por concepto de IGV.Se pide ingresar la cantidad y el precio del producto que se compra y determinar el monto total de la compra, cuánto se descontará, el pago luego del descuento, cuanto se paga por IGV y cuanto se pagará en total.
import java.io.*;
public class Ejercicio19
{ public static void main( String[ ] args ) throws IOException
  { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double C, P, TC, D, PCD, IGV, PT;
System.out.print("La cantidad es  : ");
C=Double.parseDouble(br.readLine());
System.out.print("El precio es   : ");
P=Double.parseDouble(br.readLine());
if((C>0)&&(P>0))
{
TC= C*P;
IGV= TC * 0.18;
if(TC>=150){
D=TC*0.15;}
else{
  D=TC*0.08;}
PCD= TC-D;
PT= PCD+IGV;
System.out.println("El TOTAL DE LA COMPRA ES : " +TC);
System.out.println("EL DESCUENTO ES : " +D);
System.out.println("EL IGV ES : " +IGV);
System.out.println("EL PRECIO CON DESCUENTO ES : " +PCD);
System.out.println("EL PRECIO TOTAL DE LA COMPRA ES : " +PT);
}
else{
  System.out.println("Error en data ingresada");
}
  }
}