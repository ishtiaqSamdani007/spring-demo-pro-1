package com.stark.upwork.controller;

import com.stark.upwork.dto.WorkerDto;
import com.stark.upwork.entity.Worker;
import com.stark.upwork.service.WorkerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerImp workerService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

//    @PostMapping("/addWorker")
//    public Worker addWorker(@RequestBody Worker worker){
//        return workerService.addWorker(worker);
//    }


    @GetMapping("/getAllWorkers")
    public List<WorkerDto> getWorker(){
        return workerService.getAllWorkers();
    }

//    @DeleteMapping("/deleteWorker/{id}")
//    public Worker deleteWorker(@PathVariable Long id){
//        return workerService.deleteWorker(id);
//    }
//
    @PatchMapping("/updateWorker/{id}")
    public WorkerDto updateWorker(@PathVariable Long id, @RequestBody WorkerDto workerDto){
        return workerService.updateWorker(id, workerDto);
    }
//
//    @PostMapping("/addMoreWorkers")
//    public List<Worker> addMoreWorker(@RequestBody List<Worker> workers){
//        return workerService.addMoreWorkers(workers);
//    }


}
