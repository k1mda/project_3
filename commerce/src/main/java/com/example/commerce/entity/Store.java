package com.example.commerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "store", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Seller seller;

    private boolean approved;


}