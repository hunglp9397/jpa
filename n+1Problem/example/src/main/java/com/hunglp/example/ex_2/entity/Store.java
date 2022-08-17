package com.hunglp.example.ex_2.entity;

import com.hunglp.example.ex_1.entity.Post;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String storeName;

    private String position;

    @ManyToOne
    private Product product;

}