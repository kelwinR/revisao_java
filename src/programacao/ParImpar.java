/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao;

/**
 *
 * @author kelwin.rodrigues
 */
public class ParImpar {
    
    public static void main(String[] args){
        
        int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 7;
        numeros[2] = 2;
        
        funcao(numeros);
        
        
    }
    
    
    private static void funcao(int[] vetor){
        int pares = 0;
        int impar = 0;
        
        for(int i = 0; i < vetor.length; i++){
            if(i % 2 == 0 ){
                System.out.println(i + " é um núemro par");
            }else{
                
                System.out.println(i + " é um núemro impar ");        
        }
             
                }
        
        
        
        
        
        
    }
    
    
    
}
