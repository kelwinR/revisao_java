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
public class Conta {
    private int agencia;
    private int conta;
    private String nomePessoa;
    private double saldo;
    private double chequeEspecial;

    public Conta(int agencia, int conta, String nomePessoa, double saldo, double chequeEspecial) {
        this.agencia = agencia;
        this.conta = conta;
        this.nomePessoa = nomePessoa;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }
    
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
     
    
     @Override
    public String toString(){
        return "Conta: " + this.conta + " - Saldo: " + Tools.formatarValor(this.saldo, true);
    }
    
    public boolean sacar(double valor){
        try{
            double resultado = this.saldo - valor;
            //não pode ultrapassar o cheque especial
            if(resultado >= (this.chequeEspecial * -1)){
                this.saldo -= valor;
                return true;
            }else{
                return false;
            }
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
     public void deposito(double valorDeposito){
        double saldoNovo = this.saldo + valorDeposito;
        this.saldo = saldoNovo;
        //this.saldo += valorDeposito outra forma de passar o valor
    }
     
     public void transfere(Conta destino, double valorTransferencia){
        this.saldo = this.saldo - valorTransferencia;
        destino.saldo = destino.saldo + valorTransferencia;
        
    }
    
    
    
}
