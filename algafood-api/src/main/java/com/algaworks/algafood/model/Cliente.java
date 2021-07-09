package com.algaworks.algafood.model;

import lombok.Data;

@Data

public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = false;

    private double altura;
    private double peso;
    private double imc;
    private String NickName;

    public Cliente(String nome, String email, String telefone, boolean ativo,double altura,double peso, String nick) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
        this.altura= altura;
        this.peso=peso;

    }



    public  double getImc(){
       return  caluculaImc();
    }

    public double caluculaImc(){
        return peso/(altura*altura);
    }
}
