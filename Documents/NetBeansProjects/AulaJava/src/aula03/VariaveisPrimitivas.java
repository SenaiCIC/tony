/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Aluno
 */
public class VariaveisPrimitivas {
    public static void main(String[] args) {
        
        String nome = "Tony";
        int idade = 17;
        boolean escolha = true;        //T F  
        char sexo = 'M';               // CARACTER
        char letra = '\u0041';         // codigo unicode
        byte n1 = 126;                 // numero
        int n2 = 1000;                 // inteiro
        long n4 = 123456789L;          // inteiro maiores
        float n5 = 25.80f;             // decimais 
        double n6 = 25.51;             // decimais duplos
        
  System.out.println(escolha);
        System.out.println(sexo);
        System.out.println(letra);
        System.out.println(n1);    
    System.out.println(n2);   
    System.out.println(n4);   
    System.out.println(n5);
    System.out.println(n6); 
    System.out.println("==========");
    System.out.printf("%.2f%n",n5);
    System.out.printf("%.5f",n6);   
    System.out.println("Tony"); 
    System.out.printf("%s tem %d anos",nome,idade);   
    
    }
    
}
