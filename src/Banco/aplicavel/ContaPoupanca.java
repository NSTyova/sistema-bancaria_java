package Banco.aplicavel;

import Banco.Conta;

import java.util.Date;

public class ContaPoupanca extends Conta implements ContaPoupancaInterface{

    private Date dataAplicacao;
    private Date dataVencimento;
    private Double valor;



    // fazer uma lista de conta aplicacaveis por dtas
    @Override
    public void applicar(Conta conta,Date movimento) {
       // trabalhar aqui a forma de aplicar um determinada valor

        if(movimento.before(dataVencimento) ){
            System.out.println("AInda nao pode levantar");
            //calcular os Jurus tambem
        }
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
