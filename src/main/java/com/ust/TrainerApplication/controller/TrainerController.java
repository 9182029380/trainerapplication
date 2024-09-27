package com.ust.TrainerApplication.controller;

import com.ust.TrainerApplication.model.Trainerinfo;
import com.ust.TrainerApplication.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class TrainerController {

    @Autowired
    private TrainerService service;

    @PostMapping("/addtrainer")
    public Trainerinfo addtrainer(@RequestBody Trainerinfo info){
        return service.addtrainer(info);
    }
    @GetMapping("/gettrainer")
    public List<Trainerinfo> gettrainer(){
        return service.gettrainer();
    }

    @GetMapping("/gettrainer/{id}")
    public Trainerinfo gettrainerbyid(@PathVariable Long id){
        return service.gettrainerbyid(id);
    }
}
