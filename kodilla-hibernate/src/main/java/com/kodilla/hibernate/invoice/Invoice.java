package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Entity
@Repository("INVOICE")
public class Invoice {

    private int id;
    private int number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {

    }

    public Invoice(int number, List<Item> items) {
        this.number = number;
        this.items = items;
    }
@Id
@GeneratedValue
@NotNull
@Column(name = "INVOICE_ID")
    public int getId() {
        return id;
    }
@Column(name = "INVOICE_NUMBER")
    public int getNumber() {
        return number;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
