//Diseñe un algoritmo que permita ingresar un número entre 1 y 12, y muestre el nombre del mes al que corresponde. Considerar que el 1 es para enero y 12 es para diciembre.
import java.io.*;
public class Ejercicio16{
public static void main(String[] args)throws IOException{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

int N;
String MES;

System.out.println("Ingrese el número: ");
N=Integer.parseInt(br.readLine());
if(N>=1 && N<=12){
  if(N==1){
  MES="enero";
  System.out.println("El mes es "+MES);
  }
  else{
    if(N==2){
      MES="febrero";
      System.out.println("El mes es "+MES);
    }
    else{
      if(N==3){
        MES="marzo";
        System.out.println("El mes es "+MES);
      }
      else{
        if(N==4){
          MES="abril";
          System.out.println("El mes es "+MES);
        }
        else{
          if(N==5){
            MES="mayo";
            System.out.println("El mes es "+MES);
          }
          else{
            if(N==6){
              MES="junio";
              System.out.println("El mes es "+MES);
            }
            else{
              if(N==7){
                MES="julio";
                System.out.println("El mes es "+MES);
              }
              else{
                if(N==8){
                  MES="agosto";
                  System.out.println("El mes es "+MES);
                }
                else{
                  if(N==9){
                    MES="setiembre";
                    System.out.println("El mes es "+MES);
                  }
                  else{
                    if(N==10){
                      MES="octubre";
                      System.out.println("El mes es "+MES);
                    }
                    else{
                      if(N==11){
                        MES="noviembre";
                        System.out.println("El mes es "+MES);
                      }
                      else{
                        if(N==12){
                          MES="diciembre";
                          System.out.println("El mes es "+MES);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}}}