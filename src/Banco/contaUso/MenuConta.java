package Banco.contaUso;

import Banco.Conta;

import java.time.LocalDate;

public class MenuConta {
    public static void main(String[] args) {
        ContaCorrente conta= new ContaCorrente();
        conta.setNumero(1245L);
        conta.setDataLevantamento(LocalDate.of(2022,7,14));
        conta.setSaldo(100.0D);
        conta.levantar(1245L, 50.0D, LocalDate.of(2022,7,14));
        System.out.println(conta.dados());

    }
}
