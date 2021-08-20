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
public class TerminalBanco {
    
    public static void main(String[] args){
        
        Conta conta1 = new Conta(1, 123, "Kelwin", 500, 1000);
        /*conta1.setAgencia(1);
        conta1.setConta(123);
        conta1.setNomePessoa("Kelwin");
        conta1.setSaldo(500);*/
        
        Conta conta2 = new Conta(1, 456, "Patrick", 500, 1000);

        System.out.println(conta1.toString());
        //System.out.println(conta2.toString());
        conta1.sacar(50);
        System.out.println(conta1.toString());
       //conta2.sacar(200);
        conta1.deposito(1000);
        System.out.println(conta1.toString());
        conta1.transfere(conta2, 50);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
       

    }
    
    
    
    
    
}
