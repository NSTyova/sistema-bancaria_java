package Banco.contaUso;

import Banco.Conta;

import java.time.LocalDate;

public interface MovimentConta {
    public void levantar(Long numero, Double valor, LocalDate dataMovimento);
    public void depositar(Long numero, Double valor, LocalDate dataMovimento);
    public  void transferir(Conta orgiem, Conta destino, LocalDate dataMovimento);
    // var agrs var
    public void dep(String ...strings);

 
}
