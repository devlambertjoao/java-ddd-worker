package com.coffee.worker.domain.mapper;

import org.springframework.stereotype.Component;

import com.coffee.worker.domain.entity.WorkerEntity;
import com.coffee.worker.domain.ports.input.CreateWorkerInput;
import com.coffee.worker.domain.ports.output.CreateWorkerOutput;

@Component
public class WorkerMapper {

	public WorkerEntity toEntity(CreateWorkerInput input) {
		WorkerEntity entity = new WorkerEntity();
		entity.setName(input.getName());
		entity.setBirthday(input.getBirthday());
		entity.setHourlyWage(input.getHourlyWage());
		entity.setDocumentNumber(input.getDocumentNumber());
		
		return entity;
	}

	public CreateWorkerOutput toOutput(WorkerEntity entity) {
		CreateWorkerOutput output = new CreateWorkerOutput();
		output.setId(entity.getId());
		output.setName(entity.getName());
		output.setBirthday(entity.getBirthday());
		output.setDocumentNumber(entity.getDocumentNumber());
		output.setHourlyWage(entity.getHourlyWage());
		
		return output;
	}

}
