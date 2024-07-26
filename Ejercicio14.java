//Diseñe un algoritmo que permita ingresar un número entre 1 y 7, y muestre el nombre del día al que corresponde. Considerar que el 1 es para lunes y 7 es para domingo.
import java.io.*;
public class Ejercicio14{
public static void main(String[] args)throws IOException{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

int N;
String DIA;

System.out.println("Ingrese el número: ");
N=Integer.parseInt(br.readLine());
if(N>=1 && N<=7){
  if(N==1){
  DIA="lunes";
  System.out.println("El día es"+DIA);}
  else{
    if(N==2){
      DIA="martes";
      System.out.println("El día es "+DIA);}
      else{
        if(N==3){
          DIA="miercoles";
          System.out.println("El día es"+DIA);}
          else{
            if(N==4){
              DIA="jueves";
              System.out.println("El día es"+DIA);}
              else{
                if(N==5){
                  DIA="viernes";
                  System.out.println("El día es"+DIA);}
                  else{
                    if(N==6){
                      DIA="sabado";
                      System.out.println("El día es"+DIA);}
                      else{
                        if(N==7){
                          DIA="domingo";
                          System.out.println("El día es"+DIA);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else{
            System.out.println("ERROR");
          }
        }
      }