package com.devBootCampexercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private LocalDate dataNacsimento;
    private ArrayList<Endereco> enderecos = new ArrayList<>();
    private ArrayList<Telefone> telefones = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public LocalDate getDataNacsimento() {
        return dataNacsimento;
    }

    public void setDataNacsimento(LocalDate dataNacsimento) {
        this.dataNacsimento = dataNacsimento;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

}
