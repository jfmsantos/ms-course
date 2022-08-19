package com.devsuperior.hrpayroll.enttities;

import java.io.Serializable;


public class Worker implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
	}

	public Long getId() {
		return Id;
	}

	public Worker(Long id, String name, Double dailyIncome) {
		super();
		Id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
}
