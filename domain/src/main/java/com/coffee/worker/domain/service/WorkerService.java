package com.coffee.worker.domain.service;

import com.coffee.worker.domain.ports.input.CreateWorkerInput;
import com.coffee.worker.domain.ports.output.CreateWorkerOutput;

public interface WorkerService {
	CreateWorkerOutput create(CreateWorkerInput input);
}
