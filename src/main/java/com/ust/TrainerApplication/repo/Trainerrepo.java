package com.ust.TrainerApplication.repo;

import com.ust.TrainerApplication.model.Trainerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Trainerrepo extends JpaRepository<Trainerinfo,Long> {
}
