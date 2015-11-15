/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class ExemploSwitch {
    
    
    //public class ExemploSwitch {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        char operacao = sc.nextLine().charAt(0);
        //int operacao = 5;
        switch (operacao) 
        {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
             case 7:
                System.out.println("Sábado");
                break;
            default:
                 System.out.println("Este não é um dia válido!");
         }
    }
}

