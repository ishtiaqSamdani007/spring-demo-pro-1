package com.stark.upwork.service;


import com.stark.upwork.dao.WorkerRepo;
import com.stark.upwork.dto.WorkerDto;
import com.stark.upwork.entity.Worker;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.stark.upwork.dto.WorkerDto.convertEntityToDto;

@Service
public class WorkerImp implements WorkerInterface{

    @Autowired
    private WorkerRepo workerRepo;


    @Override
    public List<WorkerDto> getAllWorkers(){
        List<Worker> workers = workerRepo.findAll();
        return workers.stream().map(wrk -> convertEntityToDto(wrk)).collect(Collectors.toList());
//        return candidates.stream().map(post -> CandidateDto.convertEntityToDto(post)).collect(Collectors.toList());
    }

    @Override
    public WorkerDto addWorker(WorkerDto worker) {
        return null;
    }

    @Override
    public WorkerDto deleteWorker(Long id) {
        return null;
    }

    @Override
    public WorkerDto updateWorker(Long id, WorkerDto workerDto) {
        Optional<Worker> currentWorker = workerRepo.findById(id);


            Worker existingWorker = currentWorker.get();

            existingWorker.setPosition(workerDto.getPosition());
            Worker updatedWorker = workerRepo.save(existingWorker);
            return workerDto.convertEntityToDto(updatedWorker);
    }
//
//    @Override
//    public CandidateDto updateCandidate(int id, CandidateDto candidateDto) {
//        Optional<Candidate> currentCandidate = candidateRepository.findById(id);
//
//        if (currentCandidate.isPresent()) {
//            Candidate existingCandidate = currentCandidate.get();
//
//            existingCandidate.setAdjudication(candidateDto.getAdjudication());
//            Candidate updatedCandidate = candidateRepository.save(existingCandidate);
//            return CandidateDto.convertEntityToDto(updatedCandidate);
//        }
//        else {
//            throw new ExceptionHandler("Did not find Candidate with id - " + id);
//        }
//    }

    @Override
    public List<WorkerDto> addMoreWorkers(List<WorkerDto> workers) {
        return null;
    }

//    @Override
//    public WorkerDto addWorker(Worker worker){
//        return workerRepo.save(worker);
//    }
//
//    @Override
//    public Worker deleteWorker(Long id) {
//        Worker worker = workerRepo.findById(id).get();
//        workerRepo.deleteById(id);
//        return worker;
//    }
//
//    @Override
//    public Worker updateWorker(Long id, Worker worker){
//        Worker worker1 = workerRepo.findById(id).get();
//
//        if (worker.getName() != null)
//            worker1.setName(worker.getName());
//        if (worker.getSurname() != null)
//            worker1.setSurname(worker.getSurname());
//        if (worker.getPosition() != null)
//            worker1.setPosition(worker.getPosition());
//
//        return workerRepo.save(worker1);
//    }
//
//    @Override
//    public List<Worker> addMoreWorkers(List<Worker> workers) {
//        return workerRepo.saveAll(workers);
//    }


}
