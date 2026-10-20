package com.hallabi.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
@Id @GeneratedValue
    private long id;
    private String name;
    private double price;
    private int quantity;
}
