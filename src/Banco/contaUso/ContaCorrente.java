package Banco.contaUso;

import Banco.Conta;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;

public class ContaCorrente extends Conta implements  MovimentConta{

    private LocalDate dataLevantamento;


    @Override
    public void levantar(Long numero, Double valor, LocalDate dataMovimento) {
       Calendar c = new GregorianCalendar();
        c.set(Calendar.DAY_OF_MONTH, 10);
        // tentar pegar aqui o dia dez para não fazer levantamento pois é manutenção
        if(c.equals(dataLevantamento.withDayOfMonth(10))){
            System.out.println("dia livre");
        }
       if(!this.getNumero().equals(numero) || dataLevantamento.isBefore(dataMovimento)){
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

    // metodo que devolve o saldo depois de qualquer movimento
    public List<Conta> dados(Conta cont){
        DecimalFormat formar = new DecimalFormat("Akz$ #,###0.00");
        List<Conta> conta = Arrays.asList(cont);
        for (Conta c: conta) {
            System.out.println(formar.format(c.getSaldo()) + " " + toString());
        }
        return conta;
    }
     public List<Conta> dados(){
        List<Conta> c = Arrays.asList();
        c.forEach(b -> System.out.print(b.getSaldo()));
        return c;
     }

    @Override
    public String toString() {
        return "data-Levantamento=" + dataLevantamento;
    }
}
