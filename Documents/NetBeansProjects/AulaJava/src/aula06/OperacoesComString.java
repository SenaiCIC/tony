/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import static com.sun.javafx.animation.TickCalculation.sub;

/**
 *
 * @author Aluno
 */
public class OperacoesComString {
    public static void main(String[] args) {
        String n = "Tony";
        String nM = n.toUpperCase();
        System.out.println("maiusculo:"+ nM); 
            String nm = n.toLowerCase();
        System.out.println("minusculo"+ nm);
        String rec = "Senai CIC é melhor curso do Brasil";
        String sub = rec.substring(5,31);
        System.out.println("sub ="+ sub);
        String rep = rec.replace("Brasil", "mundo");
        System.out.println("Replace="+ rep);
        int loc = rec.indexOf("ai");
        System.out.println("Localizado="+ loc);
        
    }
}
