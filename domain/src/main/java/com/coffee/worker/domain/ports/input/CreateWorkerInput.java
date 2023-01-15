package com.coffee.worker.domain.ports.input;

import java.time.LocalDate;

import lombok.Data;

@Data 
public class CreateWorkerInput {
	private String name;
	private Long documentNumber;
	private LocalDate birthday;
	private double hourlyWage;
}
