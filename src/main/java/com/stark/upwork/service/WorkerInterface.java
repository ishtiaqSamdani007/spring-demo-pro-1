package com.stark.upwork.service;

import com.stark.upwork.dto.WorkerDto;

import java.util.List;

public interface WorkerInterface {
    public List<WorkerDto> getAllWorkers();

    public WorkerDto addWorker(WorkerDto worker);

    public WorkerDto deleteWorker(Long id);

    public WorkerDto updateWorker(Long id, WorkerDto worker);

    public List<WorkerDto> addMoreWorkers(List<WorkerDto> workers);

}
