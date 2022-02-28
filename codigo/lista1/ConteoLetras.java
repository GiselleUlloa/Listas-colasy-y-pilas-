/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contar;

import java.util.Scanner;

/**
 *
 * @author olivercogollo
 */
public class ConteoLetras {

    public int ContarLetras(String frase){
        int numeroLetras=0;
        
        for (int i = 0; i < frase.length(); i++){
            if(frase.charAt(i)!=' '){
                numeroLetras++;
            }
        }
        return numeroLetras;
    }
    public static void main(String[] args) {
    Scanner lector=new Scanner(System.in);
    String frase;
    
        System.out.println("ingrese palabra o frase: ");
        frase=lector.nextLine();
        
        ConteoLetras contador = new ConteoLetras();
        System.out.println(contador.ContarLetras(frase));
        
    
    }

    
    }
    

