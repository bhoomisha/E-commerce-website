package com.myntra.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String itemName;
    private String image;
    private int currentPrice;
    private int originalPrice;
    private int discountPercentage;
    private int returnPeriod;
    private String deliveryDate;

}

