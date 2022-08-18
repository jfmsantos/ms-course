package com.devsuperior.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_worker")
public class Worker implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
	}

	public Long getId() {
		return Id;
	}

	public Worker(Long id, String nome, Double dailyIncome) {
		super();
		Id = id;
		this.name = nome;
		this.dailyIncome = dailyIncome;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	
	
}
