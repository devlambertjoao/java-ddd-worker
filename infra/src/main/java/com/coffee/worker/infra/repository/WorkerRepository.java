package com.coffee.worker.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.worker.domain.entity.WorkerEntity;

@Repository												
public interface WorkerRepository extends JpaRepository<WorkerEntity, Long> {

}
