package com.example.myapplication;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome;
    private String email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.email = email
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
