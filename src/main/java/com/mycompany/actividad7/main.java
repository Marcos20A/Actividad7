
package com.mycompany.actividad7;

import java.util.Scanner;

public class main {
    
    public static String numeroPrimo(int numero){
        
        String r = "";
        int contador = 0;
        
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0 ){
                contador ++;
            }
        }
        if(contador == 2){
            r = numero + " es numero primo";
        }else{
            r = numero + " no es numero primo";
        }
        return r;
    }
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        int a = 0, b = 1, c, f;
        String r;
        int np;
        
        System.out.println("Ingrese la cantidad de numeros primos que quiere");
        np = lectura.nextInt();
        
        int numeroprimoxx = 2;
        
        System.out.println("Numeros primos: ");
        
        for(int i = 1; i<=np;){
            r = numeroPrimo(numeroprimoxx);
            int pos = r.indexOf(" ");
            
            if((r.substring(pos + 1).equalsIgnoreCase("es numero primo")) == true){
                System.out.println(r);
                i++;
            }
            numeroprimoxx ++;
        }
        
        System.out.println("Ingrese la cantidad de numeros de la serie: ");
        f = lectura.nextInt();
        
        System.out.println("Sucesion de Fibonacci: ");
        for(int i = 0; i < f; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            
        }
        

    }
}