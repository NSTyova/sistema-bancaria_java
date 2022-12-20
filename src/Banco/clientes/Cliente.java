package Banco.clientes;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Integer telefone;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        if(nome.isEmpty()){
            System.out.println("O nome não pode ser Null");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isEmpty()){
            System.out.println("O nome não pode ser Null");
        }
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
