
package com.mycompany.ejercicio;
import java.util.Scanner;

/**
 *
 * @author Gabriel and AND
 */
public class App {

    public static void main(String[] args) {
    //crear un vector 
    int i, n, t=0, p=0;
    float pf;
    String op;
    Scanner lector=new Scanner(System.in);
    int[] sueldo = new int[10];
     System.out.println("ingrese calificaciones ");
    for(i=0;i<10;i++){
        sueldo[i]=lector.nextInt();
     }
        System.out.println("El quinto valor es "+sueldo[4]);
        System.out.println("El ultimo valor es "+sueldo[9]);
        System.out.println("El octavo valor es "+sueldo[7]);
        //imprimir lista alrevez 
        for(i=9;i>=0;i--){
            System.out.println(sueldo[i]);
        }
        //preguntar que nota consultar
        do{
        System.out.println("ingrese que nota quiere consultar ");
        n=lector.nextInt();
        System.out.println("La nota en la pocision "+n+" es "+sueldo[n-1]);
            System.out.println("quiere seguir consultando notas? ");
            op=lector.next().toUpperCase();
        }while(op.equals("SI"));
        do{
        System.out.println("elija una nota para calcular el promedio ");
        n=lector.nextInt();
        System.out.println("La nota elegida es "+sueldo[n-1]);
            t=t+sueldo[n-1];
            p++;
            System.out.println("quiere agregar otra nota al calculo? ");
            op=lector.next().toUpperCase();
        }while(op.equals("SI"));
        pf=t/p;
        System.out.println("notas ingresadas: "+p);
        System.out.println("suma de las notas ingresadas "+t);
        System.out.println("promedio "+pf);
    }
}
