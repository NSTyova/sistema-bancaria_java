package Banco.contaUso;

import Banco.Conta;

import java.time.LocalDate;

public class MenuConta {
    public static void main(String[] args) {
        ContaCorrente conta= new ContaCorrente();
        conta.setNumero(1245L);
        conta.setDataLevantamento(LocalDate.of(2022,7,10));
        conta.setSaldo(10000.0D);
        conta.levantar(1245L, 5000.0, LocalDate.of(2022,7,10));
        System.out.println(conta.dados(conta));

    }
}
