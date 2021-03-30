package com.mircroservice.hrworker.repositoies;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mircroservice.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
