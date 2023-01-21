package Banco.contaUso;

import java.time.LocalDate;

import Banco.clientes.Cliente;

public class MenuConta {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setNome("Salvador Tyova");
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(1234L);
        cc.setSaldo(101.0);
        cc.setClientes(c);
        cc.setDataLevantamento(LocalDate.of(2020, 10, 10));
        cc.levantar(1234L, 10.0, LocalDate.now());
        cc.dados(cc);
    }
}
