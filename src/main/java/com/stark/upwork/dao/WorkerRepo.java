package com.stark.upwork.dao;

import com.stark.upwork.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface WorkerRepo extends JpaRepository<Worker, Long> {

}
