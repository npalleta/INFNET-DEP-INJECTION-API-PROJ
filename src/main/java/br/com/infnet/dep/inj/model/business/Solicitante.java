package br.com.infnet.dep.inj.model.business;

public class Solicitante {

    private String nome;
    private String cpf;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Solicitante(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s",
                this.nome,
                this.cpf,
                this.email);
    }
}
