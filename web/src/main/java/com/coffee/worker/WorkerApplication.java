package com.coffee.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.coffee.worker.*" })
@EnableJpaRepositories(basePackages = { "com.coffee.worker.infra.repository" })
@EntityScan(basePackages = { "com.coffee.worker.domain.entity" })
public class WorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkerApplication.class, args);
	}

}
