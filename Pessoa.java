package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown
= true)
public class Pessoa {
  private String nome;
  private Integer idade;
  
  @JsonIgnore
  private String cpf;
  
  public Pessoa() {
  }

  public Pessoa(final String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(final String nome) {
    this.nome = nome;
  }
}