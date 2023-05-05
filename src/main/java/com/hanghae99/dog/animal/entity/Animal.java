package com.hanghae99.dog.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class Animal {
    @Id
    @Column(unique = true)
    private Long animalNo;
    private String name;
    private LocalDate entrance_date;
    private String species;
    private String breed;
    private String sex;
    private String age;
    private Float weight;
    private String adpStatus;

    @Builder //빌더 패턴 사용
    public Animal(Long animalNo, String name, LocalDate entrance_date, String species, String breed, String sex, String age, Float weight, String adpStatus) {
        this.animalNo = animalNo;
        this.name = name;
        this.entrance_date = entrance_date;
        this.species = species;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.adpStatus = adpStatus;
    }
}