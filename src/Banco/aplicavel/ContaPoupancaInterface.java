package Banco.aplicavel;

import Banco.Conta;

import java.util.Date;

public interface ContaPoupancaInterface {

    public void applicar(Conta conta, Date movimento);
}
