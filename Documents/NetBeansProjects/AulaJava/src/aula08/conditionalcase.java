/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class conditionalcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número entre 1 e 7");
        int dia = sc.nextInt();
        String dsemana;
        switch (dia){
            case 1:
                dsemana = "Domingo";
                        break;
            case 2:
                dsemana = "Segunda";
                        break;
            case 3:
                dsemana = "Terça";
                        break;
            case 4:
                dsemana = "Quarta";
                        break;
            case 5:
                dsemana = "Quinta";
                        break;
            case 6:
                dsemana = "Sexta";
                        break;
            case 7:
                dsemana = "Sábado";            
                        break;
            default:
                dsemana = "Número inválido";
             
                        
                        
        }
        System.out.println(dsemana);
        sc.close();
        
        
    }
}
