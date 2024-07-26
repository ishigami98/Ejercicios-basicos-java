import java.io.*;
public class  A{
public static void main(String [] args)throws IOException { 
BufferedReader br= new BufferedReader(new InputStreamReader (System.in));

double LC=325.72, LI=413.40, LT=200, SUMA, DESCUENTO1, DESCUENTO2, DESCUENTO3;
int PLC, PLI, PLT;

System.out.println("Ingrese la cantidad de pasajes que desea comprar de Lima - Cuzco: ");
PLC=Integer.parseInt(br.readLine());
System.out.println("Ingrese la cantidad de pasajes que desea comprar de Lima - Iquitos: ");
PLI=Integer.parseInt(br.readLine());
System.out.println("Ingrese la cantidad de pasajes que desea comprar de Lima - Trujillo: ");
PLT=Integer.parseInt(br.readLine());

if(PLC>0 && PLI>0 && PLT>0){
  if(PLC<=5 || PLI<=5 || PLT<=5){
    DESCUENTO1=LC*0.15;
    DESCUENTO2=LI*0.15;
    DESCUENTO3=LT*0.15;
    VALOR1=LC-DESCUENTO1;
    VALOR2=LI-DESCUENTO2;
    VALOR3=LT-DESCUENTO3;
  }
  else{
    DESCUENTO1=LC*0.20;
    DESCUENTO2=LI*0.20;
    DESCUENTO3=LT*0.20;
    VALOR1=LC-DESCUENTO1;
    VALOR2=LI-DESCUENTO2;
    VALOR3=LT-DESCUENTO3;
  }
}
else{
  }
if(VALOR1>1000 || VALOR2>1000 || VALOR3>1000){
  IMPUESTO1=VALO1*0.05;
  IMPUESTO2=VALO2*0.05;
  IMPUESTO3=VALO3*0.05:
  TOTAL1=VALOR1+IMPUESTO1;
  TOTAL2=VALOR3+IMPUESTO2;
  TOTAL3=VALOR3+IMPUESTO3;
  System.out.println("El total a pagar es:"+TOTAL1);
  System.out.println("El total a pagar es:"+TOTAL2);
  System.out.println("El total a pagar es:"+TOTAL3);
}
else{
  System.out.println("El total a pagar es:"+VALOR1);
  System.out.println("El total a pagar es:"+VALOR2);
  System.out.println("El total a pagar es:"+VALOR3);
}
}}