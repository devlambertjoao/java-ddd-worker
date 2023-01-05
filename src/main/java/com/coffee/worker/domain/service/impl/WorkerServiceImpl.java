package com.coffee.worker.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.worker.domain.entity.WorkerEntity;
import com.coffee.worker.domain.mapper.WorkerMapper;
import com.coffee.worker.domain.ports.input.CreateWorkerInput;
import com.coffee.worker.domain.ports.output.CreateWorkerOutput;
import com.coffee.worker.domain.service.WorkerService;
import com.coffee.worker.infra.repository.WorkerRepository;

@Service
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	private WorkerMapper workerMapper;
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@Override
	public CreateWorkerOutput create(CreateWorkerInput input) {
		WorkerEntity entity = workerMapper.toEntity(input);
		entity = workerRepository.save(entity);

		return workerMapper.toOutput(entity);
	}

}
