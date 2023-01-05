package com.coffee.worker.web.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class WorkerDTO {
	private Long id;
	private String name;
	private Long documentNumber;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate birthday;
	private double hourlyWage;
}
