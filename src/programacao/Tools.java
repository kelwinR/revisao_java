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
public class Tools {
    
    public static void main(String[] args){
        
        int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 8;
        numeros[2] = 2;
        
       // funcao(numeros);
        
        
    }
    
    
    public static void verificaParImpar(int numero){
         if(numero % 2 == 0){
                System.out.println(numero + " é par");
            }else{
                System.out.println(numero + " é ímpar");
            }
        //int pares = 0;
        //int impar = 0;
            /*
            int resto_divisao = vetor[1] % 2;
            if(resto_divisao == 0){
            pares++; 
            }else{
            impares++;
            }
            */
            /*
            if(vetor[i] % 2 == 0 ){
                pares = pares + vetor[i];
                System.out.println(pares + " é um núemro par");
            }else{
                impar = impar + vetor[i];
                System.out.println(impar + " é um núemro impar ");        
        }
            */
                }
    
            public static String formatarValor(Double valor){
                return "R$ " +valor;
            }   
    
    
    
        
    }
    
    
    

