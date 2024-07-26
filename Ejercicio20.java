//Leer 2 notas de un alumno N1, N2 y obtener su promedio, Si el alumno obtiene un promedio es ≥ 11, entonces aprueba Directamente. Sino, tiene derecho a rendir un examen sustitutorio cuya nota N3 reemplaza la menor de las 2 nota iniciales y se calcula nuevamente el promedio. Si el nuevo promedio es ≥ 11 entonces el alumno aprueba con sustitutorio, sino es alumno definitivamente desaprobado. Se pide ingresar las notas que sean necesarias y reportar el promedio del alumno indicando su situación académica.
import java.io.*;
public class Ejercicio20
{ public static void main( String[ ] args ) throws IOException
  { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double N1,N2,N3,P1,P2,menor;
System.out.print("Ingrese NOTA 1 :");
N1 = Double.parseDouble(br.readLine());
System.out.print("Ingrese NOTA 2 :");
N2 = Double.parseDouble(br.readLine());
if ((N1>=0 && N1<=20) && (N2>=0 && N2<=20))
{ P1= (N1+N2)/2;
if (P1>=11)
{System.out.println("El alumno aprueba");}

else
{System.out.println("El alumno desaprueba, tiene derecho a rendir sustitutorio ");
System.out.print("Ingrese NOTA 3 :");}
N3 = Double.parseDouble(br.readLine());
if(N3>=0 && N3<=20)
{
  if((N1 <= N2) && (N1 <= N3)){
menor=N1;}
else{
  if((N2 <= N1) && (N2 <= N3)){
    menor=N2;}
    else{menor=N3;}
} P2=((N1+N2+N3)-menor)/2;
if (P2>=11)
{System.out.println("El alumno aprueba con promedio: "+P2);}
else
{System.out.println("El alumno desaprueba definitivamente");}

}
else {System.out.println("Datos inválidos, rango 0-20");}
}
else {System.out.println("Datos inválidos, rango 0-20");} 
}
}