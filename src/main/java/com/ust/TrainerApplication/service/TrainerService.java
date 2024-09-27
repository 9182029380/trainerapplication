package com.ust.TrainerApplication.service;

import com.ust.TrainerApplication.model.Trainerinfo;
import com.ust.TrainerApplication.repo.Trainerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {
    @Autowired
    private Trainerrepo repo;
    public Trainerinfo addtrainer(Trainerinfo info) {
        return repo.save(info);
    }

    public List<Trainerinfo> gettrainer() {
        return repo.findAll();
    }

    public Trainerinfo gettrainerbyid(Long id) {
        return repo.findById(id).orElse(null);
    }
}
