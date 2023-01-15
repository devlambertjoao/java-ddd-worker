package com.coffee.worker.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.worker.domain.service.WorkerService;
import com.coffee.worker.web.dto.WorkerDTO;
import com.coffee.worker.web.mapper.WorkerDTOMapper;

@RestController
@RequestMapping(value = "worker")
public class WorkerController {

	@Autowired
	private WorkerDTOMapper workerDTOMapper;
	
	@Autowired
	private WorkerService workerService;

	//TODO: Implement Error Handling
	@PostMapping
	public ResponseEntity<?> create(@RequestBody WorkerDTO worker) {
		try {
			var input = workerDTOMapper.toInput(worker);
			var output = workerService.create(input);
			
			return new ResponseEntity<>(workerDTOMapper.toDTO(output), HttpStatus.CREATED);
		}
		catch (Exception ex) {
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
