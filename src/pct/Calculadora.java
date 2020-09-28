/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author caique
 */
public class Calculadora {
    public static void main(String[] args) {
        //declaração de variaveis
        int n1, n2, total;
        
        //criação e instância do objeto entrada e saída
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t --  calculadora simples -- \n");
        
        //Entrada
        System.out.print("informe N1: ");
        n1 = entrada.nextInt();
        System.out.print("informe n2");
        n2 = entrada.nextInt();
        
        
        //prcesamento
        total = n1 + n2;
        
        
        
        // saída
        System.out.printf("\n%d + %d  = %d\n", n1, n2, total );
        
            
        
        
    }
}
