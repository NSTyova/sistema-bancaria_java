package Banco.contaUso;

import Banco.Conta;
import Banco.clientes.Cliente;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;

public class ContaCorrente extends Conta implements MovimentConta, Comparable<ContaCorrente>{

    private LocalDate dataLevantamento;
    private Cliente clientes;


    @Override
    public void levantar(Long  numero, Double valor, LocalDate dataMovimento) {
       Calendar c = new GregorianCalendar();
        // tentar pegar aqui o dia dez para não fazer levantamento pois é manutenção

        if(c.equals(dataMovimento)){
            System.out.println("O banco está em manuntenção "+ Calendar.getInstance());
        }
       if(!this.getNumero().equals(numero) || dataMovimento.isBefore(dataLevantamento)){
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
    public void transferir(Double valor, MovimentConta destino, LocalDate dataMovimento) {
    	this.levantar(getNumero(), valor, dataMovimento);
    	destino.depositar(getNumero(), valor, dataMovimento);
    	// melhorar esta abordagem de transferencia
    	/*if(this.levantar(getNumero(), valor, dataMovimento)) {
    		destino.depositar(getNumero(), valor, dataMovimento);
    	}*/
    }

  

    public LocalDate getDataLevantamento() {
        return dataLevantamento;
    }

    public void setDataLevantamento(LocalDate dataLevantamento) {
        this.dataLevantamento = dataLevantamento;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    /**
     * metdo que faz a devolução de qualquer movimento na conta
     * @param cont
     * @return um objecto conta
     */
    public List<Conta> dados(Conta cont){
        DecimalFormat formar = new DecimalFormat("Akz$ #,###0.00");
        List<Conta> conta = Arrays.asList(cont);
        conta.forEach(b -> System.out.println("Numero de Conta  "+b.getNumero() + " Saldo da Conta " + b.getSaldo()));
        for (Conta c: conta) {
            System.out.println(formar.format(c.getSaldo()) + " " + toString() + " Nome: "+ clientes.getNome());
        }
        return conta;
    }
     public List<Conta> dados(){
        List<Conta> c = Arrays.asList();
        c.forEach((b) -> System.out.print(b.getSaldo() +""+ b.getNumero() + "" + b.getDataCriacao()));
        return c;
     }

    @Override
    public String toString() {
        return  ""+ dataLevantamento;
    }

	@Override
	public void dep(String... strings) {
		// TODO Auto-generated method stub
		
	}

	// comparar as contas baseado no saldo que temos na conta
	@Override
	public int compareTo(ContaCorrente outra) {
		if(this.getSaldo() < outra.getSaldo()) {
			return -1;
		}
		if(this.getSaldo() > outra.getSaldo()) {
			return 1;
		}
		return 0;
	}


}
