package Banco.contaUso;

import Banco.Conta;
import Banco.clientes.Cliente;

import java.time.LocalDate;

public class MenuConta {
    public static void main(String[] args) {
        Cliente clientes =new Cliente();
        clientes.setNome("Salvador Tyova");
        ContaCorrente conta= new ContaCorrente();
        conta.setNumero(1245L);
        conta.setDataLevantamento(LocalDate.of(2022,12,28));
        conta.setSaldo(100.0D);
        conta.setClientes(clientes);
        conta.levantar(1245L, 50.0, LocalDate.of(2022,10,10));
        System.out.println(conta.dados(conta));

    }
}
