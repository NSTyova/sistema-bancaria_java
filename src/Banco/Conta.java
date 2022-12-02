package Banco;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/***
 *
 */
public  abstract class Conta {

    private LocalDate dataCriacao;
    private Double saldo;
    private Long numero;


    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return getNumero().equals(conta.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }
}
