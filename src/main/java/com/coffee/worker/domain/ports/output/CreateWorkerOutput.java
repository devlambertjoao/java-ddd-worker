package com.coffee.worker.domain.ports.output;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CreateWorkerOutput {
	private Long id;
	private String name;
	private Long documentNumber;
	private LocalDate birthday;
	private double hourlyWage;
}
