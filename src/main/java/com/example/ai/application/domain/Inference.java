package com.example.ai.application.domain;

import static lombok.AccessLevel.PROTECTED;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@DynamicUpdate
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
@ToString
public class Inference {

    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    private String name;

    // Todo : security result
    private double inferenceFigure;

    private byte inferenceImage;

    public Inference(String name){
        this.name = name;
    }
}
