package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
@SpringBootApplication
public class ObjectMapper1Application {

	  public static void main(final String[] args) throws JsonProcessingException {
		    final var json = "{\"nome\":\"Maria da Silva\"}";
		    final var objectMapper = new ObjectMapper();
		    final var pessoa = objectMapper.readValue(json, Pessoa.class);
		    System.out.println(pessoa);
		    final var pessoa2 = new Pessoa();
		    pessoa.setNome("Maria da Silva");
		    final var objectMapper2 = new ObjectMapper();
		    final var json2 = objectMapper.writeValueAsString(pessoa);
		    final var json3 = "[{\"nome\":\"Maria da Silva\"},{\"nome\":\"José da Silva\"}]";
		    final var objectMapper3 = new ObjectMapper();
		    final var pessoas = objectMapper3.readValue(json, new TypeReference<List<Pessoa>>() {});
		
		  }
	  
		}