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
public class Arredondamento {
    public static void main(String[] args){
         double valor = 9.53623454235243;
         
        System.out.println("Inteiro mais próximo " + Math.round(valor));
        System.out.println("Inteiro do número = " + Math.floor(valor));
        System.out.println("Valor arredondado = " + (double) Math.round(valor * 100) / 100);
    }
    
    
    
    public static double arredondarValor(double valor){
        return (double) Math.round(valor * 100)/100;
    } 
    
}
