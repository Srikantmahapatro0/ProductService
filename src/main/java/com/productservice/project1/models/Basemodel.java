package com.productservice.project1.models;

import java.sql.Time;

import jakarta.persistence.Entity;
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
public class Basemodel {
    @Id
    private Long id;
    private Time createdat;
    private Time updatedat;
    private Boolean isdeleted;
}
