/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.Locale;

/**
 *
 * @author Aluno
 */
public class RevisaoSaidas {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 32;
        double saldo = 10.35784;
        String nome = "Maria";
        System.out.println("Bom dia!");
        System.out.println("Boa tarde!");
        System.out.println("Boa noite!");
        System.out.println("-----------");
        System.out.println("SALDO");
        System.out.printf("%.2f%n", saldo);
        System.out.printf("%.4f%n", saldo);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", saldo);
        
        
    }
}
