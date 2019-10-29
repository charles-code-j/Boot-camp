package com.devBootCampexercicio1;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        dadosPessoas();
    }
    public static void dadosPessoas(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        pessoa.setSobrenome("Creudo");
        pessoa.setCpf("123113113");
        pessoa.setDataNacsimento(LocalDate.now());
        pessoa.setEmail("sdfsd@gmail.com");
        Endereco endereco = new Endereco("Auroro", 22 ,"perto" );
        Telefone telefone = new Telefone("991454465", TipoTelefone.CELULAR);
        Telefone telefone1 = new Telefone("342423234", TipoTelefone.RESIDENCIA);
        Telefone telefone2 = new Telefone("1123131", TipoTelefone.COMERCIAL);
        pessoa.getTelefones().add(telefone);
        pessoa.getTelefones().add(telefone1);
        pessoa.getTelefones().add(telefone2);
        System.out.println("-------------------------------------------------");
        System.out.println("Cpf: "+ pessoa.getCpf());
        System.out.println("Telefone celular: "+ telefone.getNumero());
        System.out.println("Telefone residencia: "+ telefone1.getNumero());
        System.out.println("Telefone comercial: "+ telefone2.getNumero());
        System.out.println("Nome: "+ pessoa.getNome());
        System.out.println("Sobrenome: "+ pessoa.getSobrenome());
        System.out.println("E-mail: "+ pessoa.getEmail());
        System.out.println("Bairro: "+ endereco.getBairro());
        System.out.println("Endereço: " +endereco.getEndereco());
        System.out.println("Numero: "+ endereco.getNumero());
        System.out.println("Data nacimento: "+ pessoa.getDataNacsimento());
        System.out.println("---------------------------------------------------\n");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("João");
        pessoa2.setSobrenome("Maria");
        pessoa2.setEmail("JoaoMaria@gmail.com");
        pessoa2.setCpf("324234324234");
        pessoa2.setDataNacsimento(LocalDate.now());
        Endereco endereco2 = new Endereco("cabral",255,"caio");
        Telefone telefone3 = new Telefone("456456", TipoTelefone.CELULAR);
        Telefone telefone4 = new Telefone("64513234", TipoTelefone.RESIDENCIA);
        Telefone telefone5 = new Telefone("6765843523", TipoTelefone.COMERCIAL);
        pessoa2.getTelefones().add(telefone3);
        pessoa2.getTelefones().add(telefone4);
        pessoa2.getTelefones().add(telefone5);
        System.out.println("-------------------------------------------------");
        System.out.println("Cpf: "+ pessoa2.getCpf());
        System.out.println("Telefone celular: "+ telefone3.getNumero());
        System.out.println("Telefone residencia: "+ telefone4.getNumero());
        System.out.println("Telefone comercial: "+ telefone5.getNumero());
        System.out.println("Nome: "+ pessoa2.getNome());
        System.out.println("Sobrenome: "+ pessoa2.getSobrenome());
        System.out.println("E-mail: "+ pessoa2.getEmail());
        System.out.println("Bairro: "+ endereco2.getBairro());
        System.out.println("Endereço: " +endereco2.getEndereco());
        System.out.println("Numero: "+ endereco2.getNumero());
        System.out.println("Data nacimento: "+ pessoa2.getDataNacsimento());
        System.out.println("------------------------------------------------");
    }

}
