package com.ust.TrainerApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trainerinfo")
public class Trainerinfo {
    @Id   //pk
    private long id;
    private String name;
    private String email;
    private String password;
    private String skills;
    private String contactNumber;
    private String experience;
    private String qualification;

}
