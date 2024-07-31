package com.productservice.project1.models;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Basemodel {
    private Long id;
    private Time createdat;
    private Time updatedat;
    private Boolean isdeleted;
}
