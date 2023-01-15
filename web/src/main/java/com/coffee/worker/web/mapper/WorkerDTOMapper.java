package com.coffee.worker.web.mapper;

import org.springframework.stereotype.Component;

import com.coffee.worker.domain.ports.input.CreateWorkerInput;
import com.coffee.worker.domain.ports.output.CreateWorkerOutput;
import com.coffee.worker.web.dto.WorkerDTO;

@Component
public class WorkerDTOMapper {
	public CreateWorkerInput toInput(WorkerDTO dto) {
		CreateWorkerInput input = new CreateWorkerInput();
		input.setBirthday(dto.getBirthday());
		input.setName(dto.getName());
		input.setDocumentNumber(dto.getDocumentNumber());
		input.setHourlyWage(dto.getHourlyWage());
		
		return input;
	}
	
	public WorkerDTO toDTO(CreateWorkerOutput output) {
		WorkerDTO dto = new WorkerDTO();
		dto.setId(output.getId());
		dto.setBirthday(output.getBirthday());
		dto.setName(output.getName());
		dto.setDocumentNumber(output.getDocumentNumber());
		dto.setHourlyWage(output.getHourlyWage());
		
		return dto;
	}
}
