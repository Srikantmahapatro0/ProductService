package com.productservice.project1.models;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@MappedSuperclass
public class Basemodel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Time createdat;
    private Time updatedat;
    private Boolean isdeleted;
}
