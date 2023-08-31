package com.swati.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "machine")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String availableCash;
    @ManyToMany(targetEntity = Item.class)
    private List<Item> itemList;
}
