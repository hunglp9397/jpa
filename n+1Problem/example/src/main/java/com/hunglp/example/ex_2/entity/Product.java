package com.hunglp.example.ex_2.entity;

import com.hunglp.example.ex_1.entity.PostComment;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@ToString
@NamedEntityGraph(
        attributeNodes = @NamedAttributeNode("stores"))
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    @OneToMany(mappedBy = "product")
    private Set<Store> stores = new HashSet<>();



}