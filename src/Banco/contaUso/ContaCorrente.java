package Banco.contaUso;

import Banco.Conta;

import java.time.LocalDate;
import java.util.*;

public class ContaCorrente extends Conta implements  MovimentConta{

    private LocalDate dataLevantamento;


    @Override
    public void levantar(Long numero, Double valor, LocalDate dataMovimento) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.DAY_OF_WEEK_IN_MONTH, 10);
        // tentar pegar aqui o dia dez para não fazer levantamento pois é manutenção
       if(!this.getNumero().equals(numero) || dataLevantamento.isBefore(dataMovimento) || dataLevantamento.equals(c)){
           System.out.println("numero / data não estão certas ou é dia de manuntencão");
       }else {
           super.setSaldo(this.getSaldo() - valor);
       }
    }

    @Override
    public void depositar(Long numero, Double valor, LocalDate dataMovimento) {
        if(!this.getNumero().equals(numero) && dataLevantamento.isBefore(dataMovimento)){
            System.out.println("numero ou data não estão certas");
        }
        super.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void transferir(Conta conta, LocalDate dataMovimento) {

    }

    public LocalDate getDataLevantamento() {
        return dataLevantamento;
    }

    public void setDataLevantamento(LocalDate dataLevantamento) {
        this.dataLevantamento = dataLevantamento;
    }


    public List<ContaCorrente> dados(){
        List<Conta> conta = Arrays.asList();
        for (Conta cc: conta) {
            System.out.println(cc.getSaldo());
            System.out.println(cc.getDataCriacao());
        }
        return null;
    }
}
